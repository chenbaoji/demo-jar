package com.lanqiao.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.fasterxml.jackson.core.type.TypeReference;


/**
 * 反射常用方法类.
 * @author Chunsun Qin.
 * 2017年7月5日.
 */
public class RefUtil {
	/**
     * 将list对象转为Map对象.
     * <br/>key的类型必须与接受方一致.
     *
     * @param li           list对象
     * @param keyFieldName 作为Key的属性名称
     * @return
     */
    public static <T> T listToMap(final List li, final String keyFieldName) {
        if (li == null) {
            return null;
        }
        Map map = new HashMap<>();
        for (Object obj : li) {
            Object key = tryGetField(obj, keyFieldName);
            map.put(key, obj);
        }
        return (T) map;
    }

    /**
     * 对象转map .
     *
     * @param obj 源对象
     * @return map  结果
     * @author zhuye
     */
    public static TreeMap<String, Object> transBean2Map(Object obj) {
        TreeMap<String, Object> map = new TreeMap<>();
        if (obj == null) {
            System.out.println("源对象是null,");
            return map;
        }
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor property : propertyDescriptors) {
                String key = property.getName();
                // 过滤class属性
                if (key.equals("class")) {
                    continue;
                }
                // 得到property对应的getter方法
                Method getter = property.getReadMethod();
                Object value = getter.invoke(obj);
                map.put(key, value);
            }
        } catch (Exception e) {
            System.out.println("transBean2Map Error " + e);
        }
        return map;
    }


    /**
     * 尝试从对象中获取属性值.
     * 多重属性可以写成 name.name1 格式
     *
     * @param obj   对象
     * @param field 字段名称
     * @return
     */
    public static Object tryGetField(Object obj, String field) {
        Object res = null;
        String filedOther = null;
        int c = field.indexOf(".");
        if (c > 0) {
            filedOther = field.substring(c + 1);
            field = field.substring(0, c);
        }
        // 如果是Map就不要这么纠结了
        if (obj instanceof Map) {
            res = ((Map) obj).get(field);
        } else {
            try {
                // 有没有这个字段?
                Field f = obj.getClass().getDeclaredField(field);
                res = f.get(obj);

            } catch (Exception e) {
            }
            if (res == null) {
                // 有没有这个get方法
                String fieldMethodName = "get" + (field.charAt(0) + "").toUpperCase() + field.substring(1);
                Method method = null;
                try {
                    method = obj.getClass().getMethod(fieldMethodName);

                    try {
                        res = method.invoke(obj);
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                } catch (NoSuchMethodException noSuchMethodException) {
                    if (method == null) {
                        Class superClass = obj.getClass();
                        int n = 0;
                        while (method == null && superClass != null && n < 5) {
                            try {
                                method = obj.getClass().getSuperclass().getDeclaredMethod(fieldMethodName);
                            } catch (Exception e) {
                            }
                            superClass = superClass.getClass();
                            n++;
                        }
                    }

                    try {
                        res = method.invoke(obj);
                    } catch (Exception e1) {
                        e1.printStackTrace();
                        System.err.println(fieldMethodName + " can not found");
                    }
                } catch (Exception e1) {
                    return null;
                }
            }
        }
        if (res != null) {
            if (filedOther != null) {
                return tryGetField(res, filedOther);
            }
            return res;
        }
        return res;
    }

    /**
     * 尝试拷贝属性.
     * 如果是正常情况则调用BeanUtils.copyProperties(source, target)
     *
     * @param source
     * @param target
     */
    public static void copyPropertiesSimple(Object source, Object target) {
        boolean sourceIsMap = source instanceof Map;
        boolean targetIsMap = target instanceof Map;
        if (sourceIsMap || targetIsMap) {
            // 如果是从map到obj
            if (sourceIsMap) {
                Map map = (Map) source;
                for (Object key : map.keySet()) {
                    // 有没有这个get方法
                    String field = NullUtil.getString(key);
                    String fieldMethodName = "set" + (field.charAt(0) + "").toUpperCase() + field.substring(1);
                    //target.getClass().getMethods();
                    //target.getClass().getDeclaredMethods();
                   
                    try {
                        target.getClass().getMethod(fieldMethodName, map.get(key).getClass())
                                .invoke(target, map.get(key)); 
                    } catch (Exception e) {
                        // e.printStackTrace();
                        continue;
                    }
                }
            }

        } else {
            org.springframework.beans.BeanUtils.copyProperties(source, target);
        }
    }

    /**
     * 对象转为JSON.
     *
     * @param obj
     * @return
     */
    public static String toJSONString(Object obj) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        String jsonReport = null;
        try {
            jsonReport = mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonReport;
    }

    /**
              * 将JSON转为对象.
     *
     * @param json      json
     * @param beanClass 类
     * @param <T>       类
     * @return 对象
     */
    public static <T> T jsonToObj(final String json, Class<T> beanClass) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            final T obj = mapper.readValue(json, beanClass);
            return obj;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
	     * 将JSON转为对象.
	*
	* @param json      json
	* @param beanClass 类
	* @param <T>       类
	* @return 对象
	*/
    public static <T> T jsonToObj(final String json, TypeReference beanClass) {
        ObjectMapper mapper = new ObjectMapper();
        //这是用法
        //final List<CompileDataListDTO> dataList= RefUtil.jsonToObj(strbody,  new TypeReference<List<CompileDataListDTO>>(){});
        try {
            final T obj = mapper.readValue(json, beanClass);
            return obj;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 尝试给对象设置一个值.
     *
     * @param target
     * @param field
     * @param value
     * @return
     */
    public static boolean trySetField(Object target, String field, Object value) {
        if (target instanceof Map) {
            ((Map) target).put(field, value);
            return true;
        }
        String fieldMethodName = "set" + (field.charAt(0) + "").toUpperCase() + field.substring(1);
        try {
            target.getClass().getDeclaredMethod(fieldMethodName, value.getClass())
                    .invoke(target, value);
            return true;
        } catch (Exception e) {
            // e.printStackTrace();
            return false;
        }
    }

    /**
     * 将对象的属性值设为Null.
     * 该方法是强行调用set方法
     *
     * @param target       对象
     * @param notNullFiled 不为null的字值
     */
    public static void autoNullObj(final Object target, final List<String> notNullFiled) {
        if (target instanceof Map) {
            Map map = (Map) target;
            for (final Object key : map.keySet()) {
                if (!CommonUtil.objInArray(notNullFiled, key)) {
                    map.put(key, null);
                }
            }
        } else {
            for (final Method method : target.getClass().getDeclaredMethods()) {
                if (method.getName().length() > 4 && method.getName().indexOf("set") == 0 && method.getParameterCount() == 1) { //如果是以set方法开始的
                    final String fName = (method.getName().charAt(3) + "").toLowerCase() + method.getName().substring(4);
                    if (!CommonUtil.objInArray(notNullFiled, fName)) {
                        try {
                            method.invoke(target, new Object[]{null});
                        } catch (final Exception e) {
                            //e.printStackTrace(); 无需异常
                        }
                    }
                }
            }

        }
    }

    /**
     * 将列表所有对象属性值设为null.
     * 该方法是强行调用set方法
     *
     * @param li           li
     * @param notNullFiled 不为null的值
     */
    public static void autoNullList(final Collection li, final List<String> notNullFiled) {
        for (final Object obj : li) {
            autoNullObj(obj, notNullFiled);
        }
    }

   
}

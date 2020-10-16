package com.lanqiao.util;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.event.IIOWriteProgressListener;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.stream.ImageInputStream;
import javax.imageio.stream.ImageOutputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;

import org.apache.commons.codec.binary.Base64;

 
/**
 * 滑块验证工具类
 *

 */
public class CodeImageUtil {
    private static int ORI_WIDTH = 350;  //源文件宽度
    private static int ORI_HEIGHT = 160;  //源文件高度

    public static class CodeImageContext implements Serializable{
	  	public   int X;  //抠图坐标x
	  	public  int Y;  //抠图坐标y
	  	public  int WIDTH;  //模板图宽度
	  	public  int HEIGHT;  //模板图高度
	  	public  float xPercent;  //X位置移动百分比
	  	public  float yPercent;  //Y位置移动百分比
	  	public int checkcount = 0; // 验证次数。
	  	public boolean passok =false; // 是否验证通过。
		@Override
		public String toString()
		{
			return "Context [X=" + X + ", Y=" + Y + ", WIDTH=" + WIDTH + ", HEIGHT=" + HEIGHT + ", xPercent=" + xPercent
					+ ", yPercent=" + yPercent + "]";
		}
	  
  };
 
 //data:image/jpeg;base64,  
 //data:image/png;base64,
 
  
  public static String ImagetoBase64(byte [] data, String type)
  {
	       // BASE64Encoder encoder = new BASE64Encoder();
	        if("png".equalsIgnoreCase(type))
	        return "data:image/png;base64,"+Base64.encodeBase64String(data);
	        
	        if("jpg".equalsIgnoreCase(type) || "jpeg".equalsIgnoreCase(type))
		        return "data:image/jpeg;base64,"+Base64.encodeBase64String(data);
		        
	        return "";
  }
  public static String ImagetoBase64(File f )
  {
	  try
	  {
	       // BASE64Encoder encoder = new BASE64Encoder();
	        String type = FilenameUtils.getExtension(f.getName());
	        FileInputStream fin = new FileInputStream(f);
	        byte data [] = new byte[fin.available()];
	        fin.read(data);
	        
	        if("png".equalsIgnoreCase(type))
	        return "data:image/png;base64,"+Base64.encodeBase64String(data);
	        
	        if("jpg".equalsIgnoreCase(type) || "jpeg".equalsIgnoreCase(type))
		        return "data:image/jpeg;base64,"+Base64.encodeBase64String(data);
	  }catch(Exception se)
	  {
		  se.printStackTrace();
	  }
	        return "";
  }
  
  
    /**
     * 根据模板切图
     * newImage：抠图直字节码
     * oriCopyImage：原图字节码
     *
     * @param templateFile
     * @param targetFile
     * @param templateType
     * @param targetType
     * @return
     * @throws Exception
     */
    public static Map<String, Object> pictureTemplatesCut(CodeImageContext ctx, File templateFile, File targetFile, String templateType, String targetType) throws Exception {
        Map<String, Object> pictureMap = new HashMap<>();
       		
        // 文件类型
        String templateFiletype = templateType;
        String oriFiletype = targetType;
        if (StringUtils.isEmpty(templateFiletype) || StringUtils.isEmpty(oriFiletype)) {
            throw new RuntimeException("file type is empty");
        }
        // 源文件流
        File Orifile = targetFile;
        InputStream oriis = new FileInputStream(Orifile);
 
        // 模板图
        BufferedImage imageTemplate = ImageIO.read(templateFile);
        ctx.WIDTH = imageTemplate.getWidth();
        ctx.HEIGHT = imageTemplate.getHeight();
        if(ctx == null)
        {
        	ctx= new CodeImageContext();
        	generateCutoutCoordinates(ctx);
        }
        // 最终图像
        BufferedImage newImage = new BufferedImage(ctx.WIDTH, ctx.HEIGHT, imageTemplate.getType());
        Graphics2D graphics = newImage.createGraphics();
        graphics.setBackground(Color.white);
 
        int bold = 50;
        // 获取感兴趣的目标区域
        BufferedImage targetImageNoDeal = getTargetArea(ctx.X, ctx.Y, ctx.WIDTH, ctx.HEIGHT, oriis, oriFiletype);
 
        // 根据模板图片抠图
        newImage = DealCutPictureByTemplate(targetImageNoDeal, imageTemplate, newImage);
 
        // 设置“抗锯齿”的属性
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setStroke(new BasicStroke(bold, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL));
        graphics.drawImage(newImage, 0, 0, null);
        graphics.dispose();
        
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        ImageOutputStream ios = ImageIO.createImageOutputStream(baos);
//        write(ios, null, "jpg", newImage, null, 0.75f);
//        byte[] jpegData = baos.toByteArray();
 
        ByteArrayOutputStream os = new ByteArrayOutputStream();//新建流。
        ImageIO.write(newImage, "png", os);//利用ImageIO类提供的write方法，将bi以png图片的数据模式写入流。
        byte[] newImages = os.toByteArray();
        pictureMap.put("newImage", newImages);
 
        // 源图生成遮罩
        BufferedImage oriImage = ImageIO.read(Orifile);
        byte[] oriCopyImages = DealOriPictureByTemplate(oriImage, imageTemplate, ctx.X, ctx.Y);
        pictureMap.put("oriCopyImage", oriCopyImages);
        
      //  System.out.println (ctx.toString());
        //
        pictureMap.put("result", ctx);
       
        return pictureMap;
    }
    
//    public static void write(ImageOutputStream out,IIOWriteProgressListener listener,String formatName,BufferedImage image,
//    		List<? extends BufferedImage> thumbnails,float quality) throws IOException
//    {
//    	
//    		if(out==null){
//    		throw new IllegalArgumentException("OutputStreammustbenonnull");
//    		}
//    		
//    		if(formatName==null){
//    		throw new IllegalArgumentException("FormatNamemustbenonnull");
//    		}
//    		
//    		if(image==null){
//    		throw new IllegalArgumentException("Imagemustbenonnull");
//    		}
//    		
//    		//取得合适的ImageWriter。
//    		Iterator writers=ImageIO.getImageWritersByFormatName(formatName);
//    		if(writers==null||!writers.hasNext()){
//    		throw new IllegalStateException("No"+formatName+"writers!");
//    		}
//    		ImageWriter writer=(ImageWriter)writers.next();
//    		
//    		ImageTypeSpecifier imageType=ImageTypeSpecifier.createFromRenderedImage(image);
//    		IIOMetadata metadata=writer.getDefaultImageMetadata(imageType,null);
//    		
//    		IIOImage iioImage=new IIOImage(image,thumbnails,metadata);
//    		
//    		ImageWriteParam param=writer.getDefaultWriteParam();
//    		param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
//    		param.setCompressionQuality(quality);
//    		
//    		writer.setOutput(out);
//    		writer.addIIOWriteProgressListener(listener);
//    		writer.write(null,iioImage,param);
//    		writer.dispose();
//    		}
    	
    /**
     * 抠图后原图生成
     *
     * @param oriImage
     * @param templateImage
     * @param x
     * @param y
     * @return
     * @throws Exception
     */
    private static byte[] DealOriPictureByTemplate(BufferedImage oriImage, BufferedImage templateImage, int x,
                                                   int y) throws Exception {
        // 源文件备份图像矩阵 支持alpha通道的rgb图像
        BufferedImage ori_copy_image = new BufferedImage(oriImage.getWidth(), oriImage.getHeight(), BufferedImage.TYPE_4BYTE_ABGR);
        // 源文件图像矩阵
        int[][] oriImageData = getData(oriImage);
        // 模板图像矩阵
        int[][] templateImageData = getData(templateImage);
 
        //copy 源图做不透明处理
        for (int i = 0; i < oriImageData.length; i++) {
            for (int j = 0; j < oriImageData[0].length; j++) {
                int rgb = oriImage.getRGB(i, j);
                int r = (0xff & rgb);
                int g = (0xff & (rgb >> 8));
                int b = (0xff & (rgb >> 16));
                //无透明处理
                rgb = r + (g << 8) + (b << 16) + (255 << 24);
                ori_copy_image.setRGB(i, j, rgb);
            }
        }
 
        for (int i = 0; i < templateImageData.length; i++) {
            for (int j = 0; j < templateImageData[0].length - 5; j++) {
                int rgb = templateImage.getRGB(i, j);
                //对源文件备份图像(x+i,y+j)坐标点进行透明处理
                if (rgb != 16777215 && rgb <= 0) {
                    int rgb_ori = ori_copy_image.getRGB(x + i, y + j);
                    int r = (0xff & rgb_ori);
                    int g = (0xff & (rgb_ori >> 8));
                    int b = (0xff & (rgb_ori >> 16));
                    rgb_ori = r + (g << 8) + (b << 16) + (100 << 24);
                    ori_copy_image.setRGB(x + i, y + j, rgb_ori);
                } else {
                    //do nothing
                }
            }
        }
        
      ByteArrayOutputStream os = new ByteArrayOutputStream();//新建流。

      //        ImageOutputStream ios = ImageIO.createImageOutputStream(os);
//        write(ios, null, "jpg", ori_copy_image, null, 1f);
        
        
        ImageIO.write(ori_copy_image, "png", os);//利用ImageIO类提供的write方法，将bi以png图片的数据模式写入流。
        byte b[] = os.toByteArray();//从流中获取数据数组。
        return b;
    }
 
 
    /**
     * 根据模板图片抠图
     *
     * @param oriImage
     * @param templateImage
     * @return
     */
 
    private static BufferedImage DealCutPictureByTemplate(BufferedImage oriImage, BufferedImage templateImage,
                                                          BufferedImage targetImage) throws Exception {
        // 源文件图像矩阵
        int[][] oriImageData = getData(oriImage);
        // 模板图像矩阵
        int[][] templateImageData = getData(templateImage);
        // 模板图像宽度
 
        for (int i = 0; i < templateImageData.length; i++) {
            // 模板图片高度
            for (int j = 0; j < templateImageData[0].length; j++) {
                // 如果模板图像当前像素点不是白色 copy源文件信息到目标图片中
                int rgb = templateImageData[i][j];
                if (rgb != 16777215 && rgb <= 0) {
                    targetImage.setRGB(i, j, oriImageData[i][j]);
                }
            }
        }
        return targetImage;
    }
 
 
    /**
     * 获取目标区域
     *
     * @param x            随机切图坐标x轴位置
     * @param y            随机切图坐标y轴位置
     * @param targetWidth  切图后目标宽度
     * @param targetHeight 切图后目标高度
     * @param ois          源文件输入流
     * @return
     * @throws Exception
     */
    private static BufferedImage getTargetArea(int x, int y, int targetWidth, int targetHeight, InputStream ois,
                                               String filetype) throws Exception {
        Iterator<ImageReader> imageReaderList = ImageIO.getImageReadersByFormatName(filetype);
        ImageReader imageReader = imageReaderList.next();
        // 获取图片流
        ImageInputStream iis = ImageIO.createImageInputStream(ois);
        // 输入源中的图像将只按顺序读取
        imageReader.setInput(iis, true);
 
        ImageReadParam param = imageReader.getDefaultReadParam();
        Rectangle rec = new Rectangle(x, y, targetWidth, targetHeight);
        param.setSourceRegion(rec);
        BufferedImage targetImage = imageReader.read(0, param);
        return targetImage;
    }
 
    /**
     * 生成图像矩阵
     *
     * @param
     * @return
     * @throws Exception
     */
    private static int[][] getData(BufferedImage bimg) throws Exception {
        int[][] data = new int[bimg.getWidth()][bimg.getHeight()];
        for (int i = 0; i < bimg.getWidth(); i++) {
            for (int j = 0; j < bimg.getHeight(); j++) {
                data[i][j] = bimg.getRGB(i, j);
            }
        }
        return data;
    }
 
    /**
     * 随机生成抠图坐标
     */
    static Random random = new Random(System.currentTimeMillis());
    
    private static void generateCutoutCoordinates(CodeImageContext ctx) {
        int widthDifference = ORI_WIDTH - ctx.WIDTH;
        int heightDifference = ORI_HEIGHT - ctx.HEIGHT;
 
        if (widthDifference <= 0) {
        	ctx.X = 5;
 
        } else {
        	ctx.X = random.nextInt(ORI_WIDTH - ctx.WIDTH) ;
        }
 
        if (heightDifference <= 0) {
        	ctx.Y = 0;
        } else {
        	ctx.Y = random.nextInt(ORI_HEIGHT - ctx.HEIGHT) + 5;
        }
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(2);
 
        ctx.xPercent = Float.parseFloat(numberFormat.format((float) ctx.X / (float) ORI_WIDTH));
        ctx.yPercent = Float.parseFloat(numberFormat.format((float) ctx.Y / (float) ORI_HEIGHT));
    }
    
    
   
}
 

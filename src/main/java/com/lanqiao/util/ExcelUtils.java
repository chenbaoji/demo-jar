package com.lanqiao.util;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFPalette;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor.HSSFColorPredefined;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;

import com.alibaba.druid.util.StringUtils;


public class ExcelUtils {

	//导入excel 的数据存储。 
	public static class SheetData implements Serializable{
		String titlename[] = null; // 列标题。 
		List <HashMap>datalist = null;
		
		/**
		 * 是否存在一列。
		 * @param sname
		 * @return
		 */
		public  boolean hasTitleName(String sname)
		{
			boolean b =false;
			if(titlename ==null) return false;
			for(String s : titlename)
			{
				if(s.equals(sname))
				{
					b = true;
					break;
				}
			}
			return b;
			
		}

		public String[] getTitlename() {
			return titlename;
		}

		public List<HashMap> getDatalist() {
			return datalist;
		}

		public void setTitlename(String[] titlename) {
			this.titlename = titlename;
		}

		public void setDatalist(List<HashMap> datalist) {
			this.datalist = datalist;
		}
		
	}
	
	
	/**
	 * 解析excel数据， 第1行为标题行。 其他为数据
	 * @param file
	 * @return
	 * @throws Exception
	 */
	public static SheetData getDataBySheetNum(InputStream file) 
			throws  Exception {
		SheetData result = new SheetData();
		int rowSize = 0;
		
		String  cellnames[]= null;
		BufferedInputStream in = new BufferedInputStream(file);
		// 打开HSSFWorkbook
		POIFSFileSystem fs = new POIFSFileSystem(in);
		HSSFWorkbook wb = new HSSFWorkbook(fs);
		HSSFCell cell = null;
			HSSFSheet st = wb.getSheetAt(0);
			rowSize = st.getLastRowNum();
			int tittleCellNum=st.getRow(0).getPhysicalNumberOfCells();
			System.out.println ("tittleCellNum="+tittleCellNum);
			cellnames = new String[tittleCellNum];
			ArrayList datalist = new ArrayList(st.getPhysicalNumberOfRows());
			
			result.setDatalist(datalist);
		 outer:	for (int rowIndex = 0; rowIndex < st.getPhysicalNumberOfRows(); rowIndex++) {
				HSSFRow row = st.getRow(rowIndex);
				
				if (row == null) {
					continue;
				}
				if(rowIndex ==0)
				{
					//列名称。 
					for (short columnIndex = 0; columnIndex < tittleCellNum; columnIndex++) {
						cell = row.getCell(columnIndex);
						cellnames[columnIndex] = getCellValue(cell);
					}
					
					result.setTitlename(cellnames);
					continue;
				}
				// 数据
				HashMap hsrow = new HashMap();
				for (short columnIndex = 0; columnIndex < tittleCellNum; columnIndex++) {
					cell = row.getCell(columnIndex);
					String sval =  getCellValue(cell);
					if(StringUtils.isEmpty(sval))
					{
						sval="";
					}
					hsrow.put(cellnames[columnIndex], sval);
					System.out.println (cellnames[columnIndex]+"::"+sval);
				}
				
				datalist.add(hsrow);
		
			}
		
		in.close();
	
		
		return result;
	}
	
	
	
	/**
	 * 单元格的样式
	 * @param workbook
	 * @return
	 */
	public  static HSSFCellStyle createCellStyle(HSSFWorkbook workbook){
		HSSFCellStyle style = workbook.createCellStyle();		
		//style.setAlignment(align);
		style.setAlignment(HorizontalAlignment.CENTER);
		style.setVerticalAlignment(VerticalAlignment.CENTER);
		
		style.setBorderBottom(BorderStyle.MEDIUM);
		style.setBorderLeft(BorderStyle.MEDIUM);
		style.setBorderRight(BorderStyle.MEDIUM);
		style.setBorderTop(BorderStyle.MEDIUM);
		
		style.setBottomBorderColor(HSSFColorPredefined.BLACK.getIndex());
		style.setLeftBorderColor(HSSFColorPredefined.BLACK.getIndex());
		style.setRightBorderColor(HSSFColorPredefined.BLACK.getIndex());
		style.setTopBorderColor(HSSFColorPredefined.BLACK.getIndex());
		
		// 创建一个字体样式
		HSSFFont font = workbook.createFont();
		font.setFontHeightInPoints((short)12);
		font.setBold(true);
		font.setFontName("宋体");
		font.setColor(HSSFColorPredefined.BLACK.getIndex());
		style.setFont(font);
		// HSSFPalette palette = workbook.getCustomPalette(); //wb HSSFWorkbook对象 
		// palette.setColorAtIndex((short)60, (byte) (255), (byte) (112), (byte) (112)); 
		 //style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		style.setFillForegroundColor(HSSFColorPredefined.WHITE.getIndex());
		 //style.setFillForegroundColor((short)60);
			
		return style;
	}
	
	
	/**
	 * 表格头的样式
	 * @param workbook
	 * @return
	 */
	public  static HSSFCellStyle createHeaderStyle(HSSFWorkbook workbook){
		HSSFCellStyle style = workbook.createCellStyle();		
		//style.setAlignment(align);
		style.setAlignment(HorizontalAlignment.CENTER);
		style.setVerticalAlignment(VerticalAlignment.CENTER);
		
		style.setBorderBottom(BorderStyle.MEDIUM);
		style.setBorderLeft(BorderStyle.MEDIUM);
		style.setBorderRight(BorderStyle.MEDIUM);
		style.setBorderTop(BorderStyle.MEDIUM);
		
		style.setBottomBorderColor(HSSFColorPredefined.BLACK.getIndex());
		style.setLeftBorderColor(HSSFColorPredefined.BLACK.getIndex());
		style.setRightBorderColor(HSSFColorPredefined.BLACK.getIndex());
		style.setTopBorderColor(HSSFColorPredefined.BLACK.getIndex());
		
		// 创建一个字体样式
		HSSFFont font = workbook.createFont();
		font.setFontHeightInPoints((short)12);
		font.setBold(true);
		font.setFontName("宋体");
		font.setColor(HSSFColorPredefined.BLACK.getIndex());
		style.setFont(font);
		 HSSFPalette palette = workbook.getCustomPalette(); //wb HSSFWorkbook对象 
		 palette.setColorAtIndex((short)60, (byte) (196), (byte) (225), (byte) (255)); 
		 style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		//style.setFillForegroundColor(HSSFColorPredefined.BROWN.getIndex());
		 style.setFillForegroundColor((short)60);
			
		return style;
	}
	
    public static int getIntCellValue(HSSFRow row,int index){
        int rtn = 0;
        try {
            HSSFCell cell = row.getCell((short)index);
            rtn = (int)cell.getNumericCellValue();
        } catch (RuntimeException e) {
        }
        return rtn;
    }

    public static String getStringValue(HSSFRow row,int index){
        String rtn = "";
        try {
            HSSFCell cell = row.getCell((short)index);
            rtn = cell.getRichStringCellValue().getString();
        } catch (RuntimeException e) {
        }
        return rtn;
    }

    public static double getDoubleCellValue(HSSFRow row,int index){
        double rtn = 0d;
        try {
            HSSFCell cell = row.getCell((short)index);
            rtn = (Double)cell.getNumericCellValue();
        } catch (RuntimeException e) {
        }
        return rtn;
    }
    
    public static String getCellValue(Cell cell) {
		String cellValue = "";
		if (null != cell) {
			// 以下是判断数据的类型
			switch (cell.getCellType()) {
			case HSSFCell.CELL_TYPE_NUMERIC: // 数字
				cellValue = cell.getNumericCellValue() + "";
				break;
			case HSSFCell.CELL_TYPE_STRING: // 字符串
				cellValue = cell.getStringCellValue();
				break;
			case HSSFCell.CELL_TYPE_BOOLEAN: // Boolean
				cellValue = cell.getBooleanCellValue() + "";
				break;
			case HSSFCell.CELL_TYPE_FORMULA: // 公式
				cellValue = cell.getCellFormula() + "";
				break;
			case HSSFCell.CELL_TYPE_BLANK: // 空值
				cellValue = "";
				break;
			case HSSFCell.CELL_TYPE_ERROR: // 故障
				cellValue = "非法字符";
				break;
			default:
				cellValue = "未知类型";
				break;
			}
		}
		return cellValue.replace(" ", "").trim();
	}
}
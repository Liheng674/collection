package com.lee.collection.util;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * 导出Excel公共方法
 * @version 1.0
 * 
 * @author wangcp
 *
 */
public class ExcelWrite
{
	// 显示的导出表的标题
	private String prefix;
	// 文件前缀名
	private String title;
	// 导出表的列名
	private String[] rowName;

	private List<Object[]> dataList = new ArrayList<Object[]>();

	// 构造方法，传入要导出的数据
	public ExcelWrite(String prefix, String title, String[] rowName, List<Object[]> dataList)
	{
		this.prefix = prefix;
		this.dataList = dataList;
		this.rowName = rowName;
		this.title = title;
	}

	/*
	 * 导出数据
	 */
	public void export(HttpServletResponse response) throws Exception
	{
		try
		{
			XSSFWorkbook workbook = new XSSFWorkbook(); // 创建工作簿对象
			XSSFSheet sheet = workbook.createSheet(title); // 创建工作表

			// 产生表格标题行
			XSSFRow rowm = sheet.createRow(0);
			XSSFCell cellTiltle = rowm.createCell(0);

			// sheet样式定义【getColumnTopStyle()/getStyle()均为自定义方法 - 在下面 - 可扩展】
			XSSFCellStyle columnTopStyle = this.getColumnTopStyle(workbook);// 获取列头样式对象
			XSSFCellStyle style = this.getStyle(workbook); // 单元格样式对象

			// 合并单元格
			sheet.addMergedRegion(new CellRangeAddress(0, 1, 0, (rowName.length - 1)));
			cellTiltle.setCellStyle(columnTopStyle);
			cellTiltle.setCellValue(title);

			// 定义所需列数
			int columnNum = rowName.length;
			XSSFRow rowRowName = sheet.createRow(2); // 在索引2的位置创建行(最顶端的行开始的第二行)

			// 将列头设置到sheet的单元格中
			for (int n = 0; n < columnNum; n++)
			{
				XSSFCell cellRowName = rowRowName.createCell(n); // 创建列头对应个数的单元格
				cellRowName.setCellType(XSSFCell.CELL_TYPE_STRING); // 设置列头单元格的数据类型
				XSSFRichTextString text = new XSSFRichTextString(rowName[n]);
				cellRowName.setCellValue(text); // 设置列头单元格的值
				cellRowName.setCellStyle(columnTopStyle); // 设置列头单元格样式
			}

			// 将查询出的数据设置到sheet对应的单元格中
			for (int i = 0; i < dataList.size(); i++)
			{

				Object[] obj = dataList.get(i);// 遍历每个对象
				XSSFRow row = sheet.createRow(i + 3);// 创建所需的行数

				for (int j = 0; j < obj.length; j++)
				{
					XSSFCell cell = null; // 设置单元格的数据类型
					if (j == 0)
					{
						cell = row.createCell(j, XSSFCell.CELL_TYPE_NUMERIC);
						cell.setCellValue(i + 1);
					} else
					{
						cell = row.createCell(j, XSSFCell.CELL_TYPE_STRING);
						if (!"".equals(obj[j]) && obj[j] != null)
						{
							cell.setCellValue(obj[j].toString()); // 设置单元格的值
						}
					}
					cell.setCellStyle(style); // 设置单元格样式
				}
			}
			// 让列宽随着导出的列长自动适应
			for (int colNum = 0; colNum < columnNum; colNum++)
			{
				int columnWidth = sheet.getColumnWidth(colNum) / 256;
				for (int rowNum = 0; rowNum < sheet.getLastRowNum(); rowNum++)
				{
					XSSFRow currentRow;
					// 当前行未被使用过
					if (sheet.getRow(rowNum) == null)
					{
						currentRow = sheet.createRow(rowNum);
					} else
					{
						currentRow = sheet.getRow(rowNum);
					}
					if (currentRow.getCell(colNum) != null)
					{
						XSSFCell currentCell = currentRow.getCell(colNum);
						if (currentCell.getCellType() == XSSFCell.CELL_TYPE_STRING)
						{
							int length = currentCell.getStringCellValue().getBytes().length;
							if (columnWidth < length)
							{
								columnWidth = length;
							}
						}
					}
				}
				if (colNum == 0)
				{
					sheet.setColumnWidth(colNum, (columnWidth - 2) * 256);
				} else
				{
					sheet.setColumnWidth(colNum, (columnWidth + 4) * 256);
				}
			}

			if (workbook != null)
			{
				try
				{
					// 响应流
					String fileName = prefix + String.valueOf(System.currentTimeMillis()).substring(4, 13) + ".xlsx";
					String headStr = "attachment; filename=\"" + fileName + "\"";
					// 定义输出类型
					response.setContentType("APPLICATION/OCTET-STREAM");
					// 设定输出文件头
					response.setHeader("Content-Disposition", headStr);
					response.flushBuffer();
					OutputStream out = response.getOutputStream();
					// FileOutputStream out = new FileOutputStream("D:/" + fileName);
					workbook.write(out);
				} catch (IOException e)
				{
					e.printStackTrace();
				}
			}

		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	/*
	 * 列头单元格样式
	 */
	public XSSFCellStyle getColumnTopStyle(XSSFWorkbook workbook)
	{

		// 设置字体
		XSSFFont font = workbook.createFont();
		// 设置字体大小
		font.setFontHeightInPoints((short) 11);
		// 字体加粗
		font.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
		// 设置字体名字
		font.setFontName("Courier New");
		// 设置样式;
		XSSFCellStyle style = workbook.createCellStyle();
		// 设置底边框;
		style.setBorderBottom(XSSFCellStyle.BORDER_THIN);
		// 设置底边框颜色;
		style.setBottomBorderColor(HSSFColor.BLACK.index);
		// 设置左边框;
		style.setBorderLeft(XSSFCellStyle.BORDER_THIN);
		// 设置左边框颜色;
		style.setLeftBorderColor(HSSFColor.BLACK.index);
		// 设置右边框;
		style.setBorderRight(XSSFCellStyle.BORDER_THIN);
		// 设置右边框颜色;
		style.setRightBorderColor(HSSFColor.BLACK.index);
		// 设置顶边框;
		style.setBorderTop(XSSFCellStyle.BORDER_THIN);
		// 设置顶边框颜色;
		style.setTopBorderColor(HSSFColor.BLACK.index);
		// 在样式用应用设置的字体;
		style.setFont(font);
		// 设置自动换行;
		style.setWrapText(false);
		// 设置水平对齐的样式为居中对齐;
		style.setAlignment(XSSFCellStyle.ALIGN_CENTER);
		// 设置垂直对齐的样式为居中对齐;
		style.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);

		return style;

	}

	/*
	 * 列数据信息单元格样式
	 */
	public XSSFCellStyle getStyle(XSSFWorkbook workbook)
	{
		// 设置字体
		XSSFFont font = workbook.createFont();
		// 设置字体大小
		// font.setFontHeightInPoints((short)10);
		// 字体加粗
		// font.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
		// 设置字体名字
		font.setFontName("Courier New");
		// 设置样式;
		XSSFCellStyle style = workbook.createCellStyle();
		// 设置底边框;
		style.setBorderBottom(XSSFCellStyle.BORDER_THIN);
		// 设置底边框颜色;
		style.setBottomBorderColor(HSSFColor.BLACK.index);
		// 设置左边框;
		style.setBorderLeft(XSSFCellStyle.BORDER_THIN);
		// 设置左边框颜色;
		style.setLeftBorderColor(HSSFColor.BLACK.index);
		// 设置右边框;
		style.setBorderRight(XSSFCellStyle.BORDER_THIN);
		// 设置右边框颜色;
		style.setRightBorderColor(HSSFColor.BLACK.index);
		// 设置顶边框;
		style.setBorderTop(XSSFCellStyle.BORDER_THIN);
		// 设置顶边框颜色;
		style.setTopBorderColor(HSSFColor.BLACK.index);
		// 在样式用应用设置的字体;
		style.setFont(font);
		// 设置自动换行;
		style.setWrapText(false);
		// 设置水平对齐的样式为居中对齐;
		style.setAlignment(XSSFCellStyle.ALIGN_CENTER);
		// 设置垂直对齐的样式为居中对齐;
		style.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);

		return style;

	}
}
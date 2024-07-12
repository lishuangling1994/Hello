import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;

public class PoiExcel {
	public static void main(String[] args) throws IOException {

		HSSFWorkbook workbook = new HSSFWorkbook();

		HSSFSheet sheet = workbook.createSheet("自定义单元格部分内容颜色");

		HSSFRow row = sheet.createRow(0);

		HSSFCell cell = row.createCell(0);

		HSSFCellStyle cellStyle = workbook.createCellStyle();

		HSSFFont font = workbook.createFont();

		font.setColor(HSSFColor.HSSFColorPredefined.BLACK.getColor().getIndex());

		HSSFFont font2 = workbook.createFont();

		font2.setColor(HSSFColor.HSSFColorPredefined.RED.getColor().getIndex());

		font2.setBold(true);

		cellStyle.setFont(font);

		cell.setCellStyle(cellStyle);

		String txt = "abcdefghijklmnopqrsREDtuvwxyzredssssssssssss";

		HSSFRichTextString text = new HSSFRichTextString(txt);

		text.applyFont(font2);

		cell.setCellValue(text);

		/*sheet.autoSizeColumn(5, true);*/

		/*File file = new File("我要变成红色的字体.xls");

		if (file.exists()) {

			file.delete();

		}

		file.createNewFile();*/
        FileOutputStream fileOut= new FileOutputStream("font.xls");
		workbook.write(fileOut);
		fileOut.close();

	}

}

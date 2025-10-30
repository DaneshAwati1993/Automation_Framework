package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

    private String path;
    private FileInputStream fi;
    private Workbook wb;
    private Sheet sheet;
    private Row row;
    private Cell cell;

    // Constructor
    public ExcelUtility(String path) {
        this.path = path;
    }

    // Get total number of rows in a sheet
    public int getRowCount(String sheetName) throws IOException {
        fi = new FileInputStream(path);
        wb = new XSSFWorkbook(fi);
        sheet = wb.getSheet(sheetName);
        int rowCount = sheet.getLastRowNum(); // 0-based (header row = 0)
        wb.close();
        fi.close();
        return rowCount + 1; // convert to 1-based for easy loop handling
    }

    // Get total number of columns in a given row
    public int getCellCount(String sheetName, int rowNum) throws IOException {
        fi = new FileInputStream(path);
        wb = new XSSFWorkbook(fi);
        sheet = wb.getSheet(sheetName);
        row = sheet.getRow(rowNum);
        int cellCount = row.getLastCellNum(); // returns total number of cells
        wb.close();
        fi.close();
        return cellCount;
    }

    // Get cell data as String
    public String getCellData(String sheetName, int rowNum, int colNum) throws IOException {
        fi = new FileInputStream(path);
        wb = new XSSFWorkbook(fi);
        sheet = wb.getSheet(sheetName);
        row = sheet.getRow(rowNum);
        if (row == null) {
            wb.close();
            fi.close();
            return "";
        }
        cell = row.getCell(colNum);

        DataFormatter formatter = new DataFormatter();
        String data;
        try {
            data = formatter.formatCellValue(cell);
        } catch (Exception e) {
            data = "";
        }

        wb.close();
        fi.close();
        return data;
    }
}

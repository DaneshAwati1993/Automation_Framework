package utilities;

import java.io.IOException;
import org.testng.annotations.DataProvider;

public class DataProviders {

    // ✅ DataProvider 1: Login Data from Excel
    @DataProvider(name = "LoginData")
    public String[][] getData() throws IOException {
        // Get Excel file path dynamically
        String path = System.getProperty("user.dir") + "\\testData\\LoginData.xlsx";

        // Create an ExcelUtility object
        ExcelUtility xlutil = new ExcelUtility(path);

        // Read row and column counts
        int totalRows = xlutil.getRowCount("Sheet1");
        int totalCols = xlutil.getCellCount("Sheet1", 1);

        // Create a 2D array to store Excel data (skip header row)
        String[][] loginData = new String[totalRows - 1][totalCols];

        // Loop through Excel and fetch data
        for (int i = 1; i < totalRows; i++) { // start from row 1 (skip header)
            for (int j = 0; j < totalCols; j++) {
                loginData[i - 1][j] = xlutil.getCellData("Sheet1", i, j);
            }
        }

        System.out.println("✅ Loaded " + (totalRows - 1) + " rows and " + totalCols + " columns from Excel.");
        return loginData;
    }
}

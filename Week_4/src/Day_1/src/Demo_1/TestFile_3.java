package Demo_1;

import java.io.*;

public class TestFile_3 {
    public static void main(String[] args) {
        File file = new File("D:\\java\\Week_4\\src\\Day_1\\src\\Demo_1\\folder_2");
        if (!file.exists()) {
            file.mkdir();
        }
    }
}

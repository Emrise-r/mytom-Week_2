package Demo_1;

import java.io.*;

public class TestFile_2 {
    public static void main(String[] args) {
        File file = new File("D:\\java\\Week_4\\src\\Day_1\\src\\Demo_1\\folder_1");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        file = new File("D:\\java\\Week_4\\src\\Day_1\\src\\Demo_1\\adiwn\\ARX.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

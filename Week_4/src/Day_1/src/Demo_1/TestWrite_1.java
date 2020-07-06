package Demo_1;

import java.io.*;

public class TestWrite_1 {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        File file = new File("D:/java/Week_4/src/Day_1/src/Demo_1/folder_1/ARX.txt");
            try {
                if (!file.exists()) {
                file.createNewFile();

        }
            fileWriter = new FileWriter(file,true);
            bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.newLine();
            bufferedWriter.write("\nTurn up the slam and a bar code blaster");
            bufferedWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (bufferedWriter != null || fileWriter != null) {
                    try {
                        fileWriter.close();
                    }catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
    }

}

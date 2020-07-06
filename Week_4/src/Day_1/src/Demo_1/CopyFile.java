package Demo_1;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        try {
//            FileReader fileReader = new FileReader("D:\\java\\Week_4\\src\\Day_1\\src\\Demo_1\\folder_1\\ARX.txt");
            File file1 = new File("D:/java/Week_4/src/Day_1/src/Demo_1/folder_1/ARX.txt");
            FileInputStream fis = new FileInputStream(file1);
            BufferedInputStream bis = new BufferedInputStream(fis);

//            byte[] bytes = new byte[99999999];
            for (int i = 0; bis.available() > 0; i++) {
//                bytes[i] = (byte) bis.read();
                System.out.print(bis.read());
            }

            File file2 = new File("D:/java/Week_4/src/Day_1/src/Demo_1/folder_2/ARX.txt");
            if (file2.exists()) {
                file2.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(file2);
            BufferedOutputStream bos = new BufferedOutputStream(fos);


//            bos.write(bytes);
            while(bis.available() > 0) {
                bos.write((byte)bis.read());
            }
            bos.flush();
            fos.flush();
            System.out.println("\nFile copy complete");


        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

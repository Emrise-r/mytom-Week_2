package Quan_ly_sp;

import java.io.*;
import java.util.*;



public class QuanLySP {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scan = new Scanner(System.in);

        List<Production> productionList = new ArrayList<Production>();
//        productionList.add(new Production(1594, "IphoneXS", "Apple", 1100.0));
//        productionList.add(new Production(1567, "Iphone8", "Apple", 500.0));
//        productionList.add(new Production(5621, "Galaxy S20", "Samsung", 1200.0));
//        productionList.add(new Production(5123, "Galaxy Fold", "Samsung", 2000.0));
        Production p1 = new Production(1594, "IphoneXS", "Apple", 1100.0);
        Production p2 = new Production(1567, "Iphone8", "Apple", 500.0);
        Production p3 = new Production(5621, "Galaxy S20", "Samsung", 1200.0);
        Production p4 = new Production(5123, "Galaxy Fold", "Samsung", 1200.0);
//
        File file = new File("D:\\java\\Week_4\\src\\Day_2\\src\\Quan_ly_sp\\ProductManager.txt");
        FileOutputStream fos = new FileOutputStream("D:\\java\\Week_4\\src\\Day_2\\src\\Quan_ly_sp\\ProductManager.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

//        oos.writeObject(productionList);
        oos.writeObject(p1);
        oos.writeObject(p2);
        oos.writeObject(p3);
        oos.writeObject(p4);
        bos.close();
        fos.close();

//        write(p1);
//        write(p2);
//        write(p3);
//        write(p4);



        int n = -1;
        while (n != 0) {
            System.out.println("\nNhap lua chon cua ban");
            System.out.println("1. Show list Product");
            System.out.println("2. Add Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Edit Product");
            System.out.println("0. End.");
            n = scan.nextInt();
            switch (n) {
                case 1:
                    System.out.println("\nDanh sach");
                    FileInputStream fis = new FileInputStream("D:\\java\\Week_4\\src\\Day_2\\src\\Quan_ly_sp\\ProductManager.txt");
                    BufferedInputStream bis = new BufferedInputStream(fis);
                    ObjectInputStream ois = new ObjectInputStream(bis);
                    for(int i = 0; bis.available() > 0; i++) {
                        Production p = (Production) ois.readObject();
//                        productionList.add(p);
                        System.out.print("\n" + i + ". " + p.getSerial() + " " + p.getName() + " " + p.getPrice());
                    }
                    bis.close();
                    fis.close();
                    break;
                case 2:
                    System.out.println("\nAdd Product");
                    System.out.print("Nhap serial: ");
                    long serial = scan.nextLong();
                    System.out.print("\nNhap ten Sp: ");
                    String name = scan.next();
                    System.out.print("\nNhap ten Nha Sx: ");
                    String Hsx = scan.next();
                    System.out.print("\nnhap gia ban: ");
                    double price = scan.nextDouble();
                    Production pp = new Production(serial, name, Hsx, price);

                    break;
                case 3:
                    FileInputStream fis2 = new FileInputStream("D:\\java\\Week_4\\src\\Day_2\\src\\Quan_ly_sp\\ProductManager.txt");
                    BufferedInputStream bis2 = new BufferedInputStream(fis2);
                    ObjectInputStream ois2 = new ObjectInputStream(bis2);
                    System.out.println("\nDelete Product");
                    for(int i = 0; bis2.available() > 0; i++) {
                        Production p = (Production) ois2.readObject();
                        productionList.add(p);
                        System.out.print("\n" + i + ". " + p.getSerial() + " " + p.getName() + " " + p.getPrice());
                    }
                    bis2.close();
                    fis2.close();
                    System.out.print("\nNhap so thu tu san pham can xoa: ");
                    int l = scan.nextInt();
                    System.out.println("Stt: " + l + " " + productionList.remove(l));
                    FileOutputStream fos2 = new FileOutputStream("D:\\java\\Week_4\\src\\Day_2\\src\\Quan_ly_sp\\ProductManager.txt");
                    BufferedOutputStream bos2 = new BufferedOutputStream(fos2);
                    ObjectOutputStream oos2 = new ObjectOutputStream(bos2);
                    for (int i = 0; i < productionList.size(); i++) {
                        oos2.writeObject(productionList.get(i));
                    }
                    bos.close();
                    fos.close();
                    break;
                default:
                    System.out.println("Ko co lua chon do dau");
            }
        }
    }
    public static void write(Production p) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\java\\Week_4\\src\\Day_2\\src\\Quan_ly_sp\\ProductManager.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(p);
        bos.close();
        fos.close();
    }
    public static Production ois() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("D:\\java\\Week_4\\src\\Day_2\\src\\Quan_ly_sp\\ProductManager.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        for (int i = 0; ois.available() > 0; i++) {
            Production p = (Production) ois.readObject();
            return p;
        }
        return null;
    }
//        public static void deleteAll() {
//            File file = new File("D:\\java\\Week_4\\src\\Day_2\\src\\Quan_ly_sp\\ProductManager.txt");
//            file.delete();
//        }
    }


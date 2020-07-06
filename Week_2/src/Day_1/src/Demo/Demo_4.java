package Demo;

public class Demo_4 {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien();
        nv1.getThuNhap();
        NhanVien nv2 = new TruongPhong();
        nv2.getThuNhap();
        TruongPhong nv3 = new TruongPhong();
        nv3.getThuNhap();
    }
}
class NhanVien {
    public double getThuNhap() {
        System.out.println("lasary nv");
        return  1;
    }
}

class TruongPhong extends NhanVien {
    public double getThuNhap() {
        System.out.println("lasary tp");
        return 10;
    }
}
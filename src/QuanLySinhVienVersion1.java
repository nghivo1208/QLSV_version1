public class QuanLySinhVienVersion1 {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien(1713091,"Nghi Vo", "Nam",
                "Q8 HCM", "123123123",8.0,7.8,5.7 );

        //Nhập thông tin
        sv1.nhapThongTinSinhVien();
        System.out.println(sv1.xuatThongTinSinhVien());
        System.out.println(sv2.xuatThongTinSinhVien());

    }
}

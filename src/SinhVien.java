import java.util.Scanner;

public class SinhVien {
    private int maSoSinhVien;
    private String hoTen;
    private String gioiTinh;
    private String diaChi;
    private int soDienThoai;
    private double diemTrungBinh;
    private String xepLoai;

    Scanner sc = new Scanner(System.in);

    public SinhVien() {
    }

    public SinhVien(int maSoSinhVien, String hoTen, String gioiTinh, String diaChi, int soDienThoai) {
        this.maSoSinhVien = maSoSinhVien;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    public int getMaSoSinhVien() {
        return maSoSinhVien;
    }

    public void setMaSoSinhVien(int maSoSinhVien) {
        this.maSoSinhVien = maSoSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setXepLoai(double diemTrungBinh) {
        diemTrungBinh = this.diemTrungBinh;
        this.xepLoai = xepLoai;
    }

    public void nhapThongTinSinhVien(){
        System.out.println("Nhập thông tin sinh viên");
        System.out.print("Nhập MSSV: ");
        String mssv = sc.nextLine();
        System.out.print("Nhập họ tên: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhập giới tính: ");
        String gioiTinh = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String diaChi = sc.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String sdt = sc.nextLine();
        System.out.println("Vui lòng nhập điểm các môn Toán Lý Hoá để tính điểm trung bình và xếp loại");
        System.out.print("Điểm toán: ");
        String diemToan = sc.nextLine();
        System.out.print("Điểm Lý: ");
        String diemLy = sc.nextLine();
        System.out.print("Điểm Hoá: ");
        String diemHoa = sc.nextLine();

        setMaSoSinhVien(Integer.parseInt(mssv));
        setHoTen(hoTen);
        setGioiTinh(gioiTinh);
        setDiaChi(diaChi);
        setSoDienThoai(Integer.parseInt(sdt));

    }

}

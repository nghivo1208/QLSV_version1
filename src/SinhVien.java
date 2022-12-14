import java.util.Scanner;

public class SinhVien {
    private int maSoSinhVien;
    private String hoTen;
    private String gioiTinh;
    private String diaChi;
    private String soDienThoai;
    private double diemToan;
    private double diemLy;
    private double diemHoa;
    private double diemTrungBinh;
    private String xepLoai;

    Scanner sc = new Scanner(System.in);

    public SinhVien() {
    }

    public SinhVien(int maSoSinhVien, String hoTen, String gioiTinh, String diaChi, String soDienThoai,
                    double diemToan, double diemLy, double diemHoa) {
        this.maSoSinhVien = maSoSinhVien;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        this.diemTrungBinh = tinhDiemTrungBinh(diemToan,diemLy,diemHoa);
        this.xepLoai = xepLoaiSinhVien(diemTrungBinh);
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

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
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

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }

    public void nhapThongTinSinhVien() {
        System.out.println("Nh???p th??ng tin sinh vi??n");
        System.out.print("Nh???p MSSV: ");
        String mssv = sc.nextLine();
        System.out.print("Nh???p h??? t??n: ");
        String hoTen = sc.nextLine();
        System.out.print("Nh???p gi???i t??nh: ");
        String gioiTinh = sc.nextLine();
        System.out.print("Nh???p ?????a ch???: ");
        String diaChi = sc.nextLine();
        System.out.print("Nh???p s??? ??i???n tho???i: ");
        String sdt = sc.nextLine();
        System.out.println("Vui l??ng nh???p ??i???m c??c m??n To??n L?? Ho?? ????? t??nh ??i???m trung b??nh v?? x???p lo???i");
        System.out.print("??i???m to??n: ");
        String diemToan = sc.nextLine();
        System.out.print("??i???m L??: ");
        String diemLy = sc.nextLine();
        System.out.print("??i???m Ho??: ");
        String diemHoa = sc.nextLine();

        setMaSoSinhVien(Integer.parseInt(mssv));
        setHoTen(hoTen);
        setGioiTinh(gioiTinh);
        setDiaChi(diaChi);
        setSoDienThoai(sdt);
        setDiemToan(Double.parseDouble(diemToan));
        setDiemLy(Double.parseDouble(diemLy));
        setDiemHoa(Double.parseDouble(diemHoa));

    }

    public String xuatThongTinSinhVien() {
        return "maSoSinhVien=" + maSoSinhVien +
                ", hoTen= '" + hoTen + '\'' +
                ", gioiTinh= '" + gioiTinh + '\'' +
                ", diaChi= '" + diaChi + '\'' +
                ", soDienThoai= " + soDienThoai +
                ", diemToan= " + diemToan +
                ", diemLy= " + diemLy +
                ", diemHoa= " + diemHoa +
                ", diemTrungBinh= %.2f" + diemTrungBinh +
                ", xepLoai='" + xepLoai + '\'';
    }

    public double tinhDiemTrungBinh(double diemToan, double diemLy, double diemHoa){
        this.diemTrungBinh = (diemToan+diemLy+diemHoa)/3;
        return this.diemTrungBinh;
    }

    public String xepLoaiSinhVien(double diemTrungBinh){
        if (diemTrungBinh < 5) {
            this.xepLoai = "Kem";
        } else if (5 <= diemTrungBinh &&  diemTrungBinh < 7.5) {
            this.xepLoai = "Trung Binh";
        }else if (7.5 <= diemTrungBinh &&  diemTrungBinh < 8.5 ) {
            this.xepLoai = "Kha";
        }else if (8.5 <= diemTrungBinh ) {
            this.xepLoai = "Gioi";
        }
        return this.xepLoai;
    }

}

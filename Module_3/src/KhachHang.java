import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class KhachHang {

    protected String maKh;
    protected String HoTen;
    protected String SDT;
    protected String Email;
    protected Date NgaySinh;
    protected String LoaiKh;
    ArrayList<KhachHang> ListKh = new ArrayList<>();

    public KhachHang(String maKh, String hoTen, String SDT, String email, Date ngaySinh, String loaiKh) {
        this.maKh = maKh;
        HoTen = hoTen;
        this.SDT = SDT;
        Email = email;
        NgaySinh = ngaySinh;
        LoaiKh = loaiKh;
    }

    public KhachHang() {
    }

    public String getMaKh() {
        return maKh;
    }

    public void setMaKh(String maKh) {
        this.maKh = maKh;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getLoaiKh() {
        return LoaiKh;
    }

    public void setLoaiKh(String loaiKh) {
        LoaiKh = loaiKh;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "maKh='" + maKh + '\'' +
                ", HoTen='" + HoTen + '\'' +
                ", SDT='" + SDT + '\'' +
                ", Email='" + Email + '\'' +
                ", NgaySinh=" + NgaySinh +
                ", LoaiKh='" + LoaiKh + '\'' +
                '}';
    }
    public void HienthiKhachhang(){
        System.out.println(ListKh);
    }
    public void Luufile() {
        String tenFile = "Khachhang.csv";
        try {
            File file = new File(tenFile);
            if (file.createNewFile()){
                System.out.println("--------Create new file ------");
            }
            FileWriter fileWriter = new FileWriter(tenFile);

            fileWriter.write(this.toString());

            fileWriter.close();
            System.out.println("--------Đã ghi khách hàng vào file -------");

        } catch (Exception e){
            System.out.println("----------------------");
            System.out.println(e);
            System.out.println("-----------------------");
        }
    }
    public void them(){
        //Mã Khách hàng, Họ Tên, Số Điện thoại, Email, Ngày sinh, Loại Khách hàng;
        Scanner sc = new Scanner(System.in);
        KiemTra kt=new KiemTra();
        System.out.println("========NHAP KHACH HANG========");
        System.out.println("Nhap Mã khách hàng");
        maKh = sc.nextLine();
        System.out.println("Nhap Ten Khách hang");
        HoTen = sc.nextLine();
        System.out.println("Nhập vào số điện thoại");
        SDT= sc.nextLine();
        while (!kt.isNumeric(SDT) || SDT.length()!=12){
            System.out.println("Nhap lai so dien thoai: ");
            SDT=sc.nextLine();
        }
        System.out.println("Nhập vào email");
        Email= sc.nextLine();
        while (!kt.validate(Email)){
            System.out.println("Nhap lai email: ");
            Email=sc.nextLine();
        }
        System.out.println("Nhap ngày sinh");
        String ngaySinh = sc.nextLine();
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            NgaySinh = formatter.parse(ngaySinh);
        } catch (Exception e){

        }
        System.out.println("Nhập loại khách hang");
        LoaiKh = sc.nextLine();
        while (LoaiKh.toLowerCase().equals("thường")==false&&
                LoaiKh.toLowerCase().equals("vip1")==false&&
                LoaiKh.toLowerCase().equals("vip2")==false){
            if(LoaiKh.trim().equals("")||LoaiKh==null){
                LoaiKh="Thường";
                break;
            }
            else {
                System.out.println("Nhap lai loai khach hang: ");
                LoaiKh= sc.nextLine();
            }
        }

        KhachHang khachhang= new KhachHang(maKh,HoTen,SDT,Email,NgaySinh,LoaiKh);
        ListKh.add(khachhang);
        for (KhachHang kh :
                ListKh) {
            kh.Luufile();
        }

    }

}

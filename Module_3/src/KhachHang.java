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
            System.out.println("--------???? ghi kh??ch h??ng v??o file -------");

        } catch (Exception e){
            System.out.println("----------------------");
            System.out.println(e);
            System.out.println("-----------------------");
        }
    }
    public void them(){
        //M?? Kh??ch h??ng, H??? T??n, S??? ??i???n tho???i, Email, Ng??y sinh, Lo???i Kh??ch h??ng;
        Scanner sc = new Scanner(System.in);
        KiemTra kt=new KiemTra();
        System.out.println("========NHAP KHACH HANG========");
        System.out.println("Nhap M?? kh??ch h??ng");
        maKh = sc.nextLine();
        System.out.println("Nhap Ten Kh??ch hang");
        HoTen = sc.nextLine();
        System.out.println("Nh???p v??o s??? ??i???n tho???i");
        SDT= sc.nextLine();
        while (!kt.isNumeric(SDT) || SDT.length()!=12){
            System.out.println("Nhap lai so dien thoai: ");
            SDT=sc.nextLine();
        }
        System.out.println("Nh???p v??o email");
        Email= sc.nextLine();
        while (!kt.validate(Email)){
            System.out.println("Nhap lai email: ");
            Email=sc.nextLine();
        }
        System.out.println("Nhap ng??y sinh");
        String ngaySinh = sc.nextLine();
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            NgaySinh = formatter.parse(ngaySinh);
        } catch (Exception e){

        }
        System.out.println("Nh???p lo???i kh??ch hang");
        LoaiKh = sc.nextLine();
        while (LoaiKh.toLowerCase().equals("th?????ng")==false&&
                LoaiKh.toLowerCase().equals("vip1")==false&&
                LoaiKh.toLowerCase().equals("vip2")==false){
            if(LoaiKh.trim().equals("")||LoaiKh==null){
                LoaiKh="Th?????ng";
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

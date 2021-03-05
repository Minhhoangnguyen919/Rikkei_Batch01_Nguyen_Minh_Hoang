import java.util.Scanner;

public class MainmenuController {
    public static void main(String[] args) {
        SanPhamSach sach = new SanPhamSach();
        DungCuHocTap dd = new DungCuHocTap();
        DoChoi dc = new DoChoi();
        KhachHang kh = new KhachHang();
        ThongTinHoaDon ttdon = new ThongTinHoaDon();
        Scanner input = new Scanner(System.in);
            boolean cont = true;
            do {
                System.out.println("1.Thêm sản phẩm");
                System.out.println("2.Thêm đơn hàng");
                System.out.println("3.Hiện thị thông tin sản phầm");
                System.out.println("4.Hiện thị danh sách đơn hàng");
                System.out.println("5.Tìm kiếm");
                int chon = input.nextInt();
                switch (chon) {
                    case 1:
                        System.out.println("Chức năng thêm sản phẩm");
                        System.out.println("1.Thêm sản phẩm sách");
                        System.out.println("2.Thêm sản phẩm đò dùng học tập");
                        System.out.println("3.Thêm sản phẩm ĐỒ chơi trẻ em");
                        System.out.println("0.Để quay lại");
                        int chonsp = input.nextInt();
                        switch (chonsp) {
                            case 1:
                                System.out.println("Số sản phẩm cân thêm");
                                int s = input.nextInt();
                                for (int i = 0; i < s; i++) {
                                    System.out.println("===THÊM SẢN PHẨM SÁCH===");
                                    sach.them();
                                    sach.HienThiThongTin();
                                }
                                break;
                            case 2:
                                System.out.println("Số sản phẩm cân thêm");
                                int a = input.nextInt();
                                for (int i = 0; i < a; i++) {
                                    System.out.println("===THÊM ĐỒ DÙNG HỌC TẬP===");
                                    dd.them();
                                    dd.HienThiThongTin();
                                }
                                break;
                            case 3:
                                System.out.println("Số sản phẩm cân thêm");
                                int b = input.nextInt();
                                for (int i = 0; i < b; i++) {
                                    System.out.println("===THÊM ĐỒ CHOI===");
                                    dc.them();
                                    dc.HienThiThongTin();
                                }
                                break;
                            case 4:
                        }
                        break;
                    case 2:
                        System.out.println("Chức năng thêm đơn hàng");
                        System.out.println("Số đơn hàng thêm");
                        int s = input.nextInt();
                        for (int i = 0; i < s; i++) {
                            System.out.println("===THÊM ĐƠN HÀNG===");
                            ttdon.them();
                            ttdon.hienThiThongTin();
                        }
                        break;
                    case 3:
                        System.out.println("Hiện thị thông tin sản phẩm");
                        System.out.println("1.Hiển thị sản phẩm sách");
                        System.out.println("2.Hiển thị phẩm đò dùng học tập");
                        System.out.println("3.Hiển thị phẩm ĐỒ chơi trẻ em");
                        System.out.println("0.Để quay lại");

                        int Ht = input.nextInt();
                        switch (Ht) {
                            case 1:
                                System.out.println("===HIEN SẢN PHẨM SÁCH===");
                                sach.HienThiThongTin();
                                break;
                            case 2:
                                System.out.println("===HIỂN THỊ ĐỒ DÙNG HỌC TẬP===");
                                dd.HienThiThongTin();
                                break;
                            case 3:
                                System.out.println("===HIỂN THỊ ĐỒ CHOI===");
                                dc.HienThiThongTin();
                                break;

                        }
                        break;
                    case 4:
                        System.out.println("HIỂN THỊ DANH SÁCH DƠN HÀNG");
                        ttdon.hienThiThongTin();
                        break;
                    case 5:
                        System.out.println("TÌM KIẾM");
                        System.out.println("1.Tìm kiếm theo mã sản phầm");
                        System.out.println("2. Tìm kiếm theo mã khách hàng");
                        System.out.println("0.Để quay lại");


                        int Tim = input.nextInt();
                        switch (Tim) {
                            case 1:
                                System.out.println("===TIM KIẾM PHẨM SÁCH===");
                                System.out.println("Nhập ma san pham");

                                break;
                            case 2:
                                System.out.println("===TÌM KIẾM THEO KHACH HANG===");
                                break;
                        }
                        break;
                }
                }
                while (cont) ;
            }
}

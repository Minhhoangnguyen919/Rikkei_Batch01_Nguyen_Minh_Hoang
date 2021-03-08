create database Module_4_ql;

create table DMSach (
	MaDMSach int primary key,
    TheLoai varchar(100),
    Mota varchar(500)
);

create table DMDoChoi (
	MaDMDochoi int primary key,
    Nhom varchar(100),
    Mota varchar(500)
);

create table DMDungCu (
	MaDMDungCu int primary key,
    Khoi varchar(100),
    Mota varchar(500)
);
create table LoaiKhachHang (
	MaLoai int primary key,
    TenLoai varchar(50)
);
create table NhanVien(
	MaNhanVien varchar(10) primary key,
    TenNhanVien varchar(100),
    NgaySinh date,
    ViTri varchar(50),
    SoDienThoai varchar(10),
    Email varchar(50),
    Diachi varchar(200)
);
create table KhachHang (
	MaKhachHang varchar(10) primary key,
    TenKhachHang varchar(50),
    NgaySinh date,
    SoDienThoai varchar(10),
    Email varchar(50),
    MaLoai int,
    foreign key(MaLoai)references LoaiKhachHang(MaLoai)
);

create table SanPhamSach (
	MaSPSach varchar(10) primary key,
    TenSPSach varchar(50),
    SoLuong int,
    DonGia double,
    DonVi varchar(50),
    MaDMSach int,
    NhaXuatBan varchar(100),
    NamXuatBan varchar(4),
    TacGia varchar(50),
    NgayXuatBan date,
    LanTaiBan int,
    foreign key(MaDMSach)references DMSach(MaDMSach)
);

create table SanPhamDoChoi (
	MaSPDoChoi varchar(10) primary key,
    TenSPDoChoi varchar(50),
    SoLuong int,
    DonGia double,
    DonVi varchar(50),
    MaDMDoChoi int,
    XuatXu varchar(100),
    ThuongHieu varchar(100),
    NhaCungCap varchar(50),
    HuongDan varchar(200),
    foreign key(MaDMDoChoi)references DMDoChoi(MaDMDoChoi)
);

create table SanPhamDungCu (
	MaSPDungCu varchar(10) primary key,
    TenSPDungCu varchar(50),
    SoLuong int,
    DonGia double,
    DonVi varchar(50),
    MaDMDungCu int,
    XuatXu varchar(100),
    ThuongHieu varchar(100),
    NhaCungCap varchar(50),
    MauSac varchar(10),
    KichThuoc float,
    ChatLieu varchar(200),
    HuongDan varchar(200),
    foreign key(MaDMDungCu)references DMDungCu(MaDMDungCu)
);

create table DonHang(
	MaDonHang int primary key,
    MaKhachHang varchar(10),
    MaNhanVien varchar(10),
    NgayMuaHang date,
    TongTien double,
    foreign key(MaKhachHang)references KhachHang(MaKhachHang),
    foreign key(MaNhanVien)references NhanVien(MaNhanVien)
);


create table ChiTietDonHang(
	MaDonHang int,
    MASanPham varchar(10),
    SoLuong int,
    foreign key(MaDonHang)references DonHang(MaDonHang),
    foreign key(MASanPham)references SanPhamSach(MaSPSach),
    foreign key(MASanPham)references SanPhamDungCu(MaSPDungCu),
	foreign key(MASanPham)references sanphamdochoi(MaSPDoChoi)
);

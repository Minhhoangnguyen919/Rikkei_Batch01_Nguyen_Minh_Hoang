create database Ql_nha_dat;

create table Khach_Hang (
	MaKhachHang varchar(10) primary key,
    TenKhachHang varchar(50),
    SoDienThoai varchar(10),
    Email varchar(50)
);
create table Giao_dich(
	MaGiaoDich varchar(10) primary key,
    MaKhachHang varchar(10),
    NgayGiaoDich date,
    LoaiDichVu nvarchar(50),
    DonGia double,
    DienTich double,
    foreign key(MaKhachHang)references Khach_Hang(MaKhachHang)
);

insert into khach_hang values('kh01',N'Nguyễn Văn Anh','0123467985','nguyenvananh@gmail.com');
insert into khach_hang values('kh02',N'Nguyễn Thi Lệ','0986325417','nguyenthile@gmail.com');
insert into khach_hang values('kh03',N'Nguyễn Thị Hồng','0868331425','nguyenthihong@gmail.com');
insert into khach_hang values('kh04',N'Trần Thị Hoàng Anh','0986352147','hoanganh669@gmail.com');
insert into khach_hang values('kh05',N'Trần Hữu Quốc','0935326817','huuquoc1999@gmail.com');

insert into giao_dich values('mgd1','kh01','2020/09/07','nhà đất','25000','250');
insert into giao_dich values('mgd2','kh03','2020/02/17','Đất','63500','450');
insert into giao_dich values('mgd3','kh02','2020/09/18','Đất','25100','150');
insert into giao_dich values('mgd4','kh04','2020/02/17','Nhà Đất','63500','450');


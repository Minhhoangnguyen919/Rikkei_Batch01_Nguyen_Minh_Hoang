#2 Hiển thị thông tin của các cản phẩm có số lượng > 20 và có đơn giá < 1.000.000 VNĐ
select * from sanphamdochoi a
where a.SoLuong > 20 and a.DonGia < 1000000;

select * from sanphamdungcu a
where a.SoLuong > 20 and a.DonGia < 1000000;

select * from sanphamsach a
where a.SoLuong > 20 and a.DonGia < 1000000;

#3. Hiển thị thông tin của những Khách hàng có độ tuổi >16 tuổi và < 30 tuổi có địa chỉ ở Đà Nẵng 
#hoặc những Khách hàng có độ tuổi > 40 tuổi và có địa chỉ ở Quảng Nam

select * from khachhang 
where year(curdate())-year(ngaysinh)>16 and year(curdate())-year(ngaysinh)<30 or year(curdate())-year(ngaysinh)>40;

/*4--San pham mua trong nam 2020*/

#5 Hiển thị thông tin tương ứng mỗi Khách hàng đã mua bao nhiêu sản phẩm trong Quý 4 của năm 2020.
SELECT TenKhachHang, SUM(SoLuong) as SoLuong FROM donhang h,chitietdonhang c, khachhang k
WHERE h.MaDonHang = c.MaDonHang and k.MaKhachHang = h.MaKhachHang and QUARTER(h.NgayMuaHang) = 4
GROUP BY TenKhachHang;

#6 Hiển thị thông tin của những Khách hàng có tên bắt đầu là các ký tự ‘K’, ‘H’ hoặc ‘T’ và có độ dài tối thiểu 15 ký tự.
select * from khachhang 
where TenKhachHang like 'K%' or TenKhachHang like 'H%' or TenKhachHang like 'T%' and Char_length(TenkhachHang)>=15;

#8--Hiển thị thông tin Tên khách hàng có trong hệ thống, với yêu cầu Tên khách hàng không trùng nhau.
select distinct * from khachhang;


#9 Hiển thị thông tin bao gồm MaSanPham, TenSanPham, TenLoaiSanPham
# của tất cả các sản phẩm đã được khách hàng đặt hàng trong năm 2019
# nhưng chưa từng được khách hàng đặt hàng trong năm 2020.

SELECT MaSPDoChoi, TenSPDoChoi, Nhom FROM sanphamdochoi a, dmdochoi b, donhang c, chitietdonhang d
WHERE a.MaDMDoChoi = b.MaDMDoChoi and d.MaDonHang = c.MaDonHang and a.MaSPDoChoi = d.MaSanPham and YEAR(NgayMuaHang) = 2019 and YEAR(NgayMuaHang) != 2020;

SELECT MaSPSach, TenSPSach, TheLoai FROM sanphamsach a, dmsach b, donhang c, chitietdonhang d
WHERE a.MaDMSach = b.MaDMSach and d.MaDonHang = c.MaDonHang and a.MaSPSach = d.MaSanPham and YEAR(NgayMuaHang) = 2019 and YEAR(NgayMuaHang) != 2020;

SELECT MaSPDungCu, TenSPDungCu, Khoi FROM sanphamdungcu a, dmdungcu b, donhang c, chitietdonhang d
WHERE a.MaDMDungCU = b.MaDMDungCu and d.MaDonHang = c.MaDonHang and a.MaSPDungCu = d.MaSanPham and YEAR(NgayMuaHang) = 2019 and YEAR(NgayMuaHang) != 2020;

#10 Hiển thị thông tin của những Khách hàng đã từng mua sản phẩm đồ chơi là
# “Bộ xếp hình” nhưng chưa từng mua sản phẩm đồ chơi là “Bộ chơi cát” trong những năm 2019, 2020.

SELECT * FROM khachhang
WHERE MaKhachHang in (
    SELECT MaKhachHang
    FROM donhang a, chitietdonhang b, sanphamdochoi c
    WHERE a.MaDonHang = b.MaDonHang and c.MaSPDoChoi = b.MaSanPham
      and (c.MaSPDoChoi = "Bộ xếp hình" or
          !(c.MaSPDoChoi = "Bộ chơi cát" and YEAR(NgayMuaHang) BETWEEN 2019 and 2020))
);


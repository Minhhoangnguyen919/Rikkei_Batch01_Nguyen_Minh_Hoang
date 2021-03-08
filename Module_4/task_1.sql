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
where year(curdate())-year(ngaysinh)>16 and year(curdate())-year(ngaysinh)<30 or year(curdate())-year(ngaysinh)>40


#6 Hiển thị thông tin của những Khách hàng có tên bắt đầu là các ký tự ‘K’, ‘H’ hoặc ‘T’ và có độ dài tối thiểu 15 ký tự.
select * from khachhang 
where TenKhachHang like 'K%' or TenKhachHang like 'H%' or TenKhachHang like 'T%' and Char_length(TenkhachHang)>=15
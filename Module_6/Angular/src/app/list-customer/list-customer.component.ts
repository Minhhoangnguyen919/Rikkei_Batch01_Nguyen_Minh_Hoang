import { Component, OnInit } from '@angular/core';
import {ISKhachHang} from "../../assets/dbKhachHang";

@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListCustomerComponent implements OnInit {
  khachhangs : ISKhachHang[]=[
    {id:2321120623,hoTen:'Nguyễn Văn Hồng',soDienThoai:'0935309693',email:'hongnguyen020499@gmail.com',ngaySinh:'02/04/1999',maLoai:3,diaChi:'Quảng Nam'},
    {id:2321124564,hoTen:'Ngô Minh Cường',soDienThoai:'0935309693',email:'minhcuongdtu@gmail.com',ngaySinh:'08/07/1999',maLoai:3,diaChi:'Quảng Nam'},
    {id:2321126741,hoTen:'Nguyễn Hậu',soDienThoai:'0935309693',email:'haunguyen@gmail.com',ngaySinh:'14/02/1999',maLoai:1,diaChi:'Đà Nẵng'},
    {id:2321198768,hoTen:'Võ Văn Thắng',soDienThoai:'0935309693',email:'vanthang26d@gmail.com',ngaySinh:'17/10/1999',maLoai:2,diaChi:'Quảng Nam'},

  ];
  constructor() { }

  ngOnInit(): void {
  }

}

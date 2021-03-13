import { Component, OnInit } from '@angular/core';
import {ISNhanVien} from "../../assets/dbNhanVien";

@Component({
  selector: 'app-list-employer',
  templateUrl: './list-employer.component.html',
  styleUrls: ['./list-employer.component.css']
})
export class ListEmployerComponent implements OnInit {
  nhanviens:ISNhanVien[]=[
    {id:2321120623,hoTen:'Nguyễn Văn Hồng',soDienThoai:'0935309693',email:'hongnguyen020499@gmail.com',ngaySinh:'02/04/1999',viTri:'DEV sắp tuyệt chủng',diaChi:'Quảng Nam'},
    {id:2321124564,hoTen:'Ngô Minh Cường',soDienThoai:'0935309693',email:'minhcuongdtu@gmail.com',ngaySinh:'08/07/1999',viTri:'Mentor',diaChi:'Quảng Nam'},
    {id:2321126741,hoTen:'Nguyễn Hậu',soDienThoai:'0935309693',email:'haunguyen@gmail.com',ngaySinh:'14/02/1999',viTri:'Trưởng Phòng',diaChi:'Đà Nẵng'},
    {id:2321198768,hoTen:'Võ Văn Thắng',soDienThoai:'0935309693',email:'vanthang26d@gmail.com',ngaySinh:'17/10/1999',viTri:'Phó Giám Đốc',diaChi:'Quảng Nam'},

  ]
  constructor() { }

  ngOnInit(): void {
  }

}

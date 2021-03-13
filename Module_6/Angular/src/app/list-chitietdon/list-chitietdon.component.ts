import { Component, OnInit } from '@angular/core';
import {ISCTDonHang} from "../../assets/dbDonhang";

@Component({
  selector: 'app-list-chitietdon',
  templateUrl: './list-chitietdon.component.html',
  styleUrls: ['./list-chitietdon.component.css']
})
export class ListChitietdonComponent implements OnInit {
  chitiets:ISCTDonHang[]=[
    {maDonHang:'23211',maSanPham:'S-0001',soLuong:200},
    {maDonHang:'23200',maSanPham:'S-0002',soLuong:200},
    {maDonHang:'23229',maSanPham:'S-0003',soLuong:200},
  ]
  constructor() { }

  ngOnInit(): void {
  }

}

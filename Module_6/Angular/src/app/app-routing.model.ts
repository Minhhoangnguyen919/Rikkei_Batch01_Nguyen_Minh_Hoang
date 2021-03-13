import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { ListComponent } from './list/list.component';
import { CreateCustomerComponent } from './create-customer/create-customer.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { CreateEmployerComponent } from './create-employer/create-employer.component';
import { CreateSanphamComponent } from './create-sanpham/create-sanpham.component';
import { CreateChitietdonComponent } from './create-chitietdon/create-chitietdon.component';
import { ListChitietdonComponent } from './list-chitietdon/list-chitietdon.component';
import { ListCustomerComponent } from './list-customer/list-customer.component';
import { ListEmployerComponent } from './list-employer/list-employer.component';
import { ListSanphamComponent } from './list-sanpham/list-sanpham.component';
import { ListSachComponent } from './list-sach/list-sach.component';
import { ListDochoiComponent } from './list-dochoi/list-dochoi.component';
import { ListDungcuComponent } from './list-dungcu/list-dungcu.component';
import { CreateDonhangComponent } from './create-donhang/create-donhang.component';
import { CreateSachComponent } from './create-sach/create-sach.component';
import { CreateDochoiComponent } from './create-dochoi/create-dochoi.component';
import { CreateDungcuComponent } from './create-dungcu/create-dungcu.component';

const routes: Routes = [
  {path:'createKhachHang',component:CreateEmployerComponent},
  {path:'ListKhachHang',component: ListCustomerComponent },
  {path:'ListNhanVien',component:  ListEmployerComponent},
  {path:'createNhanVien',component: CreateEmployerComponent },
  {path:'sanpham',component: ListSanphamComponent },
  {path:'sach',component: ListSachComponent },
  {path:'addsach',component: CreateSachComponent },
  {path:'dochoi',component: ListDochoiComponent },
  {path:'adddochoi',component: CreateDochoiComponent },
  {path:'dungcu',component: ListDungcuComponent },
  {path:'adddungcu',component: CreateDungcuComponent },
//  {path:'bill',component:},
  {path:'adddonhang',component: CreateDonhangComponent },
  {path:'chitietdonhang',component: ListChitietdonComponent },
  {path:'addchitietdonhang',component: CreateChitietdonComponent},
  {path:'',redirectTo:'/khachhang',pathMatch:'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

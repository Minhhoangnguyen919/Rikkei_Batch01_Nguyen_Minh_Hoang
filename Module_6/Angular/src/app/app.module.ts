import { NgModule } from '@angular/core';
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
import {RouterModule} from '@angular/router';

@NgModule({
  declarations: [
    AppComponent,
    ListComponent,
    CreateCustomerComponent,
    HeaderComponent,
    FooterComponent,
    CreateEmployerComponent,
    CreateSanphamComponent,
    CreateChitietdonComponent,
    ListChitietdonComponent,
    ListCustomerComponent,
    ListEmployerComponent,
    ListSanphamComponent,
    ListSachComponent,
    ListDochoiComponent,
    ListDungcuComponent,
    CreateDonhangComponent,
    CreateSachComponent,
    CreateDochoiComponent,
    CreateDungcuComponent,

  ],
  imports: [
    BrowserModule,
    RouterModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

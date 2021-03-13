import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListSanphamComponent } from './list-sanpham.component';

describe('ListSanphamComponent', () => {
  let component: ListSanphamComponent;
  let fixture: ComponentFixture<ListSanphamComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListSanphamComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListSanphamComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateSanphamComponent } from './create-sanpham.component';

describe('CreateSanphamComponent', () => {
  let component: CreateSanphamComponent;
  let fixture: ComponentFixture<CreateSanphamComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreateSanphamComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateSanphamComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

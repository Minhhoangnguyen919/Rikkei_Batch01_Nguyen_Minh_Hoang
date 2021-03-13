import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateDonhangComponent } from './create-donhang.component';

describe('CreateDonhangComponent', () => {
  let component: CreateDonhangComponent;
  let fixture: ComponentFixture<CreateDonhangComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreateDonhangComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateDonhangComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

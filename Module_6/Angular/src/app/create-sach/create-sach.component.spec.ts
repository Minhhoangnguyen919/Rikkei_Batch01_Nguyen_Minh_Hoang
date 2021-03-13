import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateSachComponent } from './create-sach.component';

describe('CreateSachComponent', () => {
  let component: CreateSachComponent;
  let fixture: ComponentFixture<CreateSachComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreateSachComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateSachComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

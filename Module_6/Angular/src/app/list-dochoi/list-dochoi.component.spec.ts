import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListDochoiComponent } from './list-dochoi.component';

describe('ListDochoiComponent', () => {
  let component: ListDochoiComponent;
  let fixture: ComponentFixture<ListDochoiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListDochoiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListDochoiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListDungcuComponent } from './list-dungcu.component';

describe('ListDungcuComponent', () => {
  let component: ListDungcuComponent;
  let fixture: ComponentFixture<ListDungcuComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListDungcuComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListDungcuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

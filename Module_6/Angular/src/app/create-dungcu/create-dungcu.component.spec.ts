import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateDungcuComponent } from './create-dungcu.component';

describe('CreateDungcuComponent', () => {
  let component: CreateDungcuComponent;
  let fixture: ComponentFixture<CreateDungcuComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreateDungcuComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateDungcuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

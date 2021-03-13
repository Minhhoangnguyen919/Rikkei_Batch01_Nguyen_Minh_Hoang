import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateDochoiComponent } from './create-dochoi.component';

describe('CreateDochoiComponent', () => {
  let component: CreateDochoiComponent;
  let fixture: ComponentFixture<CreateDochoiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreateDochoiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateDochoiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

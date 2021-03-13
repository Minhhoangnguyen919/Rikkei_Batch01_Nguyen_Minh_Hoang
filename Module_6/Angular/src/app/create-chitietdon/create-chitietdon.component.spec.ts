import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateChitietdonComponent } from './create-chitietdon.component';

describe('CreateChitietdonComponent', () => {
  let component: CreateChitietdonComponent;
  let fixture: ComponentFixture<CreateChitietdonComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreateChitietdonComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateChitietdonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

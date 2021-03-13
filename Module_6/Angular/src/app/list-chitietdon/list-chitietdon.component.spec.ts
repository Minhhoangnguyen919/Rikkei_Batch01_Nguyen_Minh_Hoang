import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListChitietdonComponent } from './list-chitietdon.component';

describe('ListChitietdonComponent', () => {
  let component: ListChitietdonComponent;
  let fixture: ComponentFixture<ListChitietdonComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListChitietdonComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListChitietdonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

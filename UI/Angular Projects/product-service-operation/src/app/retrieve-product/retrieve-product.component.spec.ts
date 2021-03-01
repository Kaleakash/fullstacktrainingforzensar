import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RetrieveProductComponent } from './retrieve-product.component';

describe('RetrieveProductComponent', () => {
  let component: RetrieveProductComponent;
  let fixture: ComponentFixture<RetrieveProductComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RetrieveProductComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RetrieveProductComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

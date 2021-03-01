import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductFindByIdComponent } from './product-find-by-id.component';

describe('ProductFindByIdComponent', () => {
  let component: ProductFindByIdComponent;
  let fixture: ComponentFixture<ProductFindByIdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProductFindByIdComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ProductFindByIdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

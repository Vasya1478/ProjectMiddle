import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DoctorsEditDialogComponent } from './doctors-edit-dialog.component';

describe('DoctorsEditDialogComponent', () => {
  let component: DoctorsEditDialogComponent;
  let fixture: ComponentFixture<DoctorsEditDialogComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DoctorsEditDialogComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DoctorsEditDialogComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

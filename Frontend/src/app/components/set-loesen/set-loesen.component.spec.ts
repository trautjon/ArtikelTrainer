import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { SetLoesenComponent } from './set-loesen.component';

describe('SetLoesenComponent', () => {
  let component: SetLoesenComponent;
  let fixture: ComponentFixture<SetLoesenComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SetLoesenComponent ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(SetLoesenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

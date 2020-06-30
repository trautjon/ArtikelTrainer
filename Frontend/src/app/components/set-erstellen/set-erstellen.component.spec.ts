import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { SetErstellenComponent } from './set-erstellen.component';

describe('SetErstellenComponent', () => {
  let component: SetErstellenComponent;
  let fixture: ComponentFixture<SetErstellenComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SetErstellenComponent ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(SetErstellenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { SetErstellenPage } from './set-erstellen.page';

describe('SetErstellenPage', () => {
  let component: SetErstellenPage;
  let fixture: ComponentFixture<SetErstellenPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SetErstellenPage ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(SetErstellenPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

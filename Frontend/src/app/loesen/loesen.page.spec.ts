import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { loesenPage } from './loesen.page';

describe('loesenPage', () => {
  let component: loesenPage;
  let fixture: ComponentFixture<loesenPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ loesenPage ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(loesenPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

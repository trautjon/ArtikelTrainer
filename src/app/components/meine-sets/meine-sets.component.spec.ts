import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { MeineSetsComponent } from './meine-sets.component';

describe('MeineSetsComponent', () => {
  let component: MeineSetsComponent;
  let fixture: ComponentFixture<MeineSetsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MeineSetsComponent ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(MeineSetsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

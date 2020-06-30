import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { AbgeschlosseneSetsComponent } from './abgeschlossene-sets.component';

describe('AbgeschlosseneSetsComponent', () => {
  let component: AbgeschlosseneSetsComponent;
  let fixture: ComponentFixture<AbgeschlosseneSetsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AbgeschlosseneSetsComponent ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(AbgeschlosseneSetsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

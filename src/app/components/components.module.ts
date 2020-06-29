import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MeineSetsComponent } from './meine-sets/meine-sets.component';
import { AbgeschlosseneSetsComponent } from './abgeschlossene-sets/abgeschlossene-sets.component';



@NgModule({
  declarations: [MeineSetsComponent, AbgeschlosseneSetsComponent],
  imports: [
    CommonModule
  ],
  exports:[MeineSetsComponent, AbgeschlosseneSetsComponent]
})
export class ComponentsModule { }

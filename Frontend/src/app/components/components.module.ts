import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MeineSetsComponent } from './meine-sets/meine-sets.component';
import { AbgeschlosseneSetsComponent } from './abgeschlossene-sets/abgeschlossene-sets.component';
import { SetErstellenComponent } from './set-erstellen/set-erstellen.component';
import { RouterModule } from '@angular/router';



@NgModule({
  declarations: [MeineSetsComponent, AbgeschlosseneSetsComponent, SetErstellenComponent],
  imports: [
    CommonModule, RouterModule
  ],
  exports:[MeineSetsComponent, AbgeschlosseneSetsComponent, SetErstellenComponent]
})
export class ComponentsModule { }

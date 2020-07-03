import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { IonicModule } from '@ionic/angular';
import { FormsModule } from '@angular/forms';
import { loesenPage } from './loesen.page';

import { loesenPageRoutingModule } from './loesen-routing.module';


@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    loesenPageRoutingModule
  ],
  declarations: [loesenPage]
})
export class loesenPageModule {}

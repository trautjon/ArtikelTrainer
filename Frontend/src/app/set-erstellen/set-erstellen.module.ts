import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { SetErstellenPageRoutingModule } from './set-erstellen-routing.module';

import { SetErstellenPage } from './set-erstellen.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    SetErstellenPageRoutingModule
  ],
  declarations: [SetErstellenPage]
})
export class SetErstellenPageModule {}

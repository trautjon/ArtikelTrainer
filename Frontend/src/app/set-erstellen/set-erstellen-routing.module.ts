import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { SetErstellenPage } from './set-erstellen.page';

const routes: Routes = [
  {
    path: '',
    component: SetErstellenPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class SetErstellenPageRoutingModule {}

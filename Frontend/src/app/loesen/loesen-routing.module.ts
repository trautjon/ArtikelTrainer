import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { loesenPage } from './loesen.page';

const routes: Routes = [
  {
    path: '',
    component: loesenPage,
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class loesenPageRoutingModule {}

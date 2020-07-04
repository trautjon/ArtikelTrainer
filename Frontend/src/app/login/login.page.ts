import { Component, OnInit } from '@angular/core';
import { ProfilPage } from '../profil/profil.page';

@Component({
  selector: 'app-login',
  templateUrl: './login.page.html',
  styleUrls: ['./login.page.scss'],
})
export class LoginPage implements OnInit {
  [x: string]: any;

  constructor() { }

  ngOnInit() {
  }
  login() {
    this.navCtrl.push(ProfilPage);
  }

}

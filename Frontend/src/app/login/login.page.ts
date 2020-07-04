import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.page.html',
  styleUrls: ['./login.page.scss'],
})
export class LoginPage implements OnInit {
  [x: string]: any;

  constructor(private router: Router) { }

  userName: String;
  password: String;
  fail:boolean = false;

  validate(){
    if (this.userName =="max" && this.password == "1234") {

      this.router.navigate(['/profil'])
      
    } else {
      this.fail=true;
      console.log("Benutzername oder Passwort ist falsch!")
  }
}

  

  ngOnInit() {
  }     
  }



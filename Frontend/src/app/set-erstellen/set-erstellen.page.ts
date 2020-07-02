import { Component, OnInit } from '@angular/core';
import { Wort } from '../model/wort';



@Component({
  selector: 'app-set-erstellen',
  templateUrl: './set-erstellen.page.html',
  styleUrls: ['./set-erstellen.page.scss'],
})
export class SetErstellenPage implements OnInit {

setname: string; 

woerter: Wort[] = [];
wort: Wort = new Wort();


  addword(){
    this.woerter.push(this.wort)
  }

  postSet(){
    
    console.log(this.woerter);
  }



  constructor() { }

  ngOnInit() {
  }

  ngOnChanges(){

  }

}

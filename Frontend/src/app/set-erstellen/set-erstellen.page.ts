import { Component, OnInit } from '@angular/core';
import { Wort } from './wort';



@Component({
  selector: 'app-set-erstellen',
  templateUrl: './set-erstellen.page.html',
  styleUrls: ['./set-erstellen.page.scss'],
})
export class SetErstellenPage implements OnInit {

setname: string = "hallo"; 

woerter: Wort[] = [{wort: "Haus", artikel:"das"}];
wort: Wort = new Wort();


  addword(){
    this.woerter.push(this.wort)
  }



  constructor() { }

  ngOnInit() {
  }

  ngOnChanges(){

  }

}

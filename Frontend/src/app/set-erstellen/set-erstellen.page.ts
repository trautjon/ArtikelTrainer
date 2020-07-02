import { Component, OnInit } from '@angular/core';
import { Wort } from '../model/wort';



@Component({
  selector: 'app-set-erstellen',
  templateUrl: './set-erstellen.page.html',
  styleUrls: ['./set-erstellen.page.scss'],
})
export class SetErstellenPage implements OnInit {

setname: string; 

woerter: Wort[] = new Array()
wort: Wort = new Wort();



  addword(){

    //Neues Objekt erzwingen, da sonst der Array immer überschrieben wird 
    let eingabe = { wort: this.wort.wort, artikel: this.wort.artikel };
    
    this.woerter.push(eingabe);
  
    console.log(this.woerter);
     
    // Felder werden gelöscht sobald die neuen Daten im Array sind 
    this.wort.wort = "";
    this.wort.artikel = "";
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

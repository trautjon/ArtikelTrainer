import { Component, OnInit } from '@angular/core';
import { Wort } from '../model/wort';
import { HttpClient } from '@angular/common/http';



@Component({
  selector: 'app-set-erstellen',
  templateUrl: './set-erstellen.page.html',
  styleUrls: ['./set-erstellen.page.scss'],
})
export class SetErstellenPage implements OnInit {

setname: string; 

woerter: Wort[] = new Array()
wort: Wort = new Wort();
private server:string = "http://localhost:8080";



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
    
    
    this.http.post(this.server + '/addSet/' + this.setname , this.woerter)
            .subscribe((data:any) => {

            });

    console.log(this.woerter);
  }



  constructor(private http:HttpClient) { }

  ngOnInit() {
  }

  ngOnChanges(){

  }

}

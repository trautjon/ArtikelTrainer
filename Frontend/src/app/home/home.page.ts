import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

//Server Feedback
/*
[{"id":5,"wort":"Auto","artikel":{"id":3,"artikel":"das"},"wortSet":{"id":4,"name":"Bewegungsmittel"}},{"id":7,"wort":"Zug","artikel":{"id":1,"artikel":"der"},"wortSet":{"id":4,"name":"Bewegungsmittel"}},{"id":6,"wort":"Flugzeug","artikel":{"id":3,"artikel":"das"},"wortSet":{"id":4,"name":"Bewegungsmittel"}},{"id":8,"wort":"Fahrrad","artikel":{"id":3,"artikel":"das"},"wortSet":{"id":4,"name":"Bewegungsmittel"}}]
*/


  index = 0;
  show: boolean = false;

    
  woerter = [
    {wort: "Baum", artikel: "der"},
    {wort: "Sonne", artikel: "die"}
  ]
  output = ""
  
  constructor() {}

  check(artikel) {
    if (artikel === this.woerter[this.index].artikel) {
      this.output = "richtig";
      this.show=true;
    } else {
      this.output = "falsch";
      this.show=false;
    }
  }

  next() {
    this.index ++;
    this.output = "";
    this.show=false;
  }

}

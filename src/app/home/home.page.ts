import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  index = 0;
  
  woerter = [
    {wort: "Baum", artikel: "der"},
    {wort: "Sonne", artikel: "die"}
  ]
  output = ""
  
  constructor() {}

  check(artikel) {
    if (artikel === this.woerter[this.index].artikel) {
      this.output = "richtig";
    } else {
      this.output = "falsch";
    }
  }

  next() {
    this.index ++;
    this.output = "";
  }

}

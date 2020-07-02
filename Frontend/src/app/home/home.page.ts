import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage implements OnInit {

  //Server Feedback
  /*
  [{"id":5,"wort":"Auto","artikel":{"id":3,"artikel":"das"},"wortSet":{"id":4,"name":"Bewegungsmittel"}},{"id":7,"wort":"Zug","artikel":{"id":1,"artikel":"der"},"wortSet":{"id":4,"name":"Bewegungsmittel"}},{"id":6,"wort":"Flugzeug","artikel":{"id":3,"artikel":"das"},"wortSet":{"id":4,"name":"Bewegungsmittel"}},{"id":8,"wort":"Fahrrad","artikel":{"id":3,"artikel":"das"},"wortSet":{"id":4,"name":"Bewegungsmittel"}}]
  */


  index = 0;
  show: boolean = false;


  woerter = null;
  output = "";
  private server:string = "http://localhost:8080";

  constructor(private activatedRoute: ActivatedRoute, private http:HttpClient) { }

  ngOnInit() {
    
    let id = this.activatedRoute.snapshot.paramMap.get("id");
    //console.log(id)
    
    this.http.get(this.server + '/set/' + id)
      .subscribe((selectedSet: any) => {
        this.woerter = selectedSet;

        console.log(selectedSet);

      });
  }

  check(artikel) {

    if (artikel === this.woerter[this.index].artikel.artikel) {
      this.output = "richtig";
      this.show = true;
    } else {
      this.output = "falsch";
      this.show = false;
    }
  }

  next() {
    this.index++;
    this.output = "";
    this.show = false;
  }

}

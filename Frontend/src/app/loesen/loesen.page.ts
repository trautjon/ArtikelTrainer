import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-loesen',
  templateUrl: 'loesen.page.html',
  styleUrls: ['loesen.page.scss'],
})
export class loesenPage implements OnInit {

  //Server Feedback
  /*
  [{"id":5,"wort":"Auto","artikel":{"id":3,"artikel":"das"},"wortSet":{"id":4,"name":"Bewegungsmittel"}},{"id":7,"wort":"Zug","artikel":{"id":1,"artikel":"der"},"wortSet":{"id":4,"name":"Bewegungsmittel"}},{"id":6,"wort":"Flugzeug","artikel":{"id":3,"artikel":"das"},"wortSet":{"id":4,"name":"Bewegungsmittel"}},{"id":8,"wort":"Fahrrad","artikel":{"id":3,"artikel":"das"},"wortSet":{"id":4,"name":"Bewegungsmittel"}}]
  */

 
  index = 0;
  show: boolean = false;
  finished: boolean;


  woerter = null;
  output = "";
  private server:string = "http://localhost:8080";

  constructor(private activatedRoute: ActivatedRoute, private http:HttpClient) { }

  ngOnInit() {
    
    this.finished = false;

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
   
    if (this.index == (this.woerter?.length - 1)){
      this.finished = true;
      
    } else{

      this.index++;
      this.output = "";
      this.show = false;

    }
    
  }

  end(){

    //TODO POST Befehl "Tag finished setzen"
    /*
    let tag = {};
    this.http.post(this.server + '', tag)
            .subscribe((data:any) => {

            });
    */
  }

}

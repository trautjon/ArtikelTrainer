import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-loesen',
  templateUrl: 'loesen.page.html',
  styleUrls: ['loesen.page.scss'],
})
export class loesenPage implements OnInit {


  index = 0;
  show: boolean = false;
  finished: boolean;


  woerter = null;
  output = "";
  private server:string = "http://localhost:8080";
  private setid:any;
  name = "";

  constructor(private activatedRoute: ActivatedRoute, private http:HttpClient,private router: Router) { }

  ngOnInit() {
    
    this.finished = false;

    this.setid = this.activatedRoute.snapshot.paramMap.get("id");
    
    
    this.http.post(this.server + '/set/' + this.setid, null)
      .subscribe((selectedSet: any) => {
        this.woerter = selectedSet.woerter;
        this.name = selectedSet.name;

        console.log(selectedSet);

      });
  }

  check(artikel) {

    if (artikel === this.woerter[this.index].artikel) {
      this.output = "richtig";
      if (this.index == (this.woerter?.length)-1){
        this.finished = true;
      } else {
        this.show = true;
      }  
      
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

  end(){

    
    
    this.http.post(this.server + '/set/' + this.setid + '/finished', null)
      .subscribe((finishedSet: any) => {

       
      });       
      this.router.navigate(['/profil']) 
    
  }

}

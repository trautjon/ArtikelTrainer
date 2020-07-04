import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Set } from '../../model/set';

@Component({
  selector: 'app-meine-sets',
  templateUrl: './meine-sets.component.html',
  styleUrls: ['./meine-sets.component.scss'],
})
export class MeineSetsComponent implements OnInit {

  constructor(private http: HttpClient) { }

  private server:string = "http://localhost:8080";

  public sets:Set[];
  public selected:Set[];

  getMeineSets(){
    this.http.get(this.server +'/setsNotFinished')
                  .subscribe((data:Set[]) => {
                    this.sets = data;
                    console.log(data);
                  });
                }

  ngOnInit() {
    this.getMeineSets();
  }
  
  

}

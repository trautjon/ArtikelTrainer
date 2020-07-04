import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Set } from '../../model/set';

@Component({
  selector: 'app-abgeschlossene-sets',
  templateUrl: './abgeschlossene-sets.component.html',
  styleUrls: ['./abgeschlossene-sets.component.scss'],
})
export class AbgeschlosseneSetsComponent implements OnInit {

  constructor(private http: HttpClient) { }

  private server:string = "http://localhost:8080";

  public sets:Set[];
  public selected:Set[];

  getAbgeschlosseneSets(){
    // TODO auf abgeschlossene Sets anpassen 
    this.http.get(this.server +'/showAllSets')
                  .subscribe((data:Set[]) => {
                    this.sets = data;
                    console.log(data);
                  });
                }

  ngOnInit() {
    
    this.getAbgeschlosseneSets()
  }

  

}

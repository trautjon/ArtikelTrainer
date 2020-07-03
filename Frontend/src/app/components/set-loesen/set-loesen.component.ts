import { Component, OnInit, Input } from '@angular/core';
import { Set } from '../../model/set';
import { MeineSetsComponent } from '../meine-sets/meine-sets.component';

@Component({
  selector: 'app-set-loesen',
  templateUrl: './set-loesen.component.html',
  styleUrls: ['./set-loesen.component.scss'],
})
export class SetLoesenComponent implements OnInit {

  constructor() { }

  @Input() selectedSet:Set[] ;

  ngOnInit() {}

}

import { Component, OnInit } from '@angular/core';
import {DataService} from'./../data.service';
@Component({
  selector: 'app-home',
  templateUrl: './home-page.component.html',
  styles: ['./home-page.component.css']
})
export class HomePageComponent implements OnInit {

constructor(
  private dataService: DataService, 
){

}

  ngOnInit(){

  }
}
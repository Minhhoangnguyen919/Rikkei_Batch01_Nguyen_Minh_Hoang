import { Component, OnInit } from '@angular/core';
export  interface  IStuden {
  id: number;
  name: string;
  mark: number;
  image: string;
}
@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {
  studen: IStuden = {
    id: 1,
    name: 'tran hoang anh',
    mark: 0,
    image: 'https://scontent.fsgn2-5.fna.fbcdn.net/v/t1.15752-9/156426018_1171550909970614_3012810033398006987_n.jpg?_nc_cat=102&ccb=1-3&_nc_sid=ae9488&_nc_ohc=gkPB9OkRmwAAX-GfvmR&_nc_ht=scontent.fsgn2-5.fna&oh=b49b68c44857f122ab855b1b836ee957&oe=606ED3B8'
  }
  constructor() { }

  ngOnInit(): void {
  }

}

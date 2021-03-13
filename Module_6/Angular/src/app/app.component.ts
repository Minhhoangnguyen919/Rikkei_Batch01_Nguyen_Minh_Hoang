import { Component } from '@angular/core';
export  interface IfaceStuden {
  id: number;
  name: string;
  make: string;
  img: string;
}
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Angular';
}

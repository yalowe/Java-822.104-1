import { Component, OnInit } from '@angular/core';
import { ProductService } from '../shared/services/product.service';
import { ProducrtManagement } from '../shared/models/product-management.model';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  public productInfo: ProducrtManagement;
  constructor(private myProductService: ProductService) {
    this.productInfo = this.myProductService.producrtInfo;

  }

  public addToCart(item:string):void{
    this.myProductService.addItem(item);
  }

  ngOnInit() {
  }

}

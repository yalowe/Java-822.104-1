import { Component, OnInit } from '@angular/core';
import { ProducrtManagement } from '../shared/models/product-management.model';
import { ProductService } from '../shared/services/product.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {

  public productInfo: ProducrtManagement;
  constructor(private myProductService: ProductService) {
    this.productInfo = this.myProductService.producrtInfo;
    this.myProductService.getCart();

  }


  ngOnInit() {
  }

}

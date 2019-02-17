import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ProducrtManagement } from '../models/product-management.model';
import { Product } from '../models/product.model';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  public producrtInfo: ProducrtManagement = new ProducrtManagement();
  public url: string = "/00_Product_app/ProductsServlet";

  constructor(private myHttpClient: HttpClient) {
    this.getAllProducts();
  }

  public getAllProducts(): void {
    this.myHttpClient.get<Product[]>(this.url + "?page=home").subscribe(
      (res) => { this.producrtInfo.allProducts = res; },
      (err) => { console.log(err) }
    );
  }

  public getCart(): void {
    this.myHttpClient.get<Product[]>(this.url + "?page=cart").subscribe(
      (res) => { this.producrtInfo.cartProducts = res; },
      (err) => { console.log(err) }
    );
  }

  public addItem(newItem: string): void {
    this.myHttpClient.get<any>(this.url + "?item=" + newItem).subscribe(
      (res) => { alert(res.res) },
      (err) => { console.log(err) }
    );
  }
}

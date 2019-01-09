# HttpClient - class task
### server: punk api
### client : angular app
* Create a new angular app
* Add to the app the `HttpClientModule` (in "app.module.ts" file)
* Create a new folder named "shared"
* In the "shared" folder create 2 sub folders:
    * models
    * services
* In "shared/models" add a new matching class to this `Beer` json:
```json
[{"id":200,"name":"Double IPA - Russian Doll","tagline":"Nesting Hop Bomb.","first_brewed":"08/2014","description":"The levels of hops vary throughout the range. We love hops, so all four beers are big, bitter badasses, but by tweaking the amount of each hop used later in the boil and during dry- hopping, we can balance the malty backbone with some unexpected flavours. Simcoe is used in the whirlpool for all four beers, and yet still lends different characters to each.","image_url":"https://images.punkapi.com/v2/200.png","abv":8,"ibu":85,"target_fg":1013,"target_og":1074,"ebc":35,"srm":17.5,"ph":5.2,"attenuation_level":82.4,"volume":{"value":20,"unit":"liters"},"boil_volume":{"value":25,"unit":"liters"},"method":{"mash_temp":[{"temp":{"value":65,"unit":"celsius"},"duration":85}],"fermentation":{"temp":{"value":19,"unit":"celsius"}},"twist":null},"ingredients":{"malt":[{"name":"Extra Pale","amount":{"value":6.75,"unit":"kilograms"}},{"name":"Caramalt","amount":{"value":0.06,"unit":"kilograms"}},{"name":"Dark Crystal","amount":{"value":0.06,"unit":"kilograms"}}],"hops":[{"name":"Centennial","amount":{"value":25,"unit":"grams"},"add":"start","attribute":"bitter"},{"name":"Cascade","amount":{"value":12.5,"unit":"grams"},"add":"middle","attribute":"flavour"},{"name":"Citra","amount":{"value":12.5,"unit":"grams"},"add":"middle","attribute":"flavour"},{"name":"Simcoe","amount":{"value":25,"unit":"grams"},"add":"end","attribute":"flavour"},{"name":"Citra","amount":{"value":12.5,"unit":"grams"},"add":"end","attribute":"flavour"},{"name":"Cascade","amount":{"value":25,"unit":"grams"},"add":"end","attribute":"flavour"},{"name":"Simcoe","amount":{"value":87.5,"unit":"grams"},"add":"dry hop","attribute":"aroma"},{"name":"Cascade","amount":{"value":100,"unit":"grams"},"add":"dry hop","attribute":"aroma"},{"name":"Centennial","amount":{"value":87.5,"unit":"grams"},"add":"dry hop","attribute":"aroma"},{"name":"Citra","amount":{"value":112.5,"unit":"grams"},"add":"dry hop","attribute":"aroma"}],"yeast":"Wyeast 1056 - American Ale™"},"food_pairing":["Strong cheddar fondue","Pork chops with spicy orange marmalade","Rich crème brûlée"],"brewers_tips":"Create balance through experimentation with the hop amounts and malt backbone.","contributed_by":"Sam Mason <samjbmason>"}]
```
* In "shared/services" add a new file named "beer.service.ts" (remember to add it with a `ng g s` command)
* In the service:
    * Create a variable named `beerInfo` of type `any` that is a `json` object, with one property named `selected` (this property will contain a beer of type `Beer` that we created in  `shared/models`)
    * add a refernce (by DI) to the service `HttpClient`
    * add a function named `getSpecificBeer` - that gets one number and returns void. The function will send a `GET` request (via the `HttpClient`), and save the returned beer - to the local `beerInfo.selected`
        * the request is sent to : https://api.punkapi.com/v2/beers/200
        * note: change the number in the end of the url - with the number that you got to the function
* Create a `select-beer` component:
    * the component will have a pointer to the `BeerService`
    * in the html - we will have an input tag of type number and a button - when the user presses the button - we will call a function named `setSelctedBeer` that is in the ts part
    * `setSelctedBeer` - is a function that calls the `getSpecificBeer` in the server , and sends the number that the user entered in the input element
* Create a `show-beer` component:
    * the component will have a pointer to the `BeerService`
    * in the html - we will show all the info of the `beerInfo.selected`that is in the service
* Add to `app.compnent.html` the instances of the `select-beer` and `show-beer` compnents


### Good luck
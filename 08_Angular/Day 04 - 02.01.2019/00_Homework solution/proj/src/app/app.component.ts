import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  public vegArray: string[] = ["artichoke", "aubergine", "amrud", "asparagus", "legumes", "alfalfa sprouts", "azuki beans", "bean sprouts", "black beans", "black-eyed peas", "borlotti bean", "broad beans", "chickpeas", "green beans", "kidney beans", "lentils", "lima beans", "mung beans", "navy beans", "pinto beans", "runner beans", "split peas", "soy beans", "peas", "mangetout", "broccoflower", "broccoli", "brussels", "cabbage", "kohlrabi", "cauliflower", "celery", "endive", "fiddleheads", "frisee", "fennel", "greens", "beet greens", "bok choy", "chard", "collard greens", "kale", "mustard greens", "spinach", "herbs", "anise", "basil", "caraway", "cilantro", "coriander", "chamomile", "dill", "fennel", "lavender", "lemon Grass", "marjoram", "oregano", "parsley", "rosemary", "sage", "thyme", "lettuce", "arugula", "mushrooms", "nettles", "spinach", "okra", "onions", "Chives", "Garlic", "Leek", "onion", "shallot", "scallion", "parsley", "bell pepper", "chili pepper", "Jalapeño", "Habanero", "Paprika", "Tabasco pepper", "pepper", "radicchio", "rhubarb", "root vegetables", "beetroot", "cattlefeed", "carrot", "celeriac", "daikon", "ginger", "parsnip", "rutabaga", "turnip", "radish", "wasabi", "horseradish", "white radish", "skirret", "sweetcorn", "topinambur", "squashes", "acorn squash", "bitter melon", "squash", "banana squash", "courgette", "cucumber", "delicata", "gem squash", "hubbard squash", "marrow", "patty pans", "pumpkin", "tat soi", "tomato", "tubers", "jicama", "artichoke", "potato", "quandong", "sunchokes", "sweet potato", "taro", "yam", "water chestnut", "watercress", "zucchini"];
  public vegTempArray: string[];
  public search: string;


  public setSearch() {

    this.vegTempArray = [];
    
    for (let x of this.vegArray) {
      if (x.startsWith(this.search)) {
        this.vegTempArray.push(x);
      }
    }
  }

}

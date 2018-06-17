import {FormsModule} from '@angular/forms';
import {Component, NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {platformBrowserDynamic} from '@angular/platform-browser-dynamic';

class Item {
    constructor(public id: number, public name: string, public quantity: number, public unit: number, public line: number) {}
}

@Component({
    selector: 'osl-app',
    templateUrl: 'shoppingCart.html'
})
class ShoppingCartComponent {
    items: Array<Item> = [];
	
    constructor() {
        this.items.push(new Item(1, 'Skis', 4, 250, 1000));
        this.items.push(new Item(2, 'iPad', 2, 3000, 6000));
		this.items.push(new Item(3, 'Bugatti', 1, 2000000, 2000000));
    }
	
	remove($index) {
		this.items.splice($index,1);
	}
}

// Wrap our component in a module.
@NgModule({
    imports: [BrowserModule, FormsModule],
    declarations: [ShoppingCartComponent],
    bootstrap: [ShoppingCartComponent]
})
export class AppModule {}

// App bootstrap.
platformBrowserDynamic().bootstrapModule(AppModule);
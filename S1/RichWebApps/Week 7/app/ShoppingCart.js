"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
Object.defineProperty(exports, "__esModule", { value: true });
var forms_1 = require("@angular/forms");
var core_1 = require("@angular/core");
var platform_browser_1 = require("@angular/platform-browser");
var Item = /** @class */ (function () {
    function Item(id, name, quantity, unit, line) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.line = line;
    }
    return Item;
}());
var ShoppingCartComponent = /** @class */ (function () {
    function ShoppingCartComponent() {
        this.items = [];
        this.items.push(new Item(1, 'Skis', 4, 250, 1000));
        this.items.push(new Item(2, 'iPad', 2, 3000, 6000));
        this.items.push(new Item(3, 'Bugatti', 1, 2000000, 2000000));
    }
    ShoppingCartComponent.prototype.remove = function ($index) {
        this.items.splice($index, 1);
    };
    ShoppingCartComponent = __decorate([
        core_1.Component({
            selector: 'osl-app',
            templateUrl: 'app/shoppingCart.html'
        }),
        __metadata("design:paramtypes", [])
    ], ShoppingCartComponent);
    return ShoppingCartComponent;
}());
// Wrap our component in a module.
var AppModule = /** @class */ (function () {
    function AppModule() {
    }
    AppModule = __decorate([
        core_1.NgModule({
            imports: [platform_browser_1.BrowserModule, forms_1.FormsModule],
            declarations: [ShoppingCartComponent],
            bootstrap: [ShoppingCartComponent]
        })
    ], AppModule);
    return AppModule;
}());
exports.AppModule = AppModule;
//# sourceMappingURL=ShoppingCart.js.map
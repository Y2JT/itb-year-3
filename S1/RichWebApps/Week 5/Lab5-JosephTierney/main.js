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
var core_1 = require("@angular/core");
var core_2 = require("@angular/core");
var platform_browser_1 = require("@angular/platform-browser");
var platform_browser_dynamic_1 = require("@angular/platform-browser-dynamic");
// Film model class - this Film class is already complete.
var Film = /** @class */ (function () {
    function Film(title, blurb, price, score) {
        this.title = title;
        this.blurb = blurb;
        this.price = price;
        this.score = score;
        this.genres = [];
        this.id = Film.nextId++;
    }
    Film.prototype.addGenre = function () {
        var genres = [];
        for (var _i = 0; _i < arguments.length; _i++) {
            genres[_i] = arguments[_i];
        }
        for (var _a = 0, genres_1 = genres; _a < genres_1.length; _a++) {
            var genre = genres_1[_a];
            this.genres.push(genre);
        }
    };
    Film.prototype.genresAsString = function () {
        return this.genres.join(' ');
    };
    Film.nextId = 0;
    return Film;
}());
var FilmItemComponent = /** @class */ (function () {
    function FilmItemComponent() {
        this.filmDetails = new Film('The Dark Knight', 'With the help of allies Lt. Jim Gordon (Gary Oldman) and DA Harvey Dent (Aaron Eckhart), Batman (Christian Bale) has been able to keep a tight lid on crime in Gotham City. But when a vile young criminal calling himself the Joker (Heath Ledger) suddenly throws the town into chaos, the caped Crusader begins to tread a fine line between heroism and vigilantism.', 9.99, 5);
        this.filmDetails.addGenre('Superhero, ', 'Noir, ', 'Drama, ', 'Crime, ', 'and Thriller');
    }
    FilmItemComponent = __decorate([
        core_1.Component({
            selector: 'filmItemComponent',
            templateUrl: 'film-item.html',
            styleUrls: ['film-item.css']
        }),
        __metadata("design:paramtypes", [])
    ], FilmItemComponent);
    return FilmItemComponent;
}());
var AppModule = /** @class */ (function () {
    function AppModule() {
    }
    AppModule = __decorate([
        core_2.NgModule({
            imports: [platform_browser_1.BrowserModule],
            declarations: [FilmItemComponent],
            bootstrap: [FilmItemComponent]
        })
    ], AppModule);
    return AppModule;
}());
exports.AppModule = AppModule;
platform_browser_dynamic_1.platformBrowserDynamic().bootstrapModule(AppModule);
//# sourceMappingURL=main.js.map
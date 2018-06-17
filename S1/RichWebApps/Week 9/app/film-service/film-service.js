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
var Film = /** @class */ (function () {
    function Film(id, title, blurb, price, score, genres) {
        this.id = id;
        this.title = title;
        this.blurb = blurb;
        this.price = price;
        this.score = score;
        this.genres = genres;
    }
    return Film;
}());
exports.Film = Film;
var FilmService = /** @class */ (function () {
    function FilmService() {
        this.films = [
            new Film(0, 'Spectre', 'Bond is back in a frantic battle against his classic foe and his white cat', 8.99, 4.9, ['action', 'spy']),
            new Film(1, 'The Hateful Eight', 'Classic Quentin Tarantino sensory indulgence in the wild west', 7.59, 3.8, ['western', 'action']),
            new Film(2, 'Paddington', 'Furry fun and frosty fridge adventures for all the family', 5.50, 4.2, ['children', 'humour']),
            new Film(3, 'Jaws', 'Blood-curdling shark fest that spooked a generation', 3.55, 4.1, ['drama', 'shark']),
            new Film(4, 'Star Wars', 'A long time ago in a galaxy far far away, etc etc etc ...', 8.99, 4.9, ['action', 'spy']),
            new Film(5, 'The Hunger Games', 'Post apocalyptic action adventure, reality TV with a macabre twist', 9.99, 4.5, ['action', 'teen']),
            new Film(6, 'The Martian', 'One man\'s determination to survive on the red planet', 7.99, 3.9, ['drama', 'space']),
            new Film(7, 'Minions', 'Three unlikely minion heroes out to save Minionkind', 6.25, 3.1, ['children', 'animation']),
            new Film(8, 'Love Actually', 'Heart-warming yarn of love found and lost at Christmastime', 5.99, 5.0, ['romcom', 'chickflick']),
        ];
    }
    FilmService.prototype.getFilms = function () {
        return this.films;
    };
    FilmService.prototype.getFilmById = function (id) {
        return this.films[id];
    };
    FilmService = __decorate([
        core_1.Injectable(),
        __metadata("design:paramtypes", [])
    ], FilmService);
    return FilmService;
}());
exports.FilmService = FilmService;
//# sourceMappingURL=film-service.js.map
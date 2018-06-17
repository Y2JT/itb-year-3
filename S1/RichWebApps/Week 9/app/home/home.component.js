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
var film_service_1 = require("../film-service/film-service");
var HomeComponent = /** @class */ (function () {
    function HomeComponent(filmService) {
        this.films = [];
        //let filmService = new FilmService();
        this.films = filmService.getFilms();
    }
    HomeComponent = __decorate([
        core_1.Component({
            moduleId: module.id,
            selector: 'osl-application',
            templateUrl: 'home.component.html',
            providers: [film_service_1.FilmService]
        }),
        __metadata("design:paramtypes", [film_service_1.FilmService])
    ], HomeComponent);
    return HomeComponent;
}());
exports.default = HomeComponent;
//# sourceMappingURL=home.component.js.map
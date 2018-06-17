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
// Implement FilmItemComponent here.
var core_1 = require("@angular/core");
var film_service_1 = require("../film-service/film-service");
var router_1 = require("@angular/router");
var FilmItemComponent = /** @class */ (function () {
    function FilmItemComponent(filmService, route) {
        this.filmService = filmService;
        this.route = route;
    }
    FilmItemComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.subscriberParams = this.route.params.subscribe(function (params) {
            var id = +params['id']; // (+) converts string 'id' to a number
            _this.film = _this.filmService.getFilmById(id);
        });
        this.imageUrl = '/images/' + this.film.id + '.jpg';
        this.num = this.film.score;
    };
    FilmItemComponent.prototype.ngOnDestroy = function () {
        this.subscriberParams.unsubscribe();
    };
    __decorate([
        core_1.Input(),
        __metadata("design:type", film_service_1.Film)
    ], FilmItemComponent.prototype, "film", void 0);
    __decorate([
        core_1.Input('score'),
        __metadata("design:type", Number)
    ], FilmItemComponent.prototype, "score", void 0);
    FilmItemComponent = __decorate([
        core_1.Component({
            moduleId: module.id,
            selector: 'osl-film-item',
            templateUrl: 'film-item.component.html',
            providers: [film_service_1.FilmService]
        }),
        __metadata("design:paramtypes", [film_service_1.FilmService, router_1.ActivatedRoute])
    ], FilmItemComponent);
    return FilmItemComponent;
}());
exports.default = FilmItemComponent;
//# sourceMappingURL=film-item.component.js.map
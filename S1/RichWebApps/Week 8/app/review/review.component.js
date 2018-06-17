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
var core_1 = require('@angular/core');
var core_2 = require('@angular/core');
var ReviewTrackerService_1 = require('../logger/ReviewTrackerService');
var Review = (function () {
    function Review(rv) {
        this.rv = rv;
    }
    Review.prototype.addReview = function (rv) {
        this.rev = this.rv;
    };
    return Review;
}());
exports.Review = Review;
var ReviewComponent = (function () {
    function ReviewComponent(loggerService) {
        this.loggerService = loggerService;
        this.reviews = [];
        this.counter = 0;
        this.textValue = "start value";
        this.log = '';
        this.message = "Enter review comment";
    }
    ReviewComponent.prototype.addReview = function (value) {
        this.reviews.push(value);
        this.counter++;
        this.log = '' + this.counter;
        this.message = "Enter review comment";
        this.showReviews();
    };
    ReviewComponent.prototype.showReviews = function () {
        for (var i = 0; i < this.reviews.length; i++) {
            this.loggerService.log('Recent Review: ' + this.reviews[i]);
        }
    };
    ReviewComponent = __decorate([
        core_1.Component({
            moduleId: module.id,
            selector: 'osl-review',
            templateUrl: 'review.component.html',
            providers: [ReviewTrackerService_1.ReviewTrackerService]
        }),
        core_2.Injectable(), 
        __metadata('design:paramtypes', [ReviewTrackerService_1.ReviewTrackerService])
    ], ReviewComponent);
    return ReviewComponent;
}());
Object.defineProperty(exports, "__esModule", { value: true });
exports.default = ReviewComponent;
//# sourceMappingURL=review.component.js.map
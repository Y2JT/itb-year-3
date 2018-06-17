import {Component} from '@angular/core';
import {Film} from '../film-service/film-service';
import {NgForm} from '@angular/forms';
import {Injectable} from '@angular/core';
import {ReviewTrackerService} from '../logger/ReviewTrackerService';

export class Review{
	public rev: String;
	constructor(public rv: string){}
	
	addReview(rv: string){
		this.rev = this.rv;
	}
}

@Component({
	moduleId:	module.id,
	selector:	'osl-review',
	templateUrl: 	'review.component.html',
	providers: [ReviewTrackerService]
})

@Injectable()
export default class ReviewComponent{
	film: Film;
	public reviews: string[] = [];
	public counter: number = 0;
	textValue = "start value";
	public log: string = '';
	public message: string = "Enter review comment";
	
	constructor(private loggerService: ReviewTrackerService){}
	
	addReview(value: string): void{
		this.reviews.push(value);
		this.counter++;
		this.log = '' + this.counter;
		this.message = "Enter review comment";
		this.showReviews();
	}
	
	showReviews(){
		for(var i = 0; i < this.reviews.length; i++){
			this.loggerService.log('Recent Review: ' + this.reviews[i]);
		}
	}
}
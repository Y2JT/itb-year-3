// Implement FilmItemComponent here.
import {Component, Input, OnInit} from '@angular/core';
import {Film} from '../film-service/film-service';

@Component({
	moduleId:	module.id,
	selector:	'osl-film-item',
	templateUrl: 'film-item.component.html',
})

export default class FilmItemComponent implements OnInit{
	@Input() film: Film;
	@Input('score') score: number;
	num: number;
	imageUrl: string;
	
	ngOnInit(){
		this.imageUrl = '/images/' + this.film.id + '.jpg'
		this.num = this.film.score;
	}
}
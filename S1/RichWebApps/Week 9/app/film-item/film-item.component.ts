// Implement FilmItemComponent here.
import {Component, Input, OnInit, OnDestroy} from '@angular/core';
import {Film, FilmService} from '../film-service/film-service';
import {ActivatedRoute} from '@angular/router';

@Component({
	moduleId:	module.id,
	selector:	'osl-film-item',
	templateUrl: 'film-item.component.html',
	 providers:   [FilmService]
})

export default class FilmItemComponent implements OnInit, OnDestroy  {
	@Input() film: Film;
	@Input('score') score: number;
	
	num: number;
	imageUrl: string;
	
	subscriberParams: any;
    subscriberData: any;

    constructor(private filmService: FilmService, private route: ActivatedRoute) {}
	ngOnInit(){

		this.subscriberParams = this.route.params.subscribe(params => {
            let id: number = + params['id'];   // (+) converts string 'id' to a number
            this.film = this.filmService.getFilmById(id);
        });

		this.imageUrl = '/images/' + this.film.id + '.jpg'
		this.num = this.film.score;
	}
	ngOnDestroy() {
        this.subscriberParams.unsubscribe();
    }
}
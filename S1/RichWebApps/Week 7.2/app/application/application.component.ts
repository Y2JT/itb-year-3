import {Component} from '@angular/core';
import {Film, FilmService} from '../film-service/film-service';

@Component({
    moduleId:     module.id,
    selector:    'osl-application', 
    templateUrl: 'application.component.html'
})
export default class ApplicationComponent {
	films: Array<Film> = [];
	
	constructor(){
		let filmService = new FilmService();
		this.films = filmService.getFilms();
	}

}
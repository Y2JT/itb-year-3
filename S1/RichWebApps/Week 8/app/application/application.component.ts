import {Component} from '@angular/core';
import {Film, FilmService} from '../film-service/film-service';
import {FormsModule} from '@angular/forms';

@Component({
    moduleId:     module.id,
    selector:    'osl-application', 
    templateUrl: 'application.component.html'
	providers: [FilmService]
})

export default class ApplicationComponent {
	films: Array<Film> = [];
	
	constructor(filmService : FilmService){
		let filmService = new FilmService();
		this.films = filmService.getFilms();
	}

}
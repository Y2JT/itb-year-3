// Implement MenuBarComponent here.
import {Component} from '@angular/core';
import {Film, FilmService} from '../film-service/film-service';
@Component({
    moduleId:     module.id,
    templateUrl: 'details.component.html',
    providers: [FilmService]
})
export default class FilmDetailsComponent {}
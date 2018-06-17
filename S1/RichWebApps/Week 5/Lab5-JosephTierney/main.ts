import {Component}              from '@angular/core';
import {NgModule}               from '@angular/core';
import {BrowserModule}          from '@angular/platform-browser';
import {platformBrowserDynamic} from '@angular/platform-browser-dynamic';

// Film model class - this Film class is already complete.
class Film {

    private static nextId: number = 0;
    public id: number;
    public genres: string[] = [];
  
    constructor(
        public title: string,
        public blurb: string,
        public price: number,
        public score: number) { 
            this.id = Film.nextId++;
    }
  
    addGenre(...genres: string[]) : void {
        for (let genre of genres) {
            this.genres.push(genre);
        }
    }
  
    genresAsString() : string {
        return this.genres.join(' ');
    } 
}

@Component({
    selector: 'filmItemComponent',
    templateUrl: 'film-item.html',
	styleUrls: ['film-item.css']
})
class FilmItemComponent {
	filmDetails: Film;
	constructor(){
		this.filmDetails = new Film('The Dark Knight', 'With the help of allies Lt. Jim Gordon (Gary Oldman) and DA Harvey Dent (Aaron Eckhart), Batman (Christian Bale) has been able to keep a tight lid on crime in Gotham City. But when a vile young criminal calling himself the Joker (Heath Ledger) suddenly throws the town into chaos, the caped Crusader begins to tread a fine line between heroism and vigilantism.', 9.99, 5);
		this.filmDetails.addGenre('Superhero, ', 'Noir, ', 'Drama, ', 'Crime, ', 'and Thriller');
	}
}

@NgModule({
    imports: [BrowserModule],
    declarations: [FilmItemComponent],
    bootstrap: [FilmItemComponent]
})

export class AppModule {}

platformBrowserDynamic().bootstrapModule(AppModule);
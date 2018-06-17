import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import ApplicationComponent from './application/application.component';
import MenuBarComponent from './menubar/menubar.component';
import FooterComponent from './footer/footer.component';
import FilmItemComponent from './film-item/film-item.component';
import ScoreComponent from './score/score.component'

@NgModule({
    imports: [BrowserModule],
    declarations: [ApplicationComponent, MenuBarComponent, FooterComponent, FilmItemComponent, ScoreComponent],
    bootstrap: [ApplicationComponent]
})
export default class AppModule {}



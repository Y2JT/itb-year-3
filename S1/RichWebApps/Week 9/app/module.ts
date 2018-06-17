import {NgModule} from '@angular/core';
import {FormsModule} from '@angular/forms';
import {RouterModule} from '@angular/router';
import {BrowserModule} from '@angular/platform-browser';

import ApplicationComponent from './application/application.component';
import MenuBarComponent from './menubar/menubar.component';
import FooterComponent from './footer/footer.component';
import FilmItemComponent from './film-item/film-item.component';
import ScoreComponent from './score/score.component';
import ReviewComponent from './review/review.component';
import HomeComponent from './home/home.component';
import AboutComponent from './about/about.component';
import ContactComponent from './contact/contact.component';
import ServiceComponent from './service/service.component';
import FilmDetailsComponent from './details/details.component';

@NgModule({
    imports: [BrowserModule, 
    RouterModule.forRoot([
            { path: '', component: HomeComponent },
            { path: 'films/:id', component:FilmItemComponent },
            { path: 'about', component: AboutComponent },
            { path: 'contact', component: ContactComponent },
            { path: 'service', component: ServiceComponent},
            { path: 'details', component: FilmDetailsComponent}
        ])
    ],
    declarations: [ApplicationComponent, MenuBarComponent, FooterComponent, FilmItemComponent, ScoreComponent, ReviewComponent, AboutComponent, 
        ContactComponent, ServiceComponent, HomeComponent, FilmDetailsComponent],
    bootstrap: [ApplicationComponent]
})
export default class AppModule {}
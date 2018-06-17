var Film = /** @class */ (function () {
    function Film(filmID, filmTitle, filmSyn, filmPrice, filmGenre, filmScore) {
        this.filmID = filmID;
        this.filmTitle = filmTitle;
        this.filmSyn = filmSyn;
        this.filmPrice = filmPrice;
        this.filmGenre = filmGenre;
        this.filmScore = filmScore;
    } //end constructor
    Film.prototype.setfilmID = function (id) {
        this.filmID = id;
    }; //end setfilmID
    Film.prototype.getfilmID = function () {
        return this.filmID;
    }; //end getfilmID
    Film.prototype.setfilmTitle = function (title) {
        this.filmTitle = title;
    }; //end setfilmTitle
    Film.prototype.getfilmTitle = function () {
        return this.filmTitle;
    }; //end getfilmTitle
    Film.prototype.setfilmSyn = function (syn) {
        this.filmSyn = syn;
    }; //end setfilmSyn
    Film.prototype.getfilmSyn = function () {
        return this.filmSyn;
    }; //end getfilmSyn
    Film.prototype.setfilmPrice = function (price) {
        this.filmPrice = price;
    }; //end setfilmPrice
    Film.prototype.getfilmPrice = function () {
        return this.filmPrice;
    }; //end getfilmPrice
    Film.prototype.setfilmGenre = function (genre) {
        this.filmGenre = genre;
    }; //end setfilmGenre
    Film.prototype.getfilmGenre = function () {
        return this.filmGenre;
    }; //end getfilmGenre
    Film.prototype.setfilmScore = function (score) {
        this.filmScore = score;
    }; //end setfilmScore
    Film.prototype.getfilmScore = function () {
        return this.filmScore;
    }; //end getfilmScore
    Film.prototype.toString = function () {
        return "Film Details:\n" + "ID: " + this.filmID + "\nTitle: " + this.filmTitle + "\nSynopsis: " + this.filmSyn + "\nPrice: " + this.filmPrice + "\nGenre: " + this.filmGenre + "\nScore: " + this.filmScore;
    }; //end toString
    return Film;
}()); //end class
var f1 = new Film(1, "The Dark Knight", "With the help of allies Lt. Jim Gordon (Gary Oldman) and DA Harvey Dent (Aaron Eckhart), Batman (Christian Bale) has been able to keep a tight lid on crime in Gotham City. But when a vile young criminal calling himself the Joker (Heath Ledger) suddenly throws the town into chaos, the caped Crusader begins to tread a fine line between heroism and vigilantism.", 19, "Superhero", 10);
console.log(f1.toString());
//# sourceMappingURL=film.js.map
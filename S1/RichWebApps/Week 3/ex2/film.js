var Film = /** @class */ (function () {
    function Film(filmID, filmTitle, filmSyn, filmPrice, filmGenre, filmScore) {
        this.addGenre = "";
        this.counter = 1;
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
    Film.prototype.addGenres = function () {
        var newGenre = [];
        for (var _i = 0; _i < arguments.length; _i++) {
            newGenre[_i] = arguments[_i];
        }
        for (var i = 0; i < newGenre.length; i++) {
            this.addGenre += ", " + newGenre[i];
        } //end for
    }; //end addGenre
    Film.prototype.genreAsString = function () {
        return this.filmGenre = this.filmGenre + this.addGenre;
    }; //end genreAsString
    Film.prototype.rate = function (newScore) {
        this.filmScore = this.filmScore + newScore;
        this.counter++;
    }; //end rate
    Film.prototype.averageScore = function () {
        return this.filmScore / this.counter;
    }; //end averageScore
    Film.prototype.toString = function () {
        return "Film Details:\n" + "ID: " + this.filmID + "\nTitle: " + this.filmTitle + "\nSynopsis: " + this.filmSyn + "\nPrice: " + this.filmPrice + "\nGenre: " + this.filmGenre + "\nScore: " + this.filmScore + "\n\nAverage Score: " + this.averageScore();
    }; //end toString
    return Film;
}()); //end class
var f1 = new Film(1, "The Dark Knight", "With the help of allies Lt. Jim Gordon (Gary Oldman) and DA Harvey Dent (Aaron Eckhart), Batman (Christian Bale) has been able to keep a tight lid on crime in Gotham City. But when a vile young criminal calling himself the Joker (Heath Ledger) suddenly throws the town into chaos, the caped Crusader begins to tread a fine line between heroism and vigilantism.", 19, "Superhero", 5);
var f2 = new Film(2, "Batman v Superman: Dawn of Justice", "Batman fights Superman in a battle for Gotham and the World. Meanwhile, a greater evil approaches.", 10, "Superhero", 2);
console.log(f1.toString());
console.log(f2.toString());
f1.addGenres("Crime", "Detective");
f1.genreAsString();
f2.addGenres("Dark", "Action");
f1.rate(2);
f2.rate(3);
console.log(f1.toString());
console.log(f2.toString());
f1.rate(5);
f2.rate(1);
//# sourceMappingURL=film.js.map
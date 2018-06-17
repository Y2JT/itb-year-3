var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Review = /** @class */ (function () {
    function Review(filmScore) {
        if (filmScore === void 0) { filmScore = 0; }
        this.filmScore = filmScore;
    } //end constructor
    Review.prototype.getfilmScore = function () {
        return this.filmScore;
    }; //end getfilmScore
    Review.prototype.setfilmScore = function (score) {
        this.filmScore = score;
    }; //end setfilmScore
    Review.prototype.toString = function () {
        return "\nReview: \nFilm Score: " + this.filmScore;
    }; //end toString
    return Review;
}()); //end Review class
var BriefReview = /** @class */ (function (_super) {
    __extends(BriefReview, _super);
    function BriefReview(filmScore, bReview) {
        var _this = _super.call(this, filmScore) || this;
        _this.bReview = "I really liked this movie";
        _this.bReview = bReview;
        return _this;
    } //end constructor
    BriefReview.prototype.toString = function () {
        return _super.prototype.toString.call(this) + "\nBreif Review: " + this.bReview;
    }; //end toString
    return BriefReview;
}(Review)); //end BriefReview class
var CriticalReview = /** @class */ (function (_super) {
    __extends(CriticalReview, _super);
    function CriticalReview(filmScore, companyName, cReview) {
        var _this = _super.call(this, filmScore) || this;
        _this.companyName = companyName;
        _this.cReview = cReview;
        return _this;
    } //end constructor
    CriticalReview.prototype.toString = function () {
        return _super.prototype.toString.call(this) + "\nCompany: " + this.companyName + "\nCritical Review: " + this.cReview;
    }; //end toString
    return CriticalReview;
}(Review)); //end CriticalReview class
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
    Film.prototype.review = function () {
        var rev = [];
        for (var _i = 0; _i < arguments.length; _i++) {
            rev[_i] = arguments[_i];
        }
        for (var i = 0; i < rev.length; i++) {
            console.log(rev[i].toString());
        } //end for
    }; //end review
    Film.prototype.averageScore = function () {
        var rev = [];
        for (var _i = 0; _i < arguments.length; _i++) {
            rev[_i] = arguments[_i];
        }
        var avg = 0;
        var count = 0;
        for (var i = 0; i < rev.length; i++) {
            avg += rev[i].getfilmScore();
            count++;
        } //end for
        return avg / count;
    }; //end averageScore
    Film.prototype.reviewAsString = function () {
        var rev = [];
        for (var _i = 0; _i < arguments.length; _i++) {
            rev[_i] = arguments[_i];
        }
        var reviewString = "";
        for (var i = 0; i < rev.length; i++) {
            reviewString += rev[i].toString() + "\n";
        } //end for
        return reviewString;
    }; //end reviewAsString
    Film.prototype.toString = function () {
        return "Film Details:\n" + "ID: " + this.filmID + "\nTitle: " + this.filmTitle + "\nSynopsis: " + this.filmSyn + "\nPrice: " + this.filmPrice + "\nGenre: " + this.filmGenre + "\nScore: " + this.filmScore;
    }; //end toString
    return Film;
}()); //end class
var f1 = new Film(1, "The Dark Knight", "With the help of allies Lt. Jim Gordon (Gary Oldman) and DA Harvey Dent (Aaron Eckhart), Batman (Christian Bale) has been able to keep a tight lid on crime in Gotham City. But when a vile young criminal calling himself the Joker (Heath Ledger) suddenly throws the town into chaos, the caped Crusader begins to tread a fine line between heroism and vigilantism.", 19, "Superhero", 5);
var rev;
var cRev = new CriticalReview(5, "Empire", "The hero is a billionaire industrialist who likes to beat people up. The only good cop in the city employs " +
    "dishonest ones. The psychotic terrorist torturing civilians and chopping up criminals… Well, he’s just about the most charismatic character you’ll ever meet." +
    "Welcome to Gotham, where no good deed goes unpunished. And welcome to The Dark Knight, an anarchic, malevolent fury of a movie that takes a switchblade to the " +
    "face of summer conformity and carves a work of twisted beauty out of it." + "Anticipation and escalation were the key words in the build up to, post-Indy," +
    "2008’s most hyped and combustible blockbuster. Director/co-writer Christopher Nolan has talked of making a bigger, bolder picture, unfettered by the" +
    "origin-construction constraints of the still-excellent Batman Begins. The marketing has been masterful: a lesson in tease and please from 42 Entertainment " +
    "(earning what must surely be the only mention of a movie’s PR firm in an Empire review; whatever, they deserve it). Then, just as the Sturm und Drang around " +
    "The Dark Knight built to a frenzy came the January death of Heath Ledger. Peeks at his performance as the Clown Prince Of Crime had already prompted whispers " +
    "of an Oscar, of the birth of an icon.");
var bRev = new BriefReview(4, "This move was really good");
rev = [cRev, bRev];
console.log(f1.toString());
console.log(bRev.toString());
console.log(cRev.toString());
console.log("\nAverage Score: " + f1.averageScore(rev[0], rev[1]));
//# sourceMappingURL=film.js.map
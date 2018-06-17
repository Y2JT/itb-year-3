abstract class Review{
	private filmScore: number;

	constructor(filmScore: number = 0){
		this.filmScore = filmScore;
	}//end constructor
	
	getfilmScore(): number{
		return this.filmScore;
	}//end getfilmScore
	
	setfilmScore(score: number): void{
		this.filmScore = score;
	}//end setfilmScore
	
	toString(): string{
		return "\nReview: \nFilm Score: " + this.filmScore;
	}//end toString
}//end Review class

class BriefReview extends Review{
	private bReview: string = "I really liked this movie";
	
	constructor(filmScore: number, bReview: string){
		super(filmScore);
		this.bReview = bReview;
	}//end constructor
	
	toString(): string{
		return super.toString() + "\nBreif Review: " + this.bReview;
	}//end toString
	
}//end BriefReview class

class CriticalReview extends Review{
	private companyName: string;
	private cReview: string;
	
	constructor(filmScore: number, companyName: string, cReview: string){
		super(filmScore);
		this.companyName = companyName;
		this.cReview = cReview;
	}//end constructor
	
	toString(): string{
		return super.toString() + "\nCompany: " + this.companyName + "\nCritical Review: " + this.cReview;
	}//end toString
}//end CriticalReview class

class Film{
	private filmID: number;
	private filmTitle: string;
	private filmSyn: string;
	private filmPrice: number;
	private filmGenre: string;
	private filmScore: number;
	private addGenre: string = "";
	private counter: number = 1;

	constructor(filmID: number, filmTitle: string, filmSyn: string, filmPrice: number, filmGenre: string, filmScore: number){
		this.filmID = filmID;
		this.filmTitle = filmTitle;
		this.filmSyn = filmSyn;
		this.filmPrice = filmPrice;
		this.filmGenre = filmGenre;
		this.filmScore = filmScore;
	}//end constructor

	setfilmID(id: number): void {
		this.filmID = id;
	}//end setfilmID

	getfilmID(): number {
		return this.filmID;
	}//end getfilmID

	setfilmTitle(title: string): void {
		this.filmTitle = title;
	}//end setfilmTitle

	getfilmTitle(): string {
		return this.filmTitle;
	}//end getfilmTitle

	setfilmSyn(syn: string): void {
		this.filmSyn = syn;
	}//end setfilmSyn

	getfilmSyn(): string {
		return this.filmSyn;
	}//end getfilmSyn

	setfilmPrice(price: number): void {
		this.filmPrice = price;
	}//end setfilmPrice

	getfilmPrice(): number {
		return this.filmPrice;
	}//end getfilmPrice

	setfilmGenre(genre: string) {
		this.filmGenre = genre;
	}//end setfilmGenre

	getfilmGenre(): string {
		return this.filmGenre;
	}//end getfilmGenre

	setfilmScore(score: number): void {
		this.filmScore = score;
	}//end setfilmScore

	getfilmScore(): number {
		return this.filmScore;
	}//end getfilmScore
	
	addGenres(...newGenre: string[]){
		for(var i = 0; i < newGenre.length; i++){
			this.addGenre += ", " + newGenre[i];
		}//end for
	}//end addGenre
	
	genreAsString(): string{
		return this.filmGenre = this.filmGenre + this.addGenre;
	}//end genreAsString
	
	review(...rev: Review[]){
		for(var i = 0;i<rev.length; i++){
			console.log(rev[i].toString());
		}//end for
	}//end review
	
	averageScore(...rev: Review[]): number{
		var avg: number = 0;
		var count: number = 0;
		for(var i =0; i<rev.length; i++){
			avg += rev[i].getfilmScore();
			count++;
		}//end for
		return avg/count;
	}//end averageScore
	
	reviewAsString(...rev: Review[]): string{
		var reviewString: string = "";
		
		for(var i = 0; i<rev.length;i++){
			reviewString += rev[i].toString() + "\n";
		}//end for
		return reviewString;
	}//end reviewAsString

	toString(): string{
		return "Film Details:\n" + "ID: " + this.filmID + "\nTitle: " + this.filmTitle + "\nSynopsis: " + this.filmSyn + "\nPrice: " + this.filmPrice + "\nGenre: " + this.filmGenre + "\nScore: " + this.filmScore;
	}//end toString
}//end class

var f1 = new Film(1,"The Dark Knight","With the help of allies Lt. Jim Gordon (Gary Oldman) and DA Harvey Dent (Aaron Eckhart), Batman (Christian Bale) has been able to keep a tight lid on crime in Gotham City. But when a vile young criminal calling himself the Joker (Heath Ledger) suddenly throws the town into chaos, the caped Crusader begins to tread a fine line between heroism and vigilantism.",19,"Superhero",5);
var rev: Review[];
var cRev = new CriticalReview(5,"Empire","The hero is a billionaire industrialist who likes to beat people up. The only good cop in the city employs " +
"dishonest ones. The psychotic terrorist torturing civilians and chopping up criminals… Well, he’s just about the most charismatic character you’ll ever meet." + 
"Welcome to Gotham, where no good deed goes unpunished. And welcome to The Dark Knight, an anarchic, malevolent fury of a movie that takes a switchblade to the " +
 "face of summer conformity and carves a work of twisted beauty out of it." + "Anticipation and escalation were the key words in the build up to, post-Indy," +
 "2008’s most hyped and combustible blockbuster. Director/co-writer Christopher Nolan has talked of making a bigger, bolder picture, unfettered by the" + 
 "origin-construction constraints of the still-excellent Batman Begins. The marketing has been masterful: a lesson in tease and please from 42 Entertainment " +
 "(earning what must surely be the only mention of a movie’s PR firm in an Empire review; whatever, they deserve it). Then, just as the Sturm und Drang around " + 
 "The Dark Knight built to a frenzy came the January death of Heath Ledger. Peeks at his performance as the Clown Prince Of Crime had already prompted whispers " + 
 "of an Oscar, of the birth of an icon.");
var bRev = new BriefReview(4,"This move was really good");
rev = [cRev, bRev];
console.log(f1.toString());
console.log(bRev.toString());
console.log(cRev.toString());
console.log("\nAverage Score: " + f1.averageScore(rev[0], rev[1]));
class Film{
	private filmID: number;
	private filmTitle: string;
	private filmSyn: string;
	private filmPrice: number;
	private filmGenre: string;
	private filmScore: number;

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

	toString(): string{
		return "Film Details:\n" + "ID: " + this.filmID + "\nTitle: " + this.filmTitle + "\nSynopsis: " + this.filmSyn + "\nPrice: " + this.filmPrice + "\nGenre: " + this.filmGenre + "\nScore: " + this.filmScore;
	}//end toString
}//end class

var f1 = new Film(1,"The Dark Knight","With the help of allies Lt. Jim Gordon (Gary Oldman) and DA Harvey Dent (Aaron Eckhart), Batman (Christian Bale) has been able to keep a tight lid on crime in Gotham City. But when a vile young criminal calling himself the Joker (Heath Ledger) suddenly throws the town into chaos, the caped Crusader begins to tread a fine line between heroism and vigilantism.",19,"Superhero",10);
console.log(f1.toString());
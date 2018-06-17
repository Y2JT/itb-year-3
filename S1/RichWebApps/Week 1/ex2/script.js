window.onload = initForm;

function initForm() {
	document.getElementById("country").selectedIndex = 0;
	document.getElementById("country").onchange = populateCity;
}

function populateCity() {
	var countryCity = [
	["Dublin", "Cork", "Kerry", "Meath", "Donegal"],
	["London", "Liverpool","Manchester","Newcastle","Leeds"],
	["Berlin", "Hamburg","Munich","Frankfurt","Dortmund"],
	["Paris", "Nantes","Marseille","Lyon","Nice"],
	["Barcelona", "Madrid","Valencia","Las Palmas","Pamplona"]
	];
	
	var countryStr = this.options[this.selectedIndex].value;
	
	if (countryStr != "") {
		var theCountry = parseInt(countryStr);
					
		document.getElementById("city").options.length = 0;
		for(var i=0; i<countryCity[theCountry].length; i++) {
			document.getElementById("city").options[i] = new Option(countryCity[theCountry][i]);
		}
	}
}

window.onload = initImages;

function initImages() {
	for (var i=0; i<document.images.length; i++) {
		document.images[i].ondblclick = newWindow;
	}
	
}

function newWindow() {	
	var imgName = "images/" + this.id + ".jpg";
	
	var Syn = this.id + ".html";
	
	var imgWindow = window.open(Syn, "imgWin", "scrollbars=no");
	
}
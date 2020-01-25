var changepic = function(){
	var list = document.getElementById('seasonlistid'); //get the list of seasons by id
	var selected = list.options[list.selectedIndex]; //get currently selected list element
	var image = document.getElementById('season'); //get season image id

	//change img src value based on selected element value
	switch(selected.value){
		case 'winter':
			image.src = '../pictures/winter.jpg'
			break;
		case 'spring':
			image.src = '../pictures/spring.jpg'
			break;
		case 'summer':
			image.src = '../pictures/summer.jpg'
			break;
		case 'fall':
			image.src = '../pictures/fall.jpg'
			break;
		default:
			image.src = '../pictures/winter.jpg'
	}
}

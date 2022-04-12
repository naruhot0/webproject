const checkBox = document.querySelector('#agree');
let agree = false;
checkBox.addEventListener('click', () => {
    if(agree) agree  = false;
	else      agree  = true;
});

function isAgree() {
	if(!agree) alert("Please check agree box, if you really want to cancel your membership.");
	return agree;
}
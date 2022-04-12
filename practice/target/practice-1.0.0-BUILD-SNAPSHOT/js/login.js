function isLoginValidForm(formName) {
	if (!(isValidID(document.forms[formName]["id"].value))) {
		document.forms[formName]["id"].focus();
		return false;
	}
	else if (!(isValidPass(document.forms[formName]["curpwd"].value))) {
		document.forms[formName]["curpwd"].focus();
		return false;
	}
	return true;

}


function isValidID(id) {
	if (id == "") { alert("ID must be filled out"); return false; }
	return true;
}

function isValidPass(pass) {
	if (pass == "") { alert("PASSWORD must be filled out"); return false; }
	return true;

}


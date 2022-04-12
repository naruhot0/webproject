function isValidUpdateForm(formName) {
	if (!(isValidID(document.forms[formName]["id"].value))) {
		document.forms[formName]["id"].focus();
		return false;
	}
	else if (!(isValidCurPass(document.forms[formName]["curpwd"].value))) {
		document.forms[formName]["curpwd"].focus();
		return false;
	}

	else if (!(isValidNewPass(document.forms[formName]["newpwd"].value))) {
		document.forms[formName]["newpwd"].focus();
		return false;
	}
	else if (!(isValidNewRePass(document.forms[formName]["newpwd"].value, document.forms[formName]["newrepwd"].value))) {
		document.forms[formName]["newrepwd"].focus();
		return false;
	}
	else if (!(isValidName(document.forms[formName]["name"].value))) {
		document.forms[formName]["name"].focus();
		return false;
	}
	else if (!(isValidEmail(document.forms[formName]["email"].value))) {
		document.forms[formName]["email"].focus();
		return false;
	}
	else if (!(isValidPhone(document.forms[formName]["phone"].value))) {
		document.forms[formName]["phone"].focus();
		return false;
	}
	return true;

}



function isValidID(id) {
	if (id == "") { alert("ID must be filled out"); return false; }
	return true;
}

function isValidCurPass(pwd) {
	if (pwd == "") { alert("PASSWORD must be filled out"); return false; }
	return true;
}


function isValidNewPass(newpwd) {
	if (newpwd == "") { alert("NEW PASSWORD must be filled out"); return false; }
	return true;

}

function isValidNewRePass(newpwd, newrepwd) {
	if (newrepwd == "") { alert("NEW PASSWORD REWRITE must be filled out"); return false; }
	else if(newpwd != newrepwd) {
		alert("NEW PASSWORD REWRITE does not match NEW PASSWORD"); return false;
	}
	return true;
}


function isValidName(name) {
	if (name == "") { alert("NAME must be filled out"); return false; }
	return true;
}

function isValidEmail(email) {
	if (email == "") { alert("EMAIL must be filled out"); return false; }
	else if (!(/^[A-Za-z0-9\-\_\.]+\@[A-Za-z0-9\-]+(\.[A-Za-z]{2,3}){1,2}$/g.test(email))) {
		alert("EMAIL mismatch regex!");
		return false;
	}
	return true;
}

function isValidPhone(phone) {
	if (phone == "") { alert("PHONE must be filled out"); return false; }
	else if (!(/^\d{2,3}-\d{3,4}-\d{4}$/g.test(phone))) {
		alert("PHONE mismatch regex!");
		return false;
	}
	return true;
}
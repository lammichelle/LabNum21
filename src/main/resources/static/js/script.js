/**
 * 
 */

function validateInfo() {
	// obtain the textbox value
	var fname = document.getElementById("firstname").value;
	var lname = document.getElementById("lastname").value;
	
	
	// check the length
	if (fname.length <= 2) {
		alert("please enter a longer firstname!");
		document.getElementById("firstname").focus(); // this line is optional adds a focus to the text box
		return false;
	} else if (lname.length <= 2) {
		alert("please enter a longer lastname!");
		document.getElementById("lastname").focus(); // this line is optional
		return false;
	} 
}

var check = function() {
	  if (document.getElementById('password').value ==
	    document.getElementById('confirmPassword').value) {
	    document.getElementById('message').style.color = 'green';
	    document.getElementById('message').innerHTML = 'matching';
	  } else {
	    document.getElementById('message').style.color = 'red';
	    document.getElementById('message').innerHTML = 'not matching';
	  }
	}
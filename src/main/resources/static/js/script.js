/**
 * 
 */
function validateForm() {
    var x = document.forms["regForm"]["firstName"].value;

    if (x == "") {
        alert("Please fill out all requirements.");
        return false;
    }
    
    
    

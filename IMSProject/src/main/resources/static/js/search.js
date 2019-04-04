
searchItems
document.addEventListener("DOMContentLoaded", function() {
	const addItemButton = document.querySelector('#findItems');
	addItemButton.addEventListener('click',searchItems)
});

function searchItems(){
    const barcode = document.querySelector('#info_input').value
	const xhr = new XMLHttpRequest()
		xhr.onreadystatechange = function () {
			if (xhr.readyState === 4 && xhr.status === 200) {
				console.log(xhr);
				console.log(barcode);
			}
		}

    xhr.open('GET', '/searchBy/'+ "{" + barcode + "}", true)
    xhr.send()

}
/*
function take_values() {
    const n = document.forms["myForm"]["info_input"].value;

    if (n==null || n==""){
        alert("Please enter User Name");
        return false;
    }else{
        const http = new XMLHttpRequest();
        http.open("GET", "http://localhost:8080/item/find", true);
        http.setRequestHeader("Content-type","application/x-www-form-urlencoded");
        const params = "search=" + n; // probably use document.getElementById(...).value
        http.send(params);
        http.onload = function() {
            alert(http.responseText);
        }
    }




}
*/
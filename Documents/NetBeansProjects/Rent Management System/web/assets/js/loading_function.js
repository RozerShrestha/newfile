function room1RenteeInformation() {
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function () {
        if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
            document.getElementById("content").innerHTML = xmlhttp.responseText;
        }
    }
    xmlhttp.open("GET", "renteeFolder/room1RenteeInformation.jsp", true);
    xmlhttp.send();
}

function room1PaymentInformation() {
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function () {
        if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
            document.getElementById("content").innerHTML = xmlhttp.responseText;
        }
    }
    xmlhttp.open("GET", "renteeFolder/room1PaymentInformation.jsp", true);
    xmlhttp.send();
    }
    
function addRecordRentee() {
        var xmlhttp = new XMLHttpRequest();
        xmlhttp.onreadystatechange = function () {
            if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
                document.getElementById("content").innerHTML = xmlhttp.responseText;
            }
        }
        xmlhttp.open("GET", "renteeFolder/saveRecord.jsp", true);
        xmlhttp.send();
}

function calculateTotal(){
var cost = parseFloat(document.getElementById(`cost`).value;
var quantity = parseInt(document.getElementById(`quntity`).value;

var total = cost * quantity;
document.getElementById('total').value = total.toFixed(2);

}
/**
 * 
 */

<!-document.write("자바스크립트 기동");->
function calc() {
	/* var x = document.getElementById("x").value;
	var y = document.getElementById("y").value;
	
	var sum = parseInt(x) + parseInt(y);
	//합계의 자리에 값부여
	document.getElementById("sum").value = sum; */
	//frm(formName)
	var firstNum = parseInt(document.frm.firstNum.value);
	var secondNum = parseInt(document.frm.secondNum.value);
	document.frm.sum.value = firstNum + secondNum;
}
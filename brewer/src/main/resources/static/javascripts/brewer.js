$(function() {
	//define a máscara que será exibida na view.
	//Configura a exibição de números decimais.
	var decimal = $('.js-decimal');
	decimal.maskMoney({decimal: ',', thousands: '.'});
	
	//Configura a exibição de números inteiros.
	var plain = $('.js-plain');
	plain.maskMoney({precision: 0, thousands: '.'});
})
programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{ //escreva("Olá Mundo")
		real peso, altura, imc 
		
		escreva("Informe seu Peso: ")
		leia(peso)
		escreva("Informe seu altura: ")
		leia(altura)

		imc = peso / (altura*altura)

		
		se ( imc<=16) {escreva("desnutrição grau II")}
		senao se ( imc<=17) {escreva("desnutrição grau I")}
		senao se ( imc<=18) {escreva("magresa")}
		senao se ( imc<=25) {escreva("saudável")}
		senao se ( imc<=30) {escreva("sobrepeso")}
		senao se( imc<=35) {escreva("obesidade grau I")}
		senao se ( imc<=40) {escreva("obesidade grau II")}

	
 

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 10; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
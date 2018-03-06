package tudinho;

public class Sttrings {
	public static void main(String[] args){
		String str="isso é uma string";
		String xyz = new String ("isso é uma string");
		
		if (str == xyz) System.out.println("IGUAL");
		else System.out.println("DIFERENTE");
		
		if(str.equals(xyz)){
			//Maneira correta de se comparar strings
		}
		
		System.out.println("Tamanho da String:" + str.length());
		System.out.println("SubString" + str.substring(0, 10));
		System.out.println("Caracter na posiçao 5" + str.charAt(5));
		
		String str2 = "Isto é uma String do Java";
		// o método split quebra a String em varias outras,
		// pelo separador desejado
		String[] palavras = str2.split(" ");
		
		int i = str2.indexOf("uma"); //retorna o indice da palavra na string
		
		if(str.startsWith("olá") || str.endsWith("Mundo!")){
		//testa no começo e no fim da string 	
		}
		str2 = str2.trim();//elimina os espaços em branco no inicioe no fim
		str =str.replace('a','@'); //substitui os caracteres
		
		//substitui uma palavra (usa expressoes regulares)
		str2 = str2.replace("String", "Cadeia de caracteres");
		
	}
}

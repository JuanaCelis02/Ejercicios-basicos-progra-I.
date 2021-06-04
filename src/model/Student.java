package model;

import view.IoManager;

public class Student {
	
	public static final int NUM_ITER = 4;
	private String name;
	
	public Student() {
	}
	public Student(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean multipleOf (int numberOne, int numberTwo){
		if ((numberOne%numberTwo)==0) {
			return true;
		}else {
			return false;
		}
	}	
	
	public String getTableMultiply(int number, int start, int lastNumber) {
		int result;
		String resultKeeper = "";
		for(int i = start; i <= lastNumber; i++) {
			result = number * i;
			resultKeeper += (number + " * " + i + " = "+ result) + '\n';
		}	
		return resultKeeper;	
	}	
	public boolean validatePrimeNumber(int number) {
		int count = 2;
		boolean question = true;
		while((number > count)&&(question))
			if(this.multipleOf(number, count))
				question = false;
			else
				count++;
		return question;
	}
	public int showNumberOfFigures(int number){
		int denominator = 10;
		int count = 0;
		int zero = 0;
		do {
			number = number / denominator;
			count++;
		}while(number != zero);
		return count;
	}
	
	public String showFibonacciseries(int number){
		String resultKeeper = "";
		int firstNum = 0;
		int secondNum = 1;
		for (int i = 1; i <= number; i++) {
			firstNum = secondNum + firstNum;
			secondNum = firstNum - secondNum;
			resultKeeper += secondNum + ",";
		}
		return resultKeeper.substring(0,resultKeeper.length()-1 );
	}
	public int sumFibonacciseries(int number){
		
		int resultKeeper = 0;
		int firstNum = 0;
		int secondNum = 1;
		for (int i = 1; i <= number; i++) {
			if(validatePrimeNumber(firstNum)) {
			firstNum = secondNum + firstNum;
			secondNum = firstNum - secondNum;
			resultKeeper += firstNum;	
			}
		}
		return resultKeeper;
	}
	/*public String devolverPalabraCincoVocales(String word) {
		String todasLasVocales = "";
		String palabraDos = "";
		int count = 0;
		for(int i = 0; i < word.length(); i ++) {
			if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
				palabraDos += word.charAt(i);
			}
			for(int j = 0; j < palabraDos.length(); j++) {
				if((palabraDos.charAt(j) == 'a') ||(palabraDos.charAt(j) == 'e')||(palabraDos.charAt(j) == 'i')||
						(palabraDos.charAt(j) == 'o')||(palabraDos.charAt(j) == 'u')) {
					count ++;
					
				}
			}
			if(count != 0) {
				todasLasVocales += palabraDos.charAt(j);
			}
		}
		return todasLasVocales;
	}*/
	
	public String sumFibonacciseriesImparyPrimo(int number){
		String resultKeeper = "";
		int firstNum = 0;
		int secondNum = 1;
		for (int i = 1; i <= number; i++) {
			firstNum = secondNum + firstNum;
			secondNum = firstNum - secondNum;
			if(secondNum%2 != 0 || validatePrimeNumber(secondNum)) 
			resultKeeper += secondNum + " ";
			
		}
		return resultKeeper;
	}
	public String mySubstring(String cadena, int comienzo, int termina) {
		String nuevaCad = "";
		for(int i = comienzo; i <=termina;i++) {
			if(i == comienzo || i <= termina) {
				nuevaCad += cadena.charAt(i);
			}
		}
		return nuevaCad;
	}
	
	public String generateAscii() {
		String ascii = " ";
		int count = 0;
		for (int i = 32; i <= 183; i++) {
			ascii += (char) (i) + " = " + i + "     ";
			count++; 
			if (count == 20) {
				ascii += "\n";
				count = 0;
			}
		}
		return ascii;
	}
	public float miExponente(double number,int pow) {
		float result = 1;
		for (int i = 1; i<=pow; i++) 
			result = (float) (result * number);	
		return result;
	}
	
	public float calculateFactorial(int number) {
		float factorial = 1;
		while ( number!=0) {
			factorial = factorial*number;
			number--;	
		}
		return factorial;
	}
	public int countLetter(String word, char caracter) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			if(word.charAt(i)== caracter){
				count ++;
			}
		}
		return count;
	}
	public int convertNumberStringToNumericValue(String numberString) {
		char caracter;
		int number = 0;
		int x = 0;
		int count = 0;
		for(int i = numberString.length()-1; i >= 0; i--) {
			caracter = numberString.charAt(i);
			x = caracter - 48;
			number += x*(int)miExponente(10,count);
			count++;
		}
		return number;
	}	
	public double convertNumberStringToNumericDouble(String numberString) {
		double number = 99999;
		int count = 0;
		for(int i = 0; i < numberString.length();i++) {
			if(numberString.charAt(i)== '.')
				count++;
		}
		if(count < 2) {
			number = Double.parseDouble(numberString);
		}
		return number;
	}	
	public int getRandomBetweenRange(int min, int max) {
		int x = (int)((Math.random()*((max-min)+1))+min);
		return x;
	}
	
	public String aleatories(int min,int max,int num) {
		String out = "";
		for(int i = 0;i<num;i++) 
			out+= this.getRandomBetweenRange(min, max) + ",";
		return out;
	}
	public double convertGradToRad(double angle) {
		double radianes;
		radianes = (angle * Math.PI)/180;
		return radianes;
	}
	public double calculateSinFunction(double angle) {
		int iter = Student.NUM_ITER;
		return this.calculateSinFunction(angle,iter);
	}
	public double calculateSinFunction(double angle, int iter) {
		double summation = 0; 
		for(int i = 0; i < iter;i++)
			summation += (this.miExponente(-1, i) * this.miExponente(this.convertGradToRad(angle), 2*i+1))
					/this.calculateFactorial(2*i+1);
		
		return summation;
	}
	
	public String removeSpaces(String word) {
		String withoutSpace = "";
		for (int i = 0; i < word.length(); i++) 
			if(word.charAt(i) != 32)
				withoutSpace += word.charAt(i);	
		return withoutSpace;
	}
	/*public String convertDecimalToBinOrHex(int number, char binOrHex) {
		int residuo = 0;
		String numberConvert = "";
		switch(binOrHex) {
		case('b'):
			while(number > 0) {
				residuo = number%2;
				numberConvert = residuo+numberConvert;
				number = number/2;
			}	
		case('h'):
			while(number > 0) {
				residuo = number%16;
				number = number/16;
				if(residuo >= 10) {
					this.convertNumToChar(residuo);
					numberConvert = letter + numberConvert;
				}
				else
					numberConvert = number+numberConvert;
			}
		}
		return numberConvert;
	}*/
	public char convertNumToChar(int number) {
		char letter = 32;
		switch (number) {
		case (10):
			letter = 'A';
			break;
		case(11):
			letter = 'B';
		case (12):
			letter = 'C';
			break;
		case(13):
			letter = 'D';
		case (14):
			letter = 'E';
			break;
		case(15):
			letter = 'H';
		case(16):
			number = 'I';
		}
		return letter;
	}
	public int mostrarPosicionCadena(String word, char caracter) { 				
		int position = -1;															
		for (int i = 0; i < word.length(); i++) 
			if(word.charAt(i)== caracter) 					
				position = i;
		return position;
	}
	
	public boolean determinarPalindromo(String palabra) {
	
		int inicio = 0;
		int fin = this.removeSpaces(palabra).length()-1;
		boolean palindromo = true;
		while(inicio < fin) {
			if(this.removeSpaces(palabra).charAt(inicio) != this.removeSpaces(palabra).charAt(fin)) {
				palindromo = false;
			}
			inicio++;
			fin--;
		}
		return palindromo;
		
	}
	public int countConsonants(String phrase) {
		int count = 0;
		for(int i = 0; i < phrase.length(); i++) {
			if(phrase.charAt(i) != 'a' && phrase.charAt(i) != 'e' && phrase.charAt(i) != 'i'&& 
					phrase.charAt(i) != 'o' && phrase.charAt(i) != 'u') {
				count++;
			}
		}
		return count;
	}
	public void guessNumberGame() {
		IoManager io;
		io = new IoManager();
		int aleatorieNumber = (int) ((Math.random() * 100)+1);
		int i = 0;
		int number = 0;
		boolean won = false;
		while(i < 10 && !won) {
			number = io.readGraphicInt("Ingrese numero entre 1 y 100");
			if(number > aleatorieNumber) 
				io.showGraphicMessage("El numero es menor que "+ number);
			else if(number < aleatorieNumber) 
				io.showGraphicMessage("El numero es mayor que "+number);
			else {
				io.showGraphicMessage("GANO");
					won = true;
			}
			i++;
		}
		if(i == 10) 
			io.showGraphicMessage("Perdio");
	}
	public char showCharOfPosition(int index, String word) {
		int i = 0;
		while(i != index) {
			i++;
		}
		return word.charAt(i);
	}	
	public int mayorNumero (String numbers) {
		int iMayor = 0;
		for(int i = 0; i < numbers.length();i++) {
			if(numbers.charAt(i)> numbers.charAt(iMayor))
				iMayor = i;
				
		}
		return numbers.charAt(iMayor);
	}
	
}
		
		
	
	


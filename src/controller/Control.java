package controller;

import model.Student;
import view.IoManager;

public class Control {
IoManager io;
	
	public Control() {
        io = new IoManager();
    }
	
	public void init() {
		Student student = new Student();
		student.setName(io.readGraphicString("Ingrese su nombre"));
		io.showGraphicMessage(""+student.multipleOf(io.readGraphicShort("Ingrese el primer numero"), io.readGraphicShort("Ingrese el segundo numero")));
		io.showGraphicMessage(student.getTableMultiply(io.readGraphicShort("Ingrese numero a multiplicar"), io.readGraphicShort("¿Desde donde?"), io.readGraphicShort("¿Hasta donde?")));
		io.showGraphicMessage(""+student.validatePrimeNumber(io.readGraphicShort("Ingrese el numero que quiera validar si es primo")));
		io.showGraphicMessage(student.generateAscii());
		io.showGraphicMessage(""+student.showNumberOfFigures(io.readGraphicInt("Ingrese numero para calcular sus digitos")));
		io.showGraphicMessage(student.showFibonacciseries(io.readGraphicInt("Cuantos numeros quiere que tenga la serie?")));
		//io.showGraphicMessage(""+student.myMathPointPow(io.readGraphicInt("Ingrese numero"), io.readGraphicInt("ingrese potencia")));
		io.showGraphicMessage(""+student.calculateFactorial(io.readGraphicInt("Ingrese numero para calcular factorial")));
		io.showGraphicMessage(""+student.countLetter(io.readGraphicString("Ingrese palabra"), 'b'));
		io.showGraphicMessage(""+student.convertNumberStringToNumericValue(io.readGraphicString("Ingrese numero para pasar a int")));
		io.showGraphicMessage(""+student.getRandomBetweenRange(1, 100));
		io.showGraphicMessage(""+student.aleatories(io.readGraphicInt("Inicio rango"), io.readGraphicInt("Final rango"), io.readGraphicInt("Cantidad valores")));
		io.showGraphicMessage(""+student.convertGradToRad(io.readGraphicInt("Ingrese grados para pasar a radianes")));
		io.showGraphicMessage(""+student.calculateSinFunction(io.readGraphicDouble("Ingrese grados"), io.readGraphicInt("Ingrese numero iteraciones")));
		//io.showGraphicMessage(""+student.convertDecimalToBinOrHex(io.readGraphicInt("Ingrese numero para convertir"),'b'));
		student.guessNumberGame();
		io.showGraphicMessage(""+student.mostrarPosicionCadena(io.readGraphicString("Ingrese palabra o frase"),'a'));
		io.showGraphicMessage(""+student.removeSpaces(io.readGraphicString("Ingrese frase")));
		io.showGraphicMessage(""+student.determinarPalindromo(io.readGraphicString("Ingrese frase")));
		io.showGraphicMessage(""+student.countConsonants(io.readGraphicString("ingresefrase")));
		io.showGraphicMessage(""+student.showCharOfPosition(4, "Arcoiris"));
		io.showGraphicMessage(""+student.mayorNumero("12345"));
		io.showGraphicMessage(""+student.sumFibonacciseries(10));
		io.showGraphicMessage(""+student.convertNumberStringToNumericDouble("-25.6.9"));
		io.showGraphicMessage(""+student.sumFibonacciseriesImparyPrimo(10));
		io.showGraphicMessage(""+student.sumFibonacciseries(4));
		//io.showGraphicMessage(""+student.devolverPalabraCincoVocales("casa murcielago"));
		
	}
}

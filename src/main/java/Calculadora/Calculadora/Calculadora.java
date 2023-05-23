package Calculadora.Calculadora;

/**
 * @author Fernando
 *
 */

/**
 * La clase "Calculadora" contiene métodos para operaciones aritméticas básicas
 * y comparación de dos
 * números, así como un método para reiniciar la calculadora.
 */
public class Calculadora {

	// Estas son variables de instancia privadas de la clase `Calculadora` que se
	// utilizan
	// para almacenar el resultado de
	// la última operación realizada y el tipo de operación realizada
	// respectivamente. Se puede acceder a ellas
	// a través de los métodos públicos getter `getLastResult()` y `getLastOp()`.
	private float lastResult;
	private String lastOp;

	/**
	 * La función devuelve el último resultado como un float.
	 * 
	 * @return El método `getLastResult` devuelve un valor `float`, que es el valor
	 *         de la variable
	 *         `lastResult` variable.
	 */
	public float getLastResult() {
		return this.lastResult;
	}

	/**
	 * Esta función Java devuelve la última operación realizada.
	 * 
	 * @return El método `getLastOp()` devuelve un valor `String` que es el valor de
	 *         la instancia
	 *         variable `lastOp`.
	 */
	public String getLastOp() {
		return this.lastOp;
	}

	/**
	 * La función toma dos operandos float, los suma, almacena el resultado y el
	 * tipo de operación, y
	 * devuelve el resultado.
	 * 
	 * @param op1 El primer operando de la operación de suma.
	 * @param op2 op2 es el segundo operando o número que se sumará al primer
	 *            operando (op1) para realizar la operación de suma.
	 * @return El método devuelve la suma de dos números float (op1 y op2).
	 */
	public float suma(float op1, float op2) {
		float result = op1 + op2;
		this.lastResult = result;
		this.lastOp = "Suma";
		return result;
	}

	/**
	 * La función "resta" resta dos números float y almacena el resultado y el
	 * tipo de operación en variables de clase
	 * 
	 * @param op1 El primer operando de la operación de resta.
	 * @param op2 op2 es el segundo operando o número que se está restando del
	 *            primer operando (op1)
	 * @return El método `resta` devuelve un valor `float` que es el resultado de
	 *         restar `op2
	 *         de `op1`.
	 */
	public float resta(float op1, float op2) {
		float result = op1 - op2;
		this.lastResult = result;
		this.lastOp = "Resta";
		return result;
	}

	/**
	 * La función multiplica dos números float y almacena el resultado y la
	 * operación en variables de clase.
	 * 
	 * @param op1 El primer operando de la operación de multiplicación, que es un
	 *            tipo de dato float.
	 * @param op2 op2 es el segundo operando que se multiplicará con el primer
	 *            operando (op1) para
	 *            calcular el resultado.
	 * @return El método devuelve el resultado de multiplicar dos números float (op1
	 *         y op2).
	 */
	public float multiplica(float op1, float op2) {
		float result = op1 * op2;
		this.lastResult = result;
		this.lastOp = "Multiplica";
		return result;
	}

	/**
	 * La función "divideix" divide dos números flotantes, almacena el resultado y
	 * operación en variables de clase
	 * , y devuelve el resultado.
	 * 
	 * @param op1 El primer operando de la operación de división.
	 * @param op2 op2 es el segundo operando o divisor en la operación de división.
	 *            Es el número por el que op1
	 *            está siendo dividido.
	 * @return El método devuelve un valor float que es el resultado de dividir
	 *         op1 por op2.
	 */
	public float divideix(float op1, float op2) {
		float result = op1 / op2;
		this.lastResult = result;
		this.lastOp = "Divideix";
		return result;
	}

	/**
	 * La función devuelve verdadero si el primer operando es mayor que el segundo
	 * operando, en caso contrario
	 * devuelve false.
	 * 
	 * @param op1 Un valor float que representa el primer operando.
	 * @param op2 El segundo operando o valor que se compara en el método mayorQue.
	 * @return Se devuelve un valor booleano, verdadero o falso.
	 */
	public boolean majorQue(float op1, float op2) {
		if (op1 > op2) {
			return true;
		}
		return false;
	}

/**
 * La función "restablecer" restablece los valores de "lastResult" y "lastOp" a sus valores por defecto.
 */
	public void restablecer() {
		this.lastResult = 0;
		this.lastOp = "Ninguna";
	}
}

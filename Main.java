import java.util.Arrays;

public class Inicio {

	public static void main(String[] args) {
		/*@Author Ncontreras
		 * Algoritmo de ordenamiento metodo de Burbuja
		 * 
		 */
		int maxSize = 100;            // array 
		ArrayBurbuja arr;                // referencia al array
		arr = new ArrayBurbuja(maxSize);  // creacion del  array de hasta 100 elementos
		arr.insert(101);           //insercion de N elementos dentro del  Array
		arr.insert(72);
		arr.insert(3);
		arr.insert(5);
		arr.insert(334);
		arr.insert(513);
		arr.insert(773);
		arr.insert(577);
		arr.insert(745);
		arr.insert(11);
		arr.insert(13);
		arr.insert(99);
		arr.insert(177);
		arr.insert(88);
		arr.insert(77);
		arr.insert(21);
		arr.insert(34);
		arr.inset(113);
		arr.insert(47);
		arr.insert(24);
		arr.insert(1);
		arr.insert(57);
		arr.insert(36);
		arr.insert(27);
		arr.insert(31);
		arr.insert(155);
		System.out.println("Array Completo"); //muestra en pantalla el Array sin ordenar
		arr.mostrar();
		System.out.println("array Ordenado por metodo Burbuja"); //muestra en pantalla el array ordenado
		arr.burbujeo();
		arr.mostrar();
		
		
	}

}









































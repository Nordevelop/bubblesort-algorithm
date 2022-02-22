ublic class ArrayBurbuja {
	
		/*
		*Author Nordevelop
		*/
	        private long[] a; //objetos encapsulado con acceso denegado en la clase Main()
		private int nElementos;  // variable entera que se dezplazara por el array
		
		public ArrayBurbuja(int max){ //clase constructor
		a = new long[max];
		nElementos = 0;       // inicializacion de la variable que se desplaza x el array
		}
	        /*
		* Metodos 
		*/
		public void insert(long value){	 // metodo que agrega elementos dentro del  array (a)
		a[nElementos] = value;	 // inserta elemento
		nElementos++; 	 // incrementa
		}
		
		public void mostrar(){	 // mostrar contenido del array 
			for(int j=0; j<nElementos; j++){   	
		            System.out.print(a[j] + " ");        
			    System.out.println(" ");
			} // end for(j)
		}
		public void burbuja(){ 
		int salida, entrada;
		for(salida=nElementos-1; salida>1; salida--) //  (Hacia atras)
		   for(entrada=0; entrada<salida; entrada++) //  (Hacia Adelante)
			if( a[entrada] > a[entrada+1] ) 
		intercambio(entrada, entrada+1);
		 //no se cierra con llaves los cliclos for
		//solo tiene una instruccion	
		 // Intercambio
		} // Fin Metodo burbuja()
	
		private void intercambio(int uno, int dos){ //metodo de intercambio
		long aux = a[uno];
		a[uno] = a[dos];
		a[dos] = aux;
		}
		

}


















































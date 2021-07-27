ublic class ArrayBurbuja {
	
		private long[] a; 
		private int nElementos;  // variable elementos del array
		//--------------------------------------------------------------
		public ArrayBurbuja(int max)
		 // constructor
		{
		a = new long[max];
		nElementos = 0;       // inicializacion del array
		}
		//--------------------------------------------------------------
		public void inserccion(long value)
		 // agrega elementos dentro del  array
		{
		a[nElementos] = value;
		 // inserta elemento
		nElementos++;
		 // incrementa
		}
		//--------------------------------------------------------------
		public void mostrar()
		 // mostrar contenido del array 
		{
		for(int j=0; j<nElementos; j++)   	 // for each  ,
		System.out.print(a[j] + " ");        
		System.out.println(" ");
		}
		//--------------------------------------------------------------
		public void burbuja()
		{
		int salida, entrada;
		for(salida=nElementos-1; salida>1; salida--)
		 // bucle exterior (Hacia atras)
		for(entrada=0; entrada<salida; entrada++)
		 // bucle interior (Hacia Adelante)
		if( a[entrada] > a[entrada+1] )
		 // fuera de orden?
		intercambio(entrada, entrada+1);
		 // Intercambio
		} // Fin Metodo burbuja()
		//--------------------------------------------------------------
		private void intercambio(int uno, int dos) //metodo de intercambio
		{
		long aux = a[uno];
		a[uno] = a[dos];
		a[dos] = aux;
		}
		

}


















































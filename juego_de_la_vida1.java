package codigos;  // nombre del paquete que contiene las clases y los codigos //

public class MatrixGenerator {    //nombre de la clase //
  public MatrixGenerator(){}     // nombre del metodo//
	
	
	public int[][] generate(int length) // constructor usado //
	{
		int[][] matrix = new int[length][length];  // se crea una matriz con "n" posiciones //
		
		for(int i = 0; i < length; i++)           /* este ciclo for  
		{                                            se usa para recorrer
			for(int j = 0; j < length; j++)            toda la matriz */
			{
				matrix[i][j] = Math.random() < 0.5 ? 0 : 1;   // esta linea de codigo genera numeros aleatorios enfocados en la teoria de distribucion de bernoulli //
			}
		}
		
		return matrix; // retorna a la matriz //
	}
}

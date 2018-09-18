package mx.com.dalvik;

import mx.com.dalvik.model.GaussianElimination;

public class TestGaussian {
	
	public static void main(String[] args) {
		double [][] matrix = {	{1,1,1,1},
								{1,5,25,125},
								{1,20,400,8000},
								{1,40,1600,64000}};
		
		double [] vector = {56.5,113,181,214.5};
		
		
		
		
		
		
		GaussianElimination gauss = new GaussianElimination();
		double [] solve = gauss.solve(matrix, vector);
		
		System.out.println("\n\nVector solution:");
		for( int i = 0; i< solve.length; i++ )
			System.out.println( solve[ i ] );
		
	}
}

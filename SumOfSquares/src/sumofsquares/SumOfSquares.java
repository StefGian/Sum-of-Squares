package sumofsquares;

import java.util.Scanner;

/**
 *
 * @author stefa
 */
public class SumOfSquares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		
		// Define an array of integers of size N. 
		int[] numArray = new int[N];		
		

		int sum = 0;
		for(int i=0; i<N; i++){
			numArray[i] = s.nextInt(); // Get the input
		}
	    
	    // Write the logic to add these numbers here:
	    for(int i=0; i<N; i++){
	        sum = sum + (numArray[i]*numArray[i]);
	    }
	    
	    
	    
		// Print the sum
		System.out.print(sum);
		s.close();
	}
    }
    


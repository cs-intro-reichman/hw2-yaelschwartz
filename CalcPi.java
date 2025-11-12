// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
    int num = Integer.parseInt(args[0]);

	   System.out.println("pi according to Java: " + Math.PI);
	   
	double sum = 0.0;

	for (int i = 0; i < num; i++) {
		double term = Math.pow (-1, i) / (2 * i + 1);
		sum += term;
    	}
        System.out.println("pi, approximated:     " + sum * 4); 
    }
}

// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) 
	{
	    int seed = Integer.parseInt(args[0]);
        String mode = args[1];
		
		if (mode.equals("v"))
		{
			for (int i = 1; i <= seed; i++) 
			{
				int x = i;
				int steps = 1;
				System.out.print(x + " ");

				while (x != 1) 
				{
					if (x % 2 == 0 ) 
					{
						x = x / 2;
					} else 
					{
						x = x * 3 + 1;
					} System.out.print(x + " ");
					steps++;
				}
			
				System.out.println("(" + steps + ")");
            } 	
		}
			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");	
    }
}
 

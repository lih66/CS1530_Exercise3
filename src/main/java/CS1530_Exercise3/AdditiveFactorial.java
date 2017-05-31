package CS1530_Exercise3;
public class AdditiveFactorial {
	public static int Trig(int num) 
	{
		if(num <= 1) {
			return 1;
		} 
		else 
		{
			return num + Trig(num - 1);
		}
	}
    public static long Lazy(long num) 
    {
    	if(num < 1) 
    	{
    		return 1;
    	} 
    	else 
    	{
    		return num + Lazy(num - 1);
    	}
    }
	public static void main(String[] args) 
	{
 		if(args.length == 0) 
 		{
 			System.out.println("Enter something buddy");
 			System.exit(1);
		 } 
	 	else 
 		{		 
 			String name = args[0];
 			String one = "triangle";
 			String two = "lazy";
 			
 			if(name.equals(one) || name.equals(two))
 			{
 				//OKAY
 			}
			else
			{
 				System.out.println("First arugment is incorrect!");
 				System.exit(1);
 			}
 		
 			//***********
 			if(args[1] != null && Integer.parseInt(args[1]) > 0)
 			{
 				if(name.equals(one))
 	 			{
 					try {
 	 					 int x = Trig(Integer.parseInt(args[1]));
 	 					 System.out.println("Tri(" + args[1] + ") = " + x);
 	 					 } catch (NumberFormatException ex) {
 	 					 System.out.println("Second arugment is not an integer!");
 	 					 System.exit(2); 
 	 					 }
 	 			}
 	 			else
 	 			{
 	 				try {
	 					long y = Lazy(Long.parseLong(args[1]));
	 					System.out.println("Lazy(" + args[1] + ") = " + y);
	 			  	  	} catch (NumberFormatException ex) {
	 					System.out.println("Enter an integer!");
	 					System.exit(1);
	 			  	  }
 	 			}	
 	 		}
 	 		else
 	 		{
 	 			System.out.println("Second argument should be a positive integer!");
 	 			System.exit(2);
 	 		}
 	 	}
 	}
}
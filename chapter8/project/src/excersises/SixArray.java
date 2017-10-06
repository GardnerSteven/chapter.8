package excersises;

public class SixArray 
{

	public static void main(String[] args) 
	{
		int numbers [] = {23, 6, 47, 35, 2, 24};
		int total;
		int count;
		
		System.out.println("The numbers you entered are ");
		
		for(int x = 0; x <= numbers.length; ++x)
			total += numbers[count];
			++count;
			System.out.println(numbers[x] + " ");
		if (count != 0)
			System.out.println("\n The average is " + (total * 1)/count);
		else
			System.out.println("You didnt enter any numbers");
			 	}

}

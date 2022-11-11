package oopsconcept;

public class PerfectNumber1to50 {
	public static void main(String[] args) {
		 int i, j, end=50, sum;

		   
		    /* Iterate from 1 to end */
		    for(i=1; i<=end; i++)
		    { 
		        sum = 0;

		        /* Check whether the current number i is Perfect number or not */
		        for(j=1; j<=i/2; j++)
		        {
		            if(i % j == 0)
		            {
		                sum=sum + j;
		            }
		        }
		 
		        /* If the current number i is Perfect number */
		        if(sum == i)
		        {
		          System.out.println(i);
		        }
		    }

	}

}



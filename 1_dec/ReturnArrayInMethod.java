package arrayexamples;

public class ReturnArrayInMethod {

	static int[] getArray() 
	{
		int arr[]=new int[]	{20,90,43,33};
		
		return arr;
}
	public static void main(String args[]) 
	{
		int arr[]=getArray();
		for(int i:arr)
		{
			System.out.println(i);
		}
	}
}
//geting classname of java 
/*Class c=arr.getClass();
System.out.println("class name: "+c);
//convert to string
String name=c.getName();
System.out.println("class name string representation: "+name);
}
}
*/
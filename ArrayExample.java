package array;

public class ArrayExample{
	public static void main(String arg[]) {
		int[]numbers= {1,2,3,4,5};
		System.out.println("First Element:"+numbers[0]);
		System.out.println("second element:"+1);
		
		///print all element
		System.out.println("all element in the array:");
		for(int number:numbers) {
			System.out.println(number);
			{
				System.out.println("array length"+numbers.length);
			}
		}
	}
}

package RecursiveBinarySearch;

public class recursivebinarysearch {
private static int data[] = {1,4,13,5,8,12,10,15,21,19,25,35,30};
	
	public static int recursiveBinarySearch (int d[], int g, int left, int right) {
		int middle = (left + right)/2;
		if (d[middle] != g && left <= right) {
			if (d[middle] > g) 
				return recursiveBinarySearch (d, g, left, middle-1);
			else 
				return recursiveBinarySearch (d, g, middle+1, right);
		}
		if (d[middle] == g) return middle;
		else return -1;
	}
	
	public static void main (String [] args) {
		int goal = 10;
		int result = recursiveBinarySearch(data, goal, 0, data.length-1);
		if (result < 0) System.out.println("The search could not find: " + goal);
		else System.out.println("The goal of " + goal + " was found at index: " + result);
	}
}

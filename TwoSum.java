import java.util.*;
public class TwoSum {
	public static  int[] twosum(int[] nums, int target) throws Exception {
		// TODO Auto-generated method stub
		int len = nums.length;
		for(int i = 0; i< len-1; i++) {
			for(int j = i+1; j < len; j++) {
				if((nums[i] + nums[j]) == target) {

					return new int[]{i,j};
				}
			}
		}
		throw new IllegalArgumentException("No two numbers add up to the target sum.");
	}
	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		System.out.print("Enter array size : ");
		int n = sc.nextInt();
		int nums[] = new int[n];
		System.out.print("Enter the elements in the array : ");
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.print("Enter the target number : ");
		int target = sc.nextInt();
		try {
			int[] result = twosum(nums,target);
			System.out.println("The elements indexes are");
			for(int i = 0; i < 2;i++) {
				System.out.println("Index is : " + result[i]);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}

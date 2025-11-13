package arraydemo;
//demo for multi dimensional array
public class MultiArrayDemo {

	public static void main(String[] args) {
		//declare+initialize
		int arr[][]= {{1,2,3},{4,5,6}};
		//row
		for(int i=0;i<arr.length;i++) {
			//column
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

}

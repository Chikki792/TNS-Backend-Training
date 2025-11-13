package arraydemo;

import java.util.Arrays;

public class SingleArrayDemo {

	public static void main(String[] args) {
		//datatype arrayname=new datatype[size]
		int arr[]=new int[5];
		arr[0]=10;
		arr[1]=23;
		arr[2]=78;
		arr[3]=56;
		arr[4]=67;
		Arrays.sort(arr);
		//for loop
		for(int i=0;i<arr.length;i++) {
			System.out.println("array elements are:"+arr[i]);
		}
		System.out.println("enhanced for loop output");
	//enhanced for loop
	for(int num:arr) {
		System.out.println(num);
	}
	}

}

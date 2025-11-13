package arraydemo;
import java.util.Scanner;
public class UserInputDemo {

	public static void main(String[] args) {
		System.out.println("enter below details");
		Scanner s=new Scanner(System.in);
		System.out.println("enter name:");
		String name=s.nextLine();
		System.out.println("enter no:");
		int num=s.nextInt();
		System.out.println("entered values are"+" "+name+" "+num);
	}

}

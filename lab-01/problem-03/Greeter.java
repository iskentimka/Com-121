import  java.util.*;
public class Greeter{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("What is your name ?");
		String name = sc.nextLine();
		System.out.printf("Hello, %s!\n", name);
	}
}

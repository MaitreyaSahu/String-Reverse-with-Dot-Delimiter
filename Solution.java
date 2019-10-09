import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] array = input.split("\\.");
		for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        
        String output = String.join(".", array);
        System.out.println(output);
		
	}
}

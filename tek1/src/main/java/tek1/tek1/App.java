package tek1.tek1;

import java.util.Random;

public class App 
{
	public static void main( String[] args )
	{

		Bubble bubble = new Bubble();
		Brush brush = new Brush();
		Random random = new Random();

		int razmer = random.nextInt(999);

		int [] array1 = new int[razmer];
		int [] array2 = new int[razmer];


		for (int i =0; i < array1.length;i++){
			//array1[i]= random.nextInt();
			//array1[i]= random.nextInt(99);
			array1[i]= random.nextInt(999);
		}
		for (int i =0; i < array2.length;i++){
			//array2[i]= random.nextInt();
			//array2[i]= random.nextInt(99);
			array2[i]= random.nextInt(999);
		}

		random = null;//
				
		System.out.println("Исходный массив:");
		for (int dig1 : array1){
			System.out.print(dig1 + " ");
		}
		System.out.println();

		array1 = bubble.sortBubble(array1);

		System.out.println("Отсортированный пузырьком массив:");
		for (int dig1 : array1){
			System.out.print(dig1 + " ");
		}
		System.out.println();
		
		//--------------------------------------------

		System.out.println("Исходный массив:");
		for (int dig1 : array2){
			System.out.print(dig1 + " ");
		}
		System.out.println();
		
		array2 = brush.sortBrush(array2);

		System.out.println("Отсортированный расческой массив:");
		for (int dig1 : array2){
			System.out.print(dig1 + " ");
		}
		System.out.println();
	}
}

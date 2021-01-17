/*2.Define a class Queue for representing a Queue data structure.The class must define 
    a default constructor,a parameterized constructor and functions for enqueue,dequeue
    and display operations.Write a java program to inmplement this.
 */


import java.util.Scanner;

public class Queue {
	
	static Scanner sc = new Scanner(System.in);
	static int n, front = -1,rear = -1,item;
	static int[] Ar = new int[10];
	
	Queue() {
		
	}
	
	Queue(int n){
		int ch; 
		do
		{
			System.out.printf("\n---Operations Menu---\n\n1.Enqueue\n2.Dequeue\n3.Exit\n");
			System.out.printf("Enter the choice : ");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				enqueue(n);
				break;
			case 2:
				dequeue();
				break;
			default:
				break;
			}
		}while(ch<3);
	}

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int n;
		
		System.out.println("Enter the size of Queue : ");
		n = sc1.nextInt();
		new Queue(n);
		
		}
	//Function to insert element to Queue
	public static void enqueue(int n)
	{
		if(rear >= n-1)
        {
			System.out.println("\n--Overflow!--\n");
		}
		else 
		{
			if(front == -1 && rear == -1) {
				front++;
			}
			System.out.println("Enter the element to be inserted : ");
			item = sc.nextInt();
			rear++;
			Ar[rear] = item;
		}
		display(rear);
	}
	//Function to delete element in Queue
	public static void dequeue() 
	{
		if(front == -1) 
		{
			System.out.println("\n--Error!Underflow!--\n\n");
		}
		else 
		{
			item = Ar[front];
			System.out.printf("The element deleted is %d \n",item);
			if(front == rear) 
			{
				front = -1;
				rear = -1;
				System.out.printf("--Error!Queue is empty--\n\n");
			}
			else 
			{
				front++;
				display(rear);
			}
		}
	}
	//Function to display elements in Queue
	public static void display(int rear) 
	{
		int i;
		System.out.println("\nThe current Queue is\n");
		for(i = front ; i <= rear ; i++ )
		{
			System.out.printf("%d",Ar[i]);
		}
		System.out.printf("\n");
	}

}
/*---OUTPUT---
  
   Enter the size of Queue : 
	4

	---Operations Menu---

	1.Enqueue
	2.Dequeue
	3.Exit
	Enter the choice : 2

	--Error!Underflow!--



	---Operations Menu---

	1.Enqueue
	2.Dequeue
	3.Exit
	Enter the choice : 1
	Enter the element to be inserted : 
	2

	The current Queue is

	2

	---Operations Menu---

	1.Enqueue
	2.Dequeue
	3.Exit
	Enter the choice : 3
	*/

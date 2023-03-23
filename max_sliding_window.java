import java.util.ArrayDeque;
//import java.util.ArrayList;
//import java.util.Collections;
import java.util.Deque;
//import java.util.PriorityQueue;
import java.util.Scanner;
public class max_sliding_window {
	static void findMaxElement(int[] arr,int n , int k){
		
		Deque<Integer> Qi = new ArrayDeque<Integer>();
		int i ;
		for (i = 0;i<k;i++) {
//			for every element previous small elements are useless
//			so removing them from Qi
			while(!Qi.isEmpty() && arr[i]>=arr[Qi.peekLast()]) 
				Qi.removeLast();
				
			// add new element at rear of queue
			Qi.addLast(i);
		}
		for(;i<n;i++) {
//			the element at the front is the largest element
//			of previous window
			System.out.println(arr[Qi.peek()] + " ");
			
//			Remove elements which are out of this window
			while((!Qi.isEmpty() && Qi.peek()<= i-k))
				Qi.removeFirst();
			
//			add current element at rear of Qi
			
			while(!Qi.isEmpty() && arr[i]>=arr[Qi.peekLast()]) 
				Qi.removeLast();
				
			
			Qi.addLast(i);
			
		}
		System.out.println(arr[Qi.peek()]);
			
	}
	
	public static void main(String [] arr) {
		Scanner sc=new Scanner(System.in); 
		int a= sc.nextInt(); 
		int arrk[] = new int[a];
		for(int i = 0; i<a ;i++) {
			arrk[i] = sc.nextInt();
			
		}
		int b = sc.nextInt();
		findMaxElement(arrk,a,b);
	}

}

import java.util.Scanner;
import java.util.Stack;  
public class stack_with_max {
	public static Stack<Integer> data = new Stack<Integer>();
	public static Stack<Integer> max = new Stack<Integer>();
	
	public static void push(int x) {
		if(max.empty() || x>=max())
			max.push(x);
		data.push(x);
	}
	
	public static void pop() {
		if(data.peek() == max())
			max.pop();
		data.pop();
	}
	
	public static int max() {
		return max.peek();
	}
	
	static public void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		for(int i = 0; i<q ; ++i) {
			String op = sc.next();
			if(op.equals("push"))
			{
				int n = sc.nextInt();
				push(n);
			}
			else if(op.equals("pop"))
				pop();
			else
			{
				System.out.println(max.peek());
			}
				
		}
		
	}
}

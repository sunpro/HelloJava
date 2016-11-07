public class Main{
	public static void main(String[] args){
		Queue qu = new Queue(10);
		qu.push("1");
		qu.push("2");
		qu.push("3");
		System.out.print(qu.toString());
		System.out.print("\n");
		System.out.print(qu.pop());
		qu.pop();
		qu.pop();
		qu.pop();
		System.out.print("\n");
		System.out.print(qu.toString());
	}
}
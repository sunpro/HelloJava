public class Shift{
	public static void main(String[] args){
		//System.out.print("Hello!");
		int[] abc = {1,2,3,4,5,6,7,8,9,0};
		System.out.print(abc[2] + " " + abc[8] + "\n");
		System.arraycopy(abc,2,abc,3,7);
		System.out.print(abc[2] + " " + abc[8] + "\n");
		int abcex = extendSize(s);
	}
	public int[] extendSize(int[] s){
		int[] copy = new int[s.length() + 20];
		System.arraycopy(s,0, copy, 0, s.length());
		return copy;
	}
}
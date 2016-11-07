/**
 *基于String数组的队列，数组第一个为队头，插**入的字符依次加入数组
 */
public class Queue{
	/*
	 *队列容器数组
	 */
	private String[] queueStr;
	/*
	 *队尾指针
	 */
	private int rear;
	/*
	 *队列容器数组的长度
	 */
	private int length = 0;
	
	public Queue(){
		this.rear = -1;
		this.length = 100;
		queueStr = new String[length];
	}
	public Queue(int length){
		this.rear = -1;
		this.length = length;
		queueStr = new String[length];
	}
	
	public void push(String s){
		if(rear < queueStr.length - 1){
			queueStr[++rear] = s;
		}else{
			print("error!\n");
		}
	}
	
	public String pop(){
		if(rear >= 0) {
			String s = queueStr[0];
			System.arraycopy(queueStr,1,queueStr,0,rear + 1);
			rear--;
			return s;
		}else{
			print("pop error!");
			return null;
		}
	}
	
	public String toString(){
		String s = "";
		for(int i = 0; i <= rear; i++){
			s += queueStr[i] + " ";
		}
		return s;
	}
	
	private void print(String s){
		System.out.print(s);
	}
	
}
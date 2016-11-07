/**
 *����String����Ķ��У������һ��Ϊ��ͷ����**����ַ����μ�������
 */
public class Queue{
	/*
	 *������������
	 */
	private String[] queueStr;
	/*
	 *��βָ��
	 */
	private int rear;
	/*
	 *������������ĳ���
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
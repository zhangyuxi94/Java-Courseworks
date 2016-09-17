import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		char[] history=new char[3];
		history[0]='*';
		history[1]='*';
		history[2]='*';
		char index;
		index='1';
		switch(index){
		case '1':
			System.out.println("111");
			break;
		case '2':
			System.out.println("222");
			break;
		default:
			System.out.println("100");
			break;
		}
		System.out.println("xxxx");
//		for(int index=0;index<history.length;index++){
//			history[0]=history[1];
//			history[1]=history[2];
//			history[2]='3';
//			System.out.println(history);
//			
//		}
//        Stack lifo = new Stack();
//
//        for (int i = 1; i <= 10; i++)
//        {
//                lifo.push ( new Integer(i) );
//        }
//
//        // Last in first out means reverse order
//        while ( !lifo.empty() )
//        {
//                System.out.print ( lifo.pop() );
//                System.out.print ( ',' );
//        }
//
//        // Empty, let's lift off!
//        System.out.println (" LIFT-OFF!");

	}

}

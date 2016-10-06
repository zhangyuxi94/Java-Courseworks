import java.io.IOException;

public class TryCatchDemo {
	public void makeError() throws Exception{
//		Exception ex=new Exception("Big time error");
//		ex.printStackTrace();
		throw new Exception("Big time error");
		//create an exception and print it
	}
	public void makeIOError() throws IOException{
		throw new IOException("Disk failure");
	}
	public void dealWithIt(){
		try {
			makeError();
			makeIOError();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		TryCatchDemo et2=new TryCatchDemo();
		et2.dealWithIt();
	}

}

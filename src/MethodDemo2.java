
public class MethodDemo2 {
	static long calcTimeDelta(long startTime, long endTime){
		long delta=endTime-startTime;
		return delta;
	}
	static double calcTimeSecs(long startTime, long endTime){
		long delta=endTime-startTime;
		double secs=((double) delta)/1000.0;
		return secs;
	}
	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		for(int i=0;i<100;i++){
			System.out.println(i);
		}
		long end=System.currentTimeMillis();
		System.out.println("Start time: "+start);
		System.out.println("End time: "+end);
		System.out.println("delta: "+calcTimeDelta(start,end));
		System.out.println("delta: "+calcTimeSecs(start,end)+" seconds");



	}

}

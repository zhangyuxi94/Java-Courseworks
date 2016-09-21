import java.util.Arrays;

public class irregularArray {
	public static void main(String[] args) {
		int[][] busAWeek=new int[7][];
		busAWeek[0]=new int[10];
		busAWeek[1]=new int[10];
		busAWeek[2]=new int[10];
		busAWeek[3]=new int[10];
		busAWeek[4]=new int[10];
		busAWeek[5]=new int[5];
		busAWeek[6]=new int[5];
		for(int i=0;i<5;i++){
			for(int j=0;j<10;j++){
				busAWeek[i][j]=i+j+10;
				System.out.println(busAWeek[i][j]);
			}
			
		}
		System.out.println(busAWeek[1][2]);
	}
}

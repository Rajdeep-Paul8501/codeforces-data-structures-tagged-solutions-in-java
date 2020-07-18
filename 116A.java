import java.util.Scanner;
public class Tram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max=0,cap=0;
		for(int i=0;i<n;i++) {
			int out = sc.nextInt();
			int  in = sc.nextInt();
			cap= cap + in - out;
			if(cap>max) {
				max = cap;
			}
		}
		System.out.println(max);
	    sc.close();
	}
}

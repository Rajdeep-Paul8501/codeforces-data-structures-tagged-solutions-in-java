import java.util.*;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Stack<Character> st = new Stack<>();
		int i=1;
		st.push(s.charAt(0));
		while(i<s.length()){
		    if(st.isEmpty()) st.push(s.charAt(i));
		   else if(st.peek()!=s.charAt(i)) st.push(s.charAt(i));
		    else{
		        st.pop();
		    }
		    i++;
		}
		if(st.isEmpty()) System.out.println("YES");
		else System.out.println("NO");
	}
}

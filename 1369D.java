import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
 
public class SolutionB extends Thread {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
 
    private static final FastReader scanner = new FastReader();
    private static final PrintWriter out = new PrintWriter(System.out);
 
    public static void main(String[] args) {
        new Thread(null, new SolutionB(), "Main", 1 << 26).start();
    }
 
    private static long[] dp;
    public void run() {
        dp = new long[2_000_002];
 
        for (int i = 3; i < dp.length; i++) {
            if (i % 3 == 0) {
                dp[i] += 4;
            }
            dp[i] = (dp[i] + 2 * dp[i-2] + dp[i-1]) % MODULO;
        }
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            solve();
        }
        out.close();
    }
 
    private final static int MODULO = 1_000_000_007;
 
    private static void solve() {
        int n = scanner.nextInt();
        System.out.println(dp[n]);
    }
 
}

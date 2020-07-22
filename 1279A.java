import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Solution
{
    public final static int d = 256; 
    static int MOD = 1000000007;
    static final float EPSILON = (float)0.01; 
    static final double PI = 3.1415926536;
    private static BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
    private static BufferedWriter out = new BufferedWriter (new OutputStreamWriter (System.out));
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
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
    static void searchRabinKarp(String pat, String txt) 
    { 
        int M = pat.length(); 
        int N = txt.length(); 
        int i, j; 
        int p = 0; // hash value for pattern 
        int t = 0; // hash value for txt 
        int h = 1; 
        int q = 3355439;         
        for (i = 0; i < M-1; i++) 
            h = (h*d)%q; 
        for (i = 0; i < M; i++) 
        { 
            p = (d*p + pat.charAt(i))%q; 
            t = (d*t + txt.charAt(i))%q; 
        } 
        for (i = 0; i <= N - M; i++) 
        {     
            if ( p == t ) 
            {                 
                for (j = 0; j < M; j++) 
                { 
                    if (txt.charAt(i+j) != pat.charAt(j)) 
                        break; 
                }                 
                if (j == M) 
                    System.out.println("Pattern found at index " + i); 
            } 
            if ( i < N-M ) 
            { 
                t = (d*(t - txt.charAt(i)*h) + txt.charAt(i+M))%q; 
                if (t < 0) 
                    t = (t + q); 
            } 
        } 
    }
    static long gcd(long bigger , long smaller)
    {
            if (smaller == 0) 
                return bigger; 
            return gcd(smaller, bigger % smaller); 
    }
    static long lcm(long a, long b) 
    { 
        return (a*b)/gcd(a, b); 
    } 
    /*static long sumOfArray(long arr[])
    {
        long sum = 0;
        for(int i = 0 ; i < N ; i++)
            sum += arr[i];
        return sum;
    }*/
    static boolean isPrime(long n) {        
        if (n%2==0)
            return false;          
        for(long i=3;i<=Math.sqrt(n);i+=2) { 
            if(n%i==0) 
                return false; 
        } 
        return true; 
    }
    static long countDigit(long n) 
    { 
        return (long)Math.floor(Math.log10(n) + 1); 
    }
    static long sumOfDigits(long n) 
    { 
        long sum;        
        for (sum = 0; n > 0; sum += n % 10,n /= 10);   
        return sum; 
    }    
    public static void main(String args[])
    {
        FastReader sc = new FastReader();
        int T = sc.nextInt();
        while(T-- > 0)
        {
            /*int N = sc.nextInt();
            int K = sc.nextInt();
            long arr[] = new long[N];
            for(int i = 0 ; i < N ; i++)
                arr[i] = sc.nextLong();
            String str = sc.next();
            solve(str ,arr , N , K);*/
            int R = sc.nextInt();
            int G = sc.nextInt();
            int B = sc.nextInt();
            solve(Long.valueOf(R) , Long.valueOf(G) , Long.valueOf(B));
        }
        try{
            out.flush();
        }catch(Exception e){
            System.out.print("");
        };
    }           
    static void solve(/*String str , long arr[] , int N , int K*/ long R , long G , long B)
    {
        try{
            long max = Long.valueOf(Math.max(Math.max(R,G),B));
            long min = Long.valueOf(Math.min(Math.min(R,G),B));
            long mid = Long.valueOf(R+G+B-max-min);
            if((mid+min+1)  >= max)
                out.write("Yes\n");
            else
                out.write("No\n");
        }catch(Exception e){
            System.out.print("");
        }
    }    
}  
    

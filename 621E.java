import java.util.*;
import java.io.*;
public class MainClass
{
    static long M = (long)(1e9 + 7);
    public static void main(String[] args) throws IOException
    {
        Reader in = new Reader();
        int n = in.nextInt();
        long b = in.nextLong();
        int k = in.nextInt();
        int x = in.nextInt();
        long[][] A = new long[101][101];
        int[] B = new int[n];
        for (int i=0;i<n;i++)   B[i] = in.nextInt();
        for (int i=0;i<=100;i++)
        {
            for (int j=0;j<n;j++)
            {
                A[i][(i * 10 + B[j]) % x]++;
            }
        }
        long[][] v = binPow(A, b);
        System.out.println(v[0][k]);
    }
    public static long[][] mul(long[][] A, long[][] B)
    {
        int n = A.length;
        long[][] C = new long[n][n];
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                for (int k=0;k<n;k++)
                {
                    C[i][j] += (A[i][k] * B[k][j]) % M;
                    C[i][j] %= M;
                }
            }
        }
        return C;
    }
    public static long[][] binPow(long[][] A, long n)
    {
        if (n == 1)
            return A;
        long[][] ans = binPow(A, n / 2);
        ans = mul(ans, ans);
        if (n % 2 == 1)
            ans = mul(ans, A);
        return ans;
    }
}
class Reader
{
    final private int BUFFER_SIZE = 1 << 16;
    private DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;
 
    public Reader()
    {
        din = new DataInputStream(System.in);
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }
 
    public Reader(String file_name) throws IOException
    {
        din = new DataInputStream(new FileInputStream(file_name));
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }
 
    public String readLine() throws IOException
    {
        byte[] buf = new byte[64]; // line length
        int cnt = 0, c;
        while ((c = read()) != -1)
        {
            if (c == '\n')
                break;
            buf[cnt++] = (byte) c;
        }
        return new String(buf, 0, cnt);
    }
 
    public int nextInt() throws IOException
    {
        int ret = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do
        {
            ret = ret * 10 + c - '0';
        }  while ((c = read()) >= '0' && c <= '9');
 
        if (neg)
            return -ret;
        return ret;
    }
 
    public long nextLong() throws IOException
    {
        long ret = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do {
            ret = ret * 10 + c - '0';
        }
        while ((c = read()) >= '0' && c <= '9');
        if (neg)
            return -ret;
        return ret;
    }
 
    public double nextDouble() throws IOException
    {
        double ret = 0, div = 1;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
 
        do {
            ret = ret * 10 + c - '0';
        }
        while ((c = read()) >= '0' && c <= '9');
 
        if (c == '.')
        {
            while ((c = read()) >= '0' && c <= '9')
            {
                ret += (c - '0') / (div *= 10);
            }
        }
 
        if (neg)
            return -ret;
        return ret;
    }
 
    private void fillBuffer() throws IOException
    {
        bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
        if (bytesRead == -1)
            buffer[0] = -1;
    }
 
    private byte read() throws IOException
    {
        if (bufferPointer == bytesRead)
            fillBuffer();
        return buffer[bufferPointer++];
    }
 
    public void close() throws IOException
    {
        if (din == null)
            return;
        din.close();
    }
}

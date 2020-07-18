import java.util.*;
import java.io.*;
public class j3 {
    static int color[];
    static int c=0;
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<Integer>arr[]=new ArrayList[n+1];
        color=new int[n+1];
        for(int i=0;i<=n;i++)
            arr[i]=new ArrayList<Integer>();
 
       for(int i=0;i<m;i++){
            int k=sc.nextInt();
            int tmp[]=new int[k];
 
           int prev=0;
           if(k==0)
               continue;
 
            prev=sc.nextInt();
            for(int j=1;j<k;j++)
            {
                int curr=sc.nextInt();
 
                arr[prev].add(curr);
                arr[curr].add(prev);
 
                prev=curr;
            }
//            for(int j=1;j<k;j++){
//                int x=tmp[j-1];
//                int y=tmp[j];
//             arr[x].add(y);
//             arr[y].add(x);
//            }
 
 
 
        }
 
       int component_size[]=new int[n+1];
       StringBuilder sb=new StringBuilder();
       for(int i=1;i<=n;i++){
           if(color[i]==0){
               c++;
               component_size[c]=dfs(i,arr);
               //System.out.println(component_size[c]);
           }
           sb.append(component_size[color[i]]+" ");
       }
       System.out.println(sb.toString());
 
 
    }
    public static int dfs(int x,ArrayList<Integer>arr[]){
 
        if(color[x]!=0)
            return 0;
 
        color[x]=c;
 
        Iterator<Integer>it =arr[x].listIterator();
        int ans=1;
        while(it.hasNext()){
            int p=it.next();
            ans+=dfs(p,arr);
        }
        return ans;
    }
 
 
    static class FastReader
    {
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
}

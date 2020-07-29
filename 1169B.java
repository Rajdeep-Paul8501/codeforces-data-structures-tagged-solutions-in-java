import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.*; 
import java.util.StringTokenizer;
import java.io.DataInputStream; 
import java.io.FileInputStream;
import java.io.File;
import java.lang.*;
import java.net.*;



  
public class Main
{ 
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
    static class urlReader{
        URL url;
        BufferedReader br; 
        StringTokenizer st; 

        public urlReader(URL url1){
            url = url1;
            try{
            br = new BufferedReader(new InputStreamReader(url.openStream()));
        }
        catch (IOException  e){
            System.out.println("GIVEN URL INVALID: " + url);
        }

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
    

  public static void main(String[] args)throws Exception{
    FastReader f=new FastReader();
    int n=f.nextInt();int count=0;
    int m=f.nextInt();int y1=0;int y2=0;
    int x1=f.nextInt();int x2=f.nextInt();
    
    HashSet<Pair<Integer,Integer>> pairs=new HashSet<Pair<Integer,Integer>>();
   

    for(int i=0;i<m-1;i++){
        int first=f.nextInt();
        int second=f.nextInt();
        Pair<Integer,Integer>p=new Pair<Integer,Integer>(first,second);
        pairs.add(p);
        if(first==x1){
            
            count++;
            continue;
        }
        else if(first==x2){
            
            count++;
            continue;
    
            }
        else if(second==x1){
            
            count++;
            continue;


        }
        else if(second==x2){
            
            count++;
            continue;

        }
        else{
            y1=first;
            y2=second;
            break;

        }



    }
    if(count==m-1){
        System.out.println("YES");
        System.exit(0);
    }
    HashSet<Integer>c1=new HashSet<Integer>();
    HashSet<Integer>c2=new HashSet<Integer>();
    HashSet<Integer>c3=new HashSet<Integer>();
    HashSet<Integer>c4=new HashSet<Integer>();
    System.out.println(x1+" "+x2+" "+y1+" "+y2);
    c1.add(x1);c1.add(y1);
    c2.add(x1);c2.add(y2);
    c3.add(x2);c3.add(y1);
    c4.add(x2);c4.add(y2);
    Iterator<Pair<Integer,Integer>>itr=pairs.iterator();
    while(itr.hasNext()){
        Pair<Integer,Integer> p=itr.next();
        int first=p.getFirst();
        int second=p.getSecond();
        if(c1.contains(first)||c1.contains(second)){
            continue;
        }
         else if(c2.contains(first)||c2.contains(second)){
            continue;
        }
         else if(c3.contains(first)||c3.contains(second)){
            continue;
        }
        else if(c4.contains(first)||c4.contains(second)){
            continue;
        }
        else{
            System.out.println("NO");
            System.exit(0);
        }
    }
    for(int i=0;i<m-count-2;i++){
        int first=f.nextInt();
        int second=f.nextInt();
        if(c1.contains(first)&&c1.contains(second)){
            continue;
        }
         else if(c2.contains(first)&&c2.contains(second)){
            continue;
        }
         else if(c3.contains(first)&&c3.contains(second)){
            continue;
        }
        else if(c4.contains(first)&&c4.contains(second)){
            continue;
        }
        else{
            System.out.println("NO");
            System.exit(0);
        }
    }
    System.out.println("YES");
}
}






    

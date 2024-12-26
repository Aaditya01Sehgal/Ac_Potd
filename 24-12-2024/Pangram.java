import java.util.*;
import java.io.*;

public class Solution {
 
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        char nextChar() {
            return next().charAt(0);
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }

    public static void main(String[] args) {
        try {
            FastReader in=new FastReader();
            FastWriter out=new FastWriter();

            //write your code here

            //for take input
            int n=in.nextInt();
             in.nextLine();
            //for string
            String s=in.nextLine().toLowerCase();
            char ch[]=in.next().toCharArray();
            HashSet<Character> set = new HashSet<>();
            
            for (int i = 0; i<n; i++){
                set.add(s.charAt(i));
            }

            if (set.size() == 26){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            //for multiple testcases
            int testcases=in.nextInt();
            while(testcases-- >0){
                
            }

            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
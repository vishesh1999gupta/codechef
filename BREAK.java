package codechef;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;

public class BREAK {
    static class Print
    {
        private final OutputStream out;
        /*public Print(OutputStream outputStream)
        {
            writer=new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }*/
        public Print()
        {
            this.out=System.out;
        }
        public void print(String str)throws IOException
        {
            //buf=str.getBytes();
            for (int i = 0; i < str.length(); i++)
            {
			/*if (i != 0)
			out.write(' ');*/
                out.write(str.charAt(i));
            }
        }
        public void printLine(String str)throws IOException
        {
            print(str);
            out.write('\n');
        }
        public void close()throws IOException
        {
            out.close();
        }
    }
    static class Scan
    {
        private byte[] buf=new byte[1024];
        private int index;
        private InputStream in;
        private int total;
        public Scan()
        {
            in=System.in;
        }
        public int scan()throws IOException
        {
            if(total<0)
                throw new InputMismatchException();
            if(index>=total)
            {
                index=0;
                total=in.read(buf);
                if(total<=0)
                    return -1;
            }
            return buf[index++];
        }
        public int scanInt()throws IOException
        {
            int integer=0;
            int n=scan();
            while(isWhiteSpace(n))
                n=scan();
            int neg=1;
            if(n=='-')
            {
                neg=-1;
                n=scan();
            }
            while(!isWhiteSpace(n))
            {
                if(n>='0'&&n<='9')
                {
                    integer*=10;
                    integer+=n-'0';
                    n=scan();
                }
                else throw new InputMismatchException();
            }
            return neg*integer;
        }
        public double scanDouble()throws IOException
        {
            double doub=0;
            int n=scan();
            while(isWhiteSpace(n))
                n=scan();
            int neg=1;
            if(n=='-')
            {
                neg=-1;
                n=scan();
            }
            while(!isWhiteSpace(n)&&n!='.')
            {
                if(n>='0'&&n<='9')
                {
                    doub*=10;
                    doub+=n-'0';
                    n=scan();
                }
                else throw new InputMismatchException();
            }
            if(n=='.')
            {
                n=scan();
                double temp=1;
                while(!isWhiteSpace(n))
                {
                    if(n>='0'&&n<='9')
                    {
                        temp/=10;
                        doub+=(n-'0')*temp;
                        n=scan();
                    }
                    else throw new InputMismatchException();
                }
            }
            return doub*neg;
        }
        public String scanString()throws IOException
        {
            StringBuilder sb=new StringBuilder();
            int n=scan();
            while(isWhiteSpace(n))
                n=scan();
            while(!isWhiteSpace(n))
            {
                sb.append((char)n);
                n=scan();
            }
            return sb.toString();
        }
        private boolean isWhiteSpace(int n)
        {
            if(n==' '||n=='\n'||n=='\r'||n=='\t'||n==-1)
                return true;
            return false;
        }
    }
    public static void main(String[] args) throws IOException{
        Scan scn = new Scan();
        Print print=new Print();
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=scn.scanInt();
        int s=scn.scanInt();
        while(t-->0){
            int n=scn.scanInt();
            int[] ar1=new int[n];
            int[] ar2=new int[n];
            for(int i=0;i<n;i++){
                ar1[i]=scn.scanInt();
            }
            for(int i=0;i<n;i++){
                ar2[i]=scn.scanInt();
            }
            Arrays.sort(ar1);
            Arrays.sort(ar2);
            HashSet<Integer> map=new HashSet<>();
            int pt1=0;
            int pt2=0;

            int flag=0;
            int k=0;
            System.out.println(Arrays.toString(ar1));
            System.out.println(Arrays.toString(ar2));
            while(pt1<n){
                if(ar1[pt1]>=ar2[pt2]){
                    flag=1;
                    System.out.println(pt1+" la");
                    break;
                }
                else{
                    map.add(ar1[pt1]);
                    map.add(ar2[pt2]);
                }
                pt1++;
                pt2++;
                if(pt1<n && !map.contains(ar1[pt1])){
                    flag=1;
                    System.out.println(pt1);
                    break;
                }
            }
            if(flag==1){
                bw.append("NO\n");
            }
            else bw.append("YES\n");
        }
        bw.close();
    }
}

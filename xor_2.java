import java.io.*;
class xor_2
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println();
        int T=Integer.parseInt(br.readLine());
        int q=0;
        int mat[]=new int[T];
        for(int h=1;h<=T;h++)
        {
        String inp=br.readLine();
        int x=0,y=0,e=0;
        inp=inp+" ";
        String s="";
        for(int i=0;i<inp.length();i++)
        {
            char ch=inp.charAt(i);
            if(ch!=' ')
            s=s+ch;
            else
            {
                if(e==0)
                {
                    x=Integer.parseInt(s);
                }
                else
                y=Integer.parseInt(s);
                s="";
                e=e+1;
            }
        }
        if (x>y)
        {
            int b=x;
            x=y;
            y=b;
        }
        int ans=x^(x+1);
        for(int i=x+2;i<=y;i++)
        {
            ans=ans^i;
        }
        mat[q]=ans;
        q=q+1;
        System.out.println();
        }
        for(int u=0;u<q;u++)
        {
            System.out.println(mat[u]);
        }
    }
}

public class Flipping {

    public static String toBinary(int n)
    {
        int q=n,r;
        String str = "";
        while(q!=1)
        {
            r=q%2;
            q=q/2;
            str=Integer.toString(r)+str;

        }
        return "1"+str;
    }

    public static void main(String a[])
    {
        int n=0;

        String s=toBinary(n);
        long l = Long.parseLong(s);
         String conv="";

        String padding = String.format("%32s", l).replace(' ', '0');
        System.out.println("To Binary="+padding );

        for (int i=0;i<padding.length();i++)
        {
          conv=(padding.charAt(i)=='0')? conv+"1":conv+"0";
        }
       // Integer l1=Integer.parseInt(conv);
        Long decimal = Long.parseLong(conv, 2);
        System.out.println("Converted="+ conv );
        System.out.println("Answer ="+ decimal);

    }
}

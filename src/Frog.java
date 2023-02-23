public class Frog {

    int a[]={2,6,8,5};

    int val = calculate(a);

    Frog(){}
                                                                    //  2 6 8 5
                                                                    // 1 5 5 2 6

    int calculate(int a[])
    {
        int m=-1;
        int pivot;
       for(int i=0;i<a.length;i++)
       {
           pivot=a[i];
           for(int j=i;j>=0;j--)
           {
               while(m!=-1)
               {
                   m--;
                 //  if (a[j])

               }
           }

       }
        return 0;
    }


    public static void main(String a[])
    {
        Frog f= new Frog();

    }



}

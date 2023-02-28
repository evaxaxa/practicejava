import java.sql.SQLOutput;
import java.util.*;

public class UniqueElement {

    public static int lonelyinteger(List<Integer> a) {
        int[] arr = new int[101];
        Arrays.fill(arr, 0);
        for(int x: a){
            arr[x] = arr[x]+1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1) return i;
        }
        return -1;
    }

    public static void main(String a[])
    {
        int[] arr = new int[101];

        List<Integer> ar= new ArrayList<Integer>();
        ar.add(1);
        ar.add(2);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(3);
        ar.add(1);
        //


        // 1 2 2 3 4 3 1

       // System.out.println(lonelyinteger(ar));

//        Arrays.fill(arr,0);

//        for (int i : ar)
//        {
//            arr[i]=arr[i]+1;
//            System.out.print("  "+i+" "+ arr[i]);
//
//        }
//        System.out.println();
//        for(int i=0;i<arr.length;i++){
//            if(arr[i] == 1)
//                System.out.println( i);
//
//        }


        // 1 2 3 4 3 2 1

       // Collections.sort(ar);
//
        Map<Integer,Integer> hp= new HashMap<Integer,Integer>();

        for(int i:ar)
            {
          if(  hp.containsKey(i))
          {

              hp.put(i,hp.get(i)+1);
              //System.out.println("---hp.containsKey(i)---"+hp+i);

          }
          else
          {
             // System.out.println("---NO hp.containsKey(i)---"+hp+i);
              hp.put(i,1);
          }

//                    if(hp.co)
//                        System.out.println("----"+hp.getKey());



        }

        for(Map.Entry<Integer,Integer> e: hp.entrySet())
        {
            if(e.getValue()==1)
                System.out.println(e.getKey());
        }


//        System.out.println();
//        System.out.println("size = "+ hp.size());

    }

}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Collectors;


interface A
{
    static void show()
    {
        System.out.println("Inside A");
    }
}
interface B
{
    static void show()
    {
        System.out.println("Inside B");
    }
}



public class InterfaceUsingJava8 implements A ,B{


    public void show()
    {
        System.out.println("Inside Main");
    }


     static  String m()
    {
        List<String> s= Arrays.asList("ab","abc","bc");
//
//        for (int i=0 ;i<s.size();i++)
//        {
//            System.out.println("ss="+s.get(i));
//              return s.get(i)
//             // break;
//
//        }
        String s1 =  s.stream().map(i-> String.valueOf(i)).collect(Collectors.joining("\n"));
       // stream.collect(Collectors.toCollection(ArrayList::new));

       System.out.println("mm="+s1);

        return s1;
    }


    public static void main(String args[])
    {
        InterfaceUsingJava8 obj= new InterfaceUsingJava8();
        obj.show();

        A.show();
        B.show();


      //  List<String> string = new ArrayList<>();
       List<String> string = Arrays.asList("ab", "ab", "abc");
       // List<String> string = Arrays.asList("spring", "node", "mkyong");
        //List<String> s= Arrays.asList("ab","abc","bc");



//        String string = "aaa";
//        String s = "aaa";


//        List<String> result = string.stream()                // convert list to stream
//                .filter(line -> !"mkyong".equals(line))     // we dont like mkyong
//                .collect(Collectors.toList());

//        String m()
//        {
//            s.forEach(i->);
//
//
//        }

        // String m1=s.stream().forEach(i-> );

        //String s1 =  s.stream().map(i-> String.valueOf(i)).collect(Collectors.joining("\n"));
      //  System.out.println("s1="+s1);

        List<String> s= Arrays.asList("ab","abc","bc");
        for (int i=0 ;i<s.size();i++)
        {
            final String q;

            System.out.println("ss="+s.get(i));
              q= s.get(i);
            long result= string.stream()
                    .filter(j-> q.contains(j))
                    .count();
//            long x[]=new long[s.size()];
//            x[i]=result;

            List<Long> l = new ArrayList<>();
            l.add(result);

            System.out.println(l);
             // break;

        }



//        Map<String, Integer> map = new HashMap<>();
//        strings.forEach(item -> map.merge(item, 1, Integer::sum));
//        return queries.stream().map(item -> map.get(item) == null ? 0 : map.get(item)).collect(Collectors.toList());



      //  m();

//        List<String> result= string.stream()
//                .filter(i-> "ab".contains(i))
//                .map(i->i+1)
//                .collect(Collectors.toList());

        //result.forEach(System.out::println);                //output : spring, node

    }
}

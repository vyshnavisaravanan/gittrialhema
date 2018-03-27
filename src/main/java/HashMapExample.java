import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        HashMap<String, String> map1 = new HashMap<String, String>();

        String test = "pet:cat::car:honda::location:Japan::food:sushi";
        String[] test1 = test.split("::");
        String[] test2=null;


        for(int i=0;i<test1.length;i++)
        {
//            map.put(test1[i],test1[i+1]);
        System.out.println(test1[i]);

        }

        System.out.println("Test2 Data:");
        System.out.println(test1.length);

        for(int j=0;j<test1.length;j++)
        {
            test2=test1[j].split(":");
            for(int k=0;k<test2.length;k++) {
                System.out.println(test2[k]);
            }
        }

       // System.out.println(test1[3]);

        for(int i=0;i<test2.length;i+=2)
        {
            map1.put(test1[i],test1[i+1]);

        }



        for(String s:map1.keySet())
        {
            System.out.println(s+ " is==" +map1.get(s));
        }


    }
}

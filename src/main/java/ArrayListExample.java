import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {

    public static void main(String[] args) {
        String nameList="Saravanan. Vyshnavi. Savin";
        System.out.println("Name List is : "+ nameList);

        //creating one empty array list

        ArrayList<String> nameArrayList = null;

        //To split by (.) ==> \\.
        nameArrayList = new ArrayList(Arrays.asList(nameList.split("\\s*\\.\\s*")));
        System.out.println("ArrayList: " + nameArrayList.get(0));


        //To split by (,) ==> ,

        String nameCommaList="Saravanan, Vyshnavi, Savin";

        nameArrayList = new ArrayList(Arrays.asList(nameCommaList.split("\\s*,\\s*")));
        System.out.println("ArrayList: " + nameArrayList.get(0));
    }
}

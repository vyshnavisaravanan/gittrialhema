public class ArrayBasic
{
int array1[];
String array3[];

ArrayBasic()
{
    int array1[] = {1, 2, 3, 4, 5, 6};
//      int array2[][];
    String array3[] = {"Vyshnavi", "Saravanan", "Savin"};

}
  public void displayArray()
  {
      for(int i=0;i<2;i++)
      {
          System.out.println("Integer value of Array["+i+"] is :" +array1[i]);
          System.out.println("String value of Array["+i+"] is :" +array3[i]);

      }
  }
}

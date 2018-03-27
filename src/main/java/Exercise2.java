import java.util.Scanner;

public class Exercise2
{
static int size,arsize;
    Exercise2(int size)
    {
        arsize=size;
    }


    public static void main(String[] args) {
        Exercise2 e=new Exercise2(6);
        int marklist[]=new int[arsize];

        int totalMark =0;
        float averageMark=0;
        System.out.println(+arsize);
        System.out.println("Please Enter the Name:");
        Scanner scan = new Scanner(System.in);
        String studentName = scan.nextLine();
//        System.out.println("Please Enter Mark i");
//        marklist[1]=scan.nextInt();
//        System.out.println("ary disp"+marklist[1]);
        for(int i=0;i<arsize;i++)
        {
            System.out.println("Please Enter Mark "+i);
             marklist[i]=scan.nextInt();
             int tempmark=marklist[i];

             totalMark = marklist[i]+totalMark;
             averageMark = totalMark/arsize;

        }
//        System.out.println("Total Mark of "+studentName+" is ==>" +totalMark);
//        System.out.println("Average Mark of "+studentName+" is ==>" + averageMark);
        String calculatedGrade = grade(averageMark);
//        System.out.println("Grade of " +studentName+" is ++>"+calculatedGrade);
        report(marklist,studentName,calculatedGrade);


    }

    public static String grade(float mark)
    {
        String grade= null;

        if(mark==90 || mark> 90)
        {
//            System.out.println("A Grade in Subject");
            grade = "A Grade";

        } else if (mark >70 && mark <89)
        {
            grade = "B Grade";
        } else if (mark >40 && mark <69)
        {
            grade = "C Grade";
        }


        return grade;
    }
    public static void report(int marklist[],String studentName,String calculatedGrade)
    {
        String resultOfEachSubject = null;
        String subName[]={"JAVA               ","C++                ","DataStructure      ","C                  ","Phython            ","ComputerGraphics   "};
//      int s= marklist[1];
//        System.out.println("value of s ==" +s);
        System.out.println("==================================================================");
        System.out.println("Student Name : "+studentName+"               "+"Grade: "+calculatedGrade);
        System.out.println("==================================================================");

        for(int i=0;i<arsize;i++)
        {
            if(marklist[i]>35)
            {
                resultOfEachSubject = "PASS";
                System.out.println("==================================================================");
                System.out.println(subName[i]+"    "+marklist[i]+"     " +resultOfEachSubject);

            }
            else
            {
                resultOfEachSubject = "FAIL";
                System.out.println("==================================================================");
                System.out.println(subName[i]+"    "+marklist[i]+"     " +resultOfEachSubject);
            }
        }
        System.out.println("==================================================================");

    }

}

import java.util.Scanner;

public class PalindromeInt {
    int sizeOfStringArray;
    String[] stringNames = null;

    public static void main(String[] args) {
        //how to use stringbuilder
        String actualString = "Malayalam";
        StringBuilder sbObject = new StringBuilder(actualString);
        StringBuffer sb=new StringBuffer(actualString);

        StringBuilder reversenumber = sbObject.reverse();
        System.out.println(reversenumber);

        //creating object for this class
        PalindromeInt pn = new PalindromeInt();
        int sizeofStringArray = 5;

        pn.stringNames = pn.getString(sizeofStringArray);
        pn.printString(pn.stringNames, sizeofStringArray);
        pn.isPalindrome(pn.stringNames, sizeofStringArray);


    }

    public String[] getString(int sizeOfStringArray) {
        System.out.println("Size of String Array -->" + sizeOfStringArray);
        String[] stringNamestemp = new String[sizeOfStringArray];
        for (int i = 0; i < sizeOfStringArray; i++) {
            System.out.println("Please Enter the string names");
            Scanner scan = new Scanner(System.in);
            String name = scan.nextLine();
            stringNamestemp[i] = name;
        }
        return stringNamestemp;

    }

    public void printString(String[] stringnames, int sizeOfStringArray) {
        for (int i = 0; i < sizeOfStringArray; i++) {
            System.out.println(stringnames[i]);
        }
    }

    public void isPalindrome(String[] stringNames, int sizeOfStringArray) {
        int lenghtOfPal = 0;
        String[] palArray = new String[1];
        for (int i = 0; i < sizeOfStringArray; i++) {
            String[] compareString = new String[sizeOfStringArray];


            StringBuilder stringBuilderObj = new StringBuilder(stringNames[i]);
            compareString[i] = String.valueOf(stringBuilderObj.reverse());
            if (compareString[i].equalsIgnoreCase(stringNames[i])) {
                System.out.println(compareString[i] + "==> is PALINDROME ==>" + stringNames[i]);

//                System.out.println("lenght of pal is" +lenghtOfPal);

//                System.out.println("Pal Array" +palArray[0]);
                if (lenghtOfPal < stringBuilderObj.length()) {
                    palArray[0] = compareString[i];
//                    System.out.println("for now lar valu" +palArray[0]);
                    lenghtOfPal = stringBuilderObj.length();

                }
            } else {
                System.out.println(compareString[i] + "==> is Not PALINDROME ==>" + stringNames[i]);

            }
        }
        System.out.println(palArray[0] + "This is the longest palindrome");

    }
}

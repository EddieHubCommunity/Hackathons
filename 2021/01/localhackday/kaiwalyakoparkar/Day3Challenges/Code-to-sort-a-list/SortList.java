package Codetosortalist;
import java.util.*;

public class SortList{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<String>();
        al.add("MLH");
        al.add("Local Hack Day");
        al.add("Challenge");
        al.add("Day");
        al.add("3");

        /* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */
        Collections.sort(al);

        // Let us print the sorted list
        System.out.println("List after the use of" +
                           " Collection.sort() :\n" + al);
    }
}

import java.util.LinkedList;
import java.util.Stack;
import java.util.Scanner;
import java.io.*;
import java.util.*;



    public class Linked_List {
        public static void main (String[] args) {

            Scanner sc = new Scanner(System.in);
            
            System.out.println("ENTER YOUR NAME :");
            String name = sc.nextLine();
            System.out.println("ENTER YOUR GENDER :");
            char gender = sc.next().charAt(0);
            System.out.println("ENTER YOUR AGE :");
            int age = sc.nextInt();
            System.out.println("ENTER YOUR MOBILE NUMBER :");
            long mobile = sc.nextLong();
            System.out.println("ENTER YOUR GWA :");
            double gwa = sc.nextDouble();

            
            System.out.println("========");
            System.out.println("NAME =" + name);
            System.out.println("GENDER =" + gender);
            System.out.println("AGE =" + age);
            System.out.println("MOBILE NUMBER =" + mobile);
            System.out.println("GWA =" + gwa);
            System.out.println("============");
        }
    }


    //         LinkedList <String> lls = new LinkedList <>();

    //             lls.add("Element1");
    //             lls.add("Element2");
    //             lls.addFirst("Element0");
    //             lls.addLast("Element3");

    //             System.out.println("========");
    //             for (int i = 0; i < lls.size(); i++){
    //                 System.out.println("Get List =" + lls.get(i));

    //             }

    //             System.out.println("========");
    //             for (String str : lls){
    //                 System.out.println("Each List = " + str);
    //             }

    //             Iterator it = lls.iterator();
    //             System.out.println("========");

    //             while(it.hasNext()){
    //                 System.out.println("Iterator List = " + it.next());
    //             }

    //             Object [] arr = lls.toArray();
    //             System.out.println("========");
    //             for (Object arr1 : arr){
    //                 System.out.println("Array List =" + arr1);
    //             }
    //     }
    // }

                // System.out.println("List =" + lls);

                // lls.remove("Element3");
                // lls.removeFirst();
                // lls.removeLast();
            
    //             System.out.println("List = " + lls);
    //     }
    // }

  


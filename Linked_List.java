import java.util.LinkedList;
import java.util.Stack;
import java.util.Scanner;
import java.io.*;
import java.util.*;



public class Linked_List {

    
        public static void main (String[] args) throws NumberFormatException, IOException {

            LinkedList <String> lls = new LinkedList<>();

            lls.add("Element1");
            lls.add("Element2");
            lls.add("Element3");

            System.out.println("Original List" + lls);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String element;
            int position, choice = 0;

            while(choice < 4){

                System.out.println("-----------------");
                System.out.println("\n LINKEDLIST OPERATIONS");
                System.out.println("1. Add Element");
                System.out.println("2. Remove Element");
                System.out.println("3. Change Element");
                System.out.println("4. Display");
                System.out.println("5. Exit");
                System.out.println("-----------------");

                System.out.print("Enter you Choice Number:");
                choice = Integer.parseInt(br.readLine());

                switch(choice){
                    case 1 :
                    System.out.print("Enter Element: ");
                    element = br.readLine();

                    System.out.print("Enter Position: ");
                    position = Integer.parseInt(br.readLine());
                    lls.add(position-1, element);

                    break;

                    case 2 :
                    System.out.print("Enter Position You Want To Remove: ");
                    position = Integer.parseInt(br.readLine());
                    lls.remove(position-1);

                    break;
                    
                    case 3 :
                    System.out.print("Enter Position: ");
                    position = Integer.parseInt(br.readLine());

                    System.out.print("Change Element: ");
                    element = br.readLine();
                    lls.set(position-1, element);

                    break;

                    case 4 :
                    Iterator it = lls.iterator();
                    while(it.hasNext())
                        System.out.println("List =" + it.next());

                    break;

                    case 5 :
                    System.exit(0);
                
                    default:
                    System.out.println("Goodbye KUPAL!");
                    }
                }
        }
    }

    
            
            // Scanner sc = new Scanner(System.in);

            // int sum = 0, count = 0;
            
            // while(sc.hasNextInt()) {
            //     int num = sc.nextInt();
            //     sum += num;
            //     count++;

            // }
            // if(count > 0) {
            //     int mean = sum / count;
            //     System.out.println("Mean = " + mean);
            // }
            // else{

            //     System.out.println("Invalid");
           
           
            // }

    
            // Scanner sc = new Scanner(System.in);
            
            // System.out.println("-----------------");
            // System.out.print("ENTER YOUR NAME:");
            // String name = sc.nextLine();
            // System.out.println("-----------------");
            // System.out.print("ENTER YOUR GENDER:");
            // char gender = sc.next().charAt(0);
            // System.out.println("-----------------");
            // System.out.print("ENTER YOUR AGE :");
            // int age = sc.nextInt();
            // System.out.println("-----------------");
            // System.out.print("ENTER YOUR MOBILE NUMBER :");
            // long mobile = sc.nextLong();
            // System.out.println("-----------------");
            // System.out.print("ENTER YOUR GWA :");
            // double gwa = sc.nextDouble();

         
            
            // System.out.println("-----------------");
            // System.out.println("NAME =" + name);
            // System.out.println("-----------------");
            // System.out.println("GENDER =" + gender);
            // System.out.println("-----------------");
            // System.out.println("AGE =" + age);
            // System.out.println("-----------------");
            // System.out.println("MOBILE NUMBER =" + mobile);
            // System.out.println("-----------------");
            // System.out.println("GWA =" + gwa);
    
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

  


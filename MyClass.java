import java.util.*;
import java.io.*;
public class MyClass {
    static void menu()
    {
        System.out.println("1. Insert");
        System.out.println("2. Search");
        System.out.println("3. Delete");
        System.out.println("4. Display");
        System.out.println("5. Exit");
    }
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        int opt=0;
        ArrayList<String> al = new ArrayList<>();
        while(true){
            System.out.println();
            menu();
            System.out.println("Enter your Choice:");
            opt = Integer.parseInt(br.readLine());
            
            switch(opt)
            {
                case 1:
                    System.out.println("Enter Your String to be added:");
                    str = br.readLine();
                    al.add(str);
                    break;
                case 2:
                    System.out.println("Enter Your String to be Searched:");
                    str = br.readLine();
                    if(al.contains(str))
                    System.out.println("Yes "+str+" is present inside List");
                    else System.out.println("No "+str+" is not present inside List");
                    break;
                case 3:
                    System.out.println("Enter Your String to be deleted:");
                    str = br.readLine();
                    al.remove(str);
                    break;
                case 4:
                    System.out.print("Current List: ");
                    System.out.println(al);
                    break;
                case 5:
                    return;
            }
        }
    }
}
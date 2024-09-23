import java.util.*;

public class Collections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Collection<String> EmpName = new ArrayList<>();
        EmpName.add("Arun");
        EmpName.add("Siddharth");
        EmpName.add("Bharath");
        EmpName.add("Hari");
        EmpName.add("Gowtham");
        EmpName.add("Jeeva");

        System.out.println("Employee Names: " + EmpName);

        EmpName.remove("Jeeva");
        System.out.println("Employee Names: " + EmpName);

        if(EmpName.contains("Gowtham"))
        System.out.println("Gowtham is present!!");

/*
        for(String Emp : EmpName){
            int count = 0;
            count++;
            System.out.println(count + " - " + Emp);
        }
*/
        int count = 0;
        for (String Emp : EmpName) {
            count++;
            System.out.println(count + " : " + Emp);
        }

//        EmpName.clear();
//        System.out.println("Employee Names: " + EmpName);
    }
}

import java .util.*;

// class Functions {
//     public static void printMyName(String Name){
//         System.out.println("My name is: " +Name);
//     }
//     public static void main(String[] args) {
//         System.out.print("Enter Your Name: ");
//         Scanner sc = new Scanner(System.in);
//         String UserName= sc.next();
//         printMyName(UserName);
//     }
// }

class Function{
    public static void MyName(){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("My name is " +name);
    }
    
    public static void main(String[] args) {
        System.out.print("Enter Your Name: ");
        MyName(); //directly calling static method directly
    }
}
import java.util.*;
public class Variables {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int button= sc.nextInt();


        switch(button){
            case 1:System.out.println("Helloeveryone");
            break;

            case 2:System.out.println("Good morning");
            break;

            case 3:System.out.println("Good evening");
            break;

            default:System.out.println("Invalid button");
            
        }
    }
}

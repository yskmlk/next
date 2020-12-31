import java.util.Scanner;
public class GradeGreetings {

    public static void main(String args[]){

        Scanner in = new Scanner (System.in);

        System.out.println("enter next character");

        char grade = new Character();

        switch (grade){

            case 'A':
                System.out.println(" Amazing job you hav got 90%");
                break;
            default:
                System.out.println("Grade can only be A to F");

            case 'B':
                System.out.println(" need to do more better");
                break;

            case 'C':
                System.out.println(" need to do more better");
                break;

                case 'D':
                System.out.println(" need to do more better");
                break;

                case 'E':
                System.out.println(" need to do more better");
                break;

                case 'F':
                System.out.println(" need to do more better");
                break;

        }

    }
}

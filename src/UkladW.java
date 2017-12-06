import java.util.Scanner;

public class UkladW {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Podaj x :");
        int x = scanner.nextInt();
        System.out.println("Podaj y : ");
        int y = scanner.nextInt();

        if(x>0){
            if(y>0){
                System.out.println("Punkt znajduje się w I ćwiartce");
            } else if (y<0){
                System.out.println("Punkt znajduje się w IV ćwiartce");
            } else {
                System.out.println("Punkt znajduje się na osi X");
            }
        } else if (x<0){
            if (y>0){
                System.out.println("Punkt znajduje się w II ćwiartce");
            } else if (y<0){
                System.out.println("Punkt znajduje się w III ćwiartce");
            } else {
                System.out.println("Punt znajduje się na osi X");
            }

        } else {
            System.out.printf("Punkt znajduje się na osi Y");
        }

    }
}

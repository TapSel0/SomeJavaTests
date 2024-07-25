import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            checkAge(sc.nextInt());
            System.out.println("Всё ок");
        } catch (InvalidAgeException e) {
            System.out.println("Ошибка: " + e);
            System.out.println(e.getMessage());

        }
    }

    public static void checkAge(int age) throws InvalidAgeException{
        if (age < 18){
            throw new InvalidAgeException("Слишком мал ещё");
        }
    }

}

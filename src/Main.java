//import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        //stream for filter numbers
        List<Integer> numbers = Arrays.asList(12,43,53,62,46,24,74,65,84);
        List<Integer> evenNumbers = numbers.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i * 2)
                .sorted()
                .toList();
        System.out.println(evenNumbers);

        //stream for lines
        String[] lines = {"First", "Second", "Third", "Sad", "Mad", " ", "Gabon", "Java", "Sand"};
        Stream<String> streamLines = Arrays.stream(lines);

        String[] newLines = streamLines
                .filter(s -> s.length() > 3)
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .toArray(String[]::new);
        System.out.println(Arrays.toString(newLines));

        //stream for classes
        Person[] person = {
                new Person("Ted", 8),
                new Person("Jade", 17),
                new Person("Luci", 21),
                new Person("Alice", 14),
                new Person("Jarett", 19),
        };
        Stream<Person> personStream = Arrays.stream(person);
        List<Person> filteredPerson = personStream
                .filter(p -> p.getAge() > 18)
                .map(p -> new Person(p.getName().toUpperCase(), p.getAge()))
                .sorted(Comparator.comparingInt(Person::getAge))
                .toList();
        filteredPerson.forEach(System.out::println);


        }

    }

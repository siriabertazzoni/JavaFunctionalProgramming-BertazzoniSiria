import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Person> people = List.of(
            new Person("Siria", Gender.FEMALE),
            new Person("Giorgia", Gender.FEMALE),
            new Person("Francesco", Gender.MALE),
            new Person("Edoardo", Gender.MALE),
            new Person("Carlotta", Gender.FEMALE)
        );

        List<Person> females = people.stream().filter(p -> Gender.FEMALE.equals(p.gender)).toList();

        for(Person p : females){
            System.out.println(p.name);
        }
    }
}

// import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        //? lista oggetti di classe Person dalla quale filtrare le persone in base al genere

        List<Person> people = List.of(
            new Person("Siria", Gender.FEMALE),
            new Person("Giorgia", Gender.FEMALE),
            new Person("Francesco", Gender.MALE),
            new Person("Edoardo", Gender.MALE),
            new Person("Carlotta", Gender.FEMALE)
        );

        //! metodo imperativo

        // List<Person> females = new ArrayList<>();
        // for(Person p : people){
        //     if(Gender.FEMALE.equals(p.gender)) females.add(p);
        // }

        // for(Person f : females){
        //     System.out.println(f.name);
        // }

        // System.out.println(people);

        //* metodo dichiarativo -> utilizzo la LAMBDA

        // dalla lista genero uno stream -> sequenza dati che può essere manipolato uno alla volta 
        //                               -> i dati non vengono duplicati 
        //                               -> esegue un solo ciclo durante il quale esegue TUTTE le operazioni su un dato poi passa a quello successivo e le esegue anche su esso e così via per tutti i dati 
        people.stream()

            .filter(person -> Gender.FEMALE.equals(person.gender))

            // trasformo lo stream in lista per poterla ciclare e stampare -> utilizzo Collectors.toList che trasforma lo stream in lista
            .collect(Collectors.toList())
            .forEach(person -> System.out.println(person.name));


    }
}

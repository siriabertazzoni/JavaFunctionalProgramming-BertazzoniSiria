import java.util.Arrays;
// import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Integer[] ints = new Integer[] {2, 7, 18, 20, 11, 30, 35, 3};
        // alla funzione Arrays.sort() passo l'array di interi
        Arrays.sort(ints, (a,b) -> a - b);

        for(Integer i : ints){
            System.out.println(i);
        }
        
        //! altro modo di stampa
        // List.of(ints).stream().forEach(el -> System.out.println(el));

    }
}

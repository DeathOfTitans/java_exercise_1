import java.util.Scanner; // pour faciliter l'écriture //
public class Launcher{
    public static void main( String[] args) {
        System.out.println("Bonjour, Bienvenue ! ");
        
        var scanner = new Scanner(System.in);

        String inputs = scanner.nextLine();

        while (!"quit".equals(inputs)){
            System.out.println("Unknown command");

            if ("fibo".equals(inputs)){
                System.out.println(" fibo lancés ; quel est le nombre à calculer ?");
                int ints = scanner.nextLine();
                for (int i, i<ints, i++){
                    
                }
            }

            inputs = scanner.nextLine();
        }

        

    } 
}
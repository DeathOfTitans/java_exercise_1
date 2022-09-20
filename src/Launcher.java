import java.util.Scanner; // pour faciliter l'écriture //
public class Launcher{
    public static int fibo(int n){
        if (n <= 1)
            return n;
        return fibo(n-1) + fibo(n-2);
    }
    public static void main( String[] args) {
        System.out.println("Bonjour, Bienvenue ! ");
        
        var scanner = new Scanner(System.in);

        String inputs = scanner.nextLine();

        while (!"quit".equals(inputs)){
            

            if ("fibo".equals(inputs)){
                System.out.println(" fibo lancés ; quel est le nombre à calculer ?");
                int ints = scanner.nextInt();
                System.out.println(fibo(ints));
            }
            else {
                System.out.println("Unknown command");
            }

            inputs = scanner.nextLine();
        }
    } 
    
}
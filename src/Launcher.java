import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collector;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files; // pour faciliter l'écriture //
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.CollationElementIterator;

public class Launcher{
    public static int fibo(int n){
        if (n <= 1){
            return n;};
        return fibo(n-1) + fibo(n-2);
    }

    private static void freq(Path paths)     // le lecteur de fichier
    {
        try{
            String content = Files.readString(paths);
            String[] words= content
                .replaceAll("\\W"," ")
                .toLowerCase()
                .split(" ");
            Map<String, Long> countswords = Array.stream(words)
                .map(w -> w.trim())
                .filter(w -> length() > 0)
                .collect(groupinBy(
                    Function.identity(),
                    Collector.counting()));
            countswords.entrySet()
                .stream()
                .sorted(Map.entry<String, Long>comparingBYValue().reversed())
                .map(e -> e.getKey())
                .limit(3)
                .collect(Collector.joining(" "));
        } catch (IOException e){
            System.out.println("Je ne suis pas arrivé à lire le fichier" + e.getMessage());
        }
    }


    public static void main( String[] args) throws IOException{
        System.out.println("Bonjour, Bienvenue ! ");
        
        var scanner = new Scanner(System.in);

        String inputs = scanner.nextLine();

        while (!"quit".equals(inputs)){
            

            if ("fibo".equals(inputs)){
                System.out.println(" fibo lancé ; quel est le nombre à calculer ?");
                int ints = scanner.nextInt();
                System.out.println(fibo(ints));
            }
            if ("freq".equals(inputs)){
                System.out.println(" frequence lancé ; quel est le fichier ?");
                String fich= scanner.nextLine();
                Path paths = Paths.get(fich);
                if (!Files.exists(paths)){
                    
                }
                else {
                    freq(paths);
                }                
            }
            else {
                System.out.println("Unknown command");
            }

            inputs = scanner.nextLine();
        }
    } 
    
}
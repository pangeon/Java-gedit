import java.io.*;

public class PrimeNumberConsole extends PrimeNumber {
    private int number;
    private static String line = "";
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private Reader reader = new BufferedReader(new InputStreamReader(System.in));
    private StreamTokenizer streamToken = new StreamTokenizer(reader); 
    
    PrimeNumberConsole() {
    }
    PrimeNumberConsole(int a) {
        super(a);
    }
    public static void testToConsole() {
        System.out.println("Aby zamknąć program wpisz exit");		
        try {		
            while(!line.equals("exit")) {
                line = br.readLine();
                if (line.equals("exit")) System.out.println("Opuściłeś program");
                else System.out.println(line);
            }
        } catch(IOException e) {
            System.out.println("Błąd odczytu");
        }
    }
    public void primeToConsole() throws IOException {
        System.out.println("Określ zakres liczb pierwszych");
        try {
            a = streamToken.nextToken();
            System.out.println(a);

            if (a == StreamTokenizer.TT_NUMBER) {
                number = (int) streamToken.nval;
                PrimeNumber pn = new PrimeNumber(number);
                pn.PrintSequence();
            } else {
                throw new IOException();
            }
        } catch(IOException e) {
            System.out.println("Błąd odczytu, niepoprawne dane wejściowe.");
        }
    }	
}

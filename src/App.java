import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        ConsumoApi api = new ConsumoApi();
        System.out.println("Informe o e-mail que deseja verificar");
        String informedEmail = in.nextLine();
        String json = api.verificateEmail(informedEmail);
        System.out.println(json);
        in.close();
    }
}

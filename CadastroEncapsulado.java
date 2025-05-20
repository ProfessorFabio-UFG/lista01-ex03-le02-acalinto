import java.util.ArrayList;
import java.util.Scanner;

public class CadastroEncapsulado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MoradorEncapsulado> lista = new ArrayList<>();

        while (true) {
            MoradorEncapsulado m = new MoradorEncapsulado();
            System.out.print("Nome: ");
            m.setNome(sc.nextLine());
            // (restante dos sets...)
            lista.add(m);

            System.out.print("Cadastrar outro? (s/n): ");
            if (!sc.nextLine().equalsIgnoreCase("s")) break;
        }

        for (MoradorEncapsulado m : lista) {
            System.out.println("Código: " + m.getCodigoSequencial() + ", Nome: " + m.getNome());
        }
    }
}

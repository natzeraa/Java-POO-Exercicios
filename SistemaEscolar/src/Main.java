import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Aluno("Natalia", 25, "A123"));
        pessoas.add(new Professor("Guilherme", 24, "Desenvolvimento Back End"));
        pessoas.add(new Diretor("Priscila", 40, 10));

        System.out.println("=== APRESENTAÇÃO DAS PESSOAS ===\n");

        for (Pessoa p : pessoas) {
            p.apresentar();
        }
    }
}
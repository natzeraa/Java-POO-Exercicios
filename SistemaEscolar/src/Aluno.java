public class Aluno extends Pessoa {

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void apresentar() {
        System.out.println("Sou o aluno " + getNome() + ", tenho " + getIdade() + " anos, matrícula " + matricula + ".");
    }
}
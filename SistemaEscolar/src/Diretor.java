public class Diretor extends Pessoa {

    public Diretor(String nome, int idade, int tempoDeGestao) {
        super(nome, idade);
        this.tempoDeGestao = tempoDeGestao;
    }

    private int tempoDeGestao;

    public int getTempoDeGestao() {
        return tempoDeGestao;
    }

    public void setTempoDeGestao(int tempoDeGestao) {
        if (tempoDeGestao >= 0) {
            this.tempoDeGestao = tempoDeGestao;
        }
    }

    @Override
    public void apresentar() {
        System.out.println("Sou o diretor " + getNome() + ", há " + tempoDeGestao + " anos na gestão.");
    }
}
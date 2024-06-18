public class CD extends Produto {
    private int numFaixas;

    public CD(String nome, double preco, int numFaixas) {
        super(nome, preco);
        this.numFaixas = numFaixas;
    }

    @Override
    public String toString() {
        return "CD: " + super.toString() + "; Faixas: " + numFaixas;
    }
}

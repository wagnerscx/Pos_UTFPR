

public abstract class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private float veloMax;
    private int qtdRodas;
    private Motor motor;


    public Veiculo() {
        this.placa = "";
        this.marca = "";
        this.modelo = "";
        this.cor = "";
        this.veloMax = 0;
        this.qtdRodas = 0;
        motor = new Motor();
    }




    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public Motor getMotor() {
        return this.motor;
    }


    public abstract float calcVel(float veloMax);


}

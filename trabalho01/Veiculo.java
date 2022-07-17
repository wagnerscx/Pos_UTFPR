package trabalho01;


public class Veiculo {
	
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
	
	public Veiculo(String placa, String marca, String modelo, String cor, float veloMax, int qtdRodas, int qtdPist, int potencia) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.veloMax = veloMax;
		this.qtdRodas = qtdRodas;
		this.motor = new Motor(qtdPist, potencia);
		
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
	public float getVeloMax() {
		return veloMax;
	}
	public void setVeloMax(float veloMax) {
		this.veloMax = veloMax;
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
	@Override
	public String toString() {
		System.out.println(" Placa: "+ this.placa);
		System.out.println(" Marca: "+ this.marca);
		System.out.println(" Modelo: "+ this.modelo);
		System.out.println("Cor: "+ this.cor);
		System.out.println(" Velocidade max: "+ this.veloMax);
		System.out.println(" Nº de rodas: "+ this.qtdRodas);
		System.out.println(" Motor: "+ this.motor.getPotencia());
		System.out.println("**********************************");
		return null;
		
	}
	
	
	
}

package trabalho01;

public class Teste {

	public static void main(String[] args) {
		Veiculo carro1 = new Veiculo();
		carro1.setMarca("Volkswagem");
		carro1.setModelo("Fusca");
		carro1.setCor("Preto");
		carro1.setPlaca("AAA-123");
		carro1.setQtdRodas(4);
		carro1.setVeloMax(100);
		carro1.getMotor().setPotencia(46);
		carro1.getMotor().setQtdPist(4);
		
		System.out.println(" Marca---"+carro1.getMarca());
		System.out.println(" Modelo---"+carro1.getModelo());
		System.out.println(" Cor---"+carro1.getCor());
		System.out.println(" Placa---"+carro1.getPlaca());
		System.out.println(" Rodas---"+carro1.getQtdRodas());
		System.out.println(" Velocidade máx---"+carro1.getVeloMax()+" Km/h");
		System.out.println(" Nº de Pistões---"+carro1.getMotor().getQtdPist());
		System.out.println(" Potencia em cv---"+carro1.getMotor().getPotencia()+"cv");
		System.out.println("**********************************************");
		
		Veiculo carro2 = new Veiculo();
		carro2.setMarca("Ford");
		carro2.setModelo("Fiesta");
		carro2.setCor("Branco");
		carro2.setPlaca("ABA-100");
		carro2.setQtdRodas(4);
		carro2.setVeloMax(150);
		carro2.getMotor().setPotencia(85);
		carro2.getMotor().setQtdPist(4);
		
		System.out.println(" Marca---"+carro2.getMarca());
		System.out.println(" Modelo---"+carro2.getModelo());
		System.out.println(" Cor---"+carro2.getCor());
		System.out.println(" Placa---"+carro2.getPlaca());
		System.out.println(" Rodas---"+carro2.getQtdRodas());
		System.out.println(" Velocidade máx---"+carro2.getVeloMax()+" Km/h");
		System.out.println(" Nº de Pistões---"+carro2.getMotor().getQtdPist());
		System.out.println(" Potencia em cv---"+carro2.getMotor().getPotencia()+"cv");
		System.out.println("**********************************************");
		
		Veiculo carro3 = new Veiculo();
		carro3.setMarca("Honda");
		carro3.setModelo("Cg Titan");
		carro3.setCor("Vermelha");
		carro3.setPlaca("AAS-200");
		carro3.setQtdRodas(2);
		carro3.setVeloMax(100);
		carro3.getMotor().setPotencia(11);
		carro3.getMotor().setQtdPist(2);
		
		System.out.println(" Marca---"+carro3.getMarca());
		System.out.println(" Modelo---"+carro3.getModelo());
		System.out.println(" Cor---"+carro3.getCor());
		System.out.println(" Placa---"+carro3.getPlaca());
		System.out.println(" Rodas---"+carro3.getQtdRodas());
		System.out.println(" Velocidade máx---"+carro3.getVeloMax()+" Km/h");
		System.out.println(" Nº de Pistões---"+carro3.getMotor().getQtdPist());
		System.out.println(" Potencia em cv---"+carro3.getMotor().getPotencia()+"cv");
		System.out.println("**********************************************");
		
		Veiculo carro4 = new Veiculo();
		carro4.setMarca("Reliant");
		carro4.setModelo("Robin 850");
		carro4.setCor("Amarelo");
		carro4.setPlaca("RWD-545");
		carro4.setQtdRodas(3);
		carro4.setVeloMax(128);
		carro4.getMotor().setPotencia(40);
		carro4.getMotor().setQtdPist(4);
		
		System.out.println(" Marca---"+carro4.getMarca());
		System.out.println(" Modelo---"+carro4.getModelo());
		System.out.println(" Cor---"+carro4.getCor());
		System.out.println(" Placa---"+carro4.getPlaca());
		System.out.println(" Rodas---"+carro4.getQtdRodas());
		System.out.println(" Velocidade máx---"+carro4.getVeloMax()+" Km/h");
		System.out.println(" Nº de Pistões---"+carro4.getMotor().getQtdPist());
		System.out.println(" Potencia em cv---"+carro4.getMotor().getPotencia()+"cv");
		System.out.println("**********************************************");
		
		Veiculo carro5 = new Veiculo();
		carro5.setMarca("Jeep");
		carro5.setModelo("Willys");
		carro5.setCor("Branco");
		carro5.setPlaca("WW-1940");
		carro5.setQtdRodas(4);
		carro5.setVeloMax(105);
		carro5.getMotor().setPotencia(54);
		carro5.getMotor().setQtdPist(4);
		
		System.out.println(" Marca---"+carro5.getMarca());
		System.out.println(" Modelo---"+carro5.getModelo());
		System.out.println(" Cor---"+carro5.getCor());
		System.out.println(" Placa---"+carro5.getPlaca());
		System.out.println(" Rodas---"+carro5.getQtdRodas());
		System.out.println(" Velocidade máx---"+carro5.getVeloMax()+" Km/h");
		System.out.println(" Nº de Pistões---"+carro5.getMotor().getQtdPist());
		System.out.println(" Potencia em cv---"+carro5.getMotor().getPotencia()+"cv");
		System.out.println("**********************************************");
		
		
	
	}
}



public class Teste {
    public static void main(String[] args) {
        Passeio carroPasseio1;
        carroPasseio1 = new Passeio();
        carroPasseio1.setMarca("Volkswagem");
        carroPasseio1.setModelo("Fusca");
        carroPasseio1.setCor("Preto");
        carroPasseio1.setPlaca("AAA-123");
        carroPasseio1.setQtdRodas(4);
        carroPasseio1.getMotor().setPotencia(46);
        carroPasseio1.getMotor().setQtdPist(4);
        carroPasseio1.setQtdPassageiros(4);





        System.out.println(" Marca---"+carroPasseio1.getMarca());
        System.out.println(" Modelo---"+carroPasseio1.getModelo());
        System.out.println(" Cor---"+carroPasseio1.getCor());
        System.out.println(" Placa---"+carroPasseio1.getPlaca());
        System.out.println(" Rodas---"+carroPasseio1.getQtdRodas());
        System.out.println(" Velocidade max---"+carroPasseio1.calcVel(120)+" m/h");
        System.out.println(" N de Pistoes---"+carroPasseio1.getMotor().getQtdPist());
        System.out.println(" Potencia em cv---"+carroPasseio1.getMotor().getPotencia()+"cv");
        System.out.println(" Quantidade de passageiros---"+carroPasseio1.getQtdPassageiros());
        System.out.println("---------------------------------------------------------");
        System.out.println("---------------------------------------------------------");

        Carga carroCarga1;
        carroCarga1 = new Carga();
        carroCarga1.setMarca("Mercedes-Benz");
        carroCarga1.setModelo("LP-321");
        carroCarga1.setCor("Azul");
        carroCarga1.setPlaca("ABB-321");
        carroCarga1.setQtdRodas(6);
        carroCarga1.getMotor().setPotencia(180);
        carroCarga1.getMotor().setQtdPist(6);
        carroCarga1.setCargaMax(10);
        carroCarga1.setTara(3);




        System.out.println(" Marca---"+carroCarga1.getMarca());
        System.out.println(" Modelo---"+carroCarga1.getModelo());
        System.out.println(" Cor---"+carroCarga1.getCor());
        System.out.println(" Placa---"+carroCarga1.getPlaca());
        System.out.println(" Rodas---"+carroCarga1.getQtdRodas());
        System.out.println(" Velocidade max---"+carroCarga1.calcVel(90)+" cm/h");
        System.out.println(" N de Pistoes---"+carroCarga1.getMotor().getQtdPist());
        System.out.println(" Potencia em cv---"+carroCarga1.getMotor().getPotencia()+"cv");
        System.out.println(" Carga maxima---"+carroCarga1.getCargaMax()+" toneladas");
        System.out.println(" Carga maxima---"+carroCarga1.getTara()+" toneladas");
        System.out.println("**********************************************");





    }
}

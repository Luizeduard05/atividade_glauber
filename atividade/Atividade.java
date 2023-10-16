package atividade;

public class Atividade {

    public static void main(String[] args) {
    
    Moto m1 = new Moto();
    m1.setNome("Fan");
    m1.setAno(2013);
    m1.setBau(true);
    m1.setCilindradas(150);
    m1.status();
    System.out.println(m1.getLigar());
 
    System.out.println("-----------------------------------");

    Carro c1 = new Carro();
    c1.setNome("Fusca");
    c1.setAno(1930);
    c1.setLigar(null);
    // c1.getDesligar();
    c1.setAutomatico(false);
    c1.setEsportivo(false);
    c1.status();

    }
}

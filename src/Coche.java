public class Coche {
    public int puertas;

    public Coche(int puertas) {

        this.puertas=puertas;
    }

    public void add_puerta(){
        this.puertas++;
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche(4);
        miCoche.add_puerta();
        System.out.println("Mi coche tiene " + miCoche.puertas + " puertas.");
    }

}

public class Main {
    public static void main(String[] args) {
        System.out.println(sumaTres(3, 4, 6));
        coche micoche = new coche();
        micoche.AgregarPuerta();
        System.out.println(micoche.puertas);
    }
    public static int sumaTres(int a, int b, int c){
        return a + b + c;
    }
}

class coche{
    public int puertas = 5;

    public void AgregarPuerta(){
        this.puertas++;
    }
}
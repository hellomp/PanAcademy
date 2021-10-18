package Heranca;

public class TestAnimal {
    public static void main(String[] args) {
        Animal rex = new Cachorro();
        Animal garibaldo = new Ave();
        rex.comunicar();
        rex.movimentar();
        garibaldo.movimentar();
        garibaldo.comunicar();
    }
}

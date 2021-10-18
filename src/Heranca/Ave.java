package Heranca;

public class Ave extends Animal{
    @Override
    public void comunicar() {
        System.out.println("Canto");
    }

    @Override
    public void movimentar() {
        System.out.println("Bate asas");
    }
}

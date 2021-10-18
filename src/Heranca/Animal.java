package Heranca;

/*Crie uma estrutura de herança para demonstrar o polimorfismo utilizando classes de animais
● Crie o método comunicar() e movimentar() na classe Animal
● Nas classes descendentes de animais, sobrescreva os métodos citados de acordo com os tipos de animais*/
public abstract class Animal {
    public String especie;

    public abstract void comunicar();
    public abstract void movimentar();
}

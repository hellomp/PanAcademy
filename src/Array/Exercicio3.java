package Array;

public class Exercicio3 {
    public static void main(String[] args) {
        Aluno joao = new Aluno();
        double[] notas = {10, 5.0, 7.0, 9.0, 10.0};
        joao.setNotas(notas);
        joao.setNome("João");
        System.out.println("Nome do aluno: " + joao.getNome());
        System.out.println("Média: " + joao.media());
        System.out.println("Maior nota: " + joao.maiorNota());
        System.out.println(joao.aprovado()? "Aprovado" : "Reprovado");
    }
}

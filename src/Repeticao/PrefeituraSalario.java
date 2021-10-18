package Repeticao;

/*A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00.*/

import java.util.ArrayList;
import java.util.Random;

public class PrefeituraSalario {
    public static void main(String[] args) {
        ArrayList<Double> salarios = new ArrayList<Double>();
        ArrayList<Integer> filhos = new ArrayList<Integer>();
        double maiorSalario = 0.0;
        double totalSalario = 0.0;
        double mediaSalario = 0.0;
        double mediaAluno = 0.0;
        Random r = new Random();

        for (int i = 0; i < 20; i++){
            double salario = r.nextDouble() * 10000;
            salarios.add(salario);
            totalSalario += salario;

            filhos.add(r.nextInt(6));
        }
        System.out.println(salarios);

    }

}

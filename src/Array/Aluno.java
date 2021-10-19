package Array;
/*        3. Crie de  uma classe Aluno com os seguintes atributos e métodos: -String nome,
        double[] notas,  aprovado(), maiorNota() e media() (além dos getters e setters
        necessários).
        dadas as notas: double[] notas = {10, 5.0, 7.0, 9.0, 10.0};, retorne as seguintes
        observações sobre o aluno: a maior nota, média e caso média maior que 7 =
        aprovado.*/
public class Aluno {
    String nome;
    double[] notas;

    public boolean aprovado(){
        return media() >= 7 ? true : false;
    }

    public double maiorNota(){
        double maior = 0.0;
        for (double nota: notas) {
            if(nota > maior){
                maior = nota;
            }
        }
        return maior;
    }

    public double media(){
        double media;
        double total = 0.0;
        for (double nota: notas) {
            total += nota;
        }
        media = total/notas.length;
        return media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}

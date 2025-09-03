import java.util.List;
import java.util.ArrayList;

public class Turma{
    private List<Aluno> alunos = new ArrayList<>();

    private List<Aluno> listAlunos;
    private TurmaDado Tdado;

    public Turma(){
        Tdado = new TurmaDado();
        listAlunos = Tdado.load();
    }

    public double calcMedia(){
        return 0.0;
    }

    public List<Aluno> getAlunos(){
        return null;
    }

    public int getTotalAlunos(){
        int tamanho = this.listAlunos.size();
        return tamanho;
    }

    public Aluno add(Aluno a){
        return a;
    }

    public void delete(Aluno a){
    }

}
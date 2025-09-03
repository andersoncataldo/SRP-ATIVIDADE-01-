import java.util.List;
import java.util.ArrayList;

public class TurmaDado{

    public List<Aluno> listaDado = new ArrayList<Aluno>();

    public List<Aluno> load(){
        List<Aluno> ListaDado = new ArrayList<Aluno>();
        return ListaDado;

    }

    public void save(Aluno a){
    listaDado.add(a);
    }

    public void update(String matricua, Aluno alunoAtualizado){
        for (int i=0; i<listaDado.size(); i++){
            Aluno aluno = listaDado.get(i);
            if (aluno.getMatricula().equals(matricua)){
                listaDado.set(i, alunoAtualizado);
            }
        }
    }

    public void delete(Aluno a){
        listaDado.remove(a);
    }

}
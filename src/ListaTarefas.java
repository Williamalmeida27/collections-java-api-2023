import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
	//Atributo da classe lista tarefas.
	private List<Tarefas> tarefaList;
	
	public ListaTarefas() {
		this.tarefaList = new ArrayList<>();
	}
	
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefas(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefas> tarefasParaRemover = new ArrayList<>();
		
		for (Tarefas r : tarefaList) {
			if (r.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(r);
			}
			
		}
		tarefaList.removeAll(tarefasParaRemover);
	}

	public int obterNumeroTotalTarefas() {
		if (tarefaList == null) {
			return 0;
		}
		return tarefaList.size();
	}
	
	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}

	public static void main(String[] args) {
		ListaTarefas tarefa1 = new ListaTarefas();		
		System.out.println(tarefa1.obterNumeroTotalTarefas());
		
		tarefa1.adicionarTarefa("Tarefa 1");
		System.out.println(tarefa1.obterNumeroTotalTarefas());
		
		tarefa1.adicionarTarefa("Tarefa 2");
		System.out.println(tarefa1.obterNumeroTotalTarefas());
		
		tarefa1.adicionarTarefa("Tarefa 1");
		tarefa1.obterDescricoesTarefas();
		System.out.println(tarefa1.obterNumeroTotalTarefas());
		
		tarefa1.removerTarefa("Tarefa 1");
		tarefa1.obterDescricoesTarefas();
		System.out.println(tarefa1.obterNumeroTotalTarefas());
	}
	
}

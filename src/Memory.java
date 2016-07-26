import java.util.HashMap;

public class Memory {
	//USA hashmap para simular uma memoria
	private HashMap<String, Object> memoria;

	public Memory(){
		 memoria = new HashMap<String, Object>();
	}

	public Object lookup (String key){
		Object looked = memoria.get(key);
		if (looked == null)
			return 0;
		else return looked;
	}

	public void update (String key, Object value){
		if((int)lookup(key) == 0)
			memoria.put(key, value);
		else 
			memoria.replace(key, value);
	}
}
/*
metodo interprete abastratro para todos
 int interprete(Memory mem) return valor avalaia expressao,
classe Stm , interprete(Memory mem) void para comando executa comando
 */
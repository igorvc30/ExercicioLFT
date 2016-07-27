import java.util.HashMap;

public class Memory {
	//USA hashmap para simular uma memoria
	private static HashMap<String, Integer> memoria;

	public Memory(){
		 memoria = new HashMap<String, Integer>();
	}

	public Integer lookup (String key){
		Integer looked = memoria.get(key);
		if (looked == null)
			return 0;
		else return looked;
	}

	public void update (String key, Integer value){
		System.out.println(key+"="+value);
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
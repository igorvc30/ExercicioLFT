import java.util.HashMap;

public class Memory {
	private HashMap<String, Integer> memoria;

	public Memory(){
		 memoria = new HashMap<String, Integer>();
	}

	public Integer lookup (String key){
		Integer looked = memoria.get(key);
		if (looked == null)
			return 0; // poderia ser null, mas caso nao exista valor, quebra o programa
		else return looked;
	}

	public void update (String key, int value){
		if((int)lookup(key) == 0)
			memoria.put(key, new Integer(value));
		else 
			memoria.replace(key, new Integer(value));
	}

	@Override
	public String toString() {
		return memoria.toString() ;
	}
}

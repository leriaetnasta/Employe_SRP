package tp3;

import java.util.HashMap;
import java.util.Map;

public class ClientClass {







	public void getFreqStats(String[] words) {

		Map<String, Integer> map = new HashMap<>();
		for (String i : words) {
			Integer cpt = map.get(i);
			if(cpt == null) {
				cpt=1;
			}else{
				cpt++
			}
			map.put(i, cpt);
		}

	}}
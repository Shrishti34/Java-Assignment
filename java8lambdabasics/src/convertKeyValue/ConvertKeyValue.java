package convertKeyValue;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConvertKeyValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
 
        // 1. Using an iterator
        Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
 

	}

}

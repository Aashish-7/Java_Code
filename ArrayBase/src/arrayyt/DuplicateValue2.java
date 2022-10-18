package arrayyt; // by using HashTable

import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class DuplicateValue2 {

	public static void main(String[] args) {
		int []a = {3,5,4,3,2,2,1};
		
		
		Map(Integer, Integer) hm = new HashMap<>();
		for(int no:a) {
			Integer Count = hm.get(no);
			if(count==null) {
				hm.put(no,1);
			}
			else {
				count = count+1;
				hm.put(no,count);
			}
		}
		System.out.println("Duplicate elements are !!");
		Set<map.Entry<Integer,Integer>> es = hm.entrySet();
		for(Map<K, V>.Entry<K, V>)
	}

}

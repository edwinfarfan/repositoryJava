package com.pe.collections;

import java.math.BigInteger;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		Map map = new HashMap();
		//Map map = new TreeMap(new MyCompr());
		
		for (int i = 0, n = args.length; i < n; i++) {
			String key = args[i];
			//Integer key = Integer.parseInt(args[i]);
			Integer frequency = (Integer) map.get(key);
			if (frequency == null) {
				frequency = (int)(Math.random() *10);
			} else {
				int value = frequency.intValue();
				frequency = new Integer(value + 1);
			}
			map.put(key, frequency);
		}
		System.out.println(map);
		Map sortedMap = new TreeMap(map);
		System.out.println("sortedMap:\t" + sortedMap);
	}

}

class MyCompr implements Comparator<Integer>{
	 
    @Override
    public int compare(Integer s1, Integer s2) {
        return s1.compareTo(s2);
    }
     
}
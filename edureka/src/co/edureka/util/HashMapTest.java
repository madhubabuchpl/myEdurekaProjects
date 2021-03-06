package co.edureka.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) throws InterruptedException {
		HashMap<String, Float> bank = new HashMap<String, Float>();
		
		System.out.println(bank.put("Sunil", 25000f)); //null
		System.out.println(bank.put("Sunil", 12500.5f)); //25000.0
		System.out.println(bank.put("Anil", 25000f)); //null
		bank.put("Praveen", 45000f);
		bank.put("Rahul", 32500.5f);
		bank.put("Sanjay", 75000f);
		
		System.out.println(bank);
		System.out.println("----------------------------------------------------------");
		
		float bal = bank.get("Sunil");
		System.out.println("A/C Balance of \"Sunil\" = " + bal);
		bal = bal + 1250.5f;
		bank.put("Sunil", bal);
		System.out.println(bank);
		System.out.println("----------------------------------------------------------");
		
		System.out.print("A/C Holders --->   ");
		Set<String> names = bank.keySet();
		for(String name : names) {
			System.out.print(name + " | ");
		}
		System.out.println();
		System.out.println("----------------------------------------------------------");
		
		Set<Map.Entry<String, Float>> entries = bank.entrySet();
		Iterator<Map.Entry<String, Float>> it = entries.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Float> entry = it.next();
			String name = entry.getKey();
			Float val = entry.getValue();
			System.out.println(name + " = " + val);
			Thread.sleep(1000);
		}
		System.out.println("----------------------------------------------------------");
	}

}


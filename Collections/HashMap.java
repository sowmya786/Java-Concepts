package Collections;

public class HashMap {

	public static void main(String[] args) {
		java.util.HashMap<Integer, String> map = new java.util.HashMap<>();
        //Insert a Key value mapping into the map
		map.put(1, "get");
		map.put(2, "getTitle");
		map.put(3, "getcurrentUrl");
		map.put(4, "close");
		map.put(5, "quit");
		map.put(6, "getSize");
		map.put(7, "sendKeys");
		map.put(8, "getAttribute");
		map.put(9, "getTagname");
		map.put(10, "getText");
		System.out.println("prints key-value : ");
		System.out.println("map = " + map);
		
       //Fetch the value of a Key
		System.out.println(map.get(6));
		
       //Create a clone/copy of HashMap
		System.out.println(map.clone());
		
        //Check if the given Key is in the Map
		System.out.println(map.containsKey(3));
		
		// Check if the value is in the Map
		System.out.println(map.containsValue("Sharan"));
		
        //Check if the map is empty
		System.out.println(map.isEmpty());
		
        //Print the size of the Map to the console
		System.out.println(map.size());
		
       //Print all the Keys of the map to the console
		System.out.println(map.keySet());
		
       //Remove a specific Key-value pair
		map.remove(2, "Rohit");
		
        //Copy all the elements of the Map to another Map
		java.util.HashMap<Integer, String> duplicateMap = new java.util.HashMap<>();

		duplicateMap.putAll(map);
		System.out.println("Mapcopy = " + duplicateMap);

	}

}

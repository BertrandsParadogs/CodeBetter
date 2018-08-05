public class TwoSum {
    Map<Integer,Boolean> map;
    
    public TwoSum() {
        map = new HashMap<>();
    }
    
    // Add the number to an internal data structure.
	public void add(int number) {
	    map.put(number, !map.getOrDefault(number, true));
	}

    // Find if there exists any pair of numbers which sum is equal to the value.
	public boolean find(int value) {
	    for(int num : map.keySet())
            if (map.containsKey(value - num) && (num*2 != value || map.get(num)))
                return true;
        return false;
	}
}
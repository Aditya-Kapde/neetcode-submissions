class TimeMap {
private Map<String, TreeMap<Integer, String>> keystore;
    public TimeMap() {
        keystore=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        keystore.putIfAbsent(key, new TreeMap<>());
        keystore.get(key).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        if(!keystore.containsKey(key))
        {
            return "";
        }
        Integer floorkey=keystore.get(key).floorKey(timestamp);
        return (floorkey==null)?"":keystore.get(key).get(floorkey);
    }
}

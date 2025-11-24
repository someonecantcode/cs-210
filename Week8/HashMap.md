# Hashmaps

```java
import java.util.HashMap;

HashMap<keyType, valueType> hs = new HashMap<>();
hs.put(1, "my balls hurt");

System.out.print(hs);
/*
* {1=my balls hurt} // hashmap
* [my balls hurt] // arraylist
* [my balls hurt] // hashset
*
*/

System.out.print(hm.size()); // 1
System.out.print(hm.get(1)); // my balls hurt

```
| Methods        | Return    |
| -------------- | --------- |
| `hm.put(KeyType a, ValueType b)` | ValueType       |
| `hm.get(Object key)` | ValueType       |
| `hm.size()` | int       |
| `hm.containsKey(Object o)` | void |
| `hm.containsValue(Object o)` | void |
| `hm.clear()` | void |
| `hm.remove(Object o)` | ValueType |
| `hm.remove(Object key, Object value)` | boolean |
| `hm.keySet()` | Set<K> |
| `hm.values()` | Set<V> |

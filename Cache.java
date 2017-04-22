import java.util.LinkedHashMap;
import java.util.Map;

public class Cache<K, V> extends LinkedHashMap<K, V> {

	private int size;

	private Cache(int size) {
		super(size, 0.75f, true);
		this.size = size;
	}

	public static <K, V> Cache<K, V> newInstance(int size) {
		return new Cache<K, V>(size);
	}

	public void setMaxSize(int size) {
		this.size = size;
	}

	@Override
	protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
		return size() > size;
	}

	public static void main(String[] args) {

		Cache<String, String> lrunCache = Cache.newInstance(2);

		lrunCache.put("1", "1");

		lrunCache.put("2", "2");

		lrunCache.put("3", "3");

		lrunCache.put("4", "4");

		System.out.println(lrunCache);
	}

}

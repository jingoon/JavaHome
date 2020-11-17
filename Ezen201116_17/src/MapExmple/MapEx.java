package MapExmple;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapEx {
	
	public void me1() {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("비밀번호", 1234);
		map.put("집전화", 01012341234);
		map.put("집전화번호", 0212341234);
		map.put("비밀번호", 5678);
		
		System.out.println(map.get("비밀번호"));
		
		map.remove("집전화번호");
		
		Set<String> keys =map.keySet();
		System.out.println(keys);
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key =  it.next();
			int val = map.get(key);
			System.out.println("key: "+key );
		}
		
		
		Collection<Integer> vals = map.values();
		Iterator<Integer> it2 = vals.iterator();
		System.out.println(vals);
		while (it2.hasNext()) {
			Integer value =  it2.next();
			System.out.println("value: "+value);
		}
	}
	
	public void me2() {
		Map<String, List<Dog>> map = new HashMap<String, List<Dog>>();
		
		Dog dog1 = new Dog("d001", "누렁이", "진도인", 3);
		Dog dog2 = new Dog("d002", "백구", "진도인", 4);
		Dog dog3 = new Dog("d003", "happy", "독일인", 3);
		Dog dog4 = new Dog("d004", "타크", "독일인", 2);
		
		List<Dog> list1 = new ArrayList<Dog>();
		list1.add(dog1);
		list1.add(dog2);
		List<Dog> list2 = new ArrayList<Dog>();
		list2.add(dog3);
		list2.add(dog4);
		
		
		map.put("진돗개", list1);
		map.put("독일개", list2);
		
		List<Dog> listDog1 = map.get("진돗개");
		for(int i=0;i<listDog1.size();i++) {
			Dog dog=listDog1.get(i);
			System.out.println(dog.getName());
			 
		}
		List<Dog> listDog = map.get("독일개");
		for(int i=0;i<listDog.size();i++) {
			Dog dog=listDog.get(i);
			String ta= dog.getName();
			if(ta == "타크") {
				System.out.println(dog.getMaster());
			}
			 
		}
		
	}
	public void me3(String s) {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("txt", "텍스트파일");
		map.put("png", "이미지파일");
		map.put("jpg", "이미지파일");
		map.put("avi", "동영상파일");
		map.put("mp3", "음원파일");
		
		int a = s.lastIndexOf(".");
		String val= map.get(s.substring(a+1).toLowerCase());
		if(val == null) {
			System.out.println("시스템파일");
		}else {
			System.out.println(val);
		}
		
	}

}

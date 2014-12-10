package com.test.core.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {

//	public static void main(String... args) {
//		Employee e1 = new Employee(12, "xyz", 1);
//		Employee e2 = new Employee(12, "xyz", 1);
//		Employee e3 = new Employee(12, "xyz", 1);
//
//		Set s = new HashSet();
//		s.add(e1);
//		s.add(e2);
//		s.add("a");
//		s.add("a");
//
//		System.out.println(s);
//		System.out.println(s.contains(e2));
//		System.out.println(s.contains(e3));
//		System.out.println(solution(4));
		
		
		
//	}
	
	public static void main(String[] args) {
//        System.out.println(kmp("byebye"));
//        System.out.println(kmp("ababab"));
//        System.out.println(kmp("aaaa"));
        System.out.println(cyclicAutomorphism("byebye"));
        System.out.println(cyclicAutomorphism("ababab"));
        System.out.println(cyclicAutomorphism("aaaa"));
    }
    public static int cyclicAutomorphism(String A) {
        // if such i exist beside i = 0.
        // 1. A.length() is even:
        // find the min i from 0 to A.length() that shifted is equal to original.
        // Because the original string and shitfted one is mismatched by i position.
        // then original string can be devided into i parts, and each part is equal.
        // 2. A.length() is odd.
        // Only if string is consists of one char. Otherwise there is no match
        // beside i = 0.
        int len = A.length();
        String temp = A + A;
        int i;
        for (i = 1; i < len; ++i) {
            if (len % i == 0 && temp.substring(i, i + len).equals(A)) {
                break;
            }
        }
        return len / i;
    }
    public static int kmp(String A) {
        // Since I just learnt KMP so trying to implement this with KMP
        // overlay function.
        int[] overlay = new int[A.length()];
        overlay[0] = -1;
        for (int i = 1; i < A.length(); ++i) {
            int index = overlay[i - 1];
            while (index >= 0 && A.charAt(index + 1) != A.charAt(i)) {
                index = overlay[index];
            }
            if (A.charAt(index + 1) == A.charAt(i)) {
                overlay[i] = index + 1;
            } else {
                overlay[i] = - 1;
            }
        }
        for (int i  = 0; i < A.length(); ++i) {
            System.out.println(A.substring(0, i + 1) + " " + overlay[i]);
        }
        int retval = overlay[overlay.length - 1];
        System.out.println("last index " + retval);
        while (A.length() % (A.length() - retval - 1) != 0) {
            retval = overlay[retval - 1];
        }
        return A.length() / (A.length() - retval - 1);
    }
	
	 public static int solution(int N) {
	        List<Integer> list = new ArrayList<Integer>();
//	        list.add(1);
	        for(int i=0;i<=32;i++){
	            for(int j=0;j<=32;j++){
	                list.add((int)(Math.pow(2, i) * Math.pow(3, j)));
	            }
	        }
	        Collections.sort(list);
	        System.out.println(list);
	        return list.get(N);
	    }
}

class Employee {
	private int age;
	private String name;
	private int id;

	Employee(int age, String name, int id) {
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
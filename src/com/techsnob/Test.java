package com.techsnob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


class Employee {
	
	Long id;
	Long empId;
	
	public Employee(Long id, Long empId) {
		super();
		this.id = id;
		this.empId = empId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public void print() {
		System.out.println("Emp");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId == null) {
			if (other.empId != null)
				return false;
		} else if (!empId.equals(other.empId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}

class Department extends Employee {
	public Department(Long id, Long empId) {
		super(id, empId);
	}

	public void print() {
		System.out.println("Dep");
	}
}

public class Test {
	public static void main(String[] args) {

//		Map<Integer, String> map = new TreeMap<>();
//		for (int i = 0; i < 32; i++) {
//			map.put(i, "abc");
//		}
//		System.out.println(map);

//		List<Integer> values= new ArrayList<>();
//		values.add(1);
//		values.add(2);
//		values.add(3);
//		
//		for (int i = 0; i < values.size(); i++) {
//			if (values.get(i) == 2) {
//				values.remove(i);
//				break;
//			}
//		}
//		List<Integer> values1= new ArrayList<>();
//		values1.add(1);
//		values1.add(2);
//		values.removeAll(values1);
//		System.out.println(values);

//		for (Integer value : values) {
//			values.remove(value);
//		}
//		for (Iterator<Integer> iterator = values.iterator(); iterator.hasNext();) {
//			Integer value = (Integer) iterator.next();
//			if( value ==2) {
//				iterator.remove();
//			}
//		}
//		System.out.println(values);

//		Employee emp = new Department();
//		emp.print();

		/*
		 * String s1 = "revereseit"; char[] s2 = new char[s1.length()]; for (int i =
		 * s1.length()-1; i >= 0; i--) { s2[s1.length() - i - 1] = s1.charAt(i); }
		 * System.out.println(s2);
		 * 
		 * 
		 * byte[] s4 = new byte[s1.length()]; for (int i = s1.length()-1; i >= 0; i--) {
		 * s4[s1.length() - i - 1] = (byte) s1.charAt(i); }
		 * System.out.println(s4.toString()); System.out.println(new String(s4));
		 * 
		 * 
		 * String input = "Geeks for Geeks";
		 * 
		 * StringBuilder input1 = new StringBuilder();
		 * 
		 * // append a string into StringBuilder input1 input1.append(input);
		 * 
		 * // reverse StringBuilder input1 input1.reverse(); System.out.println(input1);
		 */
//		try {
//			call();
//		} catch (Exception e) {
//			//System.out.println(Arrays.asList(e.getStackTrace()).stream().limit(10).);
//		}
		/*
		 * List<Employee> emps = new ArrayList<>(); emps.add(new Employee(5L, 10L));
		 * emps.add(new Employee(15L, 20L)); System.out.println(emps.stream().map( e ->
		 * e.getId() + e.getEmpId() + "").collect(Collectors.toList()));
		 */
		/*
		 * int[] a = new int[] {2,6,7,8,9,4,2,3,2,1,5};
		 * 
		 * for(int i=0; i < a.length; i++){ for(int j=i+1; j < a.length; j++ ){ if(a[i]
		 * < a[j]){ int temp = a[i]; a[i] = a[j]; a[j] = temp; } } }
		 * 
		 * System.out.println(Arrays.toString(a));
		 */
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 4, 5, 6, 9 }, { 1, 5, 7, 6 }, { 2, 8, 6, 7 } };
		int[][] res = new int[4][5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i].length > arr.length) {
					
				} else {
					res[i][j] = arr[i][j];
				}
			}
		}
		System.out.println(Arrays.toString(res));
	}

	public static void call() {
		throw new IllegalArgumentException();
	}
}

package Algo;

public class Main {
	static void foo(int a) {
		LinkedList list = new LinkedList();
		try {
			foo(a);
		} catch (StackOverflowError e) {
			System.out.println(e.getMessage());
		}
	}
    public static void main(String[] args) {
		foo(2);
		int[][] i = new int[5][];
		i[0] = new int[10];
		System.out.println(i[0].length);
		System.out.println(i.length);
//        Map<String, Integer> map = new HashMap<>();
//
//        map.put("Jack", 5);
//        map.put("Jack1", 5);
//        List<Integer> list = Arrays.asList(1,2,34,5,6,7,0,98,7,6,5,4,6,5,54,5,4,54);
//		LinkedList linkedList = new LinkedList(new Node(100));
//		list.forEach(System.out::println);
//		List<Integer> newList = list.stream().filter(num -> num != 0 && num % 2 == 0).toList();
//
//		FunctionalInter run = () -> newList.forEach(System.out::println);
//		run.execute();
    }
}


// -1,-7,7,-4,19,6,	-9,-5,-2,-5
// 	

@FunctionalInterface
interface FunctionalInter {
	void execute();
}

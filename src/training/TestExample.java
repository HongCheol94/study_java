package training;

public class TestExample {

	public static void main(String[] args) {
		
		Parents sortFirst = new Parents();
		
		Child sortSecond = new Child();
		
		int[] arr = {40, 10, 20};
		
		System.out.println("정렬 전 ==============");
		sortFirst.printAtt(arr);
		System.out.println("정령 후 ==============");
		sortFirst.sortByasc(arr);
		sortFirst.printAtt(arr);
		
		System.out.println("부모 메서드2 ============");
		System.out.println(sortFirst.getSum(arr));
		
		System.out.println("자식 메서드2 ============");
		System.out.println(sortSecond.getSum(arr));
		
		System.out.println("값 차이 ==============");
		System.out.println(sortFirst.getSum(arr) - sortSecond.getSum(arr) );
		

	}

}

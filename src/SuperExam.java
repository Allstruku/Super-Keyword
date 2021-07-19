// 객체가 실행이 될 때에 반드시 생성자를 실행하고 생성이 된다

public class SuperExam {
	public static void main(String[] args) {
		Child c1 = new Child();
		// 객체를 만듦으로써 생성자들이 실행이된다. 그럴 때, Parent class가 Child class 보다 먼저 실행이된다
		// 부모의 생성자를 호출 할 때에는 부모 객체를 나타내는 Super keyword를 사용한다
	}
}

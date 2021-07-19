
class Child extends Parent{
	public Child() {
		// 실제로는 컴파일러가 돌아사면서 자동으로 이 자리에 super();를 추가한다
		// 근데 부모 클래스에 매개변수를 받는 생성자, 즉 기본 생성자가 아닌 경우 super(매개변수);를 넣으면 된다
		super(" at quarter before eleven");
		System.out.println("Child의 생성자가 실행이 되었습니다");
	}
	// 위 코드는 Child 클래스의 매개변수를 안 받는 기본생성자이다
	// Child 클래스는 Parent 클래스한테서 상속을 받고 있다
}

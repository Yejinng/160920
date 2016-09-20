package chapter1;

public class Student extends Person {

	public Student() {
		age = 40;		 // 부모 디폴트 접근자는 접근가능(단, ㄱ같은 패키지 에서만)
		name = "박예진";	 // protected는 자식에서 접근가능 (다른 패키지에서도 가능)
		height = 167;	 // public 접근가능
		// weight = 535;  // private는 접근불가
	}
}

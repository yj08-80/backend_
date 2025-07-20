package day15;

public class 실습12 { // class start
    public static void main(String[] args) {


//[JAVA] 실습12 : 클래스의 상속
//[ 문제 ] 아래 클래스 상속 관련 문제를 해결하시오.
//[ 제출방법 ] 코드가 작성된 파일이 위치한 깃허브 상세 주소를 제출하시오.
//
//[문제 1] 기본 상속
//1. name(문자열) 멤버 변수를 가진 Person 클래스를 만드세요.
//2. Person 클래스를 상속받는 Student 클래스를 만드세요.
// Student 클래스에는 studentId(정수) 멤버 변수를 추가하세요.
//3. main 함수에서 Student 객체를 생성하고,
// 상속받은 name과 자신의 studentId에 값을 저장한 뒤 모두 출력하세요.
        Student student = new Student();
        student.name = "유재석";
        student.studentId = 1111;

        System.out.println( student.name );
        System.out.println( student.studentId );

//
//[문제 2] 메소드 오버라이딩 (Method Overriding)
//1. "동물이 소리를 냅니다."를 출력하는 makeSound() 메소드를 가진 Animal 클래스를 만드세요.
//2. Animal을 상속받고, makeSound() 메소드를 재정의하여 "고양이가 야옹하고 웁니다."를 출력하는 Cat 클래스를 만드세요.
//3. main 함수에서 Cat 객체를 생성하고 makeSound() 메소드를 호출하여, 재정의된 내용이 출력되는지 확인하세요.
        Cat cat = new Cat();
        cat.makeSound();
//
//[문제 3] 생성자 호출 순서
//1. 생성자에서 "부모 클래스 생성자 실행"을 출력하는 Machine 클래스를 만드세요.
//2. Machine을 상속받고, 생성자에서 "자식 클래스 생성자 실행"을 출력하는 Computer 클래스를 만드세요.
//3. main 함수에서 Computer 객체를 생성할 때, 콘솔에 출력되는 생성자 호출 순서를 확인하세요.
        Computer computer = new Computer();
        // 부모 -> 자식 순서로 실행
//
//[문제 4] 다형성: 자동 타입 변환 (Upcasting)
//1. Figure 클래스를 만드세요.
//2. Figure를 상속받는 Triangle 클래스를 만드세요.
//3. main 함수에서 Triangle 객체를 생성하여 Figure 타입의 변수에 저장하는 코드를 작성하고,
// 이것이 가능한 이유를 주석으로 설명하세요.
        Triangle triangle = new Triangle();
        Figure figure = triangle;
        // figure가 부모 triangle는 자식 - 상속 (자식꺼 부모 가능)

//
//[문제 5] 다형성과 오버라이딩
//1."도형을 그립니다."를 출력하는 draw() 메소드를 가진 Shape 클래스를 만드세요.
//2.Shape을 상속받고, draw() 메소드를 재정의하여 "원을 그립니다."를 출력하는 Circle 클래스를 만드세요.
//3.main 함수에서 Shape shape = new Circle(); 코드를 작성한 뒤,
// shape.draw()를 호출했을 때 어떤 결과가 나오는지 확인하고 그 이유를 주석으로 설명하세요.
        Shape shape = new Circle();
        shape.draw();
        // 실제 생성된 객체는 Circle
//
//[문제 6] instanceof와 강제 타입 변환 (Downcasting)
//1. Vehicle 클래스와 이를 상속받는 Bus 클래스를 만드세요.
// Bus 클래스에만 checkFare() 메소드("요금을 확인합니다.")를 추가하세요.
//2. main 함수에서 Vehicle vehicle = new Bus(); 코드를 작성하세요.
//3. if문과 instanceof 연산자를 사용하여 vehicle 변수가 Bus 타입인지 확인하세요.
//4. 만약 Bus 타입이 맞다면, Bus 타입으로 강제 변환한 뒤 checkFare() 메소드를 호출하세요.
        Vehicle vehicle = new Bus();
        if ( vehicle instanceof Bus ){
            Bus vehicle1 = (Bus) vehicle; // 강제 타입 변환
            vehicle1.checkFare();
        }
//
//[문제 7] 다형성을 활용한 객체 배열
//1. "음료를 마십니다."를 출력하는 drink() 메소드를 가진 Beverage 클래스를 만드세요.
//2. Beverage를 상속받는 Coke와 Coffee 클래스를 만들고,
// 각 클래스에서 drink() 메소드를 오버라이딩하여 "콜라를 마십니다.", "커피를 마십니다."를 출력하도록 하세요.
//3. main 함수에서 Beverage 타입의 배열을 생성하고, 그 안에 Coke 객체와 Coffee 객체를 저장하세요.
//4. 반복문을 사용하여 배열의 모든 요소를 꺼내 drink() 메소드를 호출하고, 각기 다른 결과가 출력되는 것을 확인하세요.
        Beverage[] beverages = new Beverage[2]; // 배열 생성
        beverages[0] = new Coke();
        beverages[1] = new Coffee();
        // 반복문 사용
        for( Beverage beverage : beverages ){
            beverage.drink();
        }
        

//
//[문제 8] 다형성을 활용한 매개변수
//1. Weapon 클래스와 이를 상속받는 Sword, Gun 클래스를 만드세요. 
// 각 클래스는 "무기로 공격합니다.", "검으로 공격합니다.", "총으로 공격합니다."를 출력하는 attack() 메소드를 가집니다. (오버라이딩 활용)
//2. Weapon 타입의 매개변수를 받아 그 객체의 attack() 메소드를 호출하는 Character 클래스와 use(Weapon weapon) 메소드를 만드세요.
//3. main 함수에서 Sword 객체와 Gun 객체를 생성한 뒤, 이 객체들을 Character의 use() 메소드에 인자로 전달하여 각기 다른 결과가 출력되는 것을 확인하세요.
// System.out.println();
        
//
//[문제 9] 필드와 메소드의 오버라이딩 차이
//1. String name = "상위"; 필드와 method() 메소드("상위 메소드" 출력)를 가진 SuperClass를 만드세요.
//2. SuperClass를 상속받고, String name = "하위"; 필드와 method() 메소드("하위 메소드" 출력)를 가진 SubClass를 만드세요.
//3. SuperClass obj = new SubClass(); 로 객체를 생성한 뒤, obj.name과 obj.method()를 각각 호출했을 때의 결과를 확인하고, 왜 다른 결과가 나오는지 주석으로 설명하세요.
//
//[문제 10] 다중 상속 관계
//1. Device 클래스를 만드세요.
//2. Device를 상속받는 Electronic 클래스를 만드세요.
//3. Electronic을 상속받는 Laptop 클래스를 만드세요.
//4. main 함수에서 Laptop 객체를 생성한 뒤, 이 객체가 Electronic 타입과 Device 타입으로도 형 변환이 가능한지 instanceof 연산자로 확인하고 결과를 출력하세요.
    }
}// class end


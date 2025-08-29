# 프로젝트 제목

## 프로젝트 개요

이 프로젝트는 객체 지향 프로그래밍(OOP)의 핵심 개념인 **상속**과 **은닉(캡슐화)**을 자바 코드로 구현한 예제입니다.

## 주요 개념

x,y 좌표를 이용하여 특정 도형의 넓이 구하기.

## 파일별 설명

### 1. Pointget.java (인터페이스)

해당 인터페이스를 상속받는 모든 클래스들이 x,y좌표를 획득하게끔 함.

### 2. Point.java (특정 좌표를 획득하고 관리하는 클래스)

Pointset.java로 부터 setX, setY 구현을 강제받아서, 해당 클래스 내부의 x,y의 변수에 값을 받는
setX, setY를 구현하고, x,y 값을 보유하고있음.

### 3. Polygon.java (도형 넓이 계산 클래스)

Point.java를 상속 받아서, 해당 클래스가 보유하고 있는, 도형 이름(Circle, Triangle etc..)을 이용한
메소드 혹은 Controller를 통해 연산을 제어함.


## 프로젝트 실행 방법

1.  프로젝트의 모든 자바 파일을 컴파일합니다.
    ```bash
    javac Circle.java Shape.java Main.java
    ```
2.  `Main` 클래스를 실행합니다.
    ```bash
    java Main
    ```

## 실행 결과
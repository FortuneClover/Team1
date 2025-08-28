package math;

// Pointget 인터페이스를 구현하여 getX()와 getY() 메서드를 강제 구현합니다.
public class Point implements Pointget {
    // x, y 좌표는 외부에서 직접 변경할 수 없도록 private으로 선언하여 은닉(캡슐화)합니다.
    private double x;
    private double y;

    // 생성자: Point 객체를 생성할 때 x, y 좌표를 초기화합니다.
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Pointget 인터페이스로부터 강제받은 getX() 메서드 구현
    // x 좌표 값을 반환합니다.
    @Override
    public double getX() {
        return this.x;
    }

    // Pointget 인터페이스로부터 강제받은 getY() 메서드 구현
    // y 좌표 값을 반환합니다.
    @Override
    public double getY() {
        return this.y;

    }
}

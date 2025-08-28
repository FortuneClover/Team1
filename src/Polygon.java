// 도형 넓이 계산 클래스: Point를 상속받아 좌표(x,y)를 보유
public class Polygon extends Point {

    public Polygon(double x, double y) {
        super(x, y);
    }

    // 도형 이름으로 분기하여 넓이 계산 (README 문구에 맞춤)
    // circle : p1=반지름
    // triangle : p1=밑변, p2=높이
    // rectangle : p1=가로, p2=세로
    public double areaByName(String shapeName, double p1, double p2) {
        if (shapeName == null) throw new IllegalArgumentException("도형 이름이 필요합니다.");
        switch (shapeName.toLowerCase()) {
            case "circle":
                requirePositive(p1, "반지름");
                return Math.PI * p1 * p1;

            case "triangle":
                requirePositive(p1, "밑변");
                requirePositive(p2, "높이");
                return 0.5 * p1 * p2;

            case "rectangle":
                requirePositive(p1, "가로");
                requirePositive(p2, "세로");
                return p1 * p2;

            default:
                throw new UnsupportedOperationException("지원하지 않는 도형: " + shapeName);
        }
    }

    // 각 도형을 메서드로 바로 쓰고 싶으면(오타 방지) 아래 3개도 제공
    public double Circle(double r) {
        requirePositive(r, "반지름");
        return Math.PI * r * r;
    }

    public double Triangle(double base, double height) {
        requirePositive(base, "밑변");
        requirePositive(height, "높이");
        return 0.5 * base * height;
    }

    public double Rectangle(double w, double h) {
        requirePositive(w, "가로");
        requirePositive(h, "세로");
        return w * h;
    }

    private static void requirePositive(double v, String name) {
        if (v <= 0) throw new IllegalArgumentException(name + "은(는) 양수여야 합니다.");
    }
}

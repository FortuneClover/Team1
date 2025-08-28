import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Polygon shape = null;

        while (true) {
            System.out.println("================================");
            System.out.println("Select Polygon Menu");
            System.out.println("1. Circle");
            System.out.println("2. Triangle");
            System.out.println("3. Square");
            System.out.println("4. Exit");
            System.out.println("================================");
            System.out.print("Select >>>>> ");

            int choice = input.nextInt();

            if (choice == 4) {
                System.out.println("Exiting...");
                break;
            }

            // 좌표 입력
            System.out.print("Enter X: ");
            double x = input.nextDouble();
            System.out.print("Enter Y: ");
            double y = input.nextDouble();

            // Polygon 객체 생성
            shape = new Polygon(x, y);

            double p1 = 0, p2 = 0;
            String shapeName = "";

            switch (choice) {
                case 1: // Circle
                    shapeName = "circle";
                    System.out.print("Enter radius: ");
                    p1 = input.nextDouble();
                    break;

                case 2: // Triangle
                    shapeName = "triangle";
                    System.out.print("Enter base: ");
                    p1 = input.nextDouble();
                    System.out.print("Enter height: ");
                    p2 = input.nextDouble();
                    break;

                case 3: // Square (Rectangle)
                    shapeName = "rectangle";
                    System.out.print("Enter width: ");
                    p1 = input.nextDouble();
                    System.out.print("Enter height: ");
                    p2 = input.nextDouble();
                    break;

                default:
                    System.out.println("Invalid selection.");
                    continue;
            }

            // 넓이 계산
            try {
                double area = shape.areaByName(shapeName, p1, p2);
                System.out.printf("Result: %s area = %.2f (at X: %.1f, Y: %.1f)%n",
                        shapeName, area, shape.getX(), shape.getY());
            } catch (Exception e) {
                System.out.println("Error calculating area: " + e.getMessage());
            }
        }

        input.close();
    }
}

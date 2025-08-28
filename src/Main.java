public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Polygon shape = null;

        while(true){
            System.out.println("================================");
            System.out.println("Select Polygon Menu");
            System.out.println("1. Circle");
            System.out.println("2. Triangle");
            System.out.println("3. Square");
            System.out.println("4. Exit");
            System.out.println("================================");
            System.out.println("Select >>>>> ");

            int choice = input.nextInt();

            if (choice == 4) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter X: ");
            int x = input.nextInt();
            System.out.print("Enter Y: ");
            int y = input.nextInt();

            switch (choice) {
                case 1:
                    shape = new Circle();
                    break;
                case 2:
                    shape = new Triangle();
                    break;
                case 3:
                    shape = new Square();
                    break;
                default:
                    System.out.println("Invalid selection.");
                    continue;
            }

            shape.setX(x);
            shape.setY(y);

        }

        input.close();
    }
}
import java.util.Scanner;
class StarRating{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int products = sc.nextInt();
        sc.nextLine(); 

        String[] productNames = new String[products];
        double[] ratings = new double[products];

        for (int i = 0; i < products; i++) {
            productNames[i] = sc.nextLine();
            ratings[i] = sc.nextDouble();
            sc.nextLine();
        }
        double totalRating = 0;

        System.out.println("\nProduct Ratings:");
        System.out.printf("%-15s %-6s %s\n", "Product", "Rate", "Stars");

        for (int i = 0; i < products; i++) {
            System.out.printf("%-15s %-6.1f ", productNames[i], ratings[i]);
            int fullStars = (int) ratings[i];
            boolean halfStar = (ratings[i] - fullStars) >= 0.5;

            for (int j = 1; j <= 5; j++) {
                if (j <= fullStars) {
                    System.out.print("★");
                } else {
                    System.out.print("☆");
                }
            }

            totalRating += ratings[i];
            System.out.println();
        }
        double average = totalRating / products;

        System.out.printf("\nAverage Rating: %.2f\n", average);
    }
}
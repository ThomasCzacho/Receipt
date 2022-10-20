/*
USER STORY:
I CAN ENTER ITEM I WISH TO PURCHASE
I CAN ENTER PRICE FOR THIS ITEM
I CAN ENTER THE AMOUNT OF THIS ITEM I WANT TO PURCHASE
repeat until user is finished
I CAN GET A RECEIPT OF MY ORDER
MY RECEIPT INCLUDES: SUBTOTALS OF INDIVIDUAL ITEMS,
TOTAL BEFORE TAX,
TOTAL WITH TAX
program stops
 */
import java.util.Scanner;

public class Receipt {

    public static void main(String[] args) {


        int i = 1, itemNumber = 1;

        Scanner sc = new Scanner(System.in);

        while (i == 1) {
            System.out.println("Enter Name of Item " + itemNumber + ". Enter \"Done\" to see your Receipt.");
            String currentItem = sc.next();

            switch (currentItem) {
                case "Done", "done" -> {
                    i++;
                    System.out.println("finish");
                }
                default -> {


            System.out.println("Enter Price of Desired Item.");
            double currentPrice = sc.nextDouble();
            System.out.println("Enter Quantity of Desired Item.");
            int currentQty = sc.nextInt();
            itemNumber++;
        }
    }

        }
        sc.close();
    }

}

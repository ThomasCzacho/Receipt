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

        String item1Name = null;
        double item1Price = 0.0;
        int item1Quantity = 0;

        String item2Name = null;
        double item2Price = 0.0;
        int item2Quantity = 0;

        String item3Name = null;
        double item3Price = 0.0;
        int item3Quantity = 0;

        String item4Name = null;
        double item4Price = 0.0;
        int item4Quantity = 0;

        String item5Name = null;
        double item5Price = 0.0;
        int item5Quantity = 0;

        String item6Name = null;
        double item6Price = 0.0;
        int item6Quantity = 0;

        String item7Name = null;
        double item7Price = 0.0;
        int item7Quantity = 0;

        String item8Name = null;
        double item8Price = 0.0;
        int item8Quantity = 0;

        String item9Name = null;
        double item9Price = 0.0;
        int item9Quantity = 0;

        String item10Name = null;
        double item10Price = 0.0;
        int item10Quantity = 0;

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

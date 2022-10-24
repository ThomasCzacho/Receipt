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

        String item1Name = "Goobles";
        double item1Price = 19.98;
        int item1Quantity = 7;

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
                    System.out.println(itemNumber-1);
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
        System.out.println("-- Thank You for Shopping! Your Receipt:\n");
        switch (itemNumber-1) {
            case 1:
                System.out.println("-- ("+item1Quantity+") "+item1Name+"-----subtotal: $"+(item1Quantity*item1Price)+"\n");

                break;
            case 2:
                System.out.println("-- ("+item1Quantity+") "+item1Name+"-----subtotal: $"+(item1Quantity*item1Price)+"\n");
                System.out.println("-- ("+item2Quantity+") "+item2Name+"-----subtotal: $"+(item2Quantity*item2Price)+"\n");
                break;
            case 3:
                System.out.println("-- ("+item1Quantity+") "+item1Name+"-----subtotal: $"+(item1Quantity*item1Price)+"\n");
                System.out.println("-- ("+item2Quantity+") "+item2Name+"-----subtotal: $"+(item2Quantity*item2Price)+"\n");
                System.out.println("-- ("+item3Quantity+") "+item3Name+"-----subtotal: $"+(item3Quantity*item3Price)+"\n");
                break;
            case 4:
                System.out.println("-- ("+item1Quantity+") "+item1Name+"-----subtotal: $"+(item1Quantity*item1Price)+"\n");
                System.out.println("-- ("+item2Quantity+") "+item2Name+"-----subtotal: $"+(item2Quantity*item2Price)+"\n");
                System.out.println("-- ("+item3Quantity+") "+item3Name+"-----subtotal: $"+(item3Quantity*item3Price)+"\n");
                System.out.println("-- ("+item4Quantity+") "+item4Name+"-----subtotal: $"+(item3Quantity*item4Price)+"\n");
                break;
            case 5:
                System.out.println("-- ("+item1Quantity+") "+item1Name+"-----subtotal: $"+(item1Quantity*item1Price)+"\n");
                System.out.println("-- ("+item2Quantity+") "+item2Name+"-----subtotal: $"+(item2Quantity*item2Price)+"\n");
                System.out.println("-- ("+item3Quantity+") "+item3Name+"-----subtotal: $"+(item3Quantity*item3Price)+"\n");
                System.out.println("-- ("+item4Quantity+") "+item4Name+"-----subtotal: $"+(item3Quantity*item4Price)+"\n");
                System.out.println("-- ("+item5Quantity+") "+item5Name+"-----subtotal: $"+(item3Quantity*item5Price)+"\n");

                break;
            case 6:
                System.out.println("-- ("+item1Quantity+") "+item1Name+"-----subtotal: $"+(item1Quantity*item1Price)+"\n");
                System.out.println("-- ("+item2Quantity+") "+item2Name+"-----subtotal: $"+(item2Quantity*item2Price)+"\n");
                System.out.println("-- ("+item3Quantity+") "+item3Name+"-----subtotal: $"+(item3Quantity*item3Price)+"\n");
                System.out.println("-- ("+item4Quantity+") "+item4Name+"-----subtotal: $"+(item3Quantity*item4Price)+"\n");
                System.out.println("-- ("+item5Quantity+") "+item5Name+"-----subtotal: $"+(item3Quantity*item5Price)+"\n");
                System.out.println("-- ("+item6Quantity+") "+item6Name+"-----subtotal: $"+(item3Quantity*item6Price)+"\n");
                break;
            case 7:
                System.out.println("-- ("+item1Quantity+") "+item1Name+"-----subtotal: $"+(item1Quantity*item1Price)+"\n");
                System.out.println("-- ("+item2Quantity+") "+item2Name+"-----subtotal: $"+(item2Quantity*item2Price)+"\n");
                System.out.println("-- ("+item3Quantity+") "+item3Name+"-----subtotal: $"+(item3Quantity*item3Price)+"\n");
                System.out.println("-- ("+item4Quantity+") "+item4Name+"-----subtotal: $"+(item3Quantity*item4Price)+"\n");
                System.out.println("-- ("+item5Quantity+") "+item5Name+"-----subtotal: $"+(item3Quantity*item5Price)+"\n");
                System.out.println("-- ("+item6Quantity+") "+item6Name+"-----subtotal: $"+(item3Quantity*item6Price)+"\n");
                System.out.println("-- ("+item7Quantity+") "+item7Name+"-----subtotal: $"+(item3Quantity*item7Price)+"\n");
                break;
            case 8:
                System.out.println("-- ("+item1Quantity+") "+item1Name+"-----subtotal: $"+(item1Quantity*item1Price)+"\n");
                System.out.println("-- ("+item2Quantity+") "+item2Name+"-----subtotal: $"+(item2Quantity*item2Price)+"\n");
                System.out.println("-- ("+item3Quantity+") "+item3Name+"-----subtotal: $"+(item3Quantity*item3Price)+"\n");
                System.out.println("-- ("+item4Quantity+") "+item4Name+"-----subtotal: $"+(item3Quantity*item4Price)+"\n");
                System.out.println("-- ("+item5Quantity+") "+item5Name+"-----subtotal: $"+(item3Quantity*item5Price)+"\n");
                System.out.println("-- ("+item6Quantity+") "+item6Name+"-----subtotal: $"+(item3Quantity*item6Price)+"\n");
                System.out.println("-- ("+item7Quantity+") "+item7Name+"-----subtotal: $"+(item3Quantity*item7Price)+"\n");
                System.out.println("-- ("+item8Quantity+") "+item8Name+"-----subtotal: $"+(item3Quantity*item8Price)+"\n");
                break;
            case 9:
                System.out.println("-- ("+item1Quantity+") "+item1Name+"-----subtotal: $"+(item1Quantity*item1Price)+"\n");
                System.out.println("-- ("+item2Quantity+") "+item2Name+"-----subtotal: $"+(item2Quantity*item2Price)+"\n");
                System.out.println("-- ("+item3Quantity+") "+item3Name+"-----subtotal: $"+(item3Quantity*item3Price)+"\n");
                System.out.println("-- ("+item4Quantity+") "+item4Name+"-----subtotal: $"+(item3Quantity*item4Price)+"\n");
                System.out.println("-- ("+item5Quantity+") "+item5Name+"-----subtotal: $"+(item3Quantity*item5Price)+"\n");
                System.out.println("-- ("+item6Quantity+") "+item6Name+"-----subtotal: $"+(item3Quantity*item6Price)+"\n");
                System.out.println("-- ("+item7Quantity+") "+item7Name+"-----subtotal: $"+(item3Quantity*item7Price)+"\n");
                System.out.println("-- ("+item8Quantity+") "+item8Name+"-----subtotal: $"+(item3Quantity*item8Price)+"\n");
                System.out.println("-- ("+item9Quantity+") "+item9Name+"-----subtotal: $"+(item3Quantity*item9Price)+"\n");
                break;
            case 10:
                System.out.println("-- ("+item1Quantity+") "+item1Name+"-----subtotal: $"+(item1Quantity*item1Price)+"\n");
                System.out.println("-- ("+item2Quantity+") "+item2Name+"-----subtotal: $"+(item2Quantity*item2Price)+"\n");
                System.out.println("-- ("+item3Quantity+") "+item3Name+"-----subtotal: $"+(item3Quantity*item3Price)+"\n");
                System.out.println("-- ("+item4Quantity+") "+item4Name+"-----subtotal: $"+(item3Quantity*item4Price)+"\n");
                System.out.println("-- ("+item5Quantity+") "+item5Name+"-----subtotal: $"+(item3Quantity*item5Price)+"\n");
                System.out.println("-- ("+item6Quantity+") "+item6Name+"-----subtotal: $"+(item3Quantity*item6Price)+"\n");
                System.out.println("-- ("+item7Quantity+") "+item7Name+"-----subtotal: $"+(item3Quantity*item7Price)+"\n");
                System.out.println("-- ("+item8Quantity+") "+item8Name+"-----subtotal: $"+(item3Quantity*item8Price)+"\n");
                System.out.println("-- ("+item9Quantity+") "+item9Name+"-----subtotal: $"+(item3Quantity*item9Price)+"\n");
                System.out.println("-- ("+item10Quantity+") "+item10Name+"-----subtotal: $"+(item3Quantity*item10Price)+"\n");
                break;

        }
        System.out.println("\n Your Total is: ");
    }

}

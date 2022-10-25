/*
USER STORY:
I CAN ENTER ITEM I WISH TO PURCHASE  done
I CAN ENTER PRICE FOR THIS ITEM  done
I CAN ENTER THE AMOUNT OF THIS ITEM I WANT TO PURCHASE done
repeat until user is finished  done
I CAN GET A RECEIPT OF MY ORDER  done
MY RECEIPT INCLUDES: SUBTOTALS OF INDIVIDUAL ITEMS,  done
TOTAL BEFORE TAX,  done
TOTAL WITH TAX  done
program stops
 */
import java.math.BigDecimal;
import java.util.Scanner;

public class Receipt {

    public static void main(String[] args) {

        double taxRate = 0.05;
        double tipRate = 0.15;

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



        System.out.println("\nFill out your order. Order can be up to 10 unique items\n");
        while (i == 1) {

            System.out.println("Enter Name of Item " + itemNumber + ". Enter \"Done\" to see your Receipt.");
            String currentItem = sc.next();

            switch (currentItem) {
                case "Done", "done" -> {
                    i++;

                }
                default -> {


            System.out.println("Enter Price of Desired Item.");
            double currentPrice = sc.nextDouble();
            System.out.println("Enter Quantity of Desired Item.");
            int currentQty = sc.nextInt();
            itemNumber++;

                    if (itemNumber==11){
                        i++;
                    }

                    switch (itemNumber-1) {
                case 1:
                    item1Name=currentItem;
                    item1Quantity=currentQty;
                    item1Price=currentPrice;
                    break;
                case 2:
                    item2Name=currentItem;
                    item2Quantity=currentQty;
                    item2Price=currentPrice;
                    break;
                case 3:
                    item3Name=currentItem;
                    item3Quantity=currentQty;
                    item3Price=currentPrice;
                    break;
                case 4:
                    item4Name=currentItem;
                    item4Quantity=currentQty;
                    item4Price=currentPrice;
                    break;
                case 5:
                    item5Name=currentItem;
                    item5Quantity=currentQty;
                    item5Price=currentPrice;
                    break;
                case 6:
                    item6Name=currentItem;
                    item6Quantity=currentQty;
                    item6Price=currentPrice;
                    break;
                case 7:
                    item7Name=currentItem;
                    item7Quantity=currentQty;
                    item7Price=currentPrice;
                    break;
                case 8:
                    item8Name=currentItem;
                    item8Quantity=currentQty;
                    item8Price=currentPrice;
                    break;
                case 9:
                    item9Name=currentItem;
                    item9Quantity=currentQty;
                    item9Price=currentPrice;
                    break;
                case 10:
                    item10Name=currentItem;
                    item10Quantity=currentQty;
                    item10Price=currentPrice;
                    break;

            }
        }
    }

            float number = 123.456f;

            BigDecimal bd = new BigDecimal(number);
            BigDecimal roundedOffBd = bd.setScale(2, java.math.RoundingMode.HALF_EVEN);

            System.out.println(roundedOffBd);

        }
        sc.close();
        System.out.println("-- Thank You for Shopping! Your Receipt:\n--");
        switch (itemNumber-1) {
            case 1:
                System.out.println("-- ("+item1Quantity+") "+item1Name+"-----subtotal: $"+(item1Quantity*item1Price)+"\n--");

                break;
            case 2:
                System.out.println("-- ("+item1Quantity+") "+item1Name+"-----subtotal: $"+(item1Quantity*item1Price)+"\n--");
                System.out.println("-- ("+item2Quantity+") "+item2Name+"-----subtotal: $"+(item2Quantity*item2Price)+"\n--");
                break;
            case 3:
                System.out.println("-- ("+item1Quantity+") "+item1Name+"-----subtotal: $"+(item1Quantity*item1Price)+"\n--");
                System.out.println("-- ("+item2Quantity+") "+item2Name+"-----subtotal: $"+(item2Quantity*item2Price)+"\n--");
                System.out.println("-- ("+item3Quantity+") "+item3Name+"-----subtotal: $"+(item3Quantity*item3Price)+"\n--");
                break;
            case 4:
                System.out.println("-- ("+item1Quantity+") "+item1Name+"-----subtotal: $"+(item1Quantity*item1Price)+"\n--");
                System.out.println("-- ("+item2Quantity+") "+item2Name+"-----subtotal: $"+(item2Quantity*item2Price)+"\n--");
                System.out.println("-- ("+item3Quantity+") "+item3Name+"-----subtotal: $"+(item3Quantity*item3Price)+"\n--");
                System.out.println("-- ("+item4Quantity+") "+item4Name+"-----subtotal: $"+(item3Quantity*item4Price)+"\n--");
                break;
            case 5:
                System.out.println("-- ("+item1Quantity+") "+item1Name+"-----subtotal: $"+(item1Quantity*item1Price)+"\n--");
                System.out.println("-- ("+item2Quantity+") "+item2Name+"-----subtotal: $"+(item2Quantity*item2Price)+"\n--");
                System.out.println("-- ("+item3Quantity+") "+item3Name+"-----subtotal: $"+(item3Quantity*item3Price)+"\n--");
                System.out.println("-- ("+item4Quantity+") "+item4Name+"-----subtotal: $"+(item3Quantity*item4Price)+"\n--");
                System.out.println("-- ("+item5Quantity+") "+item5Name+"-----subtotal: $"+(item3Quantity*item5Price)+"\n--");

                break;
            case 6:
                System.out.println("-- ("+item1Quantity+") "+item1Name+"-----subtotal: $"+(item1Quantity*item1Price)+"\n--");
                System.out.println("-- ("+item2Quantity+") "+item2Name+"-----subtotal: $"+(item2Quantity*item2Price)+"\n--");
                System.out.println("-- ("+item3Quantity+") "+item3Name+"-----subtotal: $"+(item3Quantity*item3Price)+"\n--");
                System.out.println("-- ("+item4Quantity+") "+item4Name+"-----subtotal: $"+(item3Quantity*item4Price)+"\n--");
                System.out.println("-- ("+item5Quantity+") "+item5Name+"-----subtotal: $"+(item3Quantity*item5Price)+"\n--");
                System.out.println("-- ("+item6Quantity+") "+item6Name+"-----subtotal: $"+(item3Quantity*item6Price)+"\n--");
                break;
            case 7:
                System.out.println("-- ("+item1Quantity+") "+item1Name+"-----subtotal: $"+(item1Quantity*item1Price)+"\n--");
                System.out.println("-- ("+item2Quantity+") "+item2Name+"-----subtotal: $"+(item2Quantity*item2Price)+"\n--");
                System.out.println("-- ("+item3Quantity+") "+item3Name+"-----subtotal: $"+(item3Quantity*item3Price)+"\n--");
                System.out.println("-- ("+item4Quantity+") "+item4Name+"-----subtotal: $"+(item3Quantity*item4Price)+"\n--");
                System.out.println("-- ("+item5Quantity+") "+item5Name+"-----subtotal: $"+(item3Quantity*item5Price)+"\n--");
                System.out.println("-- ("+item6Quantity+") "+item6Name+"-----subtotal: $"+(item3Quantity*item6Price)+"\n--");
                System.out.println("-- ("+item7Quantity+") "+item7Name+"-----subtotal: $"+(item3Quantity*item7Price)+"\n--");
                break;
            case 8:
                System.out.println("-- ("+item1Quantity+") "+item1Name+"-----subtotal: $"+(item1Quantity*item1Price)+"\n--");
                System.out.println("-- ("+item2Quantity+") "+item2Name+"-----subtotal: $"+(item2Quantity*item2Price)+"\n--");
                System.out.println("-- ("+item3Quantity+") "+item3Name+"-----subtotal: $"+(item3Quantity*item3Price)+"\n--");
                System.out.println("-- ("+item4Quantity+") "+item4Name+"-----subtotal: $"+(item3Quantity*item4Price)+"\n--");
                System.out.println("-- ("+item5Quantity+") "+item5Name+"-----subtotal: $"+(item3Quantity*item5Price)+"\n--");
                System.out.println("-- ("+item6Quantity+") "+item6Name+"-----subtotal: $"+(item3Quantity*item6Price)+"\n--");
                System.out.println("-- ("+item7Quantity+") "+item7Name+"-----subtotal: $"+(item3Quantity*item7Price)+"\n--");
                System.out.println("-- ("+item8Quantity+") "+item8Name+"-----subtotal: $"+(item3Quantity*item8Price)+"\n--");
                break;
            case 9:
                System.out.println("-- ("+item1Quantity+") "+item1Name+"-----subtotal: $"+(item1Quantity*item1Price)+"\n--");
                System.out.println("-- ("+item2Quantity+") "+item2Name+"-----subtotal: $"+(item2Quantity*item2Price)+"\n--");
                System.out.println("-- ("+item3Quantity+") "+item3Name+"-----subtotal: $"+(item3Quantity*item3Price)+"\n--");
                System.out.println("-- ("+item4Quantity+") "+item4Name+"-----subtotal: $"+(item3Quantity*item4Price)+"\n--");
                System.out.println("-- ("+item5Quantity+") "+item5Name+"-----subtotal: $"+(item3Quantity*item5Price)+"\n--");
                System.out.println("-- ("+item6Quantity+") "+item6Name+"-----subtotal: $"+(item3Quantity*item6Price)+"\n--");
                System.out.println("-- ("+item7Quantity+") "+item7Name+"-----subtotal: $"+(item3Quantity*item7Price)+"\n--");
                System.out.println("-- ("+item8Quantity+") "+item8Name+"-----subtotal: $"+(item3Quantity*item8Price)+"\n--");
                System.out.println("-- ("+item9Quantity+") "+item9Name+"-----subtotal: $"+(item3Quantity*item9Price)+"\n--");
                break;
            case 10:
                System.out.println("-- ("+item1Quantity+") "+item1Name+"-----subtotal: $"+(item1Quantity*item1Price)+"\n--");
                System.out.println("-- ("+item2Quantity+") "+item2Name+"-----subtotal: $"+(item2Quantity*item2Price)+"\n--");
                System.out.println("-- ("+item3Quantity+") "+item3Name+"-----subtotal: $"+(item3Quantity*item3Price)+"\n--");
                System.out.println("-- ("+item4Quantity+") "+item4Name+"-----subtotal: $"+(item3Quantity*item4Price)+"\n--");
                System.out.println("-- ("+item5Quantity+") "+item5Name+"-----subtotal: $"+(item3Quantity*item5Price)+"\n--");
                System.out.println("-- ("+item6Quantity+") "+item6Name+"-----subtotal: $"+(item3Quantity*item6Price)+"\n--");
                System.out.println("-- ("+item7Quantity+") "+item7Name+"-----subtotal: $"+(item3Quantity*item7Price)+"\n--");
                System.out.println("-- ("+item8Quantity+") "+item8Name+"-----subtotal: $"+(item3Quantity*item8Price)+"\n--");
                System.out.println("-- ("+item9Quantity+") "+item9Name+"-----subtotal: $"+(item3Quantity*item9Price)+"\n--");
                System.out.println("-- ("+item10Quantity+") "+item10Name+"-----subtotal: $"+(item3Quantity*item10Price)+"\n--");
                break;

        }
        double total = ((item1Price*item1Quantity)+(item2Price*item2Quantity)+(item3Price*item3Quantity)
                +(item4Price*item4Quantity)+(item5Price*item5Quantity)+(item6Price*item6Quantity)+
                (item7Price*item7Quantity)+(item8Price*item8Quantity)+(item9Price*item9Quantity)+
                (item10Price*item10Quantity));

        double totalTax = (total*taxRate);
        double totalTip = (total*tipRate);

        System.out.println("-- Your Total is: $"+total+"\n--");
        System.out.println("-- "+taxRate+" tax : $"+totalTax+"\n--");
        System.out.println("-- "+tipRate+" tip : $"+totalTip+"\n--");
        System.out.println("-- Your Final Total is: $"+(total+totalTax+totalTip));
    }

}

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

        BigDecimal taxRate2 = new BigDecimal(taxRate);
        BigDecimal tipRate2 = new BigDecimal(tipRate);


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
                case "Done", "done" -> i++;
                default -> {


            System.out.println("Enter Price of Desired Item.");
            double currentPrice = sc.nextDouble();
            System.out.println("Enter Quantity of Desired Item.");
            int currentQty = sc.nextInt();
            itemNumber++;

                    if (itemNumber==11){
                        i++;
                    }

                    switch (itemNumber - 1) {
                        case 1 -> {
                            item1Name = currentItem;
                            item1Quantity = currentQty;
                            item1Price = currentPrice;
                        }
                        case 2 -> {
                            item2Name = currentItem;
                            item2Quantity = currentQty;
                            item2Price = currentPrice;
                        }
                        case 3 -> {
                            item3Name = currentItem;
                            item3Quantity = currentQty;
                            item3Price = currentPrice;
                        }
                        case 4 -> {
                            item4Name = currentItem;
                            item4Quantity = currentQty;
                            item4Price = currentPrice;
                        }
                        case 5 -> {
                            item5Name = currentItem;
                            item5Quantity = currentQty;
                            item5Price = currentPrice;
                        }
                        case 6 -> {
                            item6Name = currentItem;
                            item6Quantity = currentQty;
                            item6Price = currentPrice;
                        }
                        case 7 -> {
                            item7Name = currentItem;
                            item7Quantity = currentQty;
                            item7Price = currentPrice;
                        }
                        case 8 -> {
                            item8Name = currentItem;
                            item8Quantity = currentQty;
                            item8Price = currentPrice;
                        }
                        case 9 -> {
                            item9Name = currentItem;
                            item9Quantity = currentQty;
                            item9Price = currentPrice;
                        }
                        case 10 -> {
                            item10Name = currentItem;
                            item10Quantity = currentQty;
                            item10Price = currentPrice;
                        }
                    }
        }
    }

        }
        sc.close();
        System.out.println("-- Thank You for Shopping! Your Receipt:\n--");

        double item1Total =(item1Quantity*item1Price);
        BigDecimal it1 = new BigDecimal(item1Total);
        BigDecimal item1Total2 = it1.setScale(2, java.math.RoundingMode.HALF_EVEN);

        double item2Total =(item2Quantity*item2Price);
        BigDecimal it2 = new BigDecimal(item2Total);
        BigDecimal item2Total2 = it2.setScale(2, java.math.RoundingMode.HALF_EVEN);

        double item3Total =(item3Quantity*item3Price);
        BigDecimal it3 = new BigDecimal(item3Total);
        BigDecimal item3Total2 = it3.setScale(2, java.math.RoundingMode.HALF_EVEN);

        double item4Total =(item4Quantity*item4Price);
        BigDecimal it4 = new BigDecimal(item4Total);
        BigDecimal item4Total2 = it4.setScale(2, java.math.RoundingMode.HALF_EVEN);

        double item5Total =(item5Quantity*item5Price);
        BigDecimal it5 = new BigDecimal(item5Total);
        BigDecimal item5Total2 = it5.setScale(2, java.math.RoundingMode.HALF_EVEN);

        double item6Total =(item6Quantity*item6Price);
        BigDecimal it6 = new BigDecimal(item6Total);
        BigDecimal item6Total2 = it6.setScale(2, java.math.RoundingMode.HALF_EVEN);

        double item7Total =(item7Quantity*item7Price);
        BigDecimal it7 = new BigDecimal(item7Total);
        BigDecimal item7Total2 = it7.setScale(2, java.math.RoundingMode.HALF_EVEN);

        double item8Total =(item8Quantity*item8Price);
        BigDecimal it8 = new BigDecimal(item8Total);
        BigDecimal item8Total2 = it8.setScale(2, java.math.RoundingMode.HALF_EVEN);

        double item9Total =(item9Quantity*item9Price);
        BigDecimal it9 = new BigDecimal(item9Total);
        BigDecimal item9Total2 = it9.setScale(2, java.math.RoundingMode.HALF_EVEN);

        double item10Total =(item10Quantity*item10Price);
        BigDecimal it10 = new BigDecimal(item10Total);
        BigDecimal item10Total2 = it10.setScale(2, java.math.RoundingMode.HALF_EVEN);

        switch (itemNumber - 1) {
            case 1 -> System.out.println("-- (" + item1Quantity + ") " + item1Name + "-----subtotal: $" + (item1Total2) + "\n--");
            case 2 -> {
                System.out.println("-- (" + item1Quantity + ") " + item1Name + "-----subtotal: $" + (item1Total2) + "\n--");
                System.out.println("-- (" + item2Quantity + ") " + item2Name + "-----subtotal: $" + (item2Total2) + "\n--");
            }
            case 3 -> {
                System.out.println("-- (" + item1Quantity + ") " + item1Name + "-----subtotal: $" + (item1Total2) + "\n--");
                System.out.println("-- (" + item2Quantity + ") " + item2Name + "-----subtotal: $" + (item2Total2) + "\n--");
                System.out.println("-- (" + item3Quantity + ") " + item3Name + "-----subtotal: $" + (item3Total2) + "\n--");
            }
            case 4 -> {
                System.out.println("-- (" + item1Quantity + ") " + item1Name + "-----subtotal: $" + (item1Total2) + "\n--");
                System.out.println("-- (" + item2Quantity + ") " + item2Name + "-----subtotal: $" + (item2Total2) + "\n--");
                System.out.println("-- (" + item3Quantity + ") " + item3Name + "-----subtotal: $" + (item3Total2) + "\n--");
                System.out.println("-- (" + item4Quantity + ") " + item4Name + "-----subtotal: $" + (item4Total2) + "\n--");
            }
            case 5 -> {
                System.out.println("-- (" + item1Quantity + ") " + item1Name + "-----subtotal: $" + (item1Total2) + "\n--");
                System.out.println("-- (" + item2Quantity + ") " + item2Name + "-----subtotal: $" + (item2Total2) + "\n--");
                System.out.println("-- (" + item3Quantity + ") " + item3Name + "-----subtotal: $" + (item3Total2) + "\n--");
                System.out.println("-- (" + item4Quantity + ") " + item4Name + "-----subtotal: $" + (item4Total2) + "\n--");
                System.out.println("-- (" + item5Quantity + ") " + item5Name + "-----subtotal: $" + (item5Total2) + "\n--");
            }
            case 6 -> {
                System.out.println("-- (" + item1Quantity + ") " + item1Name + "-----subtotal: $" + (item1Total2) + "\n--");
                System.out.println("-- (" + item2Quantity + ") " + item2Name + "-----subtotal: $" + (item2Total2) + "\n--");
                System.out.println("-- (" + item3Quantity + ") " + item3Name + "-----subtotal: $" + (item3Total2) + "\n--");
                System.out.println("-- (" + item4Quantity + ") " + item4Name + "-----subtotal: $" + (item4Total2) + "\n--");
                System.out.println("-- (" + item5Quantity + ") " + item5Name + "-----subtotal: $" + (item5Total2) + "\n--");
                System.out.println("-- (" + item6Quantity + ") " + item6Name + "-----subtotal: $" + (item6Total2) + "\n--");
            }
            case 7 -> {
                System.out.println("-- (" + item1Quantity + ") " + item1Name + "-----subtotal: $" + (item1Total2) + "\n--");
                System.out.println("-- (" + item2Quantity + ") " + item2Name + "-----subtotal: $" + (item2Total2) + "\n--");
                System.out.println("-- (" + item3Quantity + ") " + item3Name + "-----subtotal: $" + (item3Total2) + "\n--");
                System.out.println("-- (" + item4Quantity + ") " + item4Name + "-----subtotal: $" + (item4Total2) + "\n--");
                System.out.println("-- (" + item5Quantity + ") " + item5Name + "-----subtotal: $" + (item5Total2) + "\n--");
                System.out.println("-- (" + item6Quantity + ") " + item6Name + "-----subtotal: $" + (item6Total2) + "\n--");
                System.out.println("-- (" + item7Quantity + ") " + item7Name + "-----subtotal: $" + (item7Total2) + "\n--");
            }
            case 8 -> {
                System.out.println("-- (" + item1Quantity + ") " + item1Name + "-----subtotal: $" + (item1Total2) + "\n--");
                System.out.println("-- (" + item2Quantity + ") " + item2Name + "-----subtotal: $" + (item2Total2) + "\n--");
                System.out.println("-- (" + item3Quantity + ") " + item3Name + "-----subtotal: $" + (item3Total2) + "\n--");
                System.out.println("-- (" + item4Quantity + ") " + item4Name + "-----subtotal: $" + (item4Total2) + "\n--");
                System.out.println("-- (" + item5Quantity + ") " + item5Name + "-----subtotal: $" + (item5Total2) + "\n--");
                System.out.println("-- (" + item6Quantity + ") " + item6Name + "-----subtotal: $" + (item6Total2) + "\n--");
                System.out.println("-- (" + item7Quantity + ") " + item7Name + "-----subtotal: $" + (item7Total2) + "\n--");
                System.out.println("-- (" + item8Quantity + ") " + item8Name + "-----subtotal: $" + (item8Total2) + "\n--");
            }
            case 9 -> {
                System.out.println("-- (" + item1Quantity + ") " + item1Name + "-----subtotal: $" + (item1Total2) + "\n--");
                System.out.println("-- (" + item2Quantity + ") " + item2Name + "-----subtotal: $" + (item2Total2) + "\n--");
                System.out.println("-- (" + item3Quantity + ") " + item3Name + "-----subtotal: $" + (item3Total2) + "\n--");
                System.out.println("-- (" + item4Quantity + ") " + item4Name + "-----subtotal: $" + (item4Total2) + "\n--");
                System.out.println("-- (" + item5Quantity + ") " + item5Name + "-----subtotal: $" + (item5Total2) + "\n--");
                System.out.println("-- (" + item6Quantity + ") " + item6Name + "-----subtotal: $" + (item6Total2) + "\n--");
                System.out.println("-- (" + item7Quantity + ") " + item7Name + "-----subtotal: $" + (item7Total2) + "\n--");
                System.out.println("-- (" + item8Quantity + ") " + item8Name + "-----subtotal: $" + (item8Total2) + "\n--");
                System.out.println("-- (" + item9Quantity + ") " + item9Name + "-----subtotal: $" + (item9Total2) + "\n--");
            }
            case 10 -> {
                System.out.println("-- (" + item1Quantity + ") " + item1Name + "-----subtotal: $" + (item1Total2) + "\n--");
                System.out.println("-- (" + item2Quantity + ") " + item2Name + "-----subtotal: $" + (item2Total2) + "\n--");
                System.out.println("-- (" + item3Quantity + ") " + item3Name + "-----subtotal: $" + (item3Total2) + "\n--");
                System.out.println("-- (" + item4Quantity + ") " + item4Name + "-----subtotal: $" + (item4Total2) + "\n--");
                System.out.println("-- (" + item5Quantity + ") " + item5Name + "-----subtotal: $" + (item5Total2) + "\n--");
                System.out.println("-- (" + item6Quantity + ") " + item6Name + "-----subtotal: $" + (item6Total2) + "\n--");
                System.out.println("-- (" + item7Quantity + ") " + item7Name + "-----subtotal: $" + (item7Total2) + "\n--");
                System.out.println("-- (" + item8Quantity + ") " + item8Name + "-----subtotal: $" + (item8Total2) + "\n--");
                System.out.println("-- (" + item9Quantity + ") " + item9Name + "-----subtotal: $" + (item9Total2) + "\n--");
                System.out.println("-- (" + item10Quantity + ") " + item10Name + "-----subtotal: $" + (item10Total2) + "\n--");
            }
        }

BigDecimal total2=item1Total2.add(item2Total2).add(item3Total2).add(item4Total2).add(item5Total2).add(item6Total2).add(item7Total2).add(item8Total2).add(item9Total2).add(item10Total2);


        BigDecimal totalTax = (total2.multiply(taxRate2));
        BigDecimal totalTax2 = totalTax.setScale(2, java.math.RoundingMode.HALF_EVEN);

        BigDecimal totalTip = (total2.multiply(tipRate2));
        BigDecimal totalTip2 = totalTip.setScale(2, java.math.RoundingMode.HALF_EVEN);

        total2 = (total2.add(totalTax).add(totalTip));
        BigDecimal totalTotal = total2.setScale(2, java.math.RoundingMode.HALF_EVEN);

        System.out.println("-- Your Total is: $"+total2+"\n--");
        System.out.println("-- "+taxRate+" tax : $"+totalTax2+"\n--");
        System.out.println("-- "+tipRate+" tip : $"+totalTip2+"\n--");
        System.out.println("-- Your Final Total is: $"+(totalTotal));
    }

}

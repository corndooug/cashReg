import java.util.*;
import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;

public class Receipt {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();
        DecimalFormat format = new DecimalFormat("0.00");
        Map<Integer, String> cashiers = new HashMap<>();

        // Part 1: Validation stage
        int confirm = JOptionPane.showConfirmDialog
            (null, "WOULD YOU LIKE TO PROCEED?", 
            "Confirm", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.QUESTION_MESSAGE);

        cashiers.put(22105581, "GIOVANI VALDRIZ");
        cashiers.put(22100051, "ALEXANDRA JEAN GARCIA");
        cashiers.put(22100821, "AERON IMBUEDO");

        if (confirm == 1){
            JOptionPane.showMessageDialog
            (null, 
            "Thank You", 
            "Bye", 
            JOptionPane.PLAIN_MESSAGE);}

        else if(confirm == 0){
            int cashierID = Integer.parseInt(JOptionPane.showInputDialog("ENTER YOUR ID NUMBER:"));
            if (cashiers.containsKey(cashierID)) {
                String name = cashiers.get(cashierID);
                JOptionPane.showMessageDialog(null, 
                "WELCOME " + name, "Welcome", JOptionPane.PLAIN_MESSAGE);
                int rcptNo = Integer.parseInt(JOptionPane.showInputDialog("ENTER RECEIPT NO."));
                System.out.println
                ("                         \033[1m BooKenken \n" +
                "           Velasco St., San Juan, La Union (2514)\n" +
                "                   email: bookenken@gmail.com\033[0m\n" +
                "==============================================================\n" +
                "\033[1mRECEIPT NO.: \033[0m"+rcptNo+"\n"+
                "\033[1mCASHIER:\033[0m " + name + "\n"+
                "\033[1mDATE:\033[0m "+date+"\n"+
                "==============================================================\n"+
                "             PRD               QTY               PRC\n"+
                "==============================================================\n");
                String customerName = JOptionPane.showInputDialog
                (null, "<html><font size='4'><font face='URW Gothic'><b>Enter Customer's Name</b></html>", "Name", JOptionPane.QUESTION_MESSAGE);
                Calculate();
            }
            else {
            JOptionPane.showMessageDialog(null, "INVALID ID NUMBER", "Denied", JOptionPane.PLAIN_MESSAGE);
            }
        }
           
        else {
            JOptionPane.showMessageDialog(null, "Thanks", "Bye", JOptionPane.PLAIN_MESSAGE);
        }
    }



public static void purchaseItem(String itemCode, int quantity, double price, double[][] items, String customerName) {
    double tot = price * quantity;
    double total = 0;
    for(int i = 0; i < items.length; i++) {
        if(price == items[i][1]) {
            total += price * quantity;
            break;
        }
    }
    System.out.println("            "+itemCode+"            "+quantity+"          "+tot);
    int more = JOptionPane.showConfirmDialog(null, "Would you like to add more items?", "More?", JOptionPane.YES_NO_OPTION);
    if (more == 0) {
        // continue with purchasing items
    }
    else {
        JOptionPane.showMessageDialog(null, "Thank you for shopping with us, " + customerName + "!\nYour total is ₱" + total);
        // exit the loop and end the program
    }
}


//---------------------------------------------------------------------------------------------------------------------------------
private static double processChoice(int choice, double [][] items, String itemCode, double prc) {

    int quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "How many pieces would you like to purchase?"));   
    double tot = (prc*quantity);
    double price = 0;
double currentTotal = 0;
    
    for (int i = 0; i < items.length; i++) {
        if (choice == items[i][0]) {
            price = items[i][1];
            currentTotal += price * quantity;
            break;
        }
    }
    System.out.println
        ("            " + itemCode + "            " + quantity + "          " + tot);
    int more = JOptionPane.showConfirmDialog(null, "Would you like to add more items?", "More?", JOptionPane.YES_NO_OPTION);
    if (more == 0) {
        return currentTotal;}
    else {
        System.out.println("\n==============================================================\n");
        // System.out.println("SUBTOTAL ....................................."+currentTotal);
        // System.exit(0);}    
        JOptionPane.showMessageDialog(null, "Thank you for shopping with us!\nYour total is ₱" + currentTotal);
        return currentTotal;}
}
//---------------------------------------------------------------------------------------------------------------------------------
private static void Calculate() {
 double [][] items = {{1001, 199.75}, {1002, 148.50}, {1003, 247.75}, {1004, 180.25}, {1005, 120.25},
                     {1006, 130.50}, {1007, 298.50}, {1008, 279.25}, {1009, 190.00}, {1010, 170.50}};
    
    while (true) {
        int choice = Integer.parseInt(JOptionPane.showInputDialog("<html><font face='URW Gothic'><font size='5'><b>Code</b></html>\n"+
                "<html><font face='URW Gothic'><font size='4'>[1001]      Atomic Habits by J. Clear (Paperback) - ₱199.75</html>\n"+
                "<html><font face='URW Gothic'><font size='4'>[1002]      48 Laws of Power by R. Greene - ₱148.50</html>\n"+
                "<html><font face='URW Gothic'><font size='4'>[1003]      Meditations by M. Aurelius - ₱247.75</html>\n"+
                "<html><font face='URW Gothic'><font size='4'>[1004]      The Myth of Sissyphus by Albert Camus - ₱180.25</html>\n"+
                "<html><font face='URW Gothic'><font size='4'>[1005]      Show Your Work by Austin Kleon - ₱120.25</html>\n"+
                "<html><font face='URW Gothic'><font size='4'>[1006]      Steal Like an Artist by Austin Kleon - ₱130.50</html>\n"+
                "<html><font face='URW Gothic'><font size='4'>[1007]      Thus Spoke Zarathustra by F. Nietzsche - ₱298.50</html>\n"+
                "<html><font face='URW Gothic'><font size='4'>[1008]      Letters from a Stoic by Lucius Seneca - ₱279.25</html>\n"+
                "<html><font face='URW Gothic'><font size='4'>[1009]      The Daily Stoic by Ryan Holiday - ₱190.00</html>\n"+
                "<html><font face='URW Gothic'><font size='4'>[1010]      The Art of Seduction by R. Greene - ₱170.50</html><\n"+
                "<html><font face='URW Gothic'><font size='5'><b>Enter Product Code:</b></html>"));

                if (choice == 1001) {
                    processChoice(1002,items,  "1001ATM", 199.75);                    
                    }
                else if (choice == 1002){
                    processChoice(1002, items, "1002LWP", 148.50);
                    }
                else if (choice == 1003){
                    processChoice(1003, items, "1003MDS", 247.75);
                    }
                else if (choice == 1004){
                    processChoice(1004, items,  "1004TMS", 180.25);
                    }
                else if (choice == 1005){
                     processChoice(1005, items, "1005SYW", 120.25);               
                    }
                else if (choice == 1006){
                     processChoice(1006,items,  "1006SLA", 130.50);
                    }
                else if (choice == 1007){
                     processChoice(1007, items, "1007TSZ", 298.50); 
                    }
                else if (choice == 1008){
                    processChoice(1008, items, "1008LFS", 279.25);
                    }
                else if (choice == 1009){
                    processChoice(1009, items, "1009TDS", 190.00);
                    }
                else if (choice == 1010){
                    processChoice(1010, items, "1010TAS", 170.50);
                    }
                else {
                    JOptionPane.showMessageDialog(null, "Invalid Option! You can try again"); 
                    continue;
                }
        }
    }
}
  

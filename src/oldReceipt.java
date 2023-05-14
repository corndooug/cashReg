import java.util.*;
import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;

public class oldReceipt {
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
                "             PRD             QTY               PRC\n"+
                "==============================================================\n");
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

private static void Calculate() {
    double [][] items = {{1001, 199.75}, {1002, 148.50}, {1003, 247.75}, {1004, 180.25}, {1005, 120.25},
                     {1006, 130.50}, {1007, 298.50}, {1008, 279.25}, {1009, 190.00}, {1010, 170.50}};
    
    String customerName = JOptionPane.showInputDialog
    (null, "<html><font size='4'><font face='URW Gothic'><b>Enter Customer's Name</b></html>", "Name", JOptionPane.QUESTION_MESSAGE);


    double total = 0;
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
                    String itemCode = "1001ATM";
                    int quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "How many pieces would you like to purchase?"));
                    double tot = (199.75 * quantity);
                    double price = 0;
                        for(int i = 0; i < items.length; i++) {
                        if(choice == items[i][0]) {
                            price = items[i][1];
                            total += price * quantity;
                            break;
                        }
                    }
                    System.out.println("            "+itemCode+"            "+quantity+"          "+tot);
                    int more = JOptionPane.showConfirmDialog
                    (null, "Would you like to add more items?", "More?", JOptionPane.YES_NO_OPTION);
                        if (more == 0) {
                            continue;
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Thank you for shopping with us, " + customerName + "!\nYour total is ₱" + total);
                            break;
                        }
                    
                    
                }
                else if (choice == 1002){
                    String itemCode = "1002LWP";
                    int quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "How many pieces would you like to purchase?"));
                    double tot = (148.50* quantity);
                    double price = 0;
                        for(int i = 0; i < items.length; i++) {
                        if(choice == items[i][0]) {
                            price = items[i][1];
                            total += price * quantity;
                            break;
                        }
                    }
                    System.out.println("            "+itemCode+"            "+quantity+"          "+tot);
                    int more = JOptionPane.showConfirmDialog
                    (null, "Would you like to add more items?", "More?", JOptionPane.YES_NO_OPTION);
                        if (more == 0) {
                            continue;
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Thank you for shopping with us, " + customerName + "!\nYour total is ₱" + total);
                            break;
                        }
                    

                }
                else if (choice == 1003){
                    String itemCode = "1003MDS";
                    int quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "How many pieces would you like to purchase?"));
                    double tot = (247.75 * quantity);
                    double price = 0;
                        for(int i = 0; i < items.length; i++) {
                        if(choice == items[i][0]) {
                            price = items[i][1];
                            total += price * quantity;
                            break;
                        }
                    }
                    System.out.println("            "+itemCode+"            "+quantity+"          "+tot);
                    int more = JOptionPane.showConfirmDialog
                    (null, "Would you like to add more items?", "More?", JOptionPane.YES_NO_OPTION);
                        if (more == 0) {
                            continue;
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Thank you for shopping with us, " + customerName + "!\nYour total is ₱" + total);
                            break;
                        }
                    

                }
                else if (choice == 1004){
                    String itemCode = "1004MOS";
                    int quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "How many pieces would you like to purchase?"));
                    double tot = (180.25 * quantity);
                    double price = 0;
                        for(int i = 0; i < items.length; i++) {
                        if(choice == items[i][0]) {
                            price = items[i][1];
                            total += price * quantity;
                            break;
                        }
                    }
                    System.out.println("            "+itemCode+"            "+quantity+"          "+tot);
                    int more = JOptionPane.showConfirmDialog
                    (null, "Would you like to add more items?", "More?", JOptionPane.YES_NO_OPTION);
                        if (more == 0) {
                            continue;
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Thank you for shopping with us, " + customerName + "!\nYour total is ₱" + total);
                            break;
                        }
                    

                }
                else if (choice == 1005){
                    String itemCode = "1005SYW";
                    int quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "How many pieces would you like to purchase?"));
                    double tot = (120.25 * quantity);
                    double price = 0;
                        for(int i = 0; i < items.length; i++) {
                        if(choice == items[i][0]) {
                            price = items[i][1];
                            total += price * quantity;
                            break;
                        }
                    }
                    System.out.println("            "+itemCode+"            "+quantity+"          "+tot);
                    int more = JOptionPane.showConfirmDialog
                    (null, "Would you like to add more items?", "More?", JOptionPane.YES_NO_OPTION);
                        if (more == 0) {
                            continue;
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Thank you for shopping with us, " + customerName + "!\nYour total is ₱" + total);
                            break;
                        }
                    

                }
                else if (choice == 1006){
                    String itemCode = "1006SLA";
                    int quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "How many pieces would you like to purchase?"));
                    double tot = (130.50 * quantity);
                    double price = 0;
                        for(int i = 0; i < items.length; i++) {
                        if(choice == items[i][0]) {
                            price = items[i][1];
                            total += price * quantity;
                            break;
                        }
                    }
                    System.out.println("            "+itemCode+"            "+quantity+"          "+tot);
                    int more = JOptionPane.showConfirmDialog
                    (null, "Would you like to add more items?", "More?", JOptionPane.YES_NO_OPTION);
                        if (more == 0) {
                            continue;
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Thank you for shopping with us, " + customerName + "!\nYour total is ₱" + total);
                            break;
                        }
                    

                }
                else if (choice == 1007){
                    String itemCode = "1007TSZ";
                    int quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "How many pieces would you like to purchase?"));
                    double tot = (298.50* quantity);
                    double price = 0;
                        for(int i = 0; i < items.length; i++) {
                        if(choice == items[i][0]) {
                            price = items[i][1];
                            total += price * quantity;
                            break;
                        }
                    }
                    System.out.println("            "+itemCode+"            "+quantity+"          "+tot);
                    int more = JOptionPane.showConfirmDialog
                    (null, "Would you like to add more items?", "More?", JOptionPane.YES_NO_OPTION);
                        if (more == 0) {
                            continue;
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Thank you for shopping with us, " + customerName + "!\nYour total is ₱" + total);
                            break;
                        }
                    

                }
                else if (choice == 1008){
                    String itemCode = "1008LFS";
                    int quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "How many pieces would you like to purchase?"));
                    double tot = (279.25 * quantity);
                    double price = 0;
                        for(int i = 0; i < items.length; i++) {
                        if(choice == items[i][0]) {
                            price = items[i][1];
                            total += price * quantity;
                            break;
                        }
                    }
                    System.out.println("            "+itemCode+"            "+quantity+"          "+tot);
                    int more = JOptionPane.showConfirmDialog
                    (null, "Would you like to add more items?", "More?", JOptionPane.YES_NO_OPTION);
                        if (more == 0) {
                            continue;
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Thank you for shopping with us, " + customerName + "!\nYour total is ₱" + total);
                            break;
                        }
                    

                }
                else if (choice == 1009){
                    String itemCode = "1009TDS";
                    int quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "How many pieces would you like to purchase?"));
                    double tot = (190.00 * quantity);
                    double price = 0;
                        for(int i = 0; i < items.length; i++) {
                        if(choice == items[i][0]) {
                            price = items[i][1];
                            total += price * quantity;
                            break;
                        }
                    }
                    System.out.println("            "+itemCode+"            "+quantity+"          "+tot);
                    int more = JOptionPane.showConfirmDialog
                    (null, "Would you like to add more items?", "More?", JOptionPane.YES_NO_OPTION);
                        if (more == 0) {
                            continue;
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Thank you for shopping with us, " + customerName + "!\nYour total is ₱" + total);
                            break;
                        }
                    

                }
                else if (choice == 1010){
                    String itemCode = "1010TAS";
                    int quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "How many pieces would you like to purchase?"));
                    double tot = (170.50 * quantity);
                    double price = 0;
                        for(int i = 0; i < items.length; i++) {
                        if(choice == items[i][0]) {
                            price = items[i][1];
                            total += price * quantity;
                            break;
                        }
                    }
                    System.out.println("            "+itemCode+"            "+quantity+"          "+tot);
                    int more = JOptionPane.showConfirmDialog
                    (null, "Would you like to add more items?", "More?", JOptionPane.YES_NO_OPTION);
                        if (more == 0) {
                            continue;
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Thank you for shopping with us, " + customerName + "!\nYour total is ₱" + total);
                            break;
                        }
                    

                }
                else {
                    JOptionPane.showMessageDialog(null, "Invalid Option! You can try again"); 
                    continue;
                }
        }
    }
}
  

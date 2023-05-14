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
                purchaseLoop.main(args);
            }
            else {
            JOptionPane.showMessageDialog(null, "INVALID ID NUMBER", "Denied", JOptionPane.PLAIN_MESSAGE);
            }
        }
           
        else {
            JOptionPane.showMessageDialog(null, "Thanks", "Bye", JOptionPane.PLAIN_MESSAGE);
        }
    }
}


  

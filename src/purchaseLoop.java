import javax.swing.*;
import java.text.DecimalFormat;

public class purchaseLoop {
    public static void main(String[] args) {
        DecimalFormat deciform = new DecimalFormat("#,###.00");
        // double [][] items = {{1001, 199.75}, {1002, 148.50}, {1003, 247.75}, {1004, 180.25}, {1005, 120.25},
        //              {1006, 130.50}, {1007, 298.50}, {1008, 279.25}, {1009, 190.00}, {1010, 170.50}};
        String [][] items = {{"1001", "BAWANG", "9.75"},
                             {"1002", "PAMINTA", "1.50"},
                             {"1003", "SS. SOY", "247.75"},
                             {"1004", "LUYA", "180.25"},
                             {"1005", "SIBUYAS", "120.25"},
                             {"1006", "OYSTER S.", "130.50"},
                             {"1007", "MANTIKA .5L", "298.50"},
                             {"1008", "BAGOONG", "279.25"},
                             {"1009", "MAGIC S.", "190.00"},
                             {"1010", "SINIGANG MIX", "170.50"}};
double total = 0;
String customerName = JOptionPane.showInputDialog(null, "Enter Customer's Name");

while (true) {
    int choice = Integer.parseInt(JOptionPane.showInputDialog("Enter Product Code:\n"
        + "[1001] Atomic Habits - ₱199.75\n"
        + "[1002] 48 Laws of Power - ₱148.50\n"
        + "[1003] Meditations - ₱247.75\n"
        + "[1004] The Myth of Sissyphus - ₱180.25\n"
        + "[1005] Show Your Work - ₱120.25\n"
        + "[1006] Steal Like an Artist - ₱130.50\n"
        + "[1007] Thus Spoke Zarathustra - ₱298.50\n"
        + "[1008] Letters from a Stoic - ₱279.25\n"
        + "[1009] The Daily Stoic - ₱190.00\n"
        + "[1010] The Art of Seduction - ₱170.50"));
        
    // for(int i = 0; i < items.length; i++) {
    //     if(choice == items[i][0]) {
    //         String itemCode = String.format("%04d", (int)items[i][0]);
    //         int quantity = Integer.parseInt(JOptionPane.showInputDialog("How many pieces would you like to purchase?"));
    //         double tot = (items[i][1] * quantity);
    //         total += tot;
    //         System.out.println("            "+itemCode+"                "+quantity+"              "+deciform.format(tot));
    //         break;
    //     }
    // }
    for(int i = 0; i < items.length; i++) {
                if(choice == Integer.parseInt(items[i][0])) {
                    String itemCode = items[i][1];
                    int quantity = Integer.parseInt(JOptionPane.showInputDialog("How many pieces would you like to purchase?"));
                    double tot = (Double.parseDouble(items[i][2]) * quantity);
                    total += tot;
                    System.out.println("            "+itemCode+"                "+quantity+"              "+deciform.format(tot));
                    break;
                }
            }
    
    int more = JOptionPane.showConfirmDialog(null, "Would you like to add more items?", "More?", JOptionPane.YES_NO_OPTION);
    if (more == 0) {
        continue;
    }
    else {
        double cash = Double.parseDouble(JOptionPane.showInputDialog(null, "Your total is "+deciform.format((total+(total*0.12)))+" along with the VAT\n"+"Enter Cash Amount:", "Cash"));
        double vat = total*0.12;
        System.out.println("\n--------------------------------------------------------------\n"
                          +"            SUBTOTAL     :                    "+deciform.format(total)
                          +"\n            VAT(12%)     :                    "+deciform.format(vat)
                          +"\n\033[1m            TOTAL       :\033[0m                     "+"\033[1m"+deciform.format((total+vat))+"\033[0m"
                          +"\n\033[1m            CASH        :\033[0m                     "+deciform.format(cash)
                          +"\n\033[1m            CHANGE      :\033[0m                     "+deciform.format((cash-(total+vat)))
                          +"\n--------------------------------------------------------------\n"
                          +"\n\033[1m      Sold to: \033[0m"+"\033[1m"+customerName+"\033[0m\n"
                          +"\n                    THIS SERVES AS SALES INVOICE\n"
                          +"                    ---THANK YOU, COME AGAIN---");

        break;
    }
}
        
    }
}

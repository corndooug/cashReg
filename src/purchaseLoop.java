import javax.swing.*;
import java.text.DecimalFormat;

public class purchaseLoop {
    public static void main(String[] args) {
        DecimalFormat deciform = new DecimalFormat("#,###.00");
        String [][] items = {{"1001", "BWNG", "9.75"},
                             {"1002", "PMNT", "10.00"},
                             {"1003", "SSOY", "9.75"},
                             {"1004", "LUYA", "20.25"},
                             {"1005", "SBYS", "10.50"},
                             {"1006", "YSTR", "8.50"},
                             {"1007", "COIL", "180.50"},
                             {"1008", "BGNG", "99.25"},
                             {"1009", "MGCS", "6.00"},
                             {"1010", "SNGN", "13.50"}};
double total = 0;
String customerName = JOptionPane.showInputDialog(null, "Enter Customer's Name");

while (true) {
    int choice = Integer.parseInt(JOptionPane.showInputDialog("Enter Product Code:\n"
        + "[1001] BAWANG        - ₱9.50/bulb\n"
        + "[1002] PAMINTA       - ₱10.00/ribbon\n"
        + "[1003] SS. SOY       - ₱9.75/200ml\n"
        + "[1004] LUYA          - ₱20.25/large\n"
        + "[1005] SIBUYAS       - ₱10.50/m.piece\n"
        + "[1006] OYSTER S.     - ₱8.50/50ml\n"
        + "[1007] B. CORN OIL   - ₱180.50/900ml\n"
        + "[1008] JB BAGOONG    - ₱99.25/750ml\n"
        + "[1009] MAGIC S.      - ₱6.00/30g\n"
        + "[1010] SINIGANG M.   - ₱13.50/50g\n"));
            
     for(int i = 0; i < items.length; i++) {
                if(choice == Integer.parseInt(items[i][0])) {
                    String itemCode = items[i][1];
                    int quantity = Integer.parseInt(JOptionPane.showInputDialog("How many pieces would you like to purchase?"));
                        if (quantity<0) {
                            JOptionPane.showConfirmDialog(null, "Invalid Input");
                            continue;
                        }
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
    else if(more == 1) {
        double cash = Double.parseDouble(JOptionPane.showInputDialog(null, "Your total is "+deciform.format((total+(total*0.12)))+" along with the VAT\n"+"Enter Cash Amount:", "Cash"));
        double vat = total*0.12;
        System.out.println("\n--------------------------------------------------------------\n"
                          +"            SUBTOTAL    :                     "+deciform.format(total)
                          +"\n            VAT(12%)    :                     "+deciform.format(vat)
                          +"\n\033[1m            TOTAL       :\033[0m                     "+"\033[1m"+deciform.format((total+vat))+"\033[0m"
                          +"\n\033[1m            CASH        :\033[0m                     "+deciform.format(cash)
                          +"\n\033[1m            CHANGE      :\033[0m                     "+deciform.format((cash-(total+vat)))
                          +"\n==============================================================\n"
                          +"\n\033[1m      SOLD TO: \033[0m"+"\033[1m"+customerName+"\033[0m\n"
                          +"\n                    THIS SERVES AS SALES INVOICE\n"
                          +"                    ---THANK YOU, COME AGAIN---\n\n");
                        break;
    }

    else {
        JOptionPane.showConfirmDialog(null, "Invalid Input", "Invalid", JOptionPane.OK_OPTION);
        break;
            }
}
        
    }
}

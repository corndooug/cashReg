import javax.swing.*;
public class purchaseLoop {
    public static void main(String[] args) {
        double [][] items = {{1001, 199.75}, {1002, 148.50}, {1003, 247.75}, {1004, 180.25}, {1005, 120.25},
                     {1006, 130.50}, {1007, 298.50}, {1008, 279.25}, {1009, 190.00}, {1010, 170.50}};
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
        
    for(int i = 0; i < items.length; i++) {
        if(choice == items[i][0]) {
            String itemCode = String.format("%04d", (int)items[i][0]);
            int quantity = Integer.parseInt(JOptionPane.showInputDialog("How many pieces would you like to purchase?"));
            double tot = (items[i][1] * quantity);
            total += tot;
            System.out.println("            "+itemCode+"                "+quantity+"              "+tot);
            break;
        }
    }
    
    int more = JOptionPane.showConfirmDialog(null, "Would you like to add more items?", "More?", JOptionPane.YES_NO_OPTION);
    if (more == 0) {
        continue;
    }
    else {
        double cash = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Cash Amount:", "Cash"));
        double vat = total*0.12;
        System.out.println("\n--------------------------------------------------------------\n"
                          +"           SUBTOTAL      :                    "+total
                          +"\n           VAT(12%)      :                    "+vat
                          +"\n--------------------------------------------------------------\n"
                          +"\n            TOTAL       :                     "+(total+vat)
                          +"\n            CASH        :                     "+cash
                          +"\n            CHANGE      :                     "+(cash-(total+vat)));
        break;
    }
}
    }
}

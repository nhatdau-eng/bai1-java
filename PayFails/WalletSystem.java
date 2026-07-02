public class WalletSystem {
    public static void main(String[] args) {
        System.out.println("---GIAO DICH NAP TIEN---");
        long currentBalance = 2147000000L;
        long depositAmount = 1000000L;

        long newBalance = currentBalance + depositAmount;
        System.out.println("So du khi nap:" + newBalance + "VND");
        System.out.println("\n --- THONG KE CHI TIEU---");

        long totalSpent = 0L;
        long transactionCount = 0L;
        long averageSpent;

        if (transactionCount > 0) {
            averageSpent = totalSpent / transactionCount;
        } else {
            averageSpent = 0L;
        }

        System.out.println("Chi tieu trung binh moi giao dich: "
                + averageSpent + " VND");
    }
}

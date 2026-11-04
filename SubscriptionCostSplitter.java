import java.util.Scanner;
import java.util.InputMismatchException;

public class SubscriptionCostSplitter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("هزینه کل اشتراک را وارد کنید: ");
            double totalCost = scanner.nextDouble();

            System.out.print("تعداد افرادی که هزینه را پرداخت می‌کنند وارد کنید: ");
            int numberOfPeople = scanner.nextInt();

            // ۱. بررسی اینکه تعداد افراد صفر نباشد
            if (numberOfPeople == 0) {
                System.out.println("تعداد افراد نمی‌تواند صفر باشد.");
                return;
            }

            // ۲. بررسی مقادیر منفی (هزینه یا تعداد افراد)
            if (totalCost < 0 || numberOfPeople < 0) {
                System.out.println("هزینه یا تعداد افراد نمی‌تواند منفی باشد.");
                return;
            }

            // ۳. محاسبه سهم هر نفر و نمایش با مقدار اعشاری
            double sharePerPerson = totalCost / numberOfPeople;
            System.out.printf("سهم هر نفر: %.2f تومان%n", sharePerPerson);

        } catch (InputMismatchException e) {
            // اگر کاربر به‌جای عدد، متن یا کاراکتر دیگری وارد کند
            System.out.println("ورودی نامعتبر است.");
        } finally {
            scanner.close();
        }
    }
}

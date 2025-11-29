import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BudgetManager {
    private List<Expense> expenses = new ArrayList<>();

    // 功能1：添加账单
    public void addExpense() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入类别 (如: 吃饭): ");
        String category = scanner.next();
        System.out.println("请输入金额: ");
        double amount = scanner.nextDouble();
        System.out.println("请输入备注: ");
        String note = scanner.next();

        Expense e = new Expense(category, amount, note);
        expenses.add(e);
        System.out.println(">>> 记账成功！");
        // 这里可以加一行代码调用 saveToFile()
    }

    // 功能2：查看所有账单
    public void showAll() {
        System.out.println("----- 你的账本 -----");
        for (Expense e : expenses) {
            System.out.println(e.toString());
        }
        System.out.println("-------------------");
    }

    // 功能3：统计总支出
    public void showTotal() {
        double total = 0;
        for (Expense e : expenses) {
            total += e.getAmount();
        }
        System.out.println(">>> 当前总支出: " + total + " 元");
    }
}
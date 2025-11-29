import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BudgetManager manager = new BudgetManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== 大学生极简记账本 ===");
            System.out.println("1. 记一笔");
            System.out.println("2. 看账单");
            System.out.println("3. 统计总额");
            System.out.println("4. 退出");
            System.out.print("请选择: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1: manager.addExpense(); break;
                case 2: manager.showAll(); break;
                case 3: manager.showTotal(); break;
                case 4: 
                    System.out.println("再见！记得省钱哦！");
                    return;
                default: System.out.println("输入无效，请重试。");
            }
        }
    }
}
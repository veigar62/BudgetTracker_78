import java.io.Serializable;
import java.time.LocalDate;

// 实现了Serializable接口，方便后续如果要扩展对象流存储
public class Expense {
    private String category; // 类别：吃饭、交通
    private double amount;   // 金额
    private LocalDate date;  // 日期
    private String note;     // 备注

    public Expense(String category, double amount, String note) {
        this.category = category;
        this.amount = amount;
        this.date = LocalDate.now(); // 默认今天
        this.note = note;
    }

    // 格式化输出，方便显示
    @Override
    public String toString() {
        return date + " | [" + category + "] : " + amount + "元 (" + note + ")";
    }

    // Getter 和 Setter 省略...
    public double getAmount() { return amount; }
}
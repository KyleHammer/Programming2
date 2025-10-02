import java.text.*;
import javafx.beans.property.*;

public class Group {
    private String name;
    private int capacity;
    private double price;
    private int sold;

    public Group(String name, int capacity, double price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
        sold = 0;
    }

    public final String getName() { return name; }
    public final int getCapacity() { return capacity; }
    public final double getPrice() { return price; }
    public final int getSold() { return sold; }
    public final double getIncome() { return sold * price; } // Note: Derived from other values
    public final int getLeft() { return capacity - sold; }

    public void sell(int number) {
        sold += number;
    }

    @Override
    public String toString() {
        return getLeft() + " " + name + " seats @ $" + formatted(price);
    }

    private String formatted(double money) {
        return new DecimalFormat("###,##0.00").format(money);
    }
}

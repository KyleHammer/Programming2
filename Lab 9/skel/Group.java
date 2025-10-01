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

    public String getName() { return name; }
    public int getCapacity() { return capacity; }
    public double getPrice() { return price; }
    public int getSold() { return sold; }
    public double getIncome() { return sold * price; }
    public int getLeft() { return capacity - sold; }

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

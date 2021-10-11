package chapter_10.betacode;

import java.time.LocalDate;

public class Order {
    private LocalDate orderDate;
    private boolean finished;
    private String item;
    private int units;
    private float unitCost;
    private float total;

    public Order(LocalDate orderDate,
                 boolean finished,
                 String item,
                 int units,
                 float unitCost,
                 float total) {
        this.orderDate = orderDate;
        this.finished = finished;
        this.item = item;
        this.units = units;
        this.unitCost = unitCost;
        this.total = total;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public boolean isFinished() {
        return finished;
    }

    public String getItem() {
        return item;
    }

    public int getUnits() {
        return units;
    }

    public float getUnitCost() {
        return unitCost;
    }

    public float getTotal() {
        return total;
    }
}

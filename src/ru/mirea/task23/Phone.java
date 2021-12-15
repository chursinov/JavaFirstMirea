package ru.mirea.task23;

public class Phone {
    public String model;
    public int price;
    public int year;
    public Phone(String model, int price, int year){
        this.model = model;
        this.price = price;
        this.year = year;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone that = (Phone) o;
        if (model != that.model) return false;
        if (price != that.price) return false;
        return model.equals(that.model);
    }
    @Override
    public int hashCode() {
        int result = model == null ? 0 : model.hashCode();
        result = 29 * result + price;
        result = 29 * result + year;
        return result;
    }
}

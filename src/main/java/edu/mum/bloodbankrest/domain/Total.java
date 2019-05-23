package edu.mum.bloodbankrest.domain;

public class Total {

    private int total;
    private String name;


    public Total() {
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Total{" +
                "total=" + total +
                ", name='" + name + '\'' +
                '}';
    }
}

package edu.xjtu;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Person implements Comparable {
    private final int nID;
    private final String name;
    private int salary = 0;
    private int rank = 1;
    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        if (getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getID() == person.getID();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getID());
    }

    @Override
    public String toString() {
        return getClass().getName() +
                "[ID = " + nID +
                ", name = " + name +
                ", salary = " + salary + "]";
    }

    @Override
    public int compareTo(@NotNull Object o) {
        if (getClass()!= o.getClass()) throw new ClassCastException();
        Person person = (Person) o;
        return getRank() - person.getRank();
    }

    public int getRank() {
        return rank;
    }

    public Person(int _ID, @NotNull String _name, int _salary, int _rank)
    {
        nID = _ID;
        name = _name;
        salary = _salary;
        rank = _rank;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getID() {
        return nID;
    }

    public String getName() {
        return name;
    }

}

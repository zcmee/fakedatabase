package pl.fakedatabase.domain;

/**
 * Created by SkyNET on 2017-10-31.
 */
public class Shit {
    private String name;
    private int day;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Shit{" +
                "name='" + name + '\'' +
                ", day=" + day +
                '}';
    }
}

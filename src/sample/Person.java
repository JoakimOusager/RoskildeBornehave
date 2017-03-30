package sample;

/**
 * Created by anderstofte on 30/03/2017.
 */
public class Person {

    private String name;
    private int timesMondayStart;
    private int timesMondayEnd;
    private int timesThuesdayStart;
    private int timesThuesdayEnd;
    private int timesWednesdayStart;
    private int timesWednesdayEnd;
    private int timesThursdayStart;
    private int timesThursdayEnd;
    private int timesFridayStart;
    private int timesFridayEnd;

    public Person() {
        this.name = "";
        this.timesMondayStart = 0;
        this.timesMondayEnd = 0;
        this.timesThuesdayStart = 0;
        this.timesThuesdayEnd = 0;
        this.timesWednesdayStart = 0;
        this.timesWednesdayEnd = 0;
        this.timesThursdayStart = 0;
        this.timesThursdayEnd = 0;
        this.timesFridayStart = 0;
        this.timesFridayEnd = 0;
    }

    public Person(String name, int timesMondayStart, int timesMondayEnd, int timesThuesdayStart, int timesThuesdayEnd,
                  int timesWednesdayStart, int timesWednesdayEnd, int timesThursdayStart, int timesThursdayEnd, int timesFridayStart,
                  int timesFridayEnd) {
        this.name = name;
        this.timesMondayStart = timesMondayStart;
        this.timesMondayEnd = timesMondayEnd;
        this.timesThuesdayStart = timesThuesdayStart;
        this.timesThuesdayEnd = timesThuesdayEnd;
        this.timesWednesdayStart = timesWednesdayStart;
        this.timesWednesdayEnd = timesWednesdayEnd;
        this.timesThursdayStart = timesThursdayStart;
        this.timesThursdayEnd = timesThursdayEnd;
        this.timesFridayStart = timesFridayStart;
        this.timesFridayEnd = timesFridayEnd;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimesMondayStart() {
        return timesMondayStart;
    }

    public void setTimesMondayStart(int timesMondayStart) {
        this.timesMondayStart = timesMondayStart;
    }

    public int getTimesMondayEnd() {
        return timesMondayEnd;
    }

    public void setTimesMondayEnd(int timesMondayEnd) {
        this.timesMondayEnd = timesMondayEnd;
    }

    public int getTimesThuesdayStart() {
        return timesThuesdayStart;
    }

    public void setTimesThuesdayStart(int timesThuesdayStart) {
        this.timesThuesdayStart = timesThuesdayStart;
    }

    public int getTimesThuesdayEnd() {
        return timesThuesdayEnd;
    }

    public void setTimesThuesdayEnd(int timesThuesdayEnd) {
        this.timesThuesdayEnd = timesThuesdayEnd;
    }

    public int getTimesWednesdayStart() {
        return timesWednesdayStart;
    }

    public void setTimesWednesdayStart(int timesWednesdayStart) {
        this.timesWednesdayStart = timesWednesdayStart;
    }

    public int getTimesWednesdayEnd() {
        return timesWednesdayEnd;
    }

    public void setTimesWednesdayEnd(int timesWednesdayEnd) {
        this.timesWednesdayEnd = timesWednesdayEnd;
    }

    public int getTimesThursdayStart() {
        return timesThursdayStart;
    }

    public void setTimesThursdayStart(int timesThursdayStart) {
        this.timesThursdayStart = timesThursdayStart;
    }

    public int getTimesThursdayEnd() {
        return timesThursdayEnd;
    }

    public void setTimesThursdayEnd(int timesThursdayEnd) {
        this.timesThursdayEnd = timesThursdayEnd;
    }

    public int getTimesFridayStart() {
        return timesFridayStart;
    }

    public void setTimesFridayStart(int timesFridayStart) {
        this.timesFridayStart = timesFridayStart;
    }

    public int getTimesFridayEnd() {
        return timesFridayEnd;
    }

    public void setTimesFridayEnd(int timesFridayEnd) {
        this.timesFridayEnd = timesFridayEnd;
    }
}

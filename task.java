import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class task {

    public String name;
    public String description;
    public Calendar date;
    public String contacts;
    //public task[] TaskList;

    public task() {
        this.name = "Task";
        this.description = "";
        Calendar createDate = Calendar.getInstance();
        this.date = createDate;
        this.contacts = "";
    }

    public task(String name, String description, int year, int month, int day, int hours, int minutes, int seconds, String contacts) {
        this.name = name;
        this.description = description;
        Calendar createDate = new GregorianCalendar(year, month, day, hours, minutes, seconds);
        this.date = createDate;
        this.contacts = contacts;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public void setDate(int year, int month, int day, int hours, int minutes, int seconds) {
        Calendar createDate = new GregorianCalendar(year, month, day, hours, minutes, seconds);
        this.date = createDate;
    }
    public Date getDate() {
        Date date = this.date.getTime();
        return date;
    }
    public void setContacts(String contacts) {
        this.contacts = contacts;
    }
    public String getContacts() {
        return contacts;
    }
}

import java.util.Calendar;

public class TodaysDate {
    String time;
    public int day;
    private int month;
    protected int year;

    private void getTime() {
        Calendar calendar = Calendar.getInstance();
        time = calendar.get(Calendar.HOUR_OF_DAY) + ":"
                + calendar.get(Calendar.MINUTE) + ":"
                + calendar.get(Calendar.SECOND);
    }

    private void getDay() {
        Calendar calendar = Calendar.getInstance();
        day = calendar.get(Calendar.DATE);
    }

    private void getMonth() {
        Calendar calendar = Calendar.getInstance();
        month = calendar.get(Calendar.MONTH) + 1;
    }

    private void getYear() {
        Calendar calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
    }

    public void printDateAndTime() {
        getTime();
        getDay();
        getMonth();
        getYear();

        System.out.println("Time: " + time);
        System.out.println("Date: " + day + " " + month + " " + year);
    }

    public static class TestFecha {
        public static void main(String[] args) {
            TodaysDate hoy = new TodaysDate();
            hoy.printDateAndTime();
        }
    }
}
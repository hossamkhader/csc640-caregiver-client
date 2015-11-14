package gui;


import java.util.StringTokenizer;


public class CronExpression {
    
    private String minutes;
    private String hours;
    private String daysOfMonth;
    private String months;
    private String daysOfWeek;
    
    public CronExpression()
    {
        minutes = "*";
        hours = "*";
        daysOfMonth = "*";
        months = "*";
        daysOfWeek = "*";
    }
    
    public void setExpression(String expression)
    {
        StringTokenizer exprsTok = new StringTokenizer(expression, " \t", false);
        setMinutes(exprsTok.nextToken().trim());
        setHours(exprsTok.nextToken().trim());
        setDaysOfMonth(exprsTok.nextToken().trim());
        setMonths(exprsTok.nextToken().trim());
        setDaysOfWeek(exprsTok.nextToken().trim());
    }
    
    public String getExpression()
    {
        return getMinutes() + " \t" + getHours() + " \t" + getDaysOfMonth() + " \t" + getMonths() + " \t" + getDaysOfWeek() + " \t";
    }


    public String getMinutes() {
        return minutes;
    }

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getDaysOfMonth() {
        return daysOfMonth;
    }

    public void setDaysOfMonth(String daysOfMonth) {
        this.daysOfMonth = daysOfMonth;
    }

    public String getMonths() {
        return months;
    }

    public void setMonths(String months) {
        this.months = months;
    }

    public String getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(String daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }
    
}

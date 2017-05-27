package domain;

import java.util.Date;

/**
 * Created by 210218673 on 5/2/2017.
 */
public class Reputation {

    public Date date;
    public int value;

    public Reputation ()
    {

    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

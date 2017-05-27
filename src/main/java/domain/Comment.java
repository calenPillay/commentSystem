package domain;

import java.util.Date;

/**
 * Created by 210218673 on 5/2/2017.
 */
public class Comment {

    public String comment;
    public Date date;
    public String ipaddress;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }
}

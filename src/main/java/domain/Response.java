package domain;

import java.util.Date;

/**
 * Created by 210218673 on 5/2/2017.
 */
public class Response {

    public String comment;
    public Date date;
    public String ipaddress;
    private Comment com;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Comment getCom() {
        return com;
    }

    public void setCom(Comment com) {
        this.com = com;
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

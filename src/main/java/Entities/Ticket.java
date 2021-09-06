package Entities;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.Scanner;

public class Ticket {


    private String tenChuyen;
    private Date ngayBay;
    private long giaVe;

    public Ticket(String tenChuyen, Date ngayBay, long giaVe) {
        this.tenChuyen = tenChuyen;
        this.ngayBay = ngayBay;
        this.giaVe = giaVe;
    }

    public Ticket() {
    }

    public String getTenChuyen() {
        return tenChuyen;
    }

    public Date getNgayBay() {
        return ngayBay;
    }

    public long getGiaVe() {
        return giaVe;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Ticket\n{\n");
        sb.append("TenChuyen: \t").append(tenChuyen).append('\n');
        sb.append("NgayBay: \t").append(this.getNgayBay()).append('\n');
        sb.append("GiaVe: \t").append(giaVe).append("\n");
        sb.append('}');
        return sb.toString();
    }

    public void nhapThongTinVe() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tên chuyến bay: ");
        String ten = sc.nextLine();
        this.tenChuyen = ten;
        System.out.println("Nhập vào ngày bay: MM-dd-yyyy HH:mm:ss"); //20/10/2020
        String ngayBay = sc.nextLine();
        DateFormat df = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        Date date = null;
        date = df.parse(ngayBay);
        this.ngayBay = date;
        System.out.println("MM-dd-yyyy HH:mm:ss " + ngayBay);
        System.out.println("Nhập giá vé: ");
        long giaTien = sc.nextLong();
        this.giaVe = giaTien;

    }


}



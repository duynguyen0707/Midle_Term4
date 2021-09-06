package Entities;

import java.text.ParseException;
import java.time.Year;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Passenger {
    private String hoTen;
    private String gioiTinh;
    private int tuoi;
    private Ticket[] danhSachVe;


    public Passenger(String hoTen, String gioiTinh, int tuoi, Ticket[] danhSachVe) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
        this.danhSachVe = danhSachVe;
    }

    public Ticket[] getDanhSachVe() {
        return danhSachVe;
    }

    public Passenger() {

    }

    public int tinhTuoi(int namSinh) {
        int tuoi = 0;
        Calendar cl = Calendar.getInstance();
        int yearNow = cl.get(Calendar.YEAR);
        tuoi = yearNow - namSinh;
        return tuoi;
    }

    public void nhapThongTinKhach() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên hành khách: ");
        String tenFromConsole = sc.nextLine();
        this.hoTen = tenFromConsole;

        System.out.println("Nhập giới tính: ");
        String gioiTinhFromConsole = sc.nextLine();
        this.gioiTinh = gioiTinhFromConsole;

        System.out.println("Nhập năm sinh: ");
        int namSinhFromConsole = sc.nextInt();
        int tuoiFromConsole = tinhTuoi(namSinhFromConsole);
        this.tuoi = tuoiFromConsole;
        System.out.println("Nhập số lượng vé: ");
        int soLuongVe = sc.nextInt();

        this.danhSachVe = new Ticket[soLuongVe];
        for (int i = 0; i < soLuongVe; i++) { // i = 0, tk A
            Ticket tk = new Ticket();
            tk.nhapThongTinVe();
            this.danhSachVe[i] = tk;
            // System.out.println("Danh sách vé đang có:" + this.getDanhSachVe());

        }
    }

    public void PrintInfo() {
        System.out.println("Ten: " + this.hoTen);
        System.out.println("Tong tien ve: " + this.tongTienVe());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Passenger\n{\n");
        sb.append("hoTen: \t").append(hoTen).append('\n');
        sb.append("gioiTinh: \t").append(gioiTinh).append('\n');
        sb.append("tuoi: \t").append(tuoi).append('\n');
        sb.append("danhSachVe: \t").append(danhSachVe == null ? "null" : Arrays.asList(danhSachVe).toString()).append('\n');
        sb.append('}');
        return sb.toString();
    }

    public long tongTienVe() {
        long sum = 0;
        Ticket arr[] = this.danhSachVe;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].getGiaVe();
        }

        return sum;
    }

}





import Entities.Passenger;
import Entities.Ticket;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws ParseException {
//        LocalDateTime ldt = LocalDateTime.of(2021, 8, 20, 10, 8, 9);
//        System.out.println(ldt);
        Scanner sc = new Scanner(System.in);
//        Ticket tk = new Ticket();
//        tk.nhapThongTinVe();
//        System.out.println(tk);
//        long n = tk.getGiaVe();
//        System.out.println("Gía vé: " + n);
        System.out.println("Nhập vào số lượng hành khách: ");
        int soHanhKhach = sc.nextInt();
        Passenger listHanhKhach[] = new Passenger[soHanhKhach];
        for (int i = 0; i < listHanhKhach.length; i++) {
            Passenger ps = new Passenger();
            System.out.println("Nhập thông tin hành khách thứ: " + (i + 1));
            ps.nhapThongTinKhach();
            listHanhKhach[i] = ps;

        }

        for (int i = 0; i < listHanhKhach.length; i++) {
            long toTalTienVe = listHanhKhach[i].tongTienVe();
            System.out.println(listHanhKhach[i].toString());
            System.out.println("Số tiền vé phải trả là: " + toTalTienVe);

        }
        for (int i = 0; i < listHanhKhach.length - 1; i++) {
            for (int j = 0; j < listHanhKhach.length; j++) {
                if (listHanhKhach[i].tongTienVe() < listHanhKhach[j].tongTienVe()) {
                    Passenger tem = listHanhKhach[i];
                    listHanhKhach[i] = listHanhKhach[j];
                    listHanhKhach[j] = tem;
                }
            }
        }

        for (int i = 0; i < listHanhKhach.length; i++) {
            long toTalTienVe = listHanhKhach[i].tongTienVe();
            System.out.println(listHanhKhach[i]);
            System.out.println("Số tiền vé phải trả là: " + toTalTienVe);

        }
    }
}

package by.academy.it.main;

import by.academy.it.controller.Printer;
import by.academy.it.data.Ticket;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Ticket ticket = printer.printTicket("A1020-7 AA", "2021-09-25 21:20:00");
        System.out.println(ticket);
    }
}

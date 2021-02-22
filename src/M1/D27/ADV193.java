package M1.D27;

import java.awt.*;
import java.util.Scanner;

class Llist {
    class node {
        int data;
        node next;
    }

    private node head;
    private int length = 0;
    private node backNode;

    Llist() {
        head = new node();
        head.next = null;
        backNode = head;
    }

    void add(int pos, int data) {
        node r = head;
        while (r.next != null && r.next.data != pos) {
            r = r.next;
        }
        node Nnode = new node();
        Nnode.data = data;
        Nnode.next = r.next;
        r.next = Nnode;
        length++;
    }

    void add_back(int data){
        node Nnode = new node();
        Nnode.data = data;
        Nnode.next = null;
        backNode.next = Nnode;
        backNode = Nnode;
        length++;
    }

    void del(int pos) {
        node r = head;
        while (r.next != null && r.next.data != pos) {
            r = r.next;
        }
        if (r.next != null) {
            r.next = r.next.next;
        }
        length--;
    }

    void print() {
        node r = head;
        while (r.next != null) {
            System.out.print(r.next.data + " ");
            r = r.next;
        }
    }

    int length() {
        return length;
    }
}

public class ADV193 {

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        String buf = scanner.nextLine();
        int n = Integer.parseInt(buf.split(" ")[0]);
        int m = Integer.parseInt(buf.split(" ")[1]);

        Llist llist = new Llist();
        for (int i = 1; i < n; i++) {
            llist.add_back(scanner.nextInt());
        }
        scanner.nextLine();
        for (int i = 0; i < m; i++) {
            buf = scanner.nextLine();
            String[] splitL = buf.split(" ");
            if (splitL[0].equals("DEL")) {
                llist.del(Integer.parseInt(splitL[1]));
            } else {
                llist.add(Integer.parseInt(splitL[1]), Integer.parseInt(splitL[2]));
            }
        }
        System.out.println(llist.length());
        llist.print();
    }
}

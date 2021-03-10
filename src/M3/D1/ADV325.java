package M3.D1;

import java.util.Scanner;

class nodeList {
    private static class node {
        String name;
        String stuNum;
        float engScore;
        float mathScore;
        float cppScore;
        node next;
    }

    private node head;

    nodeList() {
        head = new node();
    }

    void insert(String name, String stuNum, float engScore, float mathScore, float cppScore) {
        node p = head;
        while (p.next != null) {
            p = p.next;
        }
        node newNode = new node();
        p.next = newNode;
        newNode.name = name;
        newNode.stuNum = stuNum;
        newNode.engScore = engScore;
        newNode.mathScore = mathScore;
        newNode.cppScore = cppScore;
        newNode.next = null;
    }

    String getMaxMin() {
        node p = head.next;
        float sum = p.mathScore + p.engScore + p.cppScore;
        float max = 0, min = sum + 1;
        String maxName = "", minName = "";
        while (p != null) {
            sum = p.mathScore + p.engScore + p.cppScore;
            if (sum > max) {
                max = sum;
                maxName = p.name;
            }
            if (sum < min) {
                min = sum;
                minName = p.name;
            }
            p = p.next;
        }
        return maxName + "\n" + minName;
    }
}

public class ADV325 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        nodeList list = new nodeList();
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++) {
            String[] data = scanner.nextLine().split(" ");
            list.insert(data[0], data[1], Float.parseFloat(data[2]), Float.parseFloat(data[3]), Float.parseFloat(data[4]));
        }
        System.out.println(list.getMaxMin());
    }
}

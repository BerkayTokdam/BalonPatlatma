import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Balon {
    public static void balonPozisyonuBul(int m, int n) {
        Node aaa = new Node(1);
        Node current = aaa;

        for (int i = 2; i <= n; i++) {
            Node yeniNode = new Node(i);
            current.next = yeniNode;
            current = yeniNode;
        }

        current.next = aaa;

        Node once = current; 
        current = aaa;

        if (n == 1) {
            System.out.println("Son kalan balonun pozisyonu: 1");
            return;
        }

        while (current.next != current) {
            for (int i = 1; i < m; i++) {
                once = current;
                current = current.next;
            }

            once.next = current.next;
            current = once.next;
        }

        System.out.println("Son kalan balonun pozisyonu: " + current.data);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N değerini girin: ");
        int n = input.nextInt();
        System.out.print("M değerini girin: ");
        int m = input.nextInt();
        balonPozisyonuBul(m, n);
        input.close();
    }
}

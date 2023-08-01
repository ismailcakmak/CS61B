package disc3;

public class Helpinghand {

    Node sentinel;

    public Helpinghand() {
        this.sentinel = new Node();
    }

    private static class Node {
        int item;
        Node next;
    }

    public int findFirst(int n) {
        return findFirstHelper(n,0,sentinel.next);
    }

    private int findFirstHelper(int n, int index, Node curr) {
        if(curr == null)
            return -1;
        if(n == 0) {
            return index;
        }
        else {
            return findFirstHelper(n-1, index+1, curr.next);
        }
    }

}

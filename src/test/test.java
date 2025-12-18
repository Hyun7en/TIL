package test;

import java.io.IOException;
import java.util.Arrays;


public class test {

    private static class Node{
        int dest, cost;

        public Node(int dest, int cost){
            this.dest = dest;
            this.cost = cost;
        }
    }

    public static void main(String[] args) throws IOException {
        Node[] nodes = new Node[5];
        nodes[0] = new Node(1, 10);
        nodes[1] = new Node(2, 20);
        nodes[2] = new Node(3, 15);
        nodes[3] = new Node(4, 5);
        nodes[4] = new Node(5, 25);
        Arrays.sort(nodes, (o1,o2) -> Integer.compare(o1.cost, o2.cost));

        for (Node node : nodes) {
            System.out.println(node.dest);
        }

    }

}


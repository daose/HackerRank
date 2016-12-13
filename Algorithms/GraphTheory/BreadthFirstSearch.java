import java.util.*;
import java.lang.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        for(int i = 0; i < tests; i++){
            Graph graph = createGraph(in);
            printDistances(graph);
        }
    }

    public static Graph createGraph(Scanner in){
        TreeMap<Integer, Node> map = new TreeMap<Integer, Node>();
        int n = in.nextInt();
        int m = in.nextInt();

        for(int i = 0; i < n; i++){
            int key = i + 1;
            map.put(key, new Node(key));
        }
        for(int i = 0; i < m; i++){
            int key1 = in.nextInt();
            int key2 = in.nextInt();

            Node node1 = map.get(key1);
            Node node2 = map.get(key2);

            node1.adjNodes.add(node2);
            node2.adjNodes.add(node1);
        }
        int rootValue = in.nextInt();
        return new Graph(map.get(rootValue), map);
    }

    public static void printDistances(Graph graph){
        Node root = graph.root;
        root.distance = 0;
        ArrayDeque<Node> deque = new ArrayDeque<Node>();
        deque.add(root);
        while(deque.size() > 0){
            Node node = deque.poll();
            for(Node adjNode : node.adjNodes){
                if(adjNode.distance == -1 || adjNode.distance > node.distance + 6){
                    adjNode.distance = node.distance + 6;
                    deque.add(adjNode);
                }
            }
        }

        for(Map.Entry<Integer, Node> entry : graph.nodes.entrySet()){
            if(entry.getValue() != graph.root){
                System.out.print(entry.getValue().distance + " ");
            }
        }
        System.out.println("");
    }

    public static class Node {
        int key;
        int distance;
        HashSet<Node> adjNodes;
        public Node(int value){
            this.key = value;
            adjNodes = new HashSet<Node>();
            distance = -1;
        }
    }

    public static class Graph {
        Node root;
        TreeMap<Integer, Node> nodes;
        public Graph(Node root, TreeMap<Integer, Node> nodes){
            this.root = root;
            this.nodes = nodes;
        }
    }
}

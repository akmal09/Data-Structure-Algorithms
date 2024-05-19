package TreeDataStructure.Graph;

import java.util.List;

public class Graph {

    private List<Node> listNode;
    public void runUndirectedGraph(){
        PersonUndirected alice = new PersonUndirected("alice");
        PersonUndirected bob = new PersonUndirected("bob");
        PersonUndirected carol = new PersonUndirected("carol");
        PersonUndirected david = new PersonUndirected("david");

        alice.add(bob);
        alice.add(carol);

        bob.add(alice);
        bob.add(david);

        carol.add(alice);
        carol.add(david);

        david.add(bob);
        david.add(carol);

        System.out.println(printArray(alice));
        System.out.println(printArray(bob));
        System.out.println(printArray(carol));
        System.out.println(printArray(david));
    }

    public void runDirectedGraph(){
        PersonDirected alice = new PersonDirected("alice");
        PersonDirected bob = new PersonDirected("bob");
        PersonDirected carol = new PersonDirected("carol");
        PersonDirected david = new PersonDirected("david");
        PersonDirected emily = new PersonDirected("emily");

        alice.follow(bob);
        alice.follow(carol);

        bob.follow(david);

        carol.follow(emily);

        david.follow(emily);

        System.out.println(printArray(alice));
        System.out.println(printArray(bob));
        System.out.println(printArray(carol));
        System.out.println(printArray(david));
        System.out.println(printArray(emily));

        System.out.println();
        System.out.println();

        System.out.println("david unfollow emily");
        david.unfollow(emily);
        System.out.println(printArray(david));

        System.out.println();
        System.out.println();
        System.out.println("david follow bob");
        david.follow(bob);
        System.out.println(printArray(david));

        System.out.println();
        System.out.println();
        System.out.println("emily follow alice");
        emily.follow(alice);
        System.out.println(printArray(emily));
    }

    private static String printArray(PersonUndirected personUndirected) {
        String output = "";
        System.out.print("list of "+ personUndirected.getName()+" friends is: ");
        int i = 0;
        for (PersonUndirected data : personUndirected.getFriends()) {
            System.out.print(i== personUndirected.getFriends().size()-1? data.getName():data.getName()+", ");
            i++;
        }
        return output;
    }

    public void nodeInitiationAndChooseRoot(String chooseRoot){
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        Node f = new Node("F");
        Node g = new Node("G");

        a.addEdges(b);
        a.addEdges(c);
        a.addEdges(d);

        b.addEdges(e);
        b.addEdges(f);

        e.addEdges(g);

        this.listNode.add(a);
        this.listNode.add(b);
        this.listNode.add(c);
        this.listNode.add(d);
        this.listNode.add(e);
        this.listNode.add(f);
        this.listNode.add(g);
    }

    public Node chooseNodeStarter(String nodeValue){
        for(Node node : this.listNode){
            if(nodeValue.equals(node.getValue())){
                return node;
            }
        }
        return null;
    }

    public void runDfs(){

    }

    private static String printArray(PersonDirected personUndirected) {
        String output = "";
        System.out.print("list of "+ personUndirected.getName()+" friends is: ");
        int i = 0;
        for (PersonDirected data : personUndirected.getFollowers()) {
            System.out.print(i== personUndirected.getFollowers().size()-1? data.getName():data.getName()+", ");
            i++;
        }
        return output;
    }
}

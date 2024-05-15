package TreeDataStructure.Graph;

public class Graph {
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
}

package TreeDataStructure.DjikstraAlgorithm;

public class Djikstra {
    public Node a;
    public Node b;
    public Node c;
    public Node d;
    public Node e;
    public Node f;
    public Node g;
    public Node h;
    public Node i;
    private void graphBuilder(){
        this.a = new Node("0");
        this.b = new Node("1");
        this.c = new Node("2");
        this.d = new Node("3");
        this.e = new Node("4");
        this.f = new Node("5");
        this.g = new Node("6");
        this.h = new Node("7");
        this.i = new Node("8");

        this.a.addEdge(new Edge(4, this.b));
        this.a.addEdge(new Edge(8, this.h));

        this.b.addEdge(new Edge(8, this.c));
        this.b.addEdge(new Edge(7, this.h));

        this.c.addEdge(new Edge(7, this.d));
        this.c.addEdge(new Edge(4, this.f));
        this.c.addEdge(new Edge(2, this.i));

        this.d.addEdge(new Edge(9, this.e));
        this.d.addEdge(new Edge(14, this.f));

        this.e.addEdge(new Edge(10, this.f));

        this.f.addEdge(new Edge(14, this.d));
        this.f.addEdge(new Edge(4, this.c));
        this.f.addEdge(new Edge(2, this.g));

        this.g.addEdge(new Edge(6, this.i));
        this.g.addEdge(new Edge(1, this.h));

        this.h.addEdge(new Edge(8, this.a));
        this.h.addEdge(new Edge(11, this.b));
        this.h.addEdge(new Edge(7, this.i));

        this.i.addEdge(new Edge(2, this.c));
    }
}

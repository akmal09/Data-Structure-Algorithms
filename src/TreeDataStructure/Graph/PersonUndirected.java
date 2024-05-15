package TreeDataStructure.Graph;

import java.util.ArrayList;
import java.util.List;

public class PersonUndirected {
    private String name;

    private List<PersonUndirected> friends;

    public PersonUndirected(String name){
        this.name = name;
        this.friends = new ArrayList<>();
    }

    public List<PersonUndirected> getFriends(){
        return this.friends;
    }

    public String getName(){
        return name;
    }

    public void add(PersonUndirected friend){
        this.friends.add(friend);
    }
}

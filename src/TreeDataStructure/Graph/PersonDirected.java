package TreeDataStructure.Graph;

import java.util.ArrayList;
import java.util.List;

public class PersonDirected {
    private String name;
    private List<PersonDirected> followers;

    public PersonDirected(String personName){
        this.name = personName;
        this.followers = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public List<PersonDirected> getFollowers(){
        return this.followers;
    }

    public void follow(PersonDirected person){
        this.followers.add(person);
    }

    public void unfollow(PersonDirected person){
        this.followers.remove(person);
    }
}

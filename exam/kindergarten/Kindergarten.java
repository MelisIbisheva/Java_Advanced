package kindergarten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Kindergarten {
    private String name;
    private int capacity;
    private List<Child> registry;

    public Kindergarten(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        registry = new ArrayList<>();
    }

    public boolean addChild(Child child){
        if(this.registry.size()<capacity){
            this.registry.add(child);
            return true;
        }
        return false;
    }

    public boolean removeChild(String firstName){
        for(Child child : this.registry){
            if(firstName.equals(child.getFirstName())){
                this.registry.remove(child);
                return true;
            }
        }
        return false;
    }

    public int getChildrenCount(){
        return this.registry.size();
    }

    public Child getChild(String firstName){
        Child currentChild =null;
        for(Child child : this.registry){
            if(firstName.equals(child.getFirstName())){
                currentChild = child;
            }
        }
        return currentChild;

    }

    public String registryReport() {
        Collections.sort(registry, Comparator.comparing(Child::getAge)
                .thenComparing(Child::getFirstName)
                .thenComparing(Child::getLastName));

        StringBuilder report = new StringBuilder();
        report.append("Registered children in ").append(this.name).append(":").append(System.lineSeparator());

        for (Child child : this.registry) {
            report.append("--").append(System.lineSeparator());
            report.append(child).append(System.lineSeparator());
        }
        // return the report string
        return report.toString();
    }
}

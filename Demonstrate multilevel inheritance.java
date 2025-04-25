// Grandparent class
class Grandparent {
    // Field of the Grandparent class
    String grandparentName;
    
    // Constructor for Grandparent
    public Grandparent(String grandparentName) {
        this.grandparentName = grandparentName;
    }
    
    // Method of the Grandparent class
    public void showGrandparentInfo() {
        System.out.println("Grandparent Name: " + grandparentName);
    }
}

// Parent class extends Grandparent (Multilevel inheritance)
class Parent extends Grandparent {
    // Field of the Parent class
    String parentName;
    
    // Constructor for Parent
    public Parent(String grandparentName, String parentName) {
        // Calling the constructor of Grandparent class
        super(grandparentName);
        this.parentName = parentName;
    }
    
    // Method of the Parent class
    public void showParentInfo() {
        System.out.println("Parent Name: " + parentName);
    }
}

// Child class extends Parent (Multilevel inheritance)
class Child extends Parent {
    // Field of the Child class
    String childName;
    
    // Constructor for Child
    public Child(String grandparentName, String parentName, String childName) {
        // Calling the constructor of Parent class (which calls Grandparent constructor)
        super(grandparentName, parentName);
        this.childName = childName;
    }
    
    // Method of the Child class
    public void showChildInfo() {
        System.out.println("Child Name: " + childName);
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        // Creating an object of the Child class
        Child child = new Child("John Sr.", "John Jr.", "Johnny");
        
        // Displaying information from all three levels of the inheritance
        child.showGrandparentInfo();  // Method from Grandparent class
        child.showParentInfo();       // Method from Parent class
        child.showChildInfo();        // Method from Child class
    }
}

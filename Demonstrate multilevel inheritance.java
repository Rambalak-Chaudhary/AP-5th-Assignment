class Grandparent {

    String grandparentName;
    
    public Grandparent(String grandparentName) {
        this.grandparentName = grandparentName;
    }
    

    public void showGrandparentInfo() {
        System.out.println("Grandparent Name: " + grandparentName);
    }
}


class Parent extends Grandparent {
  
    String parentName;
    
   
    public Parent(String grandparentName, String parentName) {
     
        super(grandparentName);
        this.parentName = parentName;
    }
    
   
    public void showParentInfo() {
        System.out.println("Parent Name: " + parentName);
    }
}

// Child class extends Parent (Multilevel inheritance)
class Child extends Parent {
    // Field of the Child class
    String childName;
    
  
    public Child(String grandparentName, String parentName, String childName) {
      
        super(grandparentName, parentName);
        this.childName = childName;
    }
    
   
    public void showChildInfo() {
        System.out.println("Child Name: " + childName);
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {

        Child child = new Child("John Sr.", "John Jr.", "Johnny");
        
     
        child.showGrandparentInfo();  // Method from Grandparent class
        child.showParentInfo();       // Method from Parent class
        child.showChildInfo();        // Method from Child class
    }
}

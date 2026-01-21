public class ToString_23 {
    public static void main(String[] args) {
        stringTesting newStr = new stringTesting("chandu", 23);
        System.out.println(newStr.toString());
    }

    
}


class stringTesting {
    String name;
    int age;

    public stringTesting(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
      
        return name + " " + age;
    }
}
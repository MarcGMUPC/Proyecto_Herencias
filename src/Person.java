public class Person {
    private static int lastId;

    private int id;
    private String name;

    public Person() {
    }

    public Person(int id) {
        this.id = id;
    }

    public Person(String name) {
        this.id = lastId++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}

/*public static void main(String[] args) {
    Person p1 = new Person(name "Marc");
    Person p2 = new Person(name "Andrea");
    Person p3 = new Person(name "Raquel");

    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);

}
 */
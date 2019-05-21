public class Person{
    public int age;
    public String name;

    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    public static void main(String args[]){
		Person kondo = new Person(24,"kondo");
		System.out.println(kondo.age);
		System.out.println(kondo.name);
    }
}

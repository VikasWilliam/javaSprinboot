class Human{
    private int age;
    private String name;// with private access specifier it will only be accsssible in the same class

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}



public class Encapsulation {
    public static void main(String[] args){
        Human obj=new Human();
        obj.setName("Vikas");
        obj.setAge(123);


        System.out.println(obj.getName() + ":" + obj.getAge());
    }

}

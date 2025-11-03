public class Person
{
String name;

    public Person(String name) {
        this.name = name;
    }

    public void tellStory(Person listener, String story) {
        System.out.println(this.name + " принялся рассказывать " + listener.name + ":");
        System.out.println("\"" + story + "\"");
    }
}
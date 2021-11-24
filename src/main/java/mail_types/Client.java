package mail_types;

import lombok.Getter;

@Getter
public class Client {
    private String name;
    private int age;
    private int id = 0;
    private Gender sex;


    public Client(String name, int age, Gender sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        id = IdGenerator.generateId();
    }
    // Generate id for the client.
    public static class IdGenerator {
        static int id;

        public static int generateId(){
            id += 1;
            return id;
        }
    }

}

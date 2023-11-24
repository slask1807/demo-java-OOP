package by.itacademy.shlesin;

public class Main {
    public static void main(String[] args) {
        User user1=new User();
        user1.setName("Ivan");
        User user2=new User();
        user2.setName("Lora");
        User user3=new User();
        user3.setName("Nadya");
        User[] users =new User[3];
        users[0] = user1;
        users[1] = user1;
        users[2] = user1;
        for (int i=0; i< users.length; i++)   {
            System.out.println(users[i].getName());
        }


    }


//        User[] users = new User[10];
//        for (int i = 0; i < users.length; i++) {
//            users[i] = new User();
//            users[i].setAge(i);
//            users[i].setName("" + (char) (Math.random() * 1000) + (char) (Math.random() * 1000) + (char) (Math.random() * 1000));
//            users[i].setPassword("" + (Math.random() * 1000));
//        }
//        for (int i = 0; i < users.length; i++) {
//            System.out.println("Name " + users[i].getName() + "\t Age " + users[i].getAge() + "\tPassword " + users[i].getPassword());
//        }


}
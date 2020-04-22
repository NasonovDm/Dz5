package dz5;

public class Person {
    String name;
    String profession;
    String email;
    String tel;
    int salary;
    int age;

    public Person(String name, String profession, String email, String tel, int salary, int age ){
        this.name = name;
        this.profession = profession;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public void Info(){
        if (age > 40){
            System.out.printf("%s\n %s\n %s\n %s\n %s\n %s\n\n", name, profession, email, tel, salary, age);
        }
    }

}

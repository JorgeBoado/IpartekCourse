package UF2404.POJO;

public class Person {

    private static final int MAX_AGE = 120;
    private static final int MIN_AGE = 0;

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if (age > MAX_AGE || age < MIN_AGE) {
            throw new Exception("La edad es incorrecta, debe estar comprendida entre " + MIN_AGE + " y " + MAX_AGE + ".");
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + name + '\'' +
                ", edad=" + age +
                '}';
    }
}

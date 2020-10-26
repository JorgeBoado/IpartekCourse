package UF2404.POJO;

public class Dog {
    private String breed;
    private String name;
    private int age;
    private boolean vaccinated;

    public Dog() {
    }

    public Dog(String raza, String nombre, int age, boolean vacunado) {
        this.breed = raza;
        this.name = nombre;
        this.age = age;
        this.vaccinated = vacunado;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
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

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    @Override
    public String toString() {
        return name +" ==> "+
                " Raza: " + breed +
                ", edad: " + age +" año(s)"+
                ", " + (vaccinated ?"si":"no") +" esta vacunado.";
    }
}

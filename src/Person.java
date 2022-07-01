import java.util.Objects;

public class Person {
    private String fName;
    private String lName;
    private String oName;

    public Person(String fName, String lName, String oName) {
        this.fName = fName;
        this.lName = lName;
        this.oName = oName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getoName() {
        return oName;
    }

    public void setoName(String oName) {
        this.oName = oName;
    }

    @Override
    public String toString() {
        return " Персона " + "Фамилия = " + fName + " Имя = " + lName + " Отчество= " + oName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(fName, person.fName) && Objects.equals(lName, person.lName) && Objects.equals(oName, person.oName);
    }

    @Override
    public int hashCode() {
        int num = fName.hashCode() + lName.hashCode() + oName.hashCode();
        return Objects.hash(fName, lName, oName);
    }
}

package interfaces;

public class Book implements Product{
    private String name;

    @Override
    public String getName() {
        System.out.println("Book Name: " + name);
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}

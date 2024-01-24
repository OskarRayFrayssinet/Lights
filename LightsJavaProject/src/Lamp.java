// Oskar Ray-Frayssinet, 2024-01-24

package LightsJavaProject.src;
public class Lamp {
    private String name;
    public Lamp(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "name='" + name + '\'' +
                '}';
    }
}

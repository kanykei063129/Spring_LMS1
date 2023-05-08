package peaksoft;

import lombok.*;

@Getter
@Setter
@ToString
public class Chuyskiy implements Interface{
    private String world;

    public Chuyskiy(String world) {
        this.world = world;
    }

    public void method1() {
        System.out.println("Peaksoft House");
    }
}

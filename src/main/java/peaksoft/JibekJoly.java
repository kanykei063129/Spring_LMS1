package peaksoft;

import lombok.*;

@Getter
@Setter
@ToString
public class JibekJoly implements Interface2{
    private String world2;

    public JibekJoly(String world2) {
        this.world2 = world2;
    }

    public void method2() {
        System.out.println("Alamudun bazapy");
    }
}

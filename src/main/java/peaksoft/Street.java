package peaksoft;

import lombok.*;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Street {
    private Interface interface1;
    private Interface2 interface2;
    private List<String> list;

    public Street(Interface interface1, Interface2 interface2) {
        this.interface1 = interface1;
        this.interface2 = interface2;
    }
}
package uz.pdp.springbootrabbitmq.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {

    private Long id;
    private String firstName;
    private String lastName;

}
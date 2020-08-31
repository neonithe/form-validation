package se.lexicon.mattias.formvalidation.model;

import com.sun.istack.internal.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person{

    @NotNull
    @Size(min=2,max=10,message="length should be in between 2-10")
    private String name;

    @NotEmpty(message = "Email field should not be empty")
    @Email(regexp="^(.+)@(.+)$", message = "Invalid email pattern")
    private String email;

    @Pattern(regexp = "[7-9][0-9]", message = "Invalid mobile number")
    @Size(max=10, message ="Digit should be 10")
    private String mobile;

}
package com.example.demo.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Customer { //Client layer
    //Cycle:
    //1.Client
    //2.REST layer
    //3.Service layer
    //4.DAO layer

    @Id
    private Long id;

    @NotBlank(message = "Name must not be empty") // spring-boot-starter-validation
    private String name;

    @NotBlank(message = "Password must not be empty")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    //allows us to only send and not read a password from the client
    private String password;

    @NotBlank(message = "Email must not be empty")
    @Email // works without regexp
//    @Email(regexp = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@+[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$") // email validation
    private String email;

 /*   public Customer() {
    }*/

   /* public Customer(Long id, String name, String password, String email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
    }*/

    @JsonProperty("customerId")
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @JsonIgnore //doesn't send it to the client
    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

  /*  @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }*/
}
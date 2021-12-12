package com.usa.ciclo4.reto2ciclo4.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users")
public class User {
    @Id
    private Integer id;

    @Field (name = "identificacion")
    private String identification;

    @Field (name = "name")
    private String name;

    @Field (name = "address")
    private String address;

    @Field (name = "celPhone")
    private String cellPhone;

    @Field (name = "email")
    private String email;

    @Field (name = "password")
    private String password;

    @Field (name = "zone")
    private String zone;

    @Field (name = "type")
    private String type;
}

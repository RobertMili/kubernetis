package com.example.kubernetis.model;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Schema(description = "All details about the step entity. ")
@Table(name = "Users")
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "The database generated user ID")
    private long id;

    @Column(unique = true, name = "username")
    @Schema(description = "user_name")
    private String username;


}

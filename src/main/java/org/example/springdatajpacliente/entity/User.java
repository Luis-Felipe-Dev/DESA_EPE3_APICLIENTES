package org.example.springdatajpacliente.entity;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "tbl_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;

    @CreatedDate
    @Column(name = "created_date")
    private LocalDateTime createDate = LocalDateTime.now();

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    @OneToMany(mappedBy = "user")
    private List<Cliente> clientes;

    @OneToMany(mappedBy = "user")
    private List<Direccion> direcciones;

    @OneToMany(mappedBy = "user")
    private List<Pais> paises;

    @OneToMany(mappedBy = "user")
    private List<Ciudad> ciudades;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
}

package com.umanizales.batallanaval.model.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "jugador", schema = "public", catalog = "batalla_naval")
public class JugadorEntity {
    private String apodo;
    private short edad;

    @Id
    @Column(name = "apodo")
    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    @Basic
    @Column(name = "edad")
    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JugadorEntity that = (JugadorEntity) o;
        return edad == that.edad && Objects.equals(apodo, that.apodo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apodo, edad);
    }
}

package com.umanizales.batallanaval.model.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "barco", schema = "public", catalog = "battle_ship")
public class BarcoEntity {
    private short casillas;
    private String estado;

    @Basic
    @Column(name = "casillas")
    public short getCasillas() {
        return casillas;
    }

    public void setCasillas(short casillas) {
        this.casillas = casillas;
    }

    @Id
    @Column(name = "estado")
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BarcoEntity that = (BarcoEntity) o;
        return casillas == that.casillas && Objects.equals(estado, that.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(casillas, estado);
    }
}

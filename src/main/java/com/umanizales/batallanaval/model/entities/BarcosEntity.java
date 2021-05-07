package com.umanizales.batallanaval.model.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "barcos", schema = "public", catalog = "batalla_naval")
public class BarcosEntity {
    private short idBarcos;
    private String tipoBarcos;

    @Id
    @Column(name = "id_barcos")
    public short getIdBarcos() {
        return idBarcos;
    }

    public void setIdBarcos(short idBarcos) {
        this.idBarcos = idBarcos;
    }

    @Basic
    @Column(name = "tipo_barcos")
    public String getTipoBarcos() {
        return tipoBarcos;
    }

    public void setTipoBarcos(String tipoBarcos) {
        this.tipoBarcos = tipoBarcos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BarcosEntity that = (BarcosEntity) o;
        return idBarcos == that.idBarcos && Objects.equals(tipoBarcos, that.tipoBarcos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBarcos, tipoBarcos);
    }
}

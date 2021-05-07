package com.umanizales.batallanaval.model.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tableros", schema = "public", catalog = "batalla_naval")
public class TablerosEntity {
    private short id;
    private Object tamanio;

    @Id
    @Column(name = "id")
    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    @Basic
    @Column(name = "tamanio")
    public Object getTamanio() {
        return tamanio;
    }

    public void setTamanio(Object tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TablerosEntity that = (TablerosEntity) o;
        return id == that.id && Objects.equals(tamanio, that.tamanio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tamanio);
    }
}

package com.umanizales.batallanaval.model.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "juego", schema = "public", catalog = "batalla_naval")
public class JuegoEntity {
    private short codigoPartida;
    private Date fecha;

    @Id
    @Column(name = "codigo_partida")
    public short getCodigoPartida() {
        return codigoPartida;
    }

    public void setCodigoPartida(short codigoPartida) {
        this.codigoPartida = codigoPartida;
    }

    @Basic
    @Column(name = "fecha")
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JuegoEntity that = (JuegoEntity) o;
        return codigoPartida == that.codigoPartida && Objects.equals(fecha, that.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoPartida, fecha);
    }
}

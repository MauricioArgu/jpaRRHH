/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Maury
 */
@Entity
@Table(name = "rh_usuario", catalog = "db_rrhh", schema = "")
@NamedQueries({
    @NamedQuery(name = "RhUsuario.findAll", query = "SELECT r FROM RhUsuario r")
    , @NamedQuery(name = "RhUsuario.findByUsId", query = "SELECT r FROM RhUsuario r WHERE r.usId = :usId")
    , @NamedQuery(name = "RhUsuario.findByUsUsuario", query = "SELECT r FROM RhUsuario r WHERE r.usUsuario = :usUsuario")
    , @NamedQuery(name = "RhUsuario.findByUsContra", query = "SELECT r FROM RhUsuario r WHERE r.usContra = :usContra")
    , @NamedQuery(name = "RhUsuario.findByUsCorreo", query = "SELECT r FROM RhUsuario r WHERE r.usCorreo = :usCorreo")})
public class RhUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "US_ID", nullable = false)
    private Integer usId;
    @Basic(optional = false)
    @Column(name = "US_USUARIO", nullable = false, length = 45)
    private String usUsuario;
    @Basic(optional = false)
    @Column(name = "US_CONTRA", nullable = false, length = 45)
    private String usContra;
    @Basic(optional = false)
    @Column(name = "US_CORREO", nullable = false, length = 150)
    private String usCorreo;
    @JoinColumn(name = "ROL_ID", referencedColumnName = "ROL_ID", nullable = false)
    @ManyToOne(optional = false)
    private RhRol rolId;

    public RhUsuario() {
    }

    public RhUsuario(Integer usId) {
        this.usId = usId;
    }

    public RhUsuario(Integer usId, String usUsuario, String usContra, String usCorreo) {
        this.usId = usId;
        this.usUsuario = usUsuario;
        this.usContra = usContra;
        this.usCorreo = usCorreo;
    }

    public Integer getUsId() {
        return usId;
    }

    public void setUsId(Integer usId) {
        this.usId = usId;
    }

    public String getUsUsuario() {
        return usUsuario;
    }

    public void setUsUsuario(String usUsuario) {
        this.usUsuario = usUsuario;
    }

    public String getUsContra() {
        return usContra;
    }

    public void setUsContra(String usContra) {
        this.usContra = usContra;
    }

    public String getUsCorreo() {
        return usCorreo;
    }

    public void setUsCorreo(String usCorreo) {
        this.usCorreo = usCorreo;
    }

    public RhRol getRolId() {
        return rolId;
    }

    public void setRolId(RhRol rolId) {
        this.rolId = rolId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usId != null ? usId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RhUsuario)) {
            return false;
        }
        RhUsuario other = (RhUsuario) object;
        if ((this.usId == null && other.usId != null) || (this.usId != null && !this.usId.equals(other.usId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "prueba.entity.RhUsuario[ usId=" + usId + " ]";
    }
    
}

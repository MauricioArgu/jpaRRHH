/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Maury
 */
@Entity
@Table(name = "rh_empleado", catalog = "db_rrhh", schema = "")
@NamedQueries({
    @NamedQuery(name = "RhEmpleado.findAll", query = "SELECT r FROM RhEmpleado r")
    , @NamedQuery(name = "RhEmpleado.findByEmpId", query = "SELECT r FROM RhEmpleado r WHERE r.empId = :empId")
    , @NamedQuery(name = "RhEmpleado.findByEmpCodigo", query = "SELECT r FROM RhEmpleado r WHERE r.empCodigo = :empCodigo")
    , @NamedQuery(name = "RhEmpleado.findByEmpNombres", query = "SELECT r FROM RhEmpleado r WHERE r.empNombres = :empNombres")
    , @NamedQuery(name = "RhEmpleado.findByEmpApellidos", query = "SELECT r FROM RhEmpleado r WHERE r.empApellidos = :empApellidos")
    , @NamedQuery(name = "RhEmpleado.findByEmpDui", query = "SELECT r FROM RhEmpleado r WHERE r.empDui = :empDui")
    , @NamedQuery(name = "RhEmpleado.findByEmpNit", query = "SELECT r FROM RhEmpleado r WHERE r.empNit = :empNit")
    , @NamedQuery(name = "RhEmpleado.findByEmpCorreo", query = "SELECT r FROM RhEmpleado r WHERE r.empCorreo = :empCorreo")
    , @NamedQuery(name = "RhEmpleado.findByEmpTelefono", query = "SELECT r FROM RhEmpleado r WHERE r.empTelefono = :empTelefono")
    , @NamedQuery(name = "RhEmpleado.findByEmpSueldo", query = "SELECT r FROM RhEmpleado r WHERE r.empSueldo = :empSueldo")
    , @NamedQuery(name = "RhEmpleado.findByEmpDireccion", query = "SELECT r FROM RhEmpleado r WHERE r.empDireccion = :empDireccion")
    , @NamedQuery(name = "RhEmpleado.findByEmpEstado", query = "SELECT r FROM RhEmpleado r WHERE r.empEstado = :empEstado")
    , @NamedQuery(name = "RhEmpleado.findByEmpJefId", query = "SELECT r FROM RhEmpleado r WHERE r.empJefId = :empJefId")})
public class RhEmpleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "EMP_ID", nullable = false)
    private Integer empId;
    @Basic(optional = false)
    @Column(name = "EMP_CODIGO", nullable = false, length = 50)
    private String empCodigo;
    @Basic(optional = false)
    @Column(name = "EMP_NOMBRES", nullable = false, length = 150)
    private String empNombres;
    @Basic(optional = false)
    @Column(name = "EMP_APELLIDOS", nullable = false, length = 150)
    private String empApellidos;
    @Basic(optional = false)
    @Column(name = "EMP_DUI", nullable = false, length = 45)
    private String empDui;
    @Basic(optional = false)
    @Column(name = "EMP_NIT", nullable = false, length = 45)
    private String empNit;
    @Basic(optional = false)
    @Column(name = "EMP_CORREO", nullable = false, length = 45)
    private String empCorreo;
    @Basic(optional = false)
    @Column(name = "EMP_TELEFONO", nullable = false, length = 9)
    private String empTelefono;
    @Basic(optional = false)
    @Column(name = "EMP_SUELDO", nullable = false)
    private double empSueldo;
    @Basic(optional = false)
    @Column(name = "EMP_DIRECCION", nullable = false, length = 200)
    private String empDireccion;
    @Basic(optional = false)
    @Column(name = "EMP_ESTADO", nullable = false)
    private int empEstado;
    @Basic(optional = false)
    @Column(name = "EMP_JEF_ID", nullable = false)
    private int empJefId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empId")
    private List<RhDetallePlanilla> rhDetallePlanillaList;
    @JoinColumn(name = "DEP_ID", referencedColumnName = "DEP_ID", nullable = false)
    @ManyToOne(optional = false)
    private RhDepartamento depId;

    public RhEmpleado() {
    }

    public RhEmpleado(Integer empId) {
        this.empId = empId;
    }

    public RhEmpleado(Integer empId, String empCodigo, String empNombres, String empApellidos, String empDui, String empNit, String empCorreo, String empTelefono, double empSueldo, String empDireccion, int empEstado, int empJefId) {
        this.empId = empId;
        this.empCodigo = empCodigo;
        this.empNombres = empNombres;
        this.empApellidos = empApellidos;
        this.empDui = empDui;
        this.empNit = empNit;
        this.empCorreo = empCorreo;
        this.empTelefono = empTelefono;
        this.empSueldo = empSueldo;
        this.empDireccion = empDireccion;
        this.empEstado = empEstado;
        this.empJefId = empJefId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(String empCodigo) {
        this.empCodigo = empCodigo;
    }

    public String getEmpNombres() {
        return empNombres;
    }

    public void setEmpNombres(String empNombres) {
        this.empNombres = empNombres;
    }

    public String getEmpApellidos() {
        return empApellidos;
    }

    public void setEmpApellidos(String empApellidos) {
        this.empApellidos = empApellidos;
    }

    public String getEmpDui() {
        return empDui;
    }

    public void setEmpDui(String empDui) {
        this.empDui = empDui;
    }

    public String getEmpNit() {
        return empNit;
    }

    public void setEmpNit(String empNit) {
        this.empNit = empNit;
    }

    public String getEmpCorreo() {
        return empCorreo;
    }

    public void setEmpCorreo(String empCorreo) {
        this.empCorreo = empCorreo;
    }

    public String getEmpTelefono() {
        return empTelefono;
    }

    public void setEmpTelefono(String empTelefono) {
        this.empTelefono = empTelefono;
    }

    public double getEmpSueldo() {
        return empSueldo;
    }

    public void setEmpSueldo(double empSueldo) {
        this.empSueldo = empSueldo;
    }

    public String getEmpDireccion() {
        return empDireccion;
    }

    public void setEmpDireccion(String empDireccion) {
        this.empDireccion = empDireccion;
    }

    public int getEmpEstado() {
        return empEstado;
    }

    public void setEmpEstado(int empEstado) {
        this.empEstado = empEstado;
    }

    public int getEmpJefId() {
        return empJefId;
    }

    public void setEmpJefId(int empJefId) {
        this.empJefId = empJefId;
    }

    public List<RhDetallePlanilla> getRhDetallePlanillaList() {
        return rhDetallePlanillaList;
    }

    public void setRhDetallePlanillaList(List<RhDetallePlanilla> rhDetallePlanillaList) {
        this.rhDetallePlanillaList = rhDetallePlanillaList;
    }

    public RhDepartamento getDepId() {
        return depId;
    }

    public void setDepId(RhDepartamento depId) {
        this.depId = depId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empId != null ? empId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RhEmpleado)) {
            return false;
        }
        RhEmpleado other = (RhEmpleado) object;
        if ((this.empId == null && other.empId != null) || (this.empId != null && !this.empId.equals(other.empId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "prueba.entity.RhEmpleado[ empId=" + empId + " ]";
    }
    
}

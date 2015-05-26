/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Fábio
 */
@Embeddable
public class PerfilPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "idPerfil")
    private int idPerfil;
    @Basic(optional = false)
    @Column(name = "Usuario_idUsuario")
    private int usuarioidUsuario;

    public PerfilPK() {
    }

    public PerfilPK(int idPerfil, int usuarioidUsuario) {
        this.idPerfil = idPerfil;
        this.usuarioidUsuario = usuarioidUsuario;
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public int getUsuarioidUsuario() {
        return usuarioidUsuario;
    }

    public void setUsuarioidUsuario(int usuarioidUsuario) {
        this.usuarioidUsuario = usuarioidUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idPerfil;
        hash += (int) usuarioidUsuario;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PerfilPK)) {
            return false;
        }
        PerfilPK other = (PerfilPK) object;
        if (this.idPerfil != other.idPerfil) {
            return false;
        }
        if (this.usuarioidUsuario != other.usuarioidUsuario) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.PerfilPK[ idPerfil=" + idPerfil + ", usuarioidUsuario=" + usuarioidUsuario + " ]";
    }
    
}

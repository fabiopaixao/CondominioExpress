/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Fábio
 */
@Entity
@Table(name = "ocorrencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ocorrencia.findAll", query = "SELECT o FROM Ocorrencia o"),
    @NamedQuery(name = "Ocorrencia.findByIdOcorrencia", query = "SELECT o FROM Ocorrencia o WHERE o.idOcorrencia = :idOcorrencia"),
    @NamedQuery(name = "Ocorrencia.findByDescricao", query = "SELECT o FROM Ocorrencia o WHERE o.descricao = :descricao"),
    @NamedQuery(name = "Ocorrencia.findByDataOcorrencia", query = "SELECT o FROM Ocorrencia o WHERE o.dataOcorrencia = :dataOcorrencia")})
public class Ocorrencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idOcorrencia")
    private Integer idOcorrencia;
    @Column(name = "Descricao")
    private String descricao;
    @Column(name = "DataOcorrencia")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataOcorrencia;
    @JoinColumn(name = "Apartamento_idApartamento", referencedColumnName = "idApartamento")
    @ManyToOne(optional = false)
    private Apartamento apartamentoidApartamento;
    @JoinColumn(name = "Bloco_idBloco", referencedColumnName = "idBloco")
    @ManyToOne(optional = false)
    private Bloco blocoidBloco;

    public Ocorrencia() {
    }

    public Ocorrencia(Integer idOcorrencia) {
        this.idOcorrencia = idOcorrencia;
    }

    public Integer getIdOcorrencia() {
        return idOcorrencia;
    }

    public void setIdOcorrencia(Integer idOcorrencia) {
        this.idOcorrencia = idOcorrencia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataOcorrencia() {
        return dataOcorrencia;
    }

    public void setDataOcorrencia(Date dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }

    public Apartamento getApartamentoidApartamento() {
        return apartamentoidApartamento;
    }

    public void setApartamentoidApartamento(Apartamento apartamentoidApartamento) {
        this.apartamentoidApartamento = apartamentoidApartamento;
    }

    public Bloco getBlocoidBloco() {
        return blocoidBloco;
    }

    public void setBlocoidBloco(Bloco blocoidBloco) {
        this.blocoidBloco = blocoidBloco;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOcorrencia != null ? idOcorrencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ocorrencia)) {
            return false;
        }
        Ocorrencia other = (Ocorrencia) object;
        if ((this.idOcorrencia == null && other.idOcorrencia != null) || (this.idOcorrencia != null && !this.idOcorrencia.equals(other.idOcorrencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Ocorrencia[ idOcorrencia=" + idOcorrencia + " ]";
    }
    
}

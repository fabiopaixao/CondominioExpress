/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Collection;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Fábio
 */
@Entity
@Table(name = "apartamento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Apartamento.findAll", query = "SELECT a FROM Apartamento a"),
    @NamedQuery(name = "Apartamento.findByIdApartamento", query = "SELECT a FROM Apartamento a WHERE a.idApartamento = :idApartamento"),
    @NamedQuery(name = "Apartamento.findByAndar", query = "SELECT a FROM Apartamento a WHERE a.andar = :andar"),
    @NamedQuery(name = "Apartamento.findByNumero", query = "SELECT a FROM Apartamento a WHERE a.numero = :numero")})
public class Apartamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idApartamento")
    private Integer idApartamento;
    @Column(name = "Andar")
    private String andar;
    @Basic(optional = false)
    @Column(name = "Numero")
    private int numero;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "apartamentoidApartamento")
    private Collection<Condomino> condominoCollection;
    @JoinColumn(name = "Bloco_idBloco", referencedColumnName = "idBloco")
    @ManyToOne(optional = false)
    private Bloco blocoidBloco;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "apartamentoidApartamento")
    private Collection<Ocorrencia> ocorrenciaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "apartamentoidApartamento")
    private Collection<Visitante> visitanteCollection;

    public Apartamento() {
    }

    public Apartamento(Integer idApartamento) {
        this.idApartamento = idApartamento;
    }

    public Apartamento(Integer idApartamento, int numero) {
        this.idApartamento = idApartamento;
        this.numero = numero;
    }

    public Integer getIdApartamento() {
        return idApartamento;
    }

    public void setIdApartamento(Integer idApartamento) {
        this.idApartamento = idApartamento;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @XmlTransient
    public Collection<Condomino> getCondominoCollection() {
        return condominoCollection;
    }

    public void setCondominoCollection(Collection<Condomino> condominoCollection) {
        this.condominoCollection = condominoCollection;
    }

    public Bloco getBlocoidBloco() {
        return blocoidBloco;
    }

    public void setBlocoidBloco(Bloco blocoidBloco) {
        this.blocoidBloco = blocoidBloco;
    }

    @XmlTransient
    public Collection<Ocorrencia> getOcorrenciaCollection() {
        return ocorrenciaCollection;
    }

    public void setOcorrenciaCollection(Collection<Ocorrencia> ocorrenciaCollection) {
        this.ocorrenciaCollection = ocorrenciaCollection;
    }

    @XmlTransient
    public Collection<Visitante> getVisitanteCollection() {
        return visitanteCollection;
    }

    public void setVisitanteCollection(Collection<Visitante> visitanteCollection) {
        this.visitanteCollection = visitanteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idApartamento != null ? idApartamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Apartamento)) {
            return false;
        }
        Apartamento other = (Apartamento) object;
        if ((this.idApartamento == null && other.idApartamento != null) || (this.idApartamento != null && !this.idApartamento.equals(other.idApartamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Apartamento[ idApartamento=" + idApartamento + " ]";
    }
    
}

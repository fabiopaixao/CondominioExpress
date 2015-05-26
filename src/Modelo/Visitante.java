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
@Table(name = "visitante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Visitante.findAll", query = "SELECT v FROM Visitante v"),
    @NamedQuery(name = "Visitante.findByIdVisitante", query = "SELECT v FROM Visitante v WHERE v.idVisitante = :idVisitante"),
    @NamedQuery(name = "Visitante.findByNome", query = "SELECT v FROM Visitante v WHERE v.nome = :nome"),
    @NamedQuery(name = "Visitante.findByRg", query = "SELECT v FROM Visitante v WHERE v.rg = :rg"),
    @NamedQuery(name = "Visitante.findByFlgPrestadorServico", query = "SELECT v FROM Visitante v WHERE v.flgPrestadorServico = :flgPrestadorServico"),
    @NamedQuery(name = "Visitante.findByAutorizacao", query = "SELECT v FROM Visitante v WHERE v.autorizacao = :autorizacao"),
    @NamedQuery(name = "Visitante.findByDataVisita", query = "SELECT v FROM Visitante v WHERE v.dataVisita = :dataVisita"),
    @NamedQuery(name = "Visitante.findByObservacao", query = "SELECT v FROM Visitante v WHERE v.observacao = :observacao")})
public class Visitante implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idVisitante")
    private Integer idVisitante;
    @Column(name = "Nome")
    private String nome;
    @Column(name = "RG")
    private String rg;
    @Column(name = "FlgPrestadorServico")
    private Character flgPrestadorServico;
    @Column(name = "Autorizacao")
    private Character autorizacao;
    @Column(name = "DataVisita")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataVisita;
    @Column(name = "Observacao")
    private String observacao;
    @JoinColumn(name = "Apartamento_idApartamento", referencedColumnName = "idApartamento")
    @ManyToOne(optional = false)
    private Apartamento apartamentoidApartamento;
    @JoinColumn(name = "PrestadorServico_idPrestadorServico", referencedColumnName = "idPrestadorServico")
    @ManyToOne(optional = false)
    private Prestadorservico prestadorServicoidPrestadorServico;

    public Visitante() {
    }

    public Visitante(Integer idVisitante) {
        this.idVisitante = idVisitante;
    }

    public Integer getIdVisitante() {
        return idVisitante;
    }

    public void setIdVisitante(Integer idVisitante) {
        this.idVisitante = idVisitante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Character getFlgPrestadorServico() {
        return flgPrestadorServico;
    }

    public void setFlgPrestadorServico(Character flgPrestadorServico) {
        this.flgPrestadorServico = flgPrestadorServico;
    }

    public Character getAutorizacao() {
        return autorizacao;
    }

    public void setAutorizacao(Character autorizacao) {
        this.autorizacao = autorizacao;
    }

    public Date getDataVisita() {
        return dataVisita;
    }

    public void setDataVisita(Date dataVisita) {
        this.dataVisita = dataVisita;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Apartamento getApartamentoidApartamento() {
        return apartamentoidApartamento;
    }

    public void setApartamentoidApartamento(Apartamento apartamentoidApartamento) {
        this.apartamentoidApartamento = apartamentoidApartamento;
    }

    public Prestadorservico getPrestadorServicoidPrestadorServico() {
        return prestadorServicoidPrestadorServico;
    }

    public void setPrestadorServicoidPrestadorServico(Prestadorservico prestadorServicoidPrestadorServico) {
        this.prestadorServicoidPrestadorServico = prestadorServicoidPrestadorServico;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVisitante != null ? idVisitante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Visitante)) {
            return false;
        }
        Visitante other = (Visitante) object;
        if ((this.idVisitante == null && other.idVisitante != null) || (this.idVisitante != null && !this.idVisitante.equals(other.idVisitante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Visitante[ idVisitante=" + idVisitante + " ]";
    }
    
}

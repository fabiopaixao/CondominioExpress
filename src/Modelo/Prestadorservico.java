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
@Table(name = "prestadorservico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prestadorservico.findAll", query = "SELECT p FROM Prestadorservico p"),
    @NamedQuery(name = "Prestadorservico.findByIdPrestadorServico", query = "SELECT p FROM Prestadorservico p WHERE p.idPrestadorServico = :idPrestadorServico"),
    @NamedQuery(name = "Prestadorservico.findByNome", query = "SELECT p FROM Prestadorservico p WHERE p.nome = :nome"),
    @NamedQuery(name = "Prestadorservico.findByCpfCnpj", query = "SELECT p FROM Prestadorservico p WHERE p.cpfCnpj = :cpfCnpj"),
    @NamedQuery(name = "Prestadorservico.findByFlgTipoPessoa", query = "SELECT p FROM Prestadorservico p WHERE p.flgTipoPessoa = :flgTipoPessoa"),
    @NamedQuery(name = "Prestadorservico.findByTelefone", query = "SELECT p FROM Prestadorservico p WHERE p.telefone = :telefone"),
    @NamedQuery(name = "Prestadorservico.findByEmail", query = "SELECT p FROM Prestadorservico p WHERE p.email = :email"),
    @NamedQuery(name = "Prestadorservico.findByNomeContato", query = "SELECT p FROM Prestadorservico p WHERE p.nomeContato = :nomeContato"),
    @NamedQuery(name = "Prestadorservico.findByFuncao", query = "SELECT p FROM Prestadorservico p WHERE p.funcao = :funcao"),
    @NamedQuery(name = "Prestadorservico.findByPrestadorServicocol", query = "SELECT p FROM Prestadorservico p WHERE p.prestadorServicocol = :prestadorServicocol")})
public class Prestadorservico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPrestadorServico")
    private Integer idPrestadorServico;
    @Column(name = "Nome")
    private String nome;
    @Column(name = "CPF_CNPJ")
    private String cpfCnpj;
    @Column(name = "FlgTipoPessoa")
    private Character flgTipoPessoa;
    @Column(name = "Telefone")
    private String telefone;
    @Column(name = "Email")
    private String email;
    @Column(name = "NomeContato")
    private String nomeContato;
    @Column(name = "Funcao")
    private String funcao;
    @Column(name = "PrestadorServicocol")
    private String prestadorServicocol;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prestadorServicoidPrestadorServico")
    private Collection<Visitante> visitanteCollection;
    @JoinColumn(name = "Condominio_idCondominio", referencedColumnName = "idCondominio")
    @ManyToOne(optional = false)
    private Condominio condominioidCondominio;

    public Prestadorservico() {
    }

    public Prestadorservico(Integer idPrestadorServico) {
        this.idPrestadorServico = idPrestadorServico;
    }

    public Integer getIdPrestadorServico() {
        return idPrestadorServico;
    }

    public void setIdPrestadorServico(Integer idPrestadorServico) {
        this.idPrestadorServico = idPrestadorServico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public Character getFlgTipoPessoa() {
        return flgTipoPessoa;
    }

    public void setFlgTipoPessoa(Character flgTipoPessoa) {
        this.flgTipoPessoa = flgTipoPessoa;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getPrestadorServicocol() {
        return prestadorServicocol;
    }

    public void setPrestadorServicocol(String prestadorServicocol) {
        this.prestadorServicocol = prestadorServicocol;
    }

    @XmlTransient
    public Collection<Visitante> getVisitanteCollection() {
        return visitanteCollection;
    }

    public void setVisitanteCollection(Collection<Visitante> visitanteCollection) {
        this.visitanteCollection = visitanteCollection;
    }

    public Condominio getCondominioidCondominio() {
        return condominioidCondominio;
    }

    public void setCondominioidCondominio(Condominio condominioidCondominio) {
        this.condominioidCondominio = condominioidCondominio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPrestadorServico != null ? idPrestadorServico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prestadorservico)) {
            return false;
        }
        Prestadorservico other = (Prestadorservico) object;
        if ((this.idPrestadorServico == null && other.idPrestadorServico != null) || (this.idPrestadorServico != null && !this.idPrestadorServico.equals(other.idPrestadorServico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Prestadorservico[ idPrestadorServico=" + idPrestadorServico + " ]";
    }
    
}

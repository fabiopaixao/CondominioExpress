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
@Table(name = "condominio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Condominio.findAll", query = "SELECT c FROM Condominio c"),
    @NamedQuery(name = "Condominio.findByIdCondominio", query = "SELECT c FROM Condominio c WHERE c.idCondominio = :idCondominio"),
    @NamedQuery(name = "Condominio.findByNome", query = "SELECT c FROM Condominio c WHERE c.nome = :nome"),
    @NamedQuery(name = "Condominio.findByCnpj", query = "SELECT c FROM Condominio c WHERE c.cnpj = :cnpj"),
    @NamedQuery(name = "Condominio.findByQtdUnidade", query = "SELECT c FROM Condominio c WHERE c.qtdUnidade = :qtdUnidade"),
    @NamedQuery(name = "Condominio.findByTelefone", query = "SELECT c FROM Condominio c WHERE c.telefone = :telefone"),
    @NamedQuery(name = "Condominio.findByEmail", query = "SELECT c FROM Condominio c WHERE c.email = :email"),
    @NamedQuery(name = "Condominio.findByQtdBlocos", query = "SELECT c FROM Condominio c WHERE c.qtdBlocos = :qtdBlocos")})
public class Condominio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCondominio")
    private Integer idCondominio;
    @Basic(optional = false)
    @Column(name = "Nome")
    private String nome;
    @Column(name = "CNPJ")
    private String cnpj;
    @Column(name = "QtdUnidade")
    private Integer qtdUnidade;
    @Column(name = "Telefone")
    private String telefone;
    @Column(name = "Email")
    private String email;
    @Column(name = "QtdBlocos")
    private Integer qtdBlocos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "condominioidCondominio")
    private Collection<Bloco> blocoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "condominioidCondominio")
    private Collection<Prestadorservico> prestadorservicoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "condominioidCondominio")
    private Collection<Usuario> usuarioCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "condominioidCondominio")
    private Collection<Funcionario> funcionarioCollection;

    public Condominio() {
    }

    public Condominio(Integer idCondominio) {
        this.idCondominio = idCondominio;
    }

    public Condominio(Integer idCondominio, String nome) {
        this.idCondominio = idCondominio;
        this.nome = nome;
    }

    public Integer getIdCondominio() {
        return idCondominio;
    }

    public void setIdCondominio(Integer idCondominio) {
        this.idCondominio = idCondominio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Integer getQtdUnidade() {
        return qtdUnidade;
    }

    public void setQtdUnidade(Integer qtdUnidade) {
        this.qtdUnidade = qtdUnidade;
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

    public Integer getQtdBlocos() {
        return qtdBlocos;
    }

    public void setQtdBlocos(Integer qtdBlocos) {
        this.qtdBlocos = qtdBlocos;
    }

    @XmlTransient
    public Collection<Bloco> getBlocoCollection() {
        return blocoCollection;
    }

    public void setBlocoCollection(Collection<Bloco> blocoCollection) {
        this.blocoCollection = blocoCollection;
    }

    @XmlTransient
    public Collection<Prestadorservico> getPrestadorservicoCollection() {
        return prestadorservicoCollection;
    }

    public void setPrestadorservicoCollection(Collection<Prestadorservico> prestadorservicoCollection) {
        this.prestadorservicoCollection = prestadorservicoCollection;
    }

    @XmlTransient
    public Collection<Usuario> getUsuarioCollection() {
        return usuarioCollection;
    }

    public void setUsuarioCollection(Collection<Usuario> usuarioCollection) {
        this.usuarioCollection = usuarioCollection;
    }

    @XmlTransient
    public Collection<Funcionario> getFuncionarioCollection() {
        return funcionarioCollection;
    }

    public void setFuncionarioCollection(Collection<Funcionario> funcionarioCollection) {
        this.funcionarioCollection = funcionarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCondominio != null ? idCondominio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Condominio)) {
            return false;
        }
        Condominio other = (Condominio) object;
        if ((this.idCondominio == null && other.idCondominio != null) || (this.idCondominio != null && !this.idCondominio.equals(other.idCondominio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Condominio[ idCondominio=" + idCondominio + " ]";
    }
    
}

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
@Table(name = "condomino")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Condomino.findAll", query = "SELECT c FROM Condomino c"),
    @NamedQuery(name = "Condomino.findByIdCondomino", query = "SELECT c FROM Condomino c WHERE c.idCondomino = :idCondomino"),
    @NamedQuery(name = "Condomino.findByNome", query = "SELECT c FROM Condomino c WHERE c.nome = :nome"),
    @NamedQuery(name = "Condomino.findByRg", query = "SELECT c FROM Condomino c WHERE c.rg = :rg"),
    @NamedQuery(name = "Condomino.findByCpf", query = "SELECT c FROM Condomino c WHERE c.cpf = :cpf"),
    @NamedQuery(name = "Condomino.findByTelefone", query = "SELECT c FROM Condomino c WHERE c.telefone = :telefone"),
    @NamedQuery(name = "Condomino.findByCelular", query = "SELECT c FROM Condomino c WHERE c.celular = :celular"),
    @NamedQuery(name = "Condomino.findByEmail", query = "SELECT c FROM Condomino c WHERE c.email = :email"),
    @NamedQuery(name = "Condomino.findByEndereco", query = "SELECT c FROM Condomino c WHERE c.endereco = :endereco"),
    @NamedQuery(name = "Condomino.findByFlgEnderecoLocal", query = "SELECT c FROM Condomino c WHERE c.flgEnderecoLocal = :flgEnderecoLocal"),
    @NamedQuery(name = "Condomino.findByObservacoes", query = "SELECT c FROM Condomino c WHERE c.observacoes = :observacoes"),
    @NamedQuery(name = "Condomino.findByFlgExcluido", query = "SELECT c FROM Condomino c WHERE c.flgExcluido = :flgExcluido")})
public class Condomino implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCondomino")
    private Integer idCondomino;
    @Basic(optional = false)
    @Column(name = "Nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "RG")
    private String rg;
    @Basic(optional = false)
    @Column(name = "CPF")
    private String cpf;
    @Column(name = "Telefone")
    private String telefone;
    @Column(name = "Celular")
    private String celular;
    @Column(name = "Email")
    private String email;
    @Column(name = "Endereco")
    private String endereco;
    @Column(name = "FlgEnderecoLocal")
    private Character flgEnderecoLocal;
    @Column(name = "Observacoes")
    private String observacoes;
    @Column(name = "FlgExcluido")
    private Character flgExcluido;
    @JoinColumn(name = "Apartamento_idApartamento", referencedColumnName = "idApartamento")
    @ManyToOne(optional = false)
    private Apartamento apartamentoidApartamento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "condominoidCondomino")
    private Collection<Veiculo> veiculoCollection;

    public Condomino() {
    }

    public Condomino(Integer idCondomino) {
        this.idCondomino = idCondomino;
    }

    public Condomino(Integer idCondomino, String nome, String rg, String cpf) {
        this.idCondomino = idCondomino;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
    }

    public Integer getIdCondomino() {
        return idCondomino;
    }

    public void setIdCondomino(Integer idCondomino) {
        this.idCondomino = idCondomino;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Character getFlgEnderecoLocal() {
        return flgEnderecoLocal;
    }

    public void setFlgEnderecoLocal(Character flgEnderecoLocal) {
        this.flgEnderecoLocal = flgEnderecoLocal;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Character getFlgExcluido() {
        return flgExcluido;
    }

    public void setFlgExcluido(Character flgExcluido) {
        this.flgExcluido = flgExcluido;
    }

    public Apartamento getApartamentoidApartamento() {
        return apartamentoidApartamento;
    }

    public void setApartamentoidApartamento(Apartamento apartamentoidApartamento) {
        this.apartamentoidApartamento = apartamentoidApartamento;
    }

    @XmlTransient
    public Collection<Veiculo> getVeiculoCollection() {
        return veiculoCollection;
    }

    public void setVeiculoCollection(Collection<Veiculo> veiculoCollection) {
        this.veiculoCollection = veiculoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCondomino != null ? idCondomino.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Condomino)) {
            return false;
        }
        Condomino other = (Condomino) object;
        if ((this.idCondomino == null && other.idCondomino != null) || (this.idCondomino != null && !this.idCondomino.equals(other.idCondomino))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Condomino[ idCondomino=" + idCondomino + " ]";
    }
    
}

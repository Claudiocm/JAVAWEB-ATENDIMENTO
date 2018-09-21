package entidade;

import java.io.Serializable;
import java.util.List;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author claudio
 */
@Entity
@Table(name = "unidade_saude")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UnidadeSaude.findAll", query = "SELECT u FROM UnidadeSaude u"),
    @NamedQuery(name = "UnidadeSaude.findByIdUnidade", query = "SELECT u FROM UnidadeSaude u WHERE u.idUnidade = :idUnidade"),
    @NamedQuery(name = "UnidadeSaude.findByNome", query = "SELECT u FROM UnidadeSaude u WHERE u.nome = :nome")})
public class UnidadeSaude implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_unidade")
    private Integer idUnidade;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nome")
    private String nome;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUnidade")
    private List<FichaAtendimento> fichaAtendimentoList;

    public UnidadeSaude() {
    }

    public UnidadeSaude(Integer idUnidade) {
        this.idUnidade = idUnidade;
    }

    public UnidadeSaude(Integer idUnidade, String nome) {
        this.idUnidade = idUnidade;
        this.nome = nome;
    }

    public Integer getIdUnidade() {
        return idUnidade;
    }

    public void setIdUnidade(Integer idUnidade) {
        this.idUnidade = idUnidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @XmlTransient
    public List<FichaAtendimento> getFichaAtendimentoList() {
        return fichaAtendimentoList;
    }

    public void setFichaAtendimentoList(List<FichaAtendimento> fichaAtendimentoList) {
        this.fichaAtendimentoList = fichaAtendimentoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUnidade != null ? idUnidade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnidadeSaude)) {
            return false;
        }
        UnidadeSaude other = (UnidadeSaude) object;
        if ((this.idUnidade == null && other.idUnidade != null) || (this.idUnidade != null && !this.idUnidade.equals(other.idUnidade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nome + " ";
    }
    
}

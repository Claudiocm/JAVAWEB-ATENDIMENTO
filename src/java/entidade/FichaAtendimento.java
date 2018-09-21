package entidade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author claudio
 */
@Entity
@Table(name = "ficha_atendimento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FichaAtendimento.findAll", query = "SELECT f FROM FichaAtendimento f"),
    @NamedQuery(name = "FichaAtendimento.findByIdFicha", query = "SELECT f FROM FichaAtendimento f WHERE f.idFicha = :idFicha"),
    @NamedQuery(name = "FichaAtendimento.findByDataAtendimento", query = "SELECT f FROM FichaAtendimento f WHERE f.dataAtendimento = :dataAtendimento")})
public class FichaAtendimento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ficha")
    private Integer idFicha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_atendimento")
    @Temporal(TemporalType.DATE)
    private Date dataAtendimento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFicha")
    private List<ItensFicha> itensFichaList;
    @JoinColumn(name = "id_unidade", referencedColumnName = "id_unidade")
    @ManyToOne(optional = false)
    private UnidadeSaude idUnidade;
    @OneToMany(mappedBy = "fichaAtendimentoIdFicha")
    private List<Medicos> medicosList;

    public FichaAtendimento() {
    }

    public FichaAtendimento(Integer idFicha) {
        this.idFicha = idFicha;
    }

    public FichaAtendimento(Integer idFicha, Date dataAtendimento) {
        this.idFicha = idFicha;
        this.dataAtendimento = dataAtendimento;
    }

    public Integer getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(Integer idFicha) {
        this.idFicha = idFicha;
    }

    public Date getDataAtendimento() {
        return dataAtendimento = new Date();
    }

    public void setDataAtendimento(Date dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    @XmlTransient
    public List<ItensFicha> getItensFichaList() {
        return itensFichaList;
    }

    public void setItensFichaList(List<ItensFicha> itensFichaList) {
        this.itensFichaList = itensFichaList;
    }

    public UnidadeSaude getIdUnidade() {
        return idUnidade;
    }

    public void setIdUnidade(UnidadeSaude idUnidade) {
        this.idUnidade = idUnidade;
    }

    @XmlTransient
    public List<Medicos> getMedicosList() {
        return medicosList;
    }

    public void setMedicosList(List<Medicos> medicosList) {
        this.medicosList = medicosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFicha != null ? idFicha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FichaAtendimento)) {
            return false;
        }
        FichaAtendimento other = (FichaAtendimento) object;
        if ((this.idFicha == null && other.idFicha != null) || (this.idFicha != null && !this.idFicha.equals(other.idFicha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return idFicha + " ";
    }
    
}

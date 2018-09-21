package entidade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;

/**
 *
 * @author claudio
 */
@Entity
@Table(name = "itens_ficha")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItensFicha.findAll", query = "SELECT i FROM ItensFicha i"),
    @NamedQuery(name = "ItensFicha.findByIdItens", query = "SELECT i FROM ItensFicha i WHERE i.idItens = :idItens"),
    @NamedQuery(name = "ItensFicha.findByHora", query = "SELECT i FROM ItensFicha i WHERE i.hora = :hora")})
public class ItensFicha implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_itens")
    private Integer idItens;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "conclusao")
    private String conclusao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hora")
    @Temporal(TemporalType.TIME)
    private Date hora;
    @JoinColumn(name = "id_ficha", referencedColumnName = "id_ficha")
    @ManyToOne(optional = false)
    private FichaAtendimento idFicha;
    @JoinColumn(name = "id_paciente", referencedColumnName = "id_paciente")
    @ManyToOne(optional = false)
    private Pacientes idPaciente;

    public ItensFicha() {
    }

    public ItensFicha(Integer idItens) {
        this.idItens = idItens;
    }

    public ItensFicha(Integer idItens, String descricao, String conclusao, Date hora) {
        this.idItens = idItens;
        this.descricao = descricao;
        this.conclusao = conclusao;
        this.hora = hora;
    }

    public Integer getIdItens() {
        return idItens;
    }

    public void setIdItens(Integer idItens) {
        this.idItens = idItens;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getConclusao() {
        return conclusao;
    }

    public void setConclusao(String conclusao) {
        this.conclusao = conclusao;
    }

    public Date getHora() {
        return hora = new Date();
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public FichaAtendimento getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(FichaAtendimento idFicha) {
        this.idFicha = idFicha;
    }

    public Pacientes getIdPaciente() {
       
        return idPaciente;
    }

    public void setIdPaciente(Pacientes idPaciente) {
        this.idPaciente = idPaciente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idItens != null ? idItens.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItensFicha)) {
            return false;
        }
        ItensFicha other = (ItensFicha) object;
        if ((this.idItens == null && other.idItens != null) || (this.idItens != null && !this.idItens.equals(other.idItens))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return descricao + " ";
    }
    
}


package entidade;

import java.io.Serializable;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author claudio
 */
@Entity
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByUsuId", query = "SELECT u FROM Usuario u WHERE u.usuId = :usuId"),
    @NamedQuery(name = "Usuario.findByUsuNome", query = "SELECT u FROM Usuario u WHERE u.usuNome = :usuNome"),
    @NamedQuery(name = "Usuario.findByUsuEndereco", query = "SELECT u FROM Usuario u WHERE u.usuEndereco = :usuEndereco"),
    @NamedQuery(name = "Usuario.findByUsuTelefone", query = "SELECT u FROM Usuario u WHERE u.usuTelefone = :usuTelefone")})
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "usu_id")
    private Integer usuId;
    @Size(max = 100)
    @Column(name = "usu_nome")
    private String usuNome;
    @Size(max = 120)
    @Column(name = "usu_endereco")
    private String usuEndereco;
    @Column(name = "usu_telefone")
    private Integer usuTelefone;
    @JoinColumn(name = "usu_tipo", referencedColumnName = "tipo_id")
    @ManyToOne
    private Tipousuario usuTipo;

    public Usuario() {
    }

    public Usuario(Integer usuId) {
        this.usuId = usuId;
    }

    public Integer getUsuId() {
        return usuId;
    }

    public void setUsuId(Integer usuId) {
        this.usuId = usuId;
    }

    public String getUsuNome() {
        return usuNome;
    }

    public void setUsuNome(String usuNome) {
        this.usuNome = usuNome;
    }

    public String getUsuEndereco() {
        return usuEndereco;
    }

    public void setUsuEndereco(String usuEndereco) {
        this.usuEndereco = usuEndereco;
    }

    public Integer getUsuTelefone() {
        return usuTelefone;
    }

    public void setUsuTelefone(Integer usuTelefone) {
        this.usuTelefone = usuTelefone;
    }

    public Tipousuario getUsuTipo() {
        return usuTipo;
    }

    public void setUsuTipo(Tipousuario usuTipo) {
        this.usuTipo = usuTipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuId != null ? usuId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.usuId == null && other.usuId != null) || (this.usuId != null && !this.usuId.equals(other.usuId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return usuNome + " ";
    }
    
}

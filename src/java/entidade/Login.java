package entidade;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "login")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Login.findAll", query = "SELECT l FROM Login l"),
    @NamedQuery(name = "Login.findByIdLogin", query = "SELECT l FROM Login l WHERE l.idLogin = :idLogin"),
    @NamedQuery(name = "Login.findByLgUsuario", query = "SELECT l FROM Login l WHERE l.lgUsuario = :lgUsuario"),
    @NamedQuery(name = "Login.findByLgSenha", query = "SELECT l FROM Login l WHERE l.lgSenha = :lgSenha"),
    @NamedQuery(name = "Login.findByLgTipo", query = "SELECT l FROM Login l WHERE l.lgTipo = :lgTipo")})
public class Login implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_login")
    private Integer idLogin;
    @Size(max = 100)
    @Column(name = "lg_usuario")
    private String lgUsuario;
    @Size(max = 100)
    @Column(name = "lg_senha")
    private String lgSenha;
    @Size(max = 50)
    @Column(name = "lg_tipo")
    private String lgTipo;

    public Login() {
    }

    public Login(Integer idLogin) {
        this.idLogin = idLogin;
    }

    public Integer getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(Integer idLogin) {
        this.idLogin = idLogin;
    }

    public String getLgUsuario() {
        return lgUsuario;
    }

    public void setLgUsuario(String lgUsuario) {
        this.lgUsuario = lgUsuario;
    }

    public String getLgSenha() {
        return lgSenha;
    }

    public void setLgSenha(String lgSenha) {
        this.lgSenha = lgSenha;
    }

    public String getLgTipo() {
        return lgTipo;
    }

    public void setLgTipo(String lgTipo) {
        this.lgTipo = lgTipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLogin != null ? idLogin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Login)) {
            return false;
        }
        Login other = (Login) object;
        if ((this.idLogin == null && other.idLogin != null) || (this.idLogin != null && !this.idLogin.equals(other.idLogin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return lgUsuario + " ";
    }
    
}

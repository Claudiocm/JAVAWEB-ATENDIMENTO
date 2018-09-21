/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author claudio
 */
@Entity
@Table(name = "medicos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Medicos.findAll", query = "SELECT m FROM Medicos m"),
    @NamedQuery(name = "Medicos.findByIdMedico", query = "SELECT m FROM Medicos m WHERE m.idMedico = :idMedico"),
    @NamedQuery(name = "Medicos.findByNome", query = "SELECT m FROM Medicos m WHERE m.nome = :nome"),
    @NamedQuery(name = "Medicos.findByCrm", query = "SELECT m FROM Medicos m WHERE m.crm = :crm")})
public class Medicos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_medico")
    private Integer idMedico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @NotNull
    @Column(name = "crm")
    private int crm;
    @JoinColumn(name = "ficha_atendimento_id_ficha", referencedColumnName = "id_ficha")
    @ManyToOne
    private FichaAtendimento fichaAtendimentoIdFicha;

    public Medicos() {
    }

    public Medicos(Integer idMedico) {
        this.idMedico = idMedico;
    }

    public Medicos(Integer idMedico, String nome, int crm) {
        this.idMedico = idMedico;
        this.nome = nome;
        this.crm = crm;
    }

    public Integer getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public FichaAtendimento getFichaAtendimentoIdFicha() {
        return fichaAtendimentoIdFicha;
    }

    public void setFichaAtendimentoIdFicha(FichaAtendimento fichaAtendimentoIdFicha) {
        this.fichaAtendimentoIdFicha = fichaAtendimentoIdFicha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMedico != null ? idMedico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medicos)) {
            return false;
        }
        Medicos other = (Medicos) object;
        if ((this.idMedico == null && other.idMedico != null) || (this.idMedico != null && !this.idMedico.equals(other.idMedico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nome + " ";
    }
    
}

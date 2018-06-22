/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visualizador_imagens_beans;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author NewUser
 */
@Entity
@Table(name = "USUARIO_IMAGENS", catalog = "", schema = "JM")
@NamedQueries({
    @NamedQuery(name = "UsuarioImagens.findAll", query = "SELECT u FROM UsuarioImagens u")
    , @NamedQuery(name = "UsuarioImagens.findById", query = "SELECT u FROM UsuarioImagens u WHERE u.id = :id")
    , @NamedQuery(name = "UsuarioImagens.findByNome", query = "SELECT u FROM UsuarioImagens u WHERE u.nome = :nome")
    , @NamedQuery(name = "UsuarioImagens.findByIdUsuarioSistema", query = "SELECT u FROM UsuarioImagens u WHERE u.idUsuarioSistema = :idUsuarioSistema")})
public class UsuarioImagens implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Column(name = "NOME", length = 500)
    private String nome;
    @Lob
    @Column(name = "IMAGEM")
    private byte[] imagem;
    @Basic(optional = false)
    @Column(name = "ID_USUARIO_SISTEMA", nullable = false)
    private int idUsuarioSistema;

    public UsuarioImagens() {
    }

    public UsuarioImagens(Integer id) {
        this.id = id;
    }

    public UsuarioImagens(Integer id, int idUsuarioSistema) {
        this.id = id;
        this.idUsuarioSistema = idUsuarioSistema;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        byte[] oldImagem = this.imagem;
        this.imagem = imagem;
        changeSupport.firePropertyChange("imagem", oldImagem, imagem);
    }

    public int getIdUsuarioSistema() {
        return idUsuarioSistema;
    }

    public void setIdUsuarioSistema(int idUsuarioSistema) {
        int oldIdUsuarioSistema = this.idUsuarioSistema;
        this.idUsuarioSistema = idUsuarioSistema;
        changeSupport.firePropertyChange("idUsuarioSistema", oldIdUsuarioSistema, idUsuarioSistema);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioImagens)) {
            return false;
        }
        UsuarioImagens other = (UsuarioImagens) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "visualizador_imagens_beans.UsuarioImagens[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

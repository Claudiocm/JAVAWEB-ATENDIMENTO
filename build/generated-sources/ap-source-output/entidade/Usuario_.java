package entidade;

import entidade.Tipousuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-08-31T00:48:53")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> usuEndereco;
    public static volatile SingularAttribute<Usuario, Integer> usuId;
    public static volatile SingularAttribute<Usuario, Tipousuario> usuTipo;
    public static volatile SingularAttribute<Usuario, String> usuNome;
    public static volatile SingularAttribute<Usuario, Integer> usuTelefone;

}
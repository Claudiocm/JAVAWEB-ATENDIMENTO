package entidade;

import entidade.FichaAtendimento;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-08-31T00:48:53")
@StaticMetamodel(UnidadeSaude.class)
public class UnidadeSaude_ { 

    public static volatile SingularAttribute<UnidadeSaude, Integer> idUnidade;
    public static volatile SingularAttribute<UnidadeSaude, String> nome;
    public static volatile ListAttribute<UnidadeSaude, FichaAtendimento> fichaAtendimentoList;

}
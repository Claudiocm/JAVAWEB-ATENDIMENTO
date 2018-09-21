package entidade;

import entidade.ItensFicha;
import entidade.Medicos;
import entidade.UnidadeSaude;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-08-31T00:48:53")
@StaticMetamodel(FichaAtendimento.class)
public class FichaAtendimento_ { 

    public static volatile SingularAttribute<FichaAtendimento, Integer> idFicha;
    public static volatile SingularAttribute<FichaAtendimento, Date> dataAtendimento;
    public static volatile ListAttribute<FichaAtendimento, Medicos> medicosList;
    public static volatile ListAttribute<FichaAtendimento, ItensFicha> itensFichaList;
    public static volatile SingularAttribute<FichaAtendimento, UnidadeSaude> idUnidade;

}
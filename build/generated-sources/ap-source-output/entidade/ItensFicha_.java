package entidade;

import entidade.FichaAtendimento;
import entidade.Pacientes;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-08-31T00:48:53")
@StaticMetamodel(ItensFicha.class)
public class ItensFicha_ { 

    public static volatile SingularAttribute<ItensFicha, FichaAtendimento> idFicha;
    public static volatile SingularAttribute<ItensFicha, Pacientes> idPaciente;
    public static volatile SingularAttribute<ItensFicha, Date> hora;
    public static volatile SingularAttribute<ItensFicha, String> conclusao;
    public static volatile SingularAttribute<ItensFicha, Integer> idItens;
    public static volatile SingularAttribute<ItensFicha, String> descricao;

}
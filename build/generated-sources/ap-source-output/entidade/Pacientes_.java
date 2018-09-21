package entidade;

import entidade.ItensFicha;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-08-31T00:48:53")
@StaticMetamodel(Pacientes.class)
public class Pacientes_ { 

    public static volatile SingularAttribute<Pacientes, Integer> idPaciente;
    public static volatile ListAttribute<Pacientes, ItensFicha> itensFichaList;
    public static volatile SingularAttribute<Pacientes, String> nome;
    public static volatile SingularAttribute<Pacientes, Date> dataNascimento;

}
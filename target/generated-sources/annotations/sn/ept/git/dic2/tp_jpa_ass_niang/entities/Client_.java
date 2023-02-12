package sn.ept.git.dic2.tp_jpa_ass_niang.entities;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sn.ept.git.dic2.tp_jpa_ass_niang.entities.Commande;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-02-11T18:16:59", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Client.class)
public class Client_ { 

    public static volatile SingularAttribute<Client, String> ville;
    public static volatile SingularAttribute<Client, String> codeZip;
    public static volatile SingularAttribute<Client, String> adresse;
    public static volatile SingularAttribute<Client, String> telephone;
    public static volatile SingularAttribute<Client, Integer> id;
    public static volatile SingularAttribute<Client, String> prenom;
    public static volatile SingularAttribute<Client, String> nom;
    public static volatile SingularAttribute<Client, String> etat;
    public static volatile SingularAttribute<Client, String> email;
    public static volatile CollectionAttribute<Client, Commande> commandeCollection;

}
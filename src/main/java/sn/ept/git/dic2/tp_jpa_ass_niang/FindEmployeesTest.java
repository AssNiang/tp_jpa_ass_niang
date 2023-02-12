/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ept.git.dic2.tp_jpa_ass_niang;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import sn.ept.git.dic2.tp_jpa_ass_niang.entities.vente.Employe;

/**
 *
 * @author LENOVO
 */
public class FindEmployeesTest {
    private static final String VENTE_PU_NAME = "ventePU";
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(VENTE_PU_NAME);
        EntityManager em = emf.createEntityManager();
        
        Query q = em.createQuery("SELECT e FROM Employe e");
        
        List<Employe> employes = q.getResultList();
        
        System.out.println("Liste des employes: " + employes);
        System.out.println("Nombre d'employes: "+ employes.size());
        
        em.close();
        emf.close();
    }
}

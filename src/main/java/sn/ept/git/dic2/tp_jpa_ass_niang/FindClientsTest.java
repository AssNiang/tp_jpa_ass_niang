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
import sn.ept.git.dic2.tp_jpa_ass_niang.entities.vente.Client;
/**
 *
 * @author LENOVO
 */
public class FindClientsTest {
    private static final String VENTE_PU_NAME = "ventePU";
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(VENTE_PU_NAME);
        EntityManager em = emf.createEntityManager();
        
        Query q = em.createQuery("SELECT c FROM Client c");
        
        List<Client> clients = q.getResultList();
        
        System.out.println("Liste des clients: " + clients);
        System.out.println("Nombre de clients: "+ clients.size());
        
        em.close();
        emf.close();
    }
}

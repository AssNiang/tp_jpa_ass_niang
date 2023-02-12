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
import sn.ept.git.dic2.tp_jpa_ass_niang.entities.production.Produit;

/**
 *
 * @author LENOVO
 */
public class FindProductsTest {
    private static final String PRODUCTION_PU_NAME = "productionPU";
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PRODUCTION_PU_NAME);
        EntityManager em = emf.createEntityManager();
        
        Query q = em.createQuery("SELECT p FROM Produit p");
        
        List<Produit> produits = q.getResultList();
        
        System.out.println("Liste des produits: " + produits);
        
        em.close();
        emf.close();
    }
}

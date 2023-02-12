/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ept.git.dic2.tp_jpa_ass_niang;

import java.util.Arrays;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import sn.ept.git.dic2.tp_jpa_ass_niang.entities.production.Produit;
import sn.ept.git.dic2.tp_jpa_ass_niang.entities.production.Stock;

/**
 *
 * @author LENOVO
 */
public class FindStockTest {
    private static final String PRODUCTION_PU_NAME = "productionPU";
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PRODUCTION_PU_NAME);
        EntityManager em = emf.createEntityManager();
        
        Query q = em.createQuery("SELECT s.produit.nom,SUM(s.quantite) FROM Stock s GROUP BY s.produit");
        
        List<Object[]> stocks = q.getResultList();
        
        for (Object[] stock : stocks) {
            System.out.println("stock restant: " + stock[1] + ", nom: " + stock[0] );
        }
        
        
        em.close();
        emf.close();
    }
}

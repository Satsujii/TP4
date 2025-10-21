package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory;

    static {
        try {
            // Création de la SessionFactory à partir du fichier hibernate.cfg.xml
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log de l'erreur en cas d'échec de l'initialisation
            System.err.println("Échec de la création de la SessionFactory : " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    // Méthode d'accès à la SessionFactory
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}

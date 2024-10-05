package utn.frc.bda.semana06;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import utn.frc.bda.util.menu.Menu;
import utn.frc.bda.util.menu.MenuItem;

import java.util.List;
import java.util.Scanner;

public class OrdersDB {
    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("ordersPU");
    public static EntityManager em = emf.createEntityManager();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        run(scanner);

        scanner.close();
    }

    public static void run(Scanner sc) {
        MenuItem[] ops = {
                new MenuItem("1", "Ciudades", () -> {
                    List<City> cities = getCiudades();
                    System.out.println("Ciudades:");
                    for (City c : cities) {
                        System.out.println("ID: " + c.getCid() +  " Nombre: " + c.getName());
                    }

                }),
                new MenuItem("2", "JDBC Con DBManager", () -> System.out.println("2")),
        };

        Menu menu = new Menu(sc, ops);

        menu.run();
    }



        public void agregarCiudad ( City ciudad) {
            em.getTransaction().begin();
            em.persist(ciudad);
            em.getTransaction().commit();
        }

        public City obtenerCiudad(Long id) {
            return em.find(City.class, id);
        }

        public void actualizarCiudad(City ciudad) {
            em.getTransaction().begin();
            em.merge(ciudad);
            em.getTransaction().commit();
        }
    public static List<City> getCiudades() {
        TypedQuery<City> query = em.createQuery("SELECT c FROM City c", City.class);
        return query.getResultList();
    }


    }


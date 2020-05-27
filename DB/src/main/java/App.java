import controllers.dbSession;
import controllers.login;
import controllers.stageRender;
import entity.*;
import javafx.application.Application;
import static javafx.application.Application.launch;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class App extends Application {

    public static dbSession sesja=new dbSession();
    @Override
    public void start(Stage stage) throws Exception {

        //polaczenie z baza
        sesja.sessionStart();

        stageRender.renderlogin();

        //javafx view

//        Adres adres=new Adres();
//        adres.setKod_Pocztowy("35-213");
//        adres.setMiejscowosc("Rzeszów");
//        adres.setNumer_Budynku(402);
//        adres.setUlica("Dębicka");
//
//        Wydawnictwa wydawnictwa=new Wydawnictwa();
//        wydawnictwa.setNazwa("Abilion");
//        wydawnictwa.setAdres(adres);
//
//        Kategorie kategorie=new Kategorie();
//        kategorie.setNazwa("Poezja");
//
//        Autorzy autorzy=new Autorzy();
//        autorzy.setImie("Joanna");
//        autorzy.setNazwisko("Turczyn");
//
//        Ksiazki ksiazki=new Ksiazki();
//        ksiazki.setData_wydania(new Date());
//        ksiazki.setIlosc(5);
//        ksiazki.setKategoria(kategorie);
//        ksiazki.setAutorzy(Arrays.asList(autorzy));
//        ksiazki.setTytul("Kwiat zakazanego drzewa");
//        ksiazki.setWydawnictwo(wydawnictwa);

//        Pracownicy pracownicy=new Pracownicy();
//        pracownicy.setAdres(adres);
//        pracownicy.setData_urodzenia(new Date());
//        pracownicy.setImie("admin");
//        pracownicy.setNazwisko("admin");
//        pracownicy.setHaslo("admin");
//        pracownicy.setLogin("admin");
//        pracownicy.setPesel("XDPESEL");

//        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
//        Session session=sessionFactory.openSession();
//        session.beginTransaction();
//        session.save(pracownicy);
//        session.getTransaction().commit();
//        session.close();

//        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Scene.fxml"));
//
//        Scene scene = new Scene(root);
//        scene.getStylesheets().add("/styles/Styles.css");
//
//        stage.setTitle("JavaFX and Maven");
//        stage.setScene(scene);
//        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}

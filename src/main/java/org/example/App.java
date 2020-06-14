package org.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

    public class App
    {
    public static void main( String[] args )
    {
//        Alien al=new Alien();
//        al.setName("kkr");
//        al.setAid(5);
//
//        Laptoop laptop=new Laptoop();
//        laptop.setLid(110);
//        laptop.setBrand("del");
//        laptop.setPrice(32);

//        Laptoop laptopone=new Laptoop();
//        laptopone.setLid(107);
//        laptopone.setBrand("del");
//        laptopone.setPrice(30);

//        Laptoop laptoptwo=new Laptoop();
//        laptoptwo.setLid(108);
//        laptoptwo.setBrand("hp");
//        laptoptwo.setPrice(33);

//        al.getLaptoops().add(laptop);
////        al.getLaptoops().add(laptopone);
////        al.getLaptoops().add(laptoptwo);
//        laptop.setAlien(al);
////        laptopone.setAlien(al);
//        laptoptwo.setAlien(al);

        Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class).addAnnotatedClass(Laptoop.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session=sf.openSession();

        session.beginTransaction();
//        session.save(laptop);
//        session.save(laptoptwo);
//        session.save(laptopone);
        Alien a1=session.get(Alien.class,1);
        System.out.println(a1.getName());

//        Collection<Laptoop> laps=a1.getLaptoops();
//        for(Laptoop l:laps){
//            System.out.println(l);
//        }

        session.getTransaction().commit();
    }
}

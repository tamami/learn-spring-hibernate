package lab.aikibo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lab.aikibo.bo.SpptBo;
import lab.aikibo.entity.Sppt;

public class App {
  public static void main(String args[]) {
    ApplicationContext appContext = new ClassPathXmlApplicationContext("config/BeanLocations.xml");

    SpptBo spptBo = (SpptBo) appContext.getBean("spptBo");

    Sppt sppt = spptBo.getDataIndividual("332901000100100010", "2013");
    System.out.println(sppt);

    System.out.println("done");
  }
}

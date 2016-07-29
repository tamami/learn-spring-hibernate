package lab.aikibo.manager;

import java.util.List;

import org.springframework.org.hibernate3.support.HibernateDaoSupport;

import lab.aikibo.entity.Sppt;

public class SpptManager extends HibernateDaoSupport {

  public Sppt getDataIndividual(String nop, String thn) {
    List list = getHibernateTemplate().find("from Sppt where nop=? and thnPajak=?", nop, thn);

    return (Sppt) list.get(0);
  }

}

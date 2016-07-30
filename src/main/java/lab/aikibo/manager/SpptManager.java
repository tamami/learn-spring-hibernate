package lab.aikibo.manager;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import lab.aikibo.entity.Sppt;

public class SpptManager extends HibernateDaoSupport {

  public Sppt getDataIndividual(String nop, String thn) {
    Object[] params = {nop, thn};
    List list = getHibernateTemplate().find("from Sppt where nop=? and thnPajak=?", params);

    return (Sppt) list.get(0);
  }

}

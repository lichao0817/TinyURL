package net.thepapaya.service;

import net.thepapaya.dao.UrlDao;
import net.thepapaya.utils.UrlUtils;

import java.sql.SQLException;

public class UrlService {
    public String addUrl(String address) throws SQLException{
        UrlDao dao = new UrlDao();
        dao.addUrl(address);
        return UrlUtils.idToShortKey(dao.getLastId());
    }
}

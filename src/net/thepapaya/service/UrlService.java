package net.thepapaya.service;

import net.thepapaya.dao.UrlDao;
import net.thepapaya.domain.Url;
import net.thepapaya.utils.UrlUtils;

import java.sql.SQLException;
import java.util.List;

public class UrlService {
    public String getShortUrl(String address) throws SQLException{
        UrlDao dao = new UrlDao();
        int id = dao.addUrl(address);
        return UrlUtils.idToShortKey(id);
    }
    public String getLongUrl(String address) throws SQLException {
        UrlDao dao = new UrlDao();
        int id = UrlUtils.shortKeytoID(address);
        List<Url> list = dao.findUrl(id);
        return list.get(0).getUrl();
    }
}

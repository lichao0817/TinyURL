package net.thepapaya.dao;

import net.thepapaya.domain.Url;
import net.thepapaya.utils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Chao on 2016/12/16.
 */
public class UrlDao {
    public void addUrl(String url) throws SQLException {
        // INSERT INTO url (url) VALUES('www.google.com');
        QueryRunner queryRunner = new QueryRunner();
        queryRunner.update(DbUtils.getConnection(), "INSERT INTO url (url) VALUES(?)", url);
    }

    public int getLastId(){
        return 0;
    }

    public List<Url> findUrl(int id) throws SQLException {
        // SELECT * FROM url WHERE id=1;
        QueryRunner queryRunner = new QueryRunner();
        return queryRunner.query("SELECT * FROM url WHERE id=?", new BeanListHandler<Url>(Url.class), id);
    }
}
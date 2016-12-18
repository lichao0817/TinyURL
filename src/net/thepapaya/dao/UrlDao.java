package net.thepapaya.dao;

import net.thepapaya.domain.Url;
import net.thepapaya.utils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * Created by Chao on 2016/12/16.
 */
public class UrlDao {
    public int addUrl(String url) throws SQLException {
        // INSERT INTO url (url) VALUES('www.google.com');
        Connection con = DbUtils.getConnection();

        Statement statement = con.createStatement();
        String query = "INSERT INTO url (url) VALUES('" + url + "')";
        return statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
    }

    public List<Url> findUrl(int id) throws SQLException {
        // SELECT * FROM url WHERE id=1;
        QueryRunner queryRunner = new QueryRunner();
        return queryRunner.query("SELECT * FROM url WHERE id=?", new BeanListHandler<Url>(Url.class), id);
    }
}
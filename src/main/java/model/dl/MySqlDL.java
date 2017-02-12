package model.dl;

import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;

/**
 * Created by raghuramat on 03/01/17.
 */
public interface MySqlDL
{
    @SqlUpdate("insert into tb_blog(blog_id, created_by, blog_status) values (:blogId, :createdBy, :blogStatus)")
    void insertAP(@Bind("bssid") String bssid, @Bind("ssid") String ssid, @Bind("capabilities") String capabilities);

    @SqlQuery("select id from tb_accesspoints where bssid = :bssid")
    int findNameById(@Bind("bssid") String bssid);
}

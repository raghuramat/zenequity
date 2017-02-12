package model.dao;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

/**
 * Created by raghuramat on 04/01/17.
 */
public class Blog {

    @JsonProperty
    private int _blogId;

    @JsonProperty
    private String _createdBy;

    @JsonProperty
    private Boolean _blogStatus;

    // need an empty constructor for json serialization
    public Blog() {}

    public Blog(int blogId, String createdBy, Boolean blogStatus)
    {
        _blogId = blogId;
        _createdBy = createdBy;
        _blogStatus = blogStatus;
    }

    public String get_createdBy() {return this._createdBy;}
    public int get_blogId() {return this._blogId;}
    public Boolean get_blogStatus() {return this._blogStatus;}

    public void set_blogId(int blogId) {this._blogId = blogId;}
    public void set_createdBy(String createdBy) {this._createdBy = createdBy;}
    public void set_blogStatus(Boolean blogStatus){this._blogStatus = blogStatus;}


}

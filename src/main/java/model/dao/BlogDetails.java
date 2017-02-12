package model.dao;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by raghuramat on 04/01/17.
 */
public class BlogDetails
{
    @JsonProperty
    private String _blogDetails;

    public BlogDetails() {}

    public BlogDetails(String blogDetails)
    {
        _blogDetails = blogDetails;
    }

    public String get_blogDetails() {return this._blogDetails;}
    public void set_blogDetails(String blogDetails) {this._blogDetails = blogDetails;}
}

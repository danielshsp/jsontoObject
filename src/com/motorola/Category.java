package com.motorola;

import org.codehaus.jackson.annotate.JsonProperty;
import java.util.*;
public class Category {


    private  String category;
    private  String categoryId;
    private  String categoryValue;
    private Months months;

    public Category(@JsonProperty("category_name") String category,
                    @JsonProperty("category_id") String categoryId,
                    @JsonProperty("category_value") String categoryValue ){
        this.category = category;
        this.categoryId = categoryId;
        this.categoryValue = categoryValue;

    }

    public Months getMonths() {
        return months;
    }

    public void setMonths(Months months) {
        this.months = months;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryValue() {
        return categoryValue;
    }

    public void setCategoryValue(String categoryValue) {
        this.categoryValue = categoryValue;
    }
}

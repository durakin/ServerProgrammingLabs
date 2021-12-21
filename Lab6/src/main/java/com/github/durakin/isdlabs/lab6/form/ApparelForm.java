package com.github.durakin.isdlabs.lab6.form;

import javax.validation.constraints.*;
import java.math.BigDecimal;

public class ApparelForm {
    /*
        @NotNull(message = "Can't be null")
        @Positive(message = "Must be positive")
        private int id;


     */
    @NotBlank(message = "Can't be blank")
    private String type;

    private String size;

    @Size(max = 1)
    private String sex;

    @NotNull(message = "Can't be null")
    @Positive(message = "Must be positive")
    private BigDecimal price;

    @NotNull(message = "Can't be null")
    @PositiveOrZero(message = "Can't be negative")
    private int inStock;

/*
    public void setId(int id) {
        this.id = id;
    }

 */

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSex() {
        return sex;
    }

    /*
    public int getId() {
        return id;
    }

     */

    public void setSex(String sex) {
        this.sex = sex;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }
}

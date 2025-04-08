package com.xs.model;

import java.io.Serializable;

/**
 * 
 * @TableName t_product
 */

public class Product implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String omsSku;

    /**
     * 
     */
    private Long length;

    /**
     * 
     */
    private Long width;

    /**
     * 
     */
    private Long height;

    /**
     * 
     */
    private Long weight;

    /**
     * 
     */
    private Integer unit;

    /**
     * 
     */
    private Integer deleted;

    /**
     * 
     */
    private Integer createTime;

    /**
     * 
     */
    private Integer modifyTime;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     */
    public String getOmsSku() {
        return omsSku;
    }

    /**
     * 
     */
    public void setOmsSku(String omsSku) {
        this.omsSku = omsSku;
    }

    /**
     * 
     */
    public Long getLength() {
        return length;
    }

    /**
     * 
     */
    public void setLength(Long length) {
        this.length = length;
    }

    /**
     * 
     */
    public Long getWidth() {
        return width;
    }

    /**
     * 
     */
    public void setWidth(Long width) {
        this.width = width;
    }

    /**
     * 
     */
    public Long getHeight() {
        return height;
    }

    /**
     * 
     */
    public void setHeight(Long height) {
        this.height = height;
    }

    /**
     * 
     */
    public Long getWeight() {
        return weight;
    }

    /**
     * 
     */
    public void setWeight(Long weight) {
        this.weight = weight;
    }

    /**
     * 
     */
    public Integer getUnit() {
        return unit;
    }

    /**
     * 
     */
    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    /**
     * 
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * 
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    /**
     * 
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * 
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * 
     */
    public Integer getModifyTime() {
        return modifyTime;
    }

    /**
     * 
     */
    public void setModifyTime(Integer modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Product other = (Product) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getOmsSku() == null ? other.getOmsSku() == null : this.getOmsSku().equals(other.getOmsSku()))
            && (this.getLength() == null ? other.getLength() == null : this.getLength().equals(other.getLength()))
            && (this.getWidth() == null ? other.getWidth() == null : this.getWidth().equals(other.getWidth()))
            && (this.getHeight() == null ? other.getHeight() == null : this.getHeight().equals(other.getHeight()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getOmsSku() == null) ? 0 : getOmsSku().hashCode());
        result = prime * result + ((getLength() == null) ? 0 : getLength().hashCode());
        result = prime * result + ((getWidth() == null) ? 0 : getWidth().hashCode());
        result = prime * result + ((getHeight() == null) ? 0 : getHeight().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", omsSku=").append(omsSku);
        sb.append(", length=").append(length);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", weight=").append(weight);
        sb.append(", unit=").append(unit);
        sb.append(", deleted=").append(deleted);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
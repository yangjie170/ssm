package com.emmm.entity;

import javax.persistence.*;

@Entity
@Table(name = "sys_region", schema = "shop", catalog = "")
public class SysRegionEntity {
    private String regionId;
    private String regionName;
    private String regionShortName;
    private String regionCode;
    private String regionParentId;
    private Integer regionLevel;

    @Id
    @Column(name = "region_id", nullable = false, length = 10)
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    @Basic
    @Column(name = "region_name", nullable = false, length = 50)
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    @Basic
    @Column(name = "region_short_name", nullable = true, length = 10)
    public String getRegionShortName() {
        return regionShortName;
    }

    public void setRegionShortName(String regionShortName) {
        this.regionShortName = regionShortName;
    }

    @Basic
    @Column(name = "region_code", nullable = true, length = 20)
    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    @Basic
    @Column(name = "region_parent_id", nullable = true, length = 10)
    public String getRegionParentId() {
        return regionParentId;
    }

    public void setRegionParentId(String regionParentId) {
        this.regionParentId = regionParentId;
    }

    @Basic
    @Column(name = "region_level", nullable = true)
    public Integer getRegionLevel() {
        return regionLevel;
    }

    public void setRegionLevel(Integer regionLevel) {
        this.regionLevel = regionLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysRegionEntity that = (SysRegionEntity) o;

        if (regionId != null ? !regionId.equals(that.regionId) : that.regionId != null) return false;
        if (regionName != null ? !regionName.equals(that.regionName) : that.regionName != null) return false;
        if (regionShortName != null ? !regionShortName.equals(that.regionShortName) : that.regionShortName != null)
            return false;
        if (regionCode != null ? !regionCode.equals(that.regionCode) : that.regionCode != null) return false;
        if (regionParentId != null ? !regionParentId.equals(that.regionParentId) : that.regionParentId != null)
            return false;
        if (regionLevel != null ? !regionLevel.equals(that.regionLevel) : that.regionLevel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = regionId != null ? regionId.hashCode() : 0;
        result = 31 * result + (regionName != null ? regionName.hashCode() : 0);
        result = 31 * result + (regionShortName != null ? regionShortName.hashCode() : 0);
        result = 31 * result + (regionCode != null ? regionCode.hashCode() : 0);
        result = 31 * result + (regionParentId != null ? regionParentId.hashCode() : 0);
        result = 31 * result + (regionLevel != null ? regionLevel.hashCode() : 0);
        return result;
    }
}

package com.movie.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class MovieInfoDO implements Serializable {
    /*
    
     */
    private Integer id;

    /*
    电影名称
     */
    private String mtitle;

    /*
    地区
     */
    private String mplace;

    /*
    风格
     */
    private String mtype;

    /*
    上映时间
     */
    private String mpublished;

    /*
    导演
     */
    private String mdirector;

    /*
    电影评分
     */
    private BigDecimal mscore;

    /*
    演员
     */
    private String mactor;

    /*
    电影地址
     */
    private String murl;

    /*
    电影简介
     */
    private String mintro;

    /*
    图片
     */
    private String mpicture;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMtitle() {
        return mtitle;
    }

    public void setMtitle(String mtitle) {
        this.mtitle = mtitle;
    }

    public String getMplace() {
        return mplace;
    }

    public void setMplace(String mplace) {
        this.mplace = mplace;
    }

    public String getMtype() {
        return mtype;
    }

    public void setMtype(String mtype) {
        this.mtype = mtype;
    }

    public String getMpublished() {
        return mpublished;
    }

    public void setMpublished(String mpublished) {
        this.mpublished = mpublished;
    }

    public String getMdirector() {
        return mdirector;
    }

    public void setMdirector(String mdirector) {
        this.mdirector = mdirector;
    }

    public BigDecimal getMscore() {
        return mscore;
    }

    public void setMscore(BigDecimal mscore) {
        this.mscore = mscore;
    }

    public String getMactor() {
        return mactor;
    }

    public void setMactor(String mactor) {
        this.mactor = mactor;
    }

    public String getMurl() {
        return murl;
    }

    public void setMurl(String murl) {
        this.murl = murl;
    }

    public String getMintro() {
        return mintro;
    }

    public void setMintro(String mintro) {
        this.mintro = mintro;
    }

    public String getMpicture() {
        return mpicture;
    }

    public void setMpicture(String mpicture) {
        this.mpicture = mpicture;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mtitle=").append(mtitle);
        sb.append(", mplace=").append(mplace);
        sb.append(", mtype=").append(mtype);
        sb.append(", mpublished=").append(mpublished);
        sb.append(", mdirector=").append(mdirector);
        sb.append(", mscore=").append(mscore);
        sb.append(", mactor=").append(mactor);
        sb.append(", murl=").append(murl);
        sb.append(", mintro=").append(mintro);
        sb.append(", mpicture=").append(mpicture);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package com.movie;


public class MovieInfo {
    Integer id;
    String mtitle;
    String murl;
    String mintro;
    String mpicture;
    String mplace;
    String mactor;
    String mpublished;
    String mdirector;
    String mtype;
    Float mscore;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"mtitle\":\"")
                .append(mtitle).append('\"');
        sb.append(",\"murl\":\"")
                .append(murl).append('\"');
        sb.append(",\"mintro\":\"")
                .append(mintro).append('\"');
        sb.append(",\"mpicture\":\"")
                .append(mpicture).append('\"');
        sb.append(",\"mplace\":\"")
                .append(mplace).append('\"');
        sb.append(",\"mactor\":\"")
                .append(mactor).append('\"');
        sb.append(",\"mpublished\":\"")
                .append(mpublished).append('\"');
        sb.append(",\"mdirector\":\"")
                .append(mdirector).append('\"');
        sb.append(",\"mtype\":\"")
                .append(mtype).append('\"');
        sb.append(",\"mscore\":")
                .append(mscore);
        sb.append('}');
        return sb.toString();
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMtitle(String mtitle) {
        this.mtitle = mtitle;
    }

    public void setMurl(String murl) {
        this.murl = murl;
    }

    public void setMintro(String mintro) {
        this.mintro = mintro;
    }

    public void setMpicture(String mpicture) {
        this.mpicture = mpicture;
    }

    public void setMplace(String mplace) {
        this.mplace = mplace;
    }

    public void setMactor(String mactor) {
        this.mactor = mactor;
    }

    public void setMpublished(String mpublished) {
        this.mpublished = mpublished;
    }

    public void setMdirector(String mdirector) {
        this.mdirector = mdirector;
    }

    public void setMtype(String mtype) {
        this.mtype = mtype;
    }

    public void setMscore(Float mscore) {
        this.mscore = mscore;
    }

    public Integer getId() {
        return id;
    }

    public String getMtitle() {
        return mtitle;
    }

    public String getMurl() {
        return murl;
    }

    public String getMintro() {
        return mintro;
    }

    public String getMpicture() {
        return mpicture;
    }

    public String getMplace() {
        return mplace;
    }

    public String getMactor() {
        return mactor;
    }

    public String getMpublished() {
        return mpublished;
    }

    public String getMdirector() {
        return mdirector;
    }

    public String getMtype() {
        return mtype;
    }

    public Float getMscore() {
        return mscore;
    }
}

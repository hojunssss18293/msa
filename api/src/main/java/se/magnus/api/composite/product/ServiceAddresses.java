package se.magnus.api.composite.product;

public class ServiceAddresses {
  private String cmp;
  private String pro;
  private String rev;
  private String rec;

  public ServiceAddresses() {}

  public ServiceAddresses(String compositeAddress, String productAddress, String reviewAddress, String recommendationAddress) {
    this.cmp = compositeAddress;
    this.pro = productAddress;
    this.rev = reviewAddress;
    this.rec = recommendationAddress;
  }

  public String getCmp() { return cmp; }
  public void setCmp(String cmp) { this.cmp = cmp; }
  public String getPro() { return pro; }
  public void setPro(String pro) { this.pro = pro; }
  public String getRev() { return rev; }
  public void setRev(String rev) { this.rev = rev; }
  public String getRec() { return rec; }
  public void setRec(String rec) { this.rec = rec; }
}

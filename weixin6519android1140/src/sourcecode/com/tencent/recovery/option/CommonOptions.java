package com.tencent.recovery.option;

public class CommonOptions
{
  public String clientVersion;
  public String lOv;
  public String xPH;
  public String xPL;
  public String xPM;
  public boolean xPN;
  public long xPO;
  public long xPP;
  
  public static final class Builder
  {
    public String clientVersion;
    public String lOv;
    public String xPH;
    public String xPL;
    public String xPM;
    public boolean xPN;
    public long xPO;
    public long xPP;
    
    public final CommonOptions cnm()
    {
      CommonOptions localCommonOptions = new CommonOptions();
      localCommonOptions.xPL = this.xPL;
      localCommonOptions.xPM = this.xPM;
      localCommonOptions.clientVersion = this.clientVersion;
      localCommonOptions.xPH = this.xPH;
      localCommonOptions.lOv = this.lOv;
      localCommonOptions.xPN = this.xPN;
      localCommonOptions.xPO = this.xPO;
      localCommonOptions.xPP = this.xPP;
      return localCommonOptions;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\recovery\option\CommonOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
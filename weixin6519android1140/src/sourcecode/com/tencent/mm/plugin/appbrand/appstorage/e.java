package com.tencent.mm.plugin.appbrand.appstorage;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;

public final class e
{
  public String aDn;
  public String fjd;
  public b hLF;
  public String hLG;
  public a hLH;
  public a hLI;
  public a hLJ;
  public String hLK;
  public String hLL;
  public String hLM;
  public String hLN;
  public String hLO;
  public String hLP;
  public String hLQ;
  public String hLR;
  public String hLS;
  public String title;
  public String url;
  
  public e()
  {
    GMTrace.i(15545097256960L, 115820);
    GMTrace.o(15545097256960L, 115820);
  }
  
  public static final class a
  {
    private String country;
    private String fjl;
    private String hLT;
    public String hLU;
    private String state;
    
    public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
    {
      GMTrace.i(15545768345600L, 115825);
      this.country = bg.nl(paramString1);
      this.state = bg.nl(paramString2);
      this.fjl = bg.nl(paramString3);
      this.hLT = bg.nl(paramString4);
      this.hLU = bg.nl(paramString5);
      GMTrace.o(15545768345600L, 115825);
    }
    
    public final String KI()
    {
      GMTrace.i(15545902563328L, 115826);
      if ((bg.Sg(this.country)) || (bg.Sg(this.state)) || (bg.Sg(this.fjl)) || (bg.Sg(this.hLT)) || (bg.Sg(this.hLU)))
      {
        localObject = new StringBuilder();
        if (this.country.length() > 0) {
          ((StringBuilder)localObject).append(this.country);
        }
        if (this.state.length() > 0) {
          ((StringBuilder)localObject).append(this.state);
        }
        if (this.fjl.length() > 0) {
          ((StringBuilder)localObject).append(this.fjl);
        }
        if (this.hLT.length() > 0) {
          ((StringBuilder)localObject).append(this.hLT);
        }
        if (this.hLU.length() > 0)
        {
          ((StringBuilder)localObject).append(" ");
          ((StringBuilder)localObject).append(this.hLU);
        }
        localObject = ((StringBuilder)localObject).toString();
        GMTrace.o(15545902563328L, 115826);
        return (String)localObject;
      }
      Object localObject = new StringBuilder();
      if (this.hLT.length() > 0)
      {
        ((StringBuilder)localObject).append(this.hLT);
        ((StringBuilder)localObject).append(" ");
      }
      if (this.fjl.length() > 0) {
        ((StringBuilder)localObject).append(this.fjl + " ");
      }
      if (this.state.length() > 0) {
        ((StringBuilder)localObject).append(this.state + " ");
      }
      if (this.country.length() > 0) {
        ((StringBuilder)localObject).append(this.country);
      }
      if (this.hLU.length() > 0)
      {
        ((StringBuilder)localObject).append(" ");
        ((StringBuilder)localObject).append(this.hLU);
      }
      localObject = ((StringBuilder)localObject).toString();
      GMTrace.o(15545902563328L, 115826);
      return (String)localObject;
    }
  }
  
  public static final class b
  {
    public String hLV;
    public String hLW;
    public String hLX;
    
    public b(String paramString1, String paramString2, String paramString3)
    {
      GMTrace.i(15545231474688L, 115821);
      this.hLV = bg.nl(paramString1);
      this.hLW = bg.nl(paramString2);
      this.hLX = bg.nl(paramString3);
      GMTrace.o(15545231474688L, 115821);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\appstorage\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
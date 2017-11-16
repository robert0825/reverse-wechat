package com.tencent.mm.plugin.scanner.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.List;

public final class o
{
  public static o oub;
  public String aDn;
  public String fjd;
  public String hLG;
  public String hLP;
  public b otK;
  c otL;
  public c otM;
  c otN;
  public String otO;
  public a otP;
  public a otQ;
  public a otR;
  public a otS;
  public List<String> otT;
  public List<String> otU;
  public List<String> otV;
  public List<String> otW;
  public List<String> otX;
  public String otY;
  public String otZ;
  public String oua;
  public String title;
  public String url;
  
  public o()
  {
    GMTrace.i(6056172322816L, 45122);
    GMTrace.o(6056172322816L, 45122);
  }
  
  public static final class a
  {
    private String country;
    private String gEA;
    private String gVZ;
    private String hLT;
    private String hLU;
    private String ouc;
    private String oud;
    
    public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
    {
      GMTrace.i(6053622185984L, 45103);
      String str = paramString1;
      if (paramString1 == null) {
        str = "";
      }
      this.ouc = str;
      paramString1 = paramString2;
      if (paramString2 == null) {
        paramString1 = "";
      }
      this.oud = paramString1;
      paramString1 = paramString3;
      if (paramString3 == null) {
        paramString1 = "";
      }
      this.hLT = paramString1;
      paramString1 = paramString4;
      if (paramString4 == null) {
        paramString1 = "";
      }
      this.gEA = paramString1;
      paramString1 = paramString5;
      if (paramString5 == null) {
        paramString1 = "";
      }
      this.gVZ = paramString1;
      paramString1 = paramString6;
      if (paramString6 == null) {
        paramString1 = "";
      }
      this.hLU = paramString1;
      paramString1 = paramString7;
      if (paramString7 == null) {
        paramString1 = "";
      }
      this.country = paramString1;
      GMTrace.o(6053622185984L, 45103);
    }
    
    public final String KI()
    {
      GMTrace.i(6053756403712L, 45104);
      if ((bg.Sg(this.ouc)) || (bg.Sg(this.oud)) || (bg.Sg(this.hLT)) || (bg.Sg(this.gEA)) || (bg.Sg(this.gVZ)) || (bg.Sg(this.country)))
      {
        localObject = new StringBuilder();
        if (this.country.length() > 0)
        {
          ((StringBuilder)localObject).append(this.country);
          ((StringBuilder)localObject).append("\n");
        }
        if (this.gVZ.length() > 0) {
          ((StringBuilder)localObject).append(this.gVZ + " ");
        }
        if (this.gEA.length() > 0) {
          ((StringBuilder)localObject).append(this.gEA);
        }
        if ((this.gVZ.length() > 0) || (this.gEA.length() > 0)) {
          ((StringBuilder)localObject).append("\n");
        }
        if (this.hLT.length() > 0)
        {
          ((StringBuilder)localObject).append(this.hLT + " ");
          ((StringBuilder)localObject).append("\n");
        }
        if (this.oud.length() > 0)
        {
          ((StringBuilder)localObject).append(this.oud);
          ((StringBuilder)localObject).append("\n");
        }
        if (this.ouc.length() > 0)
        {
          ((StringBuilder)localObject).append(this.ouc);
          ((StringBuilder)localObject).append("\n");
        }
        if (this.hLU.length() > 0) {
          ((StringBuilder)localObject).append(this.hLU);
        }
        str = ((StringBuilder)localObject).toString();
        localObject = str;
        if (str.endsWith("\n")) {
          localObject = str.substring(0, str.length() - 1);
        }
        GMTrace.o(6053756403712L, 45104);
        return (String)localObject;
      }
      Object localObject = new StringBuilder();
      if (this.ouc.length() > 0)
      {
        ((StringBuilder)localObject).append(this.ouc);
        ((StringBuilder)localObject).append("\n");
      }
      if (this.oud.length() > 0)
      {
        ((StringBuilder)localObject).append(this.oud);
        ((StringBuilder)localObject).append("\n");
      }
      if (this.hLT.length() > 0)
      {
        ((StringBuilder)localObject).append(this.hLT);
        ((StringBuilder)localObject).append("\n");
      }
      if (this.gEA.length() > 0) {
        ((StringBuilder)localObject).append(this.gEA + " ");
      }
      if (this.gVZ.length() > 0) {
        ((StringBuilder)localObject).append(this.gVZ + " ");
      }
      if (this.hLU.length() > 0) {
        ((StringBuilder)localObject).append(this.hLU);
      }
      if ((this.gEA.length() > 0) || (this.gVZ.length() > 0)) {
        ((StringBuilder)localObject).append("\n");
      }
      if (this.country.length() > 0) {
        ((StringBuilder)localObject).append(this.country);
      }
      String str = ((StringBuilder)localObject).toString();
      localObject = str;
      if (str.endsWith("\n")) {
        localObject = str.substring(0, str.length() - 1);
      }
      GMTrace.o(6053756403712L, 45104);
      return (String)localObject;
    }
  }
  
  public static final class b
  {
    private String hLV;
    private String hLW;
    private String hLX;
    
    public b(String paramString1, String paramString2, String paramString3)
    {
      GMTrace.i(6059527766016L, 45147);
      String str = paramString1;
      if (paramString1 == null) {
        str = "";
      }
      this.hLV = str;
      paramString1 = paramString2;
      if (paramString2 == null) {
        paramString1 = "";
      }
      this.hLW = paramString1;
      paramString1 = paramString3;
      if (paramString3 == null) {
        paramString1 = "";
      }
      this.hLX = paramString1;
      GMTrace.o(6059527766016L, 45147);
    }
    
    public final String KI()
    {
      GMTrace.i(6059661983744L, 45148);
      Object localObject = new StringBuilder();
      if ((bg.Sg(this.hLV)) || (bg.Sg(this.hLW)) || (bg.Sg(this.hLX)))
      {
        if (this.hLX.trim().length() > 0) {
          ((StringBuilder)localObject).append(this.hLX);
        }
        if (this.hLW.trim().length() > 0) {
          ((StringBuilder)localObject).append(this.hLW);
        }
        if (this.hLV.trim().length() > 0) {
          ((StringBuilder)localObject).append(this.hLV);
        }
      }
      for (;;)
      {
        localObject = ((StringBuilder)localObject).toString();
        GMTrace.o(6059661983744L, 45148);
        return (String)localObject;
        if (this.hLV.trim().length() > 0) {
          ((StringBuilder)localObject).append(this.hLV);
        }
        if (this.hLW.trim().length() > 0)
        {
          ((StringBuilder)localObject).append(" ");
          ((StringBuilder)localObject).append(this.hLW);
        }
        if (this.hLX.trim().length() > 0)
        {
          ((StringBuilder)localObject).append(" ");
          ((StringBuilder)localObject).append(this.hLX);
        }
      }
    }
  }
  
  public static final class c
  {
    public String oue;
    public String ouf;
    
    public c(String paramString1, String paramString2)
    {
      GMTrace.i(6060467290112L, 45154);
      this.oue = paramString1;
      this.ouf = paramString2;
      GMTrace.o(6060467290112L, 45154);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\a\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
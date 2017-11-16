package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import android.text.style.ParagraphStyle;
import com.tencent.gmtrace.GMTrace;

public enum q
{
  public String shn;
  public String sho;
  public boolean shp;
  public String shq;
  public String shr;
  public boolean shs;
  public boolean sht;
  
  static
  {
    GMTrace.i(20627519963136L, 153687);
    shj = new q("NONE", 0, "", "", "", "", false);
    shk = new q("NOTEUL", 1, "<wx-ul>", "</wx-ul>", "<wx-li>", "</wx-li>", true);
    shl = new q("NOTEOL", 2, "<wx-ol>", "</wx-ol>", "<wx-li>", "</wx-li>", true);
    shm = new q("NOTETODO", 3, "", "", "<wn-todo checked=\"1\" >", "</wn-todo>", true);
    shu = new q[] { shj, shk, shl, shm };
    GMTrace.o(20627519963136L, 153687);
  }
  
  private q(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(20626983092224L, 153683);
    this.sht = false;
    this.shn = paramString1;
    this.sho = paramString2;
    this.shq = paramString3;
    this.shr = paramString4;
    this.shp = false;
    this.shs = paramBoolean1;
    GMTrace.o(20626983092224L, 153683);
  }
  
  public static q a(ParagraphStyle paramParagraphStyle)
  {
    GMTrace.i(20626848874496L, 153682);
    if ((paramParagraphStyle instanceof d))
    {
      paramParagraphStyle = shk;
      GMTrace.o(20626848874496L, 153682);
      return paramParagraphStyle;
    }
    if ((paramParagraphStyle instanceof m))
    {
      paramParagraphStyle = shl;
      GMTrace.o(20626848874496L, 153682);
      return paramParagraphStyle;
    }
    if ((paramParagraphStyle instanceof k))
    {
      paramParagraphStyle = shm;
      GMTrace.o(20626848874496L, 153682);
      return paramParagraphStyle;
    }
    GMTrace.o(20626848874496L, 153682);
    return null;
  }
  
  public final boolean bIx()
  {
    GMTrace.i(20627117309952L, 153684);
    if (this == shk)
    {
      GMTrace.o(20627117309952L, 153684);
      return true;
    }
    GMTrace.o(20627117309952L, 153684);
    return false;
  }
  
  public final boolean bIy()
  {
    GMTrace.i(20627251527680L, 153685);
    if (this == shl)
    {
      GMTrace.o(20627251527680L, 153685);
      return true;
    }
    GMTrace.o(20627251527680L, 153685);
    return false;
  }
  
  public final boolean bIz()
  {
    GMTrace.i(20627385745408L, 153686);
    if (this == shm)
    {
      GMTrace.o(20627385745408L, 153686);
      return true;
    }
    GMTrace.o(20627385745408L, 153686);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\nativenote\spans\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
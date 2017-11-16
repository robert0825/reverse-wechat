package com.tencent.mm.ui.contact;

import com.tencent.gmtrace.GMTrace;
import java.util.List;

public abstract class o
  extends n
{
  public List<String> iVA;
  public boolean wSS;
  
  public o(l paraml, List<String> paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    this(paraml, paramList, paramBoolean1, paramBoolean2, 0);
    GMTrace.i(1713691951104L, 12768);
    GMTrace.o(1713691951104L, 12768);
  }
  
  public o(l paraml, List<String> paramList, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    this(paraml, paramList, paramBoolean1, paramBoolean2, paramInt, false);
    GMTrace.i(1713826168832L, 12769);
    GMTrace.o(1713826168832L, 12769);
  }
  
  private o(l paraml, List<String> paramList, boolean paramBoolean1, boolean paramBoolean2, int paramInt, boolean paramBoolean3)
  {
    super(paraml, paramBoolean2, paramInt, paramBoolean3);
    GMTrace.i(16857478201344L, 125598);
    this.iVA = paramList;
    this.wSS = paramBoolean1;
    GMTrace.o(16857478201344L, 125598);
  }
  
  public o(l paraml, List<String> paramList, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this(paraml, paramList, paramBoolean1, paramBoolean2, 0, paramBoolean3);
    GMTrace.i(16857343983616L, 125597);
    GMTrace.o(16857343983616L, 125597);
  }
  
  public int Wv(String paramString)
  {
    GMTrace.i(1713960386560L, 12770);
    GMTrace.o(1713960386560L, 12770);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\contact\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
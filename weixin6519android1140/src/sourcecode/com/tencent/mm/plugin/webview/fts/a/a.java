package com.tencent.mm.plugin.webview.fts.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.a.a.i;
import java.util.List;

public abstract class a<T>
{
  protected String eQb;
  protected int rCL;
  
  public a(String paramString, int paramInt)
  {
    GMTrace.i(19476468727808L, 145111);
    this.eQb = paramString;
    this.rCL = paramInt;
    GMTrace.o(19476468727808L, 145111);
  }
  
  public abstract void bR(List<i> paramList);
  
  public boolean equals(Object paramObject)
  {
    GMTrace.i(19476737163264L, 145113);
    if (paramObject == this)
    {
      GMTrace.o(19476737163264L, 145113);
      return true;
    }
    if ((paramObject instanceof a))
    {
      paramObject = (a)paramObject;
      if ((this.eQb == ((a)paramObject).eQb) || ((this.eQb != null) && (this.eQb.equalsIgnoreCase(((a)paramObject).eQb)))) {}
      for (int i = 1; (((a)paramObject).rCL == this.rCL) && (i != 0); i = 0)
      {
        GMTrace.o(19476737163264L, 145113);
        return true;
      }
      GMTrace.o(19476737163264L, 145113);
      return false;
    }
    GMTrace.o(19476737163264L, 145113);
    return false;
  }
  
  public int hashCode()
  {
    GMTrace.i(19476871380992L, 145114);
    int i = super.hashCode();
    GMTrace.o(19476871380992L, 145114);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\fts\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
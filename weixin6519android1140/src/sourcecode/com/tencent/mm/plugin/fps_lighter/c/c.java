package com.tencent.mm.plugin.fps_lighter.c;

import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import java.util.List;

public final class c
{
  public int gLU;
  public int gZW;
  public long lns;
  public long lnt;
  public List<String> lnx;
  public List<String> lny;
  public long lnz;
  
  public c(b paramb)
  {
    GMTrace.i(5220398530560L, 38895);
    this.lnx = new ArrayList();
    this.lny = new ArrayList();
    this.lns = paramb.lns;
    this.lnt = paramb.lnt;
    this.lnx.add(paramb.iyA);
    this.lnz = paramb.iyA;
    this.lny.add(paramb.beginTime);
    this.gLU = paramb.gLU;
    this.gZW = 1;
    GMTrace.o(5220398530560L, 38895);
  }
  
  public final String aAn()
  {
    GMTrace.i(5220666966016L, 38897);
    String str = this.lns + ">" + (this.gLU - 1);
    GMTrace.o(5220666966016L, 38897);
    return str;
  }
  
  public final String getKey()
  {
    GMTrace.i(5220532748288L, 38896);
    String str = this.lnt + ">" + this.gLU;
    GMTrace.o(5220532748288L, 38896);
    return str;
  }
  
  public final String toString()
  {
    GMTrace.i(5220801183744L, 38898);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(this.lnt);
    ((StringBuilder)localObject).append(" ");
    ((StringBuilder)localObject).append(this.lnz);
    ((StringBuilder)localObject).append(" ");
    ((StringBuilder)localObject).append(this.gLU);
    ((StringBuilder)localObject).append(" ");
    ((StringBuilder)localObject).append(this.gZW);
    ((StringBuilder)localObject).append(" ");
    ((StringBuilder)localObject).append(this.lns);
    ((StringBuilder)localObject).append("\n");
    localObject = ((StringBuilder)localObject).toString();
    GMTrace.o(5220801183744L, 38898);
    return (String)localObject;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fps_lighter\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
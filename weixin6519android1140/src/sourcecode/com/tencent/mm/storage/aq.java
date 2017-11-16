package com.tencent.mm.storage;

import com.tencent.gmtrace.GMTrace;

public class aq
{
  public final boolean eDU;
  private final String eQt;
  private final String jQT;
  private final String name;
  private final String type;
  private boolean vBk;
  
  public aq()
  {
    GMTrace.i(1538000945152L, 11459);
    this.type = "";
    this.name = "";
    this.eQt = "";
    this.jQT = "";
    this.eDU = true;
    GMTrace.o(1538000945152L, 11459);
  }
  
  public aq(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(1538135162880L, 11460);
    this.type = paramString1;
    this.name = paramString2;
    this.eQt = paramString3;
    this.jQT = paramString4;
    this.eDU = paramBoolean1;
    this.vBk = paramBoolean2;
    GMTrace.o(1538135162880L, 11460);
  }
  
  public final String bTr()
  {
    GMTrace.i(1538537816064L, 11463);
    if (this.jQT == null)
    {
      GMTrace.o(1538537816064L, 11463);
      return "";
    }
    String str = this.jQT;
    GMTrace.o(1538537816064L, 11463);
    return str;
  }
  
  public final String getType()
  {
    GMTrace.i(1538269380608L, 11461);
    if (this.type == null)
    {
      GMTrace.o(1538269380608L, 11461);
      return "";
    }
    String str = this.type;
    GMTrace.o(1538269380608L, 11461);
    return str;
  }
  
  public final String vj()
  {
    GMTrace.i(1538403598336L, 11462);
    if (this.eQt == null)
    {
      GMTrace.o(1538403598336L, 11462);
      return "";
    }
    String str = this.eQt;
    GMTrace.o(1538403598336L, 11462);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
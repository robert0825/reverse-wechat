package com.tencent.mm.storage;

import com.tencent.gmtrace.GMTrace;

public final class an
{
  public static final an vAZ;
  public static final an vBa;
  public static final an vBb;
  public static final an vBc;
  public static final an vBd;
  public static final an vBe;
  public static final an vBf;
  public static final an vBg;
  public static final an vBh;
  public static final an vBi;
  public static final an vBj;
  public String tag;
  public int time;
  
  static
  {
    GMTrace.i(1535853461504L, 11443);
    vAZ = new an("timeline");
    vBa = new an("album_friend");
    vBb = new an("album_self");
    vBc = new an("album_stranger");
    vBd = new an("profile_friend");
    vBe = new an("profile_stranger");
    vBf = new an("comment");
    vBg = new an("comment_detail");
    vBh = new an("other");
    vBi = new an("snssight");
    vBj = new an("fts");
    GMTrace.o(1535853461504L, 11443);
  }
  
  public an(String paramString)
  {
    GMTrace.i(1535182372864L, 11438);
    this.tag = "";
    this.time = 0;
    this.tag = paramString;
    GMTrace.o(1535182372864L, 11438);
  }
  
  public static an a(an paraman, int paramInt)
  {
    GMTrace.i(1535450808320L, 11440);
    paraman = new an(paraman.tag);
    paraman.time = paramInt;
    GMTrace.o(1535450808320L, 11440);
    return paraman;
  }
  
  public static an bTm()
  {
    GMTrace.i(1534511284224L, 11433);
    an localan = new an("timeline");
    GMTrace.o(1534511284224L, 11433);
    return localan;
  }
  
  public static an bTn()
  {
    GMTrace.i(1534645501952L, 11434);
    an localan = new an("album_friend");
    GMTrace.o(1534645501952L, 11434);
    return localan;
  }
  
  public static an bTo()
  {
    GMTrace.i(1534779719680L, 11435);
    an localan = new an("album_self");
    GMTrace.o(1534779719680L, 11435);
    return localan;
  }
  
  public static an bTp()
  {
    GMTrace.i(1534913937408L, 11436);
    an localan = new an("album_stranger");
    GMTrace.o(1534913937408L, 11436);
    return localan;
  }
  
  public static an bTq()
  {
    GMTrace.i(1535048155136L, 11437);
    an localan = new an("snssight");
    GMTrace.o(1535048155136L, 11437);
    return localan;
  }
  
  public final an Av(int paramInt)
  {
    GMTrace.i(1535316590592L, 11439);
    this.time = paramInt;
    GMTrace.o(1535316590592L, 11439);
    return this;
  }
  
  public final boolean equals(Object paramObject)
  {
    GMTrace.i(1535585026048L, 11441);
    if ((paramObject instanceof an))
    {
      bool = ((an)paramObject).tag.equals(this.tag);
      GMTrace.o(1535585026048L, 11441);
      return bool;
    }
    boolean bool = super.equals(paramObject);
    GMTrace.o(1535585026048L, 11441);
    return bool;
  }
  
  public final String toString()
  {
    GMTrace.i(1535719243776L, 11442);
    String str = this.tag + "@" + this.time;
    GMTrace.o(1535719243776L, 11442);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
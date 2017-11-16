package com.tencent.mm.g.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.b.b;
import java.util.LinkedList;

public final class jr
  extends b
{
  public a eNK;
  public b eNL;
  
  public jr()
  {
    this((byte)0);
    GMTrace.i(4350936088576L, 32417);
    GMTrace.o(4350936088576L, 32417);
  }
  
  private jr(byte paramByte)
  {
    GMTrace.i(4351070306304L, 32418);
    this.eNK = new a();
    this.eNL = new b();
    this.vhd = false;
    this.eDO = null;
    GMTrace.o(4351070306304L, 32418);
  }
  
  public static final class a
  {
    public String chatroomName;
    public LinkedList<String> eNM;
    public boolean eNy;
    public int scene;
    
    public a()
    {
      GMTrace.i(4208396861440L, 31355);
      this.scene = 0;
      this.eNy = false;
      GMTrace.o(4208396861440L, 31355);
    }
  }
  
  public static final class b
  {
    public int errCode;
    
    public b()
    {
      GMTrace.i(4228529520640L, 31505);
      GMTrace.o(4228529520640L, 31505);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\a\jr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
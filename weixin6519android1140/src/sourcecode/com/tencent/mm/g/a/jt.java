package com.tencent.mm.g.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.ali;
import com.tencent.mm.sdk.b.b;
import java.util.List;

public final class jt
  extends b
{
  public a eNP;
  public b eNQ;
  
  public jt()
  {
    this((byte)0);
    GMTrace.i(4359391805440L, 32480);
    GMTrace.o(4359391805440L, 32480);
  }
  
  private jt(byte paramByte)
  {
    GMTrace.i(4359526023168L, 32481);
    this.eNP = new a();
    this.eNQ = new b();
    this.vhd = false;
    this.eDO = null;
    GMTrace.o(4359526023168L, 32481);
  }
  
  public static final class a
  {
    public int eHz;
    public float eMl;
    public float eNR;
    public int eNS;
    public int eNT;
    public String eNU;
    public String eNV;
    public boolean eNy;
    
    public a()
    {
      GMTrace.i(4365028950016L, 32522);
      this.eHz = 0;
      this.eNR = 0.0F;
      this.eMl = 0.0F;
      this.eNS = 0;
      this.eNT = 0;
      this.eNy = false;
      GMTrace.o(4365028950016L, 32522);
    }
  }
  
  public static final class b
  {
    public int eHz;
    public boolean eNW;
    public List<ali> eNX;
    public int eNY;
    
    public b()
    {
      GMTrace.i(4328924381184L, 32253);
      this.eHz = 0;
      this.eNW = false;
      this.eNY = -1;
      GMTrace.o(4328924381184L, 32253);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\g\a\jt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
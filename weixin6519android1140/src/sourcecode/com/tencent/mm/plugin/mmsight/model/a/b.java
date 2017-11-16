package com.tencent.mm.plugin.mmsight.model.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class b
{
  int eSp;
  int lhd;
  int mAB;
  byte[] mZR;
  byte[] mZS;
  int mZT;
  int mZU;
  int mZV;
  int mZW;
  int mZX;
  int mZY;
  boolean mZZ;
  boolean naa;
  long tick;
  
  public b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean1, boolean paramBoolean2, int paramInt6, byte[] paramArrayOfByte)
  {
    GMTrace.i(7340099108864L, 54688);
    this.mZT = 0;
    this.mZU = 0;
    this.tick = bg.Pw();
    this.mZX = paramInt3;
    this.mAB = paramInt4;
    this.lhd = paramInt5;
    this.mZV = paramInt1;
    this.mZW = paramInt2;
    this.naa = paramBoolean2;
    this.mZZ = paramBoolean1;
    this.eSp = paramInt6;
    this.mZR = paramArrayOfByte;
    this.mZT = paramArrayOfByte.length;
    this.mZS = j.naP.h(Integer.valueOf(paramInt4 * paramInt5 * 3 / 2));
    GMTrace.o(7340099108864L, 54688);
  }
  
  public static abstract interface a
  {
    public abstract void a(b paramb);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
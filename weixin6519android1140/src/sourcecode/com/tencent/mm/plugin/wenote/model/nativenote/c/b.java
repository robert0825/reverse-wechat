package com.tencent.mm.plugin.wenote.model.nativenote.c;

import com.tencent.gmtrace.GMTrace;

public final class b
{
  public float iTi;
  public int jHw;
  public float jry;
  public float sfT;
  public float sfU;
  public int sfV;
  public float sfW;
  public float sfX;
  public float sfY;
  public float sfZ;
  public int sga;
  
  public b()
  {
    GMTrace.i(20607521521664L, 153538);
    this.jHw = 0;
    this.sfT = -1.0F;
    this.sfU = -1.0F;
    this.jry = -1.0F;
    this.iTi = -1.0F;
    this.sfV = -1;
    this.sfW = -1.0F;
    this.sfX = -1.0F;
    this.sfY = -1.0F;
    this.sfZ = -1.0F;
    this.sga = -1;
    GMTrace.o(20607521521664L, 153538);
  }
  
  public final void a(int paramInt1, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt2)
  {
    GMTrace.i(20607655739392L, 153539);
    this.jHw = paramInt1;
    this.sfT = paramFloat1;
    this.sfU = paramFloat2;
    this.jry = paramFloat3;
    this.iTi = paramFloat4;
    if (this.jHw == 1)
    {
      this.sfV = paramInt2;
      GMTrace.o(20607655739392L, 153539);
      return;
    }
    this.sfV = 0;
    GMTrace.o(20607655739392L, 153539);
  }
  
  public final int getType()
  {
    int j = 0;
    GMTrace.i(20607924174848L, 153541);
    if ((this.sfT >= 0.0F) && (this.sfU >= 0.0F) && (this.jry >= 0.0F) && (this.iTi >= 0.0F) && (this.sfV >= 0)) {}
    for (int i = 1; i == 0; i = 0)
    {
      GMTrace.o(20607924174848L, 153541);
      return 0;
    }
    i = j;
    if (this.sfW >= 0.0F)
    {
      i = j;
      if (this.sfX >= 0.0F)
      {
        i = j;
        if (this.sfY >= 0.0F)
        {
          i = j;
          if (this.sfZ >= 0.0F)
          {
            i = j;
            if (this.sga >= 0) {
              i = 1;
            }
          }
        }
      }
    }
    if (i == 0)
    {
      GMTrace.o(20607924174848L, 153541);
      return 1;
    }
    i = Math.abs((int)(this.jry - this.sfY));
    j = Math.abs((int)(this.iTi - this.sfZ));
    if ((i > 30) || (j > 30) || (this.sfV != this.sga))
    {
      GMTrace.o(20607924174848L, 153541);
      return 3;
    }
    GMTrace.o(20607924174848L, 153541);
    return 2;
  }
  
  public final void reset()
  {
    GMTrace.i(20607789957120L, 153540);
    this.jHw = 0;
    this.sfT = -1.0F;
    this.sfU = -1.0F;
    this.jry = -1.0F;
    this.iTi = -1.0F;
    this.sfV = -1;
    this.sfW = -1.0F;
    this.sfX = -1.0F;
    this.sfY = -1.0F;
    this.sfZ = -1.0F;
    this.sga = -1;
    GMTrace.o(20607789957120L, 153540);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\nativenote\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
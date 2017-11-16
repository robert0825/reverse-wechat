package com.tencent.mm.modelcontrol;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;

public final class e
{
  protected String gBj;
  protected int gBk;
  protected int gBl;
  protected int gBm;
  protected int gBn;
  protected boolean gBo;
  protected f[] gBp;
  
  public e()
  {
    GMTrace.i(4105317646336L, 30587);
    GMTrace.o(4105317646336L, 30587);
  }
  
  protected final boolean GE()
  {
    GMTrace.i(4105586081792L, 30589);
    if (bg.nm(this.gBj))
    {
      GMTrace.o(4105586081792L, 30589);
      return true;
    }
    boolean bool = b.jD(this.gBj);
    GMTrace.o(4105586081792L, 30589);
    return bool;
  }
  
  protected final VideoTransPara GF()
  {
    GMTrace.i(4105720299520L, 30590);
    Object localObject2 = null;
    Object localObject1 = null;
    if (this.gBp != null)
    {
      f[] arrayOff = this.gBp;
      int j = arrayOff.length;
      int i = 0;
      for (;;)
      {
        localObject2 = localObject1;
        if (i >= j) {
          break;
        }
        f localf = arrayOff[i];
        localObject2 = localObject1;
        if (localf != null)
        {
          localObject2 = localObject1;
          if (localf.gBq <= 0)
          {
            localObject2 = localObject1;
            if (localf.gBr >= 0)
            {
              localObject2 = new VideoTransPara();
              ((VideoTransPara)localObject2).width = localf.gBs;
              ((VideoTransPara)localObject2).height = localf.gBt;
              ((VideoTransPara)localObject2).fps = localf.gBu;
              ((VideoTransPara)localObject2).videoBitrate = localf.gBv;
              ((VideoTransPara)localObject2).gBl = this.gBl;
              ((VideoTransPara)localObject2).gBk = this.gBk;
              ((VideoTransPara)localObject2).gBm = this.gBm;
              ((VideoTransPara)localObject2).gBn = this.gBn;
            }
          }
        }
        i += 1;
        localObject1 = localObject2;
      }
    }
    GMTrace.o(4105720299520L, 30590);
    return (VideoTransPara)localObject2;
  }
  
  protected final void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    GMTrace.i(4105451864064L, 30588);
    this.gBj = paramString1;
    this.gBk = bg.getInt(paramString2, 0);
    int i;
    if (this.gBk == 0)
    {
      i = 64000;
      this.gBk = i;
      this.gBl = bg.getInt(paramString3, 1);
      this.gBm = bg.getInt(paramString4, 2);
      this.gBn = bg.getInt(paramString5, 1);
      if (bg.getInt(paramString6, 0) <= 0) {
        break label110;
      }
    }
    label110:
    for (boolean bool = true;; bool = false)
    {
      this.gBo = bool;
      GMTrace.o(4105451864064L, 30588);
      return;
      i = this.gBk * 1000;
      break;
    }
  }
  
  public final String toString()
  {
    GMTrace.i(4105854517248L, 30591);
    String str = "[ busyTime " + this.gBj + " audioBitrate " + this.gBk + " iFrame " + this.gBl + " profileIndex " + this.gBm + " presetIndex " + this.gBn + " isStepBr " + this.gBo + " ]";
    GMTrace.o(4105854517248L, 30591);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelcontrol\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
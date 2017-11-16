package com.tencent.mm.plugin.emoji.a.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.qy;
import com.tencent.mm.protocal.c.rh;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ak;

public final class f
{
  public rh khA;
  public qy khB;
  public int khC;
  public String khD;
  public boolean khE;
  public boolean khF;
  public boolean khG;
  public int khz;
  public int mStatus;
  public int rr;
  
  public f(qy paramqy)
  {
    GMTrace.i(11348377337856L, 84552);
    this.khF = true;
    this.khG = false;
    this.khB = paramqy;
    this.khz = a.khI;
    GMTrace.o(11348377337856L, 84552);
  }
  
  public f(rh paramrh)
  {
    GMTrace.i(11348243120128L, 84551);
    this.khF = true;
    this.khG = false;
    this.khA = paramrh;
    this.khz = a.khH;
    GMTrace.o(11348243120128L, 84551);
  }
  
  public final void a(boolean paramBoolean1, ak paramak, boolean paramBoolean2)
  {
    GMTrace.i(11348645773312L, 84554);
    rh localrh = this.khA;
    if (localrh == null)
    {
      GMTrace.o(11348645773312L, 84554);
      return;
    }
    if (paramBoolean2)
    {
      dB(7);
      GMTrace.o(11348645773312L, 84554);
      return;
    }
    boolean bool1 = e.a(localrh);
    boolean bool2 = e.b(localrh);
    boolean bool3;
    if (localrh == null)
    {
      paramBoolean2 = false;
      bool3 = TextUtils.isEmpty(localrh.uhh);
      if ((!paramBoolean2) || (!bool2)) {
        break label145;
      }
      dB(8);
    }
    for (;;)
    {
      if ((paramBoolean1) && (paramak != null) && (!bg.nm(paramak.vAO))) {
        this.khA.uhh = paramak.vAO;
      }
      GMTrace.o(11348645773312L, 84554);
      return;
      paramBoolean2 = e.bU(localrh.uhj, 8);
      break;
      label145:
      if (bool1)
      {
        dB(3);
        if ((bool2) || ((!paramBoolean1) && (bool3))) {
          this.khC = 0;
        } else {
          this.khC = 1;
        }
      }
      else if ((bool2) || ((!paramBoolean1) && (bool3)))
      {
        dB(3);
        this.khC = 0;
      }
      else
      {
        this.khC = 1;
        if ((paramBoolean1) && (paramak != null)) {}
        switch (paramak.vAM)
        {
        default: 
          if ((paramak.vAK != 7) && (paramak.vAK != 6) && (paramak.vAK != 3)) {
            dB(10);
          }
          break;
        case 11: 
          dB(11);
          break;
        case 12: 
          dB(4);
          continue;
          if (paramBoolean1) {
            dB(11);
          } else {
            dB(4);
          }
          break;
        }
      }
    }
  }
  
  public final void dB(int paramInt)
  {
    GMTrace.i(11348511555584L, 84553);
    if ((paramInt == 7) && (this.mStatus == 6) && (this.khF)) {
      this.khE = true;
    }
    this.mStatus = paramInt;
    GMTrace.o(11348511555584L, 84553);
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(11354282917888L, 84596);
      khH = 1;
      khI = 2;
      khJ = new int[] { khH, khI };
      GMTrace.o(11354282917888L, 84596);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\a\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
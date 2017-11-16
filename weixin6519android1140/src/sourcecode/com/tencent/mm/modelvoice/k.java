package com.tencent.mm.modelvoice;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.h.a;
import com.tencent.mm.compatible.d.j;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.e.b.a;
import com.tencent.mm.e.b.c;
import com.tencent.mm.e.b.c.a;
import com.tencent.mm.e.b.g.a;
import com.tencent.mm.e.c.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class k
  implements a
{
  private static int hej;
  int ewU;
  c.a exR;
  public c exi;
  public d hek;
  private String mFileName;
  public int mStatus;
  
  static
  {
    GMTrace.i(550829555712L, 4104);
    hej = 100;
    GMTrace.o(550829555712L, 4104);
  }
  
  public k()
  {
    GMTrace.i(549487378432L, 4094);
    this.mFileName = null;
    this.ewU = 0;
    this.mStatus = 0;
    this.exR = new c.a()
    {
      public final void ax(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(536468258816L, 3997);
        GMTrace.o(536468258816L, 3997);
      }
      
      public final void d(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
      {
        int i = 0;
        GMTrace.i(536334041088L, 3996);
        if (k.this.hek != null) {
          k.this.hek.a(new g.a(paramAnonymousArrayOfByte, paramAnonymousInt), 0, false);
        }
        k localk = k.this;
        while (i < paramAnonymousInt / 2)
        {
          int j = (short)(paramAnonymousArrayOfByte[(i * 2)] & 0xFF | paramAnonymousArrayOfByte[(i * 2 + 1)] << 8);
          if (j > localk.ewU) {
            localk.ewU = j;
          }
          i += 1;
        }
        GMTrace.o(536334041088L, 3996);
      }
    };
    GMTrace.o(549487378432L, 4094);
  }
  
  private void clean()
  {
    GMTrace.i(550158467072L, 4099);
    if (this.exi != null)
    {
      this.exi.qn();
      this.exi = null;
    }
    if (this.hek != null)
    {
      this.hek.qI();
      this.hek = null;
    }
    GMTrace.o(550158467072L, 4099);
  }
  
  public final void a(h.a parama)
  {
    GMTrace.i(549755813888L, 4096);
    GMTrace.o(549755813888L, 4096);
  }
  
  public final boolean bR(String paramString)
  {
    GMTrace.i(549621596160L, 4095);
    if (!bg.nm(this.mFileName))
    {
      w.e("MicroMsg.SpeexRecorder", "Duplicate Call startRecord , maybe Stop Fail Before");
      GMTrace.o(549621596160L, 4095);
      return false;
    }
    this.mStatus = 1;
    this.ewU = 0;
    this.exi = new c(16000, 1, 0);
    this.exi.exG = -19;
    if (p.fQL.fPy > 0) {
      this.exi.j(p.fQL.fPy, true);
    }
    for (;;)
    {
      this.exi.aA(false);
      this.exi.exR = this.exR;
      this.hek = new d();
      if (this.hek.bU(paramString)) {
        break;
      }
      w.e("MicroMsg.SpeexRecorder", "init speex writer failed");
      clean();
      this.mStatus = -1;
      GMTrace.o(549621596160L, 4095);
      return false;
      this.exi.j(5, false);
    }
    if (!this.exi.qw())
    {
      w.e("MicroMsg.SpeexRecorder", "start record failed");
      clean();
      this.mStatus = -1;
      GMTrace.o(549621596160L, 4095);
      return false;
    }
    this.mFileName = paramString;
    GMTrace.o(549621596160L, 4095);
    return true;
  }
  
  public final int getMaxAmplitude()
  {
    GMTrace.i(550292684800L, 4100);
    int i = this.ewU;
    this.ewU = 0;
    if (i > hej) {
      hej = i;
    }
    i = i * 100 / hej;
    GMTrace.o(550292684800L, 4100);
    return i;
  }
  
  public final int getStatus()
  {
    GMTrace.i(550024249344L, 4098);
    int i = this.mStatus;
    GMTrace.o(550024249344L, 4098);
    return i;
  }
  
  public final boolean qn()
  {
    GMTrace.i(549890031616L, 4097);
    this.mFileName = null;
    this.mStatus = 0;
    clean();
    GMTrace.o(549890031616L, 4097);
    return true;
  }
  
  public final int qo()
  {
    GMTrace.i(550426902528L, 4101);
    int i = this.exi.exW;
    GMTrace.o(550426902528L, 4101);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvoice\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
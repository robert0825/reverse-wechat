package com.tencent.mm.plugin.talkroom.component;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.e.b.c;
import com.tencent.mm.e.b.c.a;
import com.tencent.mm.plugin.talkroom.model.a;
import com.tencent.mm.sdk.platformtools.w;

public final class f
  extends d.a
{
  private c exi;
  private c.a eyi;
  private v2engine qwn;
  private short qwo;
  private short qwp;
  
  public f(v2engine paramv2engine)
  {
    GMTrace.i(5194494509056L, 38702);
    this.eyi = new c.a()
    {
      public final void ax(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(5188320493568L, 38656);
        GMTrace.o(5188320493568L, 38656);
      }
      
      public final void d(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
      {
        GMTrace.i(5188186275840L, 38655);
        w.d("MicroMsg.MicRecoder", "pcm len: " + paramAnonymousInt);
        if (paramAnonymousInt <= 0)
        {
          w.e("MicroMsg.MicRecoder", "pcm data too low");
          GMTrace.o(5188186275840L, 38655);
          return;
        }
        f.a(f.this, paramAnonymousArrayOfByte, paramAnonymousInt);
        paramAnonymousInt = f.a(f.this).Send(paramAnonymousArrayOfByte, (short)paramAnonymousInt);
        if (paramAnonymousInt < 0)
        {
          w.e("MicroMsg.MicRecoder", "send failed, ret: " + paramAnonymousInt);
          GMTrace.o(5188186275840L, 38655);
          return;
        }
        GMTrace.o(5188186275840L, 38655);
      }
    };
    this.qwn = paramv2engine;
    GMTrace.o(5194494509056L, 38702);
  }
  
  public final void bsa()
  {
    GMTrace.i(5194628726784L, 38703);
    if (this.exi != null)
    {
      this.exi.qn();
      this.exi = null;
    }
    GMTrace.o(5194628726784L, 38703);
  }
  
  public final void bsb()
  {
    GMTrace.i(5194762944512L, 38704);
    this.exi = new c(a.qwC, 1, 2);
    this.exi.j(8, false);
    this.exi.exR = this.eyi;
    this.exi.de(20);
    this.exi.qw();
    this.qwp = 0;
    this.qwo = 0;
    GMTrace.o(5194762944512L, 38704);
  }
  
  public final int bsc()
  {
    GMTrace.i(5194897162240L, 38705);
    if (this.qwp < this.qwo) {
      this.qwp = this.qwo;
    }
    if (this.qwp == 0)
    {
      GMTrace.o(5194897162240L, 38705);
      return 0;
    }
    int i = (short)(this.qwo * 100 / this.qwp);
    this.qwo = 0;
    GMTrace.o(5194897162240L, 38705);
    return i;
  }
  
  public final void release()
  {
    GMTrace.i(5195165597696L, 38707);
    bsa();
    GMTrace.o(5195165597696L, 38707);
  }
  
  public final void start()
  {
    GMTrace.i(5195031379968L, 38706);
    GMTrace.o(5195031379968L, 38706);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\talkroom\component\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
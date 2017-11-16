package com.tencent.mm.plugin.appbrand.media.record;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.e.b.c;
import com.tencent.mm.e.b.c.a;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  public int exF;
  public c exi;
  public RecordParam irU;
  public int irV;
  public long irW;
  public a irX;
  public c.a irY;
  public int sampleRate;
  
  public a(RecordParam paramRecordParam)
  {
    GMTrace.i(19854425849856L, 147927);
    this.exi = null;
    this.sampleRate = 0;
    this.irV = 0;
    this.irW = 0L;
    this.exF = -1;
    this.irY = new c.a()
    {
      public final void ax(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(19854962720768L, 147931);
        w.e("MicroMsg.AppBrandRecorder", "state:%d, detailState:%d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        if (a.this.irX != null) {
          a.this.irX.ax(paramAnonymousInt1, paramAnonymousInt2);
        }
        GMTrace.o(19854962720768L, 147931);
      }
      
      public final void d(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
      {
        GMTrace.i(19854828503040L, 147930);
        w.i("MicroMsg.AppBrandRecorder", "onRecPcmDataReady()");
        if (a.this.irX != null) {
          a.this.irX.d(paramAnonymousArrayOfByte, paramAnonymousInt);
        }
        GMTrace.o(19854828503040L, 147930);
      }
    };
    RecordParam localRecordParam = paramRecordParam;
    if (paramRecordParam == null) {
      localRecordParam = new RecordParam();
    }
    this.sampleRate = localRecordParam.sampleRate;
    this.irV = localRecordParam.isa;
    this.exF = localRecordParam.scene;
    this.irU = localRecordParam;
    GMTrace.o(19854425849856L, 147927);
  }
  
  public final boolean qn()
  {
    GMTrace.i(19854560067584L, 147928);
    w.i("MicroMsg.AppBrandRecorder", "stopRecord");
    if (this.exi != null) {}
    for (boolean bool = this.exi.qn();; bool = false)
    {
      long l = System.currentTimeMillis();
      this.irW -= l;
      w.i("MicroMsg.AppBrandRecorder", "stop time ticket:%d, costTimeInMs:%d", new Object[] { Long.valueOf(l), Long.valueOf(this.irW) });
      GMTrace.o(19854560067584L, 147928);
      return bool;
    }
  }
  
  public static abstract interface a
  {
    public abstract void ax(int paramInt1, int paramInt2);
    
    public abstract void d(byte[] paramArrayOfByte, int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\media\record\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.exdevice.i;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.b.c;
import com.tencent.mm.plugin.exdevice.b.e;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.plugin.exdevice.model.ae;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.platformtools.w;

public final class f
  extends ae
{
  private e kDS;
  private a kDT;
  private int mErrorCode;
  
  public f(int paramInt1, long paramLong, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    GMTrace.i(11124099514368L, 82881);
    this.kDS = new e(paramLong, paramInt2, paramInt3, paramArrayOfByte);
    this.mErrorCode = paramInt1;
    GMTrace.o(11124099514368L, 82881);
  }
  
  public final boolean a(m paramm, d paramd)
  {
    GMTrace.i(11124233732096L, 82882);
    if (!u.aus().bL(this.kDS.joF))
    {
      w.e("MicroMsg.exdevice.MMInitTaskExcuter", "This device send other cmd before do auth, device id = %d", new Object[] { Long.valueOf(this.kDS.joF) });
      this.kDS.a(-2, "", new byte[0], new byte[0], 0, 0);
      this.kDT = new a(this.kDS, paramd);
      bool = this.kDT.b(paramm);
      w.i("MicroMsg.exdevice.MMInitTaskExcuter", "init start task : %b", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(11124233732096L, 82882);
      return bool;
    }
    if ((-5 == this.mErrorCode) || (-3 == this.mErrorCode) || (-4 == this.mErrorCode))
    {
      w.e("MicroMsg.exdevice.MMInitTaskExcuter", "Error Code = %d, reply errorcode to device and close channel", new Object[] { Integer.valueOf(this.mErrorCode) });
      this.kDS.a(-1, "", new byte[0], new byte[0], 0, 0);
      this.kDT = new a(this.kDS, paramd);
      bool = this.kDT.b(paramm);
      w.i("MicroMsg.exdevice.MMInitTaskExcuter", "init start task : %b", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(11124233732096L, 82882);
      return bool;
    }
    com.tencent.mm.plugin.exdevice.e.f localf = (com.tencent.mm.plugin.exdevice.e.f)this.kDS.atq();
    if (localf == null)
    {
      w.e("MicroMsg.exdevice.MMInitTaskExcuter", "Init Request parse failed, Tell device before stop this task");
      this.kDS.a(-4, "", new byte[0], new byte[0], 0, 0);
      this.kDT = new a(this.kDS, paramd);
      bool = this.kDT.b(paramm);
      w.i("MicroMsg.exdevice.MMInitTaskExcuter", "init start task : %b", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(11124233732096L, 82882);
      return bool;
    }
    byte[] arrayOfByte1 = null;
    if (localf.kBn != null) {
      arrayOfByte1 = localf.kBn.toByteArray();
    }
    byte[] arrayOfByte2 = null;
    if (localf.kBm != null) {
      arrayOfByte2 = localf.kBm.toByteArray();
    }
    ad.atY();
    int i = com.tencent.mm.plugin.exdevice.model.d.atz();
    switch (i)
    {
    default: 
      w.e("MicroMsg.exdevice.MMInitTaskExcuter", "initScene = %d, Cannot start init response", new Object[] { Integer.valueOf(i) });
    }
    this.kDS.a(0, null, arrayOfByte2, arrayOfByte1, i, (int)(com.tencent.mm.plugin.exdevice.j.b.avg() / 1000L));
    this.kDT = new a(this.kDS, paramd);
    boolean bool = this.kDT.b(paramm);
    GMTrace.o(11124233732096L, 82882);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\i\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
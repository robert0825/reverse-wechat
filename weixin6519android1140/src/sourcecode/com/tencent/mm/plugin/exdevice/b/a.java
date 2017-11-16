package com.tencent.mm.plugin.exdevice.b;

import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.i.e;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.plugin.exdevice.model.c;
import com.tencent.mm.plugin.exdevice.service.i.a;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends i.a
{
  private static a kwM;
  
  static
  {
    GMTrace.i(11200469401600L, 83450);
    kwM = null;
    GMTrace.o(11200469401600L, 83450);
  }
  
  private a()
  {
    GMTrace.i(11200066748416L, 83447);
    GMTrace.o(11200066748416L, 83447);
  }
  
  public static a atl()
  {
    GMTrace.i(11200200966144L, 83448);
    if (kwM == null)
    {
      locala = new a();
      kwM = locala;
      GMTrace.o(11200200966144L, 83448);
      return locala;
    }
    a locala = kwM;
    GMTrace.o(11200200966144L, 83448);
    return locala;
  }
  
  public final void a(int paramInt1, long paramLong, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    GMTrace.i(11200335183872L, 83449);
    if (paramArrayOfByte == null)
    {
      i = -1;
      w.i("MicroMsg.exdevice.DeviceRequestManager", "------onDeviceRequest------ errorCode = %d, deviceId = %d, seq = %d, cmdId = %d, datalength = %d", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(paramLong), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(i) });
      if (paramInt1 != 0) {
        break label114;
      }
    }
    String str;
    label114:
    for (int i = 1;; i = 0)
    {
      com.tencent.mm.plugin.exdevice.g.a.k(paramLong, i);
      str = b.al(paramArrayOfByte);
      if (str != null) {
        break label120;
      }
      w.e("MicroMsg.exdevice.DeviceRequestManager", "dataIn is null!!! Just leave without process data");
      GMTrace.o(11200335183872L, 83449);
      return;
      i = paramArrayOfByte.length;
      break;
    }
    label120:
    w.d("MicroMsg.exdevice.DeviceRequestManager", "data dump = %s", new Object[] { str });
    new a(paramInt1, paramLong, paramInt2, paramInt3, paramArrayOfByte).atm();
    GMTrace.o(11200335183872L, 83449);
  }
  
  private static final class a
    implements Runnable
  {
    private long joF;
    private int kwN;
    private int kwO;
    private int kwP;
    private byte[] kwQ;
    
    public a(int paramInt1, long paramLong, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
    {
      GMTrace.i(11199664095232L, 83444);
      this.joF = -1L;
      this.kwN = -1;
      this.kwO = -1;
      this.kwQ = null;
      this.joF = paramLong;
      this.kwN = paramInt2;
      this.kwO = paramInt3;
      this.kwQ = paramArrayOfByte;
      this.kwP = paramInt1;
      GMTrace.o(11199664095232L, 83444);
    }
    
    public final void atm()
    {
      GMTrace.i(11199798312960L, 83445);
      if ((this.joF == -1L) || (this.kwN == -1) || (this.kwO == -1))
      {
        w.e("MicroMsg.RequestProcessThread", "invalid arguments, do nothing");
        GMTrace.o(11199798312960L, 83445);
        return;
      }
      switch (this.kwO)
      {
      default: 
        w.e("MicroMsg.RequestProcessThread", "unknown cmdId = %d, do nothing", new Object[] { Integer.valueOf(this.kwO) });
        GMTrace.o(11199798312960L, 83445);
        return;
      case 10001: 
        localObject = new e(this.kwP, this.joF, this.kwN, this.kwO, this.kwQ);
        u.aut().a((com.tencent.mm.plugin.exdevice.model.ae)localObject);
        GMTrace.o(11199798312960L, 83445);
        return;
      case 10002: 
        localObject = k.ats();
        int i = this.kwP;
        f localf = new f(this.joF, this.kwN, this.kwO, this.kwQ);
        ((k)localObject).mHandler.obtainMessage(1, i, 0, localf).sendToTarget();
        GMTrace.o(11199798312960L, 83445);
        return;
      }
      Object localObject = new com.tencent.mm.plugin.exdevice.i.f(this.kwP, this.joF, this.kwN, this.kwO, this.kwQ);
      u.aut().a((com.tencent.mm.plugin.exdevice.model.ae)localObject);
      GMTrace.o(11199798312960L, 83445);
    }
    
    public final void run()
    {
      GMTrace.i(11199932530688L, 83446);
      atm();
      GMTrace.o(11199932530688L, 83446);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
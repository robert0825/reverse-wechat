package com.tencent.mm.plugin.exdevice.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.a;
import com.tencent.mm.plugin.exdevice.e.f;
import com.tencent.mm.plugin.exdevice.e.g;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.q;
import java.io.IOException;
import java.util.Date;
import java.util.TimeZone;
import java.util.zip.CRC32;

public final class e
  extends d
{
  public e(long paramLong, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    super(paramLong, paramInt1, paramInt2, paramArrayOfByte);
    GMTrace.i(11202080014336L, 83462);
    w.i("MicroMsg.exdevice.ExDeviceCmdInit", "onDeviceRequest deviceId = " + paramLong + " seq = " + paramInt1 + " cmdId = " + paramInt2);
    GMTrace.o(11202080014336L, 83462);
  }
  
  public final void a(int paramInt1, String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
  {
    GMTrace.i(11202348449792L, 83464);
    w.i("MicroMsg.exdevice.ExDeviceCmdInit", "------initResponse------ errorCode = %d, errMsg = %s, filter = %s, challenge = %s, initScene = %d, second = %d", new Object[] { Integer.valueOf(paramInt1), paramString, b.al(paramArrayOfByte1), b.al(paramArrayOfByte2), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    g localg = new g();
    localg.kBB = J(0, "ok");
    paramString = q.zE();
    long l;
    label161:
    label198:
    int i;
    if (!bg.nm(paramString))
    {
      paramString = aa.RP(paramString).toLowerCase();
      w.i("MicroMsg.exdevice.Util", "user md5 : [%s]", new Object[] { paramString });
      if (bg.nm(paramString))
      {
        w.e("MicroMsg.exdevice.Util", "get hash code failed, value is null or nill");
        l = 0L;
        paramString = new int[] { (int)(l >> 32 & 0xFFFFFFFF), (int)(l & 0xFFFFFFFF) };
        localg.kBo = paramString[0];
        localg.kBp = paramString[1];
        if (!bg.bq(paramArrayOfByte2))
        {
          if ((paramArrayOfByte2 != null) && (paramArrayOfByte2.length != 0)) {
            break label536;
          }
          paramInt1 = 0;
          localg.kBq = paramInt1;
        }
        if (!bg.bq(paramArrayOfByte1))
        {
          if ((paramArrayOfByte1[0] & 0x4) != 0) {
            localg.jhn = com.tencent.mm.protocal.d.tJw;
          }
          if ((paramArrayOfByte1[0] & 0x8) != 0) {
            localg.kBv = com.tencent.mm.protocal.d.tJz;
          }
          if ((paramArrayOfByte1[0] & 0x2) != 0) {
            localg.kBu = 2;
          }
          if ((paramArrayOfByte1[0] & 0x10) != 0) {
            localg.kBw = ((int)bg.Pu());
          }
          if ((paramArrayOfByte1[0] & 0x20) != 0)
          {
            paramString = TimeZone.getDefault();
            i = paramString.getRawOffset() / 1000;
            if ((!paramString.useDaylightTime()) || (!paramString.inDaylightTime(new Date(System.currentTimeMillis())))) {
              break label559;
            }
          }
        }
      }
    }
    label536:
    label559:
    for (paramInt1 = 1;; paramInt1 = 0)
    {
      int j = i / 3600 + paramInt1;
      w.i("MicroMsg.exdevice.Util", "getTimeZone, rawSecond = %d, dt = %d, re = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt1), Integer.valueOf(j) });
      localg.kBx = j;
      if ((paramArrayOfByte1[0] & 0x40) != 0) {
        localg.kBy = b.avf();
      }
      if ((paramArrayOfByte1[0] & 0x1) != 0) {
        localg.kBt = q.zG();
      }
      localg.kBr = paramInt2;
      localg.kBs = paramInt3;
      this.kwT = localg;
      this.kwR = 20003;
      GMTrace.o(11202348449792L, 83464);
      return;
      j = 0;
      paramInt1 = 0;
      paramString = paramString.toCharArray();
      if (paramString.length > 0)
      {
        i = 0;
        for (;;)
        {
          j = paramInt1;
          if (i >= paramString.length) {
            break;
          }
          paramInt1 = paramInt1 * 31 + paramString[i];
          i += 1;
        }
      }
      l = j & 0xFFFFFFFF;
      w.i("MicroMsg.exdevice.Util", "get int hashcode value = %d, long hashcode = %d", new Object[] { Integer.valueOf(j), Long.valueOf(l) });
      break;
      paramString = null;
      break label161;
      paramString = new CRC32();
      paramString.update(paramArrayOfByte2);
      paramInt1 = (int)paramString.getValue();
      break label198;
    }
  }
  
  protected final a aj(byte[] paramArrayOfByte)
  {
    GMTrace.i(11202214232064L, 83463);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      w.e("MicroMsg.exdevice.ExDeviceCmdInit", "data is null");
      GMTrace.o(11202214232064L, 83463);
      return null;
    }
    f localf = new f();
    try
    {
      localf.aD(paramArrayOfByte);
      w.i("MicroMsg.exdevice.ExDeviceCmdInit", "------Init Request parse is ok------ ");
      this.kwU = localf;
      GMTrace.o(11202214232064L, 83463);
      return localf;
    }
    catch (IOException paramArrayOfByte)
    {
      w.e("MicroMsg.exdevice.ExDeviceCmdInit", "pase error : " + paramArrayOfByte.getMessage());
      w.printErrStackTrace("MicroMsg.exdevice.ExDeviceCmdInit", paramArrayOfByte, "", new Object[0]);
      GMTrace.o(11202214232064L, 83463);
    }
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
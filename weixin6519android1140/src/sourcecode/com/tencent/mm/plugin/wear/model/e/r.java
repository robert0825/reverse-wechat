package com.tencent.mm.plugin.wear.model.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wear.model.a;
import com.tencent.mm.plugin.wear.model.d;
import com.tencent.mm.sdk.platformtools.w;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public final class r
{
  private static AtomicInteger rAM;
  
  static
  {
    GMTrace.i(9201027907584L, 68553);
    rAM = new AtomicInteger();
    GMTrace.o(9201027907584L, 68553);
  }
  
  public r()
  {
    GMTrace.i(9200759472128L, 68551);
    GMTrace.o(9200759472128L, 68551);
  }
  
  public static void a(int paramInt, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    GMTrace.i(9200893689856L, 68552);
    byte[] arrayOfByte = paramArrayOfByte;
    if (paramBoolean) {
      arrayOfByte = a.bBm().rzt.aS(paramArrayOfByte);
    }
    int i = rAM.incrementAndGet();
    paramArrayOfByte = new ByteArrayOutputStream();
    DataOutputStream localDataOutputStream = new DataOutputStream(paramArrayOfByte);
    try
    {
      localDataOutputStream.writeInt(0);
      localDataOutputStream.writeInt(i);
      localDataOutputStream.writeInt(paramInt);
      if ((arrayOfByte != null) && (arrayOfByte.length > 0))
      {
        localDataOutputStream.writeInt(arrayOfByte.length);
        localDataOutputStream.write(arrayOfByte);
      }
      for (;;)
      {
        a.bBm().rzt.aQ(paramArrayOfByte.toByteArray());
        GMTrace.o(9200893689856L, 68552);
        return;
        localDataOutputStream.writeInt(0);
      }
      return;
    }
    catch (IOException paramArrayOfByte)
    {
      w.printErrStackTrace("MicroMsg.Wear.WearPushServerLogic", paramArrayOfByte, "gen response data error connectType=%d, sessionId=%d, funId=%d", new Object[] { Integer.valueOf(0), Integer.valueOf(i), Integer.valueOf(paramInt) });
      GMTrace.o(9200893689856L, 68552);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\e\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
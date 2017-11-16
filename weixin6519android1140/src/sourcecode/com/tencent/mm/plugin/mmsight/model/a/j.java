package com.tencent.mm.plugin.mmsight.model.a;

import android.app.ActivityManager;
import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.memory.a;
import com.tencent.mm.sdk.platformtools.ab;

public final class j
  extends a<byte[]>
{
  private static int kSB;
  public static final j naP;
  
  static
  {
    GMTrace.i(7374324629504L, 54943);
    naP = new j();
    kSB = 0;
    GMTrace.o(7374324629504L, 54943);
  }
  
  private j()
  {
    GMTrace.i(7372579799040L, 54930);
    GMTrace.o(7372579799040L, 54930);
  }
  
  public final byte[] h(Integer paramInteger)
  {
    try
    {
      GMTrace.i(7372848234496L, 54932);
      byte[] arrayOfByte2 = (byte[])super.b(paramInteger);
      byte[] arrayOfByte1 = arrayOfByte2;
      if (arrayOfByte2 == null) {
        arrayOfByte1 = new byte[paramInteger.intValue()];
      }
      GMTrace.o(7372848234496L, 54932);
      return arrayOfByte1;
    }
    finally {}
  }
  
  public final void x(byte[] paramArrayOfByte)
  {
    try
    {
      GMTrace.i(7372714016768L, 54931);
      super.aw(paramArrayOfByte);
      GMTrace.o(7372714016768L, 54931);
      return;
    }
    finally
    {
      paramArrayOfByte = finally;
      throw paramArrayOfByte;
    }
  }
  
  protected final long yc()
  {
    GMTrace.i(7372982452224L, 54933);
    if (kSB <= 0) {
      kSB = ((ActivityManager)ab.getContext().getSystemService("activity")).getLargeMemoryClass();
    }
    if (kSB >= 512)
    {
      GMTrace.o(7372982452224L, 54933);
      return 41943040L;
    }
    GMTrace.o(7372982452224L, 54933);
    return 20971520L;
  }
  
  protected final long yd()
  {
    GMTrace.i(7373116669952L, 54934);
    GMTrace.o(7373116669952L, 54934);
    return 10485760L;
  }
  
  public final void ye()
  {
    GMTrace.i(7373250887680L, 54935);
    super.ye();
    GMTrace.o(7373250887680L, 54935);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
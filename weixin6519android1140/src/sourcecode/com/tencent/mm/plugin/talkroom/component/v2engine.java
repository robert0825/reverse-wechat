package com.tencent.mm.plugin.talkroom.component;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.b.e;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ab;

public class v2engine
{
  private static e gne;
  
  public v2engine()
  {
    GMTrace.i(5195836686336L, 38712);
    GMTrace.o(5195836686336L, 38712);
  }
  
  public static e AS()
  {
    GMTrace.i(5195970904064L, 38713);
    if (gne == null) {
      gne = new e(ab.getContext());
    }
    e locale = gne;
    GMTrace.o(5195970904064L, 38713);
    return locale;
  }
  
  public native int Close();
  
  public native int GetAudioData(PByteArray paramPByteArray, int paramInt, PInt paramPInt1, PInt paramPInt2);
  
  public native int GetStatis(PByteArray paramPByteArray, String paramString);
  
  public native int IsSilenceFrame();
  
  public native int Open(b paramb, int paramInt1, int paramInt2, int paramInt3, long paramLong, int[] paramArrayOfInt, short[] paramArrayOfShort, int paramInt4);
  
  public native int Send(byte[] paramArrayOfByte, short paramShort);
  
  public native int SetCurrentMicId(int paramInt);
  
  public native int initLive(int paramInt, String paramString);
  
  public native int uninitLive();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\talkroom\component\v2engine.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
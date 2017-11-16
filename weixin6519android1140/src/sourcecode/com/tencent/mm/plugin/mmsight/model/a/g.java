package com.tencent.mm.plugin.mmsight.model.a;

import android.annotation.TargetApi;
import android.media.MediaCodec.BufferInfo;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import java.nio.ByteBuffer;

@TargetApi(16)
public final class g
  extends h
{
  private int nap;
  
  public g(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    GMTrace.i(7367613743104L, 54893);
    this.nap = -1;
    GMTrace.o(7367613743104L, 54893);
  }
  
  protected final void a(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    GMTrace.i(7367882178560L, 54895);
    if ((this.nap >= 0) && (paramByteBuffer != null) && (paramBufferInfo != null) && (!this.naD)) {
      SightVideoJNI.writeAACData(this.nap, paramByteBuffer, paramBufferInfo.size);
    }
    GMTrace.o(7367882178560L, 54895);
  }
  
  protected final boolean aPH()
  {
    GMTrace.i(7368016396288L, 54896);
    GMTrace.o(7368016396288L, 54896);
    return true;
  }
  
  public final int af(int paramInt, String paramString)
  {
    GMTrace.i(7367747960832L, 54894);
    this.nap = paramInt;
    paramInt = super.af(paramInt, paramString);
    GMTrace.o(7367747960832L, 54894);
    return paramInt;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
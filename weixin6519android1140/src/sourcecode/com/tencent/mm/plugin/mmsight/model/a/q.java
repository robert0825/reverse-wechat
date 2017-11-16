package com.tencent.mm.plugin.mmsight.model.a;

import android.annotation.TargetApi;
import android.media.MediaCodec.BufferInfo;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.nio.ByteBuffer;

@TargetApi(16)
public final class q
  extends r
{
  protected int nap;
  
  public q(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramBoolean);
    GMTrace.i(7349091696640L, 54755);
    this.nap = -1;
    GMTrace.o(7349091696640L, 54755);
  }
  
  protected final void a(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    GMTrace.i(7349360132096L, 54757);
    if ((this.nap >= 0) && (paramByteBuffer != null) && (paramBufferInfo != null))
    {
      long l = bg.Pw();
      SightVideoJNI.writeH264Data(this.nap, paramByteBuffer, paramBufferInfo.size);
      w.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "writeH264Data used %sms, size: %s", new Object[] { Long.valueOf(bg.aI(l)), Integer.valueOf(paramBufferInfo.size) });
    }
    GMTrace.o(7349360132096L, 54757);
  }
  
  public final void clear()
  {
    GMTrace.i(18672504537088L, 139121);
    super.clear();
    SightVideoJNI.releaseBigSightDataBuffer(this.nap);
    GMTrace.o(18672504537088L, 139121);
  }
  
  public final int ct(int paramInt1, int paramInt2)
  {
    GMTrace.i(7349225914368L, 54756);
    this.nap = paramInt1;
    paramInt1 = super.ct(paramInt1, paramInt2);
    GMTrace.o(7349225914368L, 54756);
    return paramInt1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\a\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
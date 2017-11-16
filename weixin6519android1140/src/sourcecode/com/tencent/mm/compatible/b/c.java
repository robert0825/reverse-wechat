package com.tencent.mm.compatible.b;

import android.media.AudioTrack;
import com.tencent.gmtrace.GMTrace;

public final class c
  extends AudioTrack
{
  public c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    super(paramInt1, paramInt2, paramInt3, 2, paramInt5, 1);
    GMTrace.i(18796521717760L, 140045);
    e.ej(hashCode());
    GMTrace.o(18796521717760L, 140045);
  }
  
  public final void release()
  {
    GMTrace.i(18796655935488L, 140046);
    super.release();
    e.ek(hashCode());
    GMTrace.o(18796655935488L, 140046);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
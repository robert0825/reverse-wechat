package com.tencent.pb.common.b;

import java.lang.ref.WeakReference;

public final class i
  implements c
{
  private WeakReference<c> xKY;
  
  public i(c paramc)
  {
    this.xKY = new WeakReference(paramc);
  }
  
  public final void o(int paramInt, byte[] paramArrayOfByte)
  {
    if ((this.xKY != null) && (this.xKY.get() != null))
    {
      ((c)this.xKY.get()).o(paramInt, paramArrayOfByte);
      return;
    }
    com.tencent.pb.common.c.c.k("OnRespForLongAIDLImpl fail", new Object[] { "callback is null, errCode=" + paramInt });
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\pb\common\b\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
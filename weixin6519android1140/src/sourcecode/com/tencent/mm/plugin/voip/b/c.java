package com.tencent.mm.plugin.voip.b;

import android.annotation.SuppressLint;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;

public final class c
{
  public int mState;
  public Map<Integer, Map<Integer, Integer>> qNO;
  
  public c(int paramInt)
  {
    GMTrace.i(5375151570944L, 40048);
    this.mState = paramInt;
    GMTrace.o(5375151570944L, 40048);
  }
  
  @SuppressLint({"UseSparseArrays"})
  public final void Q(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(5375285788672L, 40049);
    if (this.qNO == null) {
      this.qNO = new HashMap();
    }
    Object localObject;
    if (!this.qNO.containsKey(Integer.valueOf(paramInt1)))
    {
      localObject = new HashMap();
      this.qNO.put(Integer.valueOf(paramInt1), localObject);
    }
    for (;;)
    {
      ((Map)localObject).put(Integer.valueOf(paramInt2), Integer.valueOf(paramInt3));
      GMTrace.o(5375285788672L, 40049);
      return;
      localObject = (Map)this.qNO.get(Integer.valueOf(paramInt1));
    }
  }
  
  public final boolean wE(int paramInt)
  {
    GMTrace.i(5375420006400L, 40050);
    if ((this.qNO == null) || (!this.qNO.containsKey(Integer.valueOf(this.mState))))
    {
      w.e("MicroMsg.Voip.VoipStateMachine", "no rule for state: %s", new Object[] { b.wy(this.mState) });
      GMTrace.o(5375420006400L, 40050);
      return false;
    }
    if (!((Map)this.qNO.get(Integer.valueOf(this.mState))).containsKey(Integer.valueOf(paramInt)))
    {
      w.e("MicroMsg.Voip.VoipStateMachine", "state: %s don't contain rule for action: %s", new Object[] { b.wy(this.mState), b.wy(paramInt) });
      GMTrace.o(5375420006400L, 40050);
      return false;
    }
    GMTrace.o(5375420006400L, 40050);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
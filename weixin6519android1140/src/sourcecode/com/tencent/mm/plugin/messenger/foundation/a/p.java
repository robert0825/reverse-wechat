package com.tencent.mm.plugin.messenger.foundation.a;

import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.nk;
import junit.framework.Assert;

public abstract interface p
{
  public abstract void a(nk paramnk, byte[] paramArrayOfByte, boolean paramBoolean, r paramr);
  
  public static final class a
  {
    private static SparseArray<p> mUQ;
    
    static
    {
      GMTrace.i(13386070884352L, 99734);
      mUQ = new SparseArray();
      GMTrace.o(13386070884352L, 99734);
    }
    
    public static void a(int paramInt, p paramp)
    {
      GMTrace.i(13385802448896L, 99732);
      if (mUQ.get(paramInt) == null) {}
      for (boolean bool = true;; bool = false)
      {
        Assert.assertTrue(bool);
        mUQ.put(paramInt, paramp);
        GMTrace.o(13385802448896L, 99732);
        return;
      }
    }
    
    public static p qp(int paramInt)
    {
      GMTrace.i(13385936666624L, 99733);
      p localp = (p)mUQ.get(paramInt);
      GMTrace.o(13385936666624L, 99733);
      return localp;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\messenger\foundation\a\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
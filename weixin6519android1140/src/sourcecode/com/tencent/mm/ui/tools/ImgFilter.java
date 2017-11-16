package com.tencent.mm.ui.tools;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pointers.PIntArray;

public final class ImgFilter
{
  private ImgFilter()
  {
    GMTrace.i(1940385693696L, 14457);
    GMTrace.o(1940385693696L, 14457);
  }
  
  public static native boolean FilterInt(int paramInt1, int[] paramArrayOfInt, int[][] paramArrayOfInt1, int paramInt2, int paramInt3, int paramInt4, PIntArray paramPIntArray);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\tools\ImgFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
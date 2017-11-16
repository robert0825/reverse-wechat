package com.tencent.mm.plugin.gif;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class e
{
  public final int[] mfm;
  
  public e(String paramString)
  {
    GMTrace.i(12893626040320L, 96065);
    this.mfm = new int[6];
    try
    {
      MMGIFJNI.recycle(MMGIFJNI.openByFilePath(paramString, this.mfm));
      w.i("MMGIFInfo", "width:%d height:%d", new Object[] { Integer.valueOf(this.mfm[0]), Integer.valueOf(this.mfm[1]) });
      GMTrace.o(12893626040320L, 96065);
      return;
    }
    catch (MMGIFException paramString)
    {
      w.e("MMGIFInfo", bg.f(paramString));
      GMTrace.o(12893626040320L, 96065);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\gif\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.clean.c;

import android.os.StatFs;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.plugin.i.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;
import java.util.HashMap;
import java.util.HashSet;

public final class j
  implements aq
{
  private static j jTw;
  public long jSJ;
  public long jSK;
  public long jSL;
  public HashSet<String> jTk;
  public HashMap<String, Long> jTv;
  
  private j()
  {
    GMTrace.i(7049786163200L, 52525);
    GMTrace.o(7049786163200L, 52525);
  }
  
  public static long anU()
  {
    GMTrace.i(20561216405504L, 153193);
    long l;
    try
    {
      StatFs localStatFs = new StatFs(e.ghx);
      l = localStatFs.getBlockCount();
      int i = localStatFs.getBlockSize();
      l = i * l;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        l = 0L;
      }
      GMTrace.o(20561216405504L, 153193);
    }
    if (l <= 0L)
    {
      GMTrace.o(20561216405504L, 153193);
      return 1L;
    }
    return l;
  }
  
  public static long anV()
  {
    GMTrace.i(20561350623232L, 153194);
    long l;
    try
    {
      StatFs localStatFs = new StatFs(e.ghx);
      l = localStatFs.getAvailableBlocks();
      int i = localStatFs.getBlockSize();
      l = i * l;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        l = 0L;
      }
      GMTrace.o(20561350623232L, 153194);
    }
    if (l <= 0L)
    {
      GMTrace.o(20561350623232L, 153194);
      return 1L;
    }
    return l;
  }
  
  public static j aoj()
  {
    GMTrace.i(20561082187776L, 153192);
    if (jTw == null) {
      jTw = new j();
    }
    j localj = jTw;
    GMTrace.o(20561082187776L, 153192);
    return localj;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(7050188816384L, 52528);
    w.i("MicroMsg.SubCoreClean", "summerclean onAccountPostReset updated[%b]", new Object[] { Boolean.valueOf(paramBoolean) });
    b.aiA().onAccountInitialized(null);
    GMTrace.o(7050188816384L, 52528);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(7050323034112L, 52529);
    w.i("MicroMsg.SubCoreClean", "summerclean onSdcardMount mounted[%b]", new Object[] { Boolean.valueOf(paramBoolean) });
    GMTrace.o(7050323034112L, 52529);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(7050054598656L, 52527);
    d.aod();
    GMTrace.o(7050054598656L, 52527);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(7050457251840L, 52530);
    w.i("MicroMsg.SubCoreClean", "summerclean onAccountRelease");
    this.jSJ = 0L;
    this.jSK = 0L;
    this.jSL = 0L;
    if (this.jTv != null) {
      this.jTv.clear();
    }
    if (this.jTk != null) {
      this.jTk.clear();
    }
    d.aod();
    b.aiA().onAccountRelease();
    GMTrace.o(7050457251840L, 52530);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(7049920380928L, 52526);
    GMTrace.o(7049920380928L, 52526);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\clean\c\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.voip.video;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.sdk.platformtools.ae;
import java.util.ArrayList;

public final class j
{
  public ArrayList<a> jlo;
  public int mPreviewHeight;
  public int mPreviewWidth;
  public v2protocal qHR;
  public boolean qQf;
  public int qQg;
  
  public j()
  {
    GMTrace.i(5384412594176L, 40117);
    this.qQf = false;
    this.qQg = 0;
    this.jlo = new ArrayList();
    this.qHR = new v2protocal(new ae(Looper.myLooper()));
    GMTrace.o(5384412594176L, 40117);
  }
  
  public static abstract interface a
  {
    public abstract void a(int[] paramArrayOfInt, boolean paramBoolean, int paramInt);
  }
  
  private final class b
  {
    public int qQh;
    public int qQi;
    public int qQj;
    public int qQk;
    
    public b()
    {
      GMTrace.i(5385620553728L, 40126);
      GMTrace.o(5385620553728L, 40126);
    }
    
    public final String toString()
    {
      GMTrace.i(5385754771456L, 40127);
      String str = String.format("topLeftX:%d, topLeftY:%d, rightBottomX:%d, rightBottomY:%d", new Object[] { Integer.valueOf(this.qQh), Integer.valueOf(this.qQi), Integer.valueOf(this.qQj), Integer.valueOf(this.qQk) });
      GMTrace.o(5385754771456L, 40127);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\video\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
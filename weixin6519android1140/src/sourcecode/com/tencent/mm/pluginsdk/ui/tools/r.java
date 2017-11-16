package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.List;

public final class r
{
  private static List<a> tIj;
  
  static
  {
    GMTrace.i(1062467534848L, 7916);
    tIj = new ArrayList();
    GMTrace.o(1062467534848L, 7916);
  }
  
  public static void a(a parama)
  {
    GMTrace.i(1062064881664L, 7913);
    if (parama != null)
    {
      w.d("MicroMsg.WebViewPluginCenter", "add, plugin name = " + parama.getName());
      if (!tIj.contains(parama)) {
        tIj.add(parama);
      }
    }
    GMTrace.o(1062064881664L, 7913);
  }
  
  public static List<a> bNw()
  {
    GMTrace.i(1062199099392L, 7914);
    List localList = tIj;
    GMTrace.o(1062199099392L, 7914);
    return localList;
  }
  
  public static void clear()
  {
    GMTrace.i(1062333317120L, 7915);
    w.d("MicroMsg.WebViewPluginCenter", "clear");
    tIj.clear();
    GMTrace.o(1062333317120L, 7915);
  }
  
  public static abstract interface a
  {
    public abstract void bEF();
    
    public abstract void bEG();
    
    public abstract void du(Context paramContext);
    
    public abstract String getName();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\tools\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
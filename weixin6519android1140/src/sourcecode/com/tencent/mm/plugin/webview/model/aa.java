package com.tencent.mm.plugin.webview.model;

import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.az.i;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class aa
{
  private static final Set<String> rEy;
  
  static
  {
    GMTrace.i(12016647405568L, 89531);
    Object localObject1 = new HashSet();
    rEy = (Set)localObject1;
    ((Set)localObject1).add("file:///android_asset/");
    Object localObject2 = e.ghw;
    localObject1 = localObject2;
    if (!bg.nm((String)localObject2)) {
      localObject1 = e.ghw.replace("/data/user/0", "/data/data");
    }
    localObject2 = new File(i.Ko());
    rEy.add("file://" + ((File)localObject2).getAbsolutePath());
    File localFile1 = new File(e.ghz, "fts/res");
    rEy.add("file://" + localFile1.getAbsolutePath());
    File localFile2 = new File((String)localObject1, "wenote/res");
    rEy.add("file://" + localFile2.getAbsolutePath());
    localFile2 = new File(e.ghz, "wenote/res");
    rEy.add("file://" + localFile2.getAbsolutePath());
    w.i("MicroMsg.URLFilter", "add webview UI FILE URL WHITE LIST data: %s sdcard:%s", new Object[] { ((File)localObject2).getAbsolutePath(), localFile1.getAbsolutePath() });
    localObject1 = new File((String)localObject1, "emoji/res");
    rEy.add("file://" + ((File)localObject1).getAbsolutePath());
    localObject2 = new File(e.ghz, "emoji/res");
    rEy.add("file://" + ((File)localObject2).getAbsolutePath());
    w.i("MicroMsg.URLFilter", "add webview UI FILE URL WHITE LIST data: %s sdcard:%s", new Object[] { ((File)localObject1).getAbsolutePath(), ((File)localObject2).getAbsolutePath() });
    localObject1 = rEy.iterator();
    while (((Iterator)localObject1).hasNext()) {
      w.i("MicroMsg.URLFilter", "WebViewUI white list path : %s", new Object[] { (String)((Iterator)localObject1).next() });
    }
    GMTrace.o(12016647405568L, 89531);
  }
  
  public static boolean Lf(String paramString)
  {
    GMTrace.i(12016513187840L, 89530);
    if (r.hkg)
    {
      w.w("MicroMsg.URLFilter", "skipLoadUrlCheck");
      GMTrace.o(12016513187840L, 89530);
      return true;
    }
    if (bg.nm(paramString))
    {
      GMTrace.o(12016513187840L, 89530);
      return true;
    }
    paramString = paramString.toLowerCase();
    if (paramString.startsWith("about:blank"))
    {
      GMTrace.o(12016513187840L, 89530);
      return false;
    }
    if (!paramString.startsWith("file://"))
    {
      paramString = Uri.parse(paramString);
      if (bg.nm(paramString.getHost()))
      {
        GMTrace.o(12016513187840L, 89530);
        return true;
      }
      if (!paramString.getHost().contains(s.bNx()))
      {
        GMTrace.o(12016513187840L, 89530);
        return true;
      }
      GMTrace.o(12016513187840L, 89530);
      return false;
    }
    Iterator localIterator = rEy.iterator();
    while (localIterator.hasNext()) {
      if (paramString.startsWith((String)localIterator.next()))
      {
        GMTrace.o(12016513187840L, 89530);
        return true;
      }
    }
    GMTrace.o(12016513187840L, 89530);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\model\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
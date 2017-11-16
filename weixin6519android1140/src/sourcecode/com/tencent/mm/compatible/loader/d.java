package com.tencent.mm.compatible.loader;

import android.content.Context;
import android.content.res.AssetManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.loader.stub.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.q;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class d
{
  private static Map<String, String> fRC;
  
  public static String u(Context paramContext, String paramString)
  {
    GMTrace.i(13791945293824L, 102758);
    l = bg.Pv();
    if (fRC == null) {}
    try
    {
      str1 = bg.convertStreamToString(paramContext.getAssets().open("preload/libraries.ini"));
      localObject2 = q.RK(str1);
      w.v("MicroMsg.PluginClassLoader", "libraries.ini content\n%s", new Object[] { str1 });
      if ((localObject2 != null) && (((Map)localObject2).size() > 0)) {
        break label137;
      }
      w.e("MicroMsg.PluginClassLoader", "parse libraries.ini failed");
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str1;
        w.e("MicroMsg.PluginClassLoader", "load preload libraries failed");
        w.printErrStackTrace("MicroMsg.PluginClassLoader", localException, "", new Object[0]);
      }
      fRC = new HashMap(((Map)localObject2).size());
      Object localObject1 = ((Map)localObject2).entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        w.d("MicroMsg.PluginClassLoader", "preload file, plugin=%s, md5=%s", new Object[] { ((Map.Entry)localObject2).getKey(), ((Map.Entry)localObject2).getValue() });
        fRC.put(((Map.Entry)localObject2).getKey(), ((Map.Entry)localObject2).getValue());
      }
      localObject1 = (String)localObject1 + "/" + paramString;
      Object localObject2 = (String)fRC.get(paramString);
      if (localObject2 != null) {
        break label309;
      }
      w.w("MicroMsg.PluginClassLoader", "extractVoipDex not in preloadfiles");
      GMTrace.o(13791945293824L, 102758);
      return null;
      File localFile = new File((String)localObject1);
      if (!localFile.exists()) {
        break label408;
      }
      String str2 = g.h(localFile);
      if ((str2 == null) || (!str2.equalsIgnoreCase((String)localObject2))) {
        break label387;
      }
      w.d("MicroMsg.PluginClassLoader", "extractVoipDex: targetFilePath:[%s] time:%d", new Object[] { localFile, Long.valueOf(bg.aH(l)) });
      GMTrace.o(13791945293824L, 102758);
      return (String)localObject1;
      w.e("MicroMsg.PluginClassLoader", "extractVoipDex target file exists, but md5 check failed, target=%s assets=%s", new Object[] { str2, localObject2 });
      b.deleteFile((String)localObject1);
      if (j.z(paramContext, "preload/" + paramString, (String)localObject1)) {
        break label456;
      }
      w.f("MicroMsg.PluginClassLoader", "extractVoipDex  copyAssets failed");
      GMTrace.o(13791945293824L, 102758);
      return null;
      w.i("MicroMsg.PluginClassLoader", "extractVoipDex time:%d so:%s md5:%s ", new Object[] { Long.valueOf(bg.aH(l)), paramString, localObject2 });
      GMTrace.o(13791945293824L, 102758);
      return (String)localObject1;
    }
    str1 = paramContext.getDir("lib", 0).getAbsolutePath();
    if (fRC == null)
    {
      w.e("MicroMsg.PluginClassLoader", "extractVoipDex preload so files loaded failed");
      GMTrace.o(13791945293824L, 102758);
      return null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\loader\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
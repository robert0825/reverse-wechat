package com.tencent.mm.plugin.downloader;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.kernel.e.f;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.downloader.model.f;
import com.tencent.mm.plugin.messenger.foundation.a.n;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PluginDownloader
  extends com.tencent.mm.kernel.b.d
  implements com.tencent.mm.kernel.api.bucket.a, com.tencent.mm.kernel.api.c, com.tencent.mm.plugin.downloader.b.b
{
  public PluginDownloader()
  {
    GMTrace.i(18589155328000L, 138500);
    GMTrace.o(18589155328000L, 138500);
  }
  
  public HashMap<Integer, g.d> collectDatabaseFactory()
  {
    GMTrace.i(18589826416640L, 138505);
    w.d("MicroMsg.PluginDownloader", "collectDatabaseFactory");
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf("FILEDOWNLOAD_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(18587410497536L, 138487);
        String[] arrayOfString = com.tencent.mm.plugin.downloader.e.b.fTX;
        GMTrace.o(18587410497536L, 138487);
        return arrayOfString;
      }
    });
    GMTrace.o(18589826416640L, 138505);
    return localHashMap;
  }
  
  public void configure(com.tencent.mm.kernel.b.e parame)
  {
    GMTrace.i(18589557981184L, 138503);
    GMTrace.o(18589557981184L, 138503);
  }
  
  public void dependency()
  {
    GMTrace.i(18589423763456L, 138502);
    dependsOn(n.class);
    GMTrace.o(18589423763456L, 138502);
  }
  
  public void execute(com.tencent.mm.kernel.b.e parame)
  {
    GMTrace.i(18589692198912L, 138504);
    w.d("MicroMsg.PluginDownloader", "execute");
    h.a(com.tencent.mm.plugin.downloader.b.a.class, new a());
    GMTrace.o(18589692198912L, 138504);
  }
  
  public void installed()
  {
    GMTrace.i(18589289545728L, 138501);
    alias(com.tencent.mm.plugin.downloader.b.b.class);
    GMTrace.o(18589289545728L, 138501);
  }
  
  public void onAccountInitialized(e.f paramf)
  {
    GMTrace.i(20376264376320L, 151815);
    new Thread(new Runnable()
    {
      public final void run()
      {
        Object localObject1 = null;
        GMTrace.i(20376130158592L, 151814);
        Object localObject2 = com.tencent.mm.plugin.downloader.model.e.yQ();
        if (localObject2 == null) {}
        while (!bg.cc((List)localObject1))
        {
          localObject1 = ((LinkedList)localObject1).iterator();
          Object localObject3;
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (com.tencent.mm.plugin.downloader.e.a)((Iterator)localObject1).next();
            w.i("MicroMsg.PluginDownloader", "download fail, appId: " + ((com.tencent.mm.plugin.downloader.e.a)localObject2).field_appId);
            ((com.tencent.mm.plugin.downloader.e.a)localObject2).field_status = 4;
            ((com.tencent.mm.plugin.downloader.e.a)localObject2).field_errCode = com.tencent.mm.plugin.downloader.model.d.keT;
            com.tencent.mm.plugin.downloader.model.e.c((com.tencent.mm.plugin.downloader.e.a)localObject2);
            localObject3 = f.apJ();
            long l = ((com.tencent.mm.plugin.downloader.e.a)localObject2).field_downloadId;
            int i = ((com.tencent.mm.plugin.downloader.e.a)localObject2).field_errCode;
            if (((f)localObject3).kfj != null) {
              ((f)localObject3).kfj.b(l, i, false);
            }
          }
          w.i("MicroMsg.FileDownloadInfoStorage", "getRunningDownloadInfos: select * from FileDownloadInfo where status=1");
          localObject2 = ((com.tencent.mm.plugin.downloader.e.b)localObject2).rawQuery("select * from FileDownloadInfo where status=1", new String[0]);
          if (localObject2 == null)
          {
            w.i("MicroMsg.FileDownloadInfoStorage", "cursor is null");
          }
          else
          {
            localObject1 = new LinkedList();
            while (((Cursor)localObject2).moveToNext())
            {
              localObject3 = new com.tencent.mm.plugin.downloader.e.a();
              ((com.tencent.mm.plugin.downloader.e.a)localObject3).b((Cursor)localObject2);
              ((LinkedList)localObject1).add(localObject3);
            }
            ((Cursor)localObject2).close();
          }
        }
        GMTrace.o(20376130158592L, 151814);
      }
    }).start();
    GMTrace.o(20376264376320L, 151815);
  }
  
  public void onAccountRelease()
  {
    GMTrace.i(20376398594048L, 151816);
    GMTrace.o(20376398594048L, 151816);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\downloader\PluginDownloader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
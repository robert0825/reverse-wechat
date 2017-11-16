package com.tencent.mm.plugin.webview.wepkg.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.tn;
import com.tencent.mm.plugin.webview.wepkg.downloader.WePkgDownloader.IWepkgUpdateCallback.RetCode;
import com.tencent.mm.plugin.webview.wepkg.ipc.WepkgMainProcessService;
import com.tencent.mm.plugin.webview.wepkg.ipc.WepkgMainProcessTask;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.List;

public class i
{
  private static volatile i rYR;
  
  static
  {
    GMTrace.i(15191567761408L, 113186);
    rYR = null;
    GMTrace.o(15191567761408L, 113186);
  }
  
  public i()
  {
    GMTrace.i(15190494019584L, 113178);
    GMTrace.o(15190494019584L, 113178);
  }
  
  public static i bGp()
  {
    GMTrace.i(15190628237312L, 113179);
    if (rYR == null) {}
    try
    {
      if (rYR == null) {
        rYR = new i();
      }
      i locali = rYR;
      GMTrace.o(15190628237312L, 113179);
      return locali;
    }
    finally {}
  }
  
  public static void k(boolean paramBoolean, String paramString)
  {
    GMTrace.i(15191030890496L, 113182);
    if (paramBoolean)
    {
      localObject = new tn();
      ((tn)localObject).eZp.eCx = 0;
      com.tencent.mm.sdk.b.a.vgX.m((b)localObject);
    }
    Object localObject = new WepkgCrossProcessTask();
    ((WepkgCrossProcessTask)localObject).nJ = 2006;
    ((WepkgCrossProcessTask)localObject).rYm.rYG = paramString;
    if (ab.bPY()) {
      ((WepkgCrossProcessTask)localObject).RY();
    }
    for (;;)
    {
      g.MV(paramString);
      GMTrace.o(15191030890496L, 113182);
      return;
      WepkgMainProcessService.b((WepkgMainProcessTask)localObject);
    }
  }
  
  public final void a(final String paramString, final List<WepkgPreloadFile> paramList, final boolean paramBoolean)
  {
    GMTrace.i(15190896672768L, 113181);
    for (;;)
    {
      try
      {
        if (!bg.cc(paramList)) {
          break label280;
        }
        w.i("MicroMsg.Wepkg.WepkgUpdater", "loopDownload WepkgPreloadFile is empty");
        if (bg.nm(paramString))
        {
          k(paramBoolean, paramString);
          GMTrace.o(15190896672768L, 113181);
          return;
        }
        paramList = h.Na(paramString);
        if (!bg.cc(paramList)) {
          break;
        }
        paramList = new WepkgCrossProcessTask();
        paramList.nJ = 3006;
        paramList.rYm.rYG = paramString;
        paramList.rYm.rZd = true;
        if (ab.bPY())
        {
          paramList.RY();
          paramList = h.MY(paramString);
          if ((paramList != null) && (paramList.hcs != 0L))
          {
            com.tencent.mm.plugin.webview.wepkg.utils.a.b("downloadCompleteTime", "", paramList.rYG, paramList.version, -1L, System.currentTimeMillis() - paramList.hcs * 1000L, null);
            paramList = new WepkgCrossProcessTask();
            paramList.nJ = 3007;
            paramList.rYm.rYG = paramString;
            if (!ab.bPY()) {
              break label235;
            }
            paramList.RY();
          }
          k(paramBoolean, paramString);
          w.i("MicroMsg.Wepkg.WepkgUpdater", "WepkgPreloadFile downloadComplete:true");
          GMTrace.o(15190896672768L, 113181);
          return;
        }
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.Wepkg.WepkgUpdater", "loopDownload err:%s", new Object[] { paramString.getMessage() });
        GMTrace.o(15190896672768L, 113181);
        return;
      }
      WepkgMainProcessService.b(paramList);
      continue;
      label235:
      WepkgMainProcessService.b(paramList);
    }
    w.i("MicroMsg.Wepkg.WepkgUpdater", "WepkgPreloadFile downloadComplete:false list.size:%s", new Object[] { Integer.valueOf(paramList.size()) });
    k(paramBoolean, paramString);
    GMTrace.o(15190896672768L, 113181);
    return;
    label280:
    WepkgPreloadFile localWepkgPreloadFile = (WepkgPreloadFile)paramList.remove(0);
    if (localWepkgPreloadFile != null)
    {
      w.i("MicroMsg.Wepkg.WepkgUpdater", "download preload files pkgid:%s, version:%s, rid:%s", new Object[] { localWepkgPreloadFile.rYG, localWepkgPreloadFile.version, localWepkgPreloadFile.rYr });
      paramString = new a()
      {
        public final void a(BaseWepkgProcessTask paramAnonymousBaseWepkgProcessTask)
        {
          GMTrace.i(15185259528192L, 113139);
          if (((this.yA instanceof WepkgPreloadFile)) && ((paramAnonymousBaseWepkgProcessTask instanceof WepkgDownloadProcessTask)))
          {
            Object localObject2 = (WepkgDownloadProcessTask)paramAnonymousBaseWepkgProcessTask;
            Object localObject1 = (WepkgPreloadFile)this.yA;
            if ((((WepkgDownloadProcessTask)localObject2).rYu == WePkgDownloader.IWepkgUpdateCallback.RetCode.rXr) && (!bg.nm(((WepkgDownloadProcessTask)localObject2).hKI)))
            {
              paramAnonymousBaseWepkgProcessTask = ((WepkgPreloadFile)localObject1).rYG;
              localObject1 = ((WepkgPreloadFile)localObject1).rYr;
              localObject2 = ((WepkgDownloadProcessTask)localObject2).hKI;
              WepkgCrossProcessTask localWepkgCrossProcessTask = new WepkgCrossProcessTask();
              localWepkgCrossProcessTask.nJ = 4002;
              localWepkgCrossProcessTask.rYo.rYG = paramAnonymousBaseWepkgProcessTask;
              localWepkgCrossProcessTask.rYo.rYr = ((String)localObject1);
              localWepkgCrossProcessTask.rYo.filePath = ((String)localObject2);
              localWepkgCrossProcessTask.rYo.rYH = true;
              if (ab.bPY()) {
                localWepkgCrossProcessTask.RY();
              }
              for (;;)
              {
                boolean bool = localWepkgCrossProcessTask.eAO;
                i.this.a(paramString, paramList, paramBoolean);
                GMTrace.o(15185259528192L, 113139);
                return;
                WepkgMainProcessService.b(localWepkgCrossProcessTask);
              }
            }
            w.i("MicroMsg.Wepkg.WepkgUpdater", "download, errCode:%s,  to loop", new Object[] { ((WepkgDownloadProcessTask)localObject2).rYu });
            i.this.a(paramString, paramList, paramBoolean);
            GMTrace.o(15185259528192L, 113139);
            return;
          }
          w.i("MicroMsg.Wepkg.WepkgUpdater", "object instanceof  WepkgPreloadFile is false");
          i.this.a(paramString, paramList, paramBoolean);
          GMTrace.o(15185259528192L, 113139);
        }
      };
      paramString.yA = localWepkgPreloadFile;
      h.a(2, localWepkgPreloadFile.rYG, localWepkgPreloadFile.rYr, localWepkgPreloadFile.downloadUrl, localWepkgPreloadFile.size, localWepkgPreloadFile.version, localWepkgPreloadFile.eDW, localWepkgPreloadFile.rYt, paramString);
      GMTrace.o(15190896672768L, 113181);
      return;
    }
    w.i("MicroMsg.Wepkg.WepkgUpdater", "download item is null, to loop");
    a(paramString, paramList, paramBoolean);
    GMTrace.o(15190896672768L, 113181);
  }
  
  public final void aL(final String paramString, final boolean paramBoolean)
  {
    GMTrace.i(15190762455040L, 113180);
    if (bg.nm(paramString))
    {
      k(paramBoolean, paramString);
      GMTrace.o(15190762455040L, 113180);
      return;
    }
    final a local1 = new a()
    {
      public final void a(BaseWepkgProcessTask paramAnonymousBaseWepkgProcessTask)
      {
        GMTrace.i(15179219730432L, 113094);
        if ((this.yA instanceof String))
        {
          paramAnonymousBaseWepkgProcessTask = i.this;
          String str = (String)this.yA;
          boolean bool = paramBoolean;
          if (bg.nm(str))
          {
            i.k(bool, str);
            GMTrace.o(15179219730432L, 113094);
            return;
          }
          w.i("MicroMsg.Wepkg.WepkgUpdater", "update preload files. pkgid:%s, isAutoUpdate:%s", new Object[] { str, Boolean.valueOf(bool) });
          List localList = h.Na(str);
          if (!bg.cc(localList)) {
            w.i("MicroMsg.Wepkg.WepkgUpdater", "pkgid:%s, %s preload files need to download", new Object[] { str, Integer.valueOf(localList.size()) });
          }
          paramAnonymousBaseWepkgProcessTask.a(str, localList, bool);
          GMTrace.o(15179219730432L, 113094);
          return;
        }
        i.k(paramBoolean, paramString);
        GMTrace.o(15179219730432L, 113094);
      }
    };
    local1.yA = paramString;
    w.i("MicroMsg.Wepkg.WepkgUpdater", "start update wepkg. pkgid:%s, isAutoUpdate:%s", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
    if (bg.nm(paramString))
    {
      k(paramBoolean, paramString);
      GMTrace.o(15190762455040L, 113180);
      return;
    }
    w.i("MicroMsg.Wepkg.WepkgUpdater", "update big package. pkgid:%s, isAutoUpdate:%s", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
    WepkgVersion localWepkgVersion = h.MY(paramString);
    if (localWepkgVersion == null)
    {
      k(paramBoolean, paramString);
      GMTrace.o(15190762455040L, 113180);
      return;
    }
    if (!localWepkgVersion.rZc)
    {
      h.a(1, localWepkgVersion.rYG, "", localWepkgVersion.downloadUrl, localWepkgVersion.rZa, localWepkgVersion.version, localWepkgVersion.eDW, localWepkgVersion.rYt, new a()
      {
        public final void a(BaseWepkgProcessTask paramAnonymousBaseWepkgProcessTask)
        {
          GMTrace.i(15181769867264L, 113113);
          if ((paramAnonymousBaseWepkgProcessTask instanceof WepkgDownloadProcessTask))
          {
            paramAnonymousBaseWepkgProcessTask = (WepkgDownloadProcessTask)paramAnonymousBaseWepkgProcessTask;
            if ((paramAnonymousBaseWepkgProcessTask.rYu == WePkgDownloader.IWepkgUpdateCallback.RetCode.rXr) && (!bg.nm(paramAnonymousBaseWepkgProcessTask.eZq)) && (!bg.nm(paramAnonymousBaseWepkgProcessTask.hKI)))
            {
              h.a(paramAnonymousBaseWepkgProcessTask.eZq, paramAnonymousBaseWepkgProcessTask.hKI, true, local1);
              GMTrace.o(15181769867264L, 113113);
              return;
            }
            i.k(paramBoolean, paramString);
            GMTrace.o(15181769867264L, 113113);
            return;
          }
          i.k(paramBoolean, paramString);
          GMTrace.o(15181769867264L, 113113);
        }
      });
      GMTrace.o(15190762455040L, 113180);
      return;
    }
    local1.a(null);
    GMTrace.o(15190762455040L, 113180);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\wepkg\model\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
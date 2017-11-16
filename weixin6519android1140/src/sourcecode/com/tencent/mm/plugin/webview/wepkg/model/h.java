package com.tencent.mm.plugin.webview.wepkg.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webview.wepkg.downloader.WePkgDownloader;
import com.tencent.mm.plugin.webview.wepkg.downloader.WePkgDownloader.IWepkgUpdateCallback;
import com.tencent.mm.plugin.webview.wepkg.downloader.WePkgDownloader.IWepkgUpdateCallback.RetCode;
import com.tencent.mm.plugin.webview.wepkg.ipc.WepkgMainProcessService;
import com.tencent.mm.plugin.webview.wepkg.utils.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.List;

public final class h
{
  public static WepkgVersion MY(String paramString)
  {
    GMTrace.i(15192507285504L, 113193);
    WepkgCrossProcessTask localWepkgCrossProcessTask = new WepkgCrossProcessTask();
    localWepkgCrossProcessTask.nJ = 3001;
    localWepkgCrossProcessTask.rYm.rYG = paramString;
    if (ab.bPY()) {
      localWepkgCrossProcessTask.RY();
    }
    while (localWepkgCrossProcessTask.rYm == null)
    {
      GMTrace.o(15192507285504L, 113193);
      return null;
      WepkgMainProcessService.b(localWepkgCrossProcessTask);
    }
    paramString = localWepkgCrossProcessTask.rYm;
    GMTrace.o(15192507285504L, 113193);
    return paramString;
  }
  
  public static WepkgVersion MZ(String paramString)
  {
    GMTrace.i(16598974857216L, 123672);
    WepkgCrossProcessTask localWepkgCrossProcessTask = new WepkgCrossProcessTask();
    localWepkgCrossProcessTask.nJ = 3002;
    localWepkgCrossProcessTask.rYm.rYG = paramString;
    if (ab.bPY()) {
      localWepkgCrossProcessTask.RY();
    }
    while (localWepkgCrossProcessTask.rYm == null)
    {
      GMTrace.o(16598974857216L, 123672);
      return null;
      WepkgMainProcessService.b(localWepkgCrossProcessTask);
    }
    paramString = localWepkgCrossProcessTask.rYm;
    GMTrace.o(16598974857216L, 123672);
    return paramString;
  }
  
  public static List<WepkgPreloadFile> Na(String paramString)
  {
    GMTrace.i(15192909938688L, 113196);
    WepkgCrossProcessTask localWepkgCrossProcessTask = new WepkgCrossProcessTask();
    localWepkgCrossProcessTask.nJ = 4001;
    localWepkgCrossProcessTask.rYm.rYG = paramString;
    if (ab.bPY()) {
      localWepkgCrossProcessTask.RY();
    }
    for (;;)
    {
      paramString = localWepkgCrossProcessTask.rYp;
      GMTrace.o(15192909938688L, 113196);
      return paramString;
      WepkgMainProcessService.b(localWepkgCrossProcessTask);
    }
  }
  
  public static List<WepkgPreloadFile> Nb(String paramString)
  {
    GMTrace.i(16002779709440L, 119230);
    WepkgCrossProcessTask localWepkgCrossProcessTask = new WepkgCrossProcessTask();
    localWepkgCrossProcessTask.nJ = 4003;
    localWepkgCrossProcessTask.rYm.rYG = paramString;
    if (ab.bPY()) {
      localWepkgCrossProcessTask.RY();
    }
    for (;;)
    {
      paramString = localWepkgCrossProcessTask.rYp;
      GMTrace.o(16002779709440L, 119230);
      return paramString;
      WepkgMainProcessService.b(localWepkgCrossProcessTask);
    }
  }
  
  public static void a(int paramInt1, final String paramString1, final String paramString2, final String paramString3, final long paramLong, String paramString4, final String paramString5, final int paramInt2, final a parama)
  {
    GMTrace.i(16599109074944L, 123673);
    final WepkgDownloadProcessTask localWepkgDownloadProcessTask = new WepkgDownloadProcessTask();
    localWepkgDownloadProcessTask.fileType = paramInt1;
    localWepkgDownloadProcessTask.eZq = paramString1;
    localWepkgDownloadProcessTask.downloadUrl = paramString3;
    localWepkgDownloadProcessTask.rYs = paramLong;
    localWepkgDownloadProcessTask.version = paramString4;
    localWepkgDownloadProcessTask.eDW = paramString5;
    localWepkgDownloadProcessTask.rYt = paramInt2;
    if (ab.bPY())
    {
      d.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(15178011770880L, 113085);
          WePkgDownloader.bGj().a(this.rUc, bg.nl(paramString1), bg.nl(paramString2), bg.nl(paramString3), paramLong, bg.nl(paramString5), bg.nl(paramInt2), localWepkgDownloadProcessTask, new WePkgDownloader.IWepkgUpdateCallback()
          {
            public final void a(String paramAnonymous2String1, String paramAnonymous2String2, WePkgDownloader.IWepkgUpdateCallback.RetCode paramAnonymous2RetCode)
            {
              GMTrace.i(15178548641792L, 113089);
              w.i("MicroMsg.Wepkg.WepkgProcessTaskPerformer", "onPkgUpdatingCallback errCode:%s", new Object[] { paramAnonymous2RetCode });
              h.12.this.rYJ.eZq = paramAnonymous2String1;
              h.12.this.rYJ.hKI = paramAnonymous2String2;
              h.12.this.rYJ.rYu = paramAnonymous2RetCode;
              if (h.12.this.rYI != null) {
                h.12.this.rYI.a(h.12.this.rYJ);
              }
              GMTrace.o(15178548641792L, 113089);
            }
          });
          GMTrace.o(15178011770880L, 113085);
        }
      });
      GMTrace.o(16599109074944L, 123673);
      return;
    }
    localWepkgDownloadProcessTask.hYr = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(15182843609088L, 113121);
        if (this.rYI != null) {
          this.rYI.a(localWepkgDownloadProcessTask);
        }
        localWepkgDownloadProcessTask.VN();
        GMTrace.o(15182843609088L, 113121);
      }
    };
    localWepkgDownloadProcessTask.VM();
    WepkgMainProcessService.a(localWepkgDownloadProcessTask);
    GMTrace.o(16599109074944L, 123673);
  }
  
  public static void a(String paramString1, String paramString2, String paramString3, final a parama)
  {
    GMTrace.i(15193044156416L, 113197);
    final WepkgCrossProcessTask localWepkgCrossProcessTask = new WepkgCrossProcessTask();
    localWepkgCrossProcessTask.nJ = 4002;
    localWepkgCrossProcessTask.rYo.rYG = paramString1;
    localWepkgCrossProcessTask.rYo.rYr = paramString2;
    localWepkgCrossProcessTask.rYo.filePath = paramString3;
    localWepkgCrossProcessTask.rYo.rYH = false;
    if (ab.bPY())
    {
      d.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(15173179932672L, 113049);
          this.rYL.RY();
          if (parama != null) {
            parama.a(this.rYL);
          }
          GMTrace.o(15173179932672L, 113049);
        }
      });
      GMTrace.o(15193044156416L, 113197);
      return;
    }
    localWepkgCrossProcessTask.hYr = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(15175730069504L, 113068);
        if (this.rYI != null) {
          this.rYI.a(localWepkgCrossProcessTask);
        }
        localWepkgCrossProcessTask.VN();
        GMTrace.o(15175730069504L, 113068);
      }
    };
    localWepkgCrossProcessTask.VM();
    WepkgMainProcessService.a(localWepkgCrossProcessTask);
    GMTrace.o(15193044156416L, 113197);
  }
  
  public static void a(String paramString1, String paramString2, boolean paramBoolean, final a parama)
  {
    GMTrace.i(15192641503232L, 113194);
    final WepkgCrossProcessTask localWepkgCrossProcessTask = new WepkgCrossProcessTask();
    localWepkgCrossProcessTask.nJ = 3005;
    localWepkgCrossProcessTask.rYm.rYG = paramString1;
    localWepkgCrossProcessTask.rYm.hKI = paramString2;
    localWepkgCrossProcessTask.rYm.rZc = paramBoolean;
    if (ab.bPY())
    {
      d.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(15185796399104L, 113143);
          this.rYL.RY();
          if (parama != null) {
            parama.a(this.rYL);
          }
          GMTrace.o(15185796399104L, 113143);
        }
      });
      GMTrace.o(15192641503232L, 113194);
      return;
    }
    localWepkgCrossProcessTask.hYr = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(15179488165888L, 113096);
        if (this.rYI != null) {
          this.rYI.a(localWepkgCrossProcessTask);
        }
        localWepkgCrossProcessTask.VN();
        GMTrace.o(15179488165888L, 113096);
      }
    };
    localWepkgCrossProcessTask.VM();
    WepkgMainProcessService.a(localWepkgCrossProcessTask);
    GMTrace.o(15192641503232L, 113194);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\wepkg\model\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
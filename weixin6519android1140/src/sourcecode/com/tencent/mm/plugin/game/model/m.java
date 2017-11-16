package com.tencent.mm.plugin.game.model;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.g.b.n;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.w;

public final class m
{
  public int eJD;
  public c lMw;
  public boolean lMx;
  public int mode;
  public int progress;
  public int status;
  
  public m(c paramc)
  {
    GMTrace.i(12591770370048L, 93816);
    this.status = 0;
    this.mode = 1;
    this.lMx = false;
    this.progress = 0;
    this.eJD = 2;
    this.lMw = paramc;
    GMTrace.o(12591770370048L, 93816);
  }
  
  public final void aFo()
  {
    GMTrace.i(12592038805504L, 93818);
    if (this.lMw == null)
    {
      GMTrace.o(12592038805504L, 93818);
      return;
    }
    switch (this.mode)
    {
    default: 
      this.status = 0;
    }
    for (;;)
    {
      label61:
      w.i("MicroMsg.GameDownloadInfo", "Updating Download Status, AppId: %s, downloadMode: %d, downloadStatus: %d", new Object[] { this.lMw.field_appId, Integer.valueOf(this.mode), Integer.valueOf(this.status) });
      GMTrace.o(12592038805504L, 93818);
      return;
      FileDownloadTaskInfo localFileDownloadTaskInfo = f.apJ().vv(this.lMw.field_appId);
      this.eJD = localFileDownloadTaskInfo.eJD;
      if (localFileDownloadTaskInfo.kfD)
      {
        this.status = 0;
        GMTrace.o(12592038805504L, 93818);
        return;
      }
      if (localFileDownloadTaskInfo.eJe != 0L) {}
      for (this.progress = ((int)(localFileDownloadTaskInfo.eJd / localFileDownloadTaskInfo.eJe * 100.0D));; this.progress = 0)
      {
        w.d("MicroMsg.GameDownloadInfo", "status = " + localFileDownloadTaskInfo.status);
        switch (localFileDownloadTaskInfo.status)
        {
        default: 
          this.status = 0;
          break label61;
        }
      }
      this.status = 1;
      continue;
      this.status = 2;
      continue;
      this.status = 0;
      continue;
      if (e.aZ(localFileDownloadTaskInfo.path))
      {
        this.status = 3;
      }
      else
      {
        f.apJ().bf(localFileDownloadTaskInfo.id);
        break;
        if ((this.progress != 0) && (!am.isConnected(ab.getContext())))
        {
          this.status = 2;
        }
        else
        {
          this.status = 0;
          continue;
          if (this.lMw == null)
          {
            GMTrace.o(12592038805504L, 93818);
            return;
          }
          ay.aGa();
          int i = ay.zM(this.lMw.fdW);
          w.i("MicroMsg.GameDownloadInfo", "query download status : %d", new Object[] { Integer.valueOf(i) });
          switch (i)
          {
          default: 
            this.status = 0;
            break;
          case 1: 
          case 2: 
            this.status = 1;
            break;
          case 3: 
            this.status = 2;
            break;
          case 4: 
            this.status = 3;
          }
        }
      }
    }
  }
  
  public final void aFp()
  {
    GMTrace.i(12592173023232L, 93819);
    this.mode = 1;
    this.lMx = true;
    GMTrace.o(12592173023232L, 93819);
  }
  
  public final void cB(Context paramContext)
  {
    GMTrace.i(12591904587776L, 93817);
    if (this.lMw == null)
    {
      GMTrace.o(12591904587776L, 93817);
      return;
    }
    int j = this.lMw.fdU;
    int i = this.lMw.fdU;
    w.i("MicroMsg.GameDownloadInfo", "AppId: %s, Initial downloadMode: %d", new Object[] { this.lMw.field_appId, Integer.valueOf(j) });
    if (j == 2) {
      i = 3;
    }
    j = i;
    if (i == 3)
    {
      j = i;
      if (!g.n(paramContext, "wx3909f6add1206543")) {
        j = 1;
      }
    }
    i = j;
    if (j != 1)
    {
      paramContext = f.apJ().vv(this.lMw.field_appId);
      if ((paramContext.status != 1) && (paramContext.status != 2))
      {
        i = j;
        if (paramContext.status != 3) {}
      }
      else
      {
        i = 1;
      }
    }
    this.mode = i;
    w.i("MicroMsg.GameDownloadInfo", "AppId: %s, Final downloadMode: %d", new Object[] { this.lMw.field_appId, Integer.valueOf(i) });
    GMTrace.o(12591904587776L, 93817);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
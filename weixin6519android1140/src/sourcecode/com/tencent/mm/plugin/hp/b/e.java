package com.tencent.mm.plugin.hp.b;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.modelmulti.n.a;
import com.tencent.mm.plugin.downloader.model.g.a;
import com.tencent.mm.plugin.hp.a.a.1;
import com.tencent.mm.pluginsdk.i.p;
import com.tencent.mm.protocal.c.bjc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.tinker.lib.d.d;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import com.tencent.tinker.loader.shareutil.ShareSecurityCheck;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.io.File;

public final class e
  implements com.tencent.mm.plugin.downloader.model.n
{
  public final com.tencent.mm.plugin.hp.d.b mhj;
  private long mhk;
  
  public e(com.tencent.mm.plugin.hp.d.b paramb)
  {
    GMTrace.i(15367661420544L, 114498);
    this.mhj = paramb;
    com.tencent.mm.plugin.downloader.model.f.apJ();
    com.tencent.mm.plugin.downloader.model.c.a(this);
    GMTrace.o(15367661420544L, 114498);
  }
  
  public final boolean WH()
  {
    GMTrace.i(21075001868288L, 157021);
    com.tencent.tinker.lib.e.a.i("Tinker.SyncResponseProcessor", "process tinker response: %s", new Object[] { this.mhj.toString() });
    final Object localObject1 = this.mhj;
    int i;
    if ((((com.tencent.mm.plugin.hp.d.b)localObject1).mhE.intValue() > 4) || (((com.tencent.mm.plugin.hp.d.b)localObject1).mhE.intValue() <= 0))
    {
      w.e("Tinker.TinkerSyncResponse", "responseState: %d must between %d and %d", new Object[] { ((com.tencent.mm.plugin.hp.d.b)localObject1).mhE, Integer.valueOf(1), Integer.valueOf(4) });
      com.tencent.mm.plugin.report.service.g.ork.a(614L, 24L, 1L, false);
      i = 0;
    }
    while (i == 0)
    {
      com.tencent.tinker.lib.e.a.i("Tinker.SyncResponseProcessor", "process check response fail, just return", new Object[0]);
      GMTrace.o(21075001868288L, 157021);
      return false;
      if (((com.tencent.mm.plugin.hp.d.b)localObject1).aHy())
      {
        if (TextUtils.isEmpty(((com.tencent.mm.plugin.hp.d.b)localObject1).mhK))
        {
          w.e("Tinker.TinkerSyncResponse", "sync response patchId should not be null");
          com.tencent.mm.plugin.report.service.g.ork.a(614L, 25L, 1L, false);
          i = 0;
          continue;
        }
        if (TextUtils.isEmpty(((com.tencent.mm.plugin.hp.d.b)localObject1).mhI))
        {
          w.e("Tinker.TinkerSyncResponse", "sync response cdnUrl should not be null");
          com.tencent.mm.plugin.report.service.g.ork.a(614L, 26L, 1L, false);
          i = 0;
          continue;
        }
        if (TextUtils.isEmpty(((com.tencent.mm.plugin.hp.d.b)localObject1).mhJ))
        {
          w.e("Tinker.TinkerSyncResponse", "sync response fileMd5 should not be null");
          com.tencent.mm.plugin.report.service.g.ork.a(614L, 27L, 1L, false);
          i = 0;
          continue;
        }
      }
      i = 1;
    }
    if (this.mhj.mhE.intValue() == 3)
    {
      i = 1;
      if (i == 0) {
        break label380;
      }
      localObject2 = ab.getContext();
      localObject1 = com.tencent.tinker.lib.d.a.hQ((Context)localObject2);
      if (((com.tencent.tinker.lib.d.a)localObject1).ygy) {
        break label310;
      }
      com.tencent.tinker.lib.e.a.w("Tinker.SyncResponseProcessor", "SyncResponseProcessor: onPatchRollback, tinker is not loaded, just return", new Object[0]);
    }
    for (;;)
    {
      GMTrace.o(21075001868288L, 157021);
      return true;
      i = 0;
      break;
      label310:
      com.tencent.tinker.lib.e.a.i("Tinker.SyncResponseProcessor", "tinker wait screen to clean patch and kill all process", new Object[0]);
      new com.tencent.mm.modelmulti.n(ab.getContext(), new n.a()
      {
        public final void bx(boolean paramAnonymousBoolean)
        {
          GMTrace.i(18996506132480L, 141535);
          if (!paramAnonymousBoolean)
          {
            com.tencent.tinker.lib.e.a.i("Tinker.SyncResponseProcessor", "app is background now, i can kill quietly", new Object[0]);
            ShareTinkerInternals.ih(localObject2);
            localObject1.aHu();
            Process.killProcess(Process.myPid());
          }
          GMTrace.o(18996506132480L, 141535);
        }
      });
      localObject2 = new SharePatchInfo(((com.tencent.tinker.lib.d.a)localObject1).ygx.ygC, "00000000000000000000000000000000", Build.FINGERPRINT, "odex");
      SharePatchInfo.a(((com.tencent.tinker.lib.d.a)localObject1).ygu, (SharePatchInfo)localObject2, ((com.tencent.tinker.lib.d.a)localObject1).ygv);
    }
    label380:
    if (!this.mhj.aHy())
    {
      GMTrace.o(21075001868288L, 157021);
      return true;
    }
    com.tencent.tinker.lib.e.a.i("Tinker.SyncResponseProcessor", "check need show before download. network type:%d msg:%s", new Object[] { this.mhj.mhH, this.mhj.aHA() });
    final Object localObject2 = ab.getContext();
    if ((this.mhj.mhH.intValue() == 2) && (am.isMobile(ab.getContext())) && (this.mhj.aHz())) {
      if (!com.tencent.mm.plugin.hp.tinker.g.ae((Context)localObject2, this.mhj.mhK)) {
        if (this.mhj.mhG.intValue() == 2)
        {
          localObject1 = ab.getContext().getString(R.l.dxq, new Object[] { this.mhj.aHA(), ab.getContext().getString(R.l.efn), bg.aF(this.mhj.fileSize) });
          i.a(ab.getContext().getString(R.l.dxo), (String)localObject1, ab.getContext().getString(R.l.efr), new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(15369406251008L, 114511);
              if (e.this.mhj.aHx()) {
                e.this.aHq();
              }
              GMTrace.o(15369406251008L, 114511);
            }
          }, ab.getContext().getString(R.l.eff), new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(18996774567936L, 141537);
              com.tencent.mm.plugin.hp.tinker.g.af(localObject2, e.this.mhj.mhK);
              GMTrace.o(18996774567936L, 141537);
            }
          });
          a.pa(4);
        }
      }
    }
    for (;;)
    {
      GMTrace.o(21075001868288L, 157021);
      return true;
      if (this.mhj.mhG.intValue() != 3) {
        break;
      }
      w.d("Tinker.SyncResponseProcessor", "showUpdateDialog ");
      if (bg.nm(this.mhj.aHA())) {}
      for (localObject1 = ((Context)localObject2).getString(R.l.eft);; localObject1 = this.mhj.aHA())
      {
        bjc localbjc = new bjc();
        localbjc.mhK = this.mhj.mhK;
        localbjc.title = ((Context)localObject2).getString(R.l.dxo);
        localbjc.uUq = ((Context)localObject2).getString(R.l.efr);
        localbjc.mcV = ((Context)localObject2).getString(R.l.eff);
        localbjc.mhL = this.mhj.mhL;
        localbjc.mhM = this.mhj.mhM;
        localbjc.uUp = this.mhj.fileSize;
        localbjc.mhI = this.mhj.mhI;
        localbjc.ero = this.mhj.mhJ;
        localbjc.versionCode = this.mhj.versionCode;
        localbjc.uUo = p.OH(this.mhj.mhL);
        localbjc.eCh = ((String)localObject1);
        p.a(localbjc);
        break;
      }
      com.tencent.mm.plugin.report.service.g.ork.a(614L, 44L, 1L, false);
      w.i("Tinker.SyncResponseProcessor", "this patch id :%s show cancel before user, need show again.", new Object[] { this.mhj.mhK });
      continue;
      if ((this.mhj.aHx()) && (!com.tencent.mm.plugin.hp.tinker.g.ae((Context)localObject2, this.mhj.mhK))) {
        aHq();
      }
    }
  }
  
  public final void aHq()
  {
    GMTrace.i(15367795638272L, 114499);
    if (!h.getExternalStorageState().equals("mounted"))
    {
      w.e("Tinker.SyncResponseProcessor", "no sdcard.");
      com.tencent.mm.plugin.report.service.g.ork.a(614L, 50L, 1L, false);
      GMTrace.o(15367795638272L, 114499);
      return;
    }
    if (!com.tencent.mm.compatible.util.f.L(this.mhj.fileSize))
    {
      w.e("Tinker.SyncResponseProcessor", "sdcard is full.");
      com.tencent.mm.plugin.report.service.g.ork.a(614L, 51L, 1L, false);
      if (this.mhj.mhG.intValue() == 3) {
        com.tencent.mm.plugin.report.service.g.ork.a(614L, 55L, 1L, false);
      }
      GMTrace.o(15367795638272L, 114499);
      return;
    }
    if ((this.mhj.mhG.intValue() == 3) && (!bg.nm(this.mhj.mhL)) && (com.tencent.mm.a.e.aZ(p.OH(this.mhj.mhL))) && (com.tencent.mm.c.a.br(p.OH(this.mhj.mhL))))
    {
      Context localContext = ab.getContext();
      if (bg.nm(this.mhj.aHA())) {}
      for (localObject = localContext.getString(R.l.eft);; localObject = this.mhj.aHA())
      {
        bjc localbjc = new bjc();
        localbjc.mhK = this.mhj.mhK;
        localbjc.title = localContext.getString(R.l.dxo);
        localbjc.uUq = localContext.getString(R.l.dDf);
        localbjc.mcV = localContext.getString(R.l.eff);
        localbjc.mhL = this.mhj.mhL;
        localbjc.mhM = this.mhj.mhM;
        localbjc.uUp = this.mhj.fileSize;
        localbjc.mhI = this.mhj.mhI;
        localbjc.ero = this.mhj.mhJ;
        localbjc.versionCode = this.mhj.versionCode;
        localbjc.uUo = p.OH(this.mhj.mhL);
        localbjc.eCh = ((String)localObject);
        p.a(localbjc);
        w.i("Tinker.SyncResponseProcessor", "file is exist. need no to download. newApkMd5:%s", new Object[] { this.mhj.mhL });
        GMTrace.o(15367795638272L, 114499);
        return;
      }
    }
    p.bJU();
    p.bJV();
    Object localObject = new g.a();
    ((g.a)localObject).vy(this.mhj.mhI);
    ((g.a)localObject).vA(this.mhj.mhK);
    ((g.a)localObject).vB(this.mhj.mhJ);
    ((g.a)localObject).dJ(false);
    ((g.a)localObject).dL(true);
    ((g.a)localObject).mt(0);
    ((g.a)localObject).dK(false);
    this.mhk = com.tencent.mm.plugin.downloader.model.f.apJ().a(((g.a)localObject).kfx);
    w.i("Tinker.SyncResponseProcessor", "Download task id is :%d", new Object[] { Long.valueOf(this.mhk) });
    com.tencent.mm.plugin.report.service.g.ork.a(614L, 2L, 1L, false);
    if (am.isWifi(ab.getContext())) {
      com.tencent.mm.plugin.report.service.g.ork.a(614L, 7L, 1L, false);
    }
    for (;;)
    {
      if (this.mhj.mhG.intValue() == 3)
      {
        com.tencent.mm.plugin.report.service.g.ork.a(614L, 56L, 1L, false);
        w.d("Tinker.SyncResponseProcessor", "boots download start silent.");
      }
      GMTrace.o(15367795638272L, 114499);
      return;
      com.tencent.mm.plugin.report.service.g.ork.a(614L, 8L, 1L, false);
    }
  }
  
  public final void bs(long paramLong)
  {
    GMTrace.i(18995029737472L, 141524);
    w.d("Tinker.SyncResponseProcessor", "onTaskProgressChanged");
    GMTrace.o(18995029737472L, 141524);
  }
  
  public final void c(long paramLong, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(18994627084288L, 141521);
    w.w("Tinker.SyncResponseProcessor", "onTaskFailed");
    if (this.mhk != paramLong)
    {
      w.i("Tinker.SyncResponseProcessor", "onTaskFailed ignore. id is no equal. download id :%s callback id:%s", new Object[] { Long.valueOf(this.mhk), Long.valueOf(paramLong) });
      GMTrace.o(18994627084288L, 141521);
      return;
    }
    b.pd(2);
    if (this.mhj.mhG.intValue() == 3) {
      com.tencent.mm.plugin.report.service.g.ork.a(614L, 51L, 1L, false);
    }
    com.tencent.mm.plugin.downloader.model.f.apJ();
    com.tencent.mm.plugin.downloader.model.c.b(this);
    GMTrace.o(18994627084288L, 141521);
  }
  
  public final void c(long paramLong, String paramString, boolean paramBoolean)
  {
    GMTrace.i(18994492866560L, 141520);
    w.i("Tinker.SyncResponseProcessor", "onTaskFinished id:%d path:%s hasChangeUrl:%s", new Object[] { Long.valueOf(paramLong), paramString, Boolean.valueOf(paramBoolean) });
    if (this.mhk != paramLong)
    {
      w.i("Tinker.SyncResponseProcessor", "onTaskFinished ignore. id is no equal. download id :%s callback id:%s", new Object[] { Long.valueOf(this.mhk), Long.valueOf(paramLong) });
      GMTrace.o(18994492866560L, 141520);
      return;
    }
    b.pc(2);
    Context localContext = ab.getContext();
    Object localObject2 = new File(paramString);
    paramString = new ShareSecurityCheck(localContext);
    if ((this.mhj.mhG.intValue() == 2) && (!paramString.af((File)localObject2)))
    {
      com.tencent.tinker.lib.e.a.i("Tinker.SyncResponseProcessor", "verify patch signature failed.", new Object[0]);
      b.pd(2);
      com.tencent.mm.plugin.report.service.g.ork.a(614L, 31L, 1L, false);
      if (this.mhj.mhG.intValue() == 3)
      {
        com.tencent.mm.plugin.report.service.g.ork.a(614L, 54L, 1L, false);
        w.d("Tinker.SyncResponseProcessor", "boots download patch md5 no equal.");
      }
      com.tencent.mm.plugin.downloader.model.f.apJ();
      com.tencent.mm.plugin.downloader.model.c.b(this);
      GMTrace.o(18994492866560L, 141520);
      return;
    }
    paramString = localContext.getApplicationInfo();
    if (paramString == null) {
      paramString = null;
    }
    Object localObject1;
    while (paramString != null)
    {
      paramString = paramString.listFiles();
      if (paramString == null) {
        break;
      }
      localObject1 = ((File)localObject2).getName();
      int j = paramString.length;
      int i = 0;
      while (i < j)
      {
        File localFile = paramString[i];
        if (!localFile.getName().equals(localObject1)) {
          SharePatchFileUtil.ab(localFile);
        }
        i += 1;
      }
      localObject1 = new File(paramString.dataDir, "tinker_server");
      paramString = (String)localObject1;
      if (!((File)localObject1).exists())
      {
        ((File)localObject1).mkdirs();
        paramString = (String)localObject1;
      }
    }
    switch (this.mhj.mhG.intValue())
    {
    default: 
      label380:
      paramString = this.mhj;
      if (!paramString.aHz()) {
        break;
      }
    }
    for (paramString = com.tencent.mm.plugin.hp.d.b.a(paramString.mhF, 2);; paramString = "")
    {
      localContext.getSharedPreferences("tinker_patch_share_config", 4).edit().putString("tinker_patch_msg_key", paramString).apply();
      break;
      com.tencent.tinker.lib.e.a.i("Tinker.SyncResponseProcessor", "onReceiveUpgradePatch. try to start apply", new Object[0]);
      com.tencent.tinker.lib.d.c.bM(localContext, ((File)localObject2).getAbsolutePath());
      break label380;
      paramString = ((File)localObject2).getAbsolutePath();
      localObject1 = this.mhj;
      w.i("MicroMsg.Tinker.CTinkerInstaller", "onReceiveUpgradeBsDiff bsDiffPath:%s , new apk md5：%s", new Object[] { paramString, ((com.tencent.mm.plugin.hp.d.b)localObject1).mhL });
      localObject2 = p.OH(((com.tencent.mm.plugin.hp.d.b)localObject1).mhL);
      at.xB().A(new a.1((String)localObject2, localContext, paramString, (com.tencent.mm.plugin.hp.d.b)localObject1));
      break label380;
      w.i("Tinker.SyncResponseProcessor", "coming soon! now can not support full apk update.");
      break label380;
    }
  }
  
  public final void k(long paramLong, String paramString)
  {
    GMTrace.i(18995163955200L, 141525);
    w.d("Tinker.SyncResponseProcessor", "onTaskResumed");
    GMTrace.o(18995163955200L, 141525);
  }
  
  public final void onTaskPaused(long paramLong)
  {
    GMTrace.i(18994895519744L, 141523);
    w.d("Tinker.SyncResponseProcessor", "onTaskPaused");
    GMTrace.o(18994895519744L, 141523);
  }
  
  public final void onTaskRemoved(long paramLong)
  {
    GMTrace.i(18994761302016L, 141522);
    w.i("Tinker.SyncResponseProcessor", "onTaskRemoved");
    com.tencent.mm.plugin.downloader.model.f.apJ();
    com.tencent.mm.plugin.downloader.model.c.b(this);
    GMTrace.o(18994761302016L, 141522);
  }
  
  public final void onTaskStarted(long paramLong, String paramString)
  {
    GMTrace.i(18994358648832L, 141519);
    w.d("Tinker.SyncResponseProcessor", "onTaskStarted");
    GMTrace.o(18994358648832L, 141519);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\hp\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
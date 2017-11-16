package com.tinkerboots.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import com.tencent.tinker.lib.c.c;
import com.tencent.tinker.lib.service.AbstractResultService;
import com.tencent.tinker.lib.service.TinkerPatchService;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.tinker.loader.app.ApplicationLike;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.io.File;
import java.util.Map;

public final class a
{
  public static a yqx;
  private final ApplicationLike applicationLike;
  public final com.tencent.tinker.lib.d.a yqy;
  public final com.tinkerboots.sdk.a.a yqz;
  
  public a(Context paramContext, ApplicationLike paramApplicationLike, c paramc, com.tencent.tinker.lib.c.d paramd, com.tencent.tinker.lib.a.b paramb, com.tencent.tinker.lib.b.a parama, Class<? extends AbstractResultService> paramClass, com.tinkerboots.sdk.a.a.b paramb1)
  {
    com.tinkerboots.sdk.b.b.context = paramContext;
    this.applicationLike = paramApplicationLike;
    this.yqz = com.tinkerboots.sdk.a.a.a(paramb1);
    paramContext = new com.tencent.tinker.lib.d.a.a(paramApplicationLike.getApplication());
    int i = paramApplicationLike.getTinkerFlags();
    if (paramContext.status != -1) {
      throw new TinkerRuntimeException("tinkerFlag is already set.");
    }
    paramContext.status = i;
    if (paramc == null) {
      throw new TinkerRuntimeException("loadReporter must not be null.");
    }
    if (paramContext.ygs != null) {
      throw new TinkerRuntimeException("loadReporter is already set.");
    }
    paramContext.ygs = paramc;
    if (paramb == null) {
      throw new TinkerRuntimeException("listener must not be null.");
    }
    if (paramContext.ygr != null) {
      throw new TinkerRuntimeException("listener is already set.");
    }
    paramContext.ygr = paramb;
    if (paramd == null) {
      throw new TinkerRuntimeException("patchReporter must not be null.");
    }
    if (paramContext.ygt != null) {
      throw new TinkerRuntimeException("patchReporter is already set.");
    }
    paramContext.ygt = paramd;
    paramc = Boolean.valueOf(paramApplicationLike.getTinkerLoadVerifyFlag());
    if (paramc == null) {
      throw new TinkerRuntimeException("tinkerLoadVerifyFlag must not be null.");
    }
    if (paramContext.ygB != null) {
      throw new TinkerRuntimeException("tinkerLoadVerifyFlag is already set.");
    }
    paramContext.ygB = paramc;
    paramContext = paramContext.cqI();
    com.tencent.tinker.lib.d.a.a(paramContext);
    paramc = paramApplicationLike.getTinkerResultIntent();
    com.tencent.tinker.lib.d.a.ygp = true;
    TinkerPatchService.a(parama, paramClass);
    com.tencent.tinker.lib.e.a.i("Tinker.Tinker", "try to install tinker, isEnable: %b, version: %s", new Object[] { Boolean.valueOf(ShareTinkerInternals.Gh(paramContext.tinkerFlags)), "1.8.3" });
    if (!ShareTinkerInternals.Gh(paramContext.tinkerFlags))
    {
      com.tencent.tinker.lib.e.a.e("Tinker.Tinker", "tinker is disabled", new Object[0]);
      this.yqy = paramContext;
      return;
    }
    if (paramc == null) {
      throw new TinkerRuntimeException("intentResult must not be null.");
    }
    paramContext.ygx = new com.tencent.tinker.lib.d.d();
    paramd = paramContext.ygx;
    paramb = paramContext.context;
    paramApplicationLike = com.tencent.tinker.lib.d.a.hQ(paramb);
    paramd.ygQ = ShareIntentUtil.ar(paramc);
    paramd.iyA = ShareIntentUtil.as(paramc);
    paramd.ygG = ShareIntentUtil.p(paramc, "intent_patch_system_ota");
    paramd.ygD = ShareIntentUtil.i(paramc, "intent_patch_oat_dir");
    paramd.ygF = "interpet".equals(paramd.ygD);
    boolean bool2 = paramApplicationLike.qoU;
    com.tencent.tinker.lib.e.a.i("Tinker.TinkerLoadResult", "parseTinkerResult loadCode:%d, process name:%s, main process:%b, systemOTA:%b, fingerPrint:%s, oatDir:%s, useInterpretMode:%b", new Object[] { Integer.valueOf(paramd.ygQ), ShareTinkerInternals.ii(paramb), Boolean.valueOf(bool2), Boolean.valueOf(paramd.ygG), Build.FINGERPRINT, paramd.ygD, Boolean.valueOf(paramd.ygF) });
    paramb = ShareIntentUtil.i(paramc, "intent_patch_old_version");
    parama = ShareIntentUtil.i(paramc, "intent_patch_new_version");
    paramClass = paramApplicationLike.ygq;
    paramb1 = paramApplicationLike.ygu;
    label531:
    Object localObject;
    boolean bool1;
    if ((paramb != null) && (parama != null))
    {
      if (bool2)
      {
        paramd.ygC = parama;
        com.tencent.tinker.lib.e.a.i("Tinker.TinkerLoadResult", "parseTinkerResult oldVersion:%s, newVersion:%s, current:%s", new Object[] { paramb, parama, paramd.ygC });
        localObject = SharePatchFileUtil.YG(paramd.ygC);
        if (!ShareTinkerInternals.nm((String)localObject))
        {
          paramd.ygH = new File(paramClass.getAbsolutePath() + "/" + (String)localObject);
          paramd.ygI = new File(paramd.ygH.getAbsolutePath(), SharePatchFileUtil.YH(paramd.ygC));
          paramd.ygJ = new File(paramd.ygH, "dex");
          paramd.ygK = new File(paramd.ygH, "lib");
          paramd.ygL = new File(paramd.ygH, "res");
          paramd.ygM = new File(paramd.ygL, "resources.apk");
        }
        paramd.patchInfo = new SharePatchInfo(paramb, parama, Build.FINGERPRINT, paramd.ygD);
        if (paramb.equals(parama)) {
          break label928;
        }
        bool1 = true;
        label764:
        paramd.ygE = bool1;
      }
    }
    else
    {
      localObject = ShareIntentUtil.at(paramc);
      if (localObject == null) {
        break label961;
      }
      com.tencent.tinker.lib.e.a.i("Tinker.TinkerLoadResult", "Tinker load have exception loadCode:%d", new Object[] { Integer.valueOf(paramd.ygQ) });
      i = -1;
      switch (paramd.ygQ)
      {
      default: 
        label856:
        paramApplicationLike.ygs.a((Throwable)localObject, i);
      }
    }
    for (;;)
    {
      paramContext.ygs.a(paramContext.ygq, paramContext.ygx.ygQ, paramContext.ygx.iyA);
      if (paramContext.ygy) {
        break;
      }
      com.tencent.tinker.lib.e.a.w("Tinker.Tinker", "tinker load fail!", new Object[0]);
      break;
      paramd.ygC = paramb;
      break label531;
      label928:
      bool1 = false;
      break label764;
      i = -1;
      break label856;
      i = -2;
      break label856;
      i = -3;
      break label856;
      i = -4;
      break label856;
      label961:
      switch (paramd.ygQ)
      {
      default: 
        break;
      case -10000: 
        com.tencent.tinker.lib.e.a.e("Tinker.TinkerLoadResult", "can't get the right intent return code", new Object[0]);
        throw new TinkerRuntimeException("can't get the right intent return code");
      case -1: 
        com.tencent.tinker.lib.e.a.w("Tinker.TinkerLoadResult", "tinker is disable, just return", new Object[0]);
        break;
      case -3: 
      case -2: 
        com.tencent.tinker.lib.e.a.w("Tinker.TinkerLoadResult", "can't find patch file, is ok, just return", new Object[0]);
        break;
      case -4: 
        com.tencent.tinker.lib.e.a.e("Tinker.TinkerLoadResult", "path info corrupted", new Object[0]);
        paramApplicationLike.ygs.a(paramb, parama, paramb1);
        break;
      case -5: 
        com.tencent.tinker.lib.e.a.e("Tinker.TinkerLoadResult", "path info blank, wait main process to restart", new Object[0]);
        break;
      case -6: 
        com.tencent.tinker.lib.e.a.e("Tinker.TinkerLoadResult", "patch version directory not found, current version:%s", new Object[] { paramd.ygC });
        paramApplicationLike.ygs.a(paramd.ygH, 1, true);
        break;
      case -7: 
        com.tencent.tinker.lib.e.a.e("Tinker.TinkerLoadResult", "patch version file not found, current version:%s", new Object[] { paramd.ygC });
        if (paramd.ygI == null) {
          throw new TinkerRuntimeException("error load patch version file not exist, but file is null");
        }
        paramApplicationLike.ygs.a(paramd.ygI, 1, false);
        break;
      case -8: 
        com.tencent.tinker.lib.e.a.i("Tinker.TinkerLoadResult", "patch package check fail", new Object[0]);
        if (paramd.ygI == null) {
          throw new TinkerRuntimeException("error patch package check fail , but file is null");
        }
        i = paramc.getIntExtra("intent_patch_package_patch_check", 55536);
        paramApplicationLike.ygs.b(paramd.ygI, i);
        break;
      case -9: 
        if (paramd.ygJ != null)
        {
          com.tencent.tinker.lib.e.a.e("Tinker.TinkerLoadResult", "patch dex file directory not found:%s", new Object[] { paramd.ygJ.getAbsolutePath() });
          paramApplicationLike.ygs.a(paramd.ygJ, 3, true);
        }
        else
        {
          com.tencent.tinker.lib.e.a.e("Tinker.TinkerLoadResult", "patch dex file directory not found, warning why the path is null!!!!", new Object[0]);
          throw new TinkerRuntimeException("patch dex file directory not found, warning why the path is null!!!!");
        }
        break;
      case -10: 
        paramc = ShareIntentUtil.i(paramc, "intent_patch_missing_dex_path");
        if (paramc != null)
        {
          com.tencent.tinker.lib.e.a.e("Tinker.TinkerLoadResult", "patch dex file not found:%s", new Object[] { paramc });
          paramApplicationLike.ygs.a(new File(paramc), 3, false);
        }
        else
        {
          com.tencent.tinker.lib.e.a.e("Tinker.TinkerLoadResult", "patch dex file not found, but path is null!!!!", new Object[0]);
          throw new TinkerRuntimeException("patch dex file not found, but path is null!!!!");
        }
        break;
      case -11: 
        paramc = ShareIntentUtil.i(paramc, "intent_patch_missing_dex_path");
        if (paramc != null)
        {
          com.tencent.tinker.lib.e.a.e("Tinker.TinkerLoadResult", "patch dex opt file not found:%s", new Object[] { paramc });
          paramApplicationLike.ygs.a(new File(paramc), 4, false);
        }
        else
        {
          com.tencent.tinker.lib.e.a.e("Tinker.TinkerLoadResult", "patch dex opt file not found, but path is null!!!!", new Object[0]);
          throw new TinkerRuntimeException("patch dex opt file not found, but path is null!!!!");
        }
        break;
      case -17: 
        if (paramd.ygH != null)
        {
          com.tencent.tinker.lib.e.a.e("Tinker.TinkerLoadResult", "patch lib file directory not found:%s", new Object[] { paramd.ygK.getAbsolutePath() });
          paramApplicationLike.ygs.a(paramd.ygK, 5, true);
        }
        else
        {
          com.tencent.tinker.lib.e.a.e("Tinker.TinkerLoadResult", "patch lib file directory not found, warning why the path is null!!!!", new Object[0]);
          throw new TinkerRuntimeException("patch lib file directory not found, warning why the path is null!!!!");
        }
        break;
      case -18: 
        paramc = ShareIntentUtil.i(paramc, "intent_patch_missing_lib_path");
        if (paramc != null)
        {
          com.tencent.tinker.lib.e.a.e("Tinker.TinkerLoadResult", "patch lib file not found:%s", new Object[] { paramc });
          paramApplicationLike.ygs.a(new File(paramc), 5, false);
        }
        else
        {
          com.tencent.tinker.lib.e.a.e("Tinker.TinkerLoadResult", "patch lib file not found, but path is null!!!!", new Object[0]);
          throw new TinkerRuntimeException("patch lib file not found, but path is null!!!!");
        }
        break;
      case -12: 
        com.tencent.tinker.lib.e.a.e("Tinker.TinkerLoadResult", "patch dex load fail, classloader is null", new Object[0]);
        break;
      case -13: 
        paramc = ShareIntentUtil.i(paramc, "intent_patch_mismatch_dex_path");
        if (paramc == null)
        {
          com.tencent.tinker.lib.e.a.e("Tinker.TinkerLoadResult", "patch dex file md5 is mismatch, but path is null!!!!", new Object[0]);
          throw new TinkerRuntimeException("patch dex file md5 is mismatch, but path is null!!!!");
        }
        com.tencent.tinker.lib.e.a.e("Tinker.TinkerLoadResult", "patch dex file md5 is mismatch: %s", new Object[] { paramc });
        paramApplicationLike.ygs.a(new File(paramc), 3);
        break;
      case -19: 
        com.tencent.tinker.lib.e.a.i("Tinker.TinkerLoadResult", "rewrite patch info file corrupted", new Object[0]);
        paramApplicationLike.ygs.a(paramb, parama, paramb1);
        break;
      case -21: 
        if (paramd.ygH != null)
        {
          com.tencent.tinker.lib.e.a.e("Tinker.TinkerLoadResult", "patch resource file directory not found:%s", new Object[] { paramd.ygL.getAbsolutePath() });
          paramApplicationLike.ygs.a(paramd.ygL, 6, true);
        }
        else
        {
          com.tencent.tinker.lib.e.a.e("Tinker.TinkerLoadResult", "patch resource file directory not found, warning why the path is null!!!!", new Object[0]);
          throw new TinkerRuntimeException("patch resource file directory not found, warning why the path is null!!!!");
        }
        break;
      case -22: 
        if (paramd.ygH != null)
        {
          com.tencent.tinker.lib.e.a.e("Tinker.TinkerLoadResult", "patch resource file not found:%s", new Object[] { paramd.ygM.getAbsolutePath() });
          paramApplicationLike.ygs.a(paramd.ygM, 6, false);
        }
        else
        {
          com.tencent.tinker.lib.e.a.e("Tinker.TinkerLoadResult", "patch resource file not found, warning why the path is null!!!!", new Object[0]);
          throw new TinkerRuntimeException("patch resource file not found, warning why the path is null!!!!");
        }
        break;
      case -24: 
        if (paramd.ygM == null)
        {
          com.tencent.tinker.lib.e.a.e("Tinker.TinkerLoadResult", "resource file md5 mismatch, but patch resource file not found!", new Object[0]);
          throw new TinkerRuntimeException("resource file md5 mismatch, but patch resource file not found!");
        }
        com.tencent.tinker.lib.e.a.e("Tinker.TinkerLoadResult", "patch resource file md5 is mismatch: %s", new Object[] { paramd.ygM.getAbsolutePath() });
        paramApplicationLike.ygs.a(paramd.ygM, 6);
        break;
      case -15: 
        paramApplicationLike.ygs.b(1, ShareIntentUtil.au(paramc));
        break;
      case -16: 
        paramApplicationLike.ygs.b(2, ShareIntentUtil.au(paramc));
        break;
      case 0: 
        com.tencent.tinker.lib.e.a.i("Tinker.TinkerLoadResult", "oh yeah, tinker load all success", new Object[0]);
        paramApplicationLike.ygy = true;
        paramd.ygN = ShareIntentUtil.av(paramc);
        paramd.ygO = ShareIntentUtil.aw(paramc);
        paramd.ygP = ShareIntentUtil.ax(paramc);
        if (paramd.ygF) {
          paramApplicationLike.ygs.b(0, null);
        }
        if ((bool2) && (paramd.ygE)) {
          paramApplicationLike.ygs.a(paramb, parama, paramClass, paramd.ygH.getName());
        }
        break;
      }
    }
  }
  
  public static a csM()
  {
    if (yqx == null) {
      throw new TinkerRuntimeException("you must init TinkerClient sdk first");
    }
    return yqx;
  }
  
  public final a Gt(int paramInt)
  {
    if (this.yqz == null)
    {
      com.tencent.tinker.lib.e.a.e("Tinker.TinkerClient", "setFetchPatchIntervalByHours, tinkerServerClient == null, just return", new Object[0]);
      return yqx;
    }
    com.tencent.tinker.lib.e.a.i("Tinker.TinkerClient", "setFetchPatchIntervalByHours to %d hours", new Object[] { Integer.valueOf(paramInt) });
    com.tinkerboots.sdk.a.a locala = this.yqz;
    if (paramInt == -1L)
    {
      com.tencent.tinker.lib.e.a.i("Tinker.ServerClient", "Warning, disableFetchPatchUpdate", new Object[0]);
      com.tinkerboots.sdk.b.b.getContext().getSharedPreferences("patch_server_config", 0).edit().putLong("fetch_patch_last_check", -1L).commit();
    }
    for (;;)
    {
      return yqx;
      if ((paramInt < 0) || (paramInt > 24)) {
        throw new TinkerRuntimeException("hours must be between 0 and 24");
      }
      locala.yqG = (paramInt * 3600L * 1000L);
    }
  }
  
  public final a fK(String paramString1, String paramString2)
  {
    if (this.yqz == null)
    {
      com.tencent.tinker.lib.e.a.e("Tinker.TinkerClient", "setPatchCondition, tinkerServerClient == null, just return", new Object[0]);
      return yqx;
    }
    com.tencent.tinker.lib.e.a.i("Tinker.TinkerClient", "setPatchCondition %s with value %s", new Object[] { paramString1, paramString2 });
    this.yqz.yqH.yqJ.yqK.put(paramString1, paramString2);
    return yqx;
  }
  
  public final a nj(final boolean paramBoolean)
  {
    int k = 1;
    if ((this.yqz == null) || (this.yqy == null))
    {
      com.tencent.tinker.lib.e.a.e("Tinker.TinkerClient", "fetchPatchUpdate, tinkerServerClient or tinkerClient is null, just return", new Object[0]);
      return yqx;
    }
    Context localContext = com.tinkerboots.sdk.b.b.getContext();
    int i;
    if (Build.VERSION.SDK_INT < 23)
    {
      i = k;
      if (i == 0)
      {
        com.tencent.tinker.lib.e.a.e("Tinker.TinkerClient", "fetchPatchUpdate, permission refuse, you must access INTERNET and ACCESS_NETWORK_STATE permission first", new Object[0]);
        return yqx;
      }
    }
    else
    {
      if (localContext.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0)
      {
        i = 1;
        label84:
        if (localContext.checkSelfPermission("android.permission.INTERNET") != 0) {
          break label118;
        }
      }
      label118:
      for (int j = 1;; j = 0)
      {
        if (i != 0)
        {
          i = k;
          if (j != 0) {
            break;
          }
        }
        i = 0;
        break;
        i = 0;
        break label84;
      }
    }
    if ((!ShareTinkerInternals.Gh(this.yqy.tinkerFlags)) || (!ShareTinkerInternals.ie(localContext)))
    {
      com.tencent.tinker.lib.e.a.e("Tinker.TinkerClient", "fetchPatchUpdate, tinker is disable, just return", new Object[0]);
      return yqx;
    }
    if (this.yqy.qoU)
    {
      Looper.getMainLooper();
      Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler()
      {
        public final boolean queueIdle()
        {
          Object localObject1 = a.this.yqz;
          boolean bool = paramBoolean;
          Object localObject2 = com.tinkerboots.sdk.b.b.getContext().getSharedPreferences("patch_server_config", 0);
          long l = ((SharedPreferences)localObject2).getLong("fetch_patch_last_check", 0L);
          if (l == -1L) {
            com.tencent.tinker.lib.e.a.i("Tinker.ServerClient", "tinker sync is disabled, with never check flag!", new Object[0]);
          }
          do
          {
            return false;
            l = System.currentTimeMillis() - l;
            if ((!bool) && (!((com.tinkerboots.sdk.a.a)localObject1).yqI) && (l < ((com.tinkerboots.sdk.a.a)localObject1).yqG)) {
              break;
            }
            ((SharedPreferences)localObject2).edit().putLong("fetch_patch_last_check", System.currentTimeMillis()).commit();
            localObject2 = ((com.tinkerboots.sdk.a.a)localObject1).yqH;
            localObject1 = ((com.tinkerboots.sdk.a.a)localObject1).yqE;
            if (localObject1 == null) {
              throw new RuntimeException("callback can't be null");
            }
          } while (!((com.tinkerboots.sdk.a.a.b)localObject1).aHv());
          ((com.tinkerboots.sdk.a.a.b)localObject1).aHw();
          ((com.tinkerboots.sdk.a.a.b)localObject1).w(((com.tinkerboots.sdk.a.b.a)localObject2).yqJ.yqK);
          return false;
          com.tencent.tinker.lib.e.a.i("Tinker.ServerClient", "tinker sync should wait interval %ss", new Object[] { Long.valueOf((((com.tinkerboots.sdk.a.a)localObject1).yqG - l) / 1000L) });
          return false;
        }
      });
    }
    return yqx;
  }
  
  public static final class a
  {
    public final ApplicationLike applicationLike;
    public final Context context;
    public com.tencent.tinker.lib.a.b ygr;
    public c ygs;
    public com.tencent.tinker.lib.c.d ygt;
    public com.tencent.tinker.lib.b.a yqC;
    public Class<? extends AbstractResultService> yqD;
    public com.tinkerboots.sdk.a.a.b yqE;
    
    public a(ApplicationLike paramApplicationLike)
    {
      if (paramApplicationLike == null) {
        throw new TinkerRuntimeException("applicationLike must not be null.");
      }
      this.context = paramApplicationLike.getApplication();
      this.applicationLike = paramApplicationLike;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tinkerboots\sdk\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
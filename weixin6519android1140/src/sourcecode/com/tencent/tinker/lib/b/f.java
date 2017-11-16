package com.tencent.tinker.lib.b;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import com.tencent.tinker.loader.shareutil.ShareSecurityCheck;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public final class f
  extends a
{
  public final boolean a(Context paramContext, String paramString, com.tencent.tinker.lib.service.a parama)
  {
    com.tencent.tinker.lib.d.a locala = com.tencent.tinker.lib.d.a.hQ(paramContext);
    File localFile1 = new File(paramString);
    if ((!ShareTinkerInternals.Gh(locala.tinkerFlags)) || (!ShareTinkerInternals.ie(paramContext)))
    {
      com.tencent.tinker.lib.e.a.e("Tinker.UpgradePatch", "UpgradePatch tryPatch:patch is disabled, just return", new Object[0]);
      return false;
    }
    if (!SharePatchFileUtil.Z(localFile1))
    {
      com.tencent.tinker.lib.e.a.e("Tinker.UpgradePatch", "UpgradePatch tryPatch:patch file is not found, just return", new Object[0]);
      return false;
    }
    Object localObject1 = new ShareSecurityCheck(paramContext);
    int i = ShareTinkerInternals.a(paramContext, locala.tinkerFlags, localFile1, (ShareSecurityCheck)localObject1);
    if (i != 0)
    {
      com.tencent.tinker.lib.e.a.e("Tinker.UpgradePatch", "UpgradePatch tryPatch:onPatchPackageCheckFail", new Object[0]);
      locala.ygt.d(localFile1, i);
      return false;
    }
    String str = SharePatchFileUtil.ac(localFile1);
    if (str == null)
    {
      com.tencent.tinker.lib.e.a.e("Tinker.UpgradePatch", "UpgradePatch tryPatch:patch md5 is null, just return", new Object[0]);
      return false;
    }
    parama.ygl = str;
    com.tencent.tinker.lib.e.a.i("Tinker.UpgradePatch", "UpgradePatch tryPatch:patchMd5:%s", new Object[] { str });
    Object localObject2 = locala.ygq.getAbsolutePath();
    parama = SharePatchFileUtil.YF((String)localObject2);
    File localFile2 = SharePatchFileUtil.YE((String)localObject2);
    Object localObject3 = SharePatchInfo.n(localFile2, parama);
    if (localObject3 != null)
    {
      if ((((SharePatchInfo)localObject3).yiI == null) || (((SharePatchInfo)localObject3).yiJ == null) || (((SharePatchInfo)localObject3).ygD == null))
      {
        com.tencent.tinker.lib.e.a.e("Tinker.UpgradePatch", "UpgradePatch tryPatch:onPatchInfoCorrupted", new Object[0]);
        locala.ygt.a(localFile1, ((SharePatchInfo)localObject3).yiI, ((SharePatchInfo)localObject3).yiJ);
        return false;
      }
      if (!SharePatchFileUtil.YI(str))
      {
        com.tencent.tinker.lib.e.a.e("Tinker.UpgradePatch", "UpgradePatch tryPatch:onPatchVersionCheckFail md5 %s is valid", new Object[] { str });
        locala.ygt.a(localFile1, (SharePatchInfo)localObject3, str);
        return false;
      }
      if (((SharePatchInfo)localObject3).ygD.equals("interpet")) {
        paramString = "changing";
      }
    }
    for (paramString = new SharePatchInfo(((SharePatchInfo)localObject3).yiI, str, Build.FINGERPRINT, paramString);; paramString = new SharePatchInfo("", str, Build.FINGERPRINT, "odex"))
    {
      localObject3 = SharePatchFileUtil.YG(str);
      localObject3 = (String)localObject2 + "/" + (String)localObject3;
      com.tencent.tinker.lib.e.a.i("Tinker.UpgradePatch", "UpgradePatch tryPatch:patchVersionDirectory:%s", new Object[] { localObject3 });
      localObject2 = new File((String)localObject3 + "/" + SharePatchFileUtil.YH(str));
      try
      {
        if (!str.equals(SharePatchFileUtil.ac((File)localObject2)))
        {
          SharePatchFileUtil.l(localFile1, (File)localObject2);
          com.tencent.tinker.lib.e.a.w("Tinker.UpgradePatch", "UpgradePatch copy patch file, src file: %s size: %d, dest file: %s size:%d", new Object[] { localFile1.getAbsolutePath(), Long.valueOf(localFile1.length()), ((File)localObject2).getAbsolutePath(), Long.valueOf(((File)localObject2).length()) });
        }
        if (d.a(locala, (ShareSecurityCheck)localObject1, paramContext, (String)localObject3, (File)localObject2)) {
          break label607;
        }
        com.tencent.tinker.lib.e.a.e("Tinker.UpgradePatch", "UpgradePatch tryPatch:new patch recover, try patch dex failed", new Object[0]);
        return false;
      }
      catch (IOException paramContext)
      {
        com.tencent.tinker.lib.e.a.e("Tinker.UpgradePatch", "UpgradePatch tryPatch:copy patch file fail from %s to %s", new Object[] { localFile1.getPath(), ((File)localObject2).getPath() });
        locala.ygt.a(localFile1, (File)localObject2, localFile1.getName(), 1);
        return false;
      }
      paramString = ((SharePatchInfo)localObject3).ygD;
      break;
    }
    label607:
    boolean bool;
    if (!ShareTinkerInternals.Ge(locala.tinkerFlags))
    {
      com.tencent.tinker.lib.e.a.w("Tinker.BsDiffPatchInternal", "patch recover, library is not enabled", new Object[0]);
      bool = true;
    }
    long l;
    while (!bool)
    {
      com.tencent.tinker.lib.e.a.e("Tinker.UpgradePatch", "UpgradePatch tryPatch:new patch recover, try patch library failed", new Object[0]);
      return false;
      str = (String)((ShareSecurityCheck)localObject1).yiV.get("assets/so_meta.txt");
      if (str == null)
      {
        com.tencent.tinker.lib.e.a.w("Tinker.BsDiffPatchInternal", "patch recover, library is not contained", new Object[0]);
        bool = true;
      }
      else
      {
        l = SystemClock.elapsedRealtime();
        bool = c.a(paramContext, (String)localObject3 + "/lib/", str, (File)localObject2);
        com.tencent.tinker.lib.e.a.i("Tinker.BsDiffPatchInternal", "recover lib result:%b, cost:%d", new Object[] { Boolean.valueOf(bool), Long.valueOf(SystemClock.elapsedRealtime() - l) });
      }
    }
    if (!ShareTinkerInternals.Gf(locala.tinkerFlags))
    {
      com.tencent.tinker.lib.e.a.w("Tinker.ResDiffPatchInternal", "patch recover, resource is not enabled", new Object[0]);
      bool = true;
    }
    while (!bool)
    {
      com.tencent.tinker.lib.e.a.e("Tinker.UpgradePatch", "UpgradePatch tryPatch:new patch recover, try patch resource failed", new Object[0]);
      return false;
      localObject1 = (String)((ShareSecurityCheck)localObject1).yiV.get("assets/res_meta.txt");
      if ((localObject1 == null) || (((String)localObject1).length() == 0))
      {
        com.tencent.tinker.lib.e.a.w("Tinker.ResDiffPatchInternal", "patch recover, resource is not contained", new Object[0]);
        bool = true;
      }
      else
      {
        l = SystemClock.elapsedRealtime();
        if (!e.c(paramContext, (String)localObject3 + "/res/", (String)localObject1, (File)localObject2)) {
          com.tencent.tinker.lib.e.a.w("Tinker.ResDiffPatchInternal", "patch recover, extractDiffInternals fail", new Object[0]);
        }
        for (bool = false;; bool = true)
        {
          com.tencent.tinker.lib.e.a.i("Tinker.ResDiffPatchInternal", "recover resource result:%b, cost:%d", new Object[] { Boolean.valueOf(bool), Long.valueOf(SystemClock.elapsedRealtime() - l) });
          break;
        }
      }
    }
    if (!d.a(localFile1, locala))
    {
      com.tencent.tinker.lib.e.a.e("Tinker.UpgradePatch", "UpgradePatch tryPatch:new patch recover, check dex opt file failed", new Object[0]);
      return false;
    }
    if (!SharePatchInfo.a(localFile2, paramString, parama))
    {
      com.tencent.tinker.lib.e.a.e("Tinker.UpgradePatch", "UpgradePatch tryPatch:new patch recover, rewrite patch info failed", new Object[0]);
      locala.ygt.a(localFile1, paramString.yiI, paramString.yiJ);
      return false;
    }
    com.tencent.tinker.lib.e.a.w("Tinker.UpgradePatch", "UpgradePatch tryPatch: done, it is ok", new Object[0]);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tinker\lib\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
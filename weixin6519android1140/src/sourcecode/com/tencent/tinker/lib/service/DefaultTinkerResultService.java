package com.tencent.tinker.lib.service;

import android.os.Process;
import com.tencent.tinker.lib.d.d;
import com.tencent.tinker.lib.e.b;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import java.io.File;

public class DefaultTinkerResultService
  extends AbstractResultService
{
  public static void T(File paramFile)
  {
    if (!SharePatchFileUtil.Z(paramFile)) {}
    Object localObject;
    do
    {
      return;
      com.tencent.tinker.lib.e.a.w("Tinker.DefaultTinkerResultService", "deleteRawPatchFile rawFile path: %s", new Object[] { paramFile.getPath() });
      localObject = paramFile.getName();
      if ((!((String)localObject).startsWith("patch-")) || (!((String)localObject).endsWith(".apk")))
      {
        SharePatchFileUtil.ab(paramFile);
        return;
      }
      localObject = paramFile.getParentFile();
      if (!((File)localObject).getName().startsWith("patch-"))
      {
        SharePatchFileUtil.ab(paramFile);
        return;
      }
    } while (((File)localObject).getParentFile().getName().equals("tinker"));
    SharePatchFileUtil.ab(paramFile);
  }
  
  public void a(a parama)
  {
    if (parama == null) {
      com.tencent.tinker.lib.e.a.e("Tinker.DefaultTinkerResultService", "DefaultTinkerResultService received null result!!!!", new Object[0]);
    }
    do
    {
      return;
      com.tencent.tinker.lib.e.a.i("Tinker.DefaultTinkerResultService", "DefaultTinkerResultService received a result:%s ", new Object[] { parama.toString() });
      b.hR(getApplicationContext());
    } while (!parama.eFN);
    T(new File(parama.ygk));
    if (b(parama))
    {
      Process.killProcess(Process.myPid());
      return;
    }
    com.tencent.tinker.lib.e.a.i("Tinker.DefaultTinkerResultService", "I have already install the newly patch version!", new Object[0]);
  }
  
  public final boolean b(a parama)
  {
    Object localObject = com.tencent.tinker.lib.d.a.hQ(getApplicationContext());
    if (((com.tencent.tinker.lib.d.a)localObject).ygy)
    {
      localObject = ((com.tencent.tinker.lib.d.a)localObject).ygx;
      if (localObject != null)
      {
        localObject = ((d)localObject).ygC;
        if ((parama.ygl != null) && (parama.ygl.equals(localObject))) {
          return false;
        }
      }
    }
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tinker\lib\service\DefaultTinkerResultService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
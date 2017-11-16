package com.tencent.tinker.lib.a;

import android.content.Context;
import com.tencent.tinker.lib.d.d;
import com.tencent.tinker.lib.service.TinkerPatchService;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.io.File;

public class a
  implements b
{
  public final Context context;
  
  public a(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public final int YA(String paramString)
  {
    int i = cC(paramString, SharePatchFileUtil.ac(new File(paramString)));
    if (i == 0)
    {
      TinkerPatchService.bL(this.context, paramString);
      return i;
    }
    com.tencent.tinker.lib.d.a.hQ(this.context).ygs.c(new File(paramString), i);
    return i;
  }
  
  public int cC(String paramString1, String paramString2)
  {
    com.tencent.tinker.lib.d.a locala = com.tencent.tinker.lib.d.a.hQ(this.context);
    if ((!ShareTinkerInternals.Gh(locala.tinkerFlags)) || (!ShareTinkerInternals.ie(this.context))) {
      return -1;
    }
    if (!SharePatchFileUtil.Z(new File(paramString1))) {
      return -2;
    }
    if (locala.ygw) {
      return -4;
    }
    if (com.tencent.tinker.lib.e.b.hS(this.context)) {
      return -3;
    }
    if (ShareTinkerInternals.cqN()) {
      return -5;
    }
    paramString1 = com.tencent.tinker.lib.d.a.hQ(this.context);
    if (paramString1.ygy)
    {
      paramString1 = paramString1.ygx;
      if ((paramString1 != null) && (!paramString1.ygF) && (paramString2.equals(paramString1.ygC))) {
        return -6;
      }
    }
    if (!com.tencent.tinker.lib.e.c.hV(this.context).YC(paramString2)) {
      return -7;
    }
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tinker\lib\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
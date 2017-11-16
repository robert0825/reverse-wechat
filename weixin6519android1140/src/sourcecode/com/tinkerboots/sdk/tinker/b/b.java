package com.tinkerboots.sdk.tinker.b;

import android.content.Context;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tinkerboots.sdk.b.c;
import java.io.File;

public final class b
  extends com.tencent.tinker.lib.a.a
{
  public b(Context paramContext)
  {
    super(paramContext);
  }
  
  public final int cC(String paramString1, String paramString2)
  {
    int i = 0;
    com.tencent.tinker.lib.e.a.i("Tinker.TinkerServerPatchListener", "receive a patch file: %s, file size:%d", new Object[] { paramString1, Long.valueOf(SharePatchFileUtil.aa(new File(paramString1))) });
    int j = super.cC(paramString1, paramString2);
    if (j == 0)
    {
      if (c.csP()) {
        i = -20;
      }
      return i;
    }
    return j;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tinkerboots\sdk\tinker\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
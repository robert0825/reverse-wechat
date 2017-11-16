package com.tencent.mm.by;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory.Options;
import android.util.DisplayMetrics;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;

public final class a
{
  public static void Xk(String paramString)
  {
    int i = 0;
    GMTrace.i(19627463671808L, 146236);
    w.i("MicroMsg.MMPhotoEditUtil", "[deleteDirAllFile] dir:%s", new Object[] { paramString });
    paramString = new File(paramString);
    if (paramString.exists())
    {
      paramString = paramString.listFiles();
      if (paramString != null)
      {
        int j = paramString.length;
        while (i < j)
        {
          Object localObject = paramString[i];
          if ((((File)localObject).isFile()) && (!bg.nm(((File)localObject).getName())) && (((File)localObject).getName().startsWith("wx_photo_edit_"))) {
            ((File)localObject).delete();
          }
          i += 1;
        }
      }
    }
    GMTrace.o(19627463671808L, 146236);
  }
  
  public static int a(BitmapFactory.Options paramOptions, int paramInt1, int paramInt2)
  {
    GMTrace.i(19627329454080L, 146235);
    int k = paramOptions.outHeight;
    int m = paramOptions.outWidth;
    int i = 1;
    int j;
    for (;;)
    {
      j = i;
      if (m / i <= paramInt1) {
        break;
      }
      i += 1;
    }
    while (k / j > paramInt2) {
      j += 1;
    }
    GMTrace.o(19627329454080L, 146235);
    return j;
  }
  
  public static int aC(float paramFloat)
  {
    GMTrace.i(19627195236352L, 146234);
    int i = (int)(ab.getContext().getResources().getDisplayMetrics().density * paramFloat + 0.5F);
    GMTrace.o(19627195236352L, 146234);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\by\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.app.plugin;

import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.p.h;
import com.tencent.mm.pluginsdk.ui.applet.k;
import com.tencent.mm.pluginsdk.ui.d.a;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public final class c
  implements p.h
{
  public c()
  {
    GMTrace.i(13038178533376L, 97142);
    GMTrace.o(13038178533376L, 97142);
  }
  
  private static String a(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    GMTrace.i(13038446968832L, 97144);
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)) || (paramInt1 >= paramInt2))
    {
      GMTrace.o(13038446968832L, 97144);
      return paramString1;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      localStringBuilder.append(paramString1.subSequence(0, paramInt1 + 0));
      localStringBuilder.append(paramString2);
      localStringBuilder.append(paramString1.subSequence(paramInt2 + 0, paramString1.length()));
      paramString2.length();
      paramString1 = localStringBuilder.toString();
      GMTrace.o(13038446968832L, 97144);
      return paramString1;
    }
    catch (Exception paramString1)
    {
      w.e("MicroMsg.QrCodeURLHelper", paramString1.getMessage());
      GMTrace.o(13038446968832L, 97144);
    }
    return "";
  }
  
  public final boolean a(Context paramContext, String paramString, DialogInterface.OnDismissListener paramOnDismissListener)
  {
    GMTrace.i(13038581186560L, 97145);
    w.d("MicroMsg.QrCodeURLHelper", "tryHandleEvents, url:%s", new Object[] { paramString });
    if (bg.nm(paramString))
    {
      GMTrace.o(13038581186560L, 97145);
      return false;
    }
    if (paramString.endsWith("@mailto@")) {
      j.b(paramContext, paramString.substring(0, paramString.length() - 8), paramOnDismissListener);
    }
    for (;;)
    {
      GMTrace.o(13038581186560L, 97145);
      return true;
      if (!paramString.endsWith("@tel@")) {
        break;
      }
      paramString = paramString.substring(0, paramString.length() - 5);
      Bundle localBundle = new Bundle();
      localBundle.putInt("fromScene", 3);
      j.a(paramContext, paramString, paramOnDismissListener, localBundle);
    }
    GMTrace.o(13038581186560L, 97145);
    return false;
  }
  
  public final boolean bP(String paramString)
  {
    GMTrace.i(13038715404288L, 97146);
    if ((paramString == null) || (paramString.length() == 0))
    {
      GMTrace.o(13038715404288L, 97146);
      return false;
    }
    if ((paramString.endsWith("@mailto@")) || (paramString.endsWith("@tel@")))
    {
      GMTrace.o(13038715404288L, 97146);
      return true;
    }
    GMTrace.o(13038715404288L, 97146);
    return false;
  }
  
  public final String p(Context paramContext, String paramString)
  {
    GMTrace.i(13038312751104L, 97143);
    paramContext = a.aV(paramContext, paramString);
    if (paramContext.size() == 0)
    {
      GMTrace.o(13038312751104L, 97143);
      return paramString;
    }
    Collections.sort(paramContext, new Comparator() {});
    Iterator localIterator = paramContext.iterator();
    paramContext = paramString;
    String str1;
    label128:
    String str2;
    if (localIterator.hasNext())
    {
      k localk = (k)localIterator.next();
      str1 = null;
      int i = localk.start;
      int j = localk.end;
      switch (localk.type)
      {
      default: 
        if (str1 != null)
        {
          str2 = localk.url;
          if ((localk.type == 1) && (!str2.startsWith("http://")))
          {
            str1 = String.format(str1, new Object[] { "http://" + str2.trim(), str2.trim() });
            label201:
            str1 = a(paramContext, i, j, str1);
            paramContext = str1;
            if (str1.length() != 0) {
              break label299;
            }
          }
        }
        break;
      }
    }
    for (;;)
    {
      w.d("MicroMsg.QrCodeURLHelper", "formatQRString, result:%s", new Object[] { paramString });
      GMTrace.o(13038312751104L, 97143);
      return paramString;
      str1 = "<a href=\"%s@tel@\">%s</a>";
      break label128;
      str1 = "<a href=\"%s@mailto@\">%s</a>";
      break label128;
      str1 = "<a href=\"%s\">%s</a>";
      break label128;
      str1 = String.format(str1, new Object[] { str2.trim(), str2.trim() });
      break label201;
      label299:
      break;
      paramString = paramContext;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\app\plugin\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
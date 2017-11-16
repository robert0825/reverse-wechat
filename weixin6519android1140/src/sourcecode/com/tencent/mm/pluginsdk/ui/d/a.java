package com.tencent.mm.pluginsdk.ui.d;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.ui.applet.k;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a
{
  public static k a(Context paramContext, String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(1203396149248L, 8966);
    paramContext = a(paramContext, paramString, paramInt1, paramInt2, 0, 0);
    GMTrace.o(1203396149248L, 8966);
    return paramContext;
  }
  
  public static k a(Context paramContext, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(1203530366976L, 8967);
    Context localContext = paramContext;
    if (paramContext == null) {
      localContext = ab.getContext();
    }
    paramContext = b.a.tDK.q(localContext, paramString);
    if (paramContext != null)
    {
      paramContext.start = paramInt1;
      paramContext.end = paramInt2;
      paramContext.linkColor = paramInt3;
      paramContext.backgroundColor = paramInt4;
    }
    GMTrace.o(1203530366976L, 8967);
    return paramContext;
  }
  
  public static ArrayList<k> aV(Context paramContext, String paramString)
  {
    GMTrace.i(1203261931520L, 8965);
    ArrayList localArrayList = new ArrayList();
    paramString = g.a.tDR.matcher(paramString);
    while (paramString.find())
    {
      int i = paramString.start();
      int j = paramString.end();
      k localk = a(paramContext, paramString.group(), i, j);
      if (localk != null) {
        localArrayList.add(localk);
      }
    }
    GMTrace.o(1203261931520L, 8965);
    return localArrayList;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
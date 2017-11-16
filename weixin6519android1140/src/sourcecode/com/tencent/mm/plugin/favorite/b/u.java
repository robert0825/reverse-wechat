package com.tencent.mm.plugin.favorite.b;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.j;
import com.tencent.mm.R.l;
import java.util.GregorianCalendar;

public final class u
{
  public static CharSequence d(Context paramContext, long paramLong)
  {
    GMTrace.i(6294543007744L, 46898);
    if (paramLong < 3600000L)
    {
      GMTrace.o(6294543007744L, 46898);
      return "";
    }
    GregorianCalendar localGregorianCalendar1 = new GregorianCalendar();
    GregorianCalendar localGregorianCalendar2 = new GregorianCalendar(localGregorianCalendar1.get(1), localGregorianCalendar1.get(2), localGregorianCalendar1.get(5));
    long l = paramLong - localGregorianCalendar2.getTimeInMillis();
    if ((l > 0L) && (l <= 86400000L))
    {
      paramContext = paramContext.getString(R.l.dwT);
      GMTrace.o(6294543007744L, 46898);
      return paramContext;
    }
    l = localGregorianCalendar2.getTimeInMillis() - paramLong;
    if ((l > 0L) && (l <= 86400000L))
    {
      paramContext = paramContext.getString(R.l.dwU);
      GMTrace.o(6294543007744L, 46898);
      return paramContext;
    }
    new GregorianCalendar().setTimeInMillis(paramLong);
    int j = (int)((localGregorianCalendar1.getTimeInMillis() - paramLong) / 86400000L);
    int i = j;
    if (j <= 0) {
      i = 1;
    }
    if (i > 30)
    {
      paramContext = DateFormat.format(paramContext.getString(R.l.dtZ), paramLong);
      GMTrace.o(6294543007744L, 46898);
      return paramContext;
    }
    paramContext = paramContext.getResources().getQuantityString(R.j.cIn, i, new Object[] { Integer.valueOf(i) });
    GMTrace.o(6294543007744L, 46898);
    return paramContext;
  }
  
  public static CharSequence t(Context paramContext, int paramInt)
  {
    GMTrace.i(6294408790016L, 46897);
    if (paramInt <= 0)
    {
      paramContext = paramContext.getString(R.l.duH, new Object[] { Integer.valueOf(0), Integer.valueOf(0) });
      GMTrace.o(6294408790016L, 46897);
      return paramContext;
    }
    int i = paramInt / 60;
    paramContext = paramContext.getString(R.l.duH, new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt % 60) });
    GMTrace.o(6294408790016L, 46897);
    return paramContext;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\b\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
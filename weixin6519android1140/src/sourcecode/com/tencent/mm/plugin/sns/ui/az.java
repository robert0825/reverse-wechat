package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.b;
import com.tencent.mm.plugin.sns.i.h;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class az
{
  private static Map<String, List<String>> mdK;
  private static Map<String, List<String>> mdL;
  private static HashMap<Long, Long> mdM;
  private static HashMap<Long, String> mdN;
  
  static
  {
    GMTrace.i(8373575614464L, 62388);
    mdK = new HashMap();
    mdL = new HashMap();
    mdM = new HashMap();
    mdN = new HashMap();
    GMTrace.o(8373575614464L, 62388);
  }
  
  private static String G(Context paramContext, int paramInt)
  {
    GMTrace.i(8373172961280L, 62385);
    paramContext = paramContext.getResources().getStringArray(i.b.aMy);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add("");
    int i = 0;
    while (i < paramContext.length)
    {
      localArrayList.add(paramContext[i]);
      i += 1;
    }
    if (paramInt >= localArrayList.size())
    {
      GMTrace.o(8373172961280L, 62385);
      return "";
    }
    paramContext = (String)localArrayList.get(paramInt);
    GMTrace.o(8373172961280L, 62385);
    return paramContext;
  }
  
  public static CharSequence a(Context paramContext, long paramLong, boolean paramBoolean)
  {
    GMTrace.i(8373441396736L, 62387);
    GregorianCalendar localGregorianCalendar = new GregorianCalendar();
    if (paramLong < 3600000L)
    {
      GMTrace.o(8373441396736L, 62387);
      return "";
    }
    localGregorianCalendar = new GregorianCalendar(localGregorianCalendar.get(1), localGregorianCalendar.get(2), localGregorianCalendar.get(5));
    long l = paramLong - localGregorianCalendar.getTimeInMillis();
    if ((l > 0L) && (l <= 86400000L) && (paramBoolean))
    {
      paramContext = paramContext.getString(i.j.dwT);
      GMTrace.o(8373441396736L, 62387);
      return paramContext;
    }
    l = paramLong - localGregorianCalendar.getTimeInMillis() + 86400000L;
    if ((l > 0L) && (l <= 86400000L) && (paramBoolean))
    {
      paramContext = paramContext.getString(i.j.dwU);
      GMTrace.o(8373441396736L, 62387);
      return paramContext;
    }
    new GregorianCalendar().setTimeInMillis(paramLong);
    paramContext = DateFormat.format(paramContext.getString(i.j.phS), paramLong);
    GMTrace.o(8373441396736L, 62387);
    return paramContext;
  }
  
  private static void aw(Context paramContext, String paramString)
  {
    GMTrace.i(8373038743552L, 62384);
    paramContext = paramContext.getResources().getStringArray(i.b.aMy);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add("");
    int i = 0;
    while (i < paramContext.length)
    {
      localArrayList.add(paramContext[i]);
      i += 1;
    }
    mdL.put(paramString, localArrayList);
    GMTrace.o(8373038743552L, 62384);
  }
  
  public static void clean()
  {
    try
    {
      GMTrace.i(8372770308096L, 62382);
      mdM.clear();
      mdN.clear();
      GMTrace.o(8372770308096L, 62382);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static String e(Context paramContext, long paramLong)
  {
    int j = 1;
    int i = 1;
    long l1;
    for (;;)
    {
      try
      {
        GMTrace.i(8372904525824L, 62383);
        localGregorianCalendar = new GregorianCalendar();
        if (paramLong < 3600000L)
        {
          paramContext = "";
          GMTrace.o(8372904525824L, 62383);
          return paramContext;
        }
        l1 = localGregorianCalendar.getTimeInMillis();
        if (mdM.containsKey(Long.valueOf(paramLong))) {
          if (l1 - ((Long)mdM.get(Long.valueOf(paramLong))).longValue() < 60000L)
          {
            if (mdN.containsKey(Long.valueOf(paramLong)))
            {
              paramContext = (String)mdN.get(Long.valueOf(paramLong));
              GMTrace.o(8372904525824L, 62383);
            }
          }
          else {
            mdM.remove(Long.valueOf(paramLong));
          }
        }
      }
      finally {}
      if ((l1 - paramLong) / 3600000L != 0L) {
        break;
      }
      j = (int)((l1 - paramLong) / 60000L);
      if (j > 0) {
        break label538;
      }
      label179:
      paramContext = paramContext.getResources().getQuantityString(i.h.cIm, i, new Object[] { Integer.valueOf(i) });
      mdN.put(Long.valueOf(paramLong), paramContext);
      mdM.put(Long.valueOf(paramLong), Long.valueOf(l1));
      GMTrace.o(8372904525824L, 62383);
    }
    GregorianCalendar localGregorianCalendar = new GregorianCalendar(localGregorianCalendar.get(1), localGregorianCalendar.get(2), localGregorianCalendar.get(5));
    long l2 = paramLong - localGregorianCalendar.getTimeInMillis();
    if ((l2 > 0L) && (l2 <= 86400000L))
    {
      i = (int)((l1 - paramLong) / 3600000L);
      if (i > 0) {
        break label544;
      }
      i = j;
    }
    label538:
    label544:
    for (;;)
    {
      paramContext = paramContext.getResources().getQuantityString(i.h.cIl, i, new Object[] { Integer.valueOf(i) });
      mdN.put(Long.valueOf(paramLong), paramContext);
      mdM.put(Long.valueOf(paramLong), Long.valueOf(l1));
      GMTrace.o(8372904525824L, 62383);
      break;
      l2 = paramLong - localGregorianCalendar.getTimeInMillis() + 86400000L;
      if ((l2 > 0L) && (l2 <= 86400000L))
      {
        paramContext = paramContext.getString(i.j.dwU);
        mdN.put(Long.valueOf(paramLong), paramContext);
        mdM.put(Long.valueOf(paramLong), Long.valueOf(l1));
        GMTrace.o(8372904525824L, 62383);
        break;
      }
      j = (int)((localGregorianCalendar.getTimeInMillis() + 86400000L - paramLong) / 86400000L);
      i = j;
      if (j <= 0) {
        i = 1;
      }
      paramContext = paramContext.getResources().getQuantityString(i.h.cIn, i, new Object[] { Integer.valueOf(i) });
      mdN.put(Long.valueOf(paramLong), paramContext);
      mdM.put(Long.valueOf(paramLong), Long.valueOf(l1));
      GMTrace.o(8372904525824L, 62383);
      break;
      i = j;
      break label179;
    }
  }
  
  private static CharSequence f(Context paramContext, long paramLong)
  {
    GMTrace.i(8372367654912L, 62379);
    paramContext = DateFormat.format(paramContext.getString(i.j.dwR), paramLong);
    GMTrace.o(8372367654912L, 62379);
    return paramContext;
  }
  
  public static String j(Context paramContext, long paramLong)
  {
    int n = 0;
    GMTrace.i(8372501872640L, 62380);
    Object localObject = Calendar.getInstance();
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTimeInMillis(paramLong);
    int k;
    int i;
    label67:
    int m;
    label94:
    label122:
    int j;
    if (((Calendar)localObject).get(1) == localCalendar.get(1))
    {
      k = 1;
      if ((k == 0) || (((Calendar)localObject).get(2) != localCalendar.get(2))) {
        break label249;
      }
      i = 1;
      if ((k == 0) || (i == 0) || (((Calendar)localObject).get(5) != localCalendar.get(5))) {
        break label254;
      }
      m = 1;
      if ((k == 0) || (i == 0) || (((Calendar)localObject).get(5) - 1 != localCalendar.get(5))) {
        break label260;
      }
      i = 1;
      if (i != 0) {
        break label526;
      }
      if ((k == 0) || (((Calendar)localObject).get(2) - 1 != localCalendar.get(2))) {
        break label265;
      }
      j = 1;
    }
    for (;;)
    {
      label151:
      if (j != 0)
      {
        ((Calendar)localObject).add(5, -1);
        i = n;
        if (((Calendar)localObject).get(1) == localCalendar.get(1))
        {
          i = n;
          if (((Calendar)localObject).get(2) == localCalendar.get(2))
          {
            i = n;
            if (((Calendar)localObject).get(5) == localCalendar.get(5)) {
              i = 1;
            }
          }
        }
      }
      label249:
      label254:
      label260:
      label265:
      label526:
      for (;;)
      {
        if (m != 0)
        {
          paramContext = (String)f(paramContext, paramLong);
          GMTrace.o(8372501872640L, 62380);
          return paramContext;
          k = 0;
          break;
          i = 0;
          break label67;
          m = 0;
          break label94;
          i = 0;
          break label122;
          if (((Calendar)localObject).get(1) - localCalendar.get(1) != 1) {
            break label529;
          }
          j = 1;
          break label151;
        }
        if (i != 0)
        {
          paramContext = paramContext.getString(i.j.dwU) + " " + (String)f(paramContext, paramLong);
          GMTrace.o(8372501872640L, 62380);
          return paramContext;
        }
        if (k != 0) {}
        for (String str = (String)DateFormat.format(paramContext.getString(i.j.dwA), paramLong);; str = (String)DateFormat.format(paramContext.getString(i.j.dwM), paramLong))
        {
          localObject = str;
          if (str.indexOf("-") > 0)
          {
            i = localCalendar.get(2);
            j = localCalendar.get(5);
            localObject = G(paramContext, i + 1);
            str = j + " " + (String)localObject;
            localObject = str;
            if (k == 0) {
              localObject = str + " " + localCalendar.get(1);
            }
          }
          paramContext = (String)localObject + " " + (String)f(paramContext, paramLong);
          GMTrace.o(8372501872640L, 62380);
          return paramContext;
        }
      }
      label529:
      j = 0;
    }
  }
  
  public static String k(Context paramContext, long paramLong)
  {
    int n = 0;
    GMTrace.i(8372636090368L, 62381);
    Object localObject = Calendar.getInstance();
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTimeInMillis(paramLong);
    int k;
    int i;
    label67:
    int m;
    label94:
    label122:
    int j;
    if (((Calendar)localObject).get(1) == localCalendar.get(1))
    {
      k = 1;
      if ((k == 0) || (((Calendar)localObject).get(2) != localCalendar.get(2))) {
        break label249;
      }
      i = 1;
      if ((k == 0) || (i == 0) || (((Calendar)localObject).get(5) != localCalendar.get(5))) {
        break label254;
      }
      m = 1;
      if ((k == 0) || (i == 0) || (((Calendar)localObject).get(5) - 1 != localCalendar.get(5))) {
        break label260;
      }
      i = 1;
      if (i != 0) {
        break label502;
      }
      if ((k == 0) || (((Calendar)localObject).get(2) - 1 != localCalendar.get(2))) {
        break label265;
      }
      j = 1;
    }
    for (;;)
    {
      label151:
      if (j != 0)
      {
        ((Calendar)localObject).add(5, -1);
        i = n;
        if (((Calendar)localObject).get(1) == localCalendar.get(1))
        {
          i = n;
          if (((Calendar)localObject).get(2) == localCalendar.get(2))
          {
            i = n;
            if (((Calendar)localObject).get(5) == localCalendar.get(5)) {
              i = 1;
            }
          }
        }
      }
      label249:
      label254:
      label260:
      label265:
      label502:
      for (;;)
      {
        if (m != 0)
        {
          paramContext = (String)f(paramContext, paramLong);
          GMTrace.o(8372636090368L, 62381);
          return paramContext;
          k = 0;
          break;
          i = 0;
          break label67;
          m = 0;
          break label94;
          i = 0;
          break label122;
          if (((Calendar)localObject).get(1) - localCalendar.get(1) != 1) {
            break label505;
          }
          j = 1;
          break label151;
        }
        if (i != 0)
        {
          paramContext = paramContext.getString(i.j.dwU) + " " + (String)f(paramContext, paramLong);
          GMTrace.o(8372636090368L, 62381);
          return paramContext;
        }
        String str = (String)DateFormat.format(paramContext.getString(i.j.dwM), paramLong);
        localObject = str;
        if (str.indexOf("-") > 0)
        {
          i = localCalendar.get(2);
          j = localCalendar.get(5);
          localObject = G(paramContext, i + 1);
          str = j + " " + (String)localObject;
          localObject = str;
          if (k == 0) {
            localObject = str + " " + localCalendar.get(1);
          }
        }
        paramContext = (String)localObject + " " + (String)f(paramContext, paramLong);
        GMTrace.o(8372636090368L, 62381);
        return paramContext;
      }
      label505:
      j = 0;
    }
  }
  
  public static String s(Context paramContext, String paramString1, String paramString2)
  {
    GMTrace.i(8373307179008L, 62386);
    if (mdL.get(paramString2) == null) {
      aw(paramContext, paramString2);
    }
    int i = bg.getInt(paramString1, 0);
    paramString1 = (List)mdL.get(paramString2);
    if ((i >= paramString1.size()) || (paramString1.get(i) == null) || (((String)paramString1.get(i)).equals(""))) {
      aw(paramContext, paramString2);
    }
    paramContext = (List)mdL.get(paramString2);
    if (i < paramContext.size())
    {
      paramContext = (String)paramContext.get(i);
      GMTrace.o(8373307179008L, 62386);
      return paramContext;
    }
    GMTrace.o(8373307179008L, 62386);
    return "";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
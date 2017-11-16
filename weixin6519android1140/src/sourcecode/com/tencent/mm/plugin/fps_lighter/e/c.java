package com.tencent.mm.plugin.fps_lighter.e;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import java.util.Collections;

public class c
{
  private static volatile Integer lnO;
  
  public c()
  {
    GMTrace.i(5216103563264L, 38863);
    GMTrace.o(5216103563264L, 38863);
  }
  
  private static void b(ArrayList<Integer> paramArrayList, int paramInt)
  {
    GMTrace.i(5216371998720L, 38865);
    if (paramInt != -1) {
      paramArrayList.add(Integer.valueOf(paramInt));
    }
    GMTrace.o(5216371998720L, 38865);
  }
  
  public static int cv(Context paramContext)
  {
    int k = 2011;
    int j = -1;
    GMTrace.i(5216237780992L, 38864);
    if (lnO == null) {}
    for (;;)
    {
      long l;
      try
      {
        ArrayList localArrayList;
        if (lnO == null)
        {
          l = b.cu(paramContext);
          if (l != -1L) {
            continue;
          }
          localArrayList = new ArrayList();
          i = b.aAp();
          if (i <= 0)
          {
            i = -1;
            b(localArrayList, i);
            l = b.aAq();
            if (l != -1L) {
              continue;
            }
            i = -1;
            b(localArrayList, i);
            l = b.cu(paramContext);
            if (l > 0L) {
              continue;
            }
            i = -1;
            b(localArrayList, i);
            if (!localArrayList.isEmpty()) {
              continue;
            }
            i = j;
            lnO = Integer.valueOf(i);
          }
        }
        else
        {
          i = lnO.intValue();
          GMTrace.o(5216237780992L, 38864);
          return i;
        }
        if (i == 1)
        {
          i = 2008;
          continue;
        }
        if (i <= 3)
        {
          i = 2011;
          continue;
        }
        i = 2012;
        continue;
        if (l <= 528000L)
        {
          i = 2008;
          continue;
        }
        if (l <= 620000L)
        {
          i = 2009;
          continue;
        }
        if (l <= 1020000L)
        {
          i = 2010;
          continue;
        }
        if (l <= 1220000L)
        {
          i = 2011;
          continue;
        }
        if (l <= 1520000L)
        {
          i = 2012;
          continue;
        }
        if (l <= 2020000L)
        {
          i = 2013;
          continue;
        }
        i = 2014;
        continue;
        if (l <= 201326592L)
        {
          i = 2008;
          continue;
        }
        if (l <= 304087040L)
        {
          i = 2009;
          continue;
        }
        if (l <= 536870912L)
        {
          i = 2010;
          continue;
        }
        i = k;
        if (l <= 1073741824L) {
          continue;
        }
        if (l <= 1610612736L)
        {
          i = 2012;
          continue;
        }
        if (l <= 2147483648L)
        {
          i = 2013;
          continue;
        }
        i = 2014;
        continue;
        Collections.sort(localArrayList);
        if ((localArrayList.size() & 0x1) == 1)
        {
          i = ((Integer)localArrayList.get(localArrayList.size() / 2)).intValue();
          continue;
        }
        i = localArrayList.size() / 2 - 1;
        j = ((Integer)localArrayList.get(i)).intValue();
        i = (((Integer)localArrayList.get(i + 1)).intValue() - ((Integer)localArrayList.get(i)).intValue()) / 2 + j;
        continue;
        if (l <= 805306368L)
        {
          if (b.aAp() <= 1) {
            i = 2009;
          }
        }
        else
        {
          if (l <= 1073741824L)
          {
            if (b.aAq() >= 1300000) {
              break label562;
            }
            i = 2011;
            continue;
          }
          if (l > 1610612736L) {
            break label576;
          }
          if (b.aAq() >= 1800000) {
            break label569;
          }
          i = 2012;
          continue;
        }
        i = 2010;
      }
      finally {}
      continue;
      label562:
      int i = 2012;
      continue;
      label569:
      i = 2013;
      continue;
      label576:
      if (l <= 2147483648L) {
        i = 2013;
      } else if (l <= 3221225472L) {
        i = 2014;
      } else {
        i = 2015;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fps_lighter\e\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
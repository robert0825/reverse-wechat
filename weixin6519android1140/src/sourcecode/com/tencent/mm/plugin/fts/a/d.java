package com.tencent.mm.plugin.fts.a;

import android.database.DatabaseUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.af;
import com.tencent.mm.platformtools.SpellMap;
import com.tencent.mm.plugin.emoji.b.a;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class d
{
  private static final HashMap<String, String> lwy;
  private static String[] lwz;
  
  static
  {
    GMTrace.i(18640023846912L, 138879);
    lwy = new HashMap();
    lwz = new String[] { "wxid_", "wx_", "gh_" };
    GMTrace.o(18640023846912L, 138879);
  }
  
  public static int a(Map<Integer, Integer> paramMap, int paramInt1, int paramInt2)
  {
    int i = Integer.MAX_VALUE;
    GMTrace.i(18638681669632L, 138869);
    if (paramInt1 == paramInt2)
    {
      GMTrace.o(18638681669632L, 138869);
      return 0;
    }
    Integer localInteger = (Integer)paramMap.get(Integer.valueOf(paramInt1));
    if (localInteger == null)
    {
      paramInt1 = Integer.MAX_VALUE;
      paramMap = (Integer)paramMap.get(Integer.valueOf(paramInt2));
      if (paramMap != null) {
        break label90;
      }
    }
    label90:
    for (paramInt2 = i;; paramInt2 = paramMap.intValue())
    {
      GMTrace.o(18638681669632L, 138869);
      return paramInt1 - paramInt2;
      paramInt1 = localInteger.intValue();
      break;
    }
  }
  
  public static List<i> a(List<i> paramList, Map<Integer, Integer> paramMap)
  {
    GMTrace.i(18638815887360L, 138870);
    paramMap = new Comparator() {};
    i locali = new i();
    locali.type = 131073;
    int j = Collections.binarySearch(paramList, locali, paramMap);
    locali.type = 131074;
    int k = Collections.binarySearch(paramList, locali, paramMap);
    int i = j;
    if (j < 0)
    {
      j = -j - 1;
      if (k >= 0) {
        break label131;
      }
      i = -k - 1;
    }
    for (;;)
    {
      paramList = paramList.subList(j, i);
      GMTrace.o(18638815887360L, 138870);
      return paramList;
      do
      {
        i -= 1;
      } while ((i >= 0) && (((i)paramList.get(i)).type == 131073));
      j = i + 1;
      break;
      label131:
      int m = paramList.size();
      i = k + 1;
      while ((i < m) && (((i)paramList.get(i)).type == 131074)) {
        i += 1;
      }
    }
  }
  
  public static final HashMap<String, String> aCk()
  {
    GMTrace.i(18638010580992L, 138864);
    HashMap localHashMap = new HashMap();
    Iterator localIterator = lwy.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localHashMap.put(localEntry.getKey(), localEntry.getValue());
    }
    GMTrace.o(18638010580992L, 138864);
    return localHashMap;
  }
  
  public static final void aI(List<i> paramList)
  {
    GMTrace.i(18638144798720L, 138865);
    lwy.clear();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      i locali = (i)paramList.next();
      if ((locali.userData instanceof String)) {
        lwy.put(locali.lwH, (String)locali.userData);
      } else {
        lwy.put(locali.lwH, "");
      }
    }
    GMTrace.o(18638144798720L, 138865);
  }
  
  public static String ad(String paramString, boolean paramBoolean)
  {
    GMTrace.i(18639486976000L, 138875);
    if (paramString == null)
    {
      GMTrace.o(18639486976000L, 138875);
      return null;
    }
    Object localObject3 = yR(paramString).toLowerCase();
    Object localObject2 = new ArrayList();
    int k = 0;
    paramString = null;
    int j = 0;
    int i;
    if (k < ((String)localObject3).length())
    {
      char c = ((String)localObject3).charAt(k);
      if (h(c))
      {
        String str = SpellMap.f(c);
        if ((str != null) && (str.length() > 1))
        {
          localObject1 = paramString;
          if (paramString == null) {
            localObject1 = new ArrayList();
          }
          if (paramBoolean)
          {
            ((List)localObject1).add(String.valueOf(str.charAt(0)));
            i = 1;
          }
          for (paramString = (String)localObject1;; paramString = (String)localObject1)
          {
            k += 1;
            j = i;
            break;
            ((List)localObject1).add(str);
            i = 1;
          }
        }
      }
      if ((paramString != null) && (paramString.size() > 0)) {
        ((List)localObject2).add((String[])paramString.toArray(new String[0]));
      }
      for (;;)
      {
        paramString = null;
        i = j;
        break;
        ((List)localObject2).add(null);
      }
    }
    if ((paramString != null) && (paramString.size() > 0)) {
      ((List)localObject2).add((String[])paramString.toArray(new String[0]));
    }
    paramString = new StringBuffer();
    Object localObject1 = ((List)localObject2).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (String[])((Iterator)localObject1).next();
      if (localObject2 != null)
      {
        localObject3 = new StringBuffer();
        i = 0;
        while (i < localObject2.length)
        {
          k = i;
          while (k < localObject2.length)
          {
            ((StringBuffer)localObject3).append(localObject2[k]);
            k += 1;
          }
          ((StringBuffer)localObject3).append("‍");
          i += 1;
        }
        paramString.append(((StringBuffer)localObject3).toString());
      }
      else
      {
        paramString.append("‍");
      }
    }
    if (j != 0)
    {
      paramString = paramString.toString();
      GMTrace.o(18639486976000L, 138875);
      return paramString;
    }
    GMTrace.o(18639486976000L, 138875);
    return "";
  }
  
  public static int b(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int i = Integer.MAX_VALUE;
    GMTrace.i(18638547451904L, 138868);
    if (paramInt1 == paramInt2)
    {
      GMTrace.o(18638547451904L, 138868);
      return 0;
    }
    if (paramInt1 >= paramArrayOfInt.length)
    {
      paramInt1 = Integer.MAX_VALUE;
      if (paramInt2 < paramArrayOfInt.length) {
        break label62;
      }
    }
    label62:
    for (paramInt2 = i;; paramInt2 = paramArrayOfInt[paramInt2])
    {
      GMTrace.o(18638547451904L, 138868);
      return paramInt1 - paramInt2;
      paramInt1 = paramArrayOfInt[paramInt1];
      break;
    }
  }
  
  public static boolean b(int paramInt, int[] paramArrayOfInt)
  {
    GMTrace.i(18639889629184L, 138878);
    int j = paramArrayOfInt.length;
    int i = 0;
    while (i < j)
    {
      if (paramInt == paramArrayOfInt[i])
      {
        GMTrace.o(18639889629184L, 138878);
        return true;
      }
      i += 1;
    }
    GMTrace.o(18639889629184L, 138878);
    return false;
  }
  
  public static String cm(String paramString1, String paramString2)
  {
    GMTrace.i(18639218540544L, 138873);
    if ((paramString2 != null) && (paramString2.length() > 0))
    {
      GMTrace.o(18639218540544L, 138873);
      return paramString2;
    }
    paramString2 = lwz;
    int j = paramString2.length;
    int i = 0;
    while (i < j)
    {
      if (paramString1.startsWith(paramString2[i]))
      {
        GMTrace.o(18639218540544L, 138873);
        return null;
      }
      i += 1;
    }
    if (paramString1.indexOf('@') >= 0)
    {
      GMTrace.o(18639218540544L, 138873);
      return null;
    }
    GMTrace.o(18639218540544L, 138873);
    return paramString1;
  }
  
  public static boolean f(int[] paramArrayOfInt, int paramInt)
  {
    GMTrace.i(18639755411456L, 138877);
    if (Arrays.binarySearch(paramArrayOfInt, paramInt) >= 0)
    {
      GMTrace.o(18639755411456L, 138877);
      return true;
    }
    GMTrace.o(18639755411456L, 138877);
    return false;
  }
  
  public static boolean h(char paramChar)
  {
    GMTrace.i(18639352758272L, 138874);
    if ((paramChar >= '一') && (paramChar <= 171941))
    {
      GMTrace.o(18639352758272L, 138874);
      return true;
    }
    GMTrace.o(18639352758272L, 138874);
    return false;
  }
  
  public static String j(int[] paramArrayOfInt)
  {
    GMTrace.i(18638279016448L, 138866);
    StringBuilder localStringBuilder = new StringBuilder(32);
    localStringBuilder.append('(');
    int j = paramArrayOfInt.length;
    int i = 0;
    while (i < j)
    {
      localStringBuilder.append(paramArrayOfInt[i]).append(',');
      i += 1;
    }
    localStringBuilder.setCharAt(localStringBuilder.length() - 1, ')');
    paramArrayOfInt = localStringBuilder.toString();
    GMTrace.o(18638279016448L, 138866);
    return paramArrayOfInt;
  }
  
  public static final String t(String[] paramArrayOfString)
  {
    GMTrace.i(18638413234176L, 138867);
    StringBuilder localStringBuilder = new StringBuilder(32);
    int k = paramArrayOfString.length;
    int j = 0;
    if (j < k)
    {
      String str = paramArrayOfString[j];
      localStringBuilder.append("\"");
      localStringBuilder.append(str);
      int i = str.charAt(str.length() - 1);
      if ((i >= 48) && (i <= 57))
      {
        i = 1;
        label79:
        if (i == 0) {
          break label138;
        }
        localStringBuilder.append("\"* ");
      }
      for (;;)
      {
        j += 1;
        break;
        if ((i >= 65) && (i <= 90))
        {
          i = 1;
          break label79;
        }
        if ((i >= 97) && (i <= 122))
        {
          i = 1;
          break label79;
        }
        i = 0;
        break label79;
        label138:
        localStringBuilder.append("\" ");
      }
    }
    paramArrayOfString = localStringBuilder.toString().trim();
    GMTrace.o(18638413234176L, 138867);
    return paramArrayOfString;
  }
  
  public static String u(String[] paramArrayOfString)
  {
    GMTrace.i(18639621193728L, 138876);
    StringBuilder localStringBuilder = new StringBuilder(256);
    localStringBuilder.append('(');
    int j = paramArrayOfString.length;
    int i = 0;
    while (i < j)
    {
      String str = paramArrayOfString[i];
      localStringBuilder.append(DatabaseUtils.sqlEscapeString(str) + ',');
      i += 1;
    }
    localStringBuilder.setCharAt(localStringBuilder.length() - 1, ')');
    paramArrayOfString = localStringBuilder.toString();
    GMTrace.o(18639621193728L, 138876);
    return paramArrayOfString;
  }
  
  public static String yP(String paramString)
  {
    GMTrace.i(18637876363264L, 138863);
    if (s.eb(paramString))
    {
      GMTrace.o(18637876363264L, 138863);
      return paramString;
    }
    x localx = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramString);
    if (localx == null)
    {
      GMTrace.o(18637876363264L, 138863);
      return paramString;
    }
    if (!bg.nm(localx.field_conRemarkPYFull))
    {
      paramString = localx.field_conRemarkPYFull;
      GMTrace.o(18637876363264L, 138863);
      return paramString;
    }
    if (!bg.nm(localx.qS()))
    {
      paramString = localx.qS();
      GMTrace.o(18637876363264L, 138863);
      return paramString;
    }
    if (!bg.nm(localx.qQ()))
    {
      paramString = localx.qQ();
      GMTrace.o(18637876363264L, 138863);
      return paramString;
    }
    GMTrace.o(18637876363264L, 138863);
    return paramString;
  }
  
  public static String yQ(String paramString)
  {
    GMTrace.i(18638950105088L, 138871);
    if (paramString != null)
    {
      paramString = paramString.replace('*', ' ').trim();
      GMTrace.o(18638950105088L, 138871);
      return paramString;
    }
    GMTrace.o(18638950105088L, 138871);
    return null;
  }
  
  public static final String yR(String paramString)
  {
    GMTrace.i(18639084322816L, 138872);
    paramString = SpellMap.nj(((a)com.tencent.mm.kernel.h.h(a.class)).bO(paramString, "‎"));
    GMTrace.o(18639084322816L, 138872);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\fts\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
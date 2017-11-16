package com.tencent.mm.modelsfs;

import com.tencent.gmtrace.GMTrace;
import java.util.EnumSet;

final class g
{
  static boolean a(String paramString1, int paramInt1, String paramString2, int paramInt2, EnumSet<a> paramEnumSet)
  {
    GMTrace.i(13842679595008L, 103136);
    int j;
    int i;
    label132:
    char c1;
    for (;;)
    {
      if (paramInt1 >= paramString1.length())
      {
        if ((paramEnumSet.contains(a.gTu)) && (paramString2.charAt(paramInt2) == '/'))
        {
          GMTrace.o(13842679595008L, 103136);
          return true;
        }
        if (paramInt2 == paramString2.length())
        {
          GMTrace.o(13842679595008L, 103136);
          return true;
        }
        GMTrace.o(13842679595008L, 103136);
        return false;
      }
      j = paramInt1 + 1;
      i = paramString1.charAt(paramInt1);
      switch (i)
      {
      default: 
        paramInt1 = j;
        c1 = i;
        if (paramInt2 < paramString2.length()) {
          break;
        }
        GMTrace.o(13842679595008L, 103136);
        return false;
      case 63: 
        label139:
        if (paramInt2 >= paramString2.length())
        {
          GMTrace.o(13842679595008L, 103136);
          return false;
        }
        if ((paramString2.charAt(paramInt2) == '/') && (paramEnumSet.contains(a.gTs)))
        {
          GMTrace.o(13842679595008L, 103136);
          return false;
        }
        if (a(paramString2, paramInt2, paramEnumSet))
        {
          GMTrace.o(13842679595008L, 103136);
          return false;
        }
        paramInt2 += 1;
        paramInt1 = j;
      }
    }
    for (;;)
    {
      int k = j;
      if (paramInt1 < paramString1.length())
      {
        j = paramString1.charAt(paramInt1);
        k = j;
        if (j == 42)
        {
          paramInt1 += 1;
          continue;
        }
      }
      if (a(paramString2, paramInt2, paramEnumSet))
      {
        GMTrace.o(13842679595008L, 103136);
        return false;
      }
      if (paramInt1 == paramString1.length())
      {
        if (paramEnumSet.contains(a.gTs))
        {
          if ((paramEnumSet.contains(a.gTu)) || (paramString2.indexOf('/', paramInt2) == -1))
          {
            GMTrace.o(13842679595008L, 103136);
            return true;
          }
          GMTrace.o(13842679595008L, 103136);
          return false;
        }
        GMTrace.o(13842679595008L, 103136);
        return true;
      }
      j = paramInt2;
      EnumSet<a> localEnumSet = paramEnumSet;
      if (k == 47)
      {
        j = paramInt2;
        localEnumSet = paramEnumSet;
        if (paramEnumSet.contains(a.gTs))
        {
          j = paramString2.indexOf('/', paramInt2);
          paramInt2 = j;
          if (j != -1) {
            break;
          }
          GMTrace.o(13842679595008L, 103136);
          return false;
        }
      }
      while ((paramString2.charAt(j) != '/') || (!paramEnumSet.contains(a.gTs)))
      {
        j += 1;
        localEnumSet = paramEnumSet;
        if (j < paramString2.length())
        {
          paramEnumSet = localEnumSet;
          if (localEnumSet.contains(a.gTt))
          {
            paramEnumSet = EnumSet.copyOf(localEnumSet);
            paramEnumSet.remove(a.gTt);
          }
          if (a(paramString1, paramInt1, paramString2, j, paramEnumSet))
          {
            GMTrace.o(13842679595008L, 103136);
            return true;
          }
        }
      }
      GMTrace.o(13842679595008L, 103136);
      return false;
      if (paramInt2 >= paramString2.length())
      {
        GMTrace.o(13842679595008L, 103136);
        return false;
      }
      if ((paramString2.charAt(paramInt2) == '/') && (paramEnumSet.contains(a.gTs)))
      {
        GMTrace.o(13842679595008L, 103136);
        return false;
      }
      if (a(paramString2, paramInt2, paramEnumSet))
      {
        GMTrace.o(13842679595008L, 103136);
        return false;
      }
      c1 = paramString2.charAt(paramInt2);
      if (j >= paramString1.length())
      {
        paramInt1 = -1;
        label616:
        if (paramInt1 == -1) {
          break label132;
        }
        if (paramInt1 != 0) {
          break label977;
        }
        GMTrace.o(13842679595008L, 103136);
        return false;
      }
      paramInt1 = paramString1.charAt(j);
      int n;
      if ((paramInt1 == 33) || (paramInt1 == 94))
      {
        n = 1;
        label657:
        if (n == 0) {
          break label1100;
        }
      }
      label692:
      label977:
      label1091:
      label1097:
      label1100:
      for (paramInt1 = j + 1;; paramInt1 = j)
      {
        char c4 = c1;
        if (paramEnumSet.contains(a.gTv)) {
          c4 = Character.toLowerCase(c1);
        }
        k = 0;
        if (paramInt1 >= paramString1.length())
        {
          paramInt1 = -1;
          break label616;
          n = 0;
          break label657;
        }
        int m = paramInt1 + 1;
        c1 = paramString1.charAt(paramInt1);
        if (c1 != ']')
        {
          if ((c1 != '\\') || (paramEnumSet.contains(a.gTr))) {
            break label1097;
          }
          paramInt1 = m + 1;
          c1 = paramString1.charAt(m);
          m = paramInt1;
        }
        for (;;)
        {
          if ((c1 == '/') && (paramEnumSet.contains(a.gTs)))
          {
            paramInt1 = 0;
            break label616;
          }
          char c2 = c1;
          if (paramEnumSet.contains(a.gTv)) {
            c2 = Character.toLowerCase(c1);
          }
          if ((paramString1.charAt(m) == '-') && (m + 1 < paramString1.length()))
          {
            c1 = paramString1.charAt(m + 1);
            if (c1 != ']')
            {
              paramInt1 = m + 2;
              if ((c1 != '\\') || (paramEnumSet.contains(a.gTr))) {
                break label1091;
              }
              if (paramInt1 >= paramString1.length())
              {
                paramInt1 = -1;
                break label616;
              }
              m = paramInt1 + 1;
              c2 = paramString1.charAt(paramInt1);
            }
          }
          for (;;)
          {
            if (paramEnumSet.contains(a.gTv)) {}
            for (char c3 = Character.toLowerCase(c1);; c3 = c1)
            {
              paramInt1 = m;
              if (c2 > c4) {
                break label692;
              }
              paramInt1 = m;
              if (c4 > c3) {
                break label692;
              }
              k = 1;
              paramInt1 = m;
              break label692;
              paramInt1 = m;
              if (c2 != c4) {
                break label692;
              }
              k = 1;
              paramInt1 = m;
              break label692;
              paramInt1 = m;
              if (k != n) {
                break label616;
              }
              paramInt1 = 0;
              break label616;
              paramInt2 += 1;
              break;
              if (paramEnumSet.contains(a.gTr)) {
                break label132;
              }
              if (j >= paramString1.length())
              {
                c1 = '\\';
                paramInt1 = j;
                break label139;
              }
              paramInt1 = j + 1;
              c1 = paramString1.charAt(j);
              break label139;
              if ((c1 != paramString2.charAt(paramInt2)) && ((!paramEnumSet.contains(a.gTv)) || (Character.toLowerCase(c1) != Character.toLowerCase(paramString2.charAt(paramInt2)))))
              {
                GMTrace.o(13842679595008L, 103136);
                return false;
              }
              paramInt2 += 1;
              break;
            }
            m = paramInt1;
          }
        }
      }
      paramInt1 = j;
      j = i;
    }
  }
  
  private static boolean a(String paramString, int paramInt, EnumSet<a> paramEnumSet)
  {
    GMTrace.i(13842813812736L, 103137);
    if (paramInt > paramString.length() - 1)
    {
      GMTrace.o(13842813812736L, 103137);
      return false;
    }
    if (((paramInt == 0) || ((paramEnumSet.contains(a.gTs)) && (paramString.charAt(paramInt - 1) == '/'))) && (paramString.charAt(paramInt) == '.') && (paramEnumSet.contains(a.gTt)))
    {
      GMTrace.o(13842813812736L, 103137);
      return true;
    }
    GMTrace.o(13842813812736L, 103137);
    return false;
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(13842545377280L, 103135);
      gTr = new a("NOESCAPE", 0);
      gTs = new a("PATHNAME", 1);
      gTt = new a("PERIOD", 2);
      gTu = new a("LEADING_DIR", 3);
      gTv = new a("CASEFOLD", 4);
      gTw = new a[] { gTr, gTs, gTt, gTu, gTv };
      GMTrace.o(13842545377280L, 103135);
    }
    
    private a()
    {
      GMTrace.i(13842411159552L, 103134);
      GMTrace.o(13842411159552L, 103134);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsfs\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
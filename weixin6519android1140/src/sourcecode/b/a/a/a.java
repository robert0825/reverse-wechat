package b.a.a;

import com.tencent.mm.bm.b;
import java.util.LinkedList;

public final class a
{
  public static int Gu(int paramInt)
  {
    return b.a.a.b.b.a.cK(paramInt) + 1;
  }
  
  public static int S(int paramInt, long paramLong)
  {
    int i = b.a.a.b.b.a.cK(paramInt);
    if ((0xFFFFFFFFFFFFFF80 & paramLong) == 0L) {
      paramInt = 1;
    }
    for (;;)
    {
      return paramInt + i;
      if ((0xFFFFFFFFFFFFC000 & paramLong) == 0L) {
        paramInt = 2;
      } else if ((0xFFFFFFFFFFE00000 & paramLong) == 0L) {
        paramInt = 3;
      } else if ((0xFFFFFFFFF0000000 & paramLong) == 0L) {
        paramInt = 4;
      } else if ((0xFFFFFFF800000000 & paramLong) == 0L) {
        paramInt = 5;
      } else if ((0xFFFFFC0000000000 & paramLong) == 0L) {
        paramInt = 6;
      } else if ((0xFFFE000000000000 & paramLong) == 0L) {
        paramInt = 7;
      } else if ((0xFF00000000000000 & paramLong) == 0L) {
        paramInt = 8;
      } else if ((0x8000000000000000 & paramLong) == 0L) {
        paramInt = 9;
      } else {
        paramInt = 10;
      }
    }
  }
  
  public static int a(int paramInt, b paramb)
  {
    if (paramb == null) {
      return 0;
    }
    return b.a.a.b.b.a.cK(paramInt) + b.a.a.b.b.a.cM(paramb.tJp.length) + paramb.tJp.length;
  }
  
  public static int b(int paramInt, LinkedList<?> paramLinkedList)
  {
    int j = 0;
    int i = j;
    if (paramLinkedList != null)
    {
      i = j;
      if (paramLinkedList.size() > 0)
      {
        i = 0;
        j = 0;
      }
    }
    for (;;)
    {
      if (i >= paramLinkedList.size())
      {
        i = b.a.a.b.b.a.cM(j) + j + b.a.a.b.b.a.cK(paramInt);
        return i;
      }
      j += b.a.a.b.b.a.cM(((Integer)paramLinkedList.get(i)).intValue());
      i += 1;
    }
  }
  
  public static int c(int paramInt1, int paramInt2, LinkedList<?> paramLinkedList)
  {
    if (paramLinkedList != null)
    {
      switch (paramInt2)
      {
      default: 
        throw new IllegalArgumentException("The data type was not found, the id used was " + paramInt2);
      case 6: 
        paramInt2 = 0;
        i = 0;
        for (;;)
        {
          if (i >= paramLinkedList.size()) {
            return paramInt2;
          }
          j = a(paramInt1, (b)paramLinkedList.get(i));
          i += 1;
          paramInt2 = j + paramInt2;
        }
      case 4: 
        i = 0;
        j = 0;
        for (;;)
        {
          paramInt2 = i;
          if (j >= paramLinkedList.size()) {
            break;
          }
          ((Double)paramLinkedList.get(j)).doubleValue();
          paramInt2 = b.a.a.b.b.a.cK(paramInt1);
          j += 1;
          i = paramInt2 + 8 + i;
        }
      case 5: 
        i = 0;
        j = 0;
        for (;;)
        {
          paramInt2 = i;
          if (j >= paramLinkedList.size()) {
            break;
          }
          ((Float)paramLinkedList.get(j)).floatValue();
          paramInt2 = b.a.a.b.b.a.cK(paramInt1);
          j += 1;
          i = paramInt2 + 4 + i;
        }
      case 2: 
        i = 0;
        j = 0;
        for (;;)
        {
          paramInt2 = i;
          if (j >= paramLinkedList.size()) {
            break;
          }
          paramInt2 = fh(paramInt1, ((Integer)paramLinkedList.get(j)).intValue());
          j += 1;
          i = paramInt2 + i;
        }
      case 3: 
        i = 0;
        j = 0;
        for (;;)
        {
          paramInt2 = i;
          if (j >= paramLinkedList.size()) {
            break;
          }
          paramInt2 = S(paramInt1, ((Long)paramLinkedList.get(j)).longValue());
          j += 1;
          i = paramInt2 + i;
        }
      case 1: 
        i = 0;
        j = 0;
        for (;;)
        {
          paramInt2 = i;
          if (j >= paramLinkedList.size()) {
            break;
          }
          paramInt2 = b.a.a.b.b.a.f(paramInt1, (String)paramLinkedList.get(j));
          j += 1;
          i = paramInt2 + i;
        }
      case 7: 
        i = 0;
        j = 0;
        for (;;)
        {
          paramInt2 = i;
          if (j >= paramLinkedList.size()) {
            break;
          }
          ((Boolean)paramLinkedList.get(j)).booleanValue();
          paramInt2 = b.a.a.b.b.a.cK(paramInt1);
          j += 1;
          i = paramInt2 + 1 + i;
        }
      }
      int i = 0;
      int j = 0;
      for (;;)
      {
        paramInt2 = i;
        if (j >= paramLinkedList.size()) {
          break;
        }
        paramInt2 = fj(paramInt1, ((com.tencent.mm.bm.a)paramLinkedList.get(j)).aYq());
        j += 1;
        i = paramInt2 + i;
      }
    }
    return 0;
  }
  
  public static int f(int paramInt, String paramString)
  {
    return b.a.a.b.b.a.f(paramInt, paramString);
  }
  
  public static int fh(int paramInt1, int paramInt2)
  {
    if (paramInt2 >= 0) {
      return b.a.a.b.b.a.cK(paramInt1) + b.a.a.b.b.a.cM(paramInt2);
    }
    return b.a.a.b.b.a.cK(paramInt1) + 10;
  }
  
  public static int fi(int paramInt1, int paramInt2)
  {
    return fh(paramInt1, paramInt2);
  }
  
  public static int fj(int paramInt1, int paramInt2)
  {
    return b.a.a.b.b.a.cK(paramInt1) + b.a.a.b.b.a.cM(paramInt2) + paramInt2;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\b\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
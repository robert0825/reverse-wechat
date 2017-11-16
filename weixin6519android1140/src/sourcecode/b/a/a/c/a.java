package b.a.a.c;

import com.tencent.mm.bm.b;
import java.io.OutputStream;
import java.util.LinkedList;

public final class a
{
  public final OutputStream gtb;
  public final byte[] yrb;
  private final b.a.a.b.b.a yrc;
  
  public a(byte[] paramArrayOfByte)
  {
    this.yrb = paramArrayOfByte;
    this.gtb = null;
    this.yrc = new b.a.a.b.b.a(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public final void T(int paramInt, long paramLong)
  {
    b.a.a.b.b.a locala = this.yrc;
    locala.at(paramInt, 0);
    locala.q(paramLong);
  }
  
  public final void a(int paramInt, double paramDouble)
  {
    b.a.a.b.b.a locala = this.yrc;
    locala.at(paramInt, 1);
    long l = Double.doubleToLongBits(paramDouble);
    locala.cJ((int)l & 0xFF);
    locala.cJ((int)(l >> 8) & 0xFF);
    locala.cJ((int)(l >> 16) & 0xFF);
    locala.cJ((int)(l >> 24) & 0xFF);
    locala.cJ((int)(l >> 32) & 0xFF);
    locala.cJ((int)(l >> 40) & 0xFF);
    locala.cJ((int)(l >> 48) & 0xFF);
    locala.cJ((int)(l >> 56) & 0xFF);
  }
  
  public final void ah(int paramInt, boolean paramBoolean)
  {
    int i = 0;
    b.a.a.b.b.a locala = this.yrc;
    locala.at(paramInt, 0);
    paramInt = i;
    if (paramBoolean) {
      paramInt = 1;
    }
    locala.cJ(paramInt);
  }
  
  public final void b(int paramInt, b paramb)
  {
    b.a.a.b.b.a locala = this.yrc;
    if (paramb != null)
    {
      locala.at(paramInt, 2);
      paramb = paramb.toByteArray();
      locala.cL(paramb.length);
      locala.j(paramb);
    }
  }
  
  public final void c(int paramInt, LinkedList<?> paramLinkedList)
  {
    int j = 0;
    b.a.a.b.b.a locala;
    int i;
    if ((paramLinkedList != null) && (paramLinkedList.size() > 0))
    {
      this.yrc.at(paramInt, 2);
      locala = this.yrc;
      if ((paramLinkedList == null) || (paramLinkedList.size() <= 0)) {
        break label123;
      }
      paramInt = 0;
      i = 0;
      if (i < paramLinkedList.size()) {
        break label70;
      }
    }
    for (;;)
    {
      locala.cL(paramInt);
      paramInt = j;
      for (;;)
      {
        if (paramInt >= paramLinkedList.size())
        {
          return;
          label70:
          int k = b.a.a.b.b.a.cM(((Integer)paramLinkedList.get(i)).intValue());
          i += 1;
          paramInt = k + paramInt;
          break;
        }
        this.yrc.cL(((Integer)paramLinkedList.get(paramInt)).intValue());
        paramInt += 1;
      }
      label123:
      paramInt = 0;
    }
  }
  
  public final void d(int paramInt1, int paramInt2, LinkedList<?> paramLinkedList)
  {
    if (paramLinkedList != null) {
      switch (paramInt2)
      {
      default: 
        throw new IllegalArgumentException("The data type was not found, the id used was " + paramInt2);
      case 6: 
        paramInt2 = 0;
        if (paramInt2 < paramLinkedList.size()) {
          break;
        }
      }
    }
    for (;;)
    {
      return;
      b(paramInt1, (b)paramLinkedList.get(paramInt2));
      paramInt2 += 1;
      break;
      paramInt2 = 0;
      while (paramInt2 < paramLinkedList.size())
      {
        a(paramInt1, ((Double)paramLinkedList.get(paramInt2)).doubleValue());
        paramInt2 += 1;
      }
      continue;
      paramInt2 = 0;
      while (paramInt2 < paramLinkedList.size())
      {
        n(paramInt1, ((Float)paramLinkedList.get(paramInt2)).floatValue());
        paramInt2 += 1;
      }
      continue;
      paramInt2 = 0;
      while (paramInt2 < paramLinkedList.size())
      {
        fk(paramInt1, ((Integer)paramLinkedList.get(paramInt2)).intValue());
        paramInt2 += 1;
      }
      continue;
      paramInt2 = 0;
      while (paramInt2 < paramLinkedList.size())
      {
        T(paramInt1, ((Long)paramLinkedList.get(paramInt2)).longValue());
        paramInt2 += 1;
      }
      continue;
      paramInt2 = 0;
      while (paramInt2 < paramLinkedList.size())
      {
        e(paramInt1, (String)paramLinkedList.get(paramInt2));
        paramInt2 += 1;
      }
      continue;
      paramInt2 = 0;
      while (paramInt2 < paramLinkedList.size())
      {
        ah(paramInt1, ((Boolean)paramLinkedList.get(paramInt2)).booleanValue());
        paramInt2 += 1;
      }
      continue;
      paramInt2 = 0;
      while (paramInt2 < paramLinkedList.size())
      {
        com.tencent.mm.bm.a locala = (com.tencent.mm.bm.a)paramLinkedList.get(paramInt2);
        fm(paramInt1, locala.aYq());
        locala.a(this);
        paramInt2 += 1;
      }
    }
  }
  
  public final void e(int paramInt, String paramString)
  {
    b.a.a.b.b.a locala = this.yrc;
    if (paramString != null)
    {
      locala.at(paramInt, 2);
      paramString = paramString.getBytes("UTF-8");
      locala.cL(paramString.length);
      locala.j(paramString);
    }
  }
  
  public final void fk(int paramInt1, int paramInt2)
  {
    b.a.a.b.b.a locala = this.yrc;
    locala.at(paramInt1, 0);
    if (paramInt2 >= 0)
    {
      locala.cL(paramInt2);
      return;
    }
    locala.q(paramInt2);
  }
  
  public final void fl(int paramInt1, int paramInt2)
  {
    fk(paramInt1, paramInt2);
  }
  
  public final void fm(int paramInt1, int paramInt2)
  {
    b.a.a.b.b.a locala = this.yrc;
    locala.at(paramInt1, 2);
    locala.cL(paramInt2);
  }
  
  public final void n(int paramInt, float paramFloat)
  {
    b.a.a.b.b.a locala = this.yrc;
    locala.at(paramInt, 5);
    paramInt = Float.floatToIntBits(paramFloat);
    locala.cJ(paramInt & 0xFF);
    locala.cJ(paramInt >> 8 & 0xFF);
    locala.cJ(paramInt >> 16 & 0xFF);
    locala.cJ(paramInt >> 24 & 0xFF);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\b\a\a\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
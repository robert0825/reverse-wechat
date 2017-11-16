package com.tencent.tinker.c.a.c;

import com.tencent.tinker.a.a.b.b;
import com.tencent.tinker.a.a.e.a;
import com.tencent.tinker.a.a.e.b;
import com.tencent.tinker.a.a.j;
import com.tencent.tinker.a.a.l;
import com.tencent.tinker.a.a.m;
import com.tencent.tinker.a.a.o;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public abstract class a
{
  public abstract int FO(int paramInt);
  
  public abstract int FP(int paramInt);
  
  public abstract int FQ(int paramInt);
  
  public abstract int FR(int paramInt);
  
  public abstract int FS(int paramInt);
  
  public abstract int FT(int paramInt);
  
  public abstract int FU(int paramInt);
  
  public abstract int FV(int paramInt);
  
  public abstract int FW(int paramInt);
  
  public abstract int FX(int paramInt);
  
  public abstract int FY(int paramInt);
  
  public abstract int FZ(int paramInt);
  
  public abstract int Ga(int paramInt);
  
  public abstract int Gb(int paramInt);
  
  public final e.a[] b(e.a[] paramArrayOfa)
  {
    e.a[] arrayOfa = new e.a[paramArrayOfa.length];
    int i = 0;
    while (i < paramArrayOfa.length)
    {
      e.a locala = paramArrayOfa[i];
      arrayOfa[i] = new e.a(FR(locala.ycg), locala.ych);
      i += 1;
    }
    return arrayOfa;
  }
  
  public final e.b[] b(e.b[] paramArrayOfb)
  {
    e.b[] arrayOfb = new e.b[paramArrayOfb.length];
    int i = 0;
    while (i < paramArrayOfb.length)
    {
      e.b localb = paramArrayOfb[i];
      int j = FS(localb.yci);
      int k = Gb(localb.ycj);
      arrayOfb[i] = new e.b(j, localb.ych, k);
      i += 1;
    }
    return arrayOfb;
  }
  
  private final class a
  {
    private final b yfy;
    
    public a(b paramb)
    {
      this.yfy = paramb;
    }
    
    private void a(m paramm)
    {
      int i = 0;
      switch (paramm.cqo())
      {
      case 1: 
      case 5: 
      case 7: 
      case 8: 
      case 9: 
      case 10: 
      case 11: 
      case 12: 
      case 13: 
      case 14: 
      case 15: 
      case 18: 
      case 19: 
      case 20: 
      case 21: 
      case 22: 
      default: 
        throw new j("Unexpected type: " + Integer.toHexString(paramm.cqo()));
      case 0: 
        l.a(this.yfy, 0, paramm.readByte());
        return;
      case 2: 
        l.a(this.yfy, 2, paramm.readShort());
        return;
      case 4: 
        l.a(this.yfy, 4, paramm.readInt());
        return;
      case 6: 
        l.a(this.yfy, 6, paramm.readLong());
        return;
      case 3: 
        l.b(this.yfy, 3, paramm.readChar());
        return;
      case 16: 
        long l = Float.floatToIntBits(paramm.readFloat());
        l.c(this.yfy, 16, l << 32);
        return;
      case 17: 
        l.c(this.yfy, 17, Double.doubleToLongBits(paramm.readDouble()));
        return;
      case 23: 
        l.b(this.yfy, 23, a.this.FO(paramm.cqs()));
        return;
      case 24: 
        l.b(this.yfy, 24, a.this.FP(paramm.cqt()));
        return;
      case 25: 
        l.b(this.yfy, 25, a.this.FR(paramm.cqu()));
        return;
      case 27: 
        l.b(this.yfy, 27, a.this.FR(paramm.cqv()));
        return;
      case 26: 
        l.b(this.yfy, 26, a.this.FS(paramm.cqw()));
        return;
      case 28: 
        ff(28, 0);
        c(paramm);
        return;
      case 29: 
        ff(29, 0);
        b(paramm);
        return;
      case 30: 
        paramm.cqx();
        ff(30, 0);
        return;
      }
      if (paramm.readBoolean()) {
        i = 1;
      }
      ff(31, i);
    }
    
    private void ff(int paramInt1, int paramInt2)
    {
      this.yfy.writeByte(paramInt2 << 5 | paramInt1);
    }
    
    public final void b(m paramm)
    {
      int j = paramm.cqq();
      o.a(this.yfy, a.this.FP(paramm.ycW));
      o.a(this.yfy, j);
      int i = 0;
      while (i < j)
      {
        o.a(this.yfy, a.this.FO(paramm.cqr()));
        a(paramm);
        i += 1;
      }
    }
    
    public final void c(m paramm)
    {
      int j = paramm.cqp();
      o.a(this.yfy, j);
      int i = 0;
      while (i < j)
      {
        a(paramm);
        i += 1;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tinker\c\a\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
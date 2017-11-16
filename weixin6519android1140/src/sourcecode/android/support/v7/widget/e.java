package android.support.v7.widget;

import android.support.v4.e.i.a;
import android.support.v4.e.i.b;
import java.util.ArrayList;
import java.util.List;

final class e
  implements aa.a
{
  private i.a<b> NR = new i.b(30);
  final ArrayList<b> NS = new ArrayList();
  final ArrayList<b> NT = new ArrayList();
  final a NU;
  Runnable NV;
  final boolean NW;
  final aa NX;
  int NY = 0;
  
  e(a parama)
  {
    this(parama, (byte)0);
  }
  
  private e(a parama, byte paramByte)
  {
    this.NU = parama;
    this.NW = false;
    this.NX = new aa(this);
  }
  
  private void a(b paramb)
  {
    if ((paramb.nJ == 1) || (paramb.nJ == 8)) {
      throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }
    int i1 = r(paramb.NZ, paramb.nJ);
    int j = paramb.NZ;
    int k;
    int n;
    int m;
    label109:
    int i2;
    switch (paramb.nJ)
    {
    case 3: 
    default: 
      throw new IllegalArgumentException("op should be remove or update." + paramb);
    case 4: 
      k = 1;
      n = 1;
      m = 1;
      if (m >= paramb.Ob) {
        break label294;
      }
      i2 = r(paramb.NZ + k * m, paramb.nJ);
      switch (paramb.nJ)
      {
      case 3: 
      default: 
        i = 0;
        label170:
        if (i == 0) {}
        break;
      }
      break;
    }
    for (int i = n + 1;; i = n)
    {
      m += 1;
      n = i;
      break label109;
      k = 0;
      break;
      if (i2 == i1 + 1)
      {
        i = 1;
        break label170;
      }
      i = 0;
      break label170;
      if (i2 == i1)
      {
        i = 1;
        break label170;
      }
      i = 0;
      break label170;
      localObject = a(paramb.nJ, i1, n, paramb.Oa);
      a((b)localObject, j);
      c((b)localObject);
      i = j;
      if (paramb.nJ == 4) {
        i = j + n;
      }
      n = 1;
      i1 = i2;
      j = i;
    }
    label294:
    Object localObject = paramb.Oa;
    c(paramb);
    if (n > 0)
    {
      paramb = a(paramb.nJ, i1, n, localObject);
      a(paramb, j);
      c(paramb);
    }
  }
  
  private void a(b paramb, int paramInt)
  {
    this.NU.d(paramb);
    switch (paramb.nJ)
    {
    case 3: 
    default: 
      throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
    case 2: 
      this.NU.t(paramInt, paramb.Ob);
      return;
    }
    this.NU.a(paramInt, paramb.Ob, paramb.Oa);
  }
  
  private boolean aG(int paramInt)
  {
    int k = this.NT.size();
    int i = 0;
    while (i < k)
    {
      b localb = (b)this.NT.get(i);
      if (localb.nJ == 8)
      {
        if (s(localb.Ob, i + 1) == paramInt) {
          return true;
        }
      }
      else if (localb.nJ == 1)
      {
        int m = localb.NZ;
        int n = localb.Ob;
        int j = localb.NZ;
        while (j < m + n)
        {
          if (s(j, i + 1) == paramInt) {
            return true;
          }
          j += 1;
        }
      }
      i += 1;
    }
    return false;
  }
  
  private void b(b paramb)
  {
    this.NT.add(paramb);
    switch (paramb.nJ)
    {
    case 3: 
    case 5: 
    case 6: 
    case 7: 
    default: 
      throw new IllegalArgumentException("Unknown update op type for " + paramb);
    case 1: 
      this.NU.v(paramb.NZ, paramb.Ob);
      return;
    case 8: 
      this.NU.w(paramb.NZ, paramb.Ob);
      return;
    case 2: 
      this.NU.u(paramb.NZ, paramb.Ob);
      return;
    }
    this.NU.a(paramb.NZ, paramb.Ob, paramb.Oa);
  }
  
  private void g(List<b> paramList)
  {
    int j = paramList.size();
    int i = 0;
    while (i < j)
    {
      c((b)paramList.get(i));
      i += 1;
    }
    paramList.clear();
  }
  
  private int r(int paramInt1, int paramInt2)
  {
    int i = this.NT.size() - 1;
    b localb;
    if (i >= 0)
    {
      localb = (b)this.NT.get(i);
      int k;
      int j;
      if (localb.nJ == 8) {
        if (localb.NZ < localb.Ob)
        {
          k = localb.NZ;
          j = localb.Ob;
          label64:
          if ((paramInt1 < k) || (paramInt1 > j)) {
            break label195;
          }
          if (k != localb.NZ) {
            break label151;
          }
          if (paramInt2 != 1) {
            break label131;
          }
          localb.Ob += 1;
          label103:
          paramInt1 += 1;
        }
      }
      for (;;)
      {
        i -= 1;
        break;
        k = localb.Ob;
        j = localb.NZ;
        break label64;
        label131:
        if (paramInt2 != 2) {
          break label103;
        }
        localb.Ob -= 1;
        break label103;
        label151:
        if (paramInt2 == 1) {
          localb.NZ += 1;
        }
        for (;;)
        {
          paramInt1 -= 1;
          break;
          if (paramInt2 == 2) {
            localb.NZ -= 1;
          }
        }
        label195:
        if (paramInt1 < localb.NZ)
        {
          if (paramInt2 == 1)
          {
            localb.NZ += 1;
            localb.Ob += 1;
            continue;
          }
          if (paramInt2 == 2)
          {
            localb.NZ -= 1;
            localb.Ob -= 1;
          }
        }
        continue;
        if (localb.NZ <= paramInt1)
        {
          if (localb.nJ == 1) {
            paramInt1 -= localb.Ob;
          } else if (localb.nJ == 2) {
            paramInt1 = localb.Ob + paramInt1;
          }
        }
        else if (paramInt2 == 1) {
          localb.NZ += 1;
        } else if (paramInt2 == 2) {
          localb.NZ -= 1;
        }
      }
    }
    paramInt2 = this.NT.size() - 1;
    if (paramInt2 >= 0)
    {
      localb = (b)this.NT.get(paramInt2);
      if (localb.nJ == 8) {
        if ((localb.Ob == localb.NZ) || (localb.Ob < 0))
        {
          this.NT.remove(paramInt2);
          c(localb);
        }
      }
      for (;;)
      {
        paramInt2 -= 1;
        break;
        if (localb.Ob <= 0)
        {
          this.NT.remove(paramInt2);
          c(localb);
        }
      }
    }
    return paramInt1;
  }
  
  public final b a(int paramInt1, int paramInt2, int paramInt3, Object paramObject)
  {
    b localb = (b)this.NR.bE();
    if (localb == null) {
      return new b(paramInt1, paramInt2, paramInt3, paramObject);
    }
    localb.nJ = paramInt1;
    localb.NZ = paramInt2;
    localb.Ob = paramInt3;
    localb.Oa = paramObject;
    return localb;
  }
  
  final boolean aH(int paramInt)
  {
    return (this.NY & paramInt) != 0;
  }
  
  final int aI(int paramInt)
  {
    return s(paramInt, 0);
  }
  
  public final void c(b paramb)
  {
    if (!this.NW)
    {
      paramb.Oa = null;
      this.NR.i(paramb);
    }
  }
  
  final void eq()
  {
    aa localaa = this.NX;
    ArrayList localArrayList = this.NS;
    int i;
    label24:
    label53:
    int i1;
    b localb2;
    b localb3;
    int k;
    for (;;)
    {
      j = 0;
      i = localArrayList.size() - 1;
      if (i < 0) {
        break label268;
      }
      if (((b)localArrayList.get(i)).nJ != 8) {
        break;
      }
      if (j == 0) {
        break label1835;
      }
      j = i;
      if (j == -1) {
        break label1251;
      }
      i1 = j + 1;
      localb2 = (b)localArrayList.get(j);
      localb3 = (b)localArrayList.get(i1);
      switch (localb3.nJ)
      {
      case 3: 
      default: 
        break;
      case 1: 
        i = 0;
        if (localb2.Ob < localb3.NZ) {
          i = -1;
        }
        k = i;
        if (localb2.NZ < localb3.NZ) {
          k = i + 1;
        }
        if (localb3.NZ <= localb2.NZ) {
          localb2.NZ += localb3.Ob;
        }
        if (localb3.NZ <= localb2.Ob) {
          localb2.Ob += localb3.Ob;
        }
        localb3.NZ = (k + localb3.NZ);
        localArrayList.set(j, localb3);
        localArrayList.set(i1, localb2);
      }
    }
    int j = 1;
    label268:
    label344:
    label369:
    label491:
    label567:
    label655:
    label780:
    label958:
    label1002:
    label1027:
    label1149:
    label1227:
    label1251:
    label1458:
    label1526:
    label1835:
    for (;;)
    {
      i -= 1;
      break label24;
      j = -1;
      break label53;
      b localb1 = null;
      int m = 0;
      int n;
      if (localb2.NZ < localb2.Ob)
      {
        n = 0;
        k = n;
        i = m;
        if (localb3.NZ == localb2.NZ)
        {
          k = n;
          i = m;
          if (localb3.Ob == localb2.Ob - localb2.NZ)
          {
            i = 1;
            k = n;
          }
        }
        if (localb2.Ob >= localb3.NZ) {
          break label491;
        }
        localb3.NZ -= 1;
        if (localb2.NZ > localb3.NZ) {
          break label567;
        }
        localb3.NZ += 1;
      }
      int i2;
      for (;;)
      {
        if (i == 0) {
          break label655;
        }
        localArrayList.set(j, localb3);
        localArrayList.remove(i1);
        localaa.SG.c(localb2);
        break;
        n = 1;
        k = n;
        i = m;
        if (localb3.NZ != localb2.Ob + 1) {
          break label344;
        }
        k = n;
        i = m;
        if (localb3.Ob != localb2.NZ - localb2.Ob) {
          break label344;
        }
        i = 1;
        k = n;
        break label344;
        if (localb2.Ob >= localb3.NZ + localb3.Ob) {
          break label369;
        }
        localb3.Ob -= 1;
        localb2.nJ = 2;
        localb2.Ob = 1;
        if (localb3.Ob != 0) {
          break;
        }
        localArrayList.remove(i1);
        localaa.SG.c(localb3);
        break;
        if (localb2.NZ < localb3.NZ + localb3.Ob)
        {
          m = localb3.NZ;
          n = localb3.Ob;
          i2 = localb2.NZ;
          localb1 = localaa.SG.a(2, localb2.NZ + 1, m + n - i2, null);
          localb3.Ob = (localb2.NZ - localb3.NZ);
        }
      }
      if (k != 0)
      {
        if (localb1 != null)
        {
          if (localb2.NZ > localb1.NZ) {
            localb2.NZ -= localb1.Ob;
          }
          if (localb2.Ob > localb1.NZ) {
            localb2.Ob -= localb1.Ob;
          }
        }
        if (localb2.NZ > localb3.NZ) {
          localb2.NZ -= localb3.Ob;
        }
        if (localb2.Ob > localb3.NZ) {
          localb2.Ob -= localb3.Ob;
        }
        localArrayList.set(j, localb3);
        if (localb2.NZ == localb2.Ob) {
          break label958;
        }
        localArrayList.set(i1, localb2);
      }
      while (localb1 != null)
      {
        localArrayList.add(j, localb1);
        break;
        if (localb1 != null)
        {
          if (localb2.NZ >= localb1.NZ) {
            localb2.NZ -= localb1.Ob;
          }
          if (localb2.Ob >= localb1.NZ) {
            localb2.Ob -= localb1.Ob;
          }
        }
        if (localb2.NZ >= localb3.NZ) {
          localb2.NZ -= localb3.Ob;
        }
        if (localb2.Ob < localb3.NZ) {
          break label780;
        }
        localb2.Ob -= localb3.Ob;
        break label780;
        localArrayList.remove(i1);
      }
      localb1 = null;
      Object localObject = null;
      if (localb2.Ob < localb3.NZ)
      {
        localb3.NZ -= 1;
        if (localb2.NZ > localb3.NZ) {
          break label1149;
        }
        localb3.NZ += 1;
        localArrayList.set(i1, localb2);
        if (localb3.Ob <= 0) {
          break label1227;
        }
        localArrayList.set(j, localb3);
      }
      for (;;)
      {
        if (localb1 != null) {
          localArrayList.add(j, localb1);
        }
        if (localObject == null) {
          break;
        }
        localArrayList.add(j, localObject);
        break;
        if (localb2.Ob >= localb3.NZ + localb3.Ob) {
          break label1002;
        }
        localb3.Ob -= 1;
        localb1 = localaa.SG.a(4, localb2.NZ, 1, localb3.Oa);
        break label1002;
        if (localb2.NZ >= localb3.NZ + localb3.Ob) {
          break label1027;
        }
        i = localb3.NZ + localb3.Ob - localb2.NZ;
        localObject = localaa.SG.a(4, localb2.NZ + 1, i, localb3.Oa);
        localb3.Ob -= i;
        break label1027;
        localArrayList.remove(j);
        localaa.SG.c(localb3);
      }
      int i3 = this.NS.size();
      i1 = 0;
      if (i1 < i3)
      {
        localb1 = (b)this.NS.get(i1);
        switch (localb1.nJ)
        {
        }
        for (;;)
        {
          if (this.NV != null) {
            this.NV.run();
          }
          i1 += 1;
          break;
          b(localb1);
          continue;
          int i4 = localb1.NZ;
          i = localb1.NZ;
          k = localb1.Ob + i;
          i2 = -1;
          i = localb1.NZ;
          n = 0;
          if (i < k)
          {
            j = 0;
            m = 0;
            if ((this.NU.aJ(i) != null) || (aG(i)))
            {
              if (i2 == 0)
              {
                a(a(2, i4, n, null));
                m = 1;
              }
              j = 1;
              if (m == 0) {
                break label1526;
              }
              m = i - n;
              i = k - n;
            }
            for (k = 1;; k = n)
            {
              n = k;
              k = i;
              i = m + 1;
              i2 = j;
              break;
              if (i2 == 1)
              {
                b(a(2, i4, n, null));
                j = 1;
              }
              i2 = 0;
              m = j;
              j = i2;
              break label1458;
              n += 1;
              m = i;
              i = k;
            }
          }
          localObject = localb1;
          if (n != localb1.Ob)
          {
            c(localb1);
            localObject = a(2, i4, n, null);
          }
          if (i2 == 0)
          {
            a((b)localObject);
          }
          else
          {
            b((b)localObject);
            continue;
            k = localb1.NZ;
            i4 = localb1.NZ;
            int i5 = localb1.Ob;
            i = localb1.NZ;
            j = 0;
            i2 = -1;
            if (i < i4 + i5)
            {
              if ((this.NU.aJ(i) != null) || (aG(i)))
              {
                m = j;
                n = k;
                if (i2 == 0)
                {
                  a(a(4, k, j, localb1.Oa));
                  m = 0;
                  n = i;
                }
                k = n;
              }
              for (j = 1;; j = 0)
              {
                i += 1;
                m += 1;
                i2 = j;
                j = m;
                break;
                m = j;
                n = k;
                if (i2 == 1)
                {
                  b(a(4, k, j, localb1.Oa));
                  m = 0;
                  n = i;
                }
                k = n;
              }
            }
            localObject = localb1;
            if (j != localb1.Ob)
            {
              localObject = localb1.Oa;
              c(localb1);
              localObject = a(4, k, j, localObject);
            }
            if (i2 == 0)
            {
              a((b)localObject);
            }
            else
            {
              b((b)localObject);
              continue;
              b(localb1);
            }
          }
        }
      }
      this.NS.clear();
      return;
    }
  }
  
  final void er()
  {
    int j = this.NT.size();
    int i = 0;
    while (i < j)
    {
      this.NU.e((b)this.NT.get(i));
      i += 1;
    }
    g(this.NT);
    this.NY = 0;
  }
  
  final boolean es()
  {
    return this.NS.size() > 0;
  }
  
  final void et()
  {
    er();
    int j = this.NS.size();
    int i = 0;
    if (i < j)
    {
      b localb = (b)this.NS.get(i);
      switch (localb.nJ)
      {
      }
      for (;;)
      {
        if (this.NV != null) {
          this.NV.run();
        }
        i += 1;
        break;
        this.NU.e(localb);
        this.NU.v(localb.NZ, localb.Ob);
        continue;
        this.NU.e(localb);
        this.NU.t(localb.NZ, localb.Ob);
        continue;
        this.NU.e(localb);
        this.NU.a(localb.NZ, localb.Ob, localb.Oa);
        continue;
        this.NU.e(localb);
        this.NU.w(localb.NZ, localb.Ob);
      }
    }
    g(this.NS);
    this.NY = 0;
  }
  
  final void reset()
  {
    g(this.NS);
    g(this.NT);
    this.NY = 0;
  }
  
  final int s(int paramInt1, int paramInt2)
  {
    int k = this.NT.size();
    int j = paramInt2;
    paramInt2 = paramInt1;
    paramInt1 = paramInt2;
    b localb;
    if (j < k)
    {
      localb = (b)this.NT.get(j);
      if (localb.nJ == 8) {
        if (localb.NZ == paramInt2) {
          paramInt1 = localb.Ob;
        }
      }
    }
    for (;;)
    {
      j += 1;
      paramInt2 = paramInt1;
      break;
      int i = paramInt2;
      if (localb.NZ < paramInt2) {
        i = paramInt2 - 1;
      }
      paramInt1 = i;
      if (localb.Ob <= i)
      {
        paramInt1 = i + 1;
        continue;
        paramInt1 = paramInt2;
        if (localb.NZ <= paramInt2) {
          if (localb.nJ == 2)
          {
            if (paramInt2 < localb.NZ + localb.Ob)
            {
              paramInt1 = -1;
              return paramInt1;
            }
            paramInt1 = paramInt2 - localb.Ob;
          }
          else
          {
            paramInt1 = paramInt2;
            if (localb.nJ == 1) {
              paramInt1 = paramInt2 + localb.Ob;
            }
          }
        }
      }
    }
  }
  
  static abstract interface a
  {
    public abstract void a(int paramInt1, int paramInt2, Object paramObject);
    
    public abstract RecyclerView.t aJ(int paramInt);
    
    public abstract void d(e.b paramb);
    
    public abstract void e(e.b paramb);
    
    public abstract void t(int paramInt1, int paramInt2);
    
    public abstract void u(int paramInt1, int paramInt2);
    
    public abstract void v(int paramInt1, int paramInt2);
    
    public abstract void w(int paramInt1, int paramInt2);
  }
  
  static final class b
  {
    int NZ;
    Object Oa;
    int Ob;
    int nJ;
    
    b(int paramInt1, int paramInt2, int paramInt3, Object paramObject)
    {
      this.nJ = paramInt1;
      this.NZ = paramInt2;
      this.Ob = paramInt3;
      this.Oa = paramObject;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {}
      do
      {
        do
        {
          do
          {
            return true;
            if ((paramObject == null) || (getClass() != paramObject.getClass())) {
              return false;
            }
            paramObject = (b)paramObject;
            if (this.nJ != ((b)paramObject).nJ) {
              return false;
            }
          } while ((this.nJ == 8) && (Math.abs(this.Ob - this.NZ) == 1) && (this.Ob == ((b)paramObject).NZ) && (this.NZ == ((b)paramObject).Ob));
          if (this.Ob != ((b)paramObject).Ob) {
            return false;
          }
          if (this.NZ != ((b)paramObject).NZ) {
            return false;
          }
          if (this.Oa == null) {
            break;
          }
        } while (this.Oa.equals(((b)paramObject).Oa));
        return false;
      } while (((b)paramObject).Oa == null);
      return false;
    }
    
    public final int hashCode()
    {
      return (this.nJ * 31 + this.NZ) * 31 + this.Ob;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder().append(Integer.toHexString(System.identityHashCode(this))).append("[");
      String str;
      switch (this.nJ)
      {
      case 3: 
      case 5: 
      case 6: 
      case 7: 
      default: 
        str = "??";
      }
      for (;;)
      {
        return str + ",s:" + this.NZ + "c:" + this.Ob + ",p:" + this.Oa + "]";
        str = "add";
        continue;
        str = "rm";
        continue;
        str = "up";
        continue;
        str = "mv";
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
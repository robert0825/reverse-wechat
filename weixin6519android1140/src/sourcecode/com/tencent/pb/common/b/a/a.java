package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.c;
import com.google.a.a.e;
import com.google.a.a.g;
import java.util.Arrays;

public abstract interface a
{
  public static final class a
    extends e
  {
    public String groupId = "";
    public int qGO = 0;
    public long qGP = 0L;
    public int[] xKZ = g.aCQ;
    public int xLa = 0;
    public String[] xLb = g.EMPTY_STRING_ARRAY;
    
    public a()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      int j = 0;
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.qGO != 0) {
        paramb.ap(2, this.qGO);
      }
      if (this.qGP != 0L) {
        paramb.g(3, this.qGP);
      }
      int i;
      if ((this.xKZ != null) && (this.xKZ.length > 0))
      {
        i = 0;
        while (i < this.xKZ.length)
        {
          paramb.aq(4, this.xKZ[i]);
          i += 1;
        }
      }
      if (this.xLa != 0) {
        paramb.ap(5, this.xLa);
      }
      if ((this.xLb != null) && (this.xLb.length > 0))
      {
        i = j;
        while (i < this.xLb.length)
        {
          String str = this.xLb[i];
          if (str != null) {
            paramb.e(100, str);
          }
          i += 1;
        }
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int n = 0;
      int j = super.nw();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.qGO != 0) {
        j = i + b.ar(2, this.qGO);
      }
      i = j;
      if (this.qGP != 0L) {
        i = j + b.i(3, this.qGP);
      }
      j = i;
      int k;
      if (this.xKZ != null)
      {
        j = i;
        if (this.xKZ.length > 0)
        {
          j = 0;
          k = 0;
          while (j < this.xKZ.length)
          {
            k += b.cM(this.xKZ[j]);
            j += 1;
          }
          j = i + k + this.xKZ.length * 1;
        }
      }
      i = j;
      if (this.xLa != 0) {
        i = j + b.ar(5, this.xLa);
      }
      j = i;
      if (this.xLb != null)
      {
        j = i;
        if (this.xLb.length > 0)
        {
          k = 0;
          int m = 0;
          j = n;
          while (j < this.xLb.length)
          {
            String str = this.xLb[j];
            int i1 = k;
            n = m;
            if (str != null)
            {
              n = m + 1;
              i1 = k + b.aF(str);
            }
            j += 1;
            k = i1;
            m = n;
          }
          j = i + k + m * 2;
        }
      }
      return j;
    }
  }
  
  public static final class aa
    extends e
  {
    public String groupId = "";
    public int qGO = 0;
    public long qGP = 0L;
    public int xLC = 0;
    public a.as xLJ = null;
    public a.av[] xLN = a.av.cmO();
    public a.at xLe = null;
    public int xLo = 0;
    public int xMA = 0;
    public int xMB = 0;
    public a.o[] xMC = a.o.cmI();
    public int xMD = 0;
    public a.av[] xMu = a.av.cmO();
    public a.o[] xMv = a.o.cmI();
    public a.aw[] xMw = a.aw.cmP();
    public int xMx = 0;
    public int[] xMy = g.aCQ;
    public a.o[] xMz = a.o.cmI();
    
    public aa()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      int j = 0;
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.qGO != 0) {
        paramb.ap(2, this.qGO);
      }
      if (this.qGP != 0L) {
        paramb.g(3, this.qGP);
      }
      int i;
      Object localObject;
      if ((this.xMv != null) && (this.xMv.length > 0))
      {
        i = 0;
        while (i < this.xMv.length)
        {
          localObject = this.xMv[i];
          if (localObject != null) {
            paramb.a(4, (e)localObject);
          }
          i += 1;
        }
      }
      if ((this.xMu != null) && (this.xMu.length > 0))
      {
        i = 0;
        while (i < this.xMu.length)
        {
          localObject = this.xMu[i];
          if (localObject != null) {
            paramb.a(5, (e)localObject);
          }
          i += 1;
        }
      }
      if (this.xLJ != null) {
        paramb.a(6, this.xLJ);
      }
      if (this.xMx != 0) {
        paramb.ap(7, this.xMx);
      }
      if ((this.xMy != null) && (this.xMy.length > 0))
      {
        i = 0;
        while (i < this.xMy.length)
        {
          paramb.ap(8, this.xMy[i]);
          i += 1;
        }
      }
      if (this.xLo != 0) {
        paramb.ap(9, this.xLo);
      }
      if ((this.xMw != null) && (this.xMw.length > 0))
      {
        i = 0;
        while (i < this.xMw.length)
        {
          localObject = this.xMw[i];
          if (localObject != null) {
            paramb.a(10, (e)localObject);
          }
          i += 1;
        }
      }
      if (this.xLe != null) {
        paramb.a(11, this.xLe);
      }
      if (this.xLC != 0) {
        paramb.aq(12, this.xLC);
      }
      if ((this.xMz != null) && (this.xMz.length > 0))
      {
        i = 0;
        while (i < this.xMz.length)
        {
          localObject = this.xMz[i];
          if (localObject != null) {
            paramb.a(13, (e)localObject);
          }
          i += 1;
        }
      }
      if ((this.xMC != null) && (this.xMC.length > 0))
      {
        i = 0;
        while (i < this.xMC.length)
        {
          localObject = this.xMC[i];
          if (localObject != null) {
            paramb.a(14, (e)localObject);
          }
          i += 1;
        }
      }
      if (this.xMD != 0) {
        paramb.ap(15, this.xMD);
      }
      if (this.xMA != 0) {
        paramb.aq(100, this.xMA);
      }
      if (this.xMB != 0) {
        paramb.aq(101, this.xMB);
      }
      if ((this.xLN != null) && (this.xLN.length > 0))
      {
        i = j;
        while (i < this.xLN.length)
        {
          localObject = this.xLN[i];
          if (localObject != null) {
            paramb.a(102, (e)localObject);
          }
          i += 1;
        }
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int m = 0;
      int j = super.nw();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.qGO != 0) {
        j = i + b.ar(2, this.qGO);
      }
      i = j;
      if (this.qGP != 0L) {
        i = j + b.i(3, this.qGP);
      }
      j = i;
      Object localObject;
      if (this.xMv != null)
      {
        j = i;
        if (this.xMv.length > 0)
        {
          j = 0;
          while (j < this.xMv.length)
          {
            localObject = this.xMv[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(4, (e)localObject);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (this.xMu != null)
      {
        i = j;
        if (this.xMu.length > 0)
        {
          i = j;
          j = 0;
          while (j < this.xMu.length)
          {
            localObject = this.xMu[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(5, (e)localObject);
            }
            j += 1;
            i = k;
          }
        }
      }
      j = i;
      if (this.xLJ != null) {
        j = i + b.b(6, this.xLJ);
      }
      i = j;
      if (this.xMx != 0) {
        i = j + b.ar(7, this.xMx);
      }
      j = i;
      if (this.xMy != null)
      {
        j = i;
        if (this.xMy.length > 0)
        {
          j = 0;
          k = 0;
          while (j < this.xMy.length)
          {
            k += b.cI(this.xMy[j]);
            j += 1;
          }
          j = i + k + this.xMy.length * 1;
        }
      }
      i = j;
      if (this.xLo != 0) {
        i = j + b.ar(9, this.xLo);
      }
      j = i;
      if (this.xMw != null)
      {
        j = i;
        if (this.xMw.length > 0)
        {
          j = 0;
          while (j < this.xMw.length)
          {
            localObject = this.xMw[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(10, (e)localObject);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      int k = j;
      if (this.xLe != null) {
        k = j + b.b(11, this.xLe);
      }
      i = k;
      if (this.xLC != 0) {
        i = k + b.as(12, this.xLC);
      }
      j = i;
      if (this.xMz != null)
      {
        j = i;
        if (this.xMz.length > 0)
        {
          j = 0;
          while (j < this.xMz.length)
          {
            localObject = this.xMz[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(13, (e)localObject);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (this.xMC != null)
      {
        i = j;
        if (this.xMC.length > 0)
        {
          i = j;
          j = 0;
          while (j < this.xMC.length)
          {
            localObject = this.xMC[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(14, (e)localObject);
            }
            j += 1;
            i = k;
          }
        }
      }
      j = i;
      if (this.xMD != 0) {
        j = i + b.ar(15, this.xMD);
      }
      k = j;
      if (this.xMA != 0) {
        k = j + b.as(100, this.xMA);
      }
      i = k;
      if (this.xMB != 0) {
        i = k + b.as(101, this.xMB);
      }
      k = i;
      if (this.xLN != null)
      {
        k = i;
        if (this.xLN.length > 0)
        {
          j = m;
          for (;;)
          {
            k = i;
            if (j >= this.xLN.length) {
              break;
            }
            localObject = this.xLN[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(102, (e)localObject);
            }
            j += 1;
            i = k;
          }
        }
      }
      return k;
    }
  }
  
  public static final class ab
    extends e
  {
    public String groupId = "";
    public int qGO = 0;
    public long qGP = 0L;
    
    public ab()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.qGO != 0) {
        paramb.ap(2, this.qGO);
      }
      if (this.qGP != 0L) {
        paramb.g(3, this.qGP);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.qGO != 0) {
        j = i + b.ar(2, this.qGO);
      }
      i = j;
      if (this.qGP != 0L) {
        i = j + b.i(3, this.qGP);
      }
      return i;
    }
  }
  
  public static final class ac
    extends e
  {
    public String groupId = "";
    public a.at xLe = null;
    public int xME = 0;
    
    public ac()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.xLe != null) {
        paramb.a(2, this.xLe);
      }
      if (this.xME != 0) {
        paramb.ap(3, this.xME);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.xLe != null) {
        j = i + b.b(2, this.xLe);
      }
      i = j;
      if (this.xME != 0) {
        i = j + b.ar(3, this.xME);
      }
      return i;
    }
  }
  
  public static final class ad
    extends e
  {
    public String groupId = "";
    public int qGO = 0;
    public long qGP = 0L;
    public String xLc = "";
    
    public ad()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.qGO != 0) {
        paramb.ap(2, this.qGO);
      }
      if (this.qGP != 0L) {
        paramb.g(3, this.qGP);
      }
      if (!this.xLc.equals("")) {
        paramb.e(4, this.xLc);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.qGO != 0) {
        j = i + b.ar(2, this.qGO);
      }
      i = j;
      if (this.qGP != 0L) {
        i = j + b.i(3, this.qGP);
      }
      j = i;
      if (!this.xLc.equals("")) {
        j = i + b.f(4, this.xLc);
      }
      return j;
    }
  }
  
  public static final class ae
    extends e
  {
    public int mjF = 0;
    public long mjG = 0L;
    
    public ae()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      if (this.mjF != 0) {
        paramb.ap(1, this.mjF);
      }
      if (this.mjG != 0L) {
        paramb.g(2, this.mjG);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (this.mjF != 0) {
        i = j + b.ar(1, this.mjF);
      }
      j = i;
      if (this.mjG != 0L) {
        j = i + b.i(2, this.mjG);
      }
      return j;
    }
  }
  
  public static final class af
    extends e
  {
    public int bitRate = 0;
    public int mjF = 0;
    public long mjG = 0L;
    
    public af()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      if (this.bitRate != 0) {
        paramb.aq(1, this.bitRate);
      }
      if (this.mjF != 0) {
        paramb.ap(2, this.mjF);
      }
      if (this.mjG != 0L) {
        paramb.g(3, this.mjG);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (this.bitRate != 0) {
        i = j + b.as(1, this.bitRate);
      }
      j = i;
      if (this.mjF != 0) {
        j = i + b.ar(2, this.mjF);
      }
      i = j;
      if (this.mjG != 0L) {
        i = j + b.i(3, this.mjG);
      }
      return i;
    }
  }
  
  public static final class ag
    extends e
  {
    public String groupId = "";
    public int qGO = 0;
    public long qGP = 0L;
    public a.as xLJ = null;
    public a.av[] xLN = a.av.cmO();
    public a.at xLe = null;
    public a.av[] xMu = a.av.cmO();
    public a.o[] xMv = a.o.cmI();
    public a.aw[] xMw = a.aw.cmP();
    public int xMx = 0;
    public int[] xMy = g.aCQ;
    
    public ag()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      int j = 0;
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.qGO != 0) {
        paramb.ap(2, this.qGO);
      }
      if (this.qGP != 0L) {
        paramb.g(3, this.qGP);
      }
      int i;
      Object localObject;
      if ((this.xMv != null) && (this.xMv.length > 0))
      {
        i = 0;
        while (i < this.xMv.length)
        {
          localObject = this.xMv[i];
          if (localObject != null) {
            paramb.a(4, (e)localObject);
          }
          i += 1;
        }
      }
      if (this.xLJ != null) {
        paramb.a(5, this.xLJ);
      }
      if (this.xMx != 0) {
        paramb.ap(6, this.xMx);
      }
      if ((this.xMy != null) && (this.xMy.length > 0))
      {
        i = 0;
        while (i < this.xMy.length)
        {
          paramb.ap(7, this.xMy[i]);
          i += 1;
        }
      }
      if ((this.xMu != null) && (this.xMu.length > 0))
      {
        i = 0;
        while (i < this.xMu.length)
        {
          localObject = this.xMu[i];
          if (localObject != null) {
            paramb.a(200, (e)localObject);
          }
          i += 1;
        }
      }
      if ((this.xMw != null) && (this.xMw.length > 0))
      {
        i = 0;
        while (i < this.xMw.length)
        {
          localObject = this.xMw[i];
          if (localObject != null) {
            paramb.a(201, (e)localObject);
          }
          i += 1;
        }
      }
      if (this.xLe != null) {
        paramb.a(202, this.xLe);
      }
      if ((this.xLN != null) && (this.xLN.length > 0))
      {
        i = j;
        while (i < this.xLN.length)
        {
          localObject = this.xLN[i];
          if (localObject != null) {
            paramb.a(203, (e)localObject);
          }
          i += 1;
        }
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int m = 0;
      int j = super.nw();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.qGO != 0) {
        j = i + b.ar(2, this.qGO);
      }
      i = j;
      if (this.qGP != 0L) {
        i = j + b.i(3, this.qGP);
      }
      j = i;
      Object localObject;
      if (this.xMv != null)
      {
        j = i;
        if (this.xMv.length > 0)
        {
          j = 0;
          while (j < this.xMv.length)
          {
            localObject = this.xMv[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(4, (e)localObject);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (this.xLJ != null) {
        i = j + b.b(5, this.xLJ);
      }
      j = i;
      if (this.xMx != 0) {
        j = i + b.ar(6, this.xMx);
      }
      i = j;
      if (this.xMy != null)
      {
        i = j;
        if (this.xMy.length > 0)
        {
          i = 0;
          k = 0;
          while (i < this.xMy.length)
          {
            k += b.cI(this.xMy[i]);
            i += 1;
          }
          i = j + k + this.xMy.length * 1;
        }
      }
      j = i;
      if (this.xMu != null)
      {
        j = i;
        if (this.xMu.length > 0)
        {
          j = 0;
          while (j < this.xMu.length)
          {
            localObject = this.xMu[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(200, (e)localObject);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      int k = j;
      if (this.xMw != null)
      {
        k = j;
        if (this.xMw.length > 0)
        {
          i = j;
          j = 0;
          while (j < this.xMw.length)
          {
            localObject = this.xMw[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(201, (e)localObject);
            }
            j += 1;
            i = k;
          }
          k = i;
        }
      }
      i = k;
      if (this.xLe != null) {
        i = k + b.b(202, this.xLe);
      }
      k = i;
      if (this.xLN != null)
      {
        k = i;
        if (this.xLN.length > 0)
        {
          j = m;
          for (;;)
          {
            k = i;
            if (j >= this.xLN.length) {
              break;
            }
            localObject = this.xLN[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(203, (e)localObject);
            }
            j += 1;
            i = k;
          }
        }
      }
      return k;
    }
  }
  
  public static final class ah
    extends e
  {
    public a.au[] xMF = a.au.cmN();
    
    public ah()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      if ((this.xMF != null) && (this.xMF.length > 0))
      {
        int i = 0;
        while (i < this.xMF.length)
        {
          a.au localau = this.xMF[i];
          if (localau != null) {
            paramb.a(1, localau);
          }
          i += 1;
        }
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int i = super.nw();
      int k = i;
      if (this.xMF != null)
      {
        k = i;
        if (this.xMF.length > 0)
        {
          int j = 0;
          for (;;)
          {
            k = i;
            if (j >= this.xMF.length) {
              break;
            }
            a.au localau = this.xMF[j];
            k = i;
            if (localau != null) {
              k = i + b.b(1, localau);
            }
            j += 1;
            i = k;
          }
        }
      }
      return k;
    }
  }
  
  public static final class ai
    extends e
  {
    public int ret = 0;
    
    public ai()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      if (this.ret != 0) {
        paramb.ap(1, this.ret);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (this.ret != 0) {
        i = j + b.ar(1, this.ret);
      }
      return i;
    }
  }
  
  public static final class aj
    extends e
  {
    public String groupId = "";
    public int qGO = 0;
    public long qGP = 0L;
    public a.as xLJ = null;
    public a.av[] xLN = a.av.cmO();
    public a.at xLe = null;
    public a.o[] xMC = a.o.cmI();
    public int xMD = 0;
    public a.av[] xMu = a.av.cmO();
    public a.o[] xMv = a.o.cmI();
    public a.aw[] xMw = a.aw.cmP();
    public int xMx = 0;
    public int[] xMy = g.aCQ;
    public a.o[] xMz = a.o.cmI();
    
    public aj()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      int j = 0;
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.qGO != 0) {
        paramb.ap(2, this.qGO);
      }
      if (this.qGP != 0L) {
        paramb.g(3, this.qGP);
      }
      int i;
      Object localObject;
      if ((this.xMv != null) && (this.xMv.length > 0))
      {
        i = 0;
        while (i < this.xMv.length)
        {
          localObject = this.xMv[i];
          if (localObject != null) {
            paramb.a(4, (e)localObject);
          }
          i += 1;
        }
      }
      if ((this.xMu != null) && (this.xMu.length > 0))
      {
        i = 0;
        while (i < this.xMu.length)
        {
          localObject = this.xMu[i];
          if (localObject != null) {
            paramb.a(5, (e)localObject);
          }
          i += 1;
        }
      }
      if (this.xLJ != null) {
        paramb.a(6, this.xLJ);
      }
      if (this.xMx != 0) {
        paramb.ap(7, this.xMx);
      }
      if ((this.xMy != null) && (this.xMy.length > 0))
      {
        i = 0;
        while (i < this.xMy.length)
        {
          paramb.ap(8, this.xMy[i]);
          i += 1;
        }
      }
      if ((this.xMw != null) && (this.xMw.length > 0))
      {
        i = 0;
        while (i < this.xMw.length)
        {
          localObject = this.xMw[i];
          if (localObject != null) {
            paramb.a(9, (e)localObject);
          }
          i += 1;
        }
      }
      if (this.xLe != null) {
        paramb.a(10, this.xLe);
      }
      if ((this.xMz != null) && (this.xMz.length > 0))
      {
        i = 0;
        while (i < this.xMz.length)
        {
          localObject = this.xMz[i];
          if (localObject != null) {
            paramb.a(11, (e)localObject);
          }
          i += 1;
        }
      }
      if ((this.xLN != null) && (this.xLN.length > 0))
      {
        i = 0;
        while (i < this.xLN.length)
        {
          localObject = this.xLN[i];
          if (localObject != null) {
            paramb.a(12, (e)localObject);
          }
          i += 1;
        }
      }
      if ((this.xMC != null) && (this.xMC.length > 0))
      {
        i = j;
        while (i < this.xMC.length)
        {
          localObject = this.xMC[i];
          if (localObject != null) {
            paramb.a(13, (e)localObject);
          }
          i += 1;
        }
      }
      if (this.xMD != 0) {
        paramb.ap(14, this.xMD);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int m = 0;
      int j = super.nw();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.qGO != 0) {
        j = i + b.ar(2, this.qGO);
      }
      i = j;
      if (this.qGP != 0L) {
        i = j + b.i(3, this.qGP);
      }
      j = i;
      Object localObject;
      if (this.xMv != null)
      {
        j = i;
        if (this.xMv.length > 0)
        {
          j = 0;
          while (j < this.xMv.length)
          {
            localObject = this.xMv[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(4, (e)localObject);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (this.xMu != null)
      {
        i = j;
        if (this.xMu.length > 0)
        {
          i = j;
          j = 0;
          while (j < this.xMu.length)
          {
            localObject = this.xMu[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(5, (e)localObject);
            }
            j += 1;
            i = k;
          }
        }
      }
      int k = i;
      if (this.xLJ != null) {
        k = i + b.b(6, this.xLJ);
      }
      j = k;
      if (this.xMx != 0) {
        j = k + b.ar(7, this.xMx);
      }
      i = j;
      if (this.xMy != null)
      {
        i = j;
        if (this.xMy.length > 0)
        {
          i = 0;
          k = 0;
          while (i < this.xMy.length)
          {
            k += b.cI(this.xMy[i]);
            i += 1;
          }
          i = j + k + this.xMy.length * 1;
        }
      }
      j = i;
      if (this.xMw != null)
      {
        j = i;
        if (this.xMw.length > 0)
        {
          j = 0;
          while (j < this.xMw.length)
          {
            localObject = this.xMw[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(9, (e)localObject);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (this.xLe != null) {
        i = j + b.b(10, this.xLe);
      }
      j = i;
      if (this.xMz != null)
      {
        j = i;
        if (this.xMz.length > 0)
        {
          j = 0;
          while (j < this.xMz.length)
          {
            localObject = this.xMz[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(11, (e)localObject);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (this.xLN != null)
      {
        i = j;
        if (this.xLN.length > 0)
        {
          i = j;
          j = 0;
          while (j < this.xLN.length)
          {
            localObject = this.xLN[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(12, (e)localObject);
            }
            j += 1;
            i = k;
          }
        }
      }
      j = i;
      if (this.xMC != null)
      {
        j = i;
        if (this.xMC.length > 0)
        {
          k = m;
          for (;;)
          {
            j = i;
            if (k >= this.xMC.length) {
              break;
            }
            localObject = this.xMC[k];
            j = i;
            if (localObject != null) {
              j = i + b.b(13, (e)localObject);
            }
            k += 1;
            i = j;
          }
        }
      }
      i = j;
      if (this.xMD != 0) {
        i = j + b.ar(14, this.xMD);
      }
      return i;
    }
  }
  
  public static final class ak
    extends e
  {
    public String groupId = "";
    public int qGO = 0;
    public long qGP = 0L;
    
    public ak()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.qGO != 0) {
        paramb.ap(2, this.qGO);
      }
      if (this.qGP != 0L) {
        paramb.g(3, this.qGP);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.qGO != 0) {
        j = i + b.ar(2, this.qGO);
      }
      i = j;
      if (this.qGP != 0L) {
        i = j + b.i(3, this.qGP);
      }
      return i;
    }
  }
  
  public static final class al
    extends e
  {
    public byte[] buffer = g.aCW;
    public int uNN = 0;
    
    public al()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      paramb.aq(1, this.uNN);
      if (!Arrays.equals(this.buffer, g.aCW)) {
        paramb.a(2, this.buffer);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw() + b.as(1, this.uNN);
      int i = j;
      if (!Arrays.equals(this.buffer, g.aCW)) {
        i = j + b.b(2, this.buffer);
      }
      return i;
    }
  }
  
  public static final class am
    extends e
  {
    private static volatile am[] xMG;
    public int mkl = 0;
    public int tLG = 0;
    public String xMH = "";
    public int xMI = 0;
    
    public am()
    {
      this.aCP = -1;
    }
    
    public static am[] cmK()
    {
      if (xMG == null) {}
      synchronized (c.aCO)
      {
        if (xMG == null) {
          xMG = new am[0];
        }
        return xMG;
      }
    }
    
    public final void a(b paramb)
    {
      if (this.mkl != 0) {
        paramb.aq(1, this.mkl);
      }
      if (!this.xMH.equals("")) {
        paramb.e(2, this.xMH);
      }
      if (this.tLG != 0) {
        paramb.aq(3, this.tLG);
      }
      if (this.xMI != 0) {
        paramb.aq(4, this.xMI);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (this.mkl != 0) {
        i = j + b.as(1, this.mkl);
      }
      j = i;
      if (!this.xMH.equals("")) {
        j = i + b.f(2, this.xMH);
      }
      i = j;
      if (this.tLG != 0) {
        i = j + b.as(3, this.tLG);
      }
      j = i;
      if (this.xMI != 0) {
        j = i + b.as(4, this.xMI);
      }
      return j;
    }
  }
  
  public static final class an
    extends e
  {
    public int gVC = 0;
    public long xMJ = 0L;
    public int xMK = 0;
    
    public an()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      if (this.xMJ != 0L) {
        paramb.f(1, this.xMJ);
      }
      if (this.gVC != 0) {
        paramb.aq(2, this.gVC);
      }
      if (this.xMK != 0) {
        paramb.aq(3, this.xMK);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (this.xMJ != 0L) {
        i = j + b.h(1, this.xMJ);
      }
      j = i;
      if (this.gVC != 0) {
        j = i + b.as(2, this.gVC);
      }
      i = j;
      if (this.xMK != 0) {
        i = j + b.as(3, this.xMK);
      }
      return i;
    }
  }
  
  public static final class ao
    extends e
  {
    private static volatile ao[] xML;
    public int bitRate = 0;
    public int fps = 0;
    public int mkl = 0;
    public int xMM = 0;
    
    public ao()
    {
      this.aCP = -1;
    }
    
    public static ao[] cmL()
    {
      if (xML == null) {}
      synchronized (c.aCO)
      {
        if (xML == null) {
          xML = new ao[0];
        }
        return xML;
      }
    }
    
    public final void a(b paramb)
    {
      if (this.mkl != 0) {
        paramb.ap(1, this.mkl);
      }
      if (this.xMM != 0) {
        paramb.ap(2, this.xMM);
      }
      if (this.fps != 0) {
        paramb.ap(3, this.fps);
      }
      if (this.bitRate != 0) {
        paramb.ap(4, this.bitRate);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (this.mkl != 0) {
        i = j + b.ar(1, this.mkl);
      }
      j = i;
      if (this.xMM != 0) {
        j = i + b.ar(2, this.xMM);
      }
      i = j;
      if (this.fps != 0) {
        i = j + b.ar(3, this.fps);
      }
      j = i;
      if (this.bitRate != 0) {
        j = i + b.ar(4, this.bitRate);
      }
      return j;
    }
  }
  
  public static final class ap
    extends e
  {
    public int xMN = 0;
    public int xMO = 0;
    
    public ap()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      if (this.xMN != 0) {
        paramb.ap(1, this.xMN);
      }
      if (this.xMO != 0) {
        paramb.ap(2, this.xMO);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (this.xMN != 0) {
        i = j + b.ar(1, this.xMN);
      }
      j = i;
      if (this.xMO != 0) {
        j = i + b.ar(2, this.xMO);
      }
      return j;
    }
  }
  
  public static final class aq
    extends e
  {
    public int nvM = 0;
    
    public aq()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      if (this.nvM != 0) {
        paramb.ap(1, this.nvM);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (this.nvM != 0) {
        i = j + b.ar(1, this.nvM);
      }
      return i;
    }
  }
  
  public static final class ar
    extends e
  {
    private static volatile ar[] xMP;
    public int xMQ = 0;
    public int xMR = 0;
    public byte[] xMS = g.aCW;
    
    public ar()
    {
      this.aCP = -1;
    }
    
    public static ar[] cmM()
    {
      if (xMP == null) {}
      synchronized (c.aCO)
      {
        if (xMP == null) {
          xMP = new ar[0];
        }
        return xMP;
      }
    }
    
    public final void a(b paramb)
    {
      if (this.xMQ != 0) {
        paramb.ap(1, this.xMQ);
      }
      if (this.xMR != 0) {
        paramb.ap(2, this.xMR);
      }
      if (!Arrays.equals(this.xMS, g.aCW)) {
        paramb.a(3, this.xMS);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (this.xMQ != 0) {
        i = j + b.ar(1, this.xMQ);
      }
      j = i;
      if (this.xMR != 0) {
        j = i + b.ar(2, this.xMR);
      }
      i = j;
      if (!Arrays.equals(this.xMS, g.aCW)) {
        i = j + b.b(3, this.xMS);
      }
      return i;
    }
  }
  
  public static final class as
    extends e
  {
    public int gBs = 0;
    public int gBt = 0;
    public int xMT = 0;
    public int xMU = 0;
    public int xMV = 0;
    public int xMW = 0;
    public int xMX = 0;
    public int xMY = 0;
    public int xMZ = 0;
    public int xNa = 0;
    public int xNb = 0;
    public int xNc = 0;
    
    public as()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      if (this.xMT != 0) {
        paramb.ap(1, this.xMT);
      }
      if (this.gBs != 0) {
        paramb.ap(2, this.gBs);
      }
      if (this.gBt != 0) {
        paramb.ap(3, this.gBt);
      }
      if (this.xMU != 0) {
        paramb.ap(4, this.xMU);
      }
      if (this.xMV != 0) {
        paramb.ap(5, this.xMV);
      }
      if (this.xMW != 0) {
        paramb.ap(6, this.xMW);
      }
      if (this.xMX != 0) {
        paramb.ap(7, this.xMX);
      }
      if (this.xMY != 0) {
        paramb.ap(8, this.xMY);
      }
      if (this.xMZ != 0) {
        paramb.ap(9, this.xMZ);
      }
      if (this.xNa != 0) {
        paramb.ap(10, this.xNa);
      }
      if (this.xNb != 0) {
        paramb.ap(11, this.xNb);
      }
      if (this.xNc != 0) {
        paramb.ap(12, this.xNc);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (this.xMT != 0) {
        i = j + b.ar(1, this.xMT);
      }
      j = i;
      if (this.gBs != 0) {
        j = i + b.ar(2, this.gBs);
      }
      i = j;
      if (this.gBt != 0) {
        i = j + b.ar(3, this.gBt);
      }
      j = i;
      if (this.xMU != 0) {
        j = i + b.ar(4, this.xMU);
      }
      i = j;
      if (this.xMV != 0) {
        i = j + b.ar(5, this.xMV);
      }
      j = i;
      if (this.xMW != 0) {
        j = i + b.ar(6, this.xMW);
      }
      i = j;
      if (this.xMX != 0) {
        i = j + b.ar(7, this.xMX);
      }
      j = i;
      if (this.xMY != 0) {
        j = i + b.ar(8, this.xMY);
      }
      i = j;
      if (this.xMZ != 0) {
        i = j + b.ar(9, this.xMZ);
      }
      j = i;
      if (this.xNa != 0) {
        j = i + b.ar(10, this.xNa);
      }
      i = j;
      if (this.xNb != 0) {
        i = j + b.ar(11, this.xNb);
      }
      j = i;
      if (this.xNc != 0) {
        j = i + b.ar(12, this.xNc);
      }
      return j;
    }
  }
  
  public static final class at
    extends e
  {
    public byte[] aGQ = g.aCW;
    public int eIv = 0;
    public String name = "";
    public byte[] xNd = g.aCW;
    public long xNe = 0L;
    public byte[] xNf = g.aCW;
    public byte[] xNg = g.aCW;
    public byte[] xNh = g.aCW;
    public a.ax xNi = null;
    public byte[] xNj = g.aCW;
    public a.ap xNk = null;
    public String xNl = "";
    public String xNm = "";
    public long xNn = 0L;
    public byte[] xNo = g.aCW;
    public byte[] xNp = g.aCW;
    public byte[] xNq = g.aCW;
    public byte[] xNr = g.aCW;
    public int xNs = 0;
    public byte[] xNt = g.aCW;
    public byte[] xNu = g.aCW;
    public int xNv = 0;
    public a.n[] xNw = a.n.cmH();
    
    public at()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      if (!this.name.equals("")) {
        paramb.e(1, this.name);
      }
      if (!Arrays.equals(this.xNd, g.aCW)) {
        paramb.a(2, this.xNd);
      }
      if (this.eIv != 0) {
        paramb.ap(3, this.eIv);
      }
      if (this.xNe != 0L) {
        paramb.f(4, this.xNe);
      }
      if (!Arrays.equals(this.xNf, g.aCW)) {
        paramb.a(5, this.xNf);
      }
      if (!Arrays.equals(this.xNg, g.aCW)) {
        paramb.a(6, this.xNg);
      }
      if (!Arrays.equals(this.xNh, g.aCW)) {
        paramb.a(7, this.xNh);
      }
      if (this.xNi != null) {
        paramb.a(8, this.xNi);
      }
      if (!Arrays.equals(this.xNj, g.aCW)) {
        paramb.a(9, this.xNj);
      }
      if (this.xNk != null) {
        paramb.a(10, this.xNk);
      }
      if (!this.xNl.equals("")) {
        paramb.e(100, this.xNl);
      }
      if (!this.xNm.equals("")) {
        paramb.e(101, this.xNm);
      }
      if (this.xNn != 0L) {
        paramb.f(200, this.xNn);
      }
      if (!Arrays.equals(this.xNo, g.aCW)) {
        paramb.a(201, this.xNo);
      }
      if (!Arrays.equals(this.xNp, g.aCW)) {
        paramb.a(202, this.xNp);
      }
      if (!Arrays.equals(this.xNq, g.aCW)) {
        paramb.a(203, this.xNq);
      }
      if (!Arrays.equals(this.xNr, g.aCW)) {
        paramb.a(204, this.xNr);
      }
      if (this.xNs != 0) {
        paramb.ap(220, this.xNs);
      }
      if (!Arrays.equals(this.xNt, g.aCW)) {
        paramb.a(221, this.xNt);
      }
      if (!Arrays.equals(this.xNu, g.aCW)) {
        paramb.a(222, this.xNu);
      }
      if (!Arrays.equals(this.aGQ, g.aCW)) {
        paramb.a(223, this.aGQ);
      }
      if (this.xNv != 0) {
        paramb.aq(224, this.xNv);
      }
      if ((this.xNw != null) && (this.xNw.length > 0))
      {
        int i = 0;
        while (i < this.xNw.length)
        {
          a.n localn = this.xNw[i];
          if (localn != null) {
            paramb.a(225, localn);
          }
          i += 1;
        }
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (!this.name.equals("")) {
        i = j + b.f(1, this.name);
      }
      j = i;
      if (!Arrays.equals(this.xNd, g.aCW)) {
        j = i + b.b(2, this.xNd);
      }
      i = j;
      if (this.eIv != 0) {
        i = j + b.ar(3, this.eIv);
      }
      j = i;
      if (this.xNe != 0L) {
        j = i + b.h(4, this.xNe);
      }
      i = j;
      if (!Arrays.equals(this.xNf, g.aCW)) {
        i = j + b.b(5, this.xNf);
      }
      j = i;
      if (!Arrays.equals(this.xNg, g.aCW)) {
        j = i + b.b(6, this.xNg);
      }
      i = j;
      if (!Arrays.equals(this.xNh, g.aCW)) {
        i = j + b.b(7, this.xNh);
      }
      j = i;
      if (this.xNi != null) {
        j = i + b.b(8, this.xNi);
      }
      i = j;
      if (!Arrays.equals(this.xNj, g.aCW)) {
        i = j + b.b(9, this.xNj);
      }
      j = i;
      if (this.xNk != null) {
        j = i + b.b(10, this.xNk);
      }
      i = j;
      if (!this.xNl.equals("")) {
        i = j + b.f(100, this.xNl);
      }
      j = i;
      if (!this.xNm.equals("")) {
        j = i + b.f(101, this.xNm);
      }
      i = j;
      if (this.xNn != 0L) {
        i = j + b.h(200, this.xNn);
      }
      j = i;
      if (!Arrays.equals(this.xNo, g.aCW)) {
        j = i + b.b(201, this.xNo);
      }
      i = j;
      if (!Arrays.equals(this.xNp, g.aCW)) {
        i = j + b.b(202, this.xNp);
      }
      j = i;
      if (!Arrays.equals(this.xNq, g.aCW)) {
        j = i + b.b(203, this.xNq);
      }
      i = j;
      if (!Arrays.equals(this.xNr, g.aCW)) {
        i = j + b.b(204, this.xNr);
      }
      j = i;
      if (this.xNs != 0) {
        j = i + b.ar(220, this.xNs);
      }
      i = j;
      if (!Arrays.equals(this.xNt, g.aCW)) {
        i = j + b.b(221, this.xNt);
      }
      j = i;
      if (!Arrays.equals(this.xNu, g.aCW)) {
        j = i + b.b(222, this.xNu);
      }
      int k = j;
      if (!Arrays.equals(this.aGQ, g.aCW)) {
        k = j + b.b(223, this.aGQ);
      }
      i = k;
      if (this.xNv != 0) {
        i = k + b.as(224, this.xNv);
      }
      j = i;
      if (this.xNw != null)
      {
        j = i;
        if (this.xNw.length > 0)
        {
          j = 0;
          while (j < this.xNw.length)
          {
            a.n localn = this.xNw[j];
            k = i;
            if (localn != null) {
              k = i + b.b(225, localn);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      return j;
    }
  }
  
  public static final class au
    extends e
  {
    private static volatile au[] xNx;
    public String groupId = "";
    public int qGO = 0;
    public long qGP = 0L;
    public int xLh = 0;
    public a.av[] xMu = a.av.cmO();
    public String xNy = "";
    
    public au()
    {
      this.aCP = -1;
    }
    
    public static au[] cmN()
    {
      if (xNx == null) {}
      synchronized (c.aCO)
      {
        if (xNx == null) {
          xNx = new au[0];
        }
        return xNx;
      }
    }
    
    public final void a(b paramb)
    {
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.qGO != 0) {
        paramb.ap(2, this.qGO);
      }
      if (this.qGP != 0L) {
        paramb.g(3, this.qGP);
      }
      if ((this.xMu != null) && (this.xMu.length > 0))
      {
        int i = 0;
        while (i < this.xMu.length)
        {
          a.av localav = this.xMu[i];
          if (localav != null) {
            paramb.a(4, localav);
          }
          i += 1;
        }
      }
      if (this.xLh != 0) {
        paramb.aq(5, this.xLh);
      }
      if (!this.xNy.equals("")) {
        paramb.e(6, this.xNy);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.qGO != 0) {
        j = i + b.ar(2, this.qGO);
      }
      i = j;
      if (this.qGP != 0L) {
        i = j + b.i(3, this.qGP);
      }
      j = i;
      if (this.xMu != null)
      {
        j = i;
        if (this.xMu.length > 0)
        {
          j = 0;
          while (j < this.xMu.length)
          {
            a.av localav = this.xMu[j];
            int k = i;
            if (localav != null) {
              k = i + b.b(4, localav);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (this.xLh != 0) {
        i = j + b.as(5, this.xLh);
      }
      j = i;
      if (!this.xNy.equals("")) {
        j = i + b.f(6, this.xNy);
      }
      return j;
    }
  }
  
  public static final class av
    extends e
  {
    private static volatile av[] xNz;
    public int eMw = 0;
    public int mkl = -1;
    public int qRI = 0;
    public int status = 0;
    public int tLG = 0;
    public int xLn = 0;
    public byte[] xLs = g.aCW;
    public String xMH = "";
    public int xNA = 0;
    public int xNB = 0;
    public a.aq xNC = null;
    public int xND = 0;
    public String xNE = "";
    public a.ar[] xNF = a.ar.cmM();
    public int xNG = 0;
    public int[] xNH = g.aCQ;
    public int xNI = 0;
    public int xNJ = 0;
    public int xNK = 0;
    public int xNL = 0;
    public a.an xNM = null;
    public String xNN = "";
    public int xNO = 0;
    public a.s xNP = null;
    public int xNQ = -1;
    public String xNR = "";
    public int xNS = 0;
    public int xNT = 0;
    public int xNU = 0;
    public int xNV = 0;
    
    public av()
    {
      this.aCP = -1;
    }
    
    public static av[] cmO()
    {
      if (xNz == null) {}
      synchronized (c.aCO)
      {
        if (xNz == null) {
          xNz = new av[0];
        }
        return xNz;
      }
    }
    
    public final void a(b paramb)
    {
      int j = 0;
      if (this.tLG != 0) {
        paramb.aq(1, this.tLG);
      }
      if (this.xNA != 0) {
        paramb.aq(2, this.xNA);
      }
      if (this.status != 0) {
        paramb.aq(3, this.status);
      }
      if (this.eMw != 0) {
        paramb.aq(4, this.eMw);
      }
      if (this.mkl != -1) {
        paramb.ap(5, this.mkl);
      }
      if (this.xNB != 0) {
        paramb.aq(6, this.xNB);
      }
      if (this.xNC != null) {
        paramb.a(7, this.xNC);
      }
      if (this.xND != 0) {
        paramb.aq(8, this.xND);
      }
      if (!this.xNE.equals("")) {
        paramb.e(9, this.xNE);
      }
      int i;
      if ((this.xNF != null) && (this.xNF.length > 0))
      {
        i = 0;
        while (i < this.xNF.length)
        {
          a.ar localar = this.xNF[i];
          if (localar != null) {
            paramb.a(10, localar);
          }
          i += 1;
        }
      }
      if (this.xNG != 0) {
        paramb.aq(11, this.xNG);
      }
      if ((this.xNH != null) && (this.xNH.length > 0))
      {
        i = j;
        while (i < this.xNH.length)
        {
          paramb.aq(12, this.xNH[i]);
          i += 1;
        }
      }
      if (this.xNI != 0) {
        paramb.aq(13, this.xNI);
      }
      if (this.xNJ != 0) {
        paramb.aq(14, this.xNJ);
      }
      if (this.xNK != 0) {
        paramb.aq(15, this.xNK);
      }
      if (this.xNL != 0) {
        paramb.aq(16, this.xNL);
      }
      if (this.xNM != null) {
        paramb.a(17, this.xNM);
      }
      if (!this.xMH.equals("")) {
        paramb.e(100, this.xMH);
      }
      if (!this.xNN.equals("")) {
        paramb.e(101, this.xNN);
      }
      if (this.xNO != 0) {
        paramb.aq(102, this.xNO);
      }
      if (!Arrays.equals(this.xLs, g.aCW)) {
        paramb.a(200, this.xLs);
      }
      if (this.xNP != null) {
        paramb.a(201, this.xNP);
      }
      if (this.xNQ != -1) {
        paramb.ap(202, this.xNQ);
      }
      if (!this.xNR.equals("")) {
        paramb.e(203, this.xNR);
      }
      if (this.xNS != 0) {
        paramb.ap(204, this.xNS);
      }
      if (this.xNT != 0) {
        paramb.aq(205, this.xNT);
      }
      if (this.qRI != 0) {
        paramb.aq(206, this.qRI);
      }
      if (this.xNU != 0) {
        paramb.aq(207, this.xNU);
      }
      if (this.xNV != 0) {
        paramb.aq(208, this.xNV);
      }
      if (this.xLn != 0) {
        paramb.aq(240, this.xLn);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int m = 0;
      int j = super.nw();
      int i = j;
      if (this.tLG != 0) {
        i = j + b.as(1, this.tLG);
      }
      j = i;
      if (this.xNA != 0) {
        j = i + b.as(2, this.xNA);
      }
      i = j;
      if (this.status != 0) {
        i = j + b.as(3, this.status);
      }
      j = i;
      if (this.eMw != 0) {
        j = i + b.as(4, this.eMw);
      }
      i = j;
      if (this.mkl != -1) {
        i = j + b.ar(5, this.mkl);
      }
      j = i;
      if (this.xNB != 0) {
        j = i + b.as(6, this.xNB);
      }
      i = j;
      if (this.xNC != null) {
        i = j + b.b(7, this.xNC);
      }
      j = i;
      if (this.xND != 0) {
        j = i + b.as(8, this.xND);
      }
      i = j;
      if (!this.xNE.equals("")) {
        i = j + b.f(9, this.xNE);
      }
      j = i;
      int k;
      if (this.xNF != null)
      {
        j = i;
        if (this.xNF.length > 0)
        {
          j = 0;
          while (j < this.xNF.length)
          {
            a.ar localar = this.xNF[j];
            k = i;
            if (localar != null) {
              k = i + b.b(10, localar);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (this.xNG != 0) {
        i = j + b.as(11, this.xNG);
      }
      j = i;
      if (this.xNH != null)
      {
        j = i;
        if (this.xNH.length > 0)
        {
          k = 0;
          j = m;
          while (j < this.xNH.length)
          {
            k += b.cM(this.xNH[j]);
            j += 1;
          }
          j = i + k + this.xNH.length * 1;
        }
      }
      i = j;
      if (this.xNI != 0) {
        i = j + b.as(13, this.xNI);
      }
      j = i;
      if (this.xNJ != 0) {
        j = i + b.as(14, this.xNJ);
      }
      i = j;
      if (this.xNK != 0) {
        i = j + b.as(15, this.xNK);
      }
      j = i;
      if (this.xNL != 0) {
        j = i + b.as(16, this.xNL);
      }
      i = j;
      if (this.xNM != null) {
        i = j + b.b(17, this.xNM);
      }
      j = i;
      if (!this.xMH.equals("")) {
        j = i + b.f(100, this.xMH);
      }
      i = j;
      if (!this.xNN.equals("")) {
        i = j + b.f(101, this.xNN);
      }
      j = i;
      if (this.xNO != 0) {
        j = i + b.as(102, this.xNO);
      }
      i = j;
      if (!Arrays.equals(this.xLs, g.aCW)) {
        i = j + b.b(200, this.xLs);
      }
      j = i;
      if (this.xNP != null) {
        j = i + b.b(201, this.xNP);
      }
      i = j;
      if (this.xNQ != -1) {
        i = j + b.ar(202, this.xNQ);
      }
      j = i;
      if (!this.xNR.equals("")) {
        j = i + b.f(203, this.xNR);
      }
      i = j;
      if (this.xNS != 0) {
        i = j + b.ar(204, this.xNS);
      }
      j = i;
      if (this.xNT != 0) {
        j = i + b.as(205, this.xNT);
      }
      i = j;
      if (this.qRI != 0) {
        i = j + b.as(206, this.qRI);
      }
      j = i;
      if (this.xNU != 0) {
        j = i + b.as(207, this.xNU);
      }
      i = j;
      if (this.xNV != 0) {
        i = j + b.as(208, this.xNV);
      }
      j = i;
      if (this.xLn != 0) {
        j = i + b.as(240, this.xLn);
      }
      return j;
    }
  }
  
  public static final class aw
    extends e
  {
    private static volatile aw[] xNW;
    public String ofe = "";
    public int tLG = 0;
    public String username = "";
    public long xNX = 0L;
    public String xNY = "";
    public String xNZ = "";
    
    public aw()
    {
      this.aCP = -1;
    }
    
    public static aw[] cmP()
    {
      if (xNW == null) {}
      synchronized (c.aCO)
      {
        if (xNW == null) {
          xNW = new aw[0];
        }
        return xNW;
      }
    }
    
    public final void a(b paramb)
    {
      if (this.tLG != 0) {
        paramb.aq(1, this.tLG);
      }
      if (!this.username.equals("")) {
        paramb.e(2, this.username);
      }
      if (!this.ofe.equals("")) {
        paramb.e(3, this.ofe);
      }
      if (this.xNX != 0L) {
        paramb.f(4, this.xNX);
      }
      if (!this.xNY.equals("")) {
        paramb.e(5, this.xNY);
      }
      if (!this.xNZ.equals("")) {
        paramb.e(6, this.xNZ);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (this.tLG != 0) {
        i = j + b.as(1, this.tLG);
      }
      j = i;
      if (!this.username.equals("")) {
        j = i + b.f(2, this.username);
      }
      i = j;
      if (!this.ofe.equals("")) {
        i = j + b.f(3, this.ofe);
      }
      j = i;
      if (this.xNX != 0L) {
        j = i + b.h(4, this.xNX);
      }
      i = j;
      if (!this.xNY.equals("")) {
        i = j + b.f(5, this.xNY);
      }
      j = i;
      if (!this.xNZ.equals("")) {
        j = i + b.f(6, this.xNZ);
      }
      return j;
    }
  }
  
  public static final class ax
    extends e
  {
    public int xOa = 0;
    
    public ax()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      if (this.xOa != 0) {
        paramb.aq(1, this.xOa);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (this.xOa != 0) {
        i = j + b.as(1, this.xOa);
      }
      return i;
    }
  }
  
  public static final class ay
    extends e
  {
    public int qGO = 0;
    public long qGP = 0L;
    public int xOb = 0;
    
    public ay()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      if (this.qGO != 0) {
        paramb.ap(1, this.qGO);
      }
      if (this.qGP != 0L) {
        paramb.g(2, this.qGP);
      }
      if (this.xOb != 0) {
        paramb.aq(3, this.xOb);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (this.qGO != 0) {
        i = j + b.ar(1, this.qGO);
      }
      j = i;
      if (this.qGP != 0L) {
        j = i + b.i(2, this.qGP);
      }
      i = j;
      if (this.xOb != 0) {
        i = j + b.as(3, this.xOb);
      }
      return i;
    }
  }
  
  public static final class az
    extends e
  {
    private static volatile az[] xOc;
    public int jWT = 0;
    public int xOd = 0;
    public int xOe = 0;
    public int xOf = 0;
    public int xOg = 0;
    
    public az()
    {
      this.aCP = -1;
    }
    
    public static az[] cmQ()
    {
      if (xOc == null) {}
      synchronized (c.aCO)
      {
        if (xOc == null) {
          xOc = new az[0];
        }
        return xOc;
      }
    }
    
    public final void a(b paramb)
    {
      if (this.jWT != 0) {
        paramb.ap(1, this.jWT);
      }
      if (this.xOd != 0) {
        paramb.ap(2, this.xOd);
      }
      if (this.xOe != 0) {
        paramb.ap(3, this.xOe);
      }
      if (this.xOf != 0) {
        paramb.ap(4, this.xOf);
      }
      if (this.xOg != 0) {
        paramb.ap(5, this.xOg);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (this.jWT != 0) {
        i = j + b.ar(1, this.jWT);
      }
      j = i;
      if (this.xOd != 0) {
        j = i + b.ar(2, this.xOd);
      }
      i = j;
      if (this.xOe != 0) {
        i = j + b.ar(3, this.xOe);
      }
      j = i;
      if (this.xOf != 0) {
        j = i + b.ar(4, this.xOf);
      }
      i = j;
      if (this.xOg != 0) {
        i = j + b.ar(5, this.xOg);
      }
      return i;
    }
  }
  
  public static final class b
    extends e
  {
    public int eMw = 0;
    public String xLc = "";
    
    public b()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      if (!this.xLc.equals("")) {
        paramb.e(1, this.xLc);
      }
      if (this.eMw != 0) {
        paramb.ap(2, this.eMw);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (!this.xLc.equals("")) {
        i = j + b.f(1, this.xLc);
      }
      j = i;
      if (this.eMw != 0) {
        j = i + b.ar(2, this.eMw);
      }
      return j;
    }
  }
  
  public static final class ba
    extends e
  {
    public int type = 0;
    public a.al xOh = null;
    
    public ba()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      if (this.type != 0) {
        paramb.ap(1, this.type);
      }
      if (this.xOh != null) {
        paramb.a(2, this.xOh);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (this.type != 0) {
        i = j + b.ar(1, this.type);
      }
      j = i;
      if (this.xOh != null) {
        j = i + b.b(2, this.xOh);
      }
      return j;
    }
  }
  
  public static final class bb
    extends e
  {
    public String groupId = "";
    public int qGO = 0;
    public long qGP = 0L;
    public int xLh = 0;
    public a.av[] xMu = a.av.cmO();
    public String xNy = "";
    public int xOi = 0;
    public String xOj = "";
    public String[] xOk = g.EMPTY_STRING_ARRAY;
    public long xOl = 0L;
    
    public bb()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      int j = 0;
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.qGO != 0) {
        paramb.ap(2, this.qGO);
      }
      if (this.qGP != 0L) {
        paramb.g(3, this.qGP);
      }
      if (this.xLh != 0) {
        paramb.aq(4, this.xLh);
      }
      if (this.xOi != 0) {
        paramb.ap(5, this.xOi);
      }
      if (!this.xNy.equals("")) {
        paramb.e(6, this.xNy);
      }
      int i;
      Object localObject;
      if ((this.xMu != null) && (this.xMu.length > 0))
      {
        i = 0;
        while (i < this.xMu.length)
        {
          localObject = this.xMu[i];
          if (localObject != null) {
            paramb.a(7, (e)localObject);
          }
          i += 1;
        }
      }
      if (!this.xOj.equals("")) {
        paramb.e(8, this.xOj);
      }
      if ((this.xOk != null) && (this.xOk.length > 0))
      {
        i = j;
        while (i < this.xOk.length)
        {
          localObject = this.xOk[i];
          if (localObject != null) {
            paramb.e(9, (String)localObject);
          }
          i += 1;
        }
      }
      if (this.xOl != 0L) {
        paramb.f(10, this.xOl);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int n = 0;
      int j = super.nw();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.qGO != 0) {
        j = i + b.ar(2, this.qGO);
      }
      i = j;
      if (this.qGP != 0L) {
        i = j + b.i(3, this.qGP);
      }
      j = i;
      if (this.xLh != 0) {
        j = i + b.as(4, this.xLh);
      }
      int k = j;
      if (this.xOi != 0) {
        k = j + b.ar(5, this.xOi);
      }
      i = k;
      if (!this.xNy.equals("")) {
        i = k + b.f(6, this.xNy);
      }
      j = i;
      Object localObject;
      if (this.xMu != null)
      {
        j = i;
        if (this.xMu.length > 0)
        {
          j = 0;
          while (j < this.xMu.length)
          {
            localObject = this.xMu[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(7, (e)localObject);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (!this.xOj.equals("")) {
        i = j + b.f(8, this.xOj);
      }
      j = i;
      if (this.xOk != null)
      {
        j = i;
        if (this.xOk.length > 0)
        {
          k = 0;
          int m = 0;
          j = n;
          while (j < this.xOk.length)
          {
            localObject = this.xOk[j];
            int i1 = k;
            n = m;
            if (localObject != null)
            {
              n = m + 1;
              i1 = k + b.aF((String)localObject);
            }
            j += 1;
            k = i1;
            m = n;
          }
          j = i + k + m * 1;
        }
      }
      i = j;
      if (this.xOl != 0L) {
        i = j + b.h(10, this.xOl);
      }
      return i;
    }
  }
  
  public static final class c
    extends e
  {
    public a.w[] xLd = a.w.cmJ();
    
    public c()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      if ((this.xLd != null) && (this.xLd.length > 0))
      {
        int i = 0;
        while (i < this.xLd.length)
        {
          a.w localw = this.xLd[i];
          if (localw != null) {
            paramb.a(1, localw);
          }
          i += 1;
        }
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int i = super.nw();
      int k = i;
      if (this.xLd != null)
      {
        k = i;
        if (this.xLd.length > 0)
        {
          int j = 0;
          for (;;)
          {
            k = i;
            if (j >= this.xLd.length) {
              break;
            }
            a.w localw = this.xLd[j];
            k = i;
            if (localw != null) {
              k = i + b.b(1, localw);
            }
            j += 1;
            i = k;
          }
        }
      }
      return k;
    }
  }
  
  public static final class d
    extends e
  {
    public String xLc = "";
    public a.at xLe = null;
    public int[] xLf = g.aCQ;
    public a.ba xLg = null;
    public int xLh = 0;
    public int xLi = 0;
    public a.ay xLj = null;
    public String xLk = "";
    public String[] xLl = g.EMPTY_STRING_ARRAY;
    public a.m[] xLm = a.m.cmG();
    public int xLn = 0;
    
    public d()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      int j = 0;
      if (this.xLe != null) {
        paramb.a(1, this.xLe);
      }
      int i;
      if ((this.xLf != null) && (this.xLf.length > 0))
      {
        i = 0;
        while (i < this.xLf.length)
        {
          paramb.aq(2, this.xLf[i]);
          i += 1;
        }
      }
      if (this.xLg != null) {
        paramb.a(3, this.xLg);
      }
      if (this.xLh != 0) {
        paramb.aq(4, this.xLh);
      }
      if (this.xLi != 0) {
        paramb.aq(5, this.xLi);
      }
      if (this.xLj != null) {
        paramb.a(6, this.xLj);
      }
      if (!this.xLc.equals("")) {
        paramb.e(7, this.xLc);
      }
      if (!this.xLk.equals("")) {
        paramb.e(8, this.xLk);
      }
      Object localObject;
      if ((this.xLl != null) && (this.xLl.length > 0))
      {
        i = 0;
        while (i < this.xLl.length)
        {
          localObject = this.xLl[i];
          if (localObject != null) {
            paramb.e(100, (String)localObject);
          }
          i += 1;
        }
      }
      if ((this.xLm != null) && (this.xLm.length > 0))
      {
        i = j;
        while (i < this.xLm.length)
        {
          localObject = this.xLm[i];
          if (localObject != null) {
            paramb.a(202, (e)localObject);
          }
          i += 1;
        }
      }
      if (this.xLn != 0) {
        paramb.aq(240, this.xLn);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int i2 = 0;
      int j = super.nw();
      int i = j;
      if (this.xLe != null) {
        i = j + b.b(1, this.xLe);
      }
      j = i;
      int k;
      if (this.xLf != null)
      {
        j = i;
        if (this.xLf.length > 0)
        {
          j = 0;
          k = 0;
          while (j < this.xLf.length)
          {
            k += b.cM(this.xLf[j]);
            j += 1;
          }
          j = i + k + this.xLf.length * 1;
        }
      }
      i = j;
      if (this.xLg != null) {
        i = j + b.b(3, this.xLg);
      }
      j = i;
      if (this.xLh != 0) {
        j = i + b.as(4, this.xLh);
      }
      i = j;
      if (this.xLi != 0) {
        i = j + b.as(5, this.xLi);
      }
      j = i;
      if (this.xLj != null) {
        j = i + b.b(6, this.xLj);
      }
      i = j;
      if (!this.xLc.equals("")) {
        i = j + b.f(7, this.xLc);
      }
      j = i;
      if (!this.xLk.equals("")) {
        j = i + b.f(8, this.xLk);
      }
      i = j;
      Object localObject;
      if (this.xLl != null)
      {
        i = j;
        if (this.xLl.length > 0)
        {
          i = 0;
          k = 0;
          int n;
          for (int m = 0; i < this.xLl.length; m = n)
          {
            localObject = this.xLl[i];
            int i1 = k;
            n = m;
            if (localObject != null)
            {
              n = m + 1;
              i1 = k + b.aF((String)localObject);
            }
            i += 1;
            k = i1;
          }
          i = j + k + m * 2;
        }
      }
      j = i;
      if (this.xLm != null)
      {
        j = i;
        if (this.xLm.length > 0)
        {
          k = i2;
          for (;;)
          {
            j = i;
            if (k >= this.xLm.length) {
              break;
            }
            localObject = this.xLm[k];
            j = i;
            if (localObject != null) {
              j = i + b.b(202, (e)localObject);
            }
            k += 1;
            i = j;
          }
        }
      }
      i = j;
      if (this.xLn != 0) {
        i = j + b.as(240, this.xLn);
      }
      return i;
    }
  }
  
  public static final class e
    extends e
  {
    public String groupId = "";
    public int qGO = 0;
    public long qGP = 0L;
    public int xLa = 0;
    public a.at xLe = null;
    public a.ba xLg = null;
    public int xLi = 0;
    public String[] xLl = g.EMPTY_STRING_ARRAY;
    public a.m[] xLm = a.m.cmG();
    public int xLn = 0;
    public int xLo = 0;
    public a.s xLp = null;
    public int xLq = 0;
    
    public e()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      int j = 0;
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.qGO != 0) {
        paramb.ap(2, this.qGO);
      }
      if (this.qGP != 0L) {
        paramb.g(3, this.qGP);
      }
      if (this.xLg != null) {
        paramb.a(4, this.xLg);
      }
      if (this.xLo != 0) {
        paramb.ap(5, this.xLo);
      }
      if (this.xLi != 0) {
        paramb.aq(6, this.xLi);
      }
      if (this.xLa != 0) {
        paramb.ap(7, this.xLa);
      }
      if (this.xLe != null) {
        paramb.a(200, this.xLe);
      }
      int i;
      Object localObject;
      if ((this.xLl != null) && (this.xLl.length > 0))
      {
        i = 0;
        while (i < this.xLl.length)
        {
          localObject = this.xLl[i];
          if (localObject != null) {
            paramb.e(201, (String)localObject);
          }
          i += 1;
        }
      }
      if ((this.xLm != null) && (this.xLm.length > 0))
      {
        i = j;
        while (i < this.xLm.length)
        {
          localObject = this.xLm[i];
          if (localObject != null) {
            paramb.a(202, (e)localObject);
          }
          i += 1;
        }
      }
      if (this.xLp != null) {
        paramb.a(203, this.xLp);
      }
      if (this.xLq != 0) {
        paramb.aq(204, this.xLq);
      }
      if (this.xLn != 0) {
        paramb.aq(240, this.xLn);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int i2 = 0;
      int j = super.nw();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.qGO != 0) {
        j = i + b.ar(2, this.qGO);
      }
      i = j;
      if (this.qGP != 0L) {
        i = j + b.i(3, this.qGP);
      }
      j = i;
      if (this.xLg != null) {
        j = i + b.b(4, this.xLg);
      }
      i = j;
      if (this.xLo != 0) {
        i = j + b.ar(5, this.xLo);
      }
      j = i;
      if (this.xLi != 0) {
        j = i + b.as(6, this.xLi);
      }
      i = j;
      if (this.xLa != 0) {
        i = j + b.ar(7, this.xLa);
      }
      j = i;
      if (this.xLe != null) {
        j = i + b.b(200, this.xLe);
      }
      i = j;
      int k;
      Object localObject;
      if (this.xLl != null)
      {
        i = j;
        if (this.xLl.length > 0)
        {
          i = 0;
          k = 0;
          int n;
          for (int m = 0; i < this.xLl.length; m = n)
          {
            localObject = this.xLl[i];
            int i1 = k;
            n = m;
            if (localObject != null)
            {
              n = m + 1;
              i1 = k + b.aF((String)localObject);
            }
            i += 1;
            k = i1;
          }
          i = j + k + m * 2;
        }
      }
      j = i;
      if (this.xLm != null)
      {
        j = i;
        if (this.xLm.length > 0)
        {
          k = i2;
          for (;;)
          {
            j = i;
            if (k >= this.xLm.length) {
              break;
            }
            localObject = this.xLm[k];
            j = i;
            if (localObject != null) {
              j = i + b.b(202, (e)localObject);
            }
            k += 1;
            i = j;
          }
        }
      }
      i = j;
      if (this.xLp != null) {
        i = j + b.b(203, this.xLp);
      }
      j = i;
      if (this.xLq != 0) {
        j = i + b.as(204, this.xLq);
      }
      i = j;
      if (this.xLn != 0) {
        i = j + b.as(240, this.xLn);
      }
      return i;
    }
  }
  
  public static final class f
    extends e
  {
    public int eMw = 0;
    public String groupId = "";
    public int qGO = 0;
    public long qGP = 0L;
    public int xLr = 0;
    
    public f()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.qGO != 0) {
        paramb.ap(2, this.qGO);
      }
      if (this.qGP != 0L) {
        paramb.g(3, this.qGP);
      }
      if (this.eMw != 0) {
        paramb.ap(4, this.eMw);
      }
      if (this.xLr != 0) {
        paramb.ap(5, this.xLr);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.qGO != 0) {
        j = i + b.ar(2, this.qGO);
      }
      i = j;
      if (this.qGP != 0L) {
        i = j + b.i(3, this.qGP);
      }
      j = i;
      if (this.eMw != 0) {
        j = i + b.ar(4, this.eMw);
      }
      i = j;
      if (this.xLr != 0) {
        i = j + b.ar(5, this.xLr);
      }
      return i;
    }
  }
  
  public static final class g
    extends e
  {
    public int eMw = 0;
    public String groupId = "";
    public int qGO = 0;
    public long qGP = 0L;
    public String xLc = "";
    
    public g()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.qGO != 0) {
        paramb.ap(2, this.qGO);
      }
      if (this.qGP != 0L) {
        paramb.g(3, this.qGP);
      }
      if (this.eMw != 0) {
        paramb.ap(4, this.eMw);
      }
      if (!this.xLc.equals("")) {
        paramb.e(5, this.xLc);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.qGO != 0) {
        j = i + b.ar(2, this.qGO);
      }
      i = j;
      if (this.qGP != 0L) {
        i = j + b.i(3, this.qGP);
      }
      j = i;
      if (this.eMw != 0) {
        j = i + b.ar(4, this.eMw);
      }
      i = j;
      if (!this.xLc.equals("")) {
        i = j + b.f(5, this.xLc);
      }
      return i;
    }
  }
  
  public static final class h
    extends e
  {
    public String groupId = "";
    public String jQV = "";
    public int mjF = 0;
    public long mjG = 0L;
    public long timestamp = 0L;
    
    public h()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      paramb.ap(1, this.mjF);
      paramb.g(2, this.mjG);
      paramb.e(3, this.jQV);
      if (!this.groupId.equals("")) {
        paramb.e(4, this.groupId);
      }
      if (this.timestamp != 0L) {
        paramb.f(5, this.timestamp);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw() + b.ar(1, this.mjF) + b.i(2, this.mjG) + b.f(3, this.jQV);
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(4, this.groupId);
      }
      j = i;
      if (this.timestamp != 0L) {
        j = i + b.h(5, this.timestamp);
      }
      return j;
    }
  }
  
  public static final class i
    extends e
  {
    public int action = 0;
    public String groupId = "";
    public int mjF = 0;
    public long mjG = 0L;
    public long timestamp = 0L;
    
    public i()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      paramb.aq(1, this.action);
      paramb.ap(2, this.mjF);
      paramb.g(3, this.mjG);
      if (!this.groupId.equals("")) {
        paramb.e(4, this.groupId);
      }
      if (this.timestamp != 0L) {
        paramb.f(5, this.timestamp);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw() + b.as(1, this.action) + b.ar(2, this.mjF) + b.i(3, this.mjG);
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(4, this.groupId);
      }
      j = i;
      if (this.timestamp != 0L) {
        j = i + b.h(5, this.timestamp);
      }
      return j;
    }
  }
  
  public static final class j
    extends e
  {
    public String groupId = "";
    public int qGO = 0;
    public long qGP = 0L;
    public a.ba xLg = null;
    public int xLi = 0;
    public byte[] xLs = g.aCW;
    
    public j()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.qGO != 0) {
        paramb.ap(2, this.qGO);
      }
      if (this.qGP != 0L) {
        paramb.g(3, this.qGP);
      }
      if (this.xLg != null) {
        paramb.a(4, this.xLg);
      }
      if (this.xLi != 0) {
        paramb.aq(5, this.xLi);
      }
      if (!Arrays.equals(this.xLs, g.aCW)) {
        paramb.a(200, this.xLs);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.qGO != 0) {
        j = i + b.ar(2, this.qGO);
      }
      i = j;
      if (this.qGP != 0L) {
        i = j + b.i(3, this.qGP);
      }
      j = i;
      if (this.xLg != null) {
        j = i + b.b(4, this.xLg);
      }
      i = j;
      if (this.xLi != 0) {
        i = j + b.as(5, this.xLi);
      }
      j = i;
      if (!Arrays.equals(this.xLs, g.aCW)) {
        j = i + b.b(200, this.xLs);
      }
      return j;
    }
  }
  
  public static final class k
    extends e
  {
    public String groupId = "";
    public int mkl = -1;
    public int qGO = 0;
    public long qGP = 0L;
    public int xLi = 0;
    
    public k()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.qGO != 0) {
        paramb.ap(2, this.qGO);
      }
      if (this.qGP != 0L) {
        paramb.g(3, this.qGP);
      }
      if (this.mkl != -1) {
        paramb.ap(4, this.mkl);
      }
      if (this.xLi != 0) {
        paramb.aq(5, this.xLi);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.qGO != 0) {
        j = i + b.ar(2, this.qGO);
      }
      i = j;
      if (this.qGP != 0L) {
        i = j + b.i(3, this.qGP);
      }
      j = i;
      if (this.mkl != -1) {
        j = i + b.ar(4, this.mkl);
      }
      i = j;
      if (this.xLi != 0) {
        i = j + b.as(5, this.xLi);
      }
      return i;
    }
  }
  
  public static final class l
    extends e
  {
    public String groupId = "";
    public int haG = 0;
    public int mkl = -1;
    public int qGO = 0;
    public long qGP = 0L;
    public int xLt = 0;
    public byte[] xLu = g.aCW;
    public a.az[] xLv = a.az.cmQ();
    public a.ao[] xLw = a.ao.cmL();
    public int xLx = 0;
    public int xLy = 0;
    
    public l()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      int j = 0;
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.qGO != 0) {
        paramb.ap(2, this.qGO);
      }
      if (this.qGP != 0L) {
        paramb.g(3, this.qGP);
      }
      if (this.mkl != -1) {
        paramb.ap(4, this.mkl);
      }
      if (this.xLt != 0) {
        paramb.ap(5, this.xLt);
      }
      if (!Arrays.equals(this.xLu, g.aCW)) {
        paramb.a(6, this.xLu);
      }
      int i;
      Object localObject;
      if ((this.xLv != null) && (this.xLv.length > 0))
      {
        i = 0;
        while (i < this.xLv.length)
        {
          localObject = this.xLv[i];
          if (localObject != null) {
            paramb.a(7, (e)localObject);
          }
          i += 1;
        }
      }
      if ((this.xLw != null) && (this.xLw.length > 0))
      {
        i = j;
        while (i < this.xLw.length)
        {
          localObject = this.xLw[i];
          if (localObject != null) {
            paramb.a(8, (e)localObject);
          }
          i += 1;
        }
      }
      if (this.xLx != 0) {
        paramb.ap(9, this.xLx);
      }
      if (this.xLy != 0) {
        paramb.ap(10, this.xLy);
      }
      if (this.haG != 0) {
        paramb.ap(11, this.haG);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int m = 0;
      int j = super.nw();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.qGO != 0) {
        j = i + b.ar(2, this.qGO);
      }
      i = j;
      if (this.qGP != 0L) {
        i = j + b.i(3, this.qGP);
      }
      j = i;
      if (this.mkl != -1) {
        j = i + b.ar(4, this.mkl);
      }
      i = j;
      if (this.xLt != 0) {
        i = j + b.ar(5, this.xLt);
      }
      j = i;
      if (!Arrays.equals(this.xLu, g.aCW)) {
        j = i + b.b(6, this.xLu);
      }
      i = j;
      Object localObject;
      int k;
      if (this.xLv != null)
      {
        i = j;
        if (this.xLv.length > 0)
        {
          i = j;
          j = 0;
          while (j < this.xLv.length)
          {
            localObject = this.xLv[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(7, (e)localObject);
            }
            j += 1;
            i = k;
          }
        }
      }
      j = i;
      if (this.xLw != null)
      {
        j = i;
        if (this.xLw.length > 0)
        {
          k = m;
          for (;;)
          {
            j = i;
            if (k >= this.xLw.length) {
              break;
            }
            localObject = this.xLw[k];
            j = i;
            if (localObject != null) {
              j = i + b.b(8, (e)localObject);
            }
            k += 1;
            i = j;
          }
        }
      }
      i = j;
      if (this.xLx != 0) {
        i = j + b.ar(9, this.xLx);
      }
      j = i;
      if (this.xLy != 0) {
        j = i + b.ar(10, this.xLy);
      }
      i = j;
      if (this.haG != 0) {
        i = j + b.ar(11, this.haG);
      }
      return i;
    }
  }
  
  public static final class m
    extends e
  {
    private static volatile m[] xLz;
    public String eCQ = "";
    public int tLG = 0;
    public String xLA = "";
    
    public m()
    {
      this.aCP = -1;
    }
    
    public static m[] cmG()
    {
      if (xLz == null) {}
      synchronized (c.aCO)
      {
        if (xLz == null) {
          xLz = new m[0];
        }
        return xLz;
      }
    }
    
    public final void a(b paramb)
    {
      if (this.tLG != 0) {
        paramb.aq(1, this.tLG);
      }
      if (!this.eCQ.equals("")) {
        paramb.e(2, this.eCQ);
      }
      if (!this.xLA.equals("")) {
        paramb.e(3, this.xLA);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (this.tLG != 0) {
        i = j + b.as(1, this.tLG);
      }
      j = i;
      if (!this.eCQ.equals("")) {
        j = i + b.f(2, this.eCQ);
      }
      i = j;
      if (!this.xLA.equals("")) {
        i = j + b.f(3, this.xLA);
      }
      return i;
    }
  }
  
  public static final class n
    extends e
  {
    private static volatile n[] xLB;
    public byte[] eLG = g.aCW;
    public int xLC = 0;
    public int xLD = 0;
    
    public n()
    {
      this.aCP = -1;
    }
    
    public static n[] cmH()
    {
      if (xLB == null) {}
      synchronized (c.aCO)
      {
        if (xLB == null) {
          xLB = new n[0];
        }
        return xLB;
      }
    }
    
    public final void a(b paramb)
    {
      if (this.xLC != 0) {
        paramb.ap(1, this.xLC);
      }
      if (!Arrays.equals(this.eLG, g.aCW)) {
        paramb.a(2, this.eLG);
      }
      if (this.xLD != 0) {
        paramb.aq(3, this.xLD);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (this.xLC != 0) {
        i = j + b.ar(1, this.xLC);
      }
      j = i;
      if (!Arrays.equals(this.eLG, g.aCW)) {
        j = i + b.b(2, this.eLG);
      }
      i = j;
      if (this.xLD != 0) {
        i = j + b.as(3, this.xLD);
      }
      return i;
    }
  }
  
  public static final class o
    extends e
  {
    private static volatile o[] xLE;
    public int port = 0;
    public int xLF = 0;
    
    public o()
    {
      this.aCP = -1;
    }
    
    public static o[] cmI()
    {
      if (xLE == null) {}
      synchronized (c.aCO)
      {
        if (xLE == null) {
          xLE = new o[0];
        }
        return xLE;
      }
    }
    
    public final void a(b paramb)
    {
      if (this.xLF != 0) {
        paramb.aq(1, this.xLF);
      }
      if (this.port != 0) {
        paramb.ap(2, this.port);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (this.xLF != 0) {
        i = j + b.as(1, this.xLF);
      }
      j = i;
      if (this.port != 0) {
        j = i + b.ar(2, this.port);
      }
      return j;
    }
  }
  
  public static final class p
    extends e
  {
    public long eDr = 0L;
    public String groupId = "";
    public int qGO = 0;
    public long qGP = 0L;
    public int xLG = 0;
    public a.aw[] xLH = a.aw.cmP();
    public a.av[] xLI = a.av.cmO();
    public a.as xLJ = null;
    public int xLK = 0;
    public byte[] xLL = g.aCW;
    public byte[] xLM = g.aCW;
    public a.av[] xLN = a.av.cmO();
    public a.at xLe = null;
    public int xLh = 0;
    public a.ay xLj = null;
    
    public p()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      int j = 0;
      if (this.xLG != 0) {
        paramb.ap(1, this.xLG);
      }
      if (!this.groupId.equals("")) {
        paramb.e(2, this.groupId);
      }
      if (this.qGO != 0) {
        paramb.ap(3, this.qGO);
      }
      if (this.qGP != 0L) {
        paramb.g(4, this.qGP);
      }
      if (this.xLh != 0) {
        paramb.aq(5, this.xLh);
      }
      if (this.xLe != null) {
        paramb.a(6, this.xLe);
      }
      int i;
      Object localObject;
      if ((this.xLH != null) && (this.xLH.length > 0))
      {
        i = 0;
        while (i < this.xLH.length)
        {
          localObject = this.xLH[i];
          if (localObject != null) {
            paramb.a(7, (e)localObject);
          }
          i += 1;
        }
      }
      if ((this.xLI != null) && (this.xLI.length > 0))
      {
        i = 0;
        while (i < this.xLI.length)
        {
          localObject = this.xLI[i];
          if (localObject != null) {
            paramb.a(8, (e)localObject);
          }
          i += 1;
        }
      }
      if (this.xLJ != null) {
        paramb.a(9, this.xLJ);
      }
      if (this.xLj != null) {
        paramb.a(10, this.xLj);
      }
      if (this.eDr != 0L) {
        paramb.f(101, this.eDr);
      }
      if (this.xLK != 0) {
        paramb.aq(102, this.xLK);
      }
      if (!Arrays.equals(this.xLL, g.aCW)) {
        paramb.a(103, this.xLL);
      }
      if (!Arrays.equals(this.xLM, g.aCW)) {
        paramb.a(200, this.xLM);
      }
      if ((this.xLN != null) && (this.xLN.length > 0))
      {
        i = j;
        while (i < this.xLN.length)
        {
          localObject = this.xLN[i];
          if (localObject != null) {
            paramb.a(201, (e)localObject);
          }
          i += 1;
        }
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int m = 0;
      int j = super.nw();
      int i = j;
      if (this.xLG != 0) {
        i = j + b.ar(1, this.xLG);
      }
      j = i;
      if (!this.groupId.equals("")) {
        j = i + b.f(2, this.groupId);
      }
      i = j;
      if (this.qGO != 0) {
        i = j + b.ar(3, this.qGO);
      }
      j = i;
      if (this.qGP != 0L) {
        j = i + b.i(4, this.qGP);
      }
      int k = j;
      if (this.xLh != 0) {
        k = j + b.as(5, this.xLh);
      }
      i = k;
      if (this.xLe != null) {
        i = k + b.b(6, this.xLe);
      }
      j = i;
      Object localObject;
      if (this.xLH != null)
      {
        j = i;
        if (this.xLH.length > 0)
        {
          j = 0;
          while (j < this.xLH.length)
          {
            localObject = this.xLH[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(7, (e)localObject);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (this.xLI != null)
      {
        i = j;
        if (this.xLI.length > 0)
        {
          i = j;
          j = 0;
          while (j < this.xLI.length)
          {
            localObject = this.xLI[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(8, (e)localObject);
            }
            j += 1;
            i = k;
          }
        }
      }
      j = i;
      if (this.xLJ != null) {
        j = i + b.b(9, this.xLJ);
      }
      i = j;
      if (this.xLj != null) {
        i = j + b.b(10, this.xLj);
      }
      j = i;
      if (this.eDr != 0L) {
        j = i + b.h(101, this.eDr);
      }
      i = j;
      if (this.xLK != 0) {
        i = j + b.as(102, this.xLK);
      }
      j = i;
      if (!Arrays.equals(this.xLL, g.aCW)) {
        j = i + b.b(103, this.xLL);
      }
      i = j;
      if (!Arrays.equals(this.xLM, g.aCW)) {
        i = j + b.b(200, this.xLM);
      }
      k = i;
      if (this.xLN != null)
      {
        k = i;
        if (this.xLN.length > 0)
        {
          j = m;
          for (;;)
          {
            k = i;
            if (j >= this.xLN.length) {
              break;
            }
            localObject = this.xLN[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(201, (e)localObject);
            }
            j += 1;
            i = k;
          }
        }
      }
      return k;
    }
  }
  
  public static final class q
    extends e
  {
    public int xLO = 0;
    
    public q()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      paramb.aq(1, this.xLO);
      super.a(paramb);
    }
    
    protected final int nw()
    {
      return super.nw() + b.as(1, this.xLO);
    }
  }
  
  public static final class r
    extends e
  {
    public a.am[] xLP = a.am.cmK();
    
    public r()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      if ((this.xLP != null) && (this.xLP.length > 0))
      {
        int i = 0;
        while (i < this.xLP.length)
        {
          a.am localam = this.xLP[i];
          if (localam != null) {
            paramb.a(1, localam);
          }
          i += 1;
        }
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int i = super.nw();
      int k = i;
      if (this.xLP != null)
      {
        k = i;
        if (this.xLP.length > 0)
        {
          int j = 0;
          for (;;)
          {
            k = i;
            if (j >= this.xLP.length) {
              break;
            }
            a.am localam = this.xLP[j];
            k = i;
            if (localam != null) {
              k = i + b.b(1, localam);
            }
            j += 1;
            i = k;
          }
        }
      }
      return k;
    }
  }
  
  public static final class s
    extends e
  {
    public long tWi = 0L;
    public long tWj = 0L;
    public String username = "";
    public String vjR = "";
    public String xLA = "";
    public String xLQ = "";
    public String xLR = "";
    public int xLS = 1;
    public String xLT = "";
    public long xLU = 0L;
    public int xLV = 0;
    public long xLW = 0L;
    public int xLX = 0;
    
    public s()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      if (this.tWi != 0L) {
        paramb.f(1, this.tWi);
      }
      if (!this.xLQ.equals("")) {
        paramb.e(2, this.xLQ);
      }
      if (!this.xLR.equals("")) {
        paramb.e(3, this.xLR);
      }
      if (this.xLS != 1) {
        paramb.ap(4, this.xLS);
      }
      if (!this.username.equals("")) {
        paramb.e(5, this.username);
      }
      if (!this.xLT.equals("")) {
        paramb.e(6, this.xLT);
      }
      if (!this.xLA.equals("")) {
        paramb.e(7, this.xLA);
      }
      if (this.xLU != 0L) {
        paramb.f(8, this.xLU);
      }
      if (this.xLV != 0) {
        paramb.aq(9, this.xLV);
      }
      if (!this.vjR.equals("")) {
        paramb.e(10, this.vjR);
      }
      if (this.xLW != 0L) {
        paramb.f(11, this.xLW);
      }
      if (this.xLX != 0) {
        paramb.aq(12, this.xLX);
      }
      if (this.tWj != 0L) {
        paramb.f(13, this.tWj);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (this.tWi != 0L) {
        i = j + b.h(1, this.tWi);
      }
      j = i;
      if (!this.xLQ.equals("")) {
        j = i + b.f(2, this.xLQ);
      }
      i = j;
      if (!this.xLR.equals("")) {
        i = j + b.f(3, this.xLR);
      }
      j = i;
      if (this.xLS != 1) {
        j = i + b.ar(4, this.xLS);
      }
      i = j;
      if (!this.username.equals("")) {
        i = j + b.f(5, this.username);
      }
      j = i;
      if (!this.xLT.equals("")) {
        j = i + b.f(6, this.xLT);
      }
      i = j;
      if (!this.xLA.equals("")) {
        i = j + b.f(7, this.xLA);
      }
      j = i;
      if (this.xLU != 0L) {
        j = i + b.h(8, this.xLU);
      }
      i = j;
      if (this.xLV != 0) {
        i = j + b.as(9, this.xLV);
      }
      j = i;
      if (!this.vjR.equals("")) {
        j = i + b.f(10, this.vjR);
      }
      i = j;
      if (this.xLW != 0L) {
        i = j + b.h(11, this.xLW);
      }
      j = i;
      if (this.xLX != 0) {
        j = i + b.as(12, this.xLX);
      }
      i = j;
      if (this.tWj != 0L) {
        i = j + b.h(13, this.tWj);
      }
      return i;
    }
  }
  
  public static final class t
    extends e
  {
    public byte[] data = g.aCW;
    public String iconUrl = "";
    public String kBQ = "";
    public int status = 0;
    public int xLY = 0;
    public byte[] xLZ = g.aCW;
    public byte[] xMa = g.aCW;
    public byte[] xMb = g.aCW;
    public int xMc = 0;
    public int xMd = 0;
    public byte[] xMe = g.aCW;
    public byte[] xMf = g.aCW;
    public byte[] xMg = g.aCW;
    public byte[] xMh = g.aCW;
    public byte[] xMi = g.aCW;
    public byte[] xMj = g.aCW;
    public byte[] xMk = g.aCW;
    public byte[] xMl = g.aCW;
    public byte[] xMm = g.aCW;
    public byte[] xMn = g.aCW;
    
    public t()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      if (this.xLY != 0) {
        paramb.aq(1, this.xLY);
      }
      if (!Arrays.equals(this.xLZ, g.aCW)) {
        paramb.a(2, this.xLZ);
      }
      if (!this.iconUrl.equals("")) {
        paramb.e(3, this.iconUrl);
      }
      if (!Arrays.equals(this.xMa, g.aCW)) {
        paramb.a(4, this.xMa);
      }
      if (!Arrays.equals(this.xMb, g.aCW)) {
        paramb.a(5, this.xMb);
      }
      if (this.xMc != 0) {
        paramb.aq(6, this.xMc);
      }
      if (!Arrays.equals(this.data, g.aCW)) {
        paramb.a(7, this.data);
      }
      if (this.xMd != 0) {
        paramb.aq(8, this.xMd);
      }
      if (!Arrays.equals(this.xMe, g.aCW)) {
        paramb.a(9, this.xMe);
      }
      if (!this.kBQ.equals("")) {
        paramb.e(10, this.kBQ);
      }
      if (!Arrays.equals(this.xMf, g.aCW)) {
        paramb.a(11, this.xMf);
      }
      if (!Arrays.equals(this.xMg, g.aCW)) {
        paramb.a(12, this.xMg);
      }
      if (!Arrays.equals(this.xMh, g.aCW)) {
        paramb.a(13, this.xMh);
      }
      if (!Arrays.equals(this.xMi, g.aCW)) {
        paramb.a(14, this.xMi);
      }
      if (!Arrays.equals(this.xMj, g.aCW)) {
        paramb.a(15, this.xMj);
      }
      if (!Arrays.equals(this.xMk, g.aCW)) {
        paramb.a(16, this.xMk);
      }
      if (!Arrays.equals(this.xMl, g.aCW)) {
        paramb.a(17, this.xMl);
      }
      if (!Arrays.equals(this.xMm, g.aCW)) {
        paramb.a(18, this.xMm);
      }
      if (!Arrays.equals(this.xMn, g.aCW)) {
        paramb.a(19, this.xMn);
      }
      if (this.status != 0) {
        paramb.aq(20, this.status);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (this.xLY != 0) {
        i = j + b.as(1, this.xLY);
      }
      j = i;
      if (!Arrays.equals(this.xLZ, g.aCW)) {
        j = i + b.b(2, this.xLZ);
      }
      i = j;
      if (!this.iconUrl.equals("")) {
        i = j + b.f(3, this.iconUrl);
      }
      j = i;
      if (!Arrays.equals(this.xMa, g.aCW)) {
        j = i + b.b(4, this.xMa);
      }
      i = j;
      if (!Arrays.equals(this.xMb, g.aCW)) {
        i = j + b.b(5, this.xMb);
      }
      j = i;
      if (this.xMc != 0) {
        j = i + b.as(6, this.xMc);
      }
      i = j;
      if (!Arrays.equals(this.data, g.aCW)) {
        i = j + b.b(7, this.data);
      }
      j = i;
      if (this.xMd != 0) {
        j = i + b.as(8, this.xMd);
      }
      i = j;
      if (!Arrays.equals(this.xMe, g.aCW)) {
        i = j + b.b(9, this.xMe);
      }
      j = i;
      if (!this.kBQ.equals("")) {
        j = i + b.f(10, this.kBQ);
      }
      i = j;
      if (!Arrays.equals(this.xMf, g.aCW)) {
        i = j + b.b(11, this.xMf);
      }
      j = i;
      if (!Arrays.equals(this.xMg, g.aCW)) {
        j = i + b.b(12, this.xMg);
      }
      i = j;
      if (!Arrays.equals(this.xMh, g.aCW)) {
        i = j + b.b(13, this.xMh);
      }
      j = i;
      if (!Arrays.equals(this.xMi, g.aCW)) {
        j = i + b.b(14, this.xMi);
      }
      i = j;
      if (!Arrays.equals(this.xMj, g.aCW)) {
        i = j + b.b(15, this.xMj);
      }
      j = i;
      if (!Arrays.equals(this.xMk, g.aCW)) {
        j = i + b.b(16, this.xMk);
      }
      i = j;
      if (!Arrays.equals(this.xMl, g.aCW)) {
        i = j + b.b(17, this.xMl);
      }
      j = i;
      if (!Arrays.equals(this.xMm, g.aCW)) {
        j = i + b.b(18, this.xMm);
      }
      i = j;
      if (!Arrays.equals(this.xMn, g.aCW)) {
        i = j + b.b(19, this.xMn);
      }
      j = i;
      if (this.status != 0) {
        j = i + b.as(20, this.status);
      }
      return j;
    }
  }
  
  public static final class u
    extends e
  {
    public int nJ = 0;
    public int ret = 0;
    public int tLG = 0;
    public String userName = "";
    public int xLh = 0;
    public int xMo = 0;
    public int xMp = 0;
    
    public u()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      if (!this.userName.equals("")) {
        paramb.e(2, this.userName);
      }
      if (this.nJ != 0) {
        paramb.ap(3, this.nJ);
      }
      if (this.xMo != 0) {
        paramb.aq(4, this.xMo);
      }
      if (this.ret != 0) {
        paramb.ap(5, this.ret);
      }
      if (this.xMp != 0) {
        paramb.ap(6, this.xMp);
      }
      if (this.xLh != 0) {
        paramb.aq(7, this.xLh);
      }
      if (this.tLG != 0) {
        paramb.aq(8, this.tLG);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (!this.userName.equals("")) {
        i = j + b.f(2, this.userName);
      }
      j = i;
      if (this.nJ != 0) {
        j = i + b.ar(3, this.nJ);
      }
      i = j;
      if (this.xMo != 0) {
        i = j + b.as(4, this.xMo);
      }
      j = i;
      if (this.ret != 0) {
        j = i + b.ar(5, this.ret);
      }
      i = j;
      if (this.xMp != 0) {
        i = j + b.ar(6, this.xMp);
      }
      j = i;
      if (this.xLh != 0) {
        j = i + b.as(7, this.xLh);
      }
      i = j;
      if (this.tLG != 0) {
        i = j + b.as(8, this.tLG);
      }
      return i;
    }
  }
  
  public static final class v
    extends e
  {
    public byte[] body = g.aCW;
    public a.u xMq = null;
    
    public v()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      if (this.xMq != null) {
        paramb.a(1, this.xMq);
      }
      if (!Arrays.equals(this.body, g.aCW)) {
        paramb.a(2, this.body);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (this.xMq != null) {
        i = j + b.b(1, this.xMq);
      }
      j = i;
      if (!Arrays.equals(this.body, g.aCW)) {
        j = i + b.b(2, this.body);
      }
      return j;
    }
  }
  
  public static final class w
    extends e
  {
    private static volatile w[] xMr;
    public String xMs = "";
    public String xMt = "";
    
    public w()
    {
      this.aCP = -1;
    }
    
    public static w[] cmJ()
    {
      if (xMr == null) {}
      synchronized (c.aCO)
      {
        if (xMr == null) {
          xMr = new w[0];
        }
        return xMr;
      }
    }
    
    public final void a(b paramb)
    {
      if (!this.xMs.equals("")) {
        paramb.e(1, this.xMs);
      }
      if (!this.xMt.equals("")) {
        paramb.e(2, this.xMt);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (!this.xMs.equals("")) {
        i = j + b.f(1, this.xMs);
      }
      j = i;
      if (!this.xMt.equals("")) {
        j = i + b.f(2, this.xMt);
      }
      return j;
    }
  }
  
  public static final class x
    extends e
  {
    public String groupId = "";
    public int qGO = 0;
    public long qGP = 0L;
    public a.at xLe = null;
    public a.av[] xMu = a.av.cmO();
    
    public x()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.qGO != 0) {
        paramb.ap(2, this.qGO);
      }
      if (this.qGP != 0L) {
        paramb.g(3, this.qGP);
      }
      if ((this.xMu != null) && (this.xMu.length > 0))
      {
        int i = 0;
        while (i < this.xMu.length)
        {
          a.av localav = this.xMu[i];
          if (localav != null) {
            paramb.a(4, localav);
          }
          i += 1;
        }
      }
      if (this.xLe != null) {
        paramb.a(5, this.xLe);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.qGO != 0) {
        j = i + b.ar(2, this.qGO);
      }
      i = j;
      if (this.qGP != 0L) {
        i = j + b.i(3, this.qGP);
      }
      j = i;
      if (this.xMu != null)
      {
        j = i;
        if (this.xMu.length > 0)
        {
          j = 0;
          while (j < this.xMu.length)
          {
            a.av localav = this.xMu[j];
            int k = i;
            if (localav != null) {
              k = i + b.b(4, localav);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (this.xLe != null) {
        i = j + b.b(5, this.xLe);
      }
      return i;
    }
  }
  
  public static final class y
    extends e
  {
    public String xLc = "";
    
    public y()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      if (!this.xLc.equals("")) {
        paramb.e(1, this.xLc);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int j = super.nw();
      int i = j;
      if (!this.xLc.equals("")) {
        i = j + b.f(1, this.xLc);
      }
      return i;
    }
  }
  
  public static final class z
    extends e
  {
    public String groupId = "";
    public int qGO = 0;
    public long qGP = 0L;
    public int xLC = 0;
    public a.av[] xLI = a.av.cmO();
    public a.as xLJ = null;
    public a.av[] xLN = a.av.cmO();
    public String xLc = "";
    public a.at xLe = null;
    public int xLh = 0;
    public int xMA = 0;
    public int xMB = 0;
    public a.o[] xMC = a.o.cmI();
    public int xMD = 0;
    public a.o[] xMv = a.o.cmI();
    public a.aw[] xMw = a.aw.cmP();
    public int xMx = 0;
    public int[] xMy = g.aCQ;
    public a.o[] xMz = a.o.cmI();
    
    public z()
    {
      this.aCP = -1;
    }
    
    public final void a(b paramb)
    {
      int j = 0;
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.qGO != 0) {
        paramb.ap(2, this.qGO);
      }
      if (this.qGP != 0L) {
        paramb.g(3, this.qGP);
      }
      if (this.xLh != 0) {
        paramb.aq(4, this.xLh);
      }
      int i;
      Object localObject;
      if ((this.xMv != null) && (this.xMv.length > 0))
      {
        i = 0;
        while (i < this.xMv.length)
        {
          localObject = this.xMv[i];
          if (localObject != null) {
            paramb.a(5, (e)localObject);
          }
          i += 1;
        }
      }
      if ((this.xMw != null) && (this.xMw.length > 0))
      {
        i = 0;
        while (i < this.xMw.length)
        {
          localObject = this.xMw[i];
          if (localObject != null) {
            paramb.a(6, (e)localObject);
          }
          i += 1;
        }
      }
      if (this.xLJ != null) {
        paramb.a(7, this.xLJ);
      }
      if (!this.xLc.equals("")) {
        paramb.e(8, this.xLc);
      }
      if ((this.xLI != null) && (this.xLI.length > 0))
      {
        i = 0;
        while (i < this.xLI.length)
        {
          localObject = this.xLI[i];
          if (localObject != null) {
            paramb.a(9, (e)localObject);
          }
          i += 1;
        }
      }
      if (this.xMx != 0) {
        paramb.ap(10, this.xMx);
      }
      if ((this.xMy != null) && (this.xMy.length > 0))
      {
        i = 0;
        while (i < this.xMy.length)
        {
          paramb.ap(11, this.xMy[i]);
          i += 1;
        }
      }
      if (this.xLe != null) {
        paramb.a(12, this.xLe);
      }
      if (this.xLC != 0) {
        paramb.aq(13, this.xLC);
      }
      if ((this.xMz != null) && (this.xMz.length > 0))
      {
        i = 0;
        while (i < this.xMz.length)
        {
          localObject = this.xMz[i];
          if (localObject != null) {
            paramb.a(14, (e)localObject);
          }
          i += 1;
        }
      }
      if (this.xMA != 0) {
        paramb.aq(15, this.xMA);
      }
      if (this.xMB != 0) {
        paramb.aq(16, this.xMB);
      }
      if ((this.xLN != null) && (this.xLN.length > 0))
      {
        i = 0;
        while (i < this.xLN.length)
        {
          localObject = this.xLN[i];
          if (localObject != null) {
            paramb.a(17, (e)localObject);
          }
          i += 1;
        }
      }
      if ((this.xMC != null) && (this.xMC.length > 0))
      {
        i = j;
        while (i < this.xMC.length)
        {
          localObject = this.xMC[i];
          if (localObject != null) {
            paramb.a(18, (e)localObject);
          }
          i += 1;
        }
      }
      if (this.xMD != 0) {
        paramb.ap(19, this.xMD);
      }
      super.a(paramb);
    }
    
    protected final int nw()
    {
      int m = 0;
      int j = super.nw();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.qGO != 0) {
        j = i + b.ar(2, this.qGO);
      }
      int k = j;
      if (this.qGP != 0L) {
        k = j + b.i(3, this.qGP);
      }
      i = k;
      if (this.xLh != 0) {
        i = k + b.as(4, this.xLh);
      }
      j = i;
      Object localObject;
      if (this.xMv != null)
      {
        j = i;
        if (this.xMv.length > 0)
        {
          j = 0;
          while (j < this.xMv.length)
          {
            localObject = this.xMv[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(5, (e)localObject);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (this.xMw != null)
      {
        i = j;
        if (this.xMw.length > 0)
        {
          i = j;
          j = 0;
          while (j < this.xMw.length)
          {
            localObject = this.xMw[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(6, (e)localObject);
            }
            j += 1;
            i = k;
          }
        }
      }
      j = i;
      if (this.xLJ != null) {
        j = i + b.b(7, this.xLJ);
      }
      i = j;
      if (!this.xLc.equals("")) {
        i = j + b.f(8, this.xLc);
      }
      j = i;
      if (this.xLI != null)
      {
        j = i;
        if (this.xLI.length > 0)
        {
          j = 0;
          while (j < this.xLI.length)
          {
            localObject = this.xLI[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(9, (e)localObject);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (this.xMx != 0) {
        i = j + b.ar(10, this.xMx);
      }
      j = i;
      if (this.xMy != null)
      {
        j = i;
        if (this.xMy.length > 0)
        {
          j = 0;
          k = 0;
          while (j < this.xMy.length)
          {
            k += b.cI(this.xMy[j]);
            j += 1;
          }
          j = i + k + this.xMy.length * 1;
        }
      }
      k = j;
      if (this.xLe != null) {
        k = j + b.b(12, this.xLe);
      }
      i = k;
      if (this.xLC != 0) {
        i = k + b.as(13, this.xLC);
      }
      j = i;
      if (this.xMz != null)
      {
        j = i;
        if (this.xMz.length > 0)
        {
          j = 0;
          while (j < this.xMz.length)
          {
            localObject = this.xMz[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(14, (e)localObject);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (this.xMA != 0) {
        i = j + b.as(15, this.xMA);
      }
      j = i;
      if (this.xMB != 0) {
        j = i + b.as(16, this.xMB);
      }
      i = j;
      if (this.xLN != null)
      {
        i = j;
        if (this.xLN.length > 0)
        {
          i = j;
          j = 0;
          while (j < this.xLN.length)
          {
            localObject = this.xLN[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(17, (e)localObject);
            }
            j += 1;
            i = k;
          }
        }
      }
      j = i;
      if (this.xMC != null)
      {
        j = i;
        if (this.xMC.length > 0)
        {
          k = m;
          for (;;)
          {
            j = i;
            if (k >= this.xMC.length) {
              break;
            }
            localObject = this.xMC[k];
            j = i;
            if (localObject != null) {
              j = i + b.b(18, (e)localObject);
            }
            k += 1;
            i = j;
          }
        }
      }
      i = j;
      if (this.xMD != 0) {
        i = j + b.ar(19, this.xMD);
      }
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\pb\common\b\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
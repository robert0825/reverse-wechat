package com.google.android.gms.c;

import java.util.Arrays;

public final class av
  extends ay<av>
{
  public a[] awu = a.lH();
  
  public av()
  {
    this.awX = null;
    this.axi = -1;
  }
  
  public final void a(ax paramax)
  {
    if ((this.awu != null) && (this.awu.length > 0))
    {
      int i = 0;
      while (i < this.awu.length)
      {
        a locala = this.awu[i];
        if (locala != null) {
          paramax.a(1, locala);
        }
        i += 1;
      }
    }
    super.a(paramax);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1;
    if (paramObject == this) {
      bool1 = true;
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
      } while (!(paramObject instanceof av));
      paramObject = (av)paramObject;
      bool1 = bool2;
    } while (!bc.equals(this.awu, ((av)paramObject).awu));
    return a((ay)paramObject);
  }
  
  public final int hashCode()
  {
    return (bc.hashCode(this.awu) + 527) * 31 + lS();
  }
  
  protected final int li()
  {
    int i = super.li();
    int k = i;
    if (this.awu != null)
    {
      k = i;
      if (this.awu.length > 0)
      {
        int j = 0;
        for (;;)
        {
          k = i;
          if (j >= this.awu.length) {
            break;
          }
          a locala = this.awu[j];
          k = i;
          if (locala != null) {
            k = i + ax.b(1, locala);
          }
          j += 1;
          i = k;
        }
      }
    }
    return k;
  }
  
  public static final class a
    extends ay<a>
  {
    private static volatile a[] awv;
    public a aww = null;
    public String name = "";
    
    public a()
    {
      this.awX = null;
      this.axi = -1;
    }
    
    public static a[] lH()
    {
      if (awv == null) {}
      synchronized (bc.axh)
      {
        if (awv == null) {
          awv = new a[0];
        }
        return awv;
      }
    }
    
    public final void a(ax paramax)
    {
      paramax.c(1, this.name);
      if (this.aww != null) {
        paramax.a(2, this.aww);
      }
      super.a(paramax);
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool2 = false;
      boolean bool1;
      if (paramObject == this) {
        bool1 = true;
      }
      do
      {
        do
        {
          do
          {
            return bool1;
            bool1 = bool2;
          } while (!(paramObject instanceof a));
          paramObject = (a)paramObject;
          if (this.name != null) {
            break;
          }
          bool1 = bool2;
        } while (((a)paramObject).name != null);
        if (this.aww != null) {
          break label79;
        }
        bool1 = bool2;
      } while (((a)paramObject).aww != null);
      label79:
      while (this.aww.equals(((a)paramObject).aww))
      {
        return a((ay)paramObject);
        if (this.name.equals(((a)paramObject).name)) {
          break;
        }
        return false;
      }
      return false;
    }
    
    public final int hashCode()
    {
      int j = 0;
      int i;
      if (this.name == null)
      {
        i = 0;
        if (this.aww != null) {
          break label48;
        }
      }
      for (;;)
      {
        return ((i + 527) * 31 + j) * 31 + lS();
        i = this.name.hashCode();
        break;
        label48:
        j = this.aww.hashCode();
      }
    }
    
    protected final int li()
    {
      int j = super.li() + ax.d(1, this.name);
      int i = j;
      if (this.aww != null) {
        i = j + ax.b(2, this.aww);
      }
      return i;
    }
    
    public static final class a
      extends ay<a>
    {
      private static volatile a[] awx;
      public a awy = null;
      public int type = 1;
      
      public a()
      {
        this.awX = null;
        this.axi = -1;
      }
      
      public static a[] lI()
      {
        if (awx == null) {}
        synchronized (bc.axh)
        {
          if (awx == null) {
            awx = new a[0];
          }
          return awx;
        }
      }
      
      public final void a(ax paramax)
      {
        paramax.ak(1, this.type);
        if (this.awy != null) {
          paramax.a(2, this.awy);
        }
        super.a(paramax);
      }
      
      public final boolean equals(Object paramObject)
      {
        boolean bool2 = false;
        boolean bool1;
        if (paramObject == this) {
          bool1 = true;
        }
        do
        {
          do
          {
            do
            {
              return bool1;
              bool1 = bool2;
            } while (!(paramObject instanceof a));
            paramObject = (a)paramObject;
            bool1 = bool2;
          } while (this.type != ((a)paramObject).type);
          if (this.awy != null) {
            break;
          }
          bool1 = bool2;
        } while (((a)paramObject).awy != null);
        while (this.awy.equals(((a)paramObject).awy)) {
          return a((ay)paramObject);
        }
        return false;
      }
      
      public final int hashCode()
      {
        int j = this.type;
        if (this.awy == null) {}
        for (int i = 0;; i = this.awy.hashCode()) {
          return (i + (j + 527) * 31) * 31 + lS();
        }
      }
      
      protected final int li()
      {
        int j = super.li() + ax.al(1, this.type);
        int i = j;
        if (this.awy != null) {
          i = j + ax.b(2, this.awy);
        }
        return i;
      }
      
      public static final class a
        extends ay<a>
      {
        public String awA = "";
        public double awB = 0.0D;
        public float awC = 0.0F;
        public long awD = 0L;
        public int awE = 0;
        public int awF = 0;
        public boolean awG = false;
        public av.a[] awH = av.a.lH();
        public av.a.a[] awI = av.a.a.lI();
        public String[] awJ = bh.axp;
        public long[] awK = bh.axl;
        public float[] awL = bh.axm;
        public long awM = 0L;
        public byte[] awz = bh.axr;
        
        public a()
        {
          this.awX = null;
          this.axi = -1;
        }
        
        public final void a(ax paramax)
        {
          int j = 0;
          Object localObject;
          if (!Arrays.equals(this.awz, bh.axr))
          {
            localObject = this.awz;
            paramax.am(1, 2);
            paramax.cr(localObject.length);
            paramax.g((byte[])localObject);
          }
          if (!this.awA.equals("")) {
            paramax.c(2, this.awA);
          }
          if (Double.doubleToLongBits(this.awB) != Double.doubleToLongBits(0.0D))
          {
            double d = this.awB;
            paramax.am(3, 1);
            long l = Double.doubleToLongBits(d);
            paramax.cp((int)l & 0xFF);
            paramax.cp((int)(l >> 8) & 0xFF);
            paramax.cp((int)(l >> 16) & 0xFF);
            paramax.cp((int)(l >> 24) & 0xFF);
            paramax.cp((int)(l >> 32) & 0xFF);
            paramax.cp((int)(l >> 40) & 0xFF);
            paramax.cp((int)(l >> 48) & 0xFF);
            paramax.cp((int)(l >> 56) & 0xFF);
          }
          if (Float.floatToIntBits(this.awC) != Float.floatToIntBits(0.0F)) {
            paramax.c(4, this.awC);
          }
          if (this.awD != 0L) {
            paramax.d(5, this.awD);
          }
          if (this.awE != 0) {
            paramax.ak(6, this.awE);
          }
          int i;
          if (this.awF != 0)
          {
            i = this.awF;
            paramax.am(7, 0);
            paramax.cr(ax.ct(i));
          }
          if (this.awG) {
            paramax.i(8, this.awG);
          }
          if ((this.awH != null) && (this.awH.length > 0))
          {
            i = 0;
            while (i < this.awH.length)
            {
              localObject = this.awH[i];
              if (localObject != null) {
                paramax.a(9, (be)localObject);
              }
              i += 1;
            }
          }
          if ((this.awI != null) && (this.awI.length > 0))
          {
            i = 0;
            while (i < this.awI.length)
            {
              localObject = this.awI[i];
              if (localObject != null) {
                paramax.a(10, (be)localObject);
              }
              i += 1;
            }
          }
          if ((this.awJ != null) && (this.awJ.length > 0))
          {
            i = 0;
            while (i < this.awJ.length)
            {
              localObject = this.awJ[i];
              if (localObject != null) {
                paramax.c(11, (String)localObject);
              }
              i += 1;
            }
          }
          if ((this.awK != null) && (this.awK.length > 0))
          {
            i = 0;
            while (i < this.awK.length)
            {
              paramax.d(12, this.awK[i]);
              i += 1;
            }
          }
          if (this.awM != 0L) {
            paramax.d(13, this.awM);
          }
          if ((this.awL != null) && (this.awL.length > 0))
          {
            i = j;
            while (i < this.awL.length)
            {
              paramax.c(14, this.awL[i]);
              i += 1;
            }
          }
          super.a(paramax);
        }
        
        public final boolean equals(Object paramObject)
        {
          boolean bool2 = false;
          boolean bool1;
          if (paramObject == this) {
            bool1 = true;
          }
          do
          {
            do
            {
              do
              {
                return bool1;
                bool1 = bool2;
              } while (!(paramObject instanceof a));
              paramObject = (a)paramObject;
              bool1 = bool2;
            } while (!Arrays.equals(this.awz, ((a)paramObject).awz));
            if (this.awA != null) {
              break;
            }
            bool1 = bool2;
          } while (((a)paramObject).awA != null);
          while (this.awA.equals(((a)paramObject).awA))
          {
            bool1 = bool2;
            if (Double.doubleToLongBits(this.awB) != Double.doubleToLongBits(((a)paramObject).awB)) {
              break;
            }
            bool1 = bool2;
            if (Float.floatToIntBits(this.awC) != Float.floatToIntBits(((a)paramObject).awC)) {
              break;
            }
            bool1 = bool2;
            if (this.awD != ((a)paramObject).awD) {
              break;
            }
            bool1 = bool2;
            if (this.awE != ((a)paramObject).awE) {
              break;
            }
            bool1 = bool2;
            if (this.awF != ((a)paramObject).awF) {
              break;
            }
            bool1 = bool2;
            if (this.awG != ((a)paramObject).awG) {
              break;
            }
            bool1 = bool2;
            if (!bc.equals(this.awH, ((a)paramObject).awH)) {
              break;
            }
            bool1 = bool2;
            if (!bc.equals(this.awI, ((a)paramObject).awI)) {
              break;
            }
            bool1 = bool2;
            if (!bc.equals(this.awJ, ((a)paramObject).awJ)) {
              break;
            }
            bool1 = bool2;
            if (!bc.equals(this.awK, ((a)paramObject).awK)) {
              break;
            }
            bool1 = bool2;
            if (!bc.equals(this.awL, ((a)paramObject).awL)) {
              break;
            }
            bool1 = bool2;
            if (this.awM != ((a)paramObject).awM) {
              break;
            }
            return a((ay)paramObject);
          }
          return false;
        }
        
        public final int hashCode()
        {
          int k = Arrays.hashCode(this.awz);
          int i;
          int m;
          int n;
          int i1;
          int i2;
          int i3;
          if (this.awA == null)
          {
            i = 0;
            long l = Double.doubleToLongBits(this.awB);
            m = (int)(l ^ l >>> 32);
            n = Float.floatToIntBits(this.awC);
            i1 = (int)(this.awD ^ this.awD >>> 32);
            i2 = this.awE;
            i3 = this.awF;
            if (!this.awG) {
              break label221;
            }
          }
          label221:
          for (int j = 1231;; j = 1237)
          {
            return (((((((j + ((((((i + (k + 527) * 31) * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31 + i3) * 31) * 31 + bc.hashCode(this.awH)) * 31 + bc.hashCode(this.awI)) * 31 + bc.hashCode(this.awJ)) * 31 + bc.hashCode(this.awK)) * 31 + bc.hashCode(this.awL)) * 31 + (int)(this.awM ^ this.awM >>> 32)) * 31 + lS();
            i = this.awA.hashCode();
            break;
          }
        }
        
        protected final int li()
        {
          int i2 = 0;
          int j = super.li();
          int i = j;
          Object localObject;
          if (!Arrays.equals(this.awz, bh.axr))
          {
            localObject = this.awz;
            i = ax.cq(1);
            k = ax.cs(localObject.length);
            i = j + (localObject.length + k + i);
          }
          j = i;
          if (!this.awA.equals("")) {
            j = i + ax.d(2, this.awA);
          }
          i = j;
          if (Double.doubleToLongBits(this.awB) != Double.doubleToLongBits(0.0D)) {
            i = j + (ax.cq(3) + 8);
          }
          j = i;
          if (Float.floatToIntBits(this.awC) != Float.floatToIntBits(0.0F)) {
            j = i + (ax.cq(4) + 4);
          }
          int k = j;
          if (this.awD != 0L) {
            k = j + ax.e(5, this.awD);
          }
          i = k;
          if (this.awE != 0) {
            i = k + ax.al(6, this.awE);
          }
          j = i;
          if (this.awF != 0)
          {
            j = this.awF;
            k = ax.cq(7);
            j = i + (ax.cs(ax.ct(j)) + k);
          }
          i = j;
          if (this.awG) {
            i = j + (ax.cq(8) + 1);
          }
          j = i;
          if (this.awH != null)
          {
            j = i;
            if (this.awH.length > 0)
            {
              j = 0;
              while (j < this.awH.length)
              {
                localObject = this.awH[j];
                k = i;
                if (localObject != null) {
                  k = i + ax.b(9, (be)localObject);
                }
                j += 1;
                i = k;
              }
              j = i;
            }
          }
          i = j;
          if (this.awI != null)
          {
            i = j;
            if (this.awI.length > 0)
            {
              i = j;
              j = 0;
              while (j < this.awI.length)
              {
                localObject = this.awI[j];
                k = i;
                if (localObject != null) {
                  k = i + ax.b(10, (be)localObject);
                }
                j += 1;
                i = k;
              }
            }
          }
          j = i;
          if (this.awJ != null)
          {
            j = i;
            if (this.awJ.length > 0)
            {
              j = 0;
              k = 0;
              int n;
              for (int m = 0; j < this.awJ.length; m = n)
              {
                localObject = this.awJ[j];
                int i1 = k;
                n = m;
                if (localObject != null)
                {
                  n = m + 1;
                  i1 = k + ax.au((String)localObject);
                }
                j += 1;
                k = i1;
              }
              j = i + k + m * 1;
            }
          }
          i = j;
          if (this.awK != null)
          {
            i = j;
            if (this.awK.length > 0)
            {
              k = 0;
              i = i2;
              while (i < this.awK.length)
              {
                k += ax.n(this.awK[i]);
                i += 1;
              }
              i = j + k + this.awK.length * 1;
            }
          }
          j = i;
          if (this.awM != 0L) {
            j = i + ax.e(13, this.awM);
          }
          i = j;
          if (this.awL != null)
          {
            i = j;
            if (this.awL.length > 0) {
              i = j + this.awL.length * 4 + this.awL.length * 1;
            }
          }
          return i;
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\c\av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.google.android.gms.c;

public abstract interface b
{
  public static final class a
    extends ay<a>
  {
    private static volatile a[] asX;
    public String asY = "";
    public a[] asZ = lh();
    public a[] ata = lh();
    public a[] atb = lh();
    public String atc = "";
    public String atd = "";
    public long ate = 0L;
    public boolean atf = false;
    public a[] atg = lh();
    public int[] ath = bh.axk;
    public boolean ati = false;
    public int type = 1;
    
    public a()
    {
      this.awX = null;
      this.axi = -1;
    }
    
    private static a[] lh()
    {
      if (asX == null) {}
      synchronized (bc.axh)
      {
        if (asX == null) {
          asX = new a[0];
        }
        return asX;
      }
    }
    
    public final void a(ax paramax)
    {
      int j = 0;
      paramax.ak(1, this.type);
      if (!this.asY.equals("")) {
        paramax.c(2, this.asY);
      }
      int i;
      a locala;
      if ((this.asZ != null) && (this.asZ.length > 0))
      {
        i = 0;
        while (i < this.asZ.length)
        {
          locala = this.asZ[i];
          if (locala != null) {
            paramax.a(3, locala);
          }
          i += 1;
        }
      }
      if ((this.ata != null) && (this.ata.length > 0))
      {
        i = 0;
        while (i < this.ata.length)
        {
          locala = this.ata[i];
          if (locala != null) {
            paramax.a(4, locala);
          }
          i += 1;
        }
      }
      if ((this.atb != null) && (this.atb.length > 0))
      {
        i = 0;
        while (i < this.atb.length)
        {
          locala = this.atb[i];
          if (locala != null) {
            paramax.a(5, locala);
          }
          i += 1;
        }
      }
      if (!this.atc.equals("")) {
        paramax.c(6, this.atc);
      }
      if (!this.atd.equals("")) {
        paramax.c(7, this.atd);
      }
      if (this.ate != 0L) {
        paramax.d(8, this.ate);
      }
      if (this.ati) {
        paramax.i(9, this.ati);
      }
      if ((this.ath != null) && (this.ath.length > 0))
      {
        i = 0;
        while (i < this.ath.length)
        {
          paramax.ak(10, this.ath[i]);
          i += 1;
        }
      }
      if ((this.atg != null) && (this.atg.length > 0))
      {
        i = j;
        while (i < this.atg.length)
        {
          locala = this.atg[i];
          if (locala != null) {
            paramax.a(11, locala);
          }
          i += 1;
        }
      }
      if (this.atf) {
        paramax.i(12, this.atf);
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
      label54:
      label118:
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
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
                  if (this.asY != null) {
                    break;
                  }
                  bool1 = bool2;
                } while (((a)paramObject).asY != null);
                bool1 = bool2;
              } while (!bc.equals(this.asZ, ((a)paramObject).asZ));
              bool1 = bool2;
            } while (!bc.equals(this.ata, ((a)paramObject).ata));
            bool1 = bool2;
          } while (!bc.equals(this.atb, ((a)paramObject).atb));
          if (this.atc != null) {
            break label228;
          }
          bool1 = bool2;
        } while (((a)paramObject).atc != null);
        if (this.atd != null) {
          break label244;
        }
        bool1 = bool2;
      } while (((a)paramObject).atd != null);
      label228:
      label244:
      while (this.atd.equals(((a)paramObject).atd))
      {
        bool1 = bool2;
        if (this.ate != ((a)paramObject).ate) {
          break;
        }
        bool1 = bool2;
        if (this.atf != ((a)paramObject).atf) {
          break;
        }
        bool1 = bool2;
        if (!bc.equals(this.atg, ((a)paramObject).atg)) {
          break;
        }
        bool1 = bool2;
        if (!bc.equals(this.ath, ((a)paramObject).ath)) {
          break;
        }
        bool1 = bool2;
        if (this.ati != ((a)paramObject).ati) {
          break;
        }
        return a((ay)paramObject);
        if (this.asY.equals(((a)paramObject).asY)) {
          break label54;
        }
        return false;
        if (this.atc.equals(((a)paramObject).atc)) {
          break label118;
        }
        return false;
      }
      return false;
    }
    
    public final int hashCode()
    {
      int n = 1231;
      int k = 0;
      int i1 = this.type;
      int i;
      int i2;
      int i3;
      int i4;
      int j;
      label58:
      label65:
      int i5;
      int m;
      label92:
      int i6;
      int i7;
      if (this.asY == null)
      {
        i = 0;
        i2 = bc.hashCode(this.asZ);
        i3 = bc.hashCode(this.ata);
        i4 = bc.hashCode(this.atb);
        if (this.atc != null) {
          break label206;
        }
        j = 0;
        if (this.atd != null) {
          break label217;
        }
        i5 = (int)(this.ate ^ this.ate >>> 32);
        if (!this.atf) {
          break label228;
        }
        m = 1231;
        i6 = bc.hashCode(this.atg);
        i7 = bc.hashCode(this.ath);
        if (!this.ati) {
          break label236;
        }
      }
      for (;;)
      {
        return ((((m + (((j + ((((i + (i1 + 527) * 31) * 31 + i2) * 31 + i3) * 31 + i4) * 31) * 31 + k) * 31 + i5) * 31) * 31 + i6) * 31 + i7) * 31 + n) * 31 + lS();
        i = this.asY.hashCode();
        break;
        label206:
        j = this.atc.hashCode();
        break label58;
        label217:
        k = this.atd.hashCode();
        break label65;
        label228:
        m = 1237;
        break label92;
        label236:
        n = 1237;
      }
    }
    
    protected final int li()
    {
      int m = 0;
      int j = super.li() + ax.al(1, this.type);
      int i = j;
      if (!this.asY.equals("")) {
        i = j + ax.d(2, this.asY);
      }
      j = i;
      a locala;
      int k;
      if (this.asZ != null)
      {
        j = i;
        if (this.asZ.length > 0)
        {
          j = 0;
          while (j < this.asZ.length)
          {
            locala = this.asZ[j];
            k = i;
            if (locala != null) {
              k = i + ax.b(3, locala);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (this.ata != null)
      {
        i = j;
        if (this.ata.length > 0)
        {
          i = j;
          j = 0;
          while (j < this.ata.length)
          {
            locala = this.ata[j];
            k = i;
            if (locala != null) {
              k = i + ax.b(4, locala);
            }
            j += 1;
            i = k;
          }
        }
      }
      j = i;
      if (this.atb != null)
      {
        j = i;
        if (this.atb.length > 0)
        {
          j = 0;
          while (j < this.atb.length)
          {
            locala = this.atb[j];
            k = i;
            if (locala != null) {
              k = i + ax.b(5, locala);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (!this.atc.equals("")) {
        i = j + ax.d(6, this.atc);
      }
      j = i;
      if (!this.atd.equals("")) {
        j = i + ax.d(7, this.atd);
      }
      i = j;
      if (this.ate != 0L) {
        i = j + ax.e(8, this.ate);
      }
      j = i;
      if (this.ati) {
        j = i + (ax.cq(9) + 1);
      }
      i = j;
      if (this.ath != null)
      {
        i = j;
        if (this.ath.length > 0)
        {
          i = 0;
          k = 0;
          while (i < this.ath.length)
          {
            k += ax.co(this.ath[i]);
            i += 1;
          }
          i = j + k + this.ath.length * 1;
        }
      }
      j = i;
      if (this.atg != null)
      {
        j = i;
        if (this.atg.length > 0)
        {
          k = m;
          for (;;)
          {
            j = i;
            if (k >= this.atg.length) {
              break;
            }
            locala = this.atg[k];
            j = i;
            if (locala != null) {
              j = i + ax.b(11, locala);
            }
            k += 1;
            i = j;
          }
        }
      }
      i = j;
      if (this.atf) {
        i = j + (ax.cq(12) + 1);
      }
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
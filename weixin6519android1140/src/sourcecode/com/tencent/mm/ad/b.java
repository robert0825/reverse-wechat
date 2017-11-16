package com.tencent.mm.ad;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.a;
import com.tencent.mm.protocal.ac;
import com.tencent.mm.protocal.c.ayx;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.c.bed;
import com.tencent.mm.protocal.c.es;
import com.tencent.mm.protocal.k;
import com.tencent.mm.protocal.k.b;
import com.tencent.mm.protocal.k.c;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.bg;

public final class b
  extends i
{
  public int eWP;
  public b gtC;
  public c gtD;
  public int gtE;
  public String uri;
  
  public b(a parama1, a parama2, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    GMTrace.i(13410364293120L, 99915);
    this.gtC = null;
    this.gtD = null;
    this.eWP = 0;
    boolean bool1 = bool2;
    if (paramBoolean)
    {
      bool1 = bool2;
      if ((parama1 instanceof ayx)) {
        bool1 = true;
      }
    }
    this.gtC = new b(parama1, paramInt1, paramInt2, bool1);
    this.gtD = new c(parama2, paramInt3, paramBoolean);
    this.uri = paramString;
    this.gtE = paramInt1;
    GMTrace.o(13410364293120L, 99915);
  }
  
  public final int Dz()
  {
    GMTrace.i(13410901164032L, 99919);
    int i = this.eWP;
    GMTrace.o(13410901164032L, 99919);
    return i;
  }
  
  public final void a(ac paramac)
  {
    GMTrace.i(13410766946304L, 99918);
    this.gtC.tKq = paramac;
    GMTrace.o(13410766946304L, 99918);
  }
  
  public final int getType()
  {
    GMTrace.i(13410498510848L, 99916);
    int i = this.gtE;
    GMTrace.o(13410498510848L, 99916);
    return i;
  }
  
  public final String getUri()
  {
    GMTrace.i(13410632728576L, 99917);
    String str = this.uri;
    GMTrace.o(13410632728576L, 99917);
    return str;
  }
  
  public static final class a
  {
    public int gtE;
    public a gtF;
    public a gtG;
    public int gtH;
    public int gtI;
    public boolean gtJ;
    public String uri;
    
    public a()
    {
      GMTrace.i(13406740414464L, 99888);
      this.gtH = 0;
      this.gtI = 0;
      this.gtJ = true;
      GMTrace.o(13406740414464L, 99888);
    }
    
    public final b DA()
    {
      GMTrace.i(13406874632192L, 99889);
      if ((this.gtF == null) || (this.gtG == null) || (bg.nm(this.uri)) || (this.gtE <= 0) || (this.gtH == Integer.MIN_VALUE) || (this.gtI == Integer.MIN_VALUE)) {
        throw new IllegalArgumentException();
      }
      b localb = new b(this.gtF, this.gtG, this.uri, this.gtE, this.gtH, this.gtI, this.gtJ);
      GMTrace.o(13406874632192L, 99889);
      return localb;
    }
  }
  
  public static final class b
    extends k.d
    implements k.b
  {
    public int cmdId;
    private int gtE;
    public a gtK;
    private boolean gtL;
    
    public b(a parama, int paramInt1, int paramInt2, boolean paramBoolean)
    {
      GMTrace.i(13411706470400L, 99925);
      this.gtK = parama;
      this.gtE = paramInt1;
      this.cmdId = paramInt2;
      this.gtL = paramBoolean;
      GMTrace.o(13411706470400L, 99925);
    }
    
    public final byte[] Ba()
    {
      GMTrace.i(13412109123584L, 99928);
      if ((this.gtK instanceof ayx)) {
        ((ayx)this.gtK).uNh = k.a(this);
      }
      byte[] arrayOfByte = this.gtK.toByteArray();
      GMTrace.o(13412109123584L, 99928);
      return arrayOfByte;
    }
    
    public final int Bb()
    {
      GMTrace.i(13411974905856L, 99927);
      int i = this.gtE;
      GMTrace.o(13411974905856L, 99927);
      return i;
    }
    
    public final int getCmdId()
    {
      GMTrace.i(13411840688128L, 99926);
      int i = this.cmdId;
      GMTrace.o(13411840688128L, 99926);
      return i;
    }
  }
  
  public static final class c
    extends k.e
    implements k.c
  {
    public int cmdId;
    public a gtK;
    private boolean gtL;
    
    public c(a parama, int paramInt, boolean paramBoolean)
    {
      GMTrace.i(13405666672640L, 99880);
      this.gtK = null;
      this.gtK = parama;
      this.cmdId = paramInt;
      this.gtL = paramBoolean;
      GMTrace.o(13405666672640L, 99880);
    }
    
    public final int getCmdId()
    {
      GMTrace.i(13405935108096L, 99882);
      int i = this.cmdId;
      GMTrace.o(13405935108096L, 99882);
      return i;
    }
    
    public final int y(byte[] paramArrayOfByte)
    {
      GMTrace.i(13405800890368L, 99881);
      this.gtK = this.gtK.aD(paramArrayOfByte);
      if (!(this.gtK instanceof bed))
      {
        k.a(this, ((azh)this.gtK).uND);
        i = ((azh)this.gtK).uND.tST;
        GMTrace.o(13405800890368L, 99881);
        return i;
      }
      int i = ((bed)this.gtK).getRet();
      GMTrace.o(13405800890368L, 99881);
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ad\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
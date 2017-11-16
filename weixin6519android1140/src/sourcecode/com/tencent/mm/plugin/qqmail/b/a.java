package com.tencent.mm.plugin.qqmail.b;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.platformtools.c;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
  extends com.tencent.mm.bm.a
{
  String nRP;
  private boolean nRQ;
  LinkedList<i> nRR;
  private boolean nRS;
  
  public a()
  {
    GMTrace.i(5465480101888L, 40721);
    this.nRR = new LinkedList();
    GMTrace.o(5465480101888L, 40721);
  }
  
  public static String ES(String paramString)
  {
    GMTrace.i(5466285408256L, 40727);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      w.d("MicroMsg.getAdjustFullSpell", "%s", new Object[] { "srcName is null or empty, adjust full spell = ~" });
      GMTrace.o(5466285408256L, 40727);
      return "~";
    }
    char[] arrayOfChar = paramString.toCharArray();
    int i = 0;
    while (i < arrayOfChar.length)
    {
      char c = arrayOfChar[i];
      if ((c >= '0') && (c <= '9'))
      {
        paramString = String.format("{%c%s", new Object[] { Character.valueOf(c), paramString });
        GMTrace.o(5466285408256L, 40727);
        return paramString;
      }
      if (((c >= 'a') && (c <= 'z')) || ((c >= 'A') && (c <= 'Z')))
      {
        if (i == 0)
        {
          GMTrace.o(5466285408256L, 40727);
          return paramString;
        }
        paramString = String.format("%c%s", new Object[] { Character.valueOf(c), paramString });
        GMTrace.o(5466285408256L, 40727);
        return paramString;
      }
      if ((c == '{') && (i == 0) && (arrayOfChar.length > 1) && (arrayOfChar[(i + 1)] >= '0') && (arrayOfChar[(i + 1)] <= '9'))
      {
        GMTrace.o(5466285408256L, 40727);
        return paramString;
      }
      i += 1;
    }
    w.d("MicroMsg.getAdjustFullSpell", "%s is not ok, return '~'", new Object[] { paramString });
    GMTrace.o(5466285408256L, 40727);
    return "~";
  }
  
  private static boolean a(i parami1, i parami2)
  {
    GMTrace.i(5466016972800L, 40725);
    if ((parami1 == null) || (parami2 == null))
    {
      GMTrace.o(5466016972800L, 40725);
      return false;
    }
    int i = b(parami1).compareTo(b(parami2));
    if (i == 0)
    {
      if (parami1.mwD.compareTo(parami2.mwD) <= 0)
      {
        GMTrace.o(5466016972800L, 40725);
        return true;
      }
      GMTrace.o(5466016972800L, 40725);
      return false;
    }
    if (i < 0)
    {
      GMTrace.o(5466016972800L, 40725);
      return true;
    }
    GMTrace.o(5466016972800L, 40725);
    return false;
  }
  
  private a aYp()
  {
    GMTrace.i(5466553843712L, 40729);
    if (!this.nRQ) {
      throw new b("Not all required fields were included (false = not included in message),  syncInfo:" + this.nRQ);
    }
    GMTrace.o(5466553843712L, 40729);
    return this;
  }
  
  public static String b(i parami)
  {
    GMTrace.i(5466151190528L, 40726);
    String str = parami.nSu;
    if ((str == null) || ("".equals(str))) {}
    for (str = ES(c.nb(parami.name.trim()).toLowerCase());; str = ES(str))
    {
      parami.nSu = str;
      GMTrace.o(5466151190528L, 40726);
      return str;
    }
  }
  
  public final a ER(String paramString)
  {
    GMTrace.i(5465614319616L, 40722);
    this.nRP = paramString;
    this.nRQ = true;
    GMTrace.o(5465614319616L, 40722);
    return this;
  }
  
  public final a a(i parami)
  {
    int j = 0;
    GMTrace.i(5465882755072L, 40724);
    if (!this.nRS) {
      this.nRS = true;
    }
    Iterator localIterator = this.nRR.iterator();
    int i = 0;
    i locali;
    if (localIterator.hasNext())
    {
      locali = (i)localIterator.next();
      if (i < 10) {
        if (parami.nSt <= locali.nSt) {
          break label112;
        }
      }
    }
    else
    {
      label73:
      if (i < this.nRR.size()) {
        break label119;
      }
      this.nRR.add(parami);
    }
    for (;;)
    {
      GMTrace.o(5465882755072L, 40724);
      return this;
      if (a(parami, locali)) {
        break label73;
      }
      label112:
      i += 1;
      break;
      label119:
      this.nRR.add(i, parami);
      if ((i < 10) && (this.nRR.size() > 10))
      {
        parami = (i)this.nRR.remove(10);
        localIterator = this.nRR.iterator();
        i = j;
        while (localIterator.hasNext())
        {
          locali = (i)localIterator.next();
          if ((i >= 10) && (a(parami, locali))) {
            break;
          }
          i += 1;
        }
        if (i >= this.nRR.size()) {
          this.nRR.add(parami);
        } else {
          this.nRR.add(i, parami);
        }
      }
    }
  }
  
  public final void a(b.a.a.c.a parama)
  {
    GMTrace.i(5466956496896L, 40732);
    parama.e(1, this.nRP);
    parama.d(2, 8, this.nRR);
    GMTrace.o(5466956496896L, 40732);
  }
  
  public final a aC(byte[] paramArrayOfByte)
  {
    GMTrace.i(5467090714624L, 40733);
    paramArrayOfByte = new b.a.a.a.a(paramArrayOfByte, unknownTagHandler);
    int i = a(paramArrayOfByte);
    if (i > 0)
    {
      switch (i)
      {
      default: 
        i = 0;
      }
      for (;;)
      {
        if (i == 0) {
          paramArrayOfByte.csW();
        }
        i = a(paramArrayOfByte);
        break;
        ER(paramArrayOfByte.yqV.readString());
        i = 1;
        continue;
        Object localObject1 = paramArrayOfByte.Gv(2);
        i = 0;
        i locali;
        while (i < ((LinkedList)localObject1).size())
        {
          Object localObject2 = (byte[])((LinkedList)localObject1).get(i);
          locali = new i();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = locali.a((b.a.a.a.a)localObject2, locali, a((b.a.a.a.a)localObject2))) {}
          if (!this.nRS) {
            this.nRS = true;
          }
          this.nRR.add(locali);
          i += 1;
        }
        localObject1 = new i[1];
        localObject1 = (i[])this.nRR.toArray((Object[])localObject1);
        Arrays.sort((Object[])localObject1, new Comparator() {});
        if (10 <= localObject1.length) {
          Arrays.sort((Object[])localObject1, 10, localObject1.length, new Comparator() {});
        }
        this.nRR.clear();
        int j = localObject1.length;
        i = 0;
        while (i < j)
        {
          locali = localObject1[i];
          this.nRR.add(locali);
          i += 1;
        }
        i = 1;
      }
    }
    paramArrayOfByte = aYp();
    GMTrace.o(5467090714624L, 40733);
    return paramArrayOfByte;
  }
  
  public final int aYq()
  {
    GMTrace.i(5466688061440L, 40730);
    int i = b.a.a.b.b.a.f(1, this.nRP);
    int j = b.a.a.a.c(2, 8, this.nRR);
    GMTrace.o(5466688061440L, 40730);
    return i + 0 + (j + 0);
  }
  
  public final a sQ(int paramInt)
  {
    boolean bool = false;
    GMTrace.i(5465748537344L, 40723);
    if ((paramInt < 0) || (paramInt >= this.nRR.size()))
    {
      GMTrace.o(5465748537344L, 40723);
      return this;
    }
    if (paramInt >= 10)
    {
      this.nRR.remove(paramInt);
      if (this.nRR.size() > 0) {
        bool = true;
      }
      this.nRS = bool;
      GMTrace.o(5465748537344L, 40723);
      return this;
    }
    this.nRR.remove(paramInt);
    Iterator localIterator = this.nRR.iterator();
    int j = -1;
    int i = Integer.MIN_VALUE;
    int k = 0;
    for (;;)
    {
      label110:
      if (localIterator.hasNext())
      {
        i locali = (i)localIterator.next();
        paramInt = k + 1;
        if (k < 10) {
          break label261;
        }
        if (i >= locali.nSt) {
          break label250;
        }
        j = locali.nSt;
        i = paramInt;
      }
      for (;;)
      {
        k = j;
        j = i;
        i = k;
        k = paramInt;
        break label110;
        if ((j == -1) || (j >= this.nRR.size())) {
          break;
        }
        try
        {
          a((i)this.nRR.remove(j));
        }
        catch (Exception localException)
        {
          w.printErrStackTrace("MicroMsg.AddrBook", localException, "size:%d, idx:%d", new Object[] { Integer.valueOf(this.nRR.size()), Integer.valueOf(j) });
        }
        break;
        label250:
        k = i;
        i = j;
        j = k;
      }
      label261:
      k = paramInt;
    }
  }
  
  public final byte[] toByteArray()
  {
    GMTrace.i(5466822279168L, 40731);
    aYp();
    byte[] arrayOfByte = super.toByteArray();
    GMTrace.o(5466822279168L, 40731);
    return arrayOfByte;
  }
  
  public final String toString()
  {
    GMTrace.i(5466419625984L, 40728);
    String str = "" + getClass().getName() + "(";
    str = str + "syncInfo = " + this.nRP + "   ";
    str = str + "addrs = " + this.nRR + "   ";
    str = str + ")";
    GMTrace.o(5466419625984L, 40728);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qqmail\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.sns.j;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.vending.g.c;
import com.tencent.mm.vending.g.g;

public class b
  implements com.tencent.mm.vending.c.b<a>
{
  protected a qoN;
  public final a qoO;
  public final b qoP;
  
  public b()
  {
    this(new a());
    GMTrace.i(8156142895104L, 60768);
    GMTrace.o(8156142895104L, 60768);
  }
  
  private b(a parama)
  {
    GMTrace.i(8156277112832L, 60769);
    this.qoO = new a();
    this.qoP = new b();
    this.qoN = parama;
    GMTrace.o(8156277112832L, 60769);
  }
  
  public final a bqv()
  {
    GMTrace.i(8156411330560L, 60770);
    a locala = this.qoN;
    GMTrace.o(8156411330560L, 60770);
    return locala;
  }
  
  public final class a
    implements com.tencent.mm.vending.h.e<Void, com.tencent.mm.vending.j.e<String, Boolean, Boolean, Integer>>
  {
    public a()
    {
      GMTrace.i(8155606024192L, 60764);
      GMTrace.o(8155606024192L, 60764);
    }
    
    public final String PJ()
    {
      GMTrace.i(8155740241920L, 60765);
      GMTrace.o(8155740241920L, 60765);
      return "Vending.LOGIC";
    }
    
    public final c<Void> b(String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
    {
      GMTrace.i(8155874459648L, 60766);
      paramString = g.a(paramString, Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), Integer.valueOf(paramInt)).a(this);
      GMTrace.o(8155874459648L, 60766);
      return paramString;
    }
  }
  
  public final class b
    implements com.tencent.mm.vending.h.e<Void, com.tencent.mm.vending.j.e<String, Boolean, Boolean, Integer>>
  {
    public b()
    {
      GMTrace.i(8156679766016L, 60772);
      GMTrace.o(8156679766016L, 60772);
    }
    
    public final String PJ()
    {
      GMTrace.i(8156813983744L, 60773);
      GMTrace.o(8156813983744L, 60773);
      return "Vending.LOGIC";
    }
    
    public final c<Void> b(String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
    {
      GMTrace.i(8156948201472L, 60774);
      paramString = g.a(paramString, Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), Integer.valueOf(paramInt)).a(this);
      GMTrace.o(8156948201472L, 60774);
      return paramString;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\j\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
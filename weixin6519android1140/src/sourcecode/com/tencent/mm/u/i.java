package com.tencent.mm.u;

import com.b.a.b;
import com.b.a.e;
import com.b.a.h;
import com.tencent.gmtrace.GMTrace;
import java.util.Iterator;
import java.util.List;

public final class i
{
  private static b a(a parama)
  {
    GMTrace.i(20818780225536L, 155112);
    localb = new b();
    if (parama == null)
    {
      GMTrace.o(20818780225536L, 155112);
      return localb;
    }
    int i = 0;
    try
    {
      while (i < parama.length())
      {
        a(localb, parama.get(i));
        i += 1;
      }
      return localb;
    }
    catch (f parama)
    {
      GMTrace.o(20818780225536L, 155112);
    }
  }
  
  private static e a(c paramc)
  {
    GMTrace.i(20818646007808L, 155111);
    locale = new e();
    if (paramc == null)
    {
      GMTrace.o(20818646007808L, 155111);
      return locale;
    }
    try
    {
      Iterator localIterator = paramc.keys();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        a(locale, str, paramc.get(str));
      }
      return locale;
    }
    catch (f paramc)
    {
      GMTrace.o(20818646007808L, 155111);
    }
  }
  
  protected static void a(b paramb, Object paramObject)
  {
    GMTrace.i(20818914443264L, 155113);
    if ((paramObject instanceof c))
    {
      paramb.a(a((c)paramObject));
      GMTrace.o(20818914443264L, 155113);
      return;
    }
    if ((paramObject instanceof a))
    {
      paramb.a(a((a)paramObject));
      GMTrace.o(20818914443264L, 155113);
      return;
    }
    if ((paramObject instanceof Integer))
    {
      paramb.bM(((Integer)paramObject).intValue());
      GMTrace.o(20818914443264L, 155113);
      return;
    }
    if ((paramObject instanceof String))
    {
      paramObject = (String)paramObject;
      paramb.aaw.add(com.b.a.a.u((String)paramObject));
      GMTrace.o(20818914443264L, 155113);
      return;
    }
    if ((paramObject instanceof Boolean))
    {
      paramb.ac(((Boolean)paramObject).booleanValue());
      GMTrace.o(20818914443264L, 155113);
      return;
    }
    if ((paramObject instanceof Long))
    {
      paramb.h(((Long)paramObject).longValue());
      GMTrace.o(20818914443264L, 155113);
      return;
    }
    if ((paramObject instanceof Float))
    {
      float f = ((Float)paramObject).floatValue();
      paramb.aaw.add(com.b.a.a.H(f));
      GMTrace.o(20818914443264L, 155113);
      return;
    }
    if ((paramObject instanceof Integer))
    {
      paramb.bM(((Integer)paramObject).intValue());
      GMTrace.o(20818914443264L, 155113);
      return;
    }
    if ((paramObject instanceof Double))
    {
      paramb.e(((Double)paramObject).doubleValue());
      GMTrace.o(20818914443264L, 155113);
      return;
    }
    if ((paramObject instanceof h)) {
      paramb.a((h)paramObject);
    }
    GMTrace.o(20818914443264L, 155113);
  }
  
  protected static void a(e parame, String paramString, Object paramObject)
  {
    GMTrace.i(20819048660992L, 155114);
    if ((paramObject instanceof c))
    {
      parame.b(paramString, a((c)paramObject));
      GMTrace.o(20819048660992L, 155114);
      return;
    }
    if ((paramObject instanceof a))
    {
      parame.b(paramString, a((a)paramObject));
      GMTrace.o(20819048660992L, 155114);
      return;
    }
    if ((paramObject instanceof Integer))
    {
      parame.c(paramString, ((Integer)paramObject).intValue());
      GMTrace.o(20819048660992L, 155114);
      return;
    }
    if ((paramObject instanceof String))
    {
      parame.b(paramString, com.b.a.a.u((String)paramObject));
      GMTrace.o(20819048660992L, 155114);
      return;
    }
    if ((paramObject instanceof Boolean))
    {
      parame.b(paramString, com.b.a.a.ab(((Boolean)paramObject).booleanValue()));
      GMTrace.o(20819048660992L, 155114);
      return;
    }
    if ((paramObject instanceof Long))
    {
      parame.b(paramString, com.b.a.a.g(((Long)paramObject).longValue()));
      GMTrace.o(20819048660992L, 155114);
      return;
    }
    if ((paramObject instanceof Float))
    {
      parame.b(paramString, com.b.a.a.H(((Float)paramObject).floatValue()));
      GMTrace.o(20819048660992L, 155114);
      return;
    }
    if ((paramObject instanceof Integer))
    {
      parame.c(paramString, ((Integer)paramObject).intValue());
      GMTrace.o(20819048660992L, 155114);
      return;
    }
    if ((paramObject instanceof Double))
    {
      parame.b(paramString, com.b.a.a.d(((Double)paramObject).doubleValue()));
      GMTrace.o(20819048660992L, 155114);
      return;
    }
    if ((paramObject instanceof h)) {
      parame.b(paramString, (h)paramObject);
    }
    GMTrace.o(20819048660992L, 155114);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\u\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
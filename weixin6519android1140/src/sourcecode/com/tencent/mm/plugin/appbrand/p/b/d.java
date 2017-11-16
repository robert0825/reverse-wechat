package com.tencent.mm.plugin.appbrand.p.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.p.e.i;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public final class d
  extends c
{
  public d()
  {
    GMTrace.i(18183280918528L, 135476);
    GMTrace.o(18183280918528L, 135476);
  }
  
  public final com.tencent.mm.plugin.appbrand.p.e.c a(com.tencent.mm.plugin.appbrand.p.e.a parama, i parami)
  {
    GMTrace.i(18183415136256L, 135477);
    super.a(parama, parami);
    parami.sE("WebSocket Protocol Handshake");
    parami.put("Server", "Java-WebSocket");
    parama = Calendar.getInstance();
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
    localSimpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
    parami.put("Date", localSimpleDateFormat.format(parama.getTime()));
    GMTrace.o(18183415136256L, 135477);
    return parami;
  }
  
  public final a abM()
  {
    GMTrace.i(18183549353984L, 135478);
    d locald = new d();
    GMTrace.o(18183549353984L, 135478);
    return locald;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\p\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
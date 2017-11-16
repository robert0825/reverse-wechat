package c.t.m.g;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public final class ar
  extends ak
{
  private static ar l = new ar();
  
  private static String a(Map<String, String> paramMap)
  {
    if (paramMap == null) {
      return "";
    }
    Object localObject = paramMap.keySet();
    if (localObject == null) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localObject = ((Set)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      localStringBuilder.append("&");
      localStringBuilder.append(str);
      localStringBuilder.append("=");
      localStringBuilder.append((String)paramMap.get(str));
    }
    paramMap = localStringBuilder.substring(1);
    localStringBuilder.setLength(0);
    return paramMap;
  }
  
  private static String b(String paramString, boolean paramBoolean, Map<String, String> paramMap)
  {
    Object localObject = o.d();
    paramMap.put("A23", l.d);
    at localat = new at();
    localat.c(paramString);
    localat.a(System.currentTimeMillis());
    localat.b(aq.a);
    localat.a((String)localObject);
    paramMap.put("A1", l.c);
    paramMap.put("A2", ce.a());
    paramMap.put("A4", ce.b());
    paramMap.put("A6", ce.c());
    paramMap.put("A7", ce.e());
    paramMap.put("A23", l.d);
    paramMap.put("A33", o.f());
    paramMap.put("A10", aq.e);
    paramMap.put("A9", aq.d);
    paramMap.put("A19", localObject);
    localat.a(paramMap);
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append(ce.a(System.currentTimeMillis(), "yyyy-MM-dd HH:mm:ss.SSS") + "|");
    ((StringBuilder)localObject).append("INFO|");
    ((StringBuilder)localObject).append(ac.a + "|");
    ((StringBuilder)localObject).append(aq.c + "|");
    ((StringBuilder)localObject).append("beacon|");
    ((StringBuilder)localObject).append("1.8.1|");
    paramString = localat.d();
    try
    {
      paramMap = URLEncoder.encode(localat.d(), "utf-8");
      paramString = paramMap;
    }
    catch (UnsupportedEncodingException paramMap)
    {
      for (;;) {}
    }
    ((StringBuilder)localObject).append(paramString + "|");
    ((StringBuilder)localObject).append("|");
    ((StringBuilder)localObject).append("upload_ip|");
    ((StringBuilder)localObject).append("|");
    ((StringBuilder)localObject).append(localat.c() + "|");
    ((StringBuilder)localObject).append(localat.f() + "|");
    ((StringBuilder)localObject).append(paramBoolean + "|");
    ((StringBuilder)localObject).append(at.b() + "|");
    ((StringBuilder)localObject).append(at.a() + "|");
    paramString = a(localat.g());
    ((StringBuilder)localObject).append(paramString + "|");
    ((StringBuilder)localObject).append(ce.a(localat.e(), "yyyy-MM-dd HH:mm:ss") + "|");
    ((StringBuilder)localObject).append("upload_time|");
    ((StringBuilder)localObject).append(aq.b + "\n");
    return ((StringBuilder)localObject).toString();
  }
  
  public static ar d()
  {
    return l;
  }
  
  public final String a()
  {
    return "halley-cloud-HalleyAction";
  }
  
  public final void a(String paramString, boolean paramBoolean, Map<String, String> paramMap)
  {
    paramString = b(paramString, paramBoolean, paramMap);
    try
    {
      if (this.i.getAndIncrement() > this.j)
      {
        this.i.decrementAndGet();
        return;
      }
      new ak.b(this, paramString).a(false);
      return;
    }
    catch (Throwable paramString) {}
  }
  
  public final int b()
  {
    return u.a("report_insert_new_record_num_limit", 5, 100, 100);
  }
  
  public final String c()
  {
    return "beacon";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
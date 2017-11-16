package c.t.m.g;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ch
  implements Observer
{
  protected static String a = "";
  protected static String b = "";
  protected static String c = "";
  private static final HashMap<String, String> d = new HashMap();
  private static ch e = null;
  private ConcurrentHashMap<String, String> f = null;
  private ConcurrentHashMap<String, List<d>> g = null;
  
  private ch()
  {
    try
    {
      SharedPreferences localSharedPreferences = ci.a().b();
      if (localSharedPreferences != null)
      {
        String str = localSharedPreferences.getString("app_version", "");
        if ((c.length() > 0) && (!c.equals(str)))
        {
          cf.a("CC_Set", "clear sp > pre:" + str + ",now:" + c);
          localSharedPreferences.edit().clear().apply();
          localSharedPreferences.edit().putString("app_version", c).apply();
        }
      }
      b();
      return;
    }
    catch (Throwable localThrowable)
    {
      cf.a("CC_Set", localThrowable.getMessage(), localThrowable);
    }
  }
  
  /* Error */
  public static ch a()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 39	c/t/m/g/ch:e	Lc/t/m/g/ch;
    //   6: ifnonnull +19 -> 25
    //   9: ldc 2
    //   11: monitorenter
    //   12: new 2	c/t/m/g/ch
    //   15: dup
    //   16: invokespecial 131	c/t/m/g/ch:<init>	()V
    //   19: putstatic 39	c/t/m/g/ch:e	Lc/t/m/g/ch;
    //   22: ldc 2
    //   24: monitorexit
    //   25: getstatic 39	c/t/m/g/ch:e	Lc/t/m/g/ch;
    //   28: astore_0
    //   29: ldc 2
    //   31: monitorexit
    //   32: aload_0
    //   33: areturn
    //   34: astore_0
    //   35: ldc 2
    //   37: monitorexit
    //   38: aload_0
    //   39: athrow
    //   40: astore_0
    //   41: ldc 2
    //   43: monitorexit
    //   44: aload_0
    //   45: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   28	5	0	localch	ch
    //   34	5	0	localObject1	Object
    //   40	5	0	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   12	25	34	finally
    //   3	12	40	finally
    //   25	29	40	finally
    //   35	40	40	finally
  }
  
  private final Object a(String paramString, Class<?> paramClass)
  {
    Object localObject2 = (String)this.f.get(paramString);
    Object localObject1;
    if (localObject2 != null)
    {
      localObject1 = localObject2;
      if (((String)localObject2).length() != 0) {}
    }
    else
    {
      localObject1 = (String)d.get(paramString);
    }
    localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = "";
    }
    if (paramClass == String.class) {
      return localObject2;
    }
    if (paramClass == Integer.class) {
      try
      {
        int i = Integer.parseInt((String)localObject2);
        return Integer.valueOf(i);
      }
      catch (Throwable paramString)
      {
        return Integer.valueOf(Integer.MIN_VALUE);
      }
    }
    if (paramClass == Long.class) {
      try
      {
        long l = Long.parseLong((String)localObject2);
        return Long.valueOf(l);
      }
      catch (Throwable paramString)
      {
        return Long.valueOf(Long.MIN_VALUE);
      }
    }
    if (paramClass == Boolean.class) {
      try
      {
        boolean bool = Boolean.parseBoolean((String)localObject2);
        return Boolean.valueOf(bool);
      }
      catch (Throwable paramString)
      {
        return Boolean.FALSE;
      }
    }
    if (paramClass == Float.class) {
      try
      {
        float f1 = Float.parseFloat((String)localObject2);
        return Float.valueOf(f1);
      }
      catch (Throwable paramString)
      {
        return Float.valueOf(Float.MIN_VALUE);
      }
    }
    if (paramClass == Double.class) {
      try
      {
        double d1 = Double.parseDouble((String)localObject2);
        return Double.valueOf(d1);
      }
      catch (Throwable paramString)
      {
        return Double.valueOf(Double.MIN_VALUE);
      }
    }
    throw new IllegalStateException("The property \"" + paramString + "\" don't support class type \"" + paramClass.toString() + "\"");
  }
  
  protected static void a(String paramString)
  {
    b = paramString;
  }
  
  protected static void a(String paramString1, String paramString2)
  {
    a = paramString1;
    c = paramString2;
    b("app_version", paramString2);
  }
  
  protected static void a(HashMap<String, String> paramHashMap)
  {
    b("cc_version", "-1");
    b("cc_req_interval", "10800000");
    b("last_pull_time", "0");
    Iterator localIterator = paramHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      b(str, (String)paramHashMap.get(str));
    }
  }
  
  private static void b(String paramString1, String paramString2)
  {
    d.put(paramString1, paramString2);
  }
  
  private void f(String paramString)
  {
    if (d.get(paramString) == null) {}
    SharedPreferences localSharedPreferences;
    ConcurrentHashMap localConcurrentHashMap;
    for (;;)
    {
      return;
      try
      {
        localSharedPreferences = ci.a().b();
        if (localSharedPreferences != null)
        {
          localConcurrentHashMap = this.f;
          if (!d.containsKey(paramString)) {
            throw new NullPointerException("Not exists property name \"" + paramString + "\"");
          }
        }
      }
      catch (Throwable paramString)
      {
        cf.b("CC_Set", paramString.toString());
        return;
      }
    }
    localConcurrentHashMap.put(paramString, localSharedPreferences.getString(paramString, (String)d.get(paramString)));
  }
  
  public final int b(String paramString)
  {
    return ((Integer)a(paramString, Integer.class)).intValue();
  }
  
  protected final void b()
  {
    Iterator localIterator = d.keySet().iterator();
    while (localIterator.hasNext()) {
      f((String)localIterator.next());
    }
    cf.a("CC_Set", "---> read xml:" + this.f.toString());
  }
  
  public final long c(String paramString)
  {
    return ((Long)a(paramString, Long.class)).longValue();
  }
  
  protected final void c()
  {
    this.g.clear();
  }
  
  public final boolean d(String paramString)
  {
    return ((Boolean)a(paramString, Boolean.class)).booleanValue();
  }
  
  public final String e(String paramString)
  {
    return (String)a(paramString, String.class);
  }
  
  public void update(Observable paramObservable, Object paramObject)
  {
    if (paramObject == null)
    {
      paramObservable = null;
      if ((paramObservable != null) && (paramObservable.length() != 0)) {
        break label26;
      }
    }
    for (;;)
    {
      return;
      paramObservable = (String)paramObject;
      break;
      label26:
      paramObject = "update [" + paramObservable + "] : " + (String)this.f.get(paramObservable) + " --> ";
      f(paramObservable);
      cf.a("CC_Set", (String)paramObject + (String)this.f.get(paramObservable));
      paramObservable = (List)this.g.get(paramObservable);
      if ((paramObservable != null) && (!paramObservable.isEmpty()))
      {
        paramObservable = paramObservable.iterator();
        while (paramObservable.hasNext()) {
          paramObservable.next();
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\ch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.appbrand;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class c
{
  private static Map<String, a> hyi;
  private static Map<String, c> hyj;
  private static Map<String, Set<b>> hyk;
  
  static
  {
    GMTrace.i(10214774407168L, 76106);
    hyi = new HashMap();
    hyj = new HashMap();
    hyk = new ConcurrentHashMap();
    GMTrace.o(10214774407168L, 76106);
  }
  
  public static void a(String paramString, a parama)
  {
    GMTrace.i(10214505971712L, 76104);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(10214505971712L, 76104);
      return;
    }
    hyi.put(paramString, parama);
    GMTrace.o(10214505971712L, 76104);
  }
  
  public static void a(String paramString, b paramb)
  {
    GMTrace.i(10213029576704L, 76093);
    if ((paramString == null) || (paramb == null))
    {
      GMTrace.o(10213029576704L, 76093);
      return;
    }
    if (!hyk.containsKey(paramString)) {
      hyk.put(paramString, Collections.newSetFromMap(new ConcurrentHashMap()));
    }
    ((Set)hyk.get(paramString)).add(paramb);
    GMTrace.o(10213029576704L, 76093);
  }
  
  public static void a(String paramString, c paramc)
  {
    GMTrace.i(15447252533248L, 115091);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(15447252533248L, 115091);
      return;
    }
    hyj.put(paramString, paramc);
    GMTrace.o(15447252533248L, 115091);
  }
  
  public static void b(String paramString, b paramb)
  {
    GMTrace.i(10213969100800L, 76100);
    if (paramb == null)
    {
      GMTrace.o(10213969100800L, 76100);
      return;
    }
    paramString = (Set)hyk.get(paramString);
    if ((paramString == null) || (paramString.isEmpty()))
    {
      GMTrace.o(10213969100800L, 76100);
      return;
    }
    paramString.remove(paramb);
    GMTrace.o(10213969100800L, 76100);
  }
  
  private static Iterator<b> nO(String paramString)
  {
    GMTrace.i(10213163794432L, 76094);
    Set localSet = (Set)hyk.get(paramString);
    paramString = localSet;
    if (localSet == null) {
      paramString = new HashSet();
    }
    paramString = paramString.iterator();
    GMTrace.o(10213163794432L, 76094);
    return paramString;
  }
  
  public static void nP(String paramString)
  {
    GMTrace.i(10213298012160L, 76095);
    paramString = nO(paramString);
    while (paramString.hasNext()) {
      ((b)paramString.next()).onCreate();
    }
    GMTrace.o(10213298012160L, 76095);
  }
  
  public static void nQ(String paramString)
  {
    GMTrace.i(10213432229888L, 76096);
    paramString = nO(paramString);
    while (paramString.hasNext()) {
      ((b)paramString.next()).onDestroy();
    }
    GMTrace.o(10213432229888L, 76096);
  }
  
  public static void nR(String paramString)
  {
    GMTrace.i(10213566447616L, 76097);
    Iterator localIterator = nO(paramString);
    while (localIterator.hasNext()) {
      ((b)localIterator.next()).a(nW(paramString));
    }
    GMTrace.o(10213566447616L, 76097);
  }
  
  public static void nS(String paramString)
  {
    GMTrace.i(10213700665344L, 76098);
    paramString = nO(paramString);
    while (paramString.hasNext()) {
      ((b)paramString.next()).onResume();
    }
    GMTrace.o(10213700665344L, 76098);
  }
  
  public static void nT(String paramString)
  {
    GMTrace.i(10213834883072L, 76099);
    paramString = nO(paramString);
    while (paramString.hasNext()) {
      paramString.next();
    }
    GMTrace.o(10213834883072L, 76099);
  }
  
  public static void nU(String paramString)
  {
    GMTrace.i(10214103318528L, 76101);
    hyk.remove(paramString);
    GMTrace.o(10214103318528L, 76101);
  }
  
  public static void nV(String paramString)
  {
    GMTrace.i(16549851168768L, 123306);
    a(paramString, c.hyu);
    GMTrace.o(16549851168768L, 123306);
  }
  
  public static c nW(String paramString)
  {
    GMTrace.i(15447118315520L, 115090);
    paramString = (c)hyj.get(paramString);
    if (paramString == null)
    {
      paramString = c.hyu;
      GMTrace.o(15447118315520L, 115090);
      return paramString;
    }
    GMTrace.o(15447118315520L, 115090);
    return paramString;
  }
  
  public static a nX(String paramString)
  {
    GMTrace.i(10214640189440L, 76105);
    a locala = (a)hyi.get(paramString);
    paramString = locala;
    if (locala == null) {
      paramString = a.hyl;
    }
    GMTrace.o(10214640189440L, 76105);
    return paramString;
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(10661182570496L, 79432);
      hyl = new a("INIT", 0);
      hym = new a("ON_CREATE", 1);
      hyn = new a("ON_RESUME", 2);
      hyo = new a("ON_PAUSE", 3);
      hyp = new a("ON_STOP", 4);
      hyq = new a("ON_DESTROY", 5);
      hyr = new a[] { hyl, hym, hyn, hyo, hyp, hyq };
      GMTrace.o(10661182570496L, 79432);
    }
    
    private a()
    {
      GMTrace.i(10661048352768L, 79431);
      GMTrace.o(10661048352768L, 79431);
    }
  }
  
  public static class b
  {
    public b()
    {
      GMTrace.i(10143773229056L, 75577);
      GMTrace.o(10143773229056L, 75577);
    }
    
    public void a(c.c paramc)
    {
      GMTrace.i(10144175882240L, 75580);
      GMTrace.o(10144175882240L, 75580);
    }
    
    public void onCreate()
    {
      GMTrace.i(20767374835712L, 154729);
      GMTrace.o(20767374835712L, 154729);
    }
    
    public void onDestroy()
    {
      GMTrace.i(10144041664512L, 75579);
      GMTrace.o(10144041664512L, 75579);
    }
    
    public void onResume()
    {
      GMTrace.i(10144310099968L, 75581);
      GMTrace.o(10144310099968L, 75581);
    }
  }
  
  public static enum c
  {
    static
    {
      GMTrace.i(10595818536960L, 78945);
      hys = new c("CLOSE", 0);
      hyt = new c("BACK", 1);
      hyu = new c("HIDE", 2);
      hyv = new c("HANG", 3);
      hyw = new c("HOME_PRESSED", 4);
      hyx = new c("LAUNCH_NATIVE_PAGE", 5);
      hyy = new c("LAUNCH_MINI_PROGRAM", 6);
      hyz = new c[] { hys, hyt, hyu, hyv, hyw, hyx, hyy };
      GMTrace.o(10595818536960L, 78945);
    }
    
    private c()
    {
      GMTrace.i(10595684319232L, 78944);
      GMTrace.o(10595684319232L, 78944);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
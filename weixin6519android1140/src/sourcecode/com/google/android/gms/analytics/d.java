package com.google.android.gms.analytics;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.analytics.a.b;
import com.google.android.gms.analytics.internal.k;
import com.google.android.gms.analytics.internal.m;
import com.google.android.gms.analytics.internal.n;
import com.google.android.gms.analytics.internal.p;
import com.google.android.gms.analytics.internal.q;
import com.google.android.gms.analytics.internal.s;
import com.google.android.gms.c.ae;
import com.google.android.gms.c.ai;
import com.google.android.gms.c.aj;
import com.google.android.gms.c.ak;
import com.google.android.gms.c.al;
import com.google.android.gms.c.am;
import com.google.android.gms.c.an;
import com.google.android.gms.c.ao;
import com.google.android.gms.c.ap;
import com.google.android.gms.c.aq;
import com.google.android.gms.c.ar;
import com.google.android.gms.c.g;
import com.google.android.gms.c.h;
import com.google.android.gms.common.internal.w;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class d
  extends n
  implements ai
{
  private static DecimalFormat afk;
  private final q aeb;
  private final String afl;
  private final Uri afm;
  private final boolean afn;
  private final boolean afo;
  
  public d(q paramq, String paramString)
  {
    this(paramq, paramString, (byte)0);
  }
  
  private d(q paramq, String paramString, byte paramByte)
  {
    super(paramq);
    w.af(paramString);
    this.aeb = paramq;
    this.afl = paramString;
    this.afn = true;
    this.afo = false;
    this.afm = Z(this.afl);
  }
  
  public static Uri Z(String paramString)
  {
    w.af(paramString);
    Uri.Builder localBuilder = new Uri.Builder();
    localBuilder.scheme("uri");
    localBuilder.authority("google-analytics.com");
    localBuilder.path(paramString);
    return localBuilder.build();
  }
  
  private static void a(Map<String, String> paramMap, String paramString, double paramDouble)
  {
    if (paramDouble != 0.0D) {
      paramMap.put(paramString, f(paramDouble));
    }
  }
  
  private static void a(Map<String, String> paramMap, String paramString, int paramInt1, int paramInt2)
  {
    if ((paramInt1 > 0) && (paramInt2 > 0)) {
      paramMap.put(paramString, paramInt1 + "x" + paramInt2);
    }
  }
  
  private static void a(Map<String, String> paramMap, String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramMap.put(paramString, "1");
    }
  }
  
  private static void b(Map<String, String> paramMap, String paramString1, String paramString2)
  {
    if (!TextUtils.isEmpty(paramString2)) {
      paramMap.put(paramString1, paramString2);
    }
  }
  
  private static Map<String, String> c(ae paramae)
  {
    HashMap localHashMap = new HashMap();
    Object localObject1 = (g)paramae.a(g.class);
    Object localObject3;
    Object localObject4;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject3 = Collections.unmodifiableMap(((g)localObject1).abX).entrySet().iterator();
      label198:
      while (((Iterator)localObject3).hasNext())
      {
        localObject4 = (Map.Entry)((Iterator)localObject3).next();
        localObject1 = ((Map.Entry)localObject4).getValue();
        if (localObject1 == null) {
          localObject1 = null;
        }
        for (;;)
        {
          if (localObject1 == null) {
            break label198;
          }
          localHashMap.put(((Map.Entry)localObject4).getKey(), localObject1);
          break;
          if ((localObject1 instanceof String))
          {
            localObject2 = (String)localObject1;
            localObject1 = localObject2;
            if (TextUtils.isEmpty((CharSequence)localObject2)) {
              localObject1 = null;
            }
          }
          else if ((localObject1 instanceof Double))
          {
            localObject1 = (Double)localObject1;
            if (((Double)localObject1).doubleValue() != 0.0D) {
              localObject1 = f(((Double)localObject1).doubleValue());
            } else {
              localObject1 = null;
            }
          }
          else if ((localObject1 instanceof Boolean))
          {
            if (localObject1 != Boolean.FALSE) {
              localObject1 = "1";
            } else {
              localObject1 = null;
            }
          }
          else
          {
            localObject1 = String.valueOf(localObject1);
          }
        }
      }
    }
    localObject1 = (h)paramae.a(h.class);
    if (localObject1 != null)
    {
      b(localHashMap, "t", ((h)localObject1).atl);
      b(localHashMap, "cid", ((h)localObject1).adi);
      b(localHashMap, "uid", ((h)localObject1).atm);
      b(localHashMap, "sc", ((h)localObject1).atp);
      a(localHashMap, "sf", ((h)localObject1).atr);
      a(localHashMap, "ni", ((h)localObject1).atq);
      b(localHashMap, "adid", ((h)localObject1).atn);
      a(localHashMap, "ate", ((h)localObject1).ato);
    }
    localObject1 = (ap)paramae.a(ap.class);
    if (localObject1 != null)
    {
      b(localHashMap, "cd", ((ap)localObject1).avR);
      a(localHashMap, "a", ((ap)localObject1).avS);
      b(localHashMap, "dr", ((ap)localObject1).avV);
    }
    localObject1 = (an)paramae.a(an.class);
    if (localObject1 != null)
    {
      b(localHashMap, "ec", ((an)localObject1).ry);
      b(localHashMap, "ea", ((an)localObject1).alw);
      b(localHashMap, "el", ((an)localObject1).avN);
      a(localHashMap, "ev", ((an)localObject1).avO);
    }
    localObject1 = (ak)paramae.a(ak.class);
    if (localObject1 != null)
    {
      b(localHashMap, "cn", ((ak)localObject1).mName);
      b(localHashMap, "cs", ((ak)localObject1).avv);
      b(localHashMap, "cm", ((ak)localObject1).avw);
      b(localHashMap, "ck", ((ak)localObject1).avx);
      b(localHashMap, "cc", ((ak)localObject1).avy);
      b(localHashMap, "ci", ((ak)localObject1).abK);
      b(localHashMap, "anid", ((ak)localObject1).avz);
      b(localHashMap, "gclid", ((ak)localObject1).avA);
      b(localHashMap, "dclid", ((ak)localObject1).avB);
      b(localHashMap, "aclid", ((ak)localObject1).avC);
    }
    localObject1 = (ao)paramae.a(ao.class);
    if (localObject1 != null)
    {
      b(localHashMap, "exd", ((ao)localObject1).avP);
      a(localHashMap, "exf", ((ao)localObject1).avQ);
    }
    localObject1 = (aq)paramae.a(aq.class);
    if (localObject1 != null)
    {
      b(localHashMap, "sn", ((aq)localObject1).avZ);
      b(localHashMap, "sa", ((aq)localObject1).alw);
      b(localHashMap, "st", ((aq)localObject1).awa);
    }
    localObject1 = (ar)paramae.a(ar.class);
    if (localObject1 != null)
    {
      b(localHashMap, "utv", ((ar)localObject1).awb);
      a(localHashMap, "utt", ((ar)localObject1).awc);
      b(localHashMap, "utc", ((ar)localObject1).ry);
      b(localHashMap, "utl", ((ar)localObject1).avN);
    }
    localObject1 = (com.google.android.gms.c.e)paramae.a(com.google.android.gms.c.e.class);
    if (localObject1 != null)
    {
      localObject1 = Collections.unmodifiableMap(((com.google.android.gms.c.e)localObject1).atj).entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        localObject3 = e.f("cd", ((Integer)((Map.Entry)localObject2).getKey()).intValue());
        if (!TextUtils.isEmpty((CharSequence)localObject3)) {
          localHashMap.put(localObject3, ((Map.Entry)localObject2).getValue());
        }
      }
    }
    localObject1 = (com.google.android.gms.c.f)paramae.a(com.google.android.gms.c.f.class);
    if (localObject1 != null)
    {
      localObject1 = Collections.unmodifiableMap(((com.google.android.gms.c.f)localObject1).atk).entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        localObject3 = e.f("cm", ((Integer)((Map.Entry)localObject2).getKey()).intValue());
        if (!TextUtils.isEmpty((CharSequence)localObject3)) {
          localHashMap.put(localObject3, f(((Double)((Map.Entry)localObject2).getValue()).doubleValue()));
        }
      }
    }
    localObject1 = (am)paramae.a(am.class);
    if (localObject1 != null)
    {
      localObject2 = ((am)localObject1).avM;
      if (localObject2 != null)
      {
        localObject2 = new HashMap(((b)localObject2).abJ).entrySet().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (Map.Entry)((Iterator)localObject2).next();
          if (((String)((Map.Entry)localObject3).getKey()).startsWith("&")) {
            localHashMap.put(((String)((Map.Entry)localObject3).getKey()).substring(1), ((Map.Entry)localObject3).getValue());
          } else {
            localHashMap.put(((Map.Entry)localObject3).getKey(), ((Map.Entry)localObject3).getValue());
          }
        }
      }
      localObject2 = Collections.unmodifiableList(((am)localObject1).avK).iterator();
      int i = 1;
      while (((Iterator)localObject2).hasNext())
      {
        localHashMap.putAll(((com.google.android.gms.analytics.a.c)((Iterator)localObject2).next()).G(e.f("promo", i)));
        i += 1;
      }
      localObject2 = Collections.unmodifiableList(((am)localObject1).avJ).iterator();
      i = 1;
      while (((Iterator)localObject2).hasNext())
      {
        localHashMap.putAll(((com.google.android.gms.analytics.a.a)((Iterator)localObject2).next()).G(e.f("pr", i)));
        i += 1;
      }
      localObject1 = ((am)localObject1).avL.entrySet().iterator();
      i = 1;
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        localObject4 = (List)((Map.Entry)localObject2).getValue();
        localObject3 = e.f("il", i);
        localObject4 = ((List)localObject4).iterator();
        int j = 1;
        while (((Iterator)localObject4).hasNext())
        {
          localHashMap.putAll(((com.google.android.gms.analytics.a.a)((Iterator)localObject4).next()).G((String)localObject3 + e.f("pi", j)));
          j += 1;
        }
        if (!TextUtils.isEmpty((CharSequence)((Map.Entry)localObject2).getKey())) {
          localHashMap.put((String)localObject3 + "nm", ((Map.Entry)localObject2).getKey());
        }
        i += 1;
      }
    }
    localObject1 = (al)paramae.a(al.class);
    if (localObject1 != null)
    {
      b(localHashMap, "ul", ((al)localObject1).avD);
      a(localHashMap, "sd", ((al)localObject1).avE);
      a(localHashMap, "sr", ((al)localObject1).avF, ((al)localObject1).avG);
      a(localHashMap, "vp", ((al)localObject1).avH, ((al)localObject1).avI);
    }
    paramae = (aj)paramae.a(aj.class);
    if (paramae != null)
    {
      b(localHashMap, "an", paramae.abS);
      b(localHashMap, "aid", paramae.avt);
      b(localHashMap, "aiid", paramae.avu);
      b(localHashMap, "av", paramae.abT);
    }
    return localHashMap;
  }
  
  private static String f(double paramDouble)
  {
    if (afk == null) {
      afk = new DecimalFormat("0.######");
    }
    return afk.format(paramDouble);
  }
  
  public final void b(ae paramae)
  {
    w.aa(paramae);
    w.c(paramae.auX, "Can't deliver not submitted measurement");
    w.ah("deliver should be called on worker thread");
    Object localObject1 = paramae.lz();
    Object localObject2 = (h)((ae)localObject1).b(h.class);
    if (TextUtils.isEmpty(((h)localObject2).atl)) {
      this.ack.iE().a(c((ae)localObject1), "Ignoring measurement without type");
    }
    do
    {
      return;
      if (TextUtils.isEmpty(((h)localObject2).adi))
      {
        this.ack.iE().a(c((ae)localObject1), "Ignoring measurement without client id");
        return;
      }
    } while (this.aeb.iH().abI);
    double d = ((h)localObject2).atr;
    if (k.a(d, ((h)localObject2).adi))
    {
      d("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(d));
      return;
    }
    localObject1 = c((ae)localObject1);
    ((Map)localObject1).put("v", "1");
    ((Map)localObject1).put("_v", p.acP);
    ((Map)localObject1).put("tid", this.afl);
    if (this.aeb.iH().abH)
    {
      paramae = new StringBuilder();
      localObject1 = ((Map)localObject1).entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        if (paramae.length() != 0) {
          paramae.append(", ");
        }
        paramae.append((String)((Map.Entry)localObject2).getKey());
        paramae.append("=");
        paramae.append((String)((Map.Entry)localObject2).getValue());
      }
      a(4, "Dry run is enabled. GoogleAnalytics would have sent", paramae.toString(), null, null);
      return;
    }
    HashMap localHashMap = new HashMap();
    k.a(localHashMap, "uid", ((h)localObject2).atm);
    Object localObject3 = (aj)paramae.a(aj.class);
    if (localObject3 != null)
    {
      k.a(localHashMap, "an", ((aj)localObject3).abS);
      k.a(localHashMap, "aid", ((aj)localObject3).avt);
      k.a(localHashMap, "av", ((aj)localObject3).abT);
      k.a(localHashMap, "aiid", ((aj)localObject3).avu);
    }
    localObject3 = ((h)localObject2).adi;
    String str = this.afl;
    if (!TextUtils.isEmpty(((h)localObject2).atn)) {}
    for (boolean bool = true;; bool = false)
    {
      localObject2 = new s(0L, (String)localObject3, str, bool, 0L, localHashMap);
      ((Map)localObject1).put("_s", String.valueOf(this.ack.iG().a((s)localObject2)));
      paramae = new com.google.android.gms.analytics.internal.c(this.ack.iE(), (Map)localObject1, paramae.auY);
      this.ack.iG().c(paramae);
      return;
    }
  }
  
  public final Uri jy()
  {
    return this.afm;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
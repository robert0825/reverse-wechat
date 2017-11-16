package com.google.android.gms.analytics.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import com.google.android.gms.common.internal.w;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

public class f
  extends o
{
  private static String acg = "3";
  private static String ach = "01VDIWEA?";
  private static f aci;
  
  public f(q paramq)
  {
    super(paramq);
  }
  
  private static String U(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    if ((paramObject instanceof Integer)) {
      paramObject = new Long(((Integer)paramObject).intValue());
    }
    for (;;)
    {
      if ((paramObject instanceof Long))
      {
        if (Math.abs(((Long)paramObject).longValue()) < 100L) {
          return String.valueOf(paramObject);
        }
        if (String.valueOf(paramObject).charAt(0) == '-') {}
        for (String str = "-";; str = "")
        {
          paramObject = String.valueOf(Math.abs(((Long)paramObject).longValue()));
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append(str);
          localStringBuilder.append(Math.round(Math.pow(10.0D, ((String)paramObject).length() - 1)));
          localStringBuilder.append("...");
          localStringBuilder.append(str);
          localStringBuilder.append(Math.round(Math.pow(10.0D, ((String)paramObject).length()) - 1.0D));
          return localStringBuilder.toString();
        }
      }
      if ((paramObject instanceof Boolean)) {
        return String.valueOf(paramObject);
      }
      if ((paramObject instanceof Throwable)) {
        return paramObject.getClass().getCanonicalName();
      }
      return "-";
    }
  }
  
  private void b(int paramInt, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    for (;;)
    {
      try
      {
        w.aa(paramString);
        if (paramInt >= 0) {
          break label402;
        }
        paramInt = 0;
        if (paramInt < ach.length()) {
          break label399;
        }
        paramInt = ach.length() - 1;
        label32:
        if (this.ack.acS.jh()) {
          if (com.google.android.gms.common.internal.f.akn)
          {
            c = 'P';
            paramObject1 = acg + ach.charAt(paramInt) + c + p.VERSION + ":" + a(paramString, U(paramObject1), U(paramObject2), U(paramObject3));
            paramString = (String)paramObject1;
            if (((String)paramObject1).length() > 1024) {
              paramString = ((String)paramObject1).substring(0, 1024);
            }
            paramObject1 = this.ack;
            if (((q)paramObject1).acY == null) {
              break label405;
            }
            if (((q)paramObject1).acY.isInitialized()) {
              continue;
            }
            break label405;
            label165:
            if (paramObject1 != null)
            {
              paramObject1 = ((i)paramObject1).acw;
              if (((i.a)paramObject1).ik() != 0L) {
                break label410;
              }
              ((i.a)paramObject1).ij();
              break label410;
            }
          }
        }
        try
        {
          label190:
          long l = ((i.a)paramObject1).acy.act.getLong(((i.a)paramObject1).im(), 0L);
          if (l <= 0L)
          {
            paramObject2 = ((i.a)paramObject1).acy.act.edit();
            ((SharedPreferences.Editor)paramObject2).putString(((i.a)paramObject1).in(), paramString);
            ((SharedPreferences.Editor)paramObject2).putLong(((i.a)paramObject1).im(), 1L);
            ((SharedPreferences.Editor)paramObject2).apply();
            return;
            c = 'C';
            continue;
            if (!com.google.android.gms.common.internal.f.akn) {
              break label420;
            }
            c = 'p';
            continue;
            paramObject1 = ((q)paramObject1).acY;
            continue;
          }
          if ((UUID.randomUUID().getLeastSignificantBits() & 0x7FFFFFFFFFFFFFFF) < Long.MAX_VALUE / (1L + l))
          {
            paramInt = 1;
            paramObject2 = ((i.a)paramObject1).acy.act.edit();
            if (paramInt != 0) {
              ((SharedPreferences.Editor)paramObject2).putString(((i.a)paramObject1).in(), paramString);
            }
            ((SharedPreferences.Editor)paramObject2).putLong(((i.a)paramObject1).im(), l + 1L);
            ((SharedPreferences.Editor)paramObject2).apply();
            continue;
            paramString = finally;
          }
        }
        finally {}
        paramInt = 0;
      }
      finally {}
      continue;
      label399:
      label402:
      label405:
      label410:
      do
      {
        break label190;
        break label32;
        break;
        paramObject1 = null;
        break label165;
      } while (paramString != null);
      paramString = "";
      continue;
      label420:
      char c = 'c';
    }
  }
  
  public static f ia()
  {
    return aci;
  }
  
  public final void a(int paramInt, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    String str = (String)aj.aeq.get();
    if (Log.isLoggable(str, paramInt)) {
      Log.println(paramInt, str, a(paramString, paramObject1, paramObject2, paramObject3));
    }
    if (paramInt >= 5) {
      b(paramInt, paramString, paramObject1, paramObject2, paramObject3);
    }
  }
  
  public final void a(c paramc, String paramString)
  {
    if (paramc != null) {}
    for (paramc = paramc.toString();; paramc = "no hit data")
    {
      e("Discarding hit. " + paramString, paramc);
      return;
    }
  }
  
  public final void a(Map<String, String> paramMap, String paramString)
  {
    StringBuilder localStringBuilder;
    if (paramMap != null)
    {
      localStringBuilder = new StringBuilder();
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        if (localStringBuilder.length() > 0) {
          localStringBuilder.append(',');
        }
        localStringBuilder.append((String)localEntry.getKey());
        localStringBuilder.append('=');
        localStringBuilder.append((String)localEntry.getValue());
      }
    }
    for (paramMap = localStringBuilder.toString();; paramMap = "no hit data")
    {
      e("Discarding hit. " + paramString, paramMap);
      return;
    }
  }
  
  protected final void hS()
  {
    try
    {
      aci = this;
      return;
    }
    finally {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\internal\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
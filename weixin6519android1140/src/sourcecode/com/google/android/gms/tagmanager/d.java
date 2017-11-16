package com.google.android.gms.tagmanager;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build.VERSION;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class d
{
  private static d ayB;
  private final an ayA;
  private final a ayw;
  private final c ayx;
  final ad ayy;
  final ConcurrentMap<am, Boolean> ayz;
  private final Context mContext;
  
  private d(Context paramContext, a parama, c paramc, ad paramad)
  {
    if (paramContext == null) {
      throw new NullPointerException("context cannot be null");
    }
    this.mContext = paramContext.getApplicationContext();
    this.ayy = paramad;
    this.ayw = parama;
    this.ayz = new ConcurrentHashMap();
    this.ayx = paramc;
    this.ayx.a(new c.b()
    {
      public final void g(Map<String, Object> paramAnonymousMap)
      {
        Object localObject = paramAnonymousMap.get("event");
        if (localObject != null)
        {
          paramAnonymousMap = d.this;
          localObject = localObject.toString();
          paramAnonymousMap = paramAnonymousMap.ayz.keySet().iterator();
          while (paramAnonymousMap.hasNext()) {
            ((am)paramAnonymousMap.next()).az((String)localObject);
          }
        }
      }
    });
    this.ayx.a(new ag(this.mContext));
    this.ayA = new an();
    if (Build.VERSION.SDK_INT >= 14) {
      this.mContext.registerComponentCallbacks(new ComponentCallbacks2()
      {
        public final void onConfigurationChanged(Configuration paramAnonymousConfiguration) {}
        
        public final void onLowMemory() {}
        
        public final void onTrimMemory(int paramAnonymousInt)
        {
          if (paramAnonymousInt == 20) {
            d.this.ayy.mM();
          }
        }
      });
    }
  }
  
  public static d O(Context paramContext)
  {
    try
    {
      if (ayB != null) {
        break label66;
      }
      if (paramContext == null)
      {
        m.mo();
        throw new NullPointerException();
      }
    }
    finally {}
    ayB = new d(paramContext, new a()new cnew ap {}, new c(new ap(paramContext)), ae.mN());
    label66:
    paramContext = ayB;
    return paramContext;
  }
  
  final boolean d(Uri paramUri)
  {
    for (;;)
    {
      Object localObject;
      String str;
      boolean bool;
      try
      {
        localObject = w.mJ();
        if (!((w)localObject).d(paramUri)) {
          break label251;
        }
        str = ((w)localObject).ayi;
        int i = 4.ayD[(localObject.ayM - 1)];
        switch (i)
        {
        default: 
          bool = true;
          return bool;
        }
      }
      finally {}
      paramUri = this.ayz.keySet().iterator();
      if (paramUri.hasNext())
      {
        localObject = (am)paramUri.next();
        if (((am)localObject).mR().equals(str))
        {
          ((am)localObject).mS();
          ((am)localObject).refresh();
        }
      }
      else
      {
        continue;
        Iterator localIterator = this.ayz.keySet().iterator();
        label152:
        label237:
        label249:
        for (;;)
        {
          am localam;
          if (localIterator.hasNext())
          {
            localam = (am)localIterator.next();
            if (localam.mR().equals(str))
            {
              paramUri = ((w)localObject).ayN;
              localam.mS();
              localam.refresh();
              continue;
            }
            if (!localam.azS) {
              break label237;
            }
            m.mo();
          }
          for (paramUri = "";; paramUri = localam.azR.mT())
          {
            if (paramUri == null) {
              break label249;
            }
            localam.mS();
            localam.refresh();
            break label152;
            break;
          }
        }
        label251:
        bool = false;
      }
    }
  }
  
  public static abstract interface a {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\tagmanager\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
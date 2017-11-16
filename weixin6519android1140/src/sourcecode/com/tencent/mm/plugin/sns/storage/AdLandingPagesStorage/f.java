package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.k.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.m;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.q;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.s;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class f
{
  private static f pLy;
  ConcurrentLinkedQueue<String> pLx;
  
  static
  {
    GMTrace.i(8191576375296L, 61032);
    pLy = new f();
    GMTrace.o(8191576375296L, 61032);
  }
  
  private f()
  {
    GMTrace.i(8190771068928L, 61026);
    this.pLx = new ConcurrentLinkedQueue();
    GMTrace.o(8190771068928L, 61026);
  }
  
  private boolean In(String paramString)
  {
    GMTrace.i(8190905286656L, 61027);
    boolean bool = this.pLx.contains(paramString);
    GMTrace.o(8190905286656L, 61027);
    return bool;
  }
  
  private void Ip(final String paramString)
  {
    GMTrace.i(20373982674944L, 151798);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(20373982674944L, 151798);
      return;
    }
    if (In(paramString))
    {
      GMTrace.o(20373982674944L, 151798);
      return;
    }
    this.pLx.add(paramString);
    d.a("adId", paramString, true, 0, 0, new d.a()
    {
      public final void Ih(String paramAnonymousString)
      {
        GMTrace.i(20373580021760L, 151795);
        f.this.Io(paramString);
        GMTrace.o(20373580021760L, 151795);
      }
      
      public final void bkK()
      {
        GMTrace.i(20373311586304L, 151793);
        GMTrace.o(20373311586304L, 151793);
      }
      
      public final void bkL()
      {
        GMTrace.i(20373445804032L, 151794);
        com.tencent.mm.sdk.platformtools.w.e("AdLandingPagesPreDownloadResHelper", " pre download " + paramString + "is error");
        f.this.Io(paramString);
        GMTrace.o(20373445804032L, 151794);
      }
    });
    GMTrace.o(20373982674944L, 151798);
  }
  
  public static f blw()
  {
    GMTrace.i(8190636851200L, 61025);
    f localf = pLy;
    GMTrace.o(8190636851200L, 61025);
    return localf;
  }
  
  public final void Io(String paramString)
  {
    GMTrace.i(16042508156928L, 119526);
    this.pLx.remove(paramString);
    GMTrace.o(16042508156928L, 119526);
  }
  
  public final void a(String paramString, final s params)
  {
    GMTrace.i(8191039504384L, 61028);
    final Object localObject;
    if (params.pEA == 101)
    {
      params = ((n)params).pEj.iterator();
      while (params.hasNext())
      {
        localObject = ((m)params.next()).pEj.iterator();
        while (((Iterator)localObject).hasNext()) {
          a(paramString, (s)((Iterator)localObject).next());
        }
      }
      GMTrace.o(8191039504384L, 61028);
      return;
    }
    if (params.pEA == 41)
    {
      localObject = (p)params;
      if (In(((p)localObject).pEn))
      {
        GMTrace.o(8191039504384L, 61028);
        return;
      }
      this.pLx.add(((p)localObject).pEn);
      d.a(paramString, ((p)localObject).pEn, true, params.pEA, 0, new d.a()
      {
        public final void Ih(String paramAnonymousString)
        {
          GMTrace.i(8204461277184L, 61128);
          f.this.Io(localObject.pEn);
          GMTrace.o(8204461277184L, 61128);
        }
        
        public final void bkK()
        {
          GMTrace.i(8204192841728L, 61126);
          GMTrace.o(8204192841728L, 61126);
        }
        
        public final void bkL()
        {
          GMTrace.i(8204327059456L, 61127);
          com.tencent.mm.sdk.platformtools.w.e("AdLandingPagesPreDownloadResHelper", " pre download " + localObject.pEn + "is error");
          f.this.Io(localObject.pEn);
          GMTrace.o(8204327059456L, 61127);
        }
      });
      GMTrace.o(8191039504384L, 61028);
      return;
    }
    if (params.pEA == 44)
    {
      localObject = (o)params;
      if (In(((o)localObject).pEn))
      {
        GMTrace.o(8191039504384L, 61028);
        return;
      }
      this.pLx.add(((o)localObject).pEn);
      d.a(paramString, ((o)localObject).pEn, true, params.pEA, 0, new d.a()
      {
        public final void Ih(String paramAnonymousString)
        {
          GMTrace.i(8192113246208L, 61036);
          f.this.Io(localObject.pEn);
          GMTrace.o(8192113246208L, 61036);
        }
        
        public final void bkK()
        {
          GMTrace.i(8191844810752L, 61034);
          GMTrace.o(8191844810752L, 61034);
        }
        
        public final void bkL()
        {
          GMTrace.i(8191979028480L, 61035);
          com.tencent.mm.sdk.platformtools.w.e("AdLandingPagesPreDownloadResHelper", " pre download " + localObject.pEn + "is error");
          f.this.Io(localObject.pEn);
          GMTrace.o(8191979028480L, 61035);
        }
      });
      GMTrace.o(8191039504384L, 61028);
      return;
    }
    if (params.pEA == 45)
    {
      localObject = (p)params;
      if (In(((p)localObject).pEn))
      {
        GMTrace.o(8191039504384L, 61028);
        return;
      }
      this.pLx.add(((p)localObject).pEn);
      d.a(paramString, ((p)localObject).pEn, true, params.pEA, 0, new d.a()
      {
        public final void Ih(String paramAnonymousString)
        {
          GMTrace.i(8188086714368L, 61006);
          f.this.Io(localObject.pEn);
          GMTrace.o(8188086714368L, 61006);
        }
        
        public final void bkK()
        {
          GMTrace.i(8187818278912L, 61004);
          GMTrace.o(8187818278912L, 61004);
        }
        
        public final void bkL()
        {
          GMTrace.i(8187952496640L, 61005);
          com.tencent.mm.sdk.platformtools.w.e("AdLandingPagesPreDownloadResHelper", " pre download " + localObject.pEn + "is error");
          f.this.Io(localObject.pEn);
          GMTrace.o(8187952496640L, 61005);
        }
      });
      GMTrace.o(8191039504384L, 61028);
      return;
    }
    if (params.pEA == 61)
    {
      params = (q)params;
      if (!In(params.pEp))
      {
        localObject = new PInt();
        PInt localPInt = new PInt();
        com.tencent.mm.modelcontrol.c.Gs();
        if (com.tencent.mm.modelcontrol.c.a((PInt)localObject, localPInt))
        {
          this.pLx.add(params.pEp);
          d.a(paramString, params.pEp, true, 61, new d.a()
          {
            public final void Ih(String paramAnonymousString)
            {
              GMTrace.i(8188623585280L, 61010);
              f.this.Io(params.pEp);
              GMTrace.o(8188623585280L, 61010);
            }
            
            public final void bkK()
            {
              GMTrace.i(8188355149824L, 61008);
              GMTrace.o(8188355149824L, 61008);
            }
            
            public final void bkL()
            {
              GMTrace.i(8188489367552L, 61009);
              com.tencent.mm.sdk.platformtools.w.e("AdLandingPagesPreDownloadResHelper", " pre download " + params.pEp + "is error");
              f.this.Io(params.pEp);
              GMTrace.o(8188489367552L, 61009);
            }
          });
        }
      }
      if (!In(params.pEq))
      {
        this.pLx.add(params.pEq);
        d.a(paramString, params.pEq, true, 1000000001, 0, new d.a()
        {
          public final void Ih(String paramAnonymousString)
          {
            GMTrace.i(8189160456192L, 61014);
            f.this.Io(params.pEq);
            GMTrace.o(8189160456192L, 61014);
          }
          
          public final void bkK()
          {
            GMTrace.i(8188892020736L, 61012);
            GMTrace.o(8188892020736L, 61012);
          }
          
          public final void bkL()
          {
            GMTrace.i(8189026238464L, 61013);
            com.tencent.mm.sdk.platformtools.w.e("AdLandingPagesPreDownloadResHelper", " pre download " + params.pEq + "is error");
            f.this.Io(params.pEq);
            GMTrace.o(8189026238464L, 61013);
          }
        });
      }
      GMTrace.o(8191039504384L, 61028);
      return;
    }
    if (params.pEA == 62) {
      if (g.ut().getInt("SnsAdNativePagePreloadStreamMedia", 0) <= 0) {
        break label645;
      }
    }
    label645:
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.w.i("AdLandingPagesPreDownloadResHelper", "pre down video value: " + bool);
      localObject = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w)params;
      if ((bool) && (!In(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w)localObject).pEr)))
      {
        this.pLx.add(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w)localObject).pEr);
        d.a(paramString, ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w)localObject).pEr, true, params.pEA, new d.b()
        {
          public final void Ij(String paramAnonymousString)
          {
            GMTrace.i(8194126512128L, 61051);
            com.tencent.mm.sdk.platformtools.w.e("AdLandingPagesPreDownloadResHelper", " pre download " + localObject.pEr + "is error");
            f.this.Io(localObject.pEr);
            GMTrace.o(8194126512128L, 61051);
          }
          
          public final void Ik(String paramAnonymousString)
          {
            GMTrace.i(8194260729856L, 61052);
            f.this.Io(localObject.pEr);
            GMTrace.o(8194260729856L, 61052);
          }
        });
      }
      if (!In(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w)localObject).pEX))
      {
        this.pLx.add(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w)localObject).pEX);
        d.a("adId", ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w)localObject).pEX, true, params.pEA, 0, new d.a()
        {
          public final void Ih(String paramAnonymousString)
          {
            GMTrace.i(8203119099904L, 61118);
            f.this.Io(localObject.pEX);
            GMTrace.o(8203119099904L, 61118);
          }
          
          public final void bkK()
          {
            GMTrace.i(8202850664448L, 61116);
            GMTrace.o(8202850664448L, 61116);
          }
          
          public final void bkL()
          {
            GMTrace.i(8202984882176L, 61117);
            com.tencent.mm.sdk.platformtools.w.e("AdLandingPagesPreDownloadResHelper", " pre download " + localObject.pEX + "is error");
            f.this.Io(localObject.pEr);
            GMTrace.o(8202984882176L, 61117);
          }
        });
      }
      GMTrace.o(8191039504384L, 61028);
      return;
    }
  }
  
  public final void d(final String paramString1, String paramString2, String paramString3, int paramInt)
  {
    GMTrace.i(8191173722112L, 61029);
    Object localObject = ((ConnectivityManager)ab.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
    paramString2 = e.k(paramString2, paramString3, "", "");
    int i;
    if (paramInt == 0)
    {
      if ((localObject != null) && (((NetworkInfo)localObject).getType() == 1))
      {
        com.tencent.mm.sdk.platformtools.w.i("AdLandingPagesPreDownloadResHelper", "start pre download all resource in wifi");
        paramString2 = paramString2.iterator();
        while (paramString2.hasNext())
        {
          paramString3 = (c)paramString2.next();
          localObject = paramString3.pLi.iterator();
          while (((Iterator)localObject).hasNext()) {
            a(paramString1, (s)((Iterator)localObject).next());
          }
          Ip(paramString3.pLg);
        }
        GMTrace.o(8191173722112L, 61029);
        return;
      }
      com.tencent.mm.sdk.platformtools.w.i("AdLandingPagesPreDownloadResHelper", "start pre download resource in no wifi");
      i = g.ut().getInt("SnsAdNativePageNormalFeedPreloadPageCount", 1);
      paramInt = g.ut().getInt("SnsAdNativePageNormalFeedPreloadResourceCount", 2);
      if (paramString2.size() > 0)
      {
        paramString2 = paramString2.iterator();
        if (paramString2.hasNext())
        {
          paramString3 = (c)paramString2.next();
          Ip(paramString3.pLg);
          if ((paramInt > 0) && (i > 0))
          {
            paramString3 = paramString3.pLi.iterator();
            label233:
            if (!paramString3.hasNext()) {
              break label544;
            }
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(8187147190272L, 60999);
                f.this.a(paramString1, this.pLB);
                GMTrace.o(8187147190272L, 60999);
              }
            });
            paramInt -= 1;
            if (paramInt > 0) {
              break label541;
            }
          }
        }
      }
    }
    label409:
    label535:
    label538:
    label541:
    label544:
    for (;;)
    {
      i -= 1;
      break;
      GMTrace.o(8191173722112L, 61029);
      return;
      if (paramInt == 1)
      {
        com.tencent.mm.sdk.platformtools.w.i("AdLandingPagesPreDownloadResHelper", "start pre download first pages resource");
        if ((localObject != null) && (((NetworkInfo)localObject).getType() == 1))
        {
          com.tencent.mm.sdk.platformtools.w.i("AdLandingPagesPreDownloadResHelper", "start pre download resource in shared scene in wifi");
          i = g.ut().getInt("SnsAdNativePageForwardFeedPreloadPageCount", 1);
          paramInt = g.ut().getInt("SnsAdNativePageForwardFeedPreloadResourceCount", 2);
          if (paramString2.size() > 0)
          {
            paramString2 = paramString2.iterator();
            if (paramString2.hasNext())
            {
              paramString3 = (c)paramString2.next();
              Ip(paramString3.pLg);
              if ((paramInt > 0) && (i > 0))
              {
                paramString3 = paramString3.pLi.iterator();
                if (!paramString3.hasNext()) {
                  break label538;
                }
                af.t(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(20373848457216L, 151797);
                    f.this.a(paramString1, this.pLB);
                    GMTrace.o(20373848457216L, 151797);
                  }
                });
                paramInt -= 1;
                if (paramInt > 0) {
                  break label535;
                }
              }
            }
          }
        }
      }
      for (;;)
      {
        i -= 1;
        break;
        GMTrace.o(8191173722112L, 61029);
        return;
        com.tencent.mm.sdk.platformtools.w.i("AdLandingPagesPreDownloadResHelper", "start pre download resource in shared scene in no wifi,this can't download everything");
        paramString1 = paramString2.iterator();
        while (paramString1.hasNext()) {
          Ip(((c)paramString1.next()).pLg);
        }
        GMTrace.o(8191173722112L, 61029);
        return;
        com.tencent.mm.sdk.platformtools.w.e("AdLandingPagesPreDownloadResHelper", "the dwnloadKind is error");
        GMTrace.o(8191173722112L, 61029);
        return;
        break label409;
      }
      break label233;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
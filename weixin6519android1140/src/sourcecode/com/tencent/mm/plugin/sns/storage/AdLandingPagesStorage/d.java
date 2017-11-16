package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import android.graphics.Bitmap;
import android.os.Environment;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ac;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ac.a;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;

public final class d
{
  public static void a(String paramString, int paramInt, a parama)
  {
    GMTrace.i(8205535019008L, 61136);
    a("adId", paramString, false, paramInt, 0, parama);
    GMTrace.o(8205535019008L, 61136);
  }
  
  public static void a(final String paramString1, final String paramString2, boolean paramBoolean, int paramInt1, int paramInt2, a parama)
  {
    GMTrace.i(8205669236736L, 61137);
    if ((bg.nm(paramString2)) || (bg.nm(paramString1)))
    {
      parama.bkL();
      GMTrace.o(8205669236736L, 61137);
      return;
    }
    w.i("AdLandingPagesDownloadResourceHelper", "start download img for " + paramString2 + " for adid:" + paramString1);
    final String str = dL(paramString1, paramString2);
    new b(str, paramBoolean, paramInt1, 0, new b.a()
    {
      public final void bkK()
      {
        GMTrace.i(8192918552576L, 61042);
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8201642704896L, 61107);
            d.1.this.pLk.bkK();
            GMTrace.o(8201642704896L, 61107);
          }
        });
        GMTrace.o(8192918552576L, 61042);
      }
      
      public final void bkL()
      {
        GMTrace.i(8193052770304L, 61043);
        w.e("AdLandingPagesDownloadResourceHelper", " download error img for " + paramString2 + " for adid:" + paramString1);
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8192650117120L, 61040);
            d.1.this.pLk.bkL();
            GMTrace.o(8192650117120L, 61040);
          }
        });
        GMTrace.o(8193052770304L, 61043);
      }
      
      public final void blu()
      {
        GMTrace.i(8193186988032L, 61044);
        w.i("AdLandingPagesDownloadResourceHelper", " download success img for " + paramString2 + " for adid:" + paramString1);
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8194797600768L, 61056);
            d.1.this.pLk.Ih(d.1.this.hju);
            GMTrace.o(8194797600768L, 61056);
          }
        });
        GMTrace.o(8193186988032L, 61044);
      }
    }).execute(new String[] { paramString2 });
    GMTrace.o(8205669236736L, 61137);
  }
  
  public static void a(final String paramString1, final String paramString2, boolean paramBoolean, int paramInt, a parama)
  {
    GMTrace.i(17836059656192L, 132889);
    FileOp.la(Environment.getExternalStorageDirectory().toString() + "/tencent/MicroMsg/sns_ad_landingpages");
    aa.RP(paramString2);
    final String str = dM(paramString1, paramString2);
    if (FileOp.aZ(str))
    {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8203924406272L, 61124);
          this.pLk.Ih(str);
          GMTrace.o(8203924406272L, 61124);
        }
      });
      GMTrace.o(17836059656192L, 132889);
      return;
    }
    w.i("AdLandingPagesDownloadResourceHelper", "start download sight for " + paramString2 + " for adid:" + paramString1);
    new b(str, paramBoolean, paramInt, 0, new b.a()
    {
      public final void bkK()
      {
        GMTrace.i(8207279849472L, 61149);
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8189697327104L, 61018);
            d.3.this.pLk.bkK();
            GMTrace.o(8189697327104L, 61018);
          }
        });
        GMTrace.o(8207279849472L, 61149);
      }
      
      public final void bkL()
      {
        GMTrace.i(8207414067200L, 61150);
        w.e("AdLandingPagesDownloadResourceHelper", " download error sight for " + paramString2 + " for adid:" + paramString1);
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8290629058560L, 61770);
            d.3.this.pLk.bkL();
            GMTrace.o(8290629058560L, 61770);
          }
        });
        GMTrace.o(8207414067200L, 61150);
      }
      
      public final void blu()
      {
        GMTrace.i(8207548284928L, 61151);
        w.i("AdLandingPagesDownloadResourceHelper", " download success sight for " + paramString2 + " for adid:" + paramString1);
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8190502633472L, 61024);
            d.3.this.pLk.Ih(d.3.this.hju);
            GMTrace.o(8190502633472L, 61024);
          }
        });
        GMTrace.o(8207548284928L, 61151);
      }
    }).execute(new String[] { paramString2 });
    GMTrace.o(17836059656192L, 132889);
  }
  
  public static void a(final String paramString1, final String paramString2, boolean paramBoolean, int paramInt, b paramb)
  {
    GMTrace.i(8205937672192L, 61139);
    if ((bg.nm(paramString2)) || (bg.nm(paramString1)))
    {
      paramb.Ij("the res or adId is null");
      GMTrace.o(8205937672192L, 61139);
      return;
    }
    dL(paramString1, paramString2);
    String str1 = Environment.getExternalStorageDirectory().toString() + "/tencent/MicroMsg/sns_ad_landingpages";
    String str2 = paramString1 + "_stream_" + aa.RP(paramString2);
    w.i("AdLandingPagesDownloadResourceHelper", "start download video for " + paramString2 + " for adid:" + paramString1);
    new ac(str1, str2, paramBoolean, paramInt, 0, new ae(Looper.getMainLooper()), new ac.a()
    {
      public final void Ij(final String paramAnonymousString)
      {
        GMTrace.i(8204863930368L, 61131);
        w.e("AdLandingPagesDownloadResourceHelper", " download error video for " + paramString2 + " for adid:" + paramString1);
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8192381681664L, 61038);
            d.4.this.pLp.Ij(paramAnonymousString);
            GMTrace.o(8192381681664L, 61038);
          }
        });
        GMTrace.o(8204863930368L, 61131);
      }
      
      public final void Ik(final String paramAnonymousString)
      {
        GMTrace.i(8204998148096L, 61132);
        w.i("AdLandingPagesDownloadResourceHelper", " download success video for " + paramString2 + " for adid:" + paramString1);
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8189965762560L, 61020);
            d.4.this.pLp.Ik(paramAnonymousString);
            GMTrace.o(8189965762560L, 61020);
          }
        });
        GMTrace.o(8204998148096L, 61132);
      }
      
      public final void bR(final String paramAnonymousString, final int paramAnonymousInt)
      {
        GMTrace.i(8204729712640L, 61130);
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8190234198016L, 61022);
            GMTrace.o(8190234198016L, 61022);
          }
        });
        GMTrace.o(8204729712640L, 61130);
      }
    }).execute(new String[] { paramString2 });
    GMTrace.o(8205937672192L, 61139);
  }
  
  public static String dL(String paramString1, String paramString2)
  {
    GMTrace.i(8205132365824L, 61133);
    paramString2 = aa.RP(paramString2);
    paramString1 = Environment.getExternalStorageDirectory().toString() + "/tencent/MicroMsg/sns_ad_landingpages/" + paramString1 + "_img_" + paramString2;
    GMTrace.o(8205132365824L, 61133);
    return paramString1;
  }
  
  public static String dM(String paramString1, String paramString2)
  {
    GMTrace.i(17835925438464L, 132888);
    FileOp.la(Environment.getExternalStorageDirectory().toString() + "/tencent/MicroMsg/sns_ad_landingpages");
    paramString2 = aa.RP(paramString2);
    paramString1 = Environment.getExternalStorageDirectory().toString() + "/tencent/MicroMsg/sns_ad_landingpages/" + paramString1 + "_sight_" + paramString2;
    GMTrace.o(17835925438464L, 132888);
    return paramString1;
  }
  
  public static Bitmap dN(String paramString1, String paramString2)
  {
    GMTrace.i(8205400801280L, 61135);
    if ((bg.nm(paramString2)) || (bg.nm(paramString1)))
    {
      GMTrace.o(8205400801280L, 61135);
      return null;
    }
    try
    {
      paramString1 = dL(paramString1, paramString2);
      if ((!TextUtils.isEmpty(paramString1)) && (new File(paramString1).exists()))
      {
        paramString1 = MMBitmapFactory.decodeFile(paramString1);
        GMTrace.o(8205400801280L, 61135);
        return paramString1;
      }
    }
    catch (Exception paramString1)
    {
      w.e("AdLandingPagesDownloadResourceHelper", "%s", new Object[] { bg.f(paramString1) });
      GMTrace.o(8205400801280L, 61135);
    }
    return null;
  }
  
  public static abstract interface a
  {
    public abstract void Ih(String paramString);
    
    public abstract void bkK();
    
    public abstract void bkL();
  }
  
  public static abstract interface b
  {
    public abstract void Ij(String paramString);
    
    public abstract void Ik(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
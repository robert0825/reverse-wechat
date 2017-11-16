package com.tencent.mm.plugin.ext.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.network.e;
import com.tencent.mm.plugin.x.a.a;
import com.tencent.mm.plugin.x.a.a.a;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.f.a.b;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bf;
import com.tencent.mm.y.bf.a;
import java.util.HashMap;

@JgClassChecked(author=32, fComment="checked", lastDate="20141016", reviewer=20, vComment={com.jg.EType.PROVIDERCHECK})
public class ExtContentProviderBase
  extends ContentProvider
{
  protected static boolean jjr;
  private static HashMap<String, Long> kMU;
  public MatrixCursor jjo;
  private long kMP;
  private String kMQ;
  public String kMR;
  private String[] kMS;
  private int kMT;
  
  static
  {
    GMTrace.i(5735123517440L, 42730);
    jjr = false;
    kMU = new HashMap();
    GMTrace.o(5735123517440L, 42730);
  }
  
  public ExtContentProviderBase()
  {
    GMTrace.i(5732304945152L, 42709);
    this.jjo = new MatrixCursor(new String[0]);
    this.kMP = bg.Pw();
    this.kMR = "";
    this.kMT = 0;
    GMTrace.o(5732304945152L, 42709);
  }
  
  private int avs()
  {
    GMTrace.i(5733647122432L, 42719);
    int i = (int)bg.aI(this.kMP);
    GMTrace.o(5733647122432L, 42719);
    return i;
  }
  
  private void co(Context paramContext)
  {
    GMTrace.i(5734855081984L, 42728);
    if (paramContext == null)
    {
      w.w("MicroMsg.ExtContentProviderBase", "in initCallerPkgName(), context == null");
      GMTrace.o(5734855081984L, 42728);
      return;
    }
    w.i("MicroMsg.ExtContentProviderBase", "Binder.getCallingUid() = " + Binder.getCallingUid());
    this.kMS = paramContext.getPackageManager().getPackagesForUid(Binder.getCallingUid());
    if (this.kMS == null) {
      w.w("MicroMsg.ExtContentProviderBase", "m_pkgs == null");
    }
    GMTrace.o(5734855081984L, 42728);
  }
  
  private static String f(Uri paramUri)
  {
    GMTrace.i(5734452428800L, 42725);
    if (paramUri == null)
    {
      GMTrace.o(5734452428800L, 42725);
      return "";
    }
    paramUri = bg.nl(paramUri.getQueryParameter("appid"));
    GMTrace.o(5734452428800L, 42725);
    return paramUri;
  }
  
  public final void A(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(5733512904704L, 42718);
    w.i("MicroMsg.ExtContentProviderBase", "callingPkg = %s, appID = %s, apiID = %s, result = %s, timeCost = %s", new Object[] { avt(), this.kMR, Integer.valueOf(this.kMT), Integer.valueOf(paramInt2), Integer.valueOf(avs()) });
    com.tencent.mm.plugin.report.service.g.ork.i(10505, new Object[] { avt(), this.kMR, Integer.valueOf(this.kMT), Integer.valueOf(paramInt2), Integer.valueOf(avs()), Integer.valueOf(paramInt3) });
    com.tencent.mm.plugin.report.service.g.ork.a(300L, paramInt1, 1L, false);
    GMTrace.o(5733512904704L, 42718);
  }
  
  protected final void a(Uri paramUri, Context paramContext, int paramInt)
  {
    GMTrace.i(5733915557888L, 42721);
    this.kMR = f(paramUri);
    co(paramContext);
    this.kMT = paramInt;
    this.kMP = bg.Pw();
    GMTrace.o(5733915557888L, 42721);
  }
  
  public final void a(Uri paramUri, Context paramContext, int paramInt, String[] paramArrayOfString)
  {
    GMTrace.i(5734049775616L, 42722);
    this.kMR = f(paramUri);
    if (paramArrayOfString == null) {
      co(paramContext);
    }
    for (;;)
    {
      this.kMT = paramInt;
      this.kMP = bg.Pw();
      GMTrace.o(5734049775616L, 42722);
      return;
      this.kMS = paramArrayOfString;
    }
  }
  
  protected final void a(Uri paramUri, Context paramContext, UriMatcher paramUriMatcher)
  {
    GMTrace.i(5733781340160L, 42720);
    this.kMR = f(paramUri);
    co(paramContext);
    if (paramUriMatcher != null)
    {
      this.kMT = paramUriMatcher.match(paramUri);
      if (this.kMT < 0) {
        this.kMT = 0;
      }
    }
    this.kMP = bg.Pw();
    GMTrace.o(5733781340160L, 42720);
  }
  
  public final boolean agO()
  {
    GMTrace.i(5734318211072L, 42724);
    try
    {
      w.i("MicroMsg.ExtContentProviderBase", "checkIsLogin()");
      if (!jjr)
      {
        final b localb = new b();
        localb.b(4000L, new Runnable()
        {
          public final void run()
          {
            GMTrace.i(5729083719680L, 42685);
            try
            {
              boolean bool = at.AU();
              if (!bool)
              {
                GMTrace.o(5729083719680L, 42685);
                return;
              }
              at.wS().a(new bf(new bf.a()
              {
                public final void a(e paramAnonymous2e)
                {
                  GMTrace.i(5726936236032L, 42669);
                  w.i("MicroMsg.ExtContentProviderBase", "checkIsLogin() onSceneEnd()");
                  ExtContentProviderBase.1.this.jjy.countDown();
                  GMTrace.o(5726936236032L, 42669);
                }
              }), 0);
              GMTrace.o(5729083719680L, 42685);
              return;
            }
            catch (Exception localException)
            {
              w.e("MicroMsg.ExtContentProviderBase", "exception in NetSceneLocalProxy");
              localb.countDown();
              GMTrace.o(5729083719680L, 42685);
            }
          }
        });
      }
      if ((at.AU()) && (at.AT()) && (!at.wF())) {}
      for (jjr = true;; jjr = false)
      {
        w.i("MicroMsg.ExtContentProviderBase", "hasLogin = " + jjr);
        boolean bool = jjr;
        GMTrace.o(5734318211072L, 42724);
        return bool;
      }
      return false;
    }
    catch (Exception localException)
    {
      w.w("MicroMsg.ExtContentProviderBase", localException.getMessage());
      w.printErrStackTrace("MicroMsg.ExtContentProviderBase", localException, "", new Object[0]);
      GMTrace.o(5734318211072L, 42724);
    }
  }
  
  public final String avt()
  {
    GMTrace.i(5734183993344L, 42723);
    if (!bg.nm(this.kMQ))
    {
      str = this.kMQ;
      GMTrace.o(5734183993344L, 42723);
      return str;
    }
    if ((this.kMS == null) || (this.kMS.length <= 0))
    {
      GMTrace.o(5734183993344L, 42723);
      return "";
    }
    String str = this.kMS[0];
    GMTrace.o(5734183993344L, 42723);
    return str;
  }
  
  public final int avu()
  {
    GMTrace.i(5734720864256L, 42727);
    if (bg.nm(this.kMR))
    {
      w.e("MicroMsg.ExtContentProviderBase", "invalid appid, ignore");
      GMTrace.o(5734720864256L, 42727);
      return 7;
    }
    if ((this.kMS == null) || (this.kMS.length <= 0))
    {
      w.e("MicroMsg.ExtContentProviderBase", "packageList is null");
      GMTrace.o(5734720864256L, 42727);
      return 6;
    }
    for (;;)
    {
      try
      {
        localf = com.tencent.mm.pluginsdk.model.app.g.aP(this.kMR, true);
        if (localf == null)
        {
          w.w("MicroMsg.ExtContentProviderBase", "app not reg, do nothing");
          GMTrace.o(5734720864256L, 42727);
          return 13;
        }
        if (localf.field_status == 3)
        {
          w.e("MicroMsg.ExtContentProviderBase", "app is in blacklist.pkg:%s", new Object[] { localf.field_packageName });
          i = 10;
          k = i;
        }
      }
      catch (Exception localException2)
      {
        f localf;
        int k;
        Object localObject1;
        Object localObject2;
        int i = 0;
        continue;
        int j = 0;
        continue;
        i += 1;
        continue;
      }
      try
      {
        localObject1 = Long.valueOf(bg.a((Long)kMU.get(this.kMR), 0L));
        k = i;
        w.i("MicroMsg.ExtContentProviderBase", "lastCheckTime = %s, current = %s", new Object[] { localObject1, Long.valueOf(System.currentTimeMillis()) });
        k = i;
        if (System.currentTimeMillis() - ((Long)localObject1).longValue() > 3600000L)
        {
          k = i;
          w.i("MicroMsg.ExtContentProviderBase", "update appInfo %s", new Object[] { this.kMR });
          k = i;
          a.a.aWD().Eu(this.kMR);
          k = i;
          kMU.put(this.kMR, Long.valueOf(System.currentTimeMillis()));
        }
        GMTrace.o(5734720864256L, 42727);
        return i;
        localObject1 = this.kMS;
        j = localObject1.length;
        i = 0;
        if (i < j)
        {
          localObject2 = localObject1[i];
          if ((!((String)localObject2).equals(localf.field_packageName)) || (!p.b(ab.getContext(), localf, (String)localObject2))) {
            continue;
          }
          w.i("MicroMsg.ExtContentProviderBase", "check app success, calling package name = %s", new Object[] { localObject2 });
        }
      }
      catch (Exception localException1)
      {
        try
        {
          this.kMQ = ((String)localObject2);
          j = 1;
          i = j;
          if (j != 1) {
            continue;
          }
          k = j;
          localObject2 = (Integer)b.b.tlL.get(Integer.valueOf(this.kMT));
          localObject1 = localObject2;
          if (localObject2 == null)
          {
            k = j;
            bY(5, 16);
            k = j;
            w.i("MicroMsg.ExtContentProviderBase", "api flag = null");
            k = j;
            localObject1 = Integer.valueOf(64);
          }
          k = j;
          if (!com.tencent.mm.pluginsdk.model.app.g.a(localf, ((Integer)localObject1).intValue()))
          {
            i = 11;
            continue;
          }
          k = j;
          w.e("MicroMsg.ExtContentProviderBase", "appInfoFlag not set");
          i = j;
        }
        catch (Exception localException3)
        {
          i = 1;
          continue;
        }
        localException1 = localException1;
        i = k;
        w.e("MicroMsg.ExtContentProviderBase", "Exception in isAppidValid, %s", new Object[] { localException1.getMessage() });
        w.printErrStackTrace("MicroMsg.ExtContentProviderBase", localException1, "", new Object[0]);
      }
    }
  }
  
  public final void bY(int paramInt1, int paramInt2)
  {
    GMTrace.i(5733378686976L, 42717);
    w.i("MicroMsg.ExtContentProviderBase", "callingPkg = %s, appID = %s, apiID = %s, result = %s, timeCost = %s", new Object[] { avt(), this.kMR, Integer.valueOf(this.kMT), Integer.valueOf(paramInt1), Integer.valueOf(avs()) });
    com.tencent.mm.plugin.report.service.g.ork.i(10505, new Object[] { avt(), this.kMR, Integer.valueOf(this.kMT), Integer.valueOf(paramInt1), Integer.valueOf(avs()), Integer.valueOf(paramInt2) });
    GMTrace.o(5733378686976L, 42717);
  }
  
  public final boolean cn(Context paramContext)
  {
    GMTrace.i(5734586646528L, 42726);
    if (paramContext == null)
    {
      w.w("MicroMsg.ExtContentProviderBase", "in checkAppId(), context == null");
      GMTrace.o(5734586646528L, 42726);
      return false;
    }
    if (bg.nm(this.kMR))
    {
      w.e("MicroMsg.ExtContentProviderBase", "invalid appid, ignore");
      GMTrace.o(5734586646528L, 42726);
      return false;
    }
    if ((this.kMS == null) || (this.kMS.length <= 0))
    {
      w.e("MicroMsg.ExtContentProviderBase", "packageList is null");
      GMTrace.o(5734586646528L, 42726);
      return false;
    }
    bool2 = false;
    boolean bool4 = false;
    boolean bool3 = false;
    bool1 = bool4;
    for (;;)
    {
      try
      {
        localf = com.tencent.mm.pluginsdk.model.app.g.aP(this.kMR, true);
        if (localf == null)
        {
          bool1 = bool4;
          w.w("MicroMsg.ExtContentProviderBase", "app not reg, do nothing");
          GMTrace.o(5734586646528L, 42726);
          return false;
        }
        bool1 = bool4;
        if (localf.field_status != 3) {
          continue;
        }
        bool1 = bool4;
        w.e("MicroMsg.ExtContentProviderBase", "app is in blacklist.pkg:%s", new Object[] { localf.field_packageName });
        bool2 = bool3;
        bool1 = bool2;
        paramContext = Long.valueOf(bg.a((Long)kMU.get(this.kMR), 0L));
        bool1 = bool2;
        w.i("MicroMsg.ExtContentProviderBase", "lastCheckTime = %s, current = %s", new Object[] { paramContext, Long.valueOf(System.currentTimeMillis()) });
        bool1 = bool2;
        if (System.currentTimeMillis() - paramContext.longValue() > 3600000L)
        {
          bool1 = bool2;
          w.i("MicroMsg.ExtContentProviderBase", "update appInfo %s", new Object[] { this.kMR });
          bool1 = bool2;
          a.a.aWD().Eu(this.kMR);
          bool1 = bool2;
          kMU.put(this.kMR, Long.valueOf(System.currentTimeMillis()));
        }
      }
      catch (Exception paramContext)
      {
        f localf;
        int j;
        int i;
        Object localObject;
        w.e("MicroMsg.ExtContentProviderBase", "Exception in isAppidValid, %s", new Object[] { paramContext.getMessage() });
        w.printErrStackTrace("MicroMsg.ExtContentProviderBase", paramContext, "", new Object[0]);
        bool2 = bool1;
        continue;
        i += 1;
        continue;
      }
      GMTrace.o(5734586646528L, 42726);
      return bool2;
      bool1 = bool4;
      paramContext = this.kMS;
      bool1 = bool4;
      j = paramContext.length;
      i = 0;
      bool3 = bool2;
      if (i < j)
      {
        localObject = paramContext[i];
        bool1 = bool4;
        if (!((String)localObject).equals(localf.field_packageName)) {
          continue;
        }
        bool1 = bool4;
        if (!p.b(ab.getContext(), localf, (String)localObject)) {
          continue;
        }
        bool1 = bool4;
        w.i("MicroMsg.ExtContentProviderBase", "check app success, calling package name = %s", new Object[] { localObject });
        bool1 = true;
        bool3 = true;
        this.kMQ = ((String)localObject);
      }
      bool2 = bool3;
      if (bool3)
      {
        bool1 = bool3;
        localObject = (Integer)b.b.tlL.get(Integer.valueOf(this.kMT));
        paramContext = (Context)localObject;
        if (localObject == null)
        {
          bool1 = bool3;
          paramContext = Integer.valueOf(64);
        }
        bool1 = bool3;
        if (!com.tencent.mm.pluginsdk.model.app.g.a(localf, paramContext.intValue()))
        {
          bool2 = false;
        }
        else
        {
          bool1 = bool3;
          w.e("MicroMsg.ExtContentProviderBase", "appInfoFlag not set");
          bool2 = bool3;
        }
      }
    }
  }
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    GMTrace.i(5732976033792L, 42714);
    GMTrace.o(5732976033792L, 42714);
    return 0;
  }
  
  public String getType(Uri paramUri)
  {
    GMTrace.i(5732707598336L, 42712);
    GMTrace.o(5732707598336L, 42712);
    return null;
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    GMTrace.i(5732841816064L, 42713);
    GMTrace.o(5732841816064L, 42713);
    return null;
  }
  
  public final void nl(int paramInt)
  {
    GMTrace.i(5733244469248L, 42716);
    w.i("MicroMsg.ExtContentProviderBase", "callingPkg = %s, appID = %s, apiID = %s, result = %s, timeCost = %s", new Object[] { avt(), this.kMR, Integer.valueOf(this.kMT), Integer.valueOf(paramInt), Integer.valueOf(avs()) });
    com.tencent.mm.plugin.report.service.g.ork.i(10505, new Object[] { avt(), this.kMR, Integer.valueOf(this.kMT), Integer.valueOf(paramInt), Integer.valueOf(avs()) });
    GMTrace.o(5733244469248L, 42716);
  }
  
  public boolean onCreate()
  {
    GMTrace.i(5732439162880L, 42710);
    GMTrace.o(5732439162880L, 42710);
    return true;
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    GMTrace.i(5732573380608L, 42711);
    GMTrace.o(5732573380608L, 42711);
    return null;
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    GMTrace.i(5733110251520L, 42715);
    GMTrace.o(5733110251520L, 42715);
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\ext\provider\ExtContentProviderBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
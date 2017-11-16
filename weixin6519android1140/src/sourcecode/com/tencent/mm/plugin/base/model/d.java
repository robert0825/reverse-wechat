package com.tencent.mm.plugin.base.model;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.ac.h;
import com.tencent.mm.ac.i;
import com.tencent.mm.ac.n;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.ak.b.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class d
{
  public static List<com.tencent.mm.ac.d.a> jiT;
  
  static
  {
    GMTrace.i(12826651394048L, 95566);
    jiT = new LinkedList();
    GMTrace.o(12826651394048L, 95566);
  }
  
  public static Bitmap L(Context paramContext, String paramString)
  {
    GMTrace.i(12825577652224L, 95558);
    paramString = com.tencent.mm.ac.b.a(paramString, false, -1);
    if ((paramString != null) && (!paramString.isRecycled()))
    {
      int i = (int)(paramContext.getResources().getDisplayMetrics().density * 48.0F);
      paramContext = Bitmap.createScaledBitmap(paramString, i, i, false);
      GMTrace.o(12825577652224L, 95558);
      return paramContext;
    }
    GMTrace.o(12825577652224L, 95558);
    return paramString;
  }
  
  private static boolean M(Context paramContext, String paramString)
  {
    GMTrace.i(12826248740864L, 95563);
    label238:
    for (;;)
    {
      try
      {
        ContentResolver localContentResolver = paramContext.getContentResolver();
        paramContext = paramContext.getPackageManager().getInstalledPackages(8);
        if (paramContext != null)
        {
          paramContext = paramContext.iterator();
          if (paramContext.hasNext())
          {
            ProviderInfo[] arrayOfProviderInfo = ((PackageInfo)paramContext.next()).providers;
            if (arrayOfProviderInfo == null) {
              continue;
            }
            int j = arrayOfProviderInfo.length;
            int i = 0;
            if (i < j)
            {
              ProviderInfo localProviderInfo = arrayOfProviderInfo[i];
              if ("com.android.launcher.permission.READ_SETTINGS".equals(localProviderInfo.readPermission))
              {
                paramContext = localProviderInfo.authority;
                paramContext = localContentResolver.query(Uri.parse("content://" + paramContext + "/favorites?notify=true"), new String[] { "title", "iconResource" }, "title=?", new String[] { paramString }, null);
                if (paramContext == null) {
                  break label238;
                }
                if (paramContext.getCount() <= 0) {
                  continue;
                }
                bool = true;
                paramContext.close();
                GMTrace.o(12826248740864L, 95563);
                return bool;
              }
              if ("com.android.launcher.permission.READ_SETTINGS".equals(localProviderInfo.writePermission))
              {
                paramContext = localProviderInfo.authority;
                continue;
              }
              i += 1;
              continue;
            }
            continue;
          }
        }
        paramContext = null;
        continue;
        boolean bool = false;
        continue;
        bool = false;
      }
      catch (Exception paramContext)
      {
        GMTrace.o(12826248740864L, 95563);
        return false;
      }
    }
  }
  
  public static Intent a(Context paramContext, String paramString1, String paramString2, String paramString3, Bitmap paramBitmap, boolean paramBoolean)
  {
    GMTrace.i(12825846087680L, 95560);
    w.i("MicroMsg.WebviewShrotcutManager", "buildIntent, install = %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if ((paramBitmap == null) && (paramBoolean))
    {
      w.e("MicroMsg.WebviewShrotcutManager", "no bmp");
      GMTrace.o(12825846087680L, 95560);
      return null;
    }
    String str = tw(paramString1);
    if (bg.nm(str))
    {
      GMTrace.o(12825846087680L, 95560);
      return null;
    }
    if (paramBoolean) {}
    for (Object localObject = "com.android.launcher.action.INSTALL_SHORTCUT";; localObject = "com.android.launcher.action.UNINSTALL_SHORTCUT")
    {
      Intent localIntent = new Intent((String)localObject);
      localIntent.putExtra("android.intent.extra.shortcut.NAME", paramString3);
      localIntent.putExtra("duplicate", false);
      localObject = "";
      h localh = n.Di().ig(paramString1);
      paramString1 = (String)localObject;
      if (localh != null) {
        paramString1 = g.n((paramString3 + localh.Dp()).getBytes());
      }
      localObject = new Intent("com.tencent.mm.action.WX_SHORTCUT");
      ((Intent)localObject).putExtra("type", 2);
      ((Intent)localObject).putExtra("id", str);
      ((Intent)localObject).putExtra("ext_info", tw(paramString2));
      ((Intent)localObject).putExtra("ext_info_1", tw(paramString3));
      paramString3 = new StringBuilder();
      at.AR();
      ((Intent)localObject).putExtra("token", bu(paramString2, c.ww()));
      ((Intent)localObject).putExtra("digest", paramString1);
      ((Intent)localObject).setPackage(paramContext.getPackageName());
      ((Intent)localObject).addFlags(67108864);
      localIntent.putExtra("android.intent.extra.shortcut.INTENT", (Parcelable)localObject);
      localIntent.putExtra("android.intent.extra.shortcut.ICON", paramBitmap);
      GMTrace.o(12825846087680L, 95560);
      return localIntent;
    }
  }
  
  public static void a(final Context paramContext, final String paramString1, final String paramString2, a parama)
  {
    GMTrace.i(12825309216768L, 95556);
    if ((paramContext == null) || (bg.nm(paramString1)))
    {
      w.e("MicroMsg.WebviewShrotcutManager", "context or username is null");
      if (parama != null) {
        parama.dk(false);
      }
      GMTrace.o(12825309216768L, 95556);
      return;
    }
    w.d("MicroMsg.WebviewShrotcutManager", "addShortcut, username = %s", new Object[] { paramString1 });
    if ((!at.AU()) || (at.wF()))
    {
      w.e("MicroMsg.WebviewShrotcutManager", "acc not ready");
      if (parama != null) {
        parama.dk(false);
      }
      GMTrace.o(12825309216768L, 95556);
      return;
    }
    at.AR();
    x localx = c.yK().TE(paramString1);
    String str = "";
    if (localx != null) {
      str = localx.vj();
    }
    if (bg.nm(str))
    {
      w.e("MicroMsg.WebviewShrotcutManager", "displayname is nil, should pull from service");
      ak.a.gmX.a(paramString1, "", new ak.b.a()
      {
        public final void r(String paramAnonymousString, boolean paramAnonymousBoolean)
        {
          GMTrace.i(12823430168576L, 95542);
          w.i("MicroMsg.WebviewShrotcutManager", "getContactCallBack, suc = %b", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
          if (!paramAnonymousBoolean)
          {
            if (this.jiU != null)
            {
              this.jiU.dk(false);
              GMTrace.o(12823430168576L, 95542);
            }
          }
          else
          {
            at.AR();
            paramAnonymousString = c.yK().TE(paramString1);
            if ((paramAnonymousString == null) || (bg.nm(paramAnonymousString.vj())))
            {
              if (this.jiU != null)
              {
                this.jiU.dk(false);
                GMTrace.o(12823430168576L, 95542);
              }
            }
            else {
              d.a(paramContext, paramString1, paramString2, paramAnonymousString.vj(), this.jiU);
            }
          }
          GMTrace.o(12823430168576L, 95542);
        }
      });
      GMTrace.o(12825309216768L, 95556);
      return;
    }
    a(paramContext, paramString1, paramString2, str, parama);
    GMTrace.o(12825309216768L, 95556);
  }
  
  public static void a(final Context paramContext, final String paramString1, final String paramString2, final String paramString3, final a parama)
  {
    GMTrace.i(12825443434496L, 95557);
    if (M(paramContext, paramString3))
    {
      w.i("MicroMsg.WebviewShrotcutManager", "shortcut has exist");
      if (parama != null) {
        parama.dk(true);
      }
      GMTrace.o(12825443434496L, 95557);
      return;
    }
    com.tencent.mm.ac.d.a local2 = new com.tencent.mm.ac.d.a()
    {
      public final void ib(String paramAnonymousString)
      {
        GMTrace.i(12823698604032L, 95544);
        if (!this.gsk.equals(paramAnonymousString))
        {
          GMTrace.o(12823698604032L, 95544);
          return;
        }
        w.i("MicroMsg.WebviewShrotcutManager", "notifyChanged avatar(%s).", new Object[] { paramAnonymousString });
        d.jiT.remove(this);
        n.Dh().b(this);
        paramAnonymousString = d.L(paramContext, this.gsk);
        if ((paramAnonymousString == null) || (paramAnonymousString.isRecycled()))
        {
          if (parama != null)
          {
            parama.dk(false);
            GMTrace.o(12823698604032L, 95544);
          }
        }
        else
        {
          paramAnonymousString = d.a(paramContext, this.gsk, paramString2, paramString3, paramAnonymousString, true);
          if (paramAnonymousString == null)
          {
            w.e("MicroMsg.WebviewShrotcutManager", "intent is null");
            if (parama != null)
            {
              parama.dk(false);
              GMTrace.o(12823698604032L, 95544);
            }
          }
          else
          {
            b.n(paramContext, paramAnonymousString);
            if (parama != null) {
              parama.dk(true);
            }
          }
        }
        GMTrace.o(12823698604032L, 95544);
      }
    };
    jiT.add(local2);
    n.Dh().a(local2);
    Bitmap localBitmap = L(paramContext, paramString1);
    if ((localBitmap == null) || (localBitmap.isRecycled()))
    {
      w.e("MicroMsg.WebviewShrotcutManager", "getAvatarBitmap fail, bmp is null, start timer.");
      new aj(new b(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(12823161733120L, 95540);
          w.i("MicroMsg.WebviewShrotcutManager", "expired");
          if (d.jiT.contains(this.jiX))
          {
            d.jiT.remove(this.jiX);
            n.Dh().b(this.jiX);
            if (parama != null) {
              parama.dk(false);
            }
          }
          GMTrace.o(12823161733120L, 95540);
        }
      }), false).z(5000L, 5000L);
      GMTrace.o(12825443434496L, 95557);
      return;
    }
    jiT.remove(local2);
    n.Dh().b(local2);
    paramString1 = a(paramContext, paramString1, paramString2, paramString3, localBitmap, true);
    if (paramString1 == null)
    {
      w.e("MicroMsg.WebviewShrotcutManager", "intent is null");
      if (parama != null) {
        parama.dk(false);
      }
      GMTrace.o(12825443434496L, 95557);
      return;
    }
    b.n(paramContext, paramString1);
    if (parama != null) {
      parama.dk(true);
    }
    GMTrace.o(12825443434496L, 95557);
  }
  
  public static String bu(String paramString1, String paramString2)
  {
    GMTrace.i(12826114523136L, 95562);
    paramString1 = g.n((g.n(paramString1.getBytes()) + b.bt(paramString2, paramString1)).getBytes());
    GMTrace.o(12826114523136L, 95562);
    return paramString1;
  }
  
  public static void c(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(12825711869952L, 95559);
    if ((paramContext == null) || (bg.nm(paramString3))) {
      w.e("MicroMsg.WebviewShrotcutManager", "remove failed, invalid params");
    }
    paramString1 = a(paramContext, paramString1, paramString2, paramString3, null, false);
    if (paramString1 == null)
    {
      w.e("MicroMsg.WebviewShrotcutManager", "remove failed, intent is null");
      GMTrace.o(12825711869952L, 95559);
      return;
    }
    b.o(paramContext, paramString1);
    GMTrace.o(12825711869952L, 95559);
  }
  
  private static String tw(String paramString)
  {
    GMTrace.i(12825980305408L, 95561);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      GMTrace.o(12825980305408L, 95561);
      return null;
    }
    paramString = b.bt(paramString, p.sZ());
    if (bg.nm(paramString))
    {
      GMTrace.o(12825980305408L, 95561);
      return null;
    }
    paramString = "shortcut_" + b.W(paramString.getBytes());
    GMTrace.o(12825980305408L, 95561);
    return paramString;
  }
  
  public static abstract interface a
  {
    public abstract void dk(boolean paramBoolean);
  }
  
  private static final class b
    implements aj.a
  {
    private Runnable hdZ;
    
    b(Runnable paramRunnable)
    {
      GMTrace.i(12821282684928L, 95526);
      this.hdZ = paramRunnable;
      GMTrace.o(12821282684928L, 95526);
    }
    
    public final boolean pM()
    {
      GMTrace.i(12821416902656L, 95527);
      if (this.hdZ != null) {
        this.hdZ.run();
      }
      GMTrace.o(12821416902656L, 95527);
      return false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\base\model\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
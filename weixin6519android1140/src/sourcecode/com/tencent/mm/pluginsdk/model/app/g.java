package com.tencent.mm.pluginsdk.model.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.c;
import com.tencent.mm.ipcinvoker.k;
import com.tencent.mm.opensdk.channel.MMessageActV2;
import com.tencent.mm.opensdk.channel.MMessageActV2.Args;
import com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.comm.a.b;
import com.tencent.mm.plugin.comm.a.d;
import com.tencent.mm.plugin.comm.a.e;
import com.tencent.mm.plugin.comm.a.f;
import com.tencent.mm.plugin.comm.a.h;
import com.tencent.mm.plugin.x.a.a.a;
import com.tencent.mm.pluginsdk.b.a;
import com.tencent.mm.pluginsdk.ui.applet.o.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class g
{
  public static f Et(String paramString)
  {
    GMTrace.i(779939217408L, 5811);
    paramString = aP(paramString, true);
    GMTrace.o(779939217408L, 5811);
    return paramString;
  }
  
  public static boolean N(Context paramContext, int paramInt)
  {
    GMTrace.i(780744523776L, 5817);
    Long localLong = b.a.NU(String.valueOf(paramInt));
    if (localLong == null)
    {
      GMTrace.o(780744523776L, 5817);
      return false;
    }
    if (b(paramContext, localLong.longValue(), true).size() == 0)
    {
      GMTrace.o(780744523776L, 5817);
      return false;
    }
    GMTrace.o(780744523776L, 5817);
    return true;
  }
  
  public static boolean Oq(String paramString)
  {
    GMTrace.i(782086701056L, 5827);
    if (bg.nm(paramString))
    {
      GMTrace.o(782086701056L, 5827);
      return false;
    }
    f localf = aP(paramString, true);
    if (localf == null)
    {
      w.w("MicroMsg.AppInfoLogic", "app is null, appId = " + paramString);
      GMTrace.o(782086701056L, 5827);
      return false;
    }
    if (localf.field_authFlag == 0)
    {
      GMTrace.o(782086701056L, 5827);
      return true;
    }
    if ((localf.field_authFlag & 0x2) > 0)
    {
      GMTrace.o(782086701056L, 5827);
      return true;
    }
    GMTrace.o(782086701056L, 5827);
    return false;
  }
  
  public static boolean Or(String paramString)
  {
    GMTrace.i(782623571968L, 5831);
    if (bg.nm(paramString))
    {
      GMTrace.o(782623571968L, 5831);
      return false;
    }
    paramString = aP(paramString, true);
    if ((paramString == null) || (bg.nm(paramString.field_appId)))
    {
      GMTrace.o(782623571968L, 5831);
      return false;
    }
    if (paramString.field_appId.equals("wx7fa037cc7dfabad5"))
    {
      GMTrace.o(782623571968L, 5831);
      return true;
    }
    if ((paramString.field_appInfoFlag & 0x8) > 0)
    {
      GMTrace.o(782623571968L, 5831);
      return true;
    }
    GMTrace.o(782623571968L, 5831);
    return false;
  }
  
  private static boolean Os(String paramString)
  {
    GMTrace.i(783965749248L, 5841);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(783965749248L, 5841);
      return false;
    }
    HashSet localHashSet = new HashSet();
    Object localObject = com.tencent.mm.ipcinvoker.e.a("com.tencent.mm", null, b.class);
    if (localObject == null) {
      w.i("MicroMsg.AppInfoLogic", "get notAskPkg list return null.");
    }
    while (localHashSet.contains(paramString))
    {
      GMTrace.o(783965749248L, 5841);
      return true;
      localObject = ((Bundle)localObject).getString("notAskPkg", "").split("\\|");
      if ((localObject != null) && (localObject.length > 0))
      {
        int i = 0;
        while (i < localObject.length)
        {
          if (!TextUtils.isEmpty(localObject[i])) {
            localHashSet.add(localObject[i]);
          }
          i += 1;
        }
      }
    }
    GMTrace.o(783965749248L, 5841);
    return false;
  }
  
  public static void Ot(String paramString)
  {
    GMTrace.i(16011369644032L, 119294);
    if (TextUtils.isEmpty(paramString))
    {
      w.i("MicroMsg.AppInfoLogic", "addLaunchAppNotAskAppId failed, pkg is null or nil.");
      GMTrace.o(16011369644032L, 119294);
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putString("notAskPkg", paramString);
    com.tencent.mm.ipcinvoker.e.a("com.tencent.mm", localBundle, a.class, null);
    GMTrace.o(16011369644032L, 119294);
  }
  
  private static com.tencent.mm.ui.base.i a(Context paramContext, String paramString1, String paramString2, String paramString3, o.a parama1, o.a parama2)
  {
    GMTrace.i(18728875982848L, 139541);
    final Object localObject = new i.a(paramContext);
    ((i.a)localObject).lz(false);
    ((i.a)localObject).lA(false);
    ((i.a)localObject).bZC();
    localObject = ((i.a)localObject).aax();
    ((com.tencent.mm.ui.base.i)localObject).a(paramString3, true, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(806916980736L, 6012);
        if (this.tnN != null) {
          this.tnN.a(true, localObject.bZA(), localObject.bZB());
        }
        GMTrace.o(806916980736L, 6012);
      }
    });
    ((com.tencent.mm.ui.base.i)localObject).b(paramString2, false, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(775241596928L, 5776);
        if (this.tnP != null) {
          this.tnP.a(false, null, 0);
        }
        localObject.dismiss();
        GMTrace.o(775241596928L, 5776);
      }
    });
    ((com.tencent.mm.ui.base.i)localObject).BM(paramContext.getResources().getColor(a.b.aNQ));
    paramContext = ((com.tencent.mm.ui.base.i)localObject).getLayoutInflater().inflate(a.f.kbw, (ViewGroup)((com.tencent.mm.ui.base.i)localObject).getContentView(), false);
    ((TextView)paramContext.findViewById(a.e.bOG)).setText(paramString1);
    ((com.tencent.mm.ui.base.i)localObject).H(paramContext, -1);
    ((com.tencent.mm.ui.base.i)localObject).show();
    GMTrace.o(18728875982848L, 139541);
    return (com.tencent.mm.ui.base.i)localObject;
  }
  
  public static String a(Context paramContext, f paramf, String paramString)
  {
    GMTrace.i(781818265600L, 5825);
    if ((paramContext == null) || (paramf == null))
    {
      GMTrace.o(781818265600L, 5825);
      return paramString;
    }
    String str = dO(paramContext);
    Object localObject = null;
    if (str.equalsIgnoreCase("zh_CN")) {
      localObject = paramf.field_appName;
    }
    if (str.equalsIgnoreCase("en"))
    {
      if (bg.nm(paramf.field_appName_en)) {
        localObject = paramf.field_appName;
      }
    }
    else
    {
      if (!str.equalsIgnoreCase("zh_TW"))
      {
        paramContext = (Context)localObject;
        if (!str.equalsIgnoreCase("zh_HK")) {}
      }
      else
      {
        if (str.equalsIgnoreCase("zh_HK"))
        {
          if (!bg.nm(paramf.field_appName_hk)) {
            break label202;
          }
          localObject = paramf.field_appName_tw;
        }
        label128:
        paramContext = (Context)localObject;
        if (bg.nm((String)localObject))
        {
          if (!bg.nm(paramf.field_appName_tw)) {
            break label210;
          }
          paramContext = paramf.field_appName;
        }
      }
      label152:
      localObject = paramContext;
      if (bg.nm(paramContext)) {
        if (!bg.nm(paramf.field_appName_en)) {
          break label218;
        }
      }
    }
    label202:
    label210:
    label218:
    for (localObject = paramf.field_appName;; localObject = paramf.field_appName_en)
    {
      if (!bg.nm((String)localObject)) {
        break label226;
      }
      GMTrace.o(781818265600L, 5825);
      return paramString;
      localObject = paramf.field_appName_en;
      break;
      localObject = paramf.field_appName_hk;
      break label128;
      paramContext = paramf.field_appName_tw;
      break label152;
    }
    label226:
    GMTrace.o(781818265600L, 5825);
    return (String)localObject;
  }
  
  public static List<f> a(Context paramContext, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(781012959232L, 5819);
    Object localObject = new ArrayList();
    if (a.a.aWD() == null)
    {
      w.e("MicroMsg.AppInfoLogic", "getISubCorePluginBase() == null");
      GMTrace.o(781012959232L, 5819);
      return (List<f>)localObject;
    }
    List localList = dQ(1, paramInt);
    localObject = null;
    if (paramBoolean)
    {
      localObject = new int[1];
      localObject[0] = 5;
    }
    if (localObject == null)
    {
      GMTrace.o(781012959232L, 5819);
      return localList;
    }
    localObject = a.a.aWD().l((int[])localObject);
    if (localObject != null)
    {
      while (((Cursor)localObject).moveToNext())
      {
        f localf = new f();
        localf.b((Cursor)localObject);
        if (localf.field_status == 1)
        {
          if (n(paramContext, localf.field_appId))
          {
            if (!bg.nm(localf.field_signature)) {
              localList.add(localf);
            }
          }
          else
          {
            localf.field_status = 4;
            a.a.aWD().e(localf);
          }
        }
        else if (localf.field_signature != null) {
          localList.add(localf);
        }
      }
      ((Cursor)localObject).close();
    }
    GMTrace.o(781012959232L, 5819);
    return localList;
  }
  
  public static boolean a(Context paramContext, Intent paramIntent, String paramString)
  {
    GMTrace.i(15302163169280L, 114010);
    boolean bool = a(paramContext, paramIntent, paramString, null, null);
    GMTrace.o(15302163169280L, 114010);
    return bool;
  }
  
  public static boolean a(final Context paramContext, final Intent paramIntent, String paramString, int paramInt, final c paramc, final Bundle paramBundle)
  {
    GMTrace.i(15302431604736L, 114012);
    if ((paramContext == null) || (paramIntent == null))
    {
      w.i("MicroMsg.AppInfoLogic", "launchApp failed, context or intent is null.");
      if (paramc != null) {
        paramc.eP(false);
      }
      GMTrace.o(15302431604736L, 114012);
      return false;
    }
    final String str1;
    List localList;
    if (paramBundle != null)
    {
      str2 = paramBundle.getString("current_page_url", "");
      str1 = paramBundle.getString("current_page_appid", "");
      paramBundle = str2;
      localList = bg.y(paramContext, paramIntent);
      if ((localList == null) || (localList.isEmpty())) {
        break label505;
      }
      if ((!TextUtils.isEmpty(paramIntent.getPackage())) || (localList.size() != 1)) {
        break label216;
      }
    }
    label216:
    for (final String str2 = b((ResolveInfo)localList.get(0));; str2 = paramIntent.getPackage())
    {
      w.d("MicroMsg.AppInfoLogic", "launchApp, wxpkg : %s.", new Object[] { ab.getPackageName() });
      if (!bg.nl(ab.getPackageName()).equals(str2)) {
        break label225;
      }
      w.i("MicroMsg.AppInfoLogic", "launchApp failed, can not launch wechat page.");
      if (paramc != null) {
        paramc.eP(false);
      }
      GMTrace.o(15302431604736L, 114012);
      return false;
      paramBundle = "";
      str1 = "";
      break;
    }
    label225:
    w.i("MicroMsg.AppInfoLogic", "launchApp(pkg : %s) by wechat with intent", new Object[] { str2 });
    if ((paramInt == 2) || (Os(str2)) || ((localList.size() == 1) && (Os(b((ResolveInfo)localList.get(0))))))
    {
      paramContext.startActivity(paramIntent);
      if (paramc != null) {
        paramc.eP(true);
      }
      GMTrace.o(15302431604736L, 114012);
      return true;
    }
    if (!TextUtils.isEmpty(paramString))
    {
      paramString = paramContext.getString(a.h.kcJ, new Object[] { paramString });
      if (paramInt != 0) {
        break label419;
      }
      com.tencent.mm.ui.base.h.a(paramContext, paramString, "", paramContext.getString(a.h.kcF), paramContext.getString(a.h.cSk), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(797119086592L, 5939);
          this.val$context.startActivity(paramIntent);
          com.tencent.mm.plugin.report.service.g.ork.i(14102, new Object[] { Integer.valueOf(0), Integer.valueOf(1), "", Integer.valueOf(1), str2, paramBundle, str1 });
          if (paramc != null) {
            paramc.eP(true);
          }
          GMTrace.o(797119086592L, 5939);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(827452293120L, 6165);
          com.tencent.mm.plugin.report.service.g.ork.i(14102, new Object[] { Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0), this.tQ, paramBundle, str1 });
          if (paramc != null) {
            paramc.eP(false);
          }
          GMTrace.o(827452293120L, 6165);
        }
      });
    }
    for (;;)
    {
      GMTrace.o(15302431604736L, 114012);
      return true;
      paramString = paramContext.getString(a.h.kcI);
      break;
      label419:
      paramContext = a(paramContext, paramString, paramContext.getString(a.h.kcH), paramContext.getString(a.h.kcG), new o.a()new o.a
      {
        public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
        {
          GMTrace.i(794300514304L, 5918);
          com.tencent.mm.plugin.report.service.g.ork.i(14102, new Object[] { Integer.valueOf(1), Integer.valueOf(1), "", Integer.valueOf(1), this.tQ, paramBundle, str1 });
          paramContext.startActivity(paramIntent);
          if (paramc != null) {
            paramc.eP(true);
          }
          GMTrace.o(794300514304L, 5918);
        }
      }, new o.a()
      {
        public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
        {
          GMTrace.i(788529152000L, 5875);
          com.tencent.mm.plugin.report.service.g.ork.i(14102, new Object[] { Integer.valueOf(1), Integer.valueOf(2), "", Integer.valueOf(1), this.tQ, paramBundle, str1 });
          paramContext.startActivity(paramIntent);
          if (paramc != null) {
            paramc.eP(true);
          }
          g.Ot(this.tQ);
          GMTrace.o(788529152000L, 5875);
        }
      });
      paramContext.setCancelable(true);
      paramContext.setOnCancelListener(new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(802487795712L, 5979);
          com.tencent.mm.plugin.report.service.g.ork.i(14102, new Object[] { Integer.valueOf(1), Integer.valueOf(0), "", Integer.valueOf(0), this.tQ, paramBundle, str1 });
          if (paramc != null) {
            paramc.eP(false);
          }
          GMTrace.o(802487795712L, 5979);
        }
      });
      paramContext.setCanceledOnTouchOutside(false);
    }
    label505:
    w.w("MicroMsg.AppInfoLogic", "launchApp failed, not activity can resolve the intent.");
    if (paramc != null) {
      paramc.eP(false);
    }
    GMTrace.o(15302431604736L, 114012);
    return false;
  }
  
  public static boolean a(Context paramContext, Intent paramIntent, String paramString, c paramc)
  {
    GMTrace.i(17762776776704L, 132343);
    boolean bool = a(paramContext, paramIntent, paramString, paramc, null);
    GMTrace.o(17762776776704L, 132343);
    return bool;
  }
  
  public static boolean a(Context paramContext, Intent paramIntent, String paramString, c paramc, Bundle paramBundle)
  {
    GMTrace.i(15302297387008L, 114011);
    boolean bool = a(paramContext, paramIntent, paramString, 0, paramc, paramBundle);
    GMTrace.o(15302297387008L, 114011);
    return bool;
  }
  
  public static boolean a(Context paramContext, f paramf)
  {
    GMTrace.i(781415612416L, 5822);
    if (paramf == null)
    {
      w.w("MicroMsg.AppInfoLogic", "app is null");
      GMTrace.o(781415612416L, 5822);
      return false;
    }
    if ((paramf.field_packageName == null) || (paramf.field_packageName.length() == 0))
    {
      w.w("MicroMsg.AppInfoLogic", "field_packageName is null");
      GMTrace.o(781415612416L, 5822);
      return false;
    }
    boolean bool = p.n(paramContext, paramf.field_packageName);
    GMTrace.o(781415612416L, 5822);
    return bool;
  }
  
  public static boolean a(Context paramContext, String paramString1, WXMediaMessage paramWXMediaMessage, String paramString2, String paramString3, int paramInt, c paramc, Bundle paramBundle)
  {
    GMTrace.i(15301894733824L, 114008);
    w.d("MicroMsg.AppInfoLogic", "request pkg = " + paramString1 + ", openId = " + paramString3);
    boolean bool = a(paramContext, paramString1, paramString2, c(paramContext, paramWXMediaMessage, paramString3), paramInt, paramc, paramBundle);
    GMTrace.o(15301894733824L, 114008);
    return bool;
  }
  
  public static boolean a(final Context paramContext, final String paramString1, String paramString2, final ShowMessageFromWX.Req paramReq, int paramInt, final c paramc, final Bundle paramBundle)
  {
    GMTrace.i(15302028951552L, 114009);
    if (paramReq == null)
    {
      w.i("MicroMsg.AppInfoLogic", "launchApp failed, req is null.");
      if (paramc != null) {
        paramc.eP(false);
      }
      GMTrace.o(15302028951552L, 114009);
      return false;
    }
    if ((TextUtils.isEmpty(paramString1)) || (!p.n(paramContext, paramString1)))
    {
      w.i("MicroMsg.AppInfoLogic", "launchApp failed, pkg is null or application has not installed.");
      com.tencent.mm.ui.base.h.bm(paramContext, paramContext.getString(a.h.dhk));
      if (paramc != null) {
        paramc.eP(false);
      }
      GMTrace.o(15302028951552L, 114009);
      return false;
    }
    w.i("MicroMsg.AppInfoLogic", "launchApp(pkg : %s) with appId(%s)", new Object[] { paramString1, paramString2 });
    if (bg.nl(ab.getPackageName()).equals(paramString1))
    {
      w.i("MicroMsg.AppInfoLogic", "launchApp failed, can not launch wechat page.");
      if (paramc != null) {
        paramc.eP(false);
      }
      GMTrace.o(15302028951552L, 114009);
      return false;
    }
    final Runnable local1 = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(811077730304L, 6043);
        Bundle localBundle = new Bundle();
        this.tnK.toBundle(localBundle);
        p.ag(localBundle);
        p.ah(localBundle);
        MMessageActV2.Args localArgs = new MMessageActV2.Args();
        localArgs.targetPkgName = paramString1;
        localArgs.bundle = localBundle;
        boolean bool = MMessageActV2.send(paramContext, localArgs);
        if (paramc != null) {
          paramc.eP(bool);
        }
        GMTrace.o(811077730304L, 6043);
      }
    };
    if ((paramInt == 2) || (Os(paramString1)))
    {
      w.i("MicroMsg.AppInfoLogic", "launchApp with show confirm dialog(%s).", new Object[] { paramString1 });
      local1.run();
      GMTrace.o(15302028951552L, 114009);
      return true;
    }
    if (paramBundle != null)
    {
      paramReq = paramBundle.getString("current_page_url", "");
      paramBundle = paramBundle.getString("current_page_appid", "");
      paramString2 = aP(paramString2, true);
      if (paramString2 == null) {
        break label388;
      }
      paramString2 = paramContext.getString(a.h.kcJ, new Object[] { a(paramContext, paramString2, null) });
      label289:
      w.i("MicroMsg.AppInfoLogic", "launchApp with args(showType : %s, pkg : %s)", new Object[] { Integer.valueOf(paramInt), paramString1 });
      if (paramInt != 0) {
        break label399;
      }
      com.tencent.mm.ui.base.h.a(paramContext, paramString2, "", paramContext.getString(a.h.kcF), paramContext.getString(a.h.cSk), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(795374256128L, 5926);
          com.tencent.mm.plugin.report.service.g.ork.i(14102, new Object[] { Integer.valueOf(0), Integer.valueOf(1), "", Integer.valueOf(1), this.tQ, paramReq, paramBundle });
          local1.run();
          GMTrace.o(795374256128L, 5926);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(826378551296L, 6157);
          com.tencent.mm.plugin.report.service.g.ork.i(14102, new Object[] { Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0), this.tQ, paramReq, paramBundle });
          if (paramc != null) {
            paramc.eP(false);
          }
          GMTrace.o(826378551296L, 6157);
        }
      });
    }
    for (;;)
    {
      GMTrace.o(15302028951552L, 114009);
      return true;
      paramReq = "";
      paramBundle = "";
      break;
      label388:
      paramString2 = paramContext.getString(a.h.kcI);
      break label289;
      label399:
      paramContext = a(paramContext, paramString2, paramContext.getString(a.h.kcH), paramContext.getString(a.h.kcG), new o.a()new o.a
      {
        public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
        {
          GMTrace.i(803695755264L, 5988);
          com.tencent.mm.plugin.report.service.g.ork.i(14102, new Object[] { Integer.valueOf(1), Integer.valueOf(1), "", Integer.valueOf(1), this.tQ, paramReq, paramBundle });
          local1.run();
          GMTrace.o(803695755264L, 5988);
        }
      }, new o.a()
      {
        public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
        {
          GMTrace.i(834297397248L, 6216);
          com.tencent.mm.plugin.report.service.g.ork.i(14102, new Object[] { Integer.valueOf(1), Integer.valueOf(2), "", Integer.valueOf(1), this.tQ, paramReq, paramBundle });
          local1.run();
          g.Ot(this.tQ);
          GMTrace.o(834297397248L, 6216);
        }
      });
      paramContext.setCancelable(true);
      paramContext.setOnCancelListener(new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(823023108096L, 6132);
          com.tencent.mm.plugin.report.service.g.ork.i(14102, new Object[] { Integer.valueOf(1), Integer.valueOf(0), "", Integer.valueOf(0), this.tQ, paramReq, paramBundle });
          if (paramc != null) {
            paramc.eP(false);
          }
          GMTrace.o(823023108096L, 6132);
        }
      });
      paramContext.setCanceledOnTouchOutside(false);
    }
  }
  
  public static boolean a(f paramf, int paramInt)
  {
    GMTrace.i(782892007424L, 5833);
    if ((paramf == null) || (bg.nm(paramf.field_appId)))
    {
      GMTrace.o(782892007424L, 5833);
      return false;
    }
    if ((paramf.field_appInfoFlag & paramInt) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.AppInfoLogic", "isAppHasFlag, appid = %s, flag = %s, ret = %b", new Object[] { paramf.field_appId, Integer.valueOf(paramInt), Boolean.valueOf(bool) });
      w.i("MicroMsg.AppInfoLogic", "appInfoFlag = " + paramf.field_appInfoFlag);
      GMTrace.o(782892007424L, 5833);
      return bool;
    }
  }
  
  public static f aP(String paramString, boolean paramBoolean)
  {
    GMTrace.i(780207652864L, 5813);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("MicroMsg.AppInfoLogic", "getAppInfo, appId is null");
      GMTrace.o(780207652864L, 5813);
      return null;
    }
    if (a.a.aWD() == null)
    {
      w.e("MicroMsg.AppInfoLogic", "getISubCorePluginBase() == null");
      GMTrace.o(780207652864L, 5813);
      return null;
    }
    f localf = a.a.aWD().Et(paramString);
    if (paramBoolean) {
      if ((localf != null) && (localf.field_appName != null) && (localf.field_appName.length() != 0)) {
        break label125;
      }
    }
    label125:
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        a.a.aWD().Eu(paramString);
      }
      GMTrace.o(780207652864L, 5813);
      return localf;
    }
  }
  
  public static Bitmap b(String paramString, int paramInt, float paramFloat)
  {
    GMTrace.i(780341870592L, 5814);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("MicroMsg.AppInfoLogic", "getAppIcon, appId is null");
      GMTrace.o(780341870592L, 5814);
      return null;
    }
    if (!com.tencent.mm.kernel.h.xw().wL())
    {
      GMTrace.o(780341870592L, 5814);
      return null;
    }
    if (!com.tencent.mm.kernel.h.xy().isSDCardAvailable())
    {
      if (ab.getContext() == null)
      {
        GMTrace.o(780341870592L, 5814);
        return null;
      }
      if (ab.getContext().getResources() == null)
      {
        GMTrace.o(780341870592L, 5814);
        return null;
      }
      switch (paramInt)
      {
      default: 
        w.e("MicroMsg.AppInfoLogic", "getAppIcon, unknown iconType = " + paramInt);
        GMTrace.o(780341870592L, 5814);
        return null;
      case 1: 
      case 3: 
      case 4: 
      case 5: 
        paramString = BitmapFactory.decodeResource(ab.getContext().getResources(), a.d.bam);
        if ((paramString == null) || (paramString.isRecycled()))
        {
          GMTrace.o(780341870592L, 5814);
          return null;
        }
        GMTrace.o(780341870592L, 5814);
        return paramString;
      }
      GMTrace.o(780341870592L, 5814);
      return null;
    }
    Bitmap localBitmap = a.a.aWD().a(paramString, paramInt, paramFloat);
    if (localBitmap == null)
    {
      w.w("MicroMsg.AppInfoLogic", "getAppIcon, bm does not exist or has been recycled");
      a.a.aWD().bC(paramString, paramInt);
      GMTrace.o(780341870592L, 5814);
      return null;
    }
    if (localBitmap.isRecycled())
    {
      GMTrace.o(780341870592L, 5814);
      return null;
    }
    GMTrace.o(780341870592L, 5814);
    return localBitmap;
  }
  
  public static String b(ResolveInfo paramResolveInfo)
  {
    GMTrace.i(783831531520L, 5840);
    if (paramResolveInfo == null)
    {
      GMTrace.o(783831531520L, 5840);
      return null;
    }
    String str2 = paramResolveInfo.resolvePackageName;
    String str1 = str2;
    if (TextUtils.isEmpty(str2))
    {
      str1 = str2;
      if (paramResolveInfo.activityInfo != null) {
        str1 = paramResolveInfo.activityInfo.packageName;
      }
    }
    GMTrace.o(783831531520L, 5840);
    return str1;
  }
  
  public static List<f> b(Context paramContext, long paramLong, boolean paramBoolean)
  {
    GMTrace.i(780476088320L, 5815);
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = com.tencent.mm.plugin.x.a.aWy();
    Object localObject2 = new StringBuilder(256);
    ((StringBuilder)localObject2).append("select * from AppInfo");
    ((StringBuilder)localObject2).append(" where ");
    ((StringBuilder)localObject2).append(" ( appSupportContentType & ").append(paramLong).append(" ) != 0");
    ((StringBuilder)localObject2).append(" and  ( svrAppSupportContentType & ").append(paramLong).append(" ) != 0");
    ((StringBuilder)localObject2).append(" and  ( appInfoFlag & ").append(8192).append(" ) != 0");
    ((StringBuilder)localObject2).append(" and status != 4");
    if (!paramBoolean) {
      ((StringBuilder)localObject2).append(" and  ( appInfoFlag & ").append(16384).append(" ) == 0");
    }
    w.v("MicroMsg.AppInfoStorage", "getAppInfoByContentFlag sql %s", new Object[] { ((StringBuilder)localObject2).toString() });
    localObject2 = ((i)localObject1).rawQuery(((StringBuilder)localObject2).toString(), new String[0]);
    localObject1 = localObject2;
    if (localObject2 == null)
    {
      w.e("MicroMsg.AppInfoStorage", "getAppByStatus : cursor is null");
      localObject1 = null;
    }
    if (localObject1 == null)
    {
      GMTrace.o(780476088320L, 5815);
      return localArrayList;
    }
    while (((Cursor)localObject1).moveToNext())
    {
      localObject2 = new f();
      ((f)localObject2).b((Cursor)localObject1);
      if (((f)localObject2).field_status == 1)
      {
        if (n(paramContext, ((f)localObject2).field_appId))
        {
          if (!bg.nm(((f)localObject2).field_signature)) {
            localArrayList.add(localObject2);
          }
        }
        else
        {
          ((f)localObject2).field_status = 4;
          a.a.aWD().e((f)localObject2);
        }
      }
      else if (((f)localObject2).field_signature != null) {
        localArrayList.add(localObject2);
      }
    }
    ((Cursor)localObject1).close();
    GMTrace.o(780476088320L, 5815);
    return localArrayList;
  }
  
  public static boolean bI(String paramString)
  {
    GMTrace.i(781549830144L, 5823);
    if ((paramString == null) || (paramString.trim().length() == 0) || (paramString.equals("weixinfile")) || (paramString.equals("invalid_appname")))
    {
      GMTrace.o(781549830144L, 5823);
      return false;
    }
    GMTrace.o(781549830144L, 5823);
    return true;
  }
  
  public static boolean bJ(String paramString)
  {
    GMTrace.i(782220918784L, 5828);
    if (bg.nm(paramString))
    {
      GMTrace.o(782220918784L, 5828);
      return false;
    }
    f localf = aP(paramString, false);
    if (localf == null)
    {
      w.w("MicroMsg.AppInfoLogic", "app is null, appId = " + paramString);
      GMTrace.o(782220918784L, 5828);
      return false;
    }
    boolean bool = localf.bJs();
    GMTrace.o(782220918784L, 5828);
    return bool;
  }
  
  public static void bJw()
  {
    GMTrace.i(784234184704L, 5843);
    SharedPreferences localSharedPreferences = ab.bPV();
    if (localSharedPreferences != null) {
      localSharedPreferences.edit().putString("key_app_ids_registion_while_not_login", "").commit();
    }
    GMTrace.o(784234184704L, 5843);
  }
  
  public static ShowMessageFromWX.Req c(Context paramContext, WXMediaMessage paramWXMediaMessage, String paramString)
  {
    GMTrace.i(783697313792L, 5839);
    ShowMessageFromWX.Req localReq = new ShowMessageFromWX.Req();
    Context localContext = paramContext;
    if (paramContext == null) {
      localContext = ab.getContext();
    }
    localReq.message = paramWXMediaMessage;
    localReq.transaction = com.tencent.mm.a.g.n(bg.Pv().getBytes());
    localReq.openId = paramString;
    localReq.lang = v.d(localContext.getSharedPreferences(ab.bPU(), 0));
    localReq.country = ((String)com.tencent.mm.kernel.h.xy().xh().get(274436, null));
    GMTrace.o(783697313792L, 5839);
    return localReq;
  }
  
  public static f cB(String paramString, int paramInt)
  {
    GMTrace.i(780073435136L, 5812);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("MicroMsg.AppInfoLogic", "getAppInfo, appId is null");
      GMTrace.o(780073435136L, 5812);
      return null;
    }
    if (a.a.aWD() == null)
    {
      w.e("MicroMsg.AppInfoLogic", "getISubCorePluginBase() == null");
      GMTrace.o(780073435136L, 5812);
      return null;
    }
    f localf = a.a.aWD().Et(paramString);
    if ((localf == null) || (localf.field_appVersion < paramInt)) {}
    for (paramInt = 1;; paramInt = 0)
    {
      if (paramInt != 0) {
        a.a.aWD().Eu(paramString);
      }
      GMTrace.o(780073435136L, 5812);
      return localf;
    }
  }
  
  public static boolean d(Context paramContext, Uri paramUri)
  {
    GMTrace.i(17825993326592L, 132814);
    if ((paramContext == null) || (paramUri == null))
    {
      w.i("MicroMsg.AppInfoLogic", "launchApp failed, context or uri is null.");
      GMTrace.o(17825993326592L, 132814);
      return false;
    }
    w.i("MicroMsg.AppInfoLogic", "try to launchApp with uri.");
    paramUri = new Intent("android.intent.action.VIEW", paramUri);
    paramUri.addFlags(268435456);
    boolean bool = a(paramContext, paramUri, null, null, null);
    GMTrace.o(17825993326592L, 132814);
    return bool;
  }
  
  public static List<f> dN(Context paramContext)
  {
    GMTrace.i(780878741504L, 5818);
    ArrayList localArrayList = new ArrayList();
    if (a.a.aWD() == null)
    {
      w.e("MicroMsg.AppInfoLogic", "getISubCorePluginBase() == null");
      GMTrace.o(780878741504L, 5818);
      return localArrayList;
    }
    Cursor localCursor = a.a.aWD().sn(5);
    if (localCursor == null)
    {
      GMTrace.o(780878741504L, 5818);
      return localArrayList;
    }
    while (localCursor.moveToNext())
    {
      f localf = new f();
      localf.b(localCursor);
      if (localf.field_status == 1)
      {
        if (n(paramContext, localf.field_appId))
        {
          if (!bg.nm(localf.field_signature)) {
            localArrayList.add(localf);
          }
        }
        else
        {
          localf.field_status = 4;
          a.a.aWD().e(localf);
        }
      }
      else if (localf.field_signature != null) {
        localArrayList.add(localf);
      }
    }
    localCursor.close();
    GMTrace.o(780878741504L, 5818);
    return localArrayList;
  }
  
  public static String dO(Context paramContext)
  {
    GMTrace.i(781952483328L, 5826);
    paramContext = v.d(paramContext.getSharedPreferences(ab.bPU(), 0));
    if ((paramContext == null) || (paramContext.length() == 0) || (paramContext.equalsIgnoreCase("zh_CN")))
    {
      GMTrace.o(781952483328L, 5826);
      return "zh_CN";
    }
    GMTrace.o(781952483328L, 5826);
    return paramContext;
  }
  
  private static List<f> dQ(int paramInt1, int paramInt2)
  {
    GMTrace.i(781147176960L, 5820);
    ArrayList localArrayList = new ArrayList();
    if (a.a.aWD() == null)
    {
      w.e("MicroMsg.AppInfoLogic", "getServiceByAppInfoFlagAndShowFlag, getISubCorePluginBase() == null");
      GMTrace.o(781147176960L, 5820);
      return localArrayList;
    }
    Cursor localCursor = a.a.aWD().cJ(1, paramInt2);
    if (localCursor == null)
    {
      GMTrace.o(781147176960L, 5820);
      return localArrayList;
    }
    while (localCursor.moveToNext())
    {
      f localf = new f();
      localf.b(localCursor);
      if (!bg.nm(localf.field_openId)) {
        localArrayList.add(localf);
      }
    }
    localCursor.close();
    GMTrace.o(781147176960L, 5820);
    return localArrayList;
  }
  
  public static boolean g(f paramf)
  {
    GMTrace.i(782355136512L, 5829);
    if ((paramf == null) || (bg.nm(paramf.field_appId)))
    {
      GMTrace.o(782355136512L, 5829);
      return false;
    }
    if ((paramf.field_appInfoFlag & 0x1) > 0)
    {
      GMTrace.o(782355136512L, 5829);
      return true;
    }
    GMTrace.o(782355136512L, 5829);
    return false;
  }
  
  public static boolean h(f paramf)
  {
    GMTrace.i(782489354240L, 5830);
    if (paramf == null)
    {
      GMTrace.o(782489354240L, 5830);
      return true;
    }
    if ((paramf.field_appInfoFlag & 0x2) == 0)
    {
      GMTrace.o(782489354240L, 5830);
      return true;
    }
    GMTrace.o(782489354240L, 5830);
    return false;
  }
  
  public static boolean i(f paramf)
  {
    GMTrace.i(782757789696L, 5832);
    if ((paramf == null) || (bg.nm(paramf.field_appId)))
    {
      GMTrace.o(782757789696L, 5832);
      return false;
    }
    if ((paramf.field_appInfoFlag & 0x40) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      w.v("MicroMsg.AppInfoLogic", "canReadMMMsg, appid = %s, ret = %b", new Object[] { paramf.field_appId, Boolean.valueOf(bool) });
      GMTrace.o(782757789696L, 5832);
      return bool;
    }
  }
  
  public static boolean j(f paramf)
  {
    GMTrace.i(783026225152L, 5834);
    if ((paramf == null) || (bg.nm(paramf.field_appId)))
    {
      GMTrace.o(783026225152L, 5834);
      return false;
    }
    int i;
    HashMap localHashMap;
    if ((paramf.field_appInfoFlag & 0x80) > 0)
    {
      i = 1;
      if (1 != i) {
        break label139;
      }
      paramf = paramf.field_appId;
      localHashMap = new HashMap();
      q.b(327682, localHashMap);
      if (!localHashMap.containsKey(paramf)) {
        break label123;
      }
    }
    label123:
    for (paramf = (String)localHashMap.get(paramf);; paramf = null)
    {
      if ((paramf != null) && (!paramf.equals("0"))) {
        break label128;
      }
      GMTrace.o(783026225152L, 5834);
      return true;
      i = 0;
      break;
    }
    label128:
    GMTrace.o(783026225152L, 5834);
    return false;
    label139:
    GMTrace.o(783026225152L, 5834);
    return false;
  }
  
  public static boolean l(Context paramContext, long paramLong)
  {
    GMTrace.i(780610306048L, 5816);
    if (b(paramContext, paramLong, true).size() == 0)
    {
      GMTrace.o(780610306048L, 5816);
      return false;
    }
    GMTrace.o(780610306048L, 5816);
    return true;
  }
  
  public static String m(Context paramContext, String paramString)
  {
    GMTrace.i(781684047872L, 5824);
    paramContext = a(paramContext, aP(paramString, true), null);
    GMTrace.o(781684047872L, 5824);
    return paramContext;
  }
  
  public static boolean n(Context paramContext, String paramString)
  {
    GMTrace.i(781281394688L, 5821);
    if ((paramContext == null) || (paramString == null) || (paramString.length() == 0))
    {
      w.e("MicroMsg.AppInfoLogic", "isAppInstalled, invalid arguments");
      GMTrace.o(781281394688L, 5821);
      return false;
    }
    boolean bool = a(paramContext, aP(paramString, true));
    GMTrace.o(781281394688L, 5821);
    return bool;
  }
  
  private static class a
    implements com.tencent.mm.ipcinvoker.a
  {
    private a()
    {
      GMTrace.i(17442533277696L, 129957);
      GMTrace.o(17442533277696L, 129957);
    }
    
    public final void a(Bundle paramBundle, c paramc)
    {
      GMTrace.i(18729144418304L, 139543);
      paramBundle = paramBundle.getString("notAskPkg");
      paramc = com.tencent.mm.kernel.h.xy().xh();
      Object localObject = paramc.get(w.a.vwy, "");
      if ((localObject instanceof String))
      {
        localObject = (String)localObject;
        if (!TextUtils.isEmpty((CharSequence)localObject)) {
          break label68;
        }
      }
      for (;;)
      {
        paramc.a(w.a.vwy, paramBundle);
        GMTrace.o(18729144418304L, 139543);
        return;
        label68:
        paramBundle = (String)localObject + "|" + paramBundle;
      }
    }
  }
  
  private static class b
    implements k
  {
    private b()
    {
      GMTrace.i(17442264842240L, 129955);
      GMTrace.o(17442264842240L, 129955);
    }
    
    public final Bundle l(Bundle paramBundle)
    {
      GMTrace.i(17762374123520L, 132340);
      paramBundle = com.tencent.mm.kernel.h.xy().xh().get(w.a.vwy, null);
      Bundle localBundle = new Bundle();
      if ((paramBundle instanceof String)) {
        localBundle.putString("notAskPkg", (String)paramBundle);
      }
      GMTrace.o(17762374123520L, 132340);
      return localBundle;
    }
  }
  
  public static abstract interface c
  {
    public abstract void eP(boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\app\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
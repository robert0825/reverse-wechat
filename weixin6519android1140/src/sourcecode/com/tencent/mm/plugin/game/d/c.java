package com.tencent.mm.plugin.game.d;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.HandlerThread;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.m;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.ao.n;
import com.tencent.mm.g.a.kg;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.game.c.v;
import com.tencent.mm.plugin.game.model.SubCoreGameCenter;
import com.tencent.mm.plugin.game.model.a.a;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.e;
import com.tencent.mm.plugin.game.model.q;
import com.tencent.mm.plugin.game.model.q.a;
import com.tencent.mm.plugin.game.model.t;
import com.tencent.mm.plugin.game.model.u;
import com.tencent.mm.plugin.game.ui.GameDetailUI2;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.pluginsdk.model.app.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.k;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;

public final class c
{
  private static int gPV;
  private static volatile af gut;
  private static final Object iGt;
  private static DisplayMetrics lYR;
  private static int maxSize;
  private static int mdO;
  private static Rect rect;
  
  static
  {
    GMTrace.i(12575395807232L, 93694);
    maxSize = -1;
    gPV = -1;
    mdO = -1;
    iGt = new Object();
    rect = new Rect();
    GMTrace.o(12575395807232L, 93694);
  }
  
  public static void U(LinkedList<String> paramLinkedList)
  {
    GMTrace.i(12574590500864L, 93688);
    if (bg.cc(paramLinkedList))
    {
      GMTrace.o(12574590500864L, 93688);
      return;
    }
    LinkedList localLinkedList = new LinkedList();
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      String str = (String)paramLinkedList.next();
      f localf = com.tencent.mm.pluginsdk.model.app.g.aP(str, true);
      if ((localf != null) && (bg.nm(localf.field_openId))) {
        localLinkedList.add(str);
      }
    }
    if (!bg.cc(localLinkedList)) {
      an.aWA().bX(localLinkedList);
    }
    GMTrace.o(12574590500864L, 93688);
  }
  
  public static int a(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
  {
    GMTrace.i(12574858936320L, 93690);
    if (!bg.nm(paramString1))
    {
      a.a locala = com.tencent.mm.plugin.game.model.a.be(paramString1, paramBundle.getInt("game_report_from_scene", 0));
      if ((locala.eQl == 2) && (!bg.nm(locala.url)))
      {
        i = p(paramContext, locala.url, "game_center_detail");
        GMTrace.o(12574858936320L, 93690);
        return i;
      }
    }
    if (!bg.nm(paramString2))
    {
      i = p(paramContext, paramString2, "game_center_detail");
      GMTrace.o(12574858936320L, 93690);
      return i;
    }
    int i = e.aFh();
    if (i == 2)
    {
      i = ac(paramContext, paramString1);
      GMTrace.o(12574858936320L, 93690);
      return i;
    }
    if (i == 1)
    {
      c(paramContext, paramBundle);
      GMTrace.o(12574858936320L, 93690);
      return 6;
    }
    paramString2 = bg.bQT();
    if ((bg.nm(paramString2)) || (paramString2.toLowerCase().equals("cn")))
    {
      i = ac(paramContext, paramString1);
      GMTrace.o(12574858936320L, 93690);
      return i;
    }
    c(paramContext, paramBundle);
    GMTrace.o(12574858936320L, 93690);
    return 6;
  }
  
  public static void a(Context paramContext, q paramq, String paramString)
  {
    GMTrace.i(15197875994624L, 113233);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramq.lNd.url);
    localIntent.putExtra("finishviewifloadfailed", true);
    localIntent.putExtra("show_full_screen", paramq.lNd.lMy);
    localIntent.putExtra("disable_progress_bar", paramq.lNd.lMy);
    int i = -1;
    switch (paramq.lNd.orientation)
    {
    }
    for (;;)
    {
      localIntent.putExtra("screen_orientation", i);
      localIntent.putExtra("geta8key_scene", 32);
      localIntent.putExtra("KPublisherId", paramString);
      paramq = new kg();
      paramq.eOy.type = 1;
      paramq.eOy.context = paramContext;
      paramq.eOy.intent = localIntent;
      com.tencent.mm.sdk.b.a.vgX.m(paramq);
      GMTrace.o(15197875994624L, 113233);
      return;
      i = 0;
      continue;
      i = 1;
      continue;
      i = 1001;
      continue;
      i = 1002;
    }
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean, q paramq, int paramInt)
  {
    GMTrace.i(17973632827392L, 133914);
    if (bg.nm(paramString1))
    {
      GMTrace.o(17973632827392L, 133914);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString1);
    localIntent.putExtra("geta8key_scene", 32);
    localIntent.putExtra("KPublisherId", paramString2);
    localIntent.putExtra("game_check_float", paramBoolean);
    if ((paramBoolean) && (paramq != null))
    {
      paramq.aFr();
      if (paramq.lNd.lNA) {
        localIntent.putExtra("game_transparent_float_url", paramq.lNd.url);
      }
      localIntent.putExtra("game_sourceScene", paramInt);
    }
    y(localIntent, paramContext);
    GMTrace.o(17973632827392L, 133914);
  }
  
  public static void a(q paramq, int paramInt)
  {
    GMTrace.i(17973767045120L, 133915);
    if (paramq != null) {}
    q localq;
    do
    {
      paramq.aFr();
      w.i("MicroMsg.GameCenterUtil", "float layer report");
      if (!bg.nm(paramq.lNd.url))
      {
        int i = paramq.field_msgType;
        if (paramq.field_msgType == 100) {
          i = paramq.lNv;
        }
        ai.a(ab.getContext(), 10, 1006, 1, 1, 0, paramq.field_appId, paramInt, i, paramq.field_gameMsgId, paramq.lNw, null);
        paramq.field_isRead = true;
        SubCoreGameCenter.aGf().c(paramq, new String[0]);
      }
      SubCoreGameCenter.aGg();
      t.aFv();
      GMTrace.o(17973767045120L, 133915);
      return;
      SubCoreGameCenter.aGg();
      localq = t.aFu();
      paramq = localq;
    } while (localq != null);
    GMTrace.o(17973767045120L, 133915);
  }
  
  public static boolean a(View paramView, Context paramContext)
  {
    GMTrace.i(12573919412224L, 93683);
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof String)))
    {
      w.e("MicroMsg.GameCenterUtil", "Invalid Jump URL");
      GMTrace.o(12573919412224L, 93683);
      return false;
    }
    paramView = (String)paramView.getTag();
    if (bg.nm(paramView))
    {
      w.e("MicroMsg.GameCenterUtil", "Invalid Jump URL");
      GMTrace.o(12573919412224L, 93683);
      return false;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramView);
    localIntent.putExtra("show_bottom", false);
    y(localIntent, paramContext);
    GMTrace.o(12573919412224L, 93683);
    return true;
  }
  
  public static LinkedList<f> aGP()
  {
    GMTrace.i(12574724718592L, 93689);
    Cursor localCursor = an.aWy().bJz();
    LinkedList localLinkedList = new LinkedList();
    if (localCursor == null) {
      w.e("MicroMsg.GameCenterUtil", "getGameAppInfo failed: curosr is null");
    }
    for (;;)
    {
      GMTrace.o(12574724718592L, 93689);
      return localLinkedList;
      if (localCursor.moveToFirst()) {
        do
        {
          f localf = new f();
          localf.b(localCursor);
          localLinkedList.add(localf);
        } while (localCursor.moveToNext());
      }
      localCursor.close();
    }
  }
  
  public static int aa(Context paramContext, String paramString)
  {
    GMTrace.i(19275544788992L, 143614);
    int i = p(paramContext, paramString, null);
    GMTrace.o(19275544788992L, 143614);
    return i;
  }
  
  private static boolean ab(Context paramContext, String paramString)
  {
    int j = 2;
    GMTrace.i(19275813224448L, 143616);
    paramString = Uri.parse(paramString).getQueryParameter("weapp");
    if (!bg.nm(paramString)) {}
    for (;;)
    {
      int i;
      try
      {
        Object localObject1 = Uri.parse(paramString);
        paramString = ((Uri)localObject1).getAuthority();
        if (bg.nm(paramString))
        {
          w.w("MicroMsg.GameCenterUtil", "targetAppId is null");
          GMTrace.o(19275813224448L, 143616);
          return false;
        }
        localObject2 = ((Uri)localObject1).getQueryParameter("env_version");
        localObject1 = ((Uri)localObject1).getQueryParameter("path");
        localObject2 = bg.nl((String)localObject2);
        i = -1;
        switch (((String)localObject2).hashCode())
        {
        case 1559690845: 
          w.i("MicroMsg.GameCenterUtil", "jumpWeApp, appId: %s, versionType: %d, path: %s", new Object[] { paramString, Integer.valueOf(j), localObject1 });
          localObject2 = new AppBrandStatObject();
          ((AppBrandStatObject)localObject2).scene = 1079;
          ((com.tencent.mm.plugin.appbrand.k.c)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.c.class)).a(paramContext, null, paramString, j, 0, (String)localObject1, (AppBrandStatObject)localObject2);
          GMTrace.o(19275813224448L, 143616);
          return true;
        }
      }
      catch (Exception paramContext)
      {
        Object localObject2;
        boolean bool;
        w.e("MicroMsg.GameCenterUtil", "checkJumpWeApp: " + paramContext.getMessage());
      }
      if (((String)localObject2).equals("develop"))
      {
        i = 0;
        break label287;
        bool = ((String)localObject2).equals("trial");
        if (bool)
        {
          i = 1;
          break label287;
          j = 1;
          continue;
          GMTrace.o(19275813224448L, 143616);
          return false;
        }
      }
      label287:
      switch (i)
      {
      }
      j = 0;
    }
  }
  
  public static void abA()
  {
    GMTrace.i(15198010212352L, 113234);
    if (gut == null)
    {
      GMTrace.o(15198010212352L, 113234);
      return;
    }
    synchronized (iGt)
    {
      if (gut != null)
      {
        com.tencent.mm.vending.h.g.Xm("SubCoreGameCenter#WorkThread");
        gut.ngv.quit();
        gut = null;
      }
      GMTrace.o(15198010212352L, 113234);
      return;
    }
  }
  
  public static int ac(Context paramContext, String paramString)
  {
    GMTrace.i(19275947442176L, 143617);
    if (bg.nm(paramString))
    {
      GMTrace.o(19275947442176L, 143617);
      return 0;
    }
    Object localObject = com.tencent.mm.plugin.game.model.g.aFi().aFj();
    if (localObject != null)
    {
      localObject = ((v)localObject).lPE;
      if (bg.nm((String)localObject)) {
        break label101;
      }
    }
    label101:
    for (paramString = (String)localObject + "?appid=" + paramString;; paramString = "game.weixin.qq.com/cgi-bin/h5/static/gamecenter/detail.html?appid=" + paramString)
    {
      int i = p(paramContext, paramString, "game_center_detail");
      GMTrace.o(19275947442176L, 143617);
      return i;
      localObject = "";
      break;
    }
  }
  
  public static void c(Context paramContext, Bundle paramBundle)
  {
    GMTrace.i(12575127371776L, 93692);
    Intent localIntent = new Intent(paramContext, GameDetailUI2.class);
    localIntent.putExtras(paramBundle);
    paramContext.startActivity(localIntent);
    GMTrace.o(12575127371776L, 93692);
  }
  
  public static Dialog cD(Context paramContext)
  {
    GMTrace.i(12574053629952L, 93684);
    View localView = View.inflate(paramContext, R.i.czk, null);
    final k localk = new k(paramContext, R.m.elX);
    localk.setContentView(localView);
    localk.setCancelable(true);
    localk.setCanceledOnTouchOutside(false);
    localk.setOnCancelListener(new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(12576201113600L, 93700);
        if ((this.val$context instanceof MMActivity)) {
          ((MMActivity)this.val$context).finish();
        }
        localk.setOnCancelListener(null);
        GMTrace.o(12576201113600L, 93700);
      }
    });
    GMTrace.o(12574053629952L, 93684);
    return localk;
  }
  
  public static boolean cw(String paramString1, String paramString2)
  {
    GMTrace.i(19276215877632L, 143619);
    paramString1 = new File(paramString1);
    String str = com.tencent.mm.a.g.h(paramString1);
    if ((bg.nm(paramString2)) || (bg.nm(str)))
    {
      w.i("MicroMsg.GameCenterUtil", "checkPkgMD5Valid, md5 is null");
      bool = paramString1.exists();
      GMTrace.o(19276215877632L, 143619);
      return bool;
    }
    w.i("MicroMsg.GameCenterUtil", "checkPkgMD5Valid, md5 = %s, calculateMD5 = %s", new Object[] { paramString2, str });
    boolean bool = paramString2.equalsIgnoreCase(str);
    GMTrace.o(19276215877632L, 143619);
    return bool;
  }
  
  public static int getScreenWidth(Context paramContext)
  {
    GMTrace.i(12573382541312L, 93679);
    if (paramContext == null)
    {
      GMTrace.o(12573382541312L, 93679);
      return 0;
    }
    if (lYR == null)
    {
      lYR = new DisplayMetrics();
      ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getMetrics(lYR);
    }
    int i = lYR.widthPixels;
    GMTrace.o(12573382541312L, 93679);
    return i;
  }
  
  public static int p(Context paramContext, String paramString1, String paramString2)
  {
    GMTrace.i(19275679006720L, 143615);
    if (bg.nm(paramString1))
    {
      GMTrace.o(19275679006720L, 143615);
      return 0;
    }
    if (ab(paramContext, paramString1))
    {
      GMTrace.o(19275679006720L, 143615);
      return 30;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString1);
    localIntent.putExtra("show_bottom", false);
    localIntent.putExtra("geta8key_scene", 32);
    localIntent.putExtra("KPublisherId", paramString2);
    y(localIntent, paramContext);
    GMTrace.o(19275679006720L, 143615);
    return 7;
  }
  
  public static int parseColor(String paramString)
  {
    GMTrace.i(19276081659904L, 143618);
    int i = 0;
    try
    {
      int j = Color.parseColor(paramString);
      i = j;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        w.e("MicroMsg.GameCenterUtil", "parseColor: " + paramString.getMessage());
      }
    }
    GMTrace.o(19276081659904L, 143618);
    return i;
  }
  
  public static af xB()
  {
    GMTrace.i(15198144430080L, 113235);
    if (gut == null) {}
    synchronized (iGt)
    {
      if (gut == null)
      {
        gut = new af("SubCoreGameCenter#WorkThread");
        com.tencent.mm.vending.h.g.a("SubCoreGameCenter#WorkThread", new com.tencent.mm.vending.h.h(gut.ngv.getLooper(), "SubCoreGameCenter#WorkThread"));
      }
      ??? = gut;
      GMTrace.o(15198144430080L, 113235);
      return (af)???;
    }
  }
  
  private static void y(Intent paramIntent, Context paramContext)
  {
    GMTrace.i(12575261589504L, 93693);
    kg localkg = new kg();
    localkg.eOy.type = 0;
    localkg.eOy.context = paramContext;
    localkg.eOy.intent = paramIntent;
    com.tencent.mm.sdk.b.a.vgX.m(localkg);
    GMTrace.o(12575261589504L, 93693);
  }
  
  public static int zU(String paramString)
  {
    GMTrace.i(12574187847680L, 93685);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.GameCenterUtil", "Null or Nil packageName");
      GMTrace.o(12574187847680L, 93685);
      return 0;
    }
    try
    {
      paramString = ab.getContext().getPackageManager().getPackageInfo(paramString, 0);
      if (paramString == null)
      {
        GMTrace.o(12574187847680L, 93685);
        return 0;
      }
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        w.w("MicroMsg.GameCenterUtil", "Exception: %s", new Object[] { paramString.toString() });
        paramString = null;
      }
      int i = paramString.versionCode;
      GMTrace.o(12574187847680L, 93685);
      return i;
    }
  }
  
  public static int zV(String paramString)
  {
    GMTrace.i(12574322065408L, 93686);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.GameCenterUtil", "Null or Nil path");
      GMTrace.o(12574322065408L, 93686);
      return 0;
    }
    paramString = ab.getContext().getPackageManager().getPackageArchiveInfo(paramString, 0);
    if (paramString == null)
    {
      GMTrace.o(12574322065408L, 93686);
      return 0;
    }
    int i = paramString.versionCode;
    GMTrace.o(12574322065408L, 93686);
    return i;
  }
  
  public static void zW(String paramString)
  {
    GMTrace.i(12574456283136L, 93687);
    com.tencent.mm.ao.a.a locala = n.Jd();
    c.a locala1 = new c.a();
    locala1.gKB = true;
    locala.a(paramString, null, locala1.Jn());
    GMTrace.o(12574456283136L, 93687);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\d\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
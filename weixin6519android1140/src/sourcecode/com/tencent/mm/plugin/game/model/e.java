package com.tencent.mm.plugin.game.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.AssetManager;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.game.d.a.a;
import com.tencent.mm.plugin.game.ui.GameRegionPreference.a;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g.c;
import com.tencent.mm.pluginsdk.model.app.m;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public final class e
{
  public static void V(Context paramContext, String paramString)
  {
    GMTrace.i(12622372012032L, 94044);
    a(paramContext, paramString, null, "WX_GameCenter", new g.c()
    {
      public final void eP(boolean paramAnonymousBoolean)
      {
        GMTrace.i(12634048954368L, 94131);
        if (paramAnonymousBoolean)
        {
          SubCoreGameCenter.aGi();
          w.b(this.eud, 0, 0, null, null);
        }
        GMTrace.o(12634048954368L, 94131);
      }
    });
    GMTrace.o(12622372012032L, 94044);
  }
  
  public static void W(Context paramContext, String paramString)
  {
    int i = 0;
    GMTrace.i(12623311536128L, 94051);
    String str2 = String.valueOf(System.currentTimeMillis() / 1000L);
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("game_center_pref", 0);
    Object localObject = localSharedPreferences.getString("download_app_id_time_map", "");
    if (bg.nm((String)localObject))
    {
      paramContext = paramString + "-" + str2;
      localSharedPreferences.edit().putString("download_app_id_time_map", paramContext).commit();
      GMTrace.o(12623311536128L, 94051);
      return;
    }
    if (((String)localObject).contains(paramString))
    {
      paramContext = new String();
      String[] arrayOfString = ((String)localObject).split(",");
      if (i < arrayOfString.length)
      {
        String str1 = arrayOfString[i];
        localObject = str1;
        if (str1.contains(paramString)) {
          localObject = paramString + "-" + str2;
        }
        if (i == arrayOfString.length - 1) {}
        for (paramContext = paramContext + (String)localObject;; paramContext = paramContext + (String)localObject + ",")
        {
          i += 1;
          break;
        }
      }
      localSharedPreferences.edit().putString("download_app_id_time_map", paramContext).apply();
      GMTrace.o(12623311536128L, 94051);
      return;
    }
    paramContext = (String)localObject + "," + paramString + "-" + str2;
    localSharedPreferences.edit().putString("download_app_id_time_map", paramContext).apply();
    GMTrace.o(12623311536128L, 94051);
  }
  
  public static void X(Context paramContext, String paramString)
  {
    GMTrace.i(12623982624768L, 94056);
    paramContext.getSharedPreferences("game_center_pref", 0).edit().putString("game_region_code", paramString).commit();
    GMTrace.o(12623982624768L, 94056);
  }
  
  public static String a(GameRegionPreference.a parama)
  {
    GMTrace.i(12622908882944L, 94048);
    StringBuffer localStringBuffer = new StringBuffer();
    String str;
    if (parama != null)
    {
      str = bg.nl(com.tencent.mm.sdk.platformtools.v.bPK());
      if (!"zh_CN".equalsIgnoreCase(str)) {
        break label60;
      }
      localStringBuffer.append(parama.mbx);
    }
    for (;;)
    {
      parama = localStringBuffer.toString();
      GMTrace.o(12622908882944L, 94048);
      return parama;
      label60:
      if (("zh_TW".equalsIgnoreCase(str)) || ("zh_HK".equalsIgnoreCase(str))) {
        localStringBuffer.append(parama.mby);
      } else {
        localStringBuffer.append(parama.mbz);
      }
    }
  }
  
  public static void a(Context paramContext, final String paramString1, String paramString2, String paramString3, final g.c paramc)
  {
    GMTrace.i(12622506229760L, 94045);
    if (bg.nm(paramString1))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GameCenterLogic", "null or nil appid");
      if (paramc != null) {
        paramc.eP(false);
      }
    }
    paramString1 = com.tencent.mm.pluginsdk.model.app.g.aP(paramString1, true);
    if ((paramString1 == null) || (bg.nm(paramString1.field_appId)))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GameCenterLogic", "appinfo is null or appid is null");
      if (paramc != null) {
        paramc.eP(false);
      }
      GMTrace.o(12622506229760L, 94045);
      return;
    }
    if (!p.b(paramContext, paramString1))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GameCenterLogic", "The app %s signature is incorrect.", new Object[] { paramString1.field_appName });
      Toast.makeText(paramContext, paramContext.getString(R.l.dzZ, new Object[] { com.tencent.mm.pluginsdk.model.app.g.a(paramContext, paramString1, null) }), 1).show();
      if (paramc != null) {
        paramc.eP(false);
      }
      GMTrace.o(12622506229760L, 94045);
      return;
    }
    final WXMediaMessage localWXMediaMessage = new WXMediaMessage(new WXAppExtendObject());
    localWXMediaMessage.sdkVer = 620822528;
    localWXMediaMessage.messageAction = paramString2;
    localWXMediaMessage.messageExt = paramString3;
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.GameCenterLogic", "launch game app from wx: appid: [%s], appname:[%s], openid:[%s]", new Object[] { paramString1.field_appId, paramString1.field_appName, paramString1.field_openId });
    if (bg.nm(paramString1.field_openId))
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GameCenterLogic", "open id is null or nil, try to get from server:[%s]", new Object[] { paramString1.field_appName });
      an.aWA().LD(paramString1.field_appId);
    }
    com.tencent.mm.bv.a.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18030809579520L, 134340);
        com.tencent.mm.pluginsdk.model.app.g.a(this.val$context, paramString1.field_packageName, localWXMediaMessage, paramString1.field_appId, paramString1.field_openId, 1, paramc, null);
        GMTrace.o(18030809579520L, 134340);
      }
    });
    GMTrace.o(12622506229760L, 94045);
  }
  
  public static LinkedList<f> aFe()
  {
    GMTrace.i(12622103576576L, 94042);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.GameCenterLogic", "getShowInGameCenterGames");
    LinkedList localLinkedList1 = new LinkedList();
    localLinkedList1.addAll(SubCoreGameCenter.aGl().lLu);
    LinkedList localLinkedList2 = new LinkedList();
    Iterator localIterator = localLinkedList1.iterator();
    label154:
    while (localIterator.hasNext())
    {
      f localf = (f)localIterator.next();
      if (localf != null)
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GameCenterLogic", "appinfo:[%s], appinfo flag:[%d]", new Object[] { localf.field_appId, Integer.valueOf(localf.field_appInfoFlag) });
        if ((localf.field_appInfoFlag & 0x4) <= 0) {}
      }
      for (int i = 1;; i = 0)
      {
        if (i != 0) {
          break label154;
        }
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GameCenterLogic", "app should not show in gamecenter:[%s]", new Object[] { localf.field_appName });
        localLinkedList2.add(localf);
        break;
      }
    }
    if (localLinkedList2.size() > 0) {
      localLinkedList1.removeAll(localLinkedList2);
    }
    GMTrace.o(12622103576576L, 94042);
    return localLinkedList1;
  }
  
  public static LinkedList<String> aFf()
  {
    GMTrace.i(12622237794304L, 94043);
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.addAll(SubCoreGameCenter.aGl().lLt);
    GMTrace.o(12622237794304L, 94043);
    return localLinkedList;
  }
  
  public static String aFg()
  {
    GMTrace.i(12622640447488L, 94046);
    String str2 = bg.bQT();
    String str1 = str2;
    if (bg.nm(str2)) {
      str1 = "CN";
    }
    str1 = str1.toUpperCase();
    GMTrace.o(12622640447488L, 94046);
    return str1;
  }
  
  public static int aFh()
  {
    GMTrace.i(16558172667904L, 123368);
    com.tencent.mm.plugin.game.c.v localv = g.aFi().aFj();
    if (localv != null)
    {
      int i = localv.lQl;
      GMTrace.o(16558172667904L, 123368);
      return i;
    }
    GMTrace.o(16558172667904L, 123368);
    return 0;
  }
  
  public static ShapeDrawable bN(int paramInt1, int paramInt2)
  {
    GMTrace.i(12623579971584L, 94053);
    ShapeDrawable localShapeDrawable = new ShapeDrawable(new RoundRectShape(new float[] { paramInt2, paramInt2, paramInt2, paramInt2, paramInt2, paramInt2, paramInt2, paramInt2 }, null, null));
    localShapeDrawable.getPaint().setColor(paramInt1);
    GMTrace.o(12623579971584L, 94053);
    return localShapeDrawable;
  }
  
  public static String cA(Context paramContext)
  {
    GMTrace.i(12623848407040L, 94055);
    paramContext = paramContext.getSharedPreferences("game_center_pref", 0).getString("game_region_code", "");
    GMTrace.o(12623848407040L, 94055);
    return paramContext;
  }
  
  public static GameRegionPreference.a cy(Context paramContext)
  {
    GMTrace.i(12622774665216L, 94047);
    String str = cA(paramContext);
    paramContext = str;
    if (bg.nm(str)) {
      paramContext = aFg();
    }
    paramContext = (GameRegionPreference.a)a.a.mdJ.aGO().get(paramContext);
    GMTrace.o(12622774665216L, 94047);
    return paramContext;
  }
  
  public static Set<String> cz(Context paramContext)
  {
    GMTrace.i(12623445753856L, 94052);
    paramContext = paramContext.getSharedPreferences("game_center_pref", 0).getStringSet("show_download_gift_tips", new HashSet());
    GMTrace.o(12623445753856L, 94052);
    return paramContext;
  }
  
  public static String zG(String paramString)
  {
    GMTrace.i(12623043100672L, 94049);
    Object localObject3 = null;
    label78:
    String str2;
    for (Object localObject1 = null;; str2 = "")
    {
      try
      {
        localInputStream = ab.getContext().getAssets().open("game_region_default.txt");
        localObject1 = localInputStream;
        localObject3 = localInputStream;
        localObject4 = new byte[localInputStream.available()];
        localObject1 = localInputStream;
        localObject3 = localInputStream;
        localInputStream.read((byte[])localObject4);
        localObject1 = localInputStream;
        localObject3 = localInputStream;
        localObject4 = new String((byte[])localObject4);
        localObject1 = localObject4;
        if (localInputStream == null) {}
      }
      catch (IOException localIOException4)
      {
        for (;;)
        {
          InputStream localInputStream;
          Object localObject4;
          Object localObject2;
          localObject3 = localObject2;
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GameCenterLogic", "exception:%s", new Object[] { bg.f(localIOException4) });
          if (localObject2 == null) {
            break;
          }
          try
          {
            ((InputStream)localObject2).close();
            localObject2 = "";
          }
          catch (IOException localIOException2)
          {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GameCenterLogic", "exception:%s", new Object[] { bg.f(localIOException2) });
            String str1 = "";
          }
        }
      }
      finally
      {
        if (localObject3 == null) {
          continue;
        }
        try
        {
          ((InputStream)localObject3).close();
          throw paramString;
        }
        catch (IOException localIOException3)
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GameCenterLogic", "exception:%s", new Object[] { bg.f(localIOException3) });
          continue;
        }
        if (!"zh_CN".equalsIgnoreCase(paramString)) {
          continue;
        }
        paramString = localObject3[0];
        GMTrace.o(12623043100672L, 94049);
        return paramString;
        if ((!"zh_TW".equalsIgnoreCase(paramString)) && (!"zh_HK".equalsIgnoreCase(paramString))) {
          continue;
        }
        paramString = localObject3[1];
        GMTrace.o(12623043100672L, 94049);
        return paramString;
        paramString = localObject3[2];
        GMTrace.o(12623043100672L, 94049);
        return paramString;
      }
      try
      {
        localInputStream.close();
        localObject1 = localObject4;
      }
      catch (IOException localIOException1)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GameCenterLogic", "exception:%s", new Object[] { bg.f(localIOException1) });
        localObject2 = localObject4;
        break label78;
      }
      localObject3 = ((String)localObject1).trim().split("\\|");
      if (localObject3.length < 3)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GameCenterLogic", "this region default title has problem %s", new Object[] { localObject1 });
        GMTrace.o(12623043100672L, 94049);
        return "";
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
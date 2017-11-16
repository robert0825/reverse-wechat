package com.tencent.mm.plugin.music.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.qi;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.i;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.apv;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.tw;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;
import com.tencent.mm.y.u;
import com.tencent.mm.y.u.b;
import java.io.File;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class g
{
  private static final Pattern lIw;
  private static final String[] npY;
  private static String npZ;
  private static String nqa;
  
  static
  {
    GMTrace.i(4852373520384L, 36153);
    npY = new String[] { "#", "?", "&" };
    npZ = null;
    nqa = null;
    lIw = Pattern.compile("songid=([0-9]+)");
    GMTrace.o(4852373520384L, 36153);
  }
  
  public static void A(Activity paramActivity)
  {
    GMTrace.i(4852239302656L, 36152);
    at.AR();
    if (((Boolean)c.xh().get(82, Boolean.valueOf(true))).booleanValue())
    {
      at.AR();
      c.xh().set(82, Boolean.valueOf(false));
      switch (h.aSs().aSi().field_musicType)
      {
      }
      for (;;)
      {
        GMTrace.o(4852239302656L, 36152);
        return;
        D(paramActivity, R.l.ebz);
        GMTrace.o(4852239302656L, 36152);
        return;
        D(paramActivity, R.l.ebA);
        GMTrace.o(4852239302656L, 36152);
        return;
        D(paramActivity, R.l.ebB);
        GMTrace.o(4852239302656L, 36152);
        return;
        D(paramActivity, R.l.ebC);
      }
    }
    if (h.aSs().mode == 2)
    {
      Toast.makeText(ab.getContext(), R.l.edG, 0).show();
      GMTrace.o(4852239302656L, 36152);
      return;
    }
    Toast.makeText(ab.getContext(), R.l.edH, 0).show();
    GMTrace.o(4852239302656L, 36152);
  }
  
  public static void C(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(15011850223616L, 111847);
    w.i("MicroMsg.Music.MusicUtil", "gotoAppbrand(), appId:%s, appUserName:%s, pkgType:%d", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt) });
    qi localqi = new qi();
    localqi.eUY.appId = paramString1;
    localqi.eUY.eVc = -1;
    localqi.eUY.eVb = paramInt;
    localqi.eUY.userName = paramString2;
    localqi.eUY.scene = 1056;
    if (paramInt == 1) {
      localqi.eUY.eVe = true;
    }
    com.tencent.mm.sdk.b.a.vgX.m(localqi);
    GMTrace.o(15011850223616L, 111847);
  }
  
  private static i D(Context paramContext, int paramInt)
  {
    GMTrace.i(18370380431360L, 136870);
    paramContext = new i.a(paramContext);
    paramContext.BN(R.l.cUG);
    paramContext.BO(paramInt);
    paramContext.BQ(R.l.dJS).a(null);
    paramContext.lz(true);
    paramContext = paramContext.aax();
    paramContext.show();
    GMTrace.o(18370380431360L, 136870);
    return paramContext;
  }
  
  public static String Dk(String paramString)
  {
    GMTrace.i(15011447570432L, 111844);
    at.AR();
    File localFile = new File(c.zo(), "music");
    if (!localFile.exists()) {
      localFile.mkdirs();
    }
    paramString = Dp(paramString);
    localFile = new File(localFile, paramString);
    w.d("MicroMsg.Music.MusicUtil", "getMusicPieceFilePath music name %s path %s", new Object[] { paramString, localFile.getAbsoluteFile() });
    paramString = localFile.getAbsolutePath();
    GMTrace.o(15011447570432L, 111844);
    return paramString;
  }
  
  public static boolean Dl(String paramString)
  {
    GMTrace.i(4849689165824L, 36133);
    if (bg.nm(paramString))
    {
      GMTrace.o(4849689165824L, 36133);
      return false;
    }
    Uri localUri = Uri.parse(paramString);
    String str = "";
    if (localUri != null) {
      str = localUri.getHost();
    }
    boolean bool;
    if (str != null)
    {
      bool = localUri.getHost().contains(".qq.com");
      w.w("MicroMsg.Music.MusicUtil", "url %s match ? %B", new Object[] { paramString, Boolean.valueOf(bool) });
    }
    for (;;)
    {
      GMTrace.o(4849689165824L, 36133);
      return bool;
      w.i("MicroMsg.Music.MusicUtil", "host is null, url is not match .qq.com");
      bool = false;
    }
  }
  
  private static String Dm(String paramString)
  {
    GMTrace.i(4850091819008L, 36136);
    if (bg.nm(paramString))
    {
      GMTrace.o(4850091819008L, 36136);
      return null;
    }
    if ((npZ != null) && (paramString.equals(npZ)))
    {
      paramString = nqa;
      GMTrace.o(4850091819008L, 36136);
      return paramString;
    }
    Object localObject2 = "";
    String[] arrayOfString = npY;
    int j = arrayOfString.length;
    int i = 0;
    Object localObject1 = null;
    Object localObject4;
    for (;;)
    {
      localObject3 = localObject2;
      localObject4 = localObject1;
      if (i >= j) {
        break;
      }
      localObject2 = arrayOfString[i];
      localObject2 = (String)localObject2 + "p=";
      if (paramString.contains((CharSequence)localObject2)) {
        localObject1 = paramString;
      }
      localObject3 = localObject2;
      localObject4 = localObject1;
      if (localObject1 != null) {
        break;
      }
      i += 1;
    }
    if (localObject4 == null)
    {
      GMTrace.o(4850091819008L, 36136);
      return null;
    }
    i = ((String)localObject4).indexOf((String)localObject3);
    if (i < 0)
    {
      w.w("MicroMsg.Music.MusicUtil", "pIndex is %d, return", new Object[] { Integer.valueOf(i) });
      GMTrace.o(4850091819008L, 36136);
      return null;
    }
    localObject1 = ((String)localObject4).substring(((String)localObject3).length() + i);
    Object localObject3 = npY;
    j = localObject3.length;
    i = 0;
    while (i < j)
    {
      int k = ((String)localObject1).indexOf(localObject3[i]);
      localObject2 = localObject1;
      if (k > 0) {
        localObject2 = ((String)localObject1).substring(0, k);
      }
      i += 1;
      localObject1 = localObject2;
    }
    if (localObject1 != null)
    {
      npZ = paramString;
      nqa = (String)localObject1;
    }
    GMTrace.o(4850091819008L, 36136);
    return (String)localObject1;
  }
  
  private static byte[] Dn(String paramString)
  {
    GMTrace.i(4850360254464L, 36138);
    byte[] arrayOfByte = new byte[paramString.length() / 2 + paramString.length() % 2];
    int i = 0;
    int j = 0;
    for (;;)
    {
      try
      {
        if (i < paramString.length())
        {
          k = i + 1;
          int m = j(paramString.charAt(i));
          if (k >= paramString.length()) {
            break label115;
          }
          i = k + 1;
          k = j(paramString.charAt(k));
          arrayOfByte[j] = ((byte)(k | m << 4));
          j += 1;
          continue;
        }
        GMTrace.o(4850360254464L, 36138);
      }
      catch (Exception paramString)
      {
        GMTrace.o(4850360254464L, 36138);
        return null;
      }
      return arrayOfByte;
      label115:
      i = k;
      int k = 0;
    }
  }
  
  private static int Do(String paramString)
  {
    GMTrace.i(4850494472192L, 36139);
    if (bg.nm(paramString))
    {
      GMTrace.o(4850494472192L, 36139);
      return 0;
    }
    paramString = lIw.matcher(paramString);
    if (paramString.find())
    {
      paramString = paramString.group(1);
      try
      {
        int i = Integer.valueOf(paramString).intValue();
        GMTrace.o(4850494472192L, 36139);
        return i;
      }
      catch (Exception paramString)
      {
        w.printErrStackTrace("MicroMsg.Music.MusicUtil", paramString, "getSongId", new Object[0]);
        GMTrace.o(4850494472192L, 36139);
        return 0;
      }
    }
    GMTrace.o(4850494472192L, 36139);
    return 0;
  }
  
  public static String Dp(String paramString)
  {
    GMTrace.i(15011581788160L, 111845);
    paramString = "piece" + aa.RP(new StringBuilder().append(paramString.hashCode()).toString());
    GMTrace.o(15011581788160L, 111845);
    return paramString;
  }
  
  public static String a(String paramString1, String paramString2, boolean paramBoolean, PBool paramPBool)
  {
    GMTrace.i(4849957601280L, 36135);
    if ((paramBoolean) || (bg.nm(paramString2))) {}
    for (String str = paramString1; bg.nm(str); str = paramString2)
    {
      GMTrace.o(4849957601280L, 36135);
      return str;
    }
    PString localPString = new PString();
    w.i("MicroMsg.Music.MusicUtil", "url[%s], lowBandUrl[%s], isWifi[%B]", new Object[] { paramString1, paramString2, Boolean.valueOf(paramBoolean) });
    paramString1 = Dm(str);
    if (paramString1 != null) {
      if (a(paramString1, paramBoolean, localPString)) {
        paramPBool.value = paramBoolean;
      }
    }
    for (;;)
    {
      paramString1 = localPString.value;
      GMTrace.o(4849957601280L, 36135);
      return paramString1;
      if (str.contains("wechat_music_url=")) {
        a(str.substring(str.indexOf("wechat_music_url=") + 17), paramBoolean, localPString);
      } else {
        localPString.value = str;
      }
    }
  }
  
  public static void a(apv paramapv, Activity paramActivity)
  {
    GMTrace.i(4851165560832L, 36144);
    com.tencent.mm.plugin.report.service.g.ork.A(10910, "3");
    cf localcf = new cf();
    tt localtt = new tt();
    tw localtw = new tw();
    th localth = new th();
    localtw.QY(q.zE());
    localtw.QZ(q.zE());
    localtw.zZ(5);
    localtw.eE(bg.Pv());
    localtw.Re(j(paramapv));
    localth.Qn(paramapv.uFw);
    localth.Qo(paramapv.uFx);
    localth.Qm(paramapv.uFy);
    Object localObject = h.aSt().DO(h(paramapv));
    if (((com.tencent.mm.at.a)localObject).JM())
    {
      localth.Qp(((com.tencent.mm.at.a)localObject).field_songHAlbumUrl);
      localth.kw(true);
      localObject = i(paramapv);
      if (!FileOp.aZ((String)localObject)) {
        break label321;
      }
      localth.Qv((String)localObject);
    }
    for (;;)
    {
      localth.Qg(paramapv.uFs);
      localth.Qh(paramapv.uFt);
      localth.zR(7);
      localcf.eDv.title = paramapv.uFs;
      localcf.eDv.desc = paramapv.uFt;
      localcf.eDv.eDx = localtt;
      localcf.eDv.type = 7;
      localtt.a(localtw);
      localtt.ulB.add(localth);
      localcf.eDv.activity = paramActivity;
      localcf.eDv.eDC = 3;
      com.tencent.mm.sdk.b.a.vgX.m(localcf);
      GMTrace.o(4851165560832L, 36144);
      return;
      localth.Qp(((com.tencent.mm.at.a)localObject).field_songAlbumUrl);
      break;
      label321:
      localth.kx(true);
    }
  }
  
  public static void a(apv paramapv, Intent paramIntent, MMActivity paramMMActivity)
  {
    GMTrace.i(4851568214016L, 36147);
    String str1 = paramIntent.getStringExtra("Select_Conv_User");
    paramIntent = new WXMusicObject();
    paramIntent.musicUrl = paramapv.uFy;
    paramIntent.musicDataUrl = paramapv.uFw;
    paramIntent.musicLowBandUrl = paramapv.uFx;
    paramIntent.musicLowBandDataUrl = paramapv.uFx;
    WXMediaMessage localWXMediaMessage = new WXMediaMessage();
    localWXMediaMessage.mediaObject = paramIntent;
    localWXMediaMessage.title = paramapv.uFs;
    localWXMediaMessage.description = paramapv.uFt;
    Object localObject = null;
    String str2 = i(paramapv);
    paramIntent = (Intent)localObject;
    if (str2 != null)
    {
      paramIntent = (Intent)localObject;
      if (FileOp.aZ(str2))
      {
        int i = (int)paramMMActivity.getResources().getDimension(R.f.aQy);
        paramIntent = com.tencent.mm.sdk.platformtools.d.U(str2, i, i);
      }
    }
    if (paramIntent != null) {}
    for (localWXMediaMessage.thumbData = bg.S(paramIntent);; localWXMediaMessage.thumbData = bg.S(com.tencent.mm.sdk.platformtools.d.Ag(R.g.aVU)))
    {
      b.hnH.a(paramMMActivity, j(paramapv), localWXMediaMessage, str1, k(paramapv));
      w.i("MicroMsg.Music.MusicUtil", "succeed to share to friend:%s", new Object[] { str1 });
      GMTrace.o(4851568214016L, 36147);
      return;
    }
  }
  
  private static boolean a(String paramString, boolean paramBoolean, PString paramPString)
  {
    GMTrace.i(4850226036736L, 36137);
    Object localObject2 = new String(Dn(paramString));
    int i = ((String)localObject2).indexOf("{");
    Object localObject1 = localObject2;
    if (i != -1) {
      localObject1 = ((String)localObject2).substring(i);
    }
    try
    {
      localObject2 = new JSONObject((String)localObject1);
      localObject1 = ((JSONObject)localObject2).getString("song_WapLiveURL");
      localObject2 = ((JSONObject)localObject2).getString("song_WifiURL");
      w.d("MicroMsg.Music.MusicUtil", "waplive: " + (String)localObject1 + "  wifi:" + (String)localObject2);
      if (paramBoolean) {
        localObject1 = localObject2;
      }
      for (;;)
      {
        paramPString.value = ((String)localObject1);
        GMTrace.o(4850226036736L, 36137);
        return true;
      }
      return false;
    }
    catch (Exception localException)
    {
      paramPString.value = paramString;
      w.printErrStackTrace("MicroMsg.Music.MusicUtil", localException, "decodeJson", new Object[0]);
      GMTrace.o(4850226036736L, 36137);
    }
  }
  
  public static String b(com.tencent.mm.at.a parama, boolean paramBoolean)
  {
    GMTrace.i(4849420730368L, 36131);
    at.AR();
    File localFile = new File(c.zo(), "music");
    if (!localFile.exists()) {
      w.i("MicroMsg.Music.MusicUtil", "create file folder:%b for path:%s", new Object[] { Boolean.valueOf(localFile.mkdirs()), localFile.getAbsolutePath() });
    }
    if (paramBoolean) {}
    for (parama = aa.RP(new StringBuilder().append(parama.field_musicId).append("temp").toString()) + "-wifi";; parama = aa.RP(parama.field_musicId + "temp"))
    {
      localFile = new File(localFile, parama);
      w.d("MicroMsg.Music.MusicUtil", "music name %s path %s", new Object[] { parama, localFile.getAbsoluteFile() });
      parama = localFile.getAbsolutePath();
      GMTrace.o(4849420730368L, 36131);
      return parama;
    }
  }
  
  public static boolean b(com.tencent.mm.at.a parama)
  {
    GMTrace.i(4849823383552L, 36134);
    w.d("MicroMsg.Music.MusicUtil", "music urls: %s,  %s,  %s", new Object[] { parama.field_songWapLinkUrl, parama.field_songWebUrl, parama.field_songWifiUrl });
    if ((!bg.nm(parama.field_songWapLinkUrl)) || (!bg.nm(parama.field_songWebUrl)) || (!bg.nm(parama.field_songWifiUrl)))
    {
      GMTrace.o(4849823383552L, 36134);
      return true;
    }
    GMTrace.o(4849823383552L, 36134);
    return false;
  }
  
  public static boolean b(apv paramapv, Activity paramActivity)
  {
    GMTrace.i(4851299778560L, 36145);
    com.tencent.mm.plugin.report.service.g.ork.A(10910, "4");
    if (paramapv == null)
    {
      GMTrace.o(4851299778560L, 36145);
      return false;
    }
    String str = paramapv.uFy;
    int i;
    if (str == null)
    {
      i = -1;
      if (i >= 0) {
        break label126;
      }
      paramapv = null;
      label53:
      if (paramapv != null) {
        break label137;
      }
      w.e("MicroMsg.Music.MusicUtil", "wtf, get qq music data fail, url %s", new Object[] { str });
    }
    Uri localUri;
    for (paramapv = "androidqqmusic://";; paramapv = String.format("androidqqmusic://from=webPlayer&data=%s", new Object[] { paramapv }))
    {
      localUri = Uri.parse(paramapv);
      if (localUri != null) {
        break label171;
      }
      w.w("MicroMsg.Music.MusicUtil", "parse qq music action url fail, url %s", new Object[] { paramapv });
      GMTrace.o(4851299778560L, 36145);
      return false;
      i = str.indexOf("#p=");
      break;
      label126:
      paramapv = str.substring(i + 3);
      break label53;
      label137:
      w.i("MicroMsg.Music.MusicUtil", "get qq music data %s", new Object[] { paramapv });
    }
    label171:
    com.tencent.mm.at.b.JO();
    paramapv = new Intent("android.intent.action.VIEW", localUri);
    paramapv.addFlags(268435456);
    if (bg.j(paramActivity, paramapv))
    {
      paramActivity.startActivity(paramapv);
      GMTrace.o(4851299778560L, 36145);
      return true;
    }
    paramapv = new Intent();
    paramapv.putExtra("rawUrl", str);
    b.hnH.j(paramapv, paramActivity);
    GMTrace.o(4851299778560L, 36145);
    return false;
  }
  
  public static String c(com.tencent.mm.at.a parama, boolean paramBoolean)
  {
    GMTrace.i(4849554948096L, 36132);
    parama = b(parama, false) + "-thumb-" + paramBoolean;
    GMTrace.o(4849554948096L, 36132);
    return parama;
  }
  
  public static void c(apv paramapv, Activity paramActivity)
  {
    GMTrace.i(4851702431744L, 36148);
    Object localObject1 = new WXMusicObject();
    ((WXMusicObject)localObject1).musicUrl = paramapv.uFy;
    ((WXMusicObject)localObject1).musicDataUrl = paramapv.uFw;
    ((WXMusicObject)localObject1).musicLowBandUrl = paramapv.uFx;
    ((WXMusicObject)localObject1).musicLowBandDataUrl = paramapv.uFx;
    WXMediaMessage localWXMediaMessage = new WXMediaMessage();
    localWXMediaMessage.mediaObject = ((WXMediaMessage.IMediaObject)localObject1);
    localWXMediaMessage.title = paramapv.uFs;
    localWXMediaMessage.description = paramapv.uFt;
    Bundle localBundle = null;
    Object localObject2 = i(paramapv);
    localObject1 = localBundle;
    if (localObject2 != null)
    {
      localObject1 = localBundle;
      if (FileOp.aZ((String)localObject2))
      {
        int i = (int)paramActivity.getResources().getDimension(R.f.aQy);
        localObject1 = com.tencent.mm.sdk.platformtools.d.U((String)localObject2, i, i);
      }
    }
    if (localObject1 != null) {}
    for (localWXMediaMessage.thumbData = bg.S((Bitmap)localObject1);; localWXMediaMessage.thumbData = bg.S(com.tencent.mm.sdk.platformtools.d.Ag(R.g.aVU)))
    {
      localObject1 = new Intent();
      localBundle = new Bundle();
      localObject2 = new SendMessageToWX.Req();
      ((SendMessageToWX.Req)localObject2).message = localWXMediaMessage;
      ((SendMessageToWX.Req)localObject2).toBundle(localBundle);
      ((Intent)localObject1).putExtra("Ksnsupload_timeline", localBundle);
      ((Intent)localObject1).putExtra("Ksnsupload_musicid", paramapv.ucY);
      ((Intent)localObject1).putExtra("Ksnsupload_appid", j(paramapv));
      ((Intent)localObject1).putExtra("Ksnsupload_appname", k(paramapv));
      paramapv = u.gy("music_player");
      u.Av().p(paramapv, true).o("prePublishId", "music_player");
      ((Intent)localObject1).putExtra("reportSessionId", paramapv);
      b.hnH.n((Intent)localObject1, paramActivity);
      GMTrace.o(4851702431744L, 36148);
      return;
    }
  }
  
  public static boolean c(com.tencent.mm.at.a parama)
  {
    GMTrace.i(20505247612928L, 152776);
    if (parama == null)
    {
      GMTrace.o(20505247612928L, 152776);
      return false;
    }
    if ((TextUtils.isEmpty(parama.field_songWifiUrl)) && (TextUtils.isEmpty(parama.field_songWapLinkUrl)) && (TextUtils.isEmpty(parama.field_songWebUrl)))
    {
      GMTrace.o(20505247612928L, 152776);
      return false;
    }
    GMTrace.o(20505247612928L, 152776);
    return true;
  }
  
  public static String cT(Context paramContext)
  {
    GMTrace.i(4849286512640L, 36130);
    String str = "";
    Object localObject = ab.getPackageName();
    if (localObject == null)
    {
      GMTrace.o(4849286512640L, 36130);
      return "";
    }
    for (;;)
    {
      try
      {
        localObject = paramContext.getPackageManager().getPackageInfo((String)localObject, 0);
        paramContext = str;
        if (localObject != null) {
          paramContext = "" + ((PackageInfo)localObject).versionName;
        }
        w.printErrStackTrace("MicroMsg.Music.MusicUtil", localNameNotFoundException1, "", new Object[0]);
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException1)
      {
        try
        {
          str = paramContext + "." + ((PackageInfo)localObject).versionCode;
          paramContext = str;
          GMTrace.o(4849286512640L, 36130);
          return paramContext;
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException2)
        {
          for (;;) {}
        }
        localNameNotFoundException1 = localNameNotFoundException1;
        paramContext = str;
      }
    }
  }
  
  private static String f(apv paramapv)
  {
    GMTrace.i(4850762907648L, 36141);
    if (paramapv != null) {
      if (!bg.nm(paramapv.uFw)) {
        str = paramapv.uFw;
      }
    }
    while (str == null)
    {
      GMTrace.o(4850762907648L, 36141);
      return null;
      if (!bg.nm(paramapv.uFy)) {
        str = paramapv.uFy;
      } else if (!bg.nm(paramapv.uFx)) {
        str = paramapv.uFx;
      } else {
        str = null;
      }
    }
    String str = Dm(paramapv.uFw);
    if (str != null)
    {
      GMTrace.o(4850762907648L, 36141);
      return str;
    }
    str = Dm(paramapv.uFy);
    if (str != null)
    {
      GMTrace.o(4850762907648L, 36141);
      return str;
    }
    paramapv = Dm(paramapv.uFx);
    GMTrace.o(4850762907648L, 36141);
    return paramapv;
  }
  
  public static apv g(apv paramapv)
  {
    GMTrace.i(4850897125376L, 36142);
    if (paramapv != null)
    {
      paramapv.usQ = Do(paramapv.uFw);
      if (paramapv.usQ <= 0)
      {
        paramapv.usQ = Do(paramapv.uFy);
        if (paramapv.usQ <= 0)
        {
          paramapv.usQ = Do(paramapv.uFx);
          i = paramapv.usQ;
        }
      }
    }
    if ((paramapv == null) || (f(paramapv) == null))
    {
      GMTrace.o(4850897125376L, 36142);
      return paramapv;
    }
    long l = System.currentTimeMillis();
    Object localObject = f(paramapv);
    if (localObject == null)
    {
      GMTrace.o(4850897125376L, 36142);
      return paramapv;
    }
    w.d("MicroMsg.Music.MusicUtil", "bcdUrl: %s", new Object[] { localObject });
    String str = new String(Dn((String)localObject));
    int i = str.indexOf("{");
    localObject = str;
    if (i != -1) {
      localObject = str.substring(i);
    }
    try
    {
      localObject = new JSONObject((String)localObject);
      paramapv.usQ = ((JSONObject)localObject).optInt("song_ID");
      if (bg.nm(paramapv.uFs)) {
        paramapv.uFs = ((JSONObject)localObject).optString("song_Name");
      }
      if (bg.nm(paramapv.uFx)) {
        paramapv.uFx = ((JSONObject)localObject).optString("song_WapLiveURL");
      }
      if (bg.nm(paramapv.uFw)) {
        paramapv.uFw = ((JSONObject)localObject).optString("song_WifiURL");
      }
      if (bg.nm(paramapv.uFu)) {
        paramapv.uFu = ((JSONObject)localObject).optString("song_Album");
      }
      if (bg.nm(paramapv.uFt)) {
        paramapv.uFt = ((JSONObject)localObject).optString("song_Singer");
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.Music.MusicUtil", localException, "", new Object[0]);
      }
    }
    if (paramapv.usQ == 0) {
      paramapv.usQ = Do(npZ);
    }
    w.i("MicroMsg.Music.MusicUtil", "parseBCDForMusicWrapper %s: expend: %d %d", new Object[] { paramapv.ucY, Long.valueOf(System.currentTimeMillis() - l), Integer.valueOf(paramapv.usQ) });
    GMTrace.o(4850897125376L, 36142);
    return paramapv;
  }
  
  public static String h(apv paramapv)
  {
    GMTrace.i(4851031343104L, 36143);
    if (paramapv.uFq == 6)
    {
      paramapv = "6_" + aa.RP(paramapv.ucY);
      GMTrace.o(4851031343104L, 36143);
      return paramapv;
    }
    paramapv = "0_" + aa.RP(paramapv.ucY);
    GMTrace.o(4851031343104L, 36143);
    return paramapv;
  }
  
  private static String i(apv paramapv)
  {
    GMTrace.i(4851836649472L, 36149);
    Object localObject = h.aSt().DO(h(paramapv));
    if (localObject == null)
    {
      GMTrace.o(4851836649472L, 36149);
      return "";
    }
    String str = c((com.tencent.mm.at.a)localObject, true);
    localObject = str;
    if (!FileOp.aZ(str)) {
      switch (paramapv.uFq)
      {
      case 1: 
      case 2: 
      case 3: 
      case 8: 
      case 9: 
      default: 
        localObject = str;
        if (com.tencent.mm.plugin.sns.b.n.poP != null)
        {
          localObject = new anu();
          ((anu)localObject).mmR = paramapv.ugf;
          ((anu)localObject).uCO = paramapv.uFv;
          ((anu)localObject).uCP = paramapv.uFC;
          ((anu)localObject).lPM = ((anu)localObject).uCO;
          localObject = com.tencent.mm.plugin.sns.b.n.poO.a((anu)localObject);
        }
        break;
      }
    }
    for (;;)
    {
      w.i("MicroMsg.Music.MusicUtil", "real album path = %s", new Object[] { localObject });
      GMTrace.o(4851836649472L, 36149);
      return (String)localObject;
      str = p.a.bIQ().Go(paramapv.uFv);
      localObject = str;
      if (bg.nm(str))
      {
        localObject = paramapv.uFA;
        continue;
        localObject = com.tencent.mm.ao.n.IZ().x(paramapv.uFA, true);
        continue;
        if (paramapv.uFA == null)
        {
          localObject = "";
        }
        else
        {
          localObject = paramapv.uFA;
          continue;
          if (paramapv.uFA == null)
          {
            localObject = "";
          }
          else
          {
            localObject = paramapv.uFA;
            continue;
            if (paramapv.uFA == null) {
              localObject = "";
            } else {
              localObject = paramapv.uFA;
            }
          }
        }
      }
    }
  }
  
  private static int j(char paramChar)
  {
    GMTrace.i(4850628689920L, 36140);
    int j = 0;
    int i;
    if ((paramChar >= '1') && (paramChar <= '9')) {
      i = paramChar - '0';
    }
    for (;;)
    {
      GMTrace.o(4850628689920L, 36140);
      return i;
      i = j;
      if (paramChar >= 'A')
      {
        i = j;
        if (paramChar <= 'F') {
          i = paramChar - 'A' + 10;
        }
      }
    }
  }
  
  public static String j(apv paramapv)
  {
    GMTrace.i(4851970867200L, 36150);
    String str2 = paramapv.lQa;
    String str1 = str2;
    if (bg.nm(str2)) {
      switch (paramapv.uFq)
      {
      default: 
        str1 = str2;
      }
    }
    for (;;)
    {
      GMTrace.o(4851970867200L, 36150);
      return str1;
      str1 = "wx482a4001c37e2b74";
      continue;
      str1 = "wx485a97c844086dc9";
    }
  }
  
  private static String k(apv paramapv)
  {
    GMTrace.i(4852105084928L, 36151);
    switch (paramapv.uFq)
    {
    case 2: 
    case 3: 
    case 6: 
    case 7: 
    default: 
      paramapv = ab.getContext().getString(R.l.dmt);
      GMTrace.o(4852105084928L, 36151);
      return paramapv;
    case 0: 
    case 1: 
    case 8: 
      paramapv = ab.getContext().getString(R.l.edo);
      GMTrace.o(4852105084928L, 36151);
      return paramapv;
    case 5: 
      paramapv = ab.getContext().getString(R.l.dVx);
      GMTrace.o(4852105084928L, 36151);
      return paramapv;
    }
    paramapv = ab.getContext().getString(R.l.ebZ);
    GMTrace.o(4852105084928L, 36151);
    return paramapv;
  }
  
  public static boolean rn(int paramInt)
  {
    GMTrace.i(15011716005888L, 111846);
    switch (paramInt)
    {
    default: 
      if (com.tencent.mm.plugin.music.a.f.g.rA(paramInt))
      {
        GMTrace.o(15011716005888L, 111846);
        return true;
      }
      break;
    case 10: 
    case 11: 
      GMTrace.o(15011716005888L, 111846);
      return true;
    }
    GMTrace.o(15011716005888L, 111846);
    return false;
  }
  
  public static void z(Activity paramActivity)
  {
    GMTrace.i(4851433996288L, 36146);
    Intent localIntent = new Intent();
    localIntent.putExtra("mutil_select_is_ret", true);
    localIntent.putExtra("scene_from", 6);
    com.tencent.mm.bj.d.a(paramActivity, ".ui.transmit.SelectConversationUI", localIntent, 1);
    GMTrace.o(4851433996288L, 36146);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
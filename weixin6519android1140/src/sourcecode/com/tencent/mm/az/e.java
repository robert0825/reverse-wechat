package com.tencent.mm.az;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.a.o;
import com.tencent.mm.bt.g;
import com.tencent.mm.kernel.h;
import com.tencent.mm.platformtools.SpellMap;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.protocal.c.all;
import com.tencent.mm.protocal.c.apv;
import com.tencent.mm.protocal.c.aqm;
import com.tencent.mm.protocal.c.bil;
import com.tencent.mm.protocal.c.bms;
import com.tencent.mm.protocal.c.btj;
import com.tencent.mm.protocal.c.bvf;
import com.tencent.mm.protocal.c.nq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class e
{
  public static final int gRg;
  public static final Pattern gRh;
  
  static
  {
    GMTrace.i(1317749653504L, 9818);
    gRg = Color.parseColor("#45C01A");
    gRh = Pattern.compile(";");
    GMTrace.o(1317749653504L, 9818);
  }
  
  public static all CO()
  {
    GMTrace.i(1315199516672L, 9799);
    try
    {
      at.AR();
      Object localObject = (String)com.tencent.mm.y.c.xh().get(67591, null);
      if (localObject != null)
      {
        all localall = new all();
        localObject = ((String)localObject).split(",");
        localall.ujb = Integer.valueOf(localObject[0]).intValue();
        localall.uje = Integer.valueOf(localObject[1]).intValue();
        localall.tYz = (Integer.valueOf(localObject[2]).intValue() / 1000000.0F);
        localall.tYy = (Integer.valueOf(localObject[3]).intValue() / 1000000.0F);
        w.i("MicroMsg.FTS.FTSExportLogic", "lbs location is not null, %f, %f", new Object[] { Float.valueOf(localall.tYz), Float.valueOf(localall.tYy) });
        GMTrace.o(1315199516672L, 9799);
        return localall;
      }
      w.i("MicroMsg.FTS.FTSExportLogic", "lbs location is null, lbsContent is null!");
      GMTrace.o(1315199516672L, 9799);
      return null;
    }
    catch (Exception localException)
    {
      w.i("MicroMsg.FTS.FTSExportLogic", "lbs location is null, reason %s", new Object[] { localException.getMessage() });
      GMTrace.o(1315199516672L, 9799);
    }
    return null;
  }
  
  public static int GL()
  {
    GMTrace.i(1315602169856L, 9802);
    int i = i.GL();
    GMTrace.o(1315602169856L, 9802);
    return i;
  }
  
  public static boolean Kr()
  {
    GMTrace.i(1315467952128L, 9801);
    boolean bool = gL(0);
    GMTrace.o(1315467952128L, 9801);
    return bool;
  }
  
  public static String Ku()
  {
    GMTrace.i(1316541693952L, 9809);
    if (am.isWifi(ab.getContext()))
    {
      GMTrace.o(1316541693952L, 9809);
      return "wifi";
    }
    if (am.is4G(ab.getContext()))
    {
      GMTrace.o(1316541693952L, 9809);
      return "4g";
    }
    if (am.is3G(ab.getContext()))
    {
      GMTrace.o(1316541693952L, 9809);
      return "3g";
    }
    if (am.is2G(ab.getContext()))
    {
      GMTrace.o(1316541693952L, 9809);
      return "2g";
    }
    if (!am.isConnected(ab.getContext()))
    {
      GMTrace.o(1316541693952L, 9809);
      return "fail";
    }
    GMTrace.o(1316541693952L, 9809);
    return "";
  }
  
  public static Intent Kv()
  {
    GMTrace.i(1317078564864L, 9813);
    Intent localIntent = o(new Intent());
    GMTrace.o(1317078564864L, 9813);
    return localIntent;
  }
  
  public static boolean Kw()
  {
    GMTrace.i(19136629440512L, 142579);
    JSONObject localJSONObject = l.kM("snsContactMatch");
    if (localJSONObject != null)
    {
      if (localJSONObject.optInt("matchSwitch") == 1)
      {
        GMTrace.o(19136629440512L, 142579);
        return true;
      }
      GMTrace.o(19136629440512L, 142579);
      return false;
    }
    GMTrace.o(19136629440512L, 142579);
    return false;
  }
  
  public static int Kx()
  {
    GMTrace.i(19136763658240L, 142580);
    JSONObject localJSONObject = l.kM("snsContactMatch");
    if (localJSONObject != null)
    {
      int i = localJSONObject.optInt("queryUtfLenLimit");
      GMTrace.o(19136763658240L, 142580);
      return i;
    }
    GMTrace.o(19136763658240L, 142580);
    return 0;
  }
  
  public static int a(JSONObject paramJSONObject, String paramString, Context paramContext)
  {
    GMTrace.i(16867141877760L, 125670);
    int j;
    int i;
    if (paramJSONObject == null)
    {
      j = 0;
      i = j;
      if (j == 0)
      {
        if (!paramString.equals(paramContext.getString(R.l.dWp))) {
          break label60;
        }
        i = 2;
      }
    }
    for (;;)
    {
      GMTrace.o(16867141877760L, 125670);
      return i;
      j = paramJSONObject.optInt("businessType");
      break;
      label60:
      if (paramString.equals(paramContext.getString(R.l.dWs)))
      {
        i = 8;
      }
      else if (paramString.equals(paramContext.getString(R.l.dWq)))
      {
        i = 1;
      }
      else
      {
        w.i("MicroMsg.FTS.FTSExportLogic", "option " + paramString + " no type");
        i = j;
      }
    }
  }
  
  public static Drawable a(int paramInt, Context paramContext)
  {
    GMTrace.i(16867276095488L, 125671);
    int i = R.k.cOX;
    switch (paramInt)
    {
    default: 
      paramInt = i;
    }
    for (;;)
    {
      paramContext = paramContext.getResources().getDrawable(paramInt);
      GMTrace.o(16867276095488L, 125671);
      return paramContext;
      paramInt = R.k.cOW;
      continue;
      paramInt = R.k.cOT;
      continue;
      paramInt = R.k.cOP;
      continue;
      paramInt = R.k.cOS;
      continue;
      paramInt = R.k.cOQ;
      continue;
      paramInt = R.k.cOU;
      continue;
      paramInt = R.k.cOV;
    }
  }
  
  public static Spannable a(CharSequence paramCharSequence, String paramString)
  {
    GMTrace.i(17863842725888L, 133096);
    paramCharSequence = com.tencent.mm.plugin.fts.d.f.b(com.tencent.mm.plugin.fts.d.b.a.d(paramCharSequence, paramString));
    if ((paramCharSequence.lAJ instanceof Spannable))
    {
      paramCharSequence = (Spannable)paramCharSequence.lAJ;
      GMTrace.o(17863842725888L, 133096);
      return paramCharSequence;
    }
    paramCharSequence = new SpannableString(paramCharSequence.lAJ);
    GMTrace.o(17863842725888L, 133096);
    return paramCharSequence;
  }
  
  public static Spannable a(CharSequence paramCharSequence, List<String> paramList)
  {
    GMTrace.i(17863976943616L, 133097);
    paramCharSequence = com.tencent.mm.plugin.fts.d.f.b(com.tencent.mm.plugin.fts.d.b.a.b(paramCharSequence, paramList));
    if ((paramCharSequence.lAJ instanceof Spannable))
    {
      paramCharSequence = (Spannable)paramCharSequence.lAJ;
      GMTrace.o(17863976943616L, 133097);
      return paramCharSequence;
    }
    paramCharSequence = new SpannableString(paramCharSequence.lAJ);
    GMTrace.o(17863976943616L, 133097);
    return paramCharSequence;
  }
  
  public static Spannable a(CharSequence paramCharSequence, List<String> paramList, String paramString)
  {
    GMTrace.i(17864245379072L, 133099);
    paramCharSequence = com.tencent.mm.plugin.fts.d.f.b(com.tencent.mm.plugin.fts.d.b.a.a(paramCharSequence, paramString, paramList));
    if ((paramCharSequence.lAJ instanceof Spannable))
    {
      paramCharSequence = (Spannable)paramCharSequence.lAJ;
      GMTrace.o(17864245379072L, 133099);
      return paramCharSequence;
    }
    paramCharSequence = new SpannableString(paramCharSequence.lAJ);
    GMTrace.o(17864245379072L, 133099);
    return paramCharSequence;
  }
  
  public static Spannable a(CharSequence paramCharSequence, List<String> paramList, boolean paramBoolean, String paramString)
  {
    GMTrace.i(17864379596800L, 133100);
    paramCharSequence = com.tencent.mm.plugin.fts.d.f.b(com.tencent.mm.plugin.fts.d.b.a.a(paramCharSequence, paramString, paramList, true, paramBoolean));
    if ((paramCharSequence.lAJ instanceof Spannable))
    {
      paramCharSequence = (Spannable)paramCharSequence.lAJ;
      GMTrace.o(17864379596800L, 133100);
      return paramCharSequence;
    }
    paramCharSequence = new SpannableString(paramCharSequence.lAJ);
    GMTrace.o(17864379596800L, 133100);
    return paramCharSequence;
  }
  
  private static String a(String paramString, a parama)
  {
    GMTrace.i(1312917815296L, 9782);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(paramString.substring(0, parama.start));
    localStringBuffer.append("<em class=\"highlight\">");
    localStringBuffer.append(paramString.substring(parama.start, parama.end));
    localStringBuffer.append("</em>");
    if (parama.end < paramString.length()) {
      localStringBuffer.append(paramString.substring(parama.end, paramString.length()));
    }
    paramString = localStringBuffer.toString();
    GMTrace.o(1312917815296L, 9782);
    return paramString;
  }
  
  public static String a(String paramString1, List<String> paramList, boolean paramBoolean, String paramString2)
  {
    GMTrace.i(1312380944384L, 9778);
    if (bg.nm(paramString1))
    {
      GMTrace.o(1312380944384L, 9778);
      return "";
    }
    paramString2 = b(paramString1, paramString2);
    if (paramString2.isAvailable())
    {
      paramString1 = a(paramString1, paramString2);
      GMTrace.o(1312380944384L, 9778);
      return paramString1;
    }
    paramString2 = new ArrayList();
    int i = 0;
    if (i < paramString1.length())
    {
      char c = paramString1.charAt(i);
      String str;
      if (com.tencent.mm.plugin.fts.a.d.h(c))
      {
        str = SpellMap.f(c);
        if ((str != null) && (str.length() > 1)) {
          if (paramBoolean) {
            paramString2.add(str.substring(0, 1).toLowerCase());
          }
        }
      }
      for (;;)
      {
        i += 1;
        break;
        paramString2.add(str);
        continue;
        paramString2.add("");
        continue;
        paramString2.add("");
      }
    }
    paramList = c(paramString2, paramList).iterator();
    while (paramList.hasNext()) {
      paramString1 = a(paramString1, (a)paramList.next());
    }
    GMTrace.o(1312380944384L, 9778);
    return paramString1;
  }
  
  public static String a(Map<String, String> paramMap, int paramInt)
  {
    GMTrace.i(20385525399552L, 151884);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("file://");
    switch (paramInt)
    {
    }
    for (Object localObject = i.Ko();; localObject = c.Ko())
    {
      localStringBuffer.append((String)localObject);
      if (paramMap.size() <= 0) {
        break label241;
      }
      localStringBuffer.append("/app.html?");
      localObject = paramMap.entrySet().iterator();
      while (((Iterator)localObject).hasNext())
      {
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
        localStringBuffer.append((String)localEntry.getKey());
        localStringBuffer.append("=");
        localStringBuffer.append((String)localEntry.getValue());
        localStringBuffer.append("&");
      }
    }
    if (!paramMap.containsKey("sessionId"))
    {
      localStringBuffer.append("sessionId");
      localStringBuffer.append("=");
      localStringBuffer.append(gN(bg.Sy((String)paramMap.get("scene"))));
      localStringBuffer.append("&");
    }
    paramMap = localStringBuffer.substring(0, localStringBuffer.length() - 1);
    GMTrace.o(20385525399552L, 151884);
    return paramMap;
    label241:
    localStringBuffer.append("/app.html");
    paramMap = localStringBuffer.toString();
    GMTrace.o(20385525399552L, 151884);
    return paramMap;
  }
  
  public static Map<String, String> a(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    GMTrace.i(1316273258496L, 9807);
    Map localMap = a(paramInt1, paramBoolean, paramInt2, "");
    GMTrace.o(1316273258496L, 9807);
    return localMap;
  }
  
  public static Map<String, String> a(int paramInt1, boolean paramBoolean, int paramInt2, String paramString)
  {
    GMTrace.i(19136361005056L, 142577);
    HashMap localHashMap = new HashMap();
    localHashMap.put("scene", String.valueOf(paramInt1));
    localHashMap.put("type", String.valueOf(paramInt2));
    localHashMap.put("lang", v.eq(ab.getContext()));
    localHashMap.put("platform", "android");
    if (!TextUtils.isEmpty(paramString)) {
      localHashMap.put("extParams", paramString);
    }
    boolean bool6;
    boolean bool1;
    boolean bool4;
    boolean bool2;
    boolean bool5;
    boolean bool3;
    switch (paramInt1)
    {
    default: 
      paramString = String.valueOf(i.GL());
      localHashMap.put("version", paramString);
      bool6 = false;
      bool1 = false;
      bool4 = false;
      bool2 = false;
      bool5 = false;
      bool3 = false;
      switch (paramInt1)
      {
      default: 
        bool6 = bool2;
        bool4 = bool3;
        bool5 = bool1;
        label248:
        bool2 = bool6;
        bool3 = bool5;
        bool1 = bool4;
      }
      break;
    }
    for (;;)
    {
      w.i("MicroMsg.FTS.FTSExportLogic", "genFTSParams scene=%d isHomePage=%b type=%d %b %b %b", new Object[] { Integer.valueOf(paramInt1), Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt2), Boolean.valueOf(bool3), Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
      if (bool3) {
        localHashMap.put("isSug", "1");
      }
      if (bool2) {
        localHashMap.put("isLocalSug", "1");
      }
      if (bool1) {
        localHashMap.put("isMostSearchBiz", "1");
      }
      if (!paramBoolean) {
        localHashMap.put("isHomePage", "0");
      }
      float f2 = com.tencent.mm.br.a.dZ(ab.getContext());
      float f1 = f2;
      if (f2 != 1.0F)
      {
        f1 = f2;
        if (f2 != 0.875F)
        {
          f1 = f2;
          if (f2 != 1.125F)
          {
            f1 = f2;
            if (f2 != 1.25F)
            {
              f1 = f2;
              if (f2 != 1.375F)
              {
                f1 = f2;
                if (f2 != 1.625F)
                {
                  f1 = f2;
                  if (f2 != 1.875F)
                  {
                    f1 = f2;
                    if (f2 != 2.025F) {
                      f1 = 1.0F;
                    }
                  }
                }
              }
            }
          }
        }
      }
      localHashMap.put("fontRatio", String.valueOf(f1));
      localHashMap.put("netType", Ku());
      if (com.tencent.mm.at.b.JQ())
      {
        paramString = com.tencent.mm.at.b.JS();
        if (paramString != null) {
          localHashMap.put("musicSnsId", paramString.ucY);
        }
      }
      GMTrace.o(19136361005056L, 142577);
      return localHashMap;
      paramString = String.valueOf(c.GL());
      break;
      paramString = l.kM("mixGlobal");
      if (paramBoolean)
      {
        bool5 = bool1;
        bool4 = bool3;
        bool6 = bool2;
        if (paramString.optInt("mixSugSwitch", 0) != 1) {
          break label248;
        }
        bool2 = false;
        bool3 = true;
        bool1 = false;
        continue;
      }
      if (paramInt2 == 1)
      {
        bool5 = bool1;
        bool4 = bool3;
        bool6 = bool2;
        if (paramString.optInt("bizSugSwitch", 0) != 1) {
          break label248;
        }
        bool2 = false;
        bool3 = true;
        bool1 = false;
        continue;
      }
      if (paramInt2 == 8)
      {
        bool5 = bool1;
        bool4 = bool3;
        bool6 = bool2;
        if (paramString.optInt("snsSugSwitch", 0) != 1) {
          break label248;
        }
        bool2 = false;
        bool3 = true;
        bool1 = false;
        continue;
      }
      if (paramInt2 == 1024)
      {
        bool5 = bool1;
        bool4 = bool3;
        bool6 = bool2;
        if (paramString.optInt("novelSugSwitch", 0) != 1) {
          break label248;
        }
        bool2 = false;
        bool3 = true;
        bool1 = false;
        continue;
      }
      if (paramInt2 == 512)
      {
        bool5 = bool1;
        bool4 = bool3;
        bool6 = bool2;
        if (paramString.optInt("musicSugSwitch", 0) != 1) {
          break label248;
        }
        bool2 = false;
        bool3 = true;
        bool1 = false;
        continue;
      }
      if ((paramInt2 != 384) && (paramInt2 != 256))
      {
        bool5 = bool1;
        bool4 = bool3;
        bool6 = bool2;
        if (paramInt2 != 128) {
          break label248;
        }
      }
      bool5 = bool1;
      bool4 = bool3;
      bool6 = bool2;
      if (paramString.optInt("emotionSugSwitch", 0) != 1) {
        break label248;
      }
      bool2 = false;
      bool3 = true;
      bool1 = false;
      continue;
      bool1 = bool6;
      if (paramInt2 == 1)
      {
        bool1 = bool6;
        if (l.kM("bizTab").optInt("bizSugSwitch", 0) == 1) {
          bool1 = true;
        }
      }
      bool2 = bool1;
      if (paramInt2 == 2)
      {
        bool2 = bool1;
        if (l.kM("articleTab").optInt("sugSwitch", 0) == 1) {
          bool2 = true;
        }
      }
      bool3 = bool2;
      bool1 = bool4;
      if (paramInt2 == 8)
      {
        paramString = l.kM("snsTab");
        if (paramString.optInt("sugSwitch", 0) == 1) {
          bool2 = true;
        }
        bool3 = bool2;
        bool1 = bool4;
        if (paramString.optInt("localSugSwitch", 0) == 1)
        {
          bool1 = true;
          bool3 = bool2;
        }
      }
      bool4 = bool3;
      if (!paramBoolean)
      {
        bool4 = bool3;
        if (paramInt2 == 4)
        {
          bool4 = bool3;
          if (l.kM("bizTab").optInt("bizServiceSugSwitch", 0) == 1) {
            bool4 = true;
          }
        }
      }
      bool2 = bool5;
      if (paramInt2 == 1)
      {
        bool2 = bool5;
        if (l.kM("bizTab").optInt("mfsBizSwitch", 0) == 1) {
          bool2 = true;
        }
      }
      bool3 = bool4;
      if (paramInt2 == 1024)
      {
        bool3 = bool4;
        if (l.kM("novelTab").optInt("sugSwitch", 0) == 1) {
          bool3 = true;
        }
      }
      bool4 = bool3;
      if (paramInt2 == 512)
      {
        bool4 = bool3;
        if (l.kM("musicTab").optInt("sugSwitch", 0) == 1) {
          bool4 = true;
        }
      }
      bool3 = bool4;
      if (paramInt2 == 384)
      {
        bool3 = bool4;
        if (l.kM("emotionTab").optInt("sugSwitch", 0) == 1) {
          bool3 = true;
        }
      }
      bool5 = bool3;
      bool4 = bool2;
      bool6 = bool1;
      if (paramInt2 != 0) {
        break label248;
      }
      bool5 = bool3;
      bool4 = bool2;
      bool6 = bool1;
      if (!paramBoolean) {
        break label248;
      }
      if (l.kM("mixGlobal").optInt("mixSugSwitch", 0) == 1) {
        bool3 = true;
      }
      bool4 = bool1;
      bool1 = bool2;
      bool2 = bool4;
      continue;
      bool5 = bool1;
      bool4 = bool3;
      bool6 = bool2;
      if (l.kM("bizEntry").optInt("sugSwitch") != 1) {
        break label248;
      }
      bool2 = false;
      bool3 = true;
      bool1 = false;
      continue;
      bool5 = bool1;
      bool4 = bool3;
      bool6 = bool2;
      if (l.kM("bizUnionTopEntry").optInt("sugSwitch") != 1) {
        break label248;
      }
      bool2 = false;
      bool3 = true;
      bool1 = false;
      continue;
      bool5 = bool1;
      bool4 = bool3;
      bool6 = bool2;
      if (paramInt2 != 384) {
        break label248;
      }
      bool5 = bool1;
      bool4 = bool3;
      bool6 = bool2;
      if (l.kM("emoticonMall").optInt("sugSwitch", 0) != 1) {
        break label248;
      }
      bool2 = false;
      bool3 = true;
      bool1 = false;
    }
  }
  
  public static void a(Context paramContext, String paramString1, Intent paramIntent, String paramString2)
  {
    GMTrace.i(20357205458944L, 151673);
    a(paramContext, paramString1, paramIntent, paramString2, null, null);
    GMTrace.o(20357205458944L, 151673);
  }
  
  public static void a(Context paramContext, String paramString1, Intent paramIntent, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(20357339676672L, 151674);
    if ((paramIntent == null) || (paramContext == null))
    {
      w.e("MicroMsg.FTS.FTSExportLogic", "openNews intent is null, or context is null");
      GMTrace.o(20357339676672L, 151674);
      return;
    }
    paramIntent = o(paramIntent);
    paramIntent.putExtra("ftsbizscene", 21);
    paramIntent.putExtra("ftsQuery", paramString1);
    if (paramString2 != null) {
      paramIntent.putExtra("title", paramString2);
    }
    paramIntent.putExtra("isWebwx", paramString1);
    paramIntent.putExtra("ftscaneditable", false);
    paramIntent.putExtra("key_load_js_without_delay", true);
    paramString2 = a(21, false, 2, paramString3);
    if (paramString4 != null) {
      paramString2.put("searchId", paramString4);
    }
    paramString2.put("query", paramString1);
    paramString2.put("sceneActionType", "2");
    paramString2.put("sessionId", gN(bg.Sy((String)paramString2.get("scene"))));
    paramIntent.putExtra("rawUrl", a(paramString2, 1));
    com.tencent.mm.bj.d.b(paramContext, "webview", ".ui.tools.fts.FTSWebViewUI", paramIntent);
    GMTrace.o(20357339676672L, 151674);
  }
  
  private static void a(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    GMTrace.i(1316004823040L, 9805);
    byte[] arrayOfByte = new byte['Ѐ'];
    for (;;)
    {
      int i = paramInputStream.read(arrayOfByte);
      if (i == -1) {
        break;
      }
      paramOutputStream.write(arrayOfByte, 0, i);
    }
    GMTrace.o(1316004823040L, 9805);
  }
  
  public static Map<String, String> aW(int paramInt1, int paramInt2)
  {
    GMTrace.i(19136226787328L, 142576);
    switch (paramInt1)
    {
    default: 
      localMap = a(paramInt1, false, paramInt2);
      GMTrace.o(19136226787328L, 142576);
      return localMap;
    }
    Map localMap = r.a(paramInt1, false, paramInt2);
    GMTrace.o(19136226787328L, 142576);
    return localMap;
  }
  
  public static boolean ah(String paramString1, String paramString2)
  {
    int i = 0;
    GMTrace.i(17864513814528L, 133101);
    if (paramString1 == paramString2)
    {
      GMTrace.o(17864513814528L, 133101);
      return true;
    }
    if (TextUtils.isEmpty(paramString1))
    {
      GMTrace.o(17864513814528L, 133101);
      return false;
    }
    if (paramString1.startsWith(paramString2))
    {
      GMTrace.o(17864513814528L, 133101);
      return true;
    }
    if (TextUtils.isEmpty(paramString1)) {}
    StringBuilder localStringBuilder;
    for (paramString1 = "";; paramString1 = localStringBuilder.toString())
    {
      boolean bool = paramString1.startsWith(paramString2);
      GMTrace.o(17864513814528L, 133101);
      return bool;
      localStringBuilder = new StringBuilder(paramString1.length());
      while (i < paramString1.length())
      {
        localStringBuilder.append(SpellMap.f(paramString1.charAt(i)));
        i += 1;
      }
    }
  }
  
  private static a b(CharSequence paramCharSequence, String paramString)
  {
    GMTrace.i(1312112508928L, 9776);
    paramString = SpellMap.nj(paramString.toLowerCase());
    g.bRE();
    String str = paramCharSequence.toString();
    str = com.tencent.mm.bt.f.bRB().fb(str, "");
    com.tencent.mm.bt.b.bRv();
    paramString = c(SpellMap.nj(com.tencent.mm.bt.b.fa(str, "").replaceAll(" ", "").toLowerCase()), paramString);
    if (paramString.isAvailable())
    {
      int i = paramString.start;
      while ((i < paramString.end) && (i < paramCharSequence.length()))
      {
        if (paramCharSequence.charAt(i) == ' ') {
          paramString.end += 1;
        }
        i += 1;
      }
    }
    GMTrace.o(1312112508928L, 9776);
    return paramString;
  }
  
  private static a b(List<String> paramList, String paramString)
  {
    GMTrace.i(1313186250752L, 9784);
    a locala = new a();
    int i = 0;
    String str;
    if (i < paramList.size())
    {
      str = (String)paramList.get(i);
      if (bg.nm(str)) {
        break label218;
      }
      if (str.startsWith(paramString))
      {
        if (locala.start < 0) {
          locala.start = i;
        }
        locala.end = (i + 1);
      }
    }
    else
    {
      GMTrace.o(1313186250752L, 9784);
      return locala;
    }
    int j;
    if (paramString.startsWith(str)) {
      j = i + 1;
    }
    for (;;)
    {
      if ((j < paramList.size()) && (!bg.nm((String)paramList.get(j))))
      {
        str = str + (String)paramList.get(j);
        if ((paramString.length() > str.length()) && (paramString.startsWith(str))) {
          break label225;
        }
        if ((paramString.length() <= str.length()) && (str.startsWith(paramString)))
        {
          locala.start = i;
          locala.end = (j + 1);
        }
      }
      label218:
      i += 1;
      break;
      label225:
      j += 1;
    }
  }
  
  public static String b(String paramString1, List<String> paramList, String paramString2)
  {
    GMTrace.i(17864111161344L, 133098);
    if (bg.nm(paramString1))
    {
      GMTrace.o(17864111161344L, 133098);
      return "";
    }
    Object localObject = paramString2;
    if (paramString2 == null) {
      localObject = bg.c(paramList, "");
    }
    paramString2 = SpellMap.nj(((String)localObject).toLowerCase());
    paramString2 = c(SpellMap.nj(paramString1.toString().toLowerCase()), paramString2);
    if (paramString2.isAvailable())
    {
      paramString1 = a(paramString1, paramString2);
      GMTrace.o(17864111161344L, 133098);
      return paramString1;
    }
    paramString2 = b(paramString1, bg.c(paramList, ""));
    if (paramString2.isAvailable())
    {
      paramString1 = a(paramString1, paramString2);
      GMTrace.o(17864111161344L, 133098);
      return paramString1;
    }
    paramString2 = SpellMap.nj(paramString1.toString().toLowerCase());
    localObject = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      a locala = c(paramString2, SpellMap.nj(((String)paramList.next()).toLowerCase()));
      if (locala.isAvailable()) {
        ((ArrayList)localObject).add(locala);
      }
    }
    if (((ArrayList)localObject).size() > 0)
    {
      paramList = ((ArrayList)localObject).iterator();
      while (paramList.hasNext()) {
        paramString1 = a(paramString1, (a)paramList.next());
      }
      GMTrace.o(17864111161344L, 133098);
      return paramString1;
    }
    GMTrace.o(17864111161344L, 133098);
    return paramString1;
  }
  
  private static a c(CharSequence paramCharSequence, String paramString)
  {
    GMTrace.i(1313454686208L, 9786);
    int i = paramCharSequence.toString().indexOf(paramString);
    paramCharSequence = new a();
    if (i >= 0)
    {
      paramCharSequence.start = i;
      paramCharSequence.end = (paramCharSequence.start + paramString.length());
    }
    GMTrace.o(1313454686208L, 9786);
    return paramCharSequence;
  }
  
  public static String c(int paramInt, Map<String, String> paramMap)
  {
    GMTrace.i(1316407476224L, 9808);
    switch (paramInt)
    {
    default: 
      paramMap = a(paramMap, 0);
      GMTrace.o(1316407476224L, 9808);
      return paramMap;
    case 201: 
      paramMap = r.n(paramMap);
      GMTrace.o(1316407476224L, 9808);
      return paramMap;
    }
    paramMap = a(paramMap, 1);
    GMTrace.o(1316407476224L, 9808);
    return paramMap;
  }
  
  private static ArrayList<a> c(List<String> paramList1, List<String> paramList2)
  {
    GMTrace.i(1313052033024L, 9783);
    ArrayList localArrayList = new ArrayList();
    paramList2 = paramList2.iterator();
    while (paramList2.hasNext())
    {
      a locala = b(paramList1, ((String)paramList2.next()).toLowerCase());
      if (locala.isAvailable()) {
        localArrayList.add(locala);
      }
    }
    GMTrace.o(1313052033024L, 9783);
    return localArrayList;
  }
  
  public static int gK(int paramInt)
  {
    GMTrace.i(20385122746368L, 151881);
    switch (paramInt)
    {
    }
    for (Object localObject4 = i.RQ();; localObject4 = c.RQ())
    {
      AssetManager localAssetManager = ab.getContext().getAssets();
      Properties localProperties = new Properties();
      localObject3 = null;
      localObject1 = null;
      try
      {
        localObject4 = localAssetManager.open((String)localObject4);
        localObject1 = localObject4;
        localObject3 = localObject4;
        localProperties.load((InputStream)localObject4);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          localObject3 = localObject1;
          w.printErrStackTrace("MicroMsg.FTS.FTSExportLogic", localException, localException.getMessage(), new Object[0]);
          com.tencent.mm.a.e.b((InputStream)localObject1);
        }
      }
      finally
      {
        com.tencent.mm.a.e.b((InputStream)localObject3);
      }
      paramInt = Integer.valueOf(localProperties.getProperty("version", "1")).intValue();
      GMTrace.o(20385122746368L, 151881);
      return paramInt;
    }
  }
  
  public static boolean gL(int paramInt)
  {
    GMTrace.i(20385256964096L, 151882);
    switch (paramInt)
    {
    default: 
      w.i("MicroMsg.FTS.FTSExportLogic", "isFTSH5TemplateAvail exportType:%d, use search default.", new Object[] { Integer.valueOf(paramInt) });
      bool = i.Kr();
      GMTrace.o(20385256964096L, 151882);
      return bool;
    }
    boolean bool = c.Kr();
    GMTrace.o(20385256964096L, 151882);
    return bool;
  }
  
  public static boolean gM(int paramInt)
  {
    GMTrace.i(20385391181824L, 151883);
    AssetManager localAssetManager = ab.getContext().getAssets();
    Object localObject2;
    switch (paramInt)
    {
    default: 
      localObject2 = i.Kq();
    }
    for (Object localObject1 = i.Kp(); (bg.nm((String)localObject2)) || (bg.nm((String)localObject1)); localObject1 = c.Kp())
    {
      w.w("MicroMsg.FTS.FTSExportLogic", "copyTemplateFromAsset no dstPath or template path!");
      GMTrace.o(20385391181824L, 151883);
      return false;
      localObject2 = c.Kq();
    }
    try
    {
      localObject1 = localAssetManager.open((String)localObject1);
      if (localObject1 == null)
      {
        w.e("MicroMsg.FTS.FTSExportLogic", "file inputStream not found");
        GMTrace.o(20385391181824L, 151883);
        return false;
      }
    }
    catch (IOException localIOException1)
    {
      InputStream localInputStream;
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.FTS.FTSExportLogic", localIOException1, "", new Object[0]);
        localInputStream = null;
      }
      localObject2 = new File((String)localObject2);
      if (((File)localObject2).exists()) {
        ((File)localObject2).delete();
      }
      ((File)localObject2).getParentFile().mkdirs();
      try
      {
        localObject2 = new FileOutputStream((File)localObject2);
        if (localObject2 == null) {}
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        for (;;)
        {
          try
          {
            a(localInputStream, (OutputStream)localObject2);
            com.tencent.mm.a.e.b(localInputStream);
            com.tencent.mm.a.e.a((OutputStream)localObject2);
            GMTrace.o(20385391181824L, 151883);
            return true;
          }
          catch (IOException localIOException2)
          {
            w.printErrStackTrace("MicroMsg.FTS.FTSExportLogic", localIOException2, "", new Object[0]);
            com.tencent.mm.a.e.b(localInputStream);
            com.tencent.mm.a.e.a(localOutputStream);
            GMTrace.o(20385391181824L, 151883);
            return false;
          }
          finally
          {
            OutputStream localOutputStream;
            com.tencent.mm.a.e.b(localInputStream);
            com.tencent.mm.a.e.a(localOutputStream);
          }
          localFileNotFoundException = localFileNotFoundException;
          w.printErrStackTrace("MicroMsg.FTS.FTSExportLogic", localFileNotFoundException, "", new Object[0]);
          localOutputStream = null;
        }
      }
      com.tencent.mm.a.e.b(localInputStream);
      GMTrace.o(20385391181824L, 151883);
    }
    return false;
  }
  
  public static final String gN(int paramInt)
  {
    GMTrace.i(17830288293888L, 132846);
    Object localObject = new StringBuilder().append(paramInt).append("_");
    h.xw();
    localObject = o.getString(com.tencent.mm.kernel.a.ww()) + "_" + System.currentTimeMillis();
    GMTrace.o(17830288293888L, 132846);
    return (String)localObject;
  }
  
  public static int gO(int paramInt)
  {
    GMTrace.i(18933960671232L, 141069);
    if (paramInt == 201) {
      paramInt = 1006;
    }
    for (;;)
    {
      GMTrace.o(18933960671232L, 141069);
      return paramInt;
      if (paramInt == 3) {
        paramInt = 1005;
      } else if (paramInt == 16) {
        paramInt = 1042;
      } else if (paramInt == 20) {
        paramInt = 1053;
      } else {
        paramInt = 1000;
      }
    }
  }
  
  public static String n(Map<String, String> paramMap)
  {
    GMTrace.i(1316675911680L, 9810);
    paramMap = a(paramMap, 0);
    GMTrace.o(1316675911680L, 9810);
    return paramMap;
  }
  
  /* Error */
  public static Properties n(File paramFile)
  {
    // Byte code:
    //   0: ldc2_w 967
    //   3: ldc_w 969
    //   6: invokestatic 24	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: new 847	java/util/Properties
    //   12: dup
    //   13: invokespecial 848	java/util/Properties:<init>	()V
    //   16: astore_3
    //   17: aload_0
    //   18: invokevirtual 972	java/io/File:isFile	()Z
    //   21: ifeq +23 -> 44
    //   24: new 974	java/io/FileInputStream
    //   27: dup
    //   28: aload_0
    //   29: invokespecial 975	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   32: astore_1
    //   33: aload_1
    //   34: astore_0
    //   35: aload_3
    //   36: aload_1
    //   37: invokevirtual 858	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   40: aload_1
    //   41: invokestatic 862	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   44: ldc2_w 967
    //   47: ldc_w 969
    //   50: invokestatic 47	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   53: aload_3
    //   54: areturn
    //   55: astore_2
    //   56: aconst_null
    //   57: astore_1
    //   58: aload_1
    //   59: astore_0
    //   60: ldc 112
    //   62: aload_2
    //   63: ldc -67
    //   65: iconst_0
    //   66: anewarray 4	java/lang/Object
    //   69: invokestatic 870	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   72: aload_1
    //   73: invokestatic 862	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   76: goto -32 -> 44
    //   79: astore_1
    //   80: aconst_null
    //   81: astore_0
    //   82: aload_0
    //   83: invokestatic 862	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   86: aload_1
    //   87: athrow
    //   88: astore_1
    //   89: goto -7 -> 82
    //   92: astore_2
    //   93: goto -35 -> 58
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	96	0	paramFile	File
    //   32	41	1	localFileInputStream	java.io.FileInputStream
    //   79	8	1	localObject1	Object
    //   88	1	1	localObject2	Object
    //   55	8	2	localException1	Exception
    //   92	1	2	localException2	Exception
    //   16	38	3	localProperties	Properties
    // Exception table:
    //   from	to	target	type
    //   24	33	55	java/lang/Exception
    //   24	33	79	finally
    //   35	40	88	finally
    //   60	72	88	finally
    //   35	40	92	java/lang/Exception
  }
  
  private static Intent o(Intent paramIntent)
  {
    GMTrace.i(20357071241216L, 151672);
    if (paramIntent == null)
    {
      GMTrace.o(20357071241216L, 151672);
      return null;
    }
    paramIntent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.tJP);
    paramIntent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.tJM);
    paramIntent.putExtra("neverGetA8Key", true);
    GMTrace.o(20357071241216L, 151672);
    return paramIntent;
  }
  
  public static String o(Map<String, ? extends Object> paramMap)
  {
    GMTrace.i(16176054796288L, 120521);
    StringBuffer localStringBuffer = new StringBuffer();
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      localStringBuffer.append((String)localEntry.getKey());
      localStringBuffer.append("=");
      if (localEntry.getValue() != null) {
        localStringBuffer.append(localEntry.getValue().toString());
      }
      localStringBuffer.append("&");
    }
    paramMap = localStringBuffer.substring(0, localStringBuffer.length() - 1).toString();
    GMTrace.o(16176054796288L, 120521);
    return paramMap;
  }
  
  public static void p(Intent paramIntent)
  {
    GMTrace.i(19136495222784L, 142578);
    paramIntent.putExtra("ftsbizscene", 24);
    Map localMap = a(24, false, 384);
    String str = gN(bg.Sy((String)localMap.get("scene")));
    localMap.put("sessionId", str);
    paramIntent.putExtra("ftssessionid", str);
    paramIntent.putExtra("rawUrl", a(localMap, 0));
    paramIntent.putExtra("ftsType", 384);
    GMTrace.o(19136495222784L, 142578);
  }
  
  static final class a
  {
    int end;
    int start;
    
    a()
    {
      GMTrace.i(1324192104448L, 9866);
      this.start = -1;
      this.end = -1;
      GMTrace.o(1324192104448L, 9866);
    }
    
    final boolean isAvailable()
    {
      GMTrace.i(1324326322176L, 9867);
      if (this.start >= 0)
      {
        GMTrace.o(1324326322176L, 9867);
        return true;
      }
      GMTrace.o(1324326322176L, 9867);
      return false;
    }
  }
  
  public static final class b
  {
    public String aKB;
    public String eBj;
    public int eQd;
    public btj gRA;
    public int gRi;
    public int gRj;
    public int gRk;
    public LinkedList<bms> gRl;
    public String gRm;
    public int gRn;
    public String gRo;
    public String gRp;
    public int gRq;
    public LinkedList<String> gRr;
    public int gRs;
    public int gRt;
    public String gRu;
    public bil gRv;
    public LinkedList<nq> gRw;
    public LinkedList<aqm> gRx;
    public int gRy;
    public bvf gRz;
    public int offset;
    public int scene;
    
    public b()
    {
      GMTrace.i(14450014814208L, 107661);
      this.gRl = new LinkedList();
      this.gRr = new LinkedList();
      this.gRw = new LinkedList();
      this.gRx = new LinkedList();
      GMTrace.o(14450014814208L, 107661);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\az\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
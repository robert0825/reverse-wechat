package com.tencent.mm.plugin.order.c;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.ui.e;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class c
{
  private static HashMap<String, String> ED(String paramString)
  {
    GMTrace.i(6663507542016L, 49647);
    if (paramString == null)
    {
      GMTrace.o(6663507542016L, 49647);
      return null;
    }
    int i = paramString.indexOf("action");
    if (i <= 0)
    {
      GMTrace.o(6663507542016L, 49647);
      return null;
    }
    paramString = paramString.substring(i, paramString.length());
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(6663507542016L, 49647);
      return null;
    }
    paramString = paramString.split("&");
    if (paramString == null)
    {
      GMTrace.o(6663507542016L, 49647);
      return null;
    }
    HashMap localHashMap = new HashMap();
    i = 0;
    while (i < paramString.length)
    {
      String[] arrayOfString = paramString[i].split("=");
      if ((arrayOfString != null) && (arrayOfString.length == 2)) {
        localHashMap.put(arrayOfString[0], arrayOfString[1]);
      }
      i += 1;
    }
    GMTrace.o(6663507542016L, 49647);
    return localHashMap;
  }
  
  public static void a(Boolean paramBoolean, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(6664044412928L, 49651);
    if (paramBoolean.booleanValue())
    {
      g.ork.i(11030, new Object[] { paramString1, "", paramString3, paramString4 });
      GMTrace.o(6664044412928L, 49651);
      return;
    }
    g.ork.i(11030, new Object[] { paramString1, paramString2, paramString3, paramString4 });
    GMTrace.o(6664044412928L, 49651);
  }
  
  public static void ap(Context paramContext, String paramString)
  {
    GMTrace.i(6663910195200L, 49650);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("showShare", false);
    localIntent.putExtra("pay_channel", 1);
    d.b(paramContext, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
    GMTrace.o(6663910195200L, 49650);
  }
  
  public static boolean aq(Context paramContext, String paramString)
  {
    GMTrace.i(6663641759744L, 49648);
    w.v("MicroMsg.MallUtil", "jumpToUrl:" + paramString);
    Intent localIntent = new Intent();
    HashMap localHashMap = ED(paramString);
    if ((localHashMap != null) && (!localHashMap.isEmpty()))
    {
      paramString = (String)localHashMap.get("action");
      if ((TextUtils.isEmpty(paramString)) || (!uE(paramString)))
      {
        w.e("MicroMsg.MallUtil", "jumpToUrl illegal action:" + paramString);
        GMTrace.o(6663641759744L, 49648);
        return false;
      }
      switch (Integer.valueOf(paramString).intValue())
      {
      }
    }
    for (;;)
    {
      GMTrace.o(6663641759744L, 49648);
      return true;
      localIntent.putExtra("rawUrl", (String)localHashMap.get("3rdurl"));
      localIntent.putExtra("showShare", false);
      localIntent.putExtra("pay_channel", 1);
      d.b(paramContext, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
      continue;
      e.P(paramContext, (String)localHashMap.get("username"));
      continue;
      localIntent.putExtra("key_func_id", (String)localHashMap.get("functionid"));
      localIntent.putExtra("key_scene", 1);
      d.b(paramContext, "mall", ".ui.MallIndexUI", localIntent);
      continue;
      localIntent.putExtra("key_product_id", (String)localHashMap.get("productid"));
      localIntent.putExtra("key_product_scene", 5);
      d.b(paramContext, "product", ".ui.MallProductUI", localIntent);
      continue;
      if (TextUtils.isEmpty(paramString)) {
        break;
      }
      ap(paramContext, paramString);
    }
    w.e("MicroMsg.MallUtil", "jumpToUrl illegal url:" + paramString);
    GMTrace.o(6663641759744L, 49648);
    return false;
  }
  
  public static void ar(Context paramContext, String paramString)
  {
    GMTrace.i(6663775977472L, 49649);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(6663775977472L, 49649);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("key_product_id", paramString);
    localIntent.putExtra("key_product_scene", 5);
    d.b(paramContext, "product", ".ui.MallProductUI", localIntent);
    GMTrace.o(6663775977472L, 49649);
  }
  
  public static boolean uE(String paramString)
  {
    GMTrace.i(6663373324288L, 49646);
    boolean bool = Pattern.compile("[0-9]*").matcher(paramString).matches();
    GMTrace.o(6663373324288L, 49646);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\order\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
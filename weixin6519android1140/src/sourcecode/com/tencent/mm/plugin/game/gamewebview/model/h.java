package com.tencent.mm.plugin.game.gamewebview.model;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.c.d;
import com.tencent.mm.sdk.platformtools.w;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

public final class h
{
  public static void a(d paramd, JSONObject paramJSONObject)
  {
    GMTrace.i(17074776702976L, 127217);
    String str1 = paramJSONObject.optString("link");
    Object localObject2 = (c.d)paramd.lKc.get(paramd.aEr());
    Object localObject1;
    int i;
    label112:
    String str3;
    if ((!TextUtils.isEmpty(str1)) && (localObject2 != null) && (((c.d)localObject2).rRS != null) && (((c.d)localObject2).rRS.size() > 0))
    {
      localObject1 = new LinkedList();
      int j = str1.indexOf("://");
      if (j == -1)
      {
        i = 1;
        String str2 = str1.substring(i + j);
        localObject2 = ((c.d)localObject2).rRS.iterator();
        for (;;)
        {
          if (((Iterator)localObject2).hasNext())
          {
            str3 = (String)((Iterator)localObject2).next();
            if (!TextUtils.isEmpty(str3))
            {
              j = str3.indexOf("://");
              if (j == -1)
              {
                i = 1;
                label157:
                str3 = str3.substring(i + j);
                if (!str2.startsWith(str3)) {
                  break label309;
                }
                i = 0;
                label179:
                if ((i == 0) || (((List)localObject1).isEmpty())) {
                  break label354;
                }
                str1 = URI.create(str1).getHost();
                localObject1 = ((List)localObject1).iterator();
                while (((Iterator)localObject1).hasNext()) {
                  if (str1.endsWith((String)((Iterator)localObject1).next())) {
                    i = 0;
                  }
                }
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      if (i != 0)
      {
        try
        {
          localObject1 = paramd.Lg();
          paramJSONObject.put("img_url", "");
          paramJSONObject.put("link", localObject1);
          paramJSONObject.put("desc", localObject1);
          paramJSONObject.put("title", paramd.getTitle());
          GMTrace.o(17074776702976L, 127217);
          return;
        }
        catch (Exception paramd)
        {
          label309:
          w.printErrStackTrace("MicroMsg.GameWebViewShareController", paramd, "", new Object[0]);
        }
        i = 3;
        break;
        i = 3;
        break label157;
        if (str3.contains("/")) {
          break label112;
        }
        ((List)localObject1).add(str3);
        break label112;
      }
      GMTrace.o(17074776702976L, 127217);
      return;
      label354:
      continue;
      i = 1;
      break label179;
      i = 0;
    }
  }
  
  public static void c(d paramd)
  {
    GMTrace.i(17074642485248L, 127216);
    paramd.zC("sendAppMessage");
    if (paramd.bd("sendAppMessage", 89))
    {
      paramd.cp("menu:share:appmessage", "");
      GMTrace.o(17074642485248L, 127216);
      return;
    }
    JSONObject localJSONObject = new JSONObject();
    try
    {
      String str = paramd.Lg();
      localJSONObject.put("link", str);
      localJSONObject.put("desc", str);
      localJSONObject.put("title", paramd.getTitle());
      paramd.cq("sendAppMessage", localJSONObject.toString());
      GMTrace.o(17074642485248L, 127216);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.GameWebViewShareController", localException, "", new Object[0]);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\model\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
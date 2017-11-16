package com.tencent.mm.plugin.webview.fts.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.h;
import com.tencent.mm.ac.n;
import com.tencent.mm.g.b.af;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  extends a<com.tencent.mm.plugin.fts.a.a.i>
{
  public boolean eBn;
  private List<com.tencent.mm.plugin.fts.a.a.i> lxb;
  private List<String> rCQ;
  
  public d(String paramString, List<String> paramList)
  {
    super(paramString, Integer.MAX_VALUE);
    GMTrace.i(19477005598720L, 145115);
    this.rCQ = paramList;
    GMTrace.o(19477005598720L, 145115);
  }
  
  public final void bR(List<com.tencent.mm.plugin.fts.a.a.i> paramList)
  {
    GMTrace.i(19477139816448L, 145116);
    this.lxb = paramList;
    if (this.lxb != null)
    {
      paramList = new ArrayList(this.rCQ.size());
      Iterator localIterator = this.lxb.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.fts.a.a.i locali = (com.tencent.mm.plugin.fts.a.a.i)localIterator.next();
        at.AR();
        x localx = c.yK().TE(locali.lwH);
        i = this.rCQ.indexOf(localx.field_username);
        if (i >= 0)
        {
          if (i < paramList.size()) {
            paramList.add(i, locali);
          }
          for (;;)
          {
            localIterator.remove();
            break;
            paramList.add(locali);
          }
        }
      }
      int i = paramList.size() - 1;
      while (i >= 0)
      {
        this.lxb.add(0, paramList.get(i));
        i -= 1;
      }
    }
    this.eBn = true;
    GMTrace.o(19477139816448L, 145116);
  }
  
  public final JSONObject dF(int paramInt1, int paramInt2)
  {
    GMTrace.i(19477274034176L, 145117);
    JSONObject localJSONObject1 = new JSONObject();
    if (!this.eBn)
    {
      GMTrace.o(19477274034176L, 145117);
      return localJSONObject1;
    }
    if ((paramInt1 < 0) || (paramInt2 <= 0))
    {
      GMTrace.o(19477274034176L, 145117);
      return localJSONObject1;
    }
    paramInt2 = paramInt1 + paramInt2 - 1;
    if (paramInt2 > this.lxb.size() - 1) {
      paramInt2 = this.lxb.size() - 1;
    }
    while (paramInt2 < paramInt1)
    {
      GMTrace.o(19477274034176L, 145117);
      return localJSONObject1;
    }
    for (;;)
    {
      JSONObject localJSONObject2;
      try
      {
        if (paramInt2 != this.lxb.size() - 1) {
          break label584;
        }
        i = 0;
        localJSONObject1.put("continueFlag", i);
        localJSONObject1.put("offset", paramInt2 + 1);
        localJSONObject1.put("query", this.eQb);
        localJSONObject1.put("ret", 0);
        localJSONObject2 = new JSONObject();
        localJSONObject2.put("count", paramInt2 - paramInt1 + 1);
        localJSONObject2.put("totalCount", s.Au());
        JSONArray localJSONArray2 = new JSONArray();
        Object localObject3;
        JSONObject localJSONObject3;
        Object localObject2;
        Object localObject1;
        Context localContext;
        if (paramInt1 <= paramInt2)
        {
          localObject3 = (com.tencent.mm.plugin.fts.a.a.i)this.lxb.get(paramInt1);
          localJSONObject3 = new JSONObject();
          at.AR();
          localObject2 = c.yK().TE(((com.tencent.mm.plugin.fts.a.a.i)localObject3).lwH);
          localJSONObject3.put("userName", ((af)localObject2).field_username);
          localJSONObject3.put("nickName", ((af)localObject2).field_nickname);
          localObject1 = ((com.tencent.mm.plugin.fts.a.a.i)localObject3).content;
          localContext = ab.getContext();
          localObject1 = ((String)localObject1).replaceFirst(this.eQb, "<em class=\\\"highlight\\\">" + this.eQb + "</em>");
          i = ((com.tencent.mm.plugin.fts.a.a.i)localObject3).gRk;
        }
        switch (i)
        {
        default: 
          localObject1 = "";
        case 15: 
          try
          {
            localJSONObject3.put("displayText", localObject1);
            localObject1 = "";
            localObject3 = n.Di().ig(((af)localObject2).field_username);
            if (localObject3 != null)
            {
              localObject2 = ((h)localObject3).Dp();
              localObject1 = localObject2;
              if (bg.nm((String)localObject2)) {
                localObject1 = ((h)localObject3).Do();
              }
            }
            localJSONObject3.put("thumbUrl", localObject1);
            localJSONArray2.put(localJSONObject3);
            paramInt1 += 1;
            continue;
            localObject3 = localContext.getString(R.l.dWm);
            localObject1 = (String)localObject3 + (String)localObject1;
            continue;
          }
          catch (JSONException localJSONException1)
          {
            w.printErrStackTrace("JsapiFtsMatchContact", localJSONException1, "", new Object[0]);
            continue;
          }
          localJSONObject2.put("items", localJSONArray2);
        }
      }
      catch (JSONException localJSONException2)
      {
        w.printErrStackTrace("JsapiFtsMatchContact", localJSONException2, "", new Object[0]);
        GMTrace.o(19477274034176L, 145117);
        return localJSONObject1;
      }
      JSONArray localJSONArray1 = new JSONArray();
      localJSONArray1.put(localJSONObject2);
      localJSONObject1.put("data", localJSONArray1);
      continue;
      label584:
      int i = 1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\fts\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
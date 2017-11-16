package com.tencent.mm.plugin.product.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.product.c.a;
import com.tencent.mm.plugin.product.c.c;
import com.tencent.mm.plugin.product.c.e;
import com.tencent.mm.plugin.product.c.f;
import com.tencent.mm.plugin.product.c.h;
import com.tencent.mm.plugin.product.c.j;
import com.tencent.mm.plugin.product.c.k;
import com.tencent.mm.plugin.product.c.l;
import com.tencent.mm.plugin.product.c.n;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class m
{
  public String nIc;
  public int nId;
  public int nIe;
  public int nIf;
  public c nIg;
  public n nIh;
  public LinkedList<l> nIi;
  public f nIj;
  public String nIk;
  public String nIl;
  public String nIm;
  public int status;
  
  public m()
  {
    GMTrace.i(5987721281536L, 44612);
    this.nIe = Integer.MAX_VALUE;
    this.nIf = Integer.MAX_VALUE;
    this.status = 6;
    this.nIi = new LinkedList();
    GMTrace.o(5987721281536L, 44612);
  }
  
  public static m a(m paramm, String paramString)
  {
    GMTrace.i(5987855499264L, 44613);
    Object localObject1;
    Object localObject2;
    Object localObject3;
    int j;
    int i;
    label268:
    label305:
    int k;
    Object localObject4;
    int m;
    Object localObject5;
    if (paramm == null)
    {
      paramm = new m();
      try
      {
        paramString = new JSONObject(paramString);
        paramm.nIc = paramString.getString("product_id");
        paramm.nId = paramString.getInt("product_type");
        paramm.nIe = paramString.optInt("quantity", Integer.MAX_VALUE);
        paramm.nIf = paramString.optInt("left_buy_quantity", Integer.MAX_VALUE);
        paramm.status = paramString.optInt("status", 6);
        localObject1 = paramString.optJSONObject("ext_attr");
        if (localObject1 != null)
        {
          paramm.nIj = new f();
          localObject1 = ((JSONObject)localObject1).optJSONObject("product_ext");
          if (localObject1 == null) {
            break label305;
          }
          localObject2 = paramm.nIj;
          localObject3 = new j();
          ((j)localObject3).eQl = ((JSONObject)localObject1).getInt("flag");
          ((f)localObject2).nIG = ((j)localObject3);
        }
        for (;;)
        {
          localObject1 = paramString.optJSONObject("base_attr");
          if (localObject1 == null) {
            break label881;
          }
          paramm.nIg = new c();
          paramm.nIg.name = ((JSONObject)localObject1).getString("name");
          paramm.nIg.nIs = ((JSONObject)localObject1).getInt("ori_price");
          paramm.nIg.nIt = ((JSONObject)localObject1).getInt("up_price");
          paramm.nIg.nIu = ((JSONObject)localObject1).getInt("low_price");
          paramm.nIg.nIv = new LinkedList();
          localObject2 = ((JSONObject)localObject1).getJSONArray("img_info");
          j = ((JSONArray)localObject2).length();
          i = 0;
          if (i >= j) {
            break;
          }
          localObject3 = ((JSONArray)localObject2).getString(i);
          if (bg.nm((String)localObject3)) {
            break label1260;
          }
          paramm.nIg.nIv.add(localObject3);
          break label1260;
          paramm.nIj.nIH = paramString.optString("ext_attr");
        }
        paramm.nIg.glz = ((JSONObject)localObject1).getString("digest");
      }
      catch (JSONException paramString)
      {
        w.printErrStackTrace("MicroMsg.ProductInfo", paramString, "", new Object[0]);
        GMTrace.o(5987855499264L, 44613);
        return paramm;
      }
      paramm.nIg.nEr = ((JSONObject)localObject1).getString("fee_type");
      paramm.nIg.nIw = ((JSONObject)localObject1).getString("detail");
      localObject2 = ((JSONObject)localObject1).optJSONObject("share_info");
      if (localObject2 != null)
      {
        paramm.nIg.nIE = new k();
        paramm.nIg.nIE.nDw = ((JSONObject)localObject2).optString("icon_url");
        paramm.nIg.nIE.url = ((JSONObject)localObject2).optString("url");
      }
      localObject2 = ((JSONObject)localObject1).optJSONArray("sku_table");
      if (localObject2 != null)
      {
        paramm.nIg.nIC = new LinkedList();
        k = ((JSONArray)localObject2).length();
        i = 0;
        while (i < k)
        {
          localObject4 = ((JSONArray)localObject2).getJSONObject(i);
          localObject3 = new com.tencent.mm.plugin.product.c.m();
          ((com.tencent.mm.plugin.product.c.m)localObject3).nIO = ((JSONObject)localObject4).getString("id");
          ((com.tencent.mm.plugin.product.c.m)localObject3).nIP = ((JSONObject)localObject4).getString("name");
          ((com.tencent.mm.plugin.product.c.m)localObject3).nIQ = new LinkedList();
          localObject4 = ((JSONObject)localObject4).getJSONArray("value_list");
          m = ((JSONArray)localObject4).length();
          j = 0;
          while (j < m)
          {
            localObject5 = ((JSONArray)localObject4).getJSONObject(j);
            h localh = new h();
            localh.id = ((JSONObject)localObject5).getString("id");
            localh.name = ((JSONObject)localObject5).getString("name");
            localh.nII = true;
            ((com.tencent.mm.plugin.product.c.m)localObject3).nIQ.add(localh);
            j += 1;
          }
          paramm.nIg.nIC.add(localObject3);
          i += 1;
        }
      }
      localObject1 = ((JSONObject)localObject1).optJSONArray("actiongroup_attr");
      if (localObject1 != null)
      {
        paramm.nIg.nID = new LinkedList();
        k = ((JSONArray)localObject1).length();
        i = 0;
      }
    }
    for (;;)
    {
      if (i < k)
      {
        localObject2 = ((JSONArray)localObject1).getJSONObject(i);
        localObject3 = new a();
        ((a)localObject3).lPi = ((JSONObject)localObject2).getString("name");
        ((a)localObject3).jib = 0;
        if (!bg.nm(((a)localObject3).lPi)) {
          paramm.nIg.nID.add(localObject3);
        }
        localObject2 = ((JSONObject)localObject2).getJSONArray("action_list");
        m = ((JSONArray)localObject2).length();
        j = 0;
        while (j < m)
        {
          localObject3 = ((JSONArray)localObject2).getJSONObject(j);
          localObject4 = new a();
          ((a)localObject4).lPi = ((JSONObject)localObject3).getString("name");
          ((a)localObject4).nIo = ((JSONObject)localObject3).getString("tips");
          ((a)localObject4).jib = ((JSONObject)localObject3).getInt("type");
          ((a)localObject4).nIp = ((JSONObject)localObject3).getString("content");
          ((a)localObject4).lRV = ((JSONObject)localObject3).getString("icon_url");
          paramm.nIg.nID.add(localObject4);
          j += 1;
        }
      }
      label881:
      localObject1 = paramString.optJSONArray("available_sku_list");
      if (localObject1 != null)
      {
        k = ((JSONArray)localObject1).length();
        paramm.nIi = new LinkedList();
        i = 0;
        while (i < k)
        {
          localObject3 = ((JSONArray)localObject1).getJSONObject(i);
          localObject2 = new l();
          ((l)localObject2).nIL = ((JSONObject)localObject3).getString("id_info");
          ((l)localObject2).nIM = ((JSONObject)localObject3).getInt("price");
          ((l)localObject2).nIe = ((JSONObject)localObject3).getInt("quantity");
          ((l)localObject2).url = ((JSONObject)localObject3).getString("icon_url");
          localObject3 = ((JSONObject)localObject3).getJSONArray("express_fee");
          m = ((JSONArray)localObject3).length();
          ((l)localObject2).nIN = new LinkedList();
          j = 0;
          while (j < m)
          {
            localObject4 = ((JSONArray)localObject3).getJSONObject(j);
            localObject5 = new e();
            ((e)localObject5).id = ((JSONObject)localObject4).getInt("id");
            ((e)localObject5).name = ((JSONObject)localObject4).getString("name");
            ((e)localObject5).value = ((JSONObject)localObject4).getInt("price");
            ((l)localObject2).nIN.add(localObject5);
            j += 1;
          }
          paramm.nIi.add(localObject2);
          i += 1;
        }
      }
      localObject1 = paramString.optJSONObject("seller_attr");
      if (localObject1 != null)
      {
        paramm.nIh = new n();
        paramm.nIh.eSd = ((JSONObject)localObject1).getString("appid");
        paramm.nIh.name = ((JSONObject)localObject1).getString("name");
        paramm.nIh.username = ((JSONObject)localObject1).getString("username");
        paramm.nIh.nIR = ((JSONObject)localObject1).optString("logo");
        paramm.nIh.eQl = ((JSONObject)localObject1).optInt("flag", 0);
      }
      paramString = paramString.optJSONObject("oss_info");
      if (paramString != null)
      {
        paramm.nIl = paramString.optString("self_buy_button_word");
        paramm.nIm = paramString.optString("product_mixed_h5_html");
      }
      GMTrace.o(5987855499264L, 44613);
      return paramm;
      break;
      label1260:
      i += 1;
      break label268;
      i += 1;
    }
  }
  
  public static m b(m paramm, String paramString)
  {
    int i = 0;
    GMTrace.i(5987989716992L, 44614);
    m localm = paramm;
    if (paramm == null) {
      localm = new m();
    }
    paramString = bh.q(paramString, "mallProductInfo");
    if (paramString == null)
    {
      GMTrace.o(5987989716992L, 44614);
      return null;
    }
    localm.nIc = bg.nl((String)paramString.get(".mallProductInfo.id"));
    localm.nId = bg.getInt((String)paramString.get(".mallProductInfo.type"), 0);
    localm.nIg = new c();
    localm.nIg.name = bg.nl((String)paramString.get(".mallProductInfo.name"));
    localm.nIg.glz = bg.nl((String)paramString.get(".mallProductInfo.digest"));
    localm.nIg.nIt = bg.getInt((String)paramString.get(".mallProductInfo.highPrice"), 0);
    localm.nIg.nIu = bg.getInt((String)paramString.get(".mallProductInfo.lowPrice"), 0);
    localm.nIg.nIs = bg.getInt((String)paramString.get(".mallProductInfo.originPrice"), 0);
    localm.nIk = bg.nl((String)paramString.get(".mallProductInfo.sourceUrl"));
    int j = bg.getInt((String)paramString.get(".mallProductInfo.imgCount"), 0);
    if (j > 0)
    {
      localm.nIg.nIv = new LinkedList();
      if (i < j)
      {
        if (i == 0) {}
        for (paramm = bg.nl((String)paramString.get(".mallProductInfo.imgList.imgUrl"));; paramm = bg.nl((String)paramString.get(".mallProductInfo.imgList.imgUrl" + i)))
        {
          if (!bg.nm(paramm)) {
            localm.nIg.nIv.add(paramm);
          }
          i += 1;
          break;
        }
      }
    }
    localm.nIg.nIE = new k();
    localm.nIg.nIE.url = bg.nl((String)paramString.get(".mallProductInfo.shareInfo.shareUrl"));
    localm.nIg.nIE.nDw = bg.nl((String)paramString.get(".mallProductInfo.shareInfo.shareThumbUrl"));
    localm.nIh = new n();
    localm.nIh.eSd = bg.nl((String)paramString.get(".mallProductInfo.sellerInfo.appID"));
    localm.nIh.name = bg.nl((String)paramString.get(".mallProductInfo.sellerInfo.appName"));
    localm.nIh.username = bg.nl((String)paramString.get(".mallProductInfo.sellerInfo.usrName"));
    GMTrace.o(5987989716992L, 44614);
    return localm;
  }
  
  public final String aXs()
  {
    GMTrace.i(5988123934720L, 44615);
    String str;
    if ((this.nIg != null) && (this.nIg.nIE != null) && (!bg.nm(this.nIg.nIE.nDw)))
    {
      str = this.nIg.nIE.nDw;
      GMTrace.o(5988123934720L, 44615);
      return str;
    }
    if ((this.nIg != null) && (this.nIg.nIv != null) && (this.nIg.nIv.size() > 0))
    {
      str = (String)this.nIg.nIv.get(0);
      GMTrace.o(5988123934720L, 44615);
      return str;
    }
    GMTrace.o(5988123934720L, 44615);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\b\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
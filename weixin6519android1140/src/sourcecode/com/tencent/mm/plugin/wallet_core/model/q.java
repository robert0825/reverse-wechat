package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.dn;
import com.tencent.mm.plugin.wallet_core.d.d;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class q
  extends dn
{
  public static c.a fTp;
  
  static
  {
    GMTrace.i(6863760392192L, 51139);
    c.a locala = new c.a();
    locala.gZM = new Field[3];
    locala.columns = new String[4];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "bulletin_scene";
    locala.vmt.put("bulletin_scene", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" bulletin_scene TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "bulletin_scene";
    locala.columns[1] = "bulletin_content";
    locala.vmt.put("bulletin_content", "TEXT");
    localStringBuilder.append(" bulletin_content TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "bulletin_url";
    locala.vmt.put("bulletin_url", "TEXT");
    localStringBuilder.append(" bulletin_url TEXT");
    locala.columns[3] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(6863760392192L, 51139);
  }
  
  public q()
  {
    GMTrace.i(6863357739008L, 51136);
    GMTrace.o(6863357739008L, 51136);
  }
  
  public static void S(JSONObject paramJSONObject)
  {
    GMTrace.i(6863626174464L, 51138);
    Object localObject1 = n.byB();
    if ((paramJSONObject != null) && (localObject1 != null))
    {
      Object localObject3 = paramJSONObject.optJSONArray("banner_map");
      paramJSONObject = paramJSONObject.optJSONArray("banner_content_array");
      localObject2 = new HashMap();
      HashMap localHashMap = new HashMap();
      if ((localObject3 != null) && (paramJSONObject != null))
      {
        int j = ((JSONArray)localObject3).length();
        int i = 0;
        Object localObject4;
        String str;
        while (i < j)
        {
          localObject4 = ((JSONArray)localObject3).optJSONObject(i);
          if (localObject4 != null)
          {
            str = ((JSONObject)localObject4).optString("banner_type");
            localObject4 = ((JSONObject)localObject4).optString("banner_template_id");
            w.i("MicroMsg.WalletBulletin", "sceneid=" + str + "; contentid=" + (String)localObject4);
            if ((!bg.nm(str)) && (!bg.nm((String)localObject4)))
            {
              ((Map)localObject2).put(str, localObject4);
              w.i("MicroMsg.WalletBulletin", "sceneid:" + str + " map contentid:" + (String)localObject4);
            }
          }
          i += 1;
        }
        j = paramJSONObject.length();
        i = 0;
        while (i < j)
        {
          localObject3 = paramJSONObject.optJSONObject(i);
          if (localObject3 != null) {
            localHashMap.put(((JSONObject)localObject3).optString("banner_template_id"), Integer.valueOf(i));
          }
          i += 1;
        }
        if (((Map)localObject2).size() > 0)
        {
          localObject3 = ((Map)localObject2).keySet().iterator();
          while (((Iterator)localObject3).hasNext())
          {
            str = (String)((Iterator)localObject3).next();
            localObject4 = (String)((Map)localObject2).get(str);
            if (localHashMap.containsKey(localObject4))
            {
              w.i("MicroMsg.WalletBulletin", "find contentid:" + (String)localObject4 + "in contentMap");
              localObject4 = paramJSONObject.optJSONObject(((Integer)localHashMap.get(localObject4)).intValue());
              q localq = new q();
              localq.field_bulletin_scene = str;
              localq.field_bulletin_content = ((JSONObject)localObject4).optString("content");
              localq.field_bulletin_url = ((JSONObject)localObject4).optString("url");
              ((d)localObject1).b(localq);
            }
            else
            {
              w.e("MicroMsg.WalletBulletin", "can not find contentid:" + (String)localObject4 + "in contentMap");
            }
          }
        }
        GMTrace.o(6863626174464L, 51138);
        return;
      }
      localObject1 = new StringBuilder("scenes==null?");
      if (localObject3 == null)
      {
        bool = true;
        localObject1 = ((StringBuilder)localObject1).append(bool).append("  contents==null?");
        if (paramJSONObject != null) {
          break label532;
        }
      }
      label532:
      for (bool = true;; bool = false)
      {
        w.e("MicroMsg.WalletBulletin", bool);
        GMTrace.o(6863626174464L, 51138);
        return;
        bool = false;
        break;
      }
    }
    Object localObject2 = new StringBuilder("json==null?");
    if (paramJSONObject == null)
    {
      bool = true;
      paramJSONObject = ((StringBuilder)localObject2).append(bool).append("  stg==null?");
      if (localObject1 != null) {
        break label600;
      }
    }
    label600:
    for (boolean bool = true;; bool = false)
    {
      w.e("MicroMsg.WalletBulletin", bool);
      GMTrace.o(6863626174464L, 51138);
      return;
      bool = false;
      break;
    }
  }
  
  protected final c.a uw()
  {
    GMTrace.i(6863491956736L, 51137);
    c.a locala = fTp;
    GMTrace.o(6863491956736L, 51137);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
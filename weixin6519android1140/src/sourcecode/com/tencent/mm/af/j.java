package com.tencent.mm.af;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class j
{
  public static String gxb;
  public static String gxc;
  public static String gxd;
  public String amf;
  public String content;
  public String eYm;
  public List<j> gxe;
  public int gxf;
  public int id;
  public String name;
  public String state;
  public int type;
  public String value;
  
  static
  {
    GMTrace.i(18618817445888L, 138721);
    gxb = "menu_click";
    gxc = "menu_action_start";
    gxd = "menu_action_success";
    GMTrace.o(18618817445888L, 138721);
  }
  
  public j()
  {
    GMTrace.i(18618146357248L, 138716);
    this.gxe = null;
    GMTrace.o(18618146357248L, 138716);
  }
  
  public static List<j> c(JSONArray paramJSONArray)
  {
    GMTrace.i(18618549010432L, 138719);
    Object localObject;
    if (paramJSONArray != null) {
      try
      {
        ArrayList localArrayList = new ArrayList();
        int j = paramJSONArray.length();
        int i = 0;
        for (;;)
        {
          localObject = localArrayList;
          if (i >= j) {
            break;
          }
          localObject = paramJSONArray.getJSONObject(i);
          j localj = new j();
          localj.id = ((JSONObject)localObject).getInt("id");
          localj.type = ((JSONObject)localObject).getInt("type");
          localj.name = ((JSONObject)localObject).getString("name");
          localj.amf = ((JSONObject)localObject).getString("key");
          localj.value = ((JSONObject)localObject).optString("value");
          localj.eYm = ((JSONObject)localObject).optString("native_url");
          w.d("MicroMsg.BizMenuItem", "menuItem.nativeurl : " + localj.eYm);
          localj.gxe = c(((JSONObject)localObject).optJSONArray("sub_button_list"));
          localj.gxf = ((JSONObject)localObject).optInt("acttype");
          localArrayList.add(localj);
          i += 1;
        }
        localObject = null;
      }
      catch (JSONException paramJSONArray)
      {
        w.e("MicroMsg.BizMenuItem", "exception:%s", new Object[] { bg.f(paramJSONArray) });
        GMTrace.o(18618549010432L, 138719);
        return null;
      }
    }
    GMTrace.o(18618549010432L, 138719);
    return (List<j>)localObject;
  }
  
  public static LinkedList<j> m(Map<String, String> paramMap)
  {
    GMTrace.i(18618683228160L, 138720);
    if (paramMap == null)
    {
      GMTrace.o(18618683228160L, 138720);
      return null;
    }
    int j = bg.getInt((String)paramMap.get(".msg.appmsg.buttonlist.$count"), 0);
    if (j > 0) {
      try
      {
        LinkedList localLinkedList = new LinkedList();
        w.v("MicroMsg.BizMenuItem", "menuItem.jsonArray.length : " + j);
        int i = 0;
        if (i < j)
        {
          j localj = new j();
          StringBuilder localStringBuilder = new StringBuilder(".msg.appmsg.buttonlist.button");
          if (i == 0) {}
          for (String str = "";; str = String.valueOf(i))
          {
            str = str;
            localj.id = bg.getInt((String)paramMap.get(str + ".id"), 0);
            localj.type = bg.getInt((String)paramMap.get(str + ".type"), 0);
            localj.name = ((String)paramMap.get(str + ".name"));
            localj.amf = ((String)paramMap.get(str + ".key"));
            localj.value = ((String)paramMap.get(str + ".value"));
            localj.gxf = bg.getInt((String)paramMap.get(str + ".acttype"), 0);
            localLinkedList.add(localj);
            i += 1;
            break;
          }
        }
        GMTrace.o(18618683228160L, 138720);
        return localLinkedList;
      }
      catch (Exception paramMap)
      {
        w.e("MicroMsg.BizMenuItem", "exception:%s", new Object[] { bg.f(paramMap) });
        GMTrace.o(18618683228160L, 138720);
        return null;
      }
    }
    GMTrace.o(18618683228160L, 138720);
    return null;
  }
  
  public final void e(ArrayList<String> paramArrayList)
  {
    GMTrace.i(18618012139520L, 138715);
    if (paramArrayList.size() == 0)
    {
      w.e("MicroMsg.BizMenuItem", "value null!");
      GMTrace.o(18618012139520L, 138715);
      return;
    }
    JSONArray localJSONArray;
    try
    {
      localJSONArray = new JSONArray();
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext())
      {
        String str = (String)paramArrayList.next();
        JSONObject localJSONObject = new JSONObject();
        localJSONObject.put("pic_md5", str);
        localJSONArray.put(localJSONObject);
      }
      paramArrayList = new JSONObject();
    }
    catch (JSONException paramArrayList)
    {
      w.e("MicroMsg.BizMenuItem", paramArrayList.toString());
      GMTrace.o(18618012139520L, 138715);
      return;
    }
    paramArrayList.put("pics", localJSONArray);
    this.content = paramArrayList.toString();
    w.v("MicroMsg.BizMenuItem", this.content);
    GMTrace.o(18618012139520L, 138715);
  }
  
  public final String getInfo()
  {
    GMTrace.i(18618280574976L, 138717);
    if (this.content == null) {
      this.content = "";
    }
    if (this.state == null) {
      if (this.type != 4) {
        break label103;
      }
    }
    label103:
    for (this.state = gxc;; this.state = gxb)
    {
      String str = String.format("%s<info><id><![CDATA[%d]]></id><key><![CDATA[%s]]></key><status><![CDATA[%s]]></status><content><![CDATA[%s]]></content></info>", new Object[] { "#bizmenu#", Integer.valueOf(this.id), this.amf, this.state, this.content });
      GMTrace.o(18618280574976L, 138717);
      return str;
    }
  }
  
  public final String toString()
  {
    GMTrace.i(18618414792704L, 138718);
    int i = this.id;
    int j = this.gxf;
    int k = this.type;
    String str1;
    String str2;
    label46:
    String str3;
    if (this.name == null)
    {
      str1 = "";
      if (this.amf != null) {
        break label144;
      }
      str2 = "";
      if (this.value != null) {
        break label153;
      }
      str3 = "";
      label57:
      if (this.content != null) {
        break label162;
      }
    }
    label144:
    label153:
    label162:
    for (String str4 = "";; str4 = this.content)
    {
      str1 = String.format("id:%d, type:%d, acttype:%s, name:%s, key:%s, value:%s, content:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), str1, str2, str3, str4 });
      GMTrace.o(18618414792704L, 138718);
      return str1;
      str1 = this.name;
      break;
      str2 = this.amf;
      break label46;
      str3 = this.value;
      break label57;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
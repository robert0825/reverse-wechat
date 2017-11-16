package com.tencent.mm.plugin.product.b;

import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class n
{
  public List<a> nIn;
  public String name;
  
  public n()
  {
    GMTrace.i(5989734547456L, 44627);
    this.nIn = new ArrayList();
    GMTrace.o(5989734547456L, 44627);
  }
  
  public static List<n> parse(String paramString)
  {
    GMTrace.i(5989868765184L, 44628);
    ArrayList localArrayList = new ArrayList();
    try
    {
      paramString = new JSONObject(paramString).getJSONArray("group_list");
      int k = paramString.length();
      int i = 0;
      while (i < k)
      {
        Object localObject = paramString.getJSONObject(i);
        n localn = new n();
        localn.name = ((JSONObject)localObject).getString("name");
        localObject = ((JSONObject)localObject).getJSONArray("item_list");
        int m = ((JSONArray)localObject).length();
        int j = 0;
        while (j < m)
        {
          JSONObject localJSONObject = ((JSONArray)localObject).getJSONObject(j);
          a locala = new a();
          locala.title = localJSONObject.getString("title");
          locala.type = localJSONObject.getInt("jump_type");
          locala.data = localJSONObject.getString("native_url_args");
          locala.iconUrl = localJSONObject.getString("icon_url");
          locala.url = localJSONObject.getString("h5_url");
          localn.nIn.add(locala);
          j += 1;
        }
        localArrayList.add(localn);
        i += 1;
      }
      GMTrace.o(5989868765184L, 44628);
    }
    catch (Exception paramString)
    {
      GMTrace.o(5989868765184L, 44628);
      return null;
    }
    return localArrayList;
  }
  
  public static final class a
  {
    public String data;
    public String iconUrl;
    public String title;
    public int type;
    public String url;
    
    public a()
    {
      GMTrace.i(5997116522496L, 44682);
      GMTrace.o(5997116522496L, 44682);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\b\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
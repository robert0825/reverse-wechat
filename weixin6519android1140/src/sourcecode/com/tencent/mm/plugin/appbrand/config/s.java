package com.tencent.mm.plugin.appbrand.config;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;
import org.json.JSONArray;

final class s
{
  static LinkedList<String> f(JSONArray paramJSONArray)
  {
    GMTrace.i(17508836835328L, 130451);
    if (paramJSONArray == null)
    {
      GMTrace.o(17508836835328L, 130451);
      return null;
    }
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    while (i < paramJSONArray.length())
    {
      localLinkedList.add(paramJSONArray.optString(i));
      i += 1;
    }
    GMTrace.o(17508836835328L, 130451);
    return localLinkedList;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\appbrand\config\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
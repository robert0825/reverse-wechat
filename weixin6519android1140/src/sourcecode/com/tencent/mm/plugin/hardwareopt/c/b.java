package com.tencent.mm.plugin.hardwareopt.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.ahg;
import com.tencent.mm.protocal.c.aof;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.vending.c.a;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b
  implements a<Boolean, ahg>
{
  private boolean mgO;
  
  public b(boolean paramBoolean)
  {
    GMTrace.i(18661230247936L, 139037);
    this.mgO = false;
    this.mgO = paramBoolean;
    GMTrace.o(18661230247936L, 139037);
  }
  
  private static String W(LinkedList<aof> paramLinkedList)
  {
    GMTrace.i(18661364465664L, 139038);
    JSONArray localJSONArray1 = new JSONArray();
    if (paramLinkedList != null)
    {
      for (;;)
      {
        JSONObject localJSONObject;
        try
        {
          paramLinkedList = paramLinkedList.iterator();
          if (!paramLinkedList.hasNext()) {
            break;
          }
          Object localObject = (aof)paramLinkedList.next();
          if ((localObject == null) || (bg.nm(((aof)localObject).mVJ))) {
            continue;
          }
          localJSONObject = new JSONObject();
          localJSONObject.put("mimeName", ((aof)localObject).mVJ);
          JSONArray localJSONArray2 = new JSONArray();
          if (((aof)localObject).uEg != null)
          {
            localObject = ((aof)localObject).uEg.iterator();
            if (((Iterator)localObject).hasNext())
            {
              localJSONArray2.put((String)((Iterator)localObject).next());
              continue;
            }
          }
          localJSONObject.put("codecName", localJSONArray2);
        }
        catch (Exception paramLinkedList)
        {
          w.printErrStackTrace("MicroMsg.TaskReportHardwareInfo", paramLinkedList, "hy: error when build up json", new Object[0]);
          GMTrace.o(18661364465664L, 139038);
          return "";
        }
        localJSONArray1.put(localJSONObject);
      }
      paramLinkedList = localJSONArray1.toString();
      GMTrace.o(18661364465664L, 139038);
      return paramLinkedList;
    }
    w.w("MicroMsg.TaskReportHardwareInfo", "hy: no mime info retrieved!");
    GMTrace.o(18661364465664L, 139038);
    return "";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\hardwareopt\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
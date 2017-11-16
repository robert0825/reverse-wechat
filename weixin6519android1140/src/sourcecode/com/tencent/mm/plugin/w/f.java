package com.tencent.mm.plugin.w;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.backup.a.h;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.io.File;

public final class f
{
  private static int nlP;
  private static int nlQ;
  
  static
  {
    GMTrace.i(14717779181568L, 109656);
    nlP = 0;
    nlQ = 0;
    GMTrace.o(14717779181568L, 109656);
  }
  
  public static String aQM()
  {
    GMTrace.i(14717376528384L, 109653);
    Object localObject = new StringBuilder();
    at.AR();
    localObject = c.zn() + "msgsynchronize/syncFile/";
    GMTrace.o(14717376528384L, 109653);
    return (String)localObject;
  }
  
  public static String aQN()
  {
    GMTrace.i(16096732119040L, 119930);
    Object localObject = new StringBuilder();
    at.AR();
    localObject = c.zn() + "msgsynchronize/";
    GMTrace.o(16096732119040L, 119930);
    return (String)localObject;
  }
  
  public static String aQO()
  {
    GMTrace.i(14717510746112L, 109654);
    Object localObject = new StringBuilder();
    at.AR();
    localObject = c.zn() + "msgsynchronize.zip";
    GMTrace.o(14717510746112L, 109654);
    return (String)localObject;
  }
  
  public static void aQP()
  {
    GMTrace.i(18947785097216L, 141172);
    StringBuilder localStringBuilder = new StringBuilder();
    at.AR();
    e.f(new File(c.zo() + "msgsynchronize/"));
    localStringBuilder = new StringBuilder();
    at.AR();
    e.f(new File(c.zo() + "msgsynchronize.zip"));
    GMTrace.o(18947785097216L, 141172);
  }
  
  public static void d(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    GMTrace.i(14717644963840L, 109655);
    if ((TextUtils.isEmpty(paramString1)) || (paramArrayOfByte == null))
    {
      w.e("MicroMsg.MsgSynchronizeUtil", "appendFile dir:%s fileName:%s ", new Object[] { paramString1, paramString2 });
      GMTrace.o(14717644963840L, 109655);
      return;
    }
    int j;
    for (int i = 3;; i = j)
    {
      j = i - 1;
      if (i <= 0) {
        break;
      }
      long l1 = h.td(paramString1 + paramString2);
      File localFile = new File(paramString1 + paramString2);
      if (localFile.exists()) {
        localFile.length();
      }
      i = e.a(paramString1, paramString2, paramArrayOfByte);
      long l2 = h.td(paramString1 + paramString2);
      if ((i == 0) && (l2 >= paramArrayOfByte.length))
      {
        w.d("MicroMsg.MsgSynchronizeUtil", "appendFile retry:%d append:%d  old:%d  new:%d  data:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(paramArrayOfByte.length) });
        GMTrace.o(14717644963840L, 109655);
        return;
      }
      w.e("MicroMsg.MsgSynchronizeUtil", "appendFile retry:%d append:%d  old:%d  new:%d  data:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(paramArrayOfByte.length) });
    }
    GMTrace.o(14717644963840L, 109655);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\w\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
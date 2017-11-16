package com.tencent.mm.bc;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class e
{
  public static void e(long paramLong, String paramString)
  {
    boolean bool1 = false;
    GMTrace.i(17614063534080L, 131235);
    w.i("MicroMsg.FMessageLogic", "clearFMsgAndFConvByTalker, rowId: %d, talker: %s", new Object[] { Long.valueOf(paramLong), paramString });
    boolean bool2 = l.ML().d(paramLong, paramString);
    w.i("MicroMsg.FMessageLogic", "clearFMsgAndFConvByTalker, delete fconversation, ret = " + bool2);
    g localg = l.MK();
    if ((paramString == null) || (paramString.length() == 0)) {
      w.e("MicroMsg.FMessageMsgInfoStorage", "deleteByTalker fail, talker is null");
    }
    for (;;)
    {
      w.i("MicroMsg.FMessageLogic", "clearFMsgAndFConvByTalker, delete fmsginfo, ret = " + bool1);
      GMTrace.o(17614063534080L, 131235);
      return;
      paramString = "delete from fmessage_msginfo where talker = '" + bg.nk(paramString) + "'";
      bool1 = localg.fTZ.eZ("fmessage_msginfo", paramString);
    }
  }
  
  public static long k(String paramString, long paramLong)
  {
    GMTrace.i(1422976352256L, 10602);
    long l2 = 0L;
    long l1 = l2;
    if (paramString != null)
    {
      paramString = l.MK().lO(paramString);
      l1 = l2;
      if (paramString != null) {
        l1 = paramString.field_createTime + 1L;
      }
    }
    if (l1 > paramLong * 1000L)
    {
      GMTrace.o(1422976352256L, 10602);
      return l1;
    }
    GMTrace.o(1422976352256L, 10602);
    return paramLong * 1000L;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bc\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
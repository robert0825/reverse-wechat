package com.tencent.mm.y.a;

import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;

public final class f
{
  public static void a(e parame)
  {
    GMTrace.i(692966129664L, 5163);
    if ((parame != null) && (g.BY().BW()))
    {
      String str1 = g.BY().gpF.gpB;
      String str2 = parame.id;
      String str3 = parame.id;
      String str4 = parame.endTime - parame.startTime;
      String str5 = parame.result;
      String str6 = parame.gpH;
      long l = parame.gpK;
      w.i("MicroMsg.abtest.AbTestReportHelper", "TestCaseID:%s TestPointsID:%s TestReportID：%s TetsCheckID:%s TestDurationTime:%s TestActionResult:%s, TestActionScene:%d", new Object[] { str1, str2, str6, str3, str4, str5, Long.valueOf(l) });
      com.tencent.mm.plugin.report.service.g.ork.i(11394, new Object[] { str1, str2, str6, str3, str4, str5, Long.valueOf(l) });
    }
    GMTrace.o(692966129664L, 5163);
  }
  
  private static void a(e parame, boolean paramBoolean)
  {
    GMTrace.i(692831911936L, 5162);
    if ((parame == null) || (!g.BY().BW()))
    {
      w.w("MicroMsg.abtest.AbTestReportHelper", "[AbTest] reportAbTestClickStreamBroadcast abtest faild. abTestPoint or testcase is null.");
      GMTrace.o(692831911936L, 5162);
      return;
    }
    StringBuilder localStringBuilder2 = new StringBuilder();
    if (paramBoolean) {}
    for (StringBuilder localStringBuilder1 = localStringBuilder2.append("TestPointStart:");; localStringBuilder1 = localStringBuilder2.append("TestPointEnd:"))
    {
      localStringBuilder2.append(localStringBuilder1);
      localStringBuilder2.append(g.BY().gpF.gpB);
      localStringBuilder2.append("_");
      localStringBuilder2.append(parame.id);
      localStringBuilder2.append("_");
      localStringBuilder2.append(parame.gpH);
      localStringBuilder2.append("_");
      localStringBuilder2.append(parame.gpH);
      localStringBuilder2.append("_");
      localStringBuilder2.append(parame.gpI);
      localStringBuilder2.append("_");
      localStringBuilder2.append(parame.result);
      localStringBuilder2.append("_");
      localStringBuilder2.append(parame.gpK);
      hd(localStringBuilder2.toString());
      GMTrace.o(692831911936L, 5162);
      return;
    }
  }
  
  private static void hd(String paramString)
  {
    GMTrace.i(692697694208L, 5161);
    w.i("MicroMsg.abtest.AbTestReportHelper", "[AbTest] reportAbTestClickStreamBroadcast:%s", new Object[] { paramString });
    if (g.BY().BW())
    {
      Intent localIntent = new Intent();
      localIntent.setAction("com.tencent.mm.ui.ACTION_ABTEST");
      localIntent.putExtra("content", paramString);
      ab.getContext().sendBroadcast(localIntent, "com.tencent.mm.permission.MM_MESSAGE");
      GMTrace.o(692697694208L, 5161);
      return;
    }
    w.i("MicroMsg.abtest.AbTestReportHelper", "[AbTest] reportAbTestClickStreamBroadcast abtest faild. no test case.");
    GMTrace.o(692697694208L, 5161);
  }
  
  public static void he(String paramString)
  {
    GMTrace.i(693100347392L, 5164);
    w.i("MicroMsg.abtest.AbTestReportHelper", "[Abtest] startAbTestCase: start abtest click stream");
    hd("TestCaseID:" + paramString);
    GMTrace.o(693100347392L, 5164);
  }
  
  public static void hf(String paramString)
  {
    GMTrace.i(693234565120L, 5165);
    if (g.BY().hb(paramString) != null)
    {
      w.i("MicroMsg.abtest.AbTestReportHelper", "[Abtest] startAbTestPoint:%s", new Object[] { paramString });
      g.BY().hb(paramString).gpI = System.currentTimeMillis();
      g.BY().hb(paramString).startTime = System.currentTimeMillis();
      g.BY().hb(paramString).gpJ = false;
      g.BY().hb(paramString).result = "0";
      a(g.BY().hb(paramString), true);
    }
    GMTrace.o(693234565120L, 5165);
  }
  
  public static void hg(String paramString)
  {
    GMTrace.i(693368782848L, 5166);
    if ((g.BY().hb(paramString) != null) && (!g.BY().hb(paramString).gpJ))
    {
      w.i("MicroMsg.abtest.AbTestReportHelper", "[Abtest] endAbTestPoint:%s", new Object[] { paramString });
      g.BY().hb(paramString).gpI = System.currentTimeMillis();
      g.BY().hb(paramString).endTime = System.currentTimeMillis();
      g.BY().hb(paramString).gpJ = true;
      a(g.BY().hb(paramString));
      a(g.BY().hb(paramString), false);
    }
    GMTrace.o(693368782848L, 5166);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
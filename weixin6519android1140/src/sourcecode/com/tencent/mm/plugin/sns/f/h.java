package com.tencent.mm.plugin.sns.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class h
{
  public boolean eEu;
  public String mwK;
  public int pyH;
  public List<a> pyI;
  public String pyU;
  public int[] pyV;
  public String pyf;
  public String pyg;
  
  public h()
  {
    GMTrace.i(8777705193472L, 65399);
    this.pyg = "";
    this.pyf = "";
    this.mwK = "";
    this.pyU = "";
    this.pyH = 0;
    this.pyI = new ArrayList();
    this.eEu = true;
    GMTrace.o(8777705193472L, 65399);
  }
  
  public final boolean bjX()
  {
    GMTrace.i(8777839411200L, 65400);
    if ((this.eEu) && (this.pyI != null) && (this.pyI.size() > 0))
    {
      GMTrace.o(8777839411200L, 65400);
      return true;
    }
    GMTrace.o(8777839411200L, 65400);
    return false;
  }
  
  public final boolean e(String paramString1, String paramString2, Map<String, String> paramMap)
  {
    GMTrace.i(8777973628928L, 65401);
    this.pyg = paramString1;
    this.pyf = paramString2;
    if (paramMap == null)
    {
      GMTrace.o(8777973628928L, 65401);
      return false;
    }
    try
    {
      this.pyI.clear();
      this.mwK = bg.aq((String)paramMap.get("language"), "");
      this.pyU = bg.aq((String)paramMap.get("first_step_order"), "");
      paramString2 = this.pyU.split("\\|");
      this.pyV = new int[paramString2.length];
      if (this.pyV.length != 0) {
        break label485;
      }
      this.eEu = false;
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        int j;
        int k;
        w.printErrStackTrace("MicroMsg.SnsAdAbTestInfo", paramString1, "feed xml error ", new Object[0]);
        continue;
        int i = 0;
        continue;
        i += 1;
      }
    }
    if (i < paramString2.length)
    {
      this.pyV[i] = bg.Sy(paramString2[i]);
      if ((this.pyV[i] <= 0) || (this.pyV[i] > 3)) {
        this.eEu = false;
      }
    }
    else
    {
      j = bg.Sy((String)paramMap.get("wording_count"));
      k = bg.Sy((String)paramMap.get("expertype"));
      i = 0;
      while (i < j)
      {
        paramString2 = new a();
        paramString2.pxy = bg.Sy((String)paramMap.get(String.format("wording_%d_id", new Object[] { Integer.valueOf(i + 1) })));
        paramString2.pxz = bg.aq((String)paramMap.get(String.format("wording_%d_zh_CN", new Object[] { Integer.valueOf(i + 1) })), "");
        paramString2.pxA = bg.aq((String)paramMap.get(String.format("wording_%d_zh_TW", new Object[] { Integer.valueOf(i + 1) })), "");
        paramString2.pxB = bg.aq((String)paramMap.get(String.format("wording_%d_en", new Object[] { Integer.valueOf(i + 1) })), "");
        paramString2.pxC = bg.Sy((String)paramMap.get(String.format("wording_%d_action_type", new Object[] { Integer.valueOf(i + 1) })));
        this.pyI.add(paramString2);
        i += 1;
      }
      w.i("MicroMsg.SnsAdAbTestInfo", "expertType " + k + " " + paramString1 + " " + this.pyU);
      GMTrace.o(8777973628928L, 65401);
      return false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\f\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
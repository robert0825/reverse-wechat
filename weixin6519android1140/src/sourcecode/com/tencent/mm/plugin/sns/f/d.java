package com.tencent.mm.plugin.sns.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class d
{
  public boolean eEu;
  public String mwK;
  public int pyH;
  public List<b> pyI;
  public String pyf;
  public String pyg;
  
  public d()
  {
    GMTrace.i(8778107846656L, 65402);
    this.pyg = "";
    this.pyf = "";
    this.mwK = "";
    this.pyH = 0;
    this.pyI = new ArrayList();
    this.eEu = true;
    GMTrace.o(8778107846656L, 65402);
  }
  
  public final boolean e(String paramString1, String paramString2, Map<String, String> paramMap)
  {
    GMTrace.i(8778242064384L, 65403);
    this.pyg = paramString1;
    this.pyf = paramString2;
    if (paramMap == null)
    {
      GMTrace.o(8778242064384L, 65403);
      return false;
    }
    for (;;)
    {
      try
      {
        this.pyI.clear();
        this.mwK = bg.aq((String)paramMap.get("language"), "");
        if (!this.mwK.equals("zh_cn")) {
          this.eEu = false;
        }
        int k = bg.Sy((String)paramMap.get("tipcount"));
        m = bg.Sy((String)paramMap.get("expertype"));
        i = 0;
        if (i >= k) {
          continue;
        }
        paramString2 = new b();
        paramString2.title = bg.aq((String)paramMap.get(String.format("tip_%d_basetextformat", new Object[] { Integer.valueOf(i) })), "");
        paramString2.pyM = bg.Sy((String)paramMap.get(String.format("tip_%d_id", new Object[] { Integer.valueOf(i) })));
        paramString2.showType = bg.Sy((String)paramMap.get(String.format("tip_%d_showtype", new Object[] { Integer.valueOf(i) })));
        n = bg.Sy((String)paramMap.get(String.format("tip_%d_button_count", new Object[] { Integer.valueOf(i) })));
        if (paramString2.showType < 6) {
          continue;
        }
        this.eEu = false;
      }
      catch (Exception paramString1)
      {
        int m;
        int i;
        int n;
        a locala;
        w.printErrStackTrace("Micromsg.SnsABTestInfo", paramString1, "feed xml error ", new Object[0]);
        continue;
        int j = 0;
        continue;
      }
      if (j < n)
      {
        locala = new a();
        locala.index = bg.Sy((String)paramMap.get(String.format("tip_%d_button_%d_index", new Object[] { Integer.valueOf(i), Integer.valueOf(j) })));
        locala.actionType = bg.Sy((String)paramMap.get(String.format("tip_%d_button_%d_actiontype", new Object[] { Integer.valueOf(i), Integer.valueOf(j) })));
        locala.pyJ = bg.aq((String)paramMap.get(String.format("tip_%d_button_%d_basetextformat", new Object[] { Integer.valueOf(i), Integer.valueOf(j) })), "");
        locala.jumpUrl = bg.aq((String)paramMap.get(String.format("tip_%d_button_%d_jumpurl", new Object[] { Integer.valueOf(i), Integer.valueOf(j) })), "");
        locala.pyK = bg.aq((String)paramMap.get(String.format("tip_%d_button_%d_priortextformat", new Object[] { Integer.valueOf(i), Integer.valueOf(j) })), "");
        locala.pyL = bg.Sy((String)paramMap.get(String.format("tip_%d_button_%d_nexttipviewid", new Object[] { Integer.valueOf(i), Integer.valueOf(j) })));
        if (locala.actionType >= 9) {
          this.eEu = false;
        }
        paramString2.hRP.add(locala);
        j += 1;
      }
      else
      {
        this.pyI.add(paramString2);
        i += 1;
      }
    }
    w.i("Micromsg.SnsABTestInfo", "expertType " + m + " " + paramString1);
    GMTrace.o(8778242064384L, 65403);
    return false;
  }
  
  static final class a
  {
    public int actionType;
    public int index;
    public String jumpUrl;
    public String pyJ;
    public String pyK;
    public int pyL;
    
    a()
    {
      GMTrace.i(8773678661632L, 65369);
      GMTrace.o(8773678661632L, 65369);
    }
  }
  
  static final class b
  {
    public List<d.a> hRP;
    public int pyM;
    public int showType;
    public String title;
    
    b()
    {
      GMTrace.i(8779584241664L, 65413);
      this.hRP = new ArrayList();
      GMTrace.o(8779584241664L, 65413);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\f\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
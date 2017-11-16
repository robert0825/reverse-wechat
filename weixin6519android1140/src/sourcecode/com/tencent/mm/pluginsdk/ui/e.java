package com.tencent.mm.pluginsdk.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Map;

public final class e
{
  public int tsS;
  public boolean tsT;
  public int tsU;
  public boolean tsV;
  public int tsW;
  public boolean tsX;
  public int tsY;
  public boolean tsZ;
  private int version;
  
  public e(String paramString)
  {
    GMTrace.i(1182860836864L, 8813);
    this.version = 0;
    this.tsS = -7829368;
    this.tsT = false;
    this.tsU = -1593835521;
    this.tsV = false;
    this.tsW = -16777216;
    this.tsX = false;
    this.tsY = 0;
    this.tsZ = false;
    paramString = bh.q(paramString, "chatbg");
    String str = "." + "chatbg";
    try
    {
      this.version = bg.e(Integer.valueOf((String)paramString.get(str + ".$version")));
      this.tsS = ((int)bg.a(Long.valueOf(Long.parseLong((String)paramString.get(str + ".$time_color"), 16)), -7829368L));
      this.tsT = bg.b(Boolean.valueOf((String)paramString.get(str + ".$time_show_shadow_color")));
      this.tsU = ((int)bg.a(Long.valueOf(Long.parseLong((String)paramString.get(str + ".$time_shadow_color"), 16)), 0L));
      this.tsV = bg.b(Boolean.valueOf((String)paramString.get(str + ".$time_show_background")));
      this.tsW = ((int)bg.a(Long.valueOf(Long.parseLong((String)paramString.get(str + ".$voice_second_color"), 16)), -16777216L));
      this.tsX = bg.b(Boolean.valueOf((String)paramString.get(str + ".$voice_second_show_shadow_color")));
      this.tsY = ((int)bg.a(Long.valueOf(Long.parseLong((String)paramString.get(str + ".$voice_second_shadow_color"), 16)), 0L));
      this.tsZ = bg.b(Boolean.valueOf((String)paramString.get(str + ".$voice_second_show_background")));
      GMTrace.o(1182860836864L, 8813);
      return;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.ChatBgAttr", "parse chatbgattr failed");
      w.printErrStackTrace("MicroMsg.ChatBgAttr", paramString, "", new Object[0]);
      GMTrace.o(1182860836864L, 8813);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
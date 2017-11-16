package com.tencent.mm.x;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Map;

public class b
  extends c
{
  public String gip;
  
  public b()
  {
    GMTrace.i(16689169170432L, 124344);
    GMTrace.o(16689169170432L, 124344);
  }
  
  public final void a(StringBuilder paramStringBuilder, f.a parama, String paramString, keep_SceneResult paramkeep_SceneResult, int paramInt1, int paramInt2)
  {
    GMTrace.i(16689437605888L, 124346);
    GMTrace.o(16689437605888L, 124346);
  }
  
  public final void a(Map<String, String> paramMap, f.a parama)
  {
    GMTrace.i(16689571823616L, 124347);
    if (parama.type == 2001) {
      this.gip = bg.nl((String)paramMap.get(".msg.appmsg.wcpayinfo.locallogoicon"));
    }
    GMTrace.o(16689571823616L, 124347);
  }
  
  public final c yw()
  {
    GMTrace.i(16689303388160L, 124345);
    b localb = new b();
    GMTrace.o(16689303388160L, 124345);
    return localb;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\x\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
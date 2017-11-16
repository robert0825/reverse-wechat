package com.tencent.mm.plugin.game.gamewebview.model;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.ipcinvoker.g;
import com.tencent.mm.ipcinvoker.h;
import com.tencent.mm.ipcinvoker.wx_extension.service.IPCRunCgiRespWrapper;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class f
{
  public b lIq;
  public c lIr;
  
  public f(String paramString, c paramc)
  {
    GMTrace.i(17078669017088L, 127246);
    this.lIr = paramc;
    this.lIq = new b(paramString);
    GMTrace.o(17078669017088L, 127246);
  }
  
  private static final class a
    implements e, g<Bundle, IPCRunCgiRespWrapper>
  {
    private h<IPCRunCgiRespWrapper> lIv;
    
    private a()
    {
      GMTrace.i(18935839719424L, 141083);
      GMTrace.o(18935839719424L, 141083);
    }
    
    public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
    {
      GMTrace.i(18935973937152L, 141084);
      w.d("MicroMsg.GameWebViewGetA8KeyHelp", "onSceneEnd");
      at.wS().b(233, this);
      if (this.lIv != null)
      {
        IPCRunCgiRespWrapper localIPCRunCgiRespWrapper = new IPCRunCgiRespWrapper();
        localIPCRunCgiRespWrapper.errType = paramInt1;
        localIPCRunCgiRespWrapper.errCode = paramInt2;
        localIPCRunCgiRespWrapper.eAR = paramString;
        localIPCRunCgiRespWrapper.fUa = ((b)paramk.gud);
        this.lIv.al(localIPCRunCgiRespWrapper);
      }
      this.lIv = null;
      GMTrace.o(18935973937152L, 141084);
    }
  }
  
  public static final class b
  {
    private static final Pattern lIw;
    private String lIx;
    
    static
    {
      GMTrace.i(17078534799360L, 127245);
      lIw = Pattern.compile(".*#.*wechat_redirect");
      GMTrace.o(17078534799360L, 127245);
    }
    
    public b(String paramString)
    {
      GMTrace.i(17078266363904L, 127243);
      this.lIx = null;
      this.lIx = paramString;
      GMTrace.o(17078266363904L, 127243);
    }
    
    public final int zt(String paramString)
    {
      GMTrace.i(17078400581632L, 127244);
      if (bg.nm(paramString))
      {
        w.e("MicroMsg.GameWebViewGetA8KeyHelp", "getReason fail, url is null");
        GMTrace.o(17078400581632L, 127244);
        return 0;
      }
      if (paramString.equals(this.lIx))
      {
        GMTrace.o(17078400581632L, 127244);
        return 0;
      }
      if (lIw.matcher(paramString).find())
      {
        GMTrace.o(17078400581632L, 127244);
        return 2;
      }
      GMTrace.o(17078400581632L, 127244);
      return 1;
    }
  }
  
  public static abstract interface c
  {
    public abstract void a(int paramInt1, int paramInt2, String paramString, b paramb);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\model\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
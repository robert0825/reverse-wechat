package com.tencent.mm.plugin.emoji.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.g.a.be;
import com.tencent.mm.g.a.be.a;
import com.tencent.mm.loader.stub.b;
import com.tencent.mm.plugin.emoji.e.i;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.io.File;

public final class c
  extends com.tencent.mm.sdk.b.c<be>
{
  public c()
  {
    GMTrace.i(11359517409280L, 84635);
    this.vhf = be.class.getName().hashCode();
    GMTrace.o(11359517409280L, 84635);
  }
  
  private static boolean a(be parambe)
  {
    GMTrace.i(11359651627008L, 84636);
    i locali;
    if (parambe.eCw.eCs == 37) {
      if ((parambe.eCw.eCt == 5) && (parambe.eCw.eCx == 2))
      {
        locali = i.aqL();
        w.i("MicroMsg.emoji.EmojiResUpdateMgr", "delete emoji egg!");
      }
    }
    try
    {
      StringBuilder localStringBuilder = new StringBuilder();
      at.AR();
      b.deleteFile(com.tencent.mm.y.c.zn() + "eggingfo.ini");
      e.f(new File(i.aqM(), i.kiD));
      locali.kiU = null;
      if (parambe.eCw.eCx == 0) {
        w.i("MicroMsg.emoji.EmojiResUpdateOperationListener", "cache res type:%d subType:%d", new Object[] { Integer.valueOf(parambe.eCw.eCs), Integer.valueOf(parambe.eCw.eCt) });
      }
      GMTrace.o(11359651627008L, 84636);
      return false;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.emoji.EmojiResUpdateMgr", localException, "", new Object[0]);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.ui.chatting.b;

import android.widget.ImageButton;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.io;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.sdk.b.c;

public final class i
{
  public String jjP;
  public Runnable wIA;
  public Runnable wIB;
  public c wIC;
  public boolean wIz;
  public h wtd;
  
  public i(h paramh)
  {
    GMTrace.i(19209778102272L, 143124);
    this.jjP = null;
    this.wIz = false;
    this.wIA = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19197295853568L, 143031);
        i.this.wtd.cdS();
        GMTrace.o(19197295853568L, 143031);
      }
    };
    this.wIB = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19198503813120L, 143040);
        i.this.wtd.cdB();
        i.this.wtd.cdq().tzG = false;
        i.this.wtd.cdq().tzM = false;
        i.this.wtd.cdq().bMa();
        ChatFooter localChatFooter = i.this.wtd.cdq();
        if (localChatFooter.tzx != null) {
          localChatFooter.tzx.setVisibility(0);
        }
        localChatFooter = i.this.wtd.cdq();
        if (localChatFooter.tzu != null) {
          localChatFooter.tzu.setVisibility(0);
        }
        GMTrace.o(19198503813120L, 143040);
      }
    };
    this.wIC = new c() {};
    this.wtd = paramh;
    GMTrace.o(19209778102272L, 143124);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\b\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
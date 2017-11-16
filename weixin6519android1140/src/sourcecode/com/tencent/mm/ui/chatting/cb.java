package com.tencent.mm.ui.chatting;

import android.os.Bundle;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.storage.au;

final class cb
  implements ca.a
{
  cb()
  {
    GMTrace.i(2506113417216L, 18672);
    GMTrace.o(2506113417216L, 18672);
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau)
  {
    GMTrace.i(2506247634944L, 18673);
    parama = (ca.b)parama;
    parama.wxX.setText(paramau.field_content);
    Bundle localBundle = new Bundle();
    localBundle.putString("chatroom_name", parama1.cci());
    localBundle.putLong("msg_id", paramau.field_msgId);
    if ((paramau.field_flag & 0x8) != 0)
    {
      h.a(parama.wxX, 1, false, localBundle);
      parama.wxX.setClickable(true);
    }
    for (;;)
    {
      parama.wxX.invalidate();
      GMTrace.o(2506247634944L, 18673);
      return;
      h.a(parama.wxX, localBundle);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\cb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
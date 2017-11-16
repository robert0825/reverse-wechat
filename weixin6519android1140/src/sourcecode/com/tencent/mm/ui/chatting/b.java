package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.s;

final class b
{
  static void a(Intent paramIntent, En_5b8fbb1e.a parama, au paramau, ah paramah)
  {
    GMTrace.i(16267188633600L, 121200);
    String str = parama.cci();
    paramah = paramah.a(parama, paramau);
    Bundle localBundle = new Bundle();
    int i;
    if (parama.wvi) {
      i = 2;
    }
    for (;;)
    {
      localBundle.putInt("stat_scene", i);
      localBundle.putString("stat_msg_id", "msg_" + Long.toString(paramau.field_msgSvrId));
      localBundle.putString("stat_chat_talker_username", str);
      localBundle.putString("stat_send_msg_user", paramah);
      paramIntent.putExtra("_stat_obj", localBundle);
      GMTrace.o(16267188633600L, 121200);
      return;
      if (s.fD(str)) {
        i = 7;
      } else {
        i = 1;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
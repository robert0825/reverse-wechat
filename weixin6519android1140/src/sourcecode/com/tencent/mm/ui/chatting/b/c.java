package com.tencent.mm.ui.chatting.b;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewStub;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.u;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;

public final class c
{
  public static boolean W(x paramx)
  {
    GMTrace.i(19210851844096L, 143132);
    if ((paramx.field_username.equals("medianote")) && ((q.zI() & 0x4000) == 0))
    {
      GMTrace.o(19210851844096L, 143132);
      return true;
    }
    GMTrace.o(19210851844096L, 143132);
    return false;
  }
  
  public static ViewStub a(u paramu, int paramInt)
  {
    GMTrace.i(19210986061824L, 143133);
    paramu = (ViewStub)paramu.findViewById(paramInt);
    if (paramu != null) {
      paramu.inflate();
    }
    GMTrace.o(19210986061824L, 143133);
    return paramu;
  }
  
  public static void a(h paramh, au paramau, Intent paramIntent)
  {
    GMTrace.i(19210583408640L, 143130);
    if ((paramh == null) || (paramau == null))
    {
      GMTrace.o(19210583408640L, 143130);
      return;
    }
    String str = paramh.cci();
    Object localObject2 = paramh.ccY().field_username;
    Object localObject1;
    if (!paramh.ccU())
    {
      localObject1 = localObject2;
      if (!paramh.ccV()) {}
    }
    else
    {
      if (!paramh.ccU()) {
        break label195;
      }
      localObject1 = bc.gP(paramau.field_content);
      if ((localObject2 == null) || (localObject1 == null) || (((String)localObject1).length() <= 0)) {
        break label231;
      }
    }
    for (;;)
    {
      localObject2 = new Bundle();
      int i;
      if (paramh.ccU()) {
        i = 2;
      }
      for (;;)
      {
        ((Bundle)localObject2).putInt("stat_scene", i);
        ((Bundle)localObject2).putString("stat_msg_id", "msg_" + Long.toString(paramau.field_msgSvrId));
        ((Bundle)localObject2).putString("stat_chat_talker_username", str);
        ((Bundle)localObject2).putString("stat_send_msg_user", (String)localObject1);
        paramIntent.putExtra("_stat_obj", (Bundle)localObject2);
        GMTrace.o(19210583408640L, 143130);
        return;
        label195:
        localObject1 = localObject2;
        if (paramau == null) {
          break;
        }
        localObject1 = paramau.field_bizChatUserId;
        break;
        if (s.fD(str)) {
          i = 7;
        } else {
          i = 1;
        }
      }
      label231:
      localObject1 = localObject2;
    }
  }
  
  public static boolean c(au paramau, String paramString)
  {
    GMTrace.i(19210717626368L, 143131);
    if ((System.currentTimeMillis() - paramau.field_createTime > 259200000L) && ((bg.nm(paramString)) || (!e.aZ(paramString))))
    {
      GMTrace.o(19210717626368L, 143131);
      return true;
    }
    GMTrace.o(19210717626368L, 143131);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
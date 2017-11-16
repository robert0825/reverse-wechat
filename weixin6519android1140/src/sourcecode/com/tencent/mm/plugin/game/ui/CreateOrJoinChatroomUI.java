package com.tencent.mm.plugin.game.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.u.a;
import com.tencent.mm.opensdk.channel.MMessageActV2;
import com.tencent.mm.opensdk.channel.MMessageActV2.Args;
import com.tencent.mm.opensdk.modelbiz.CreateChatroom.Resp;
import com.tencent.mm.opensdk.modelbiz.JoinChatroom.Resp;
import com.tencent.mm.plugin.game.c.aa;
import com.tencent.mm.plugin.game.c.t;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.v;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;

@a(7)
public class CreateOrJoinChatroomUI
  extends MMBaseActivity
{
  private String hyD;
  private ProgressDialog jIU;
  private String lTV;
  private String lTW;
  private String lTX;
  private String lTY;
  private String lTZ;
  private int lUa;
  private String mPackageName;
  private String uC;
  
  public CreateOrJoinChatroomUI()
  {
    GMTrace.i(12744778579968L, 94956);
    this.lUa = 1;
    this.jIU = null;
    GMTrace.o(12744778579968L, 94956);
  }
  
  private void aGr()
  {
    GMTrace.i(12745181233152L, 94959);
    if ((this.jIU != null) && (this.jIU.isShowing())) {
      this.jIU.cancel();
    }
    GMTrace.o(12745181233152L, 94959);
  }
  
  private void oK(int paramInt)
  {
    GMTrace.i(12745449668608L, 94961);
    Object localObject1 = g.aP(this.hyD, true);
    Bundle localBundle = new Bundle();
    Object localObject2;
    if (this.uC.equals("action_create"))
    {
      localObject2 = new CreateChatroom.Resp();
      if (localObject1 != null) {
        ((CreateChatroom.Resp)localObject2).openId = ((f)localObject1).field_openId;
      }
      ((CreateChatroom.Resp)localObject2).transaction = this.lTV;
      ((CreateChatroom.Resp)localObject2).extMsg = this.lTZ;
      ((CreateChatroom.Resp)localObject2).errCode = paramInt;
      ((CreateChatroom.Resp)localObject2).toBundle(localBundle);
    }
    for (;;)
    {
      localObject1 = new MMessageActV2.Args();
      ((MMessageActV2.Args)localObject1).targetPkgName = this.mPackageName;
      ((MMessageActV2.Args)localObject1).bundle = localBundle;
      p.ag(localBundle);
      p.ah(localBundle);
      MMessageActV2.send(com.tencent.mm.sdk.platformtools.ab.getContext(), (MMessageActV2.Args)localObject1);
      GMTrace.o(12745449668608L, 94961);
      return;
      if (this.uC.equals("action_join"))
      {
        localObject2 = new JoinChatroom.Resp();
        if (localObject1 != null) {
          ((JoinChatroom.Resp)localObject2).openId = ((f)localObject1).field_openId;
        }
        ((JoinChatroom.Resp)localObject2).transaction = this.lTV;
        ((JoinChatroom.Resp)localObject2).extMsg = this.lTZ;
        ((JoinChatroom.Resp)localObject2).errCode = paramInt;
        ((JoinChatroom.Resp)localObject2).toBundle(localBundle);
      }
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(12745315450880L, 94960);
    if (paramInt1 == 5)
    {
      if (paramInt2 != 4) {
        break label36;
      }
      oK(0);
    }
    for (;;)
    {
      finish();
      GMTrace.o(12745315450880L, 94960);
      return;
      label36:
      if (paramInt2 == 5)
      {
        if (paramIntent != null)
        {
          paramIntent = paramIntent.getStringExtra("rawUrl");
          p.a.tme.b(this, paramIntent, true, null);
        }
      }
      else if (paramInt2 == 0) {
        oK(-2);
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12744912797696L, 94957);
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    w.i("MicroMsg.CreateOrJoinChatroomUI", "onCreate");
    paramBundle = getIntent();
    this.uC = paramBundle.getStringExtra("action");
    this.mPackageName = paramBundle.getStringExtra("package_name");
    this.hyD = paramBundle.getStringExtra("key_app_id");
    this.lTV = paramBundle.getStringExtra("key_transaction");
    this.lTW = paramBundle.getStringExtra("group_id");
    this.lTX = paramBundle.getStringExtra("chatroom_name");
    this.lTY = paramBundle.getStringExtra("chatroom_nickname");
    this.lTZ = paramBundle.getStringExtra("ext_msg");
    if ((bg.nm(this.uC)) || (bg.nm(this.hyD)) || (bg.nm(this.lTW)))
    {
      w.e("MicroMsg.CreateOrJoinChatroomUI", "Invalid args");
      finish();
      GMTrace.o(12744912797696L, 94957);
      return;
    }
    this.jIU = h.a(this, getBaseContext().getString(R.l.efX), true, null);
    com.tencent.mm.ad.b localb;
    Object localObject;
    if (this.uC.equals("action_create"))
    {
      w.i("MicroMsg.CreateOrJoinChatroomUI", "createChatroom, appid = %s, groupId = %s, ChatRoomName = %s", new Object[] { this.hyD, this.lTW, this.lTX });
      paramBundle = new b.a();
      paramBundle.gtF = new t();
      paramBundle.gtG = new com.tencent.mm.plugin.game.c.u();
      paramBundle.uri = "/cgi-bin/mmgame-bin/gamecreatechatroom";
      paramBundle.gtE = 1205;
      localb = paramBundle.DA();
      localObject = (t)localb.gtC.gtK;
      ((t)localObject).lPg = this.hyD;
      ((t)localObject).lQh = this.lTW;
      if (this.lTX == null)
      {
        paramBundle = new byte[0];
        ((t)localObject).lQi = new com.tencent.mm.bm.b(paramBundle);
        if (this.lTY != null) {
          break label384;
        }
      }
      label384:
      for (paramBundle = new byte[0];; paramBundle = this.lTY.getBytes())
      {
        ((t)localObject).lQj = new com.tencent.mm.bm.b(paramBundle);
        com.tencent.mm.ad.u.a(localb, new u.a()
        {
          public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb, k paramAnonymousk)
          {
            GMTrace.i(12728269799424L, 94833);
            paramAnonymousb = (com.tencent.mm.plugin.game.c.u)paramAnonymousb.gtD.gtK;
            if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
            {
              w.e("MicroMsg.CreateOrJoinChatroomUI", "CGI return is not OK. (%d, %d)(%s)", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
              if (paramAnonymousInt1 == 4) {
                CreateOrJoinChatroomUI.a(CreateOrJoinChatroomUI.this, paramAnonymousb.kBk);
              }
              for (;;)
              {
                CreateOrJoinChatroomUI.a(CreateOrJoinChatroomUI.this);
                CreateOrJoinChatroomUI.this.finish();
                GMTrace.o(12728269799424L, 94833);
                return 0;
                CreateOrJoinChatroomUI.a(CreateOrJoinChatroomUI.this, -1);
              }
            }
            paramAnonymousString = paramAnonymousb.lQk;
            w.i("MicroMsg.CreateOrJoinChatroomUI", "Create Url: %s", new Object[] { paramAnonymousString });
            CreateOrJoinChatroomUI.a(CreateOrJoinChatroomUI.this);
            CreateOrJoinChatroomUI.a(CreateOrJoinChatroomUI.this, paramAnonymousString);
            GMTrace.o(12728269799424L, 94833);
            return 0;
          }
        });
        GMTrace.o(12744912797696L, 94957);
        return;
        paramBundle = this.lTX.getBytes();
        break;
      }
    }
    if (this.uC.equals("action_join"))
    {
      paramBundle = new b.a();
      paramBundle.gtF = new aa();
      paramBundle.gtG = new com.tencent.mm.plugin.game.c.ab();
      paramBundle.uri = "/cgi-bin/mmgame-bin/gamejoinchatroom";
      paramBundle.gtE = 1206;
      localb = paramBundle.DA();
      localObject = (aa)localb.gtC.gtK;
      ((aa)localObject).lPg = this.hyD;
      ((aa)localObject).lQh = this.lTW;
      if (this.lTY != null) {
        break label528;
      }
    }
    label528:
    for (paramBundle = new byte[0];; paramBundle = this.lTY.getBytes())
    {
      ((aa)localObject).lQj = new com.tencent.mm.bm.b(paramBundle);
      com.tencent.mm.ad.u.a(localb, new u.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb, k paramAnonymousk)
        {
          GMTrace.i(12771487907840L, 95155);
          paramAnonymousb = (com.tencent.mm.plugin.game.c.ab)paramAnonymousb.gtD.gtK;
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            w.e("MicroMsg.CreateOrJoinChatroomUI", "CGI return is not OK. (%d, %d)(%s)", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
            if (paramAnonymousInt1 == 4) {
              CreateOrJoinChatroomUI.a(CreateOrJoinChatroomUI.this, paramAnonymousb.kBk);
            }
            for (;;)
            {
              CreateOrJoinChatroomUI.a(CreateOrJoinChatroomUI.this);
              CreateOrJoinChatroomUI.this.finish();
              GMTrace.o(12771487907840L, 95155);
              return 0;
              CreateOrJoinChatroomUI.a(CreateOrJoinChatroomUI.this, -1);
            }
          }
          paramAnonymousString = paramAnonymousb.lQz;
          w.i("MicroMsg.CreateOrJoinChatroomUI", "Join Url: %s", new Object[] { paramAnonymousString });
          CreateOrJoinChatroomUI.a(CreateOrJoinChatroomUI.this);
          CreateOrJoinChatroomUI.a(CreateOrJoinChatroomUI.this, paramAnonymousString);
          GMTrace.o(12771487907840L, 95155);
          return 0;
        }
      });
      GMTrace.o(12744912797696L, 94957);
      return;
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12745047015424L, 94958);
    aGr();
    super.onDestroy();
    GMTrace.o(12745047015424L, 94958);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\game\ui\CreateOrJoinChatroomUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
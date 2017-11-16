package com.tencent.mm.plugin.subapp.ui.friend;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.bc.f;
import com.tencent.mm.bc.g;
import com.tencent.mm.bj.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au.a;
import com.tencent.mm.storage.au.d;
import com.tencent.mm.storage.q;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.at;
import junit.framework.Assert;

public final class a
  implements AdapterView.OnItemClickListener
{
  private Context context;
  private boolean gtJ;
  private b qsK;
  
  public a(Context paramContext, b paramb, boolean paramBoolean)
  {
    GMTrace.i(5820620210176L, 43367);
    this.gtJ = false;
    this.context = paramContext;
    this.qsK = paramb;
    this.gtJ = paramBoolean;
    GMTrace.o(5820620210176L, 43367);
  }
  
  public static void a(Context paramContext, f paramf, boolean paramBoolean)
  {
    GMTrace.i(5821022863360L, 43370);
    String str = paramf.field_msgContent;
    w.w("MicroMsg.FConversationOnItemClickListener", "dealClickVerifyMsgEvent : " + str);
    if ((str == null) || (str.length() <= 0))
    {
      GMTrace.o(5821022863360L, 43370);
      return;
    }
    at.AR();
    au.d locald = com.tencent.mm.y.c.yM().Cm(str);
    boolean bool;
    x localx;
    Intent localIntent;
    if ((locald != null) && (!bg.nm(locald.rAP)))
    {
      if (locald.rAP.length() <= 0) {
        break label643;
      }
      bool = true;
      Assert.assertTrue(bool);
      at.AR();
      localx = com.tencent.mm.y.c.yK().TE(locald.rAP);
      localIntent = new Intent();
      if (paramBoolean == true) {
        localIntent.putExtra("Accept_NewFriend_FromOutside", true);
      }
      localIntent.putExtra("Contact_ShowUserName", false);
      localIntent.putExtra("Contact_ShowFMessageList", true);
      localIntent.putExtra("Contact_Scene", locald.scene);
      localIntent.putExtra("Verify_ticket", locald.nLA);
      localIntent.putExtra("Contact_Source_FMessage", locald.scene);
      if ((localx == null) || ((int)localx.fTq <= 0) || (!com.tencent.mm.l.a.eE(localx.field_type))) {
        break label648;
      }
      localIntent.putExtra("Contact_User", localx.field_username);
      com.tencent.mm.plugin.subapp.b.hnI.a(localIntent, localx.field_username);
      label259:
      str = locald.content;
      paramf = str;
      if (bg.nl(str).length() <= 0) {
        switch (locald.scene)
        {
        }
      }
    }
    for (paramf = paramContext.getString(R.l.dfx);; paramf = paramContext.getString(R.l.dfB))
    {
      localIntent.putExtra("Contact_Content", paramf);
      if ((locald.vBF == 1) && (!bg.nm(locald.vBH))) {
        localIntent.putExtra("Safety_Warning_Detail", locald.vBH);
      }
      localIntent.putExtra("Contact_verify_Scene", locald.scene);
      if (((locald.scene == 14) || (locald.scene == 8)) && (!bg.nm(locald.chatroomName)))
      {
        at.AR();
        paramf = com.tencent.mm.y.c.yT().gC(locald.chatroomName);
        if (paramf != null) {
          localIntent.putExtra("Contact_RoomNickname", paramf.fs(locald.rAP));
        }
      }
      localIntent.putExtra("Contact_Uin", locald.nNL);
      localIntent.putExtra("Contact_QQNick", locald.gEa);
      localIntent.putExtra("Contact_Mobile_MD5", locald.vBs);
      localIntent.putExtra("User_From_Fmessage", true);
      localIntent.putExtra("Contact_from_msgType", 37);
      if ((localx == null) || (!com.tencent.mm.l.a.eE(localx.field_type))) {
        localIntent.putExtra("Contact_KSnsIFlag", 0);
      }
      localIntent.putExtra("Contact_KSnsBgUrl", locald.vBD);
      localIntent.putExtra("verify_gmail", locald.nNN);
      localIntent.putExtra("source_from_user_name", locald.twr);
      localIntent.putExtra("source_from_nick_name", locald.tws);
      d.b(paramContext, "profile", ".ui.ContactInfoUI", localIntent);
      GMTrace.o(5821022863360L, 43370);
      return;
      label643:
      bool = false;
      break;
      label648:
      if ((paramf.field_type == 1) || (paramf.field_type == 2)) {
        localIntent.putExtra("User_Verify", true);
      }
      localIntent.putExtra("Contact_User", locald.rAP);
      localIntent.putExtra("Contact_Alias", locald.fsF);
      localIntent.putExtra("Contact_Nick", locald.eCQ);
      localIntent.putExtra("Contact_QuanPin", locald.gDZ);
      localIntent.putExtra("Contact_PyInitial", locald.gDY);
      localIntent.putExtra("Contact_Sex", locald.fja);
      localIntent.putExtra("Contact_Signature", locald.signature);
      localIntent.putExtra("Contact_FMessageCard", true);
      localIntent.putExtra("Contact_City", locald.getCity());
      localIntent.putExtra("Contact_Province", locald.getProvince());
      localIntent.putExtra("Contact_Mobile_MD5", locald.vBs);
      localIntent.putExtra("Contact_full_Mobile_MD5", locald.vBt);
      localIntent.putExtra("Contact_KSnsBgUrl", locald.vBD);
      break label259;
    }
  }
  
  public static void g(Context paramContext, String paramString, boolean paramBoolean)
  {
    GMTrace.i(5820888645632L, 43369);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("MicroMsg.FConversationOnItemClickListener", "dealOnClick fail, talker is null");
      GMTrace.o(5820888645632L, 43369);
      return;
    }
    w.d("MicroMsg.FConversationOnItemClickListener", "dealOnClick, talker = " + paramString);
    com.tencent.mm.bc.l.ML().lK(paramString);
    Object localObject = com.tencent.mm.bc.l.MK().lP(paramString);
    if (localObject == null)
    {
      w.e("MicroMsg.FConversationOnItemClickListener", "onItemClick, lastRecvFmsg is null, talker = " + paramString);
      GMTrace.o(5820888645632L, 43369);
      return;
    }
    if (((f)localObject).field_type == 0)
    {
      at.AR();
      au.a locala = com.tencent.mm.y.c.yM().Cn(((f)localObject).field_msgContent);
      if ((locala != null) && (locala.rAP.length() > 0))
      {
        Bundle localBundle = new Bundle();
        localBundle.putBoolean("Contact_ShowFMessageList", true);
        localBundle.putInt("Contact_Source_FMessage", locala.scene);
        at.AR();
        x localx = com.tencent.mm.y.c.yK().TE(locala.rAP);
        if ((localx != null) && ((int)localx.fTq > 0) && (com.tencent.mm.l.a.eE(localx.field_type)))
        {
          com.tencent.mm.plugin.subapp.b.hnI.a(paramContext, localx, locala, localBundle, "");
          GMTrace.o(5820888645632L, 43369);
          return;
        }
        if (locala.nNL > 0L)
        {
          if ((bg.nm(locala.gEd)) && (bg.nm(locala.gEa)) && (!bg.nm(locala.eCQ))) {
            localBundle.putString("Contact_QQNick", locala.eCQ);
          }
          com.tencent.mm.plugin.subapp.b.hnI.a(paramContext, locala, localBundle);
          GMTrace.o(5820888645632L, 43369);
          return;
        }
        if ((!bg.nm(locala.vBs)) || (!bg.nm(locala.vBt)))
        {
          localObject = com.tencent.mm.modelfriend.af.If().jK(locala.vBs);
          if ((localObject != null) && (((com.tencent.mm.modelfriend.b)localObject).GS() != null))
          {
            paramString = (String)localObject;
            if (((com.tencent.mm.modelfriend.b)localObject).GS().length() > 0) {}
          }
          else
          {
            localObject = com.tencent.mm.modelfriend.af.If().jK(locala.vBt);
            if ((localObject != null) && (((com.tencent.mm.modelfriend.b)localObject).GS() != null))
            {
              paramString = (String)localObject;
              if (((com.tencent.mm.modelfriend.b)localObject).GS().length() > 0) {}
            }
            else
            {
              if ((localx != null) && ((int)localx.fTq > 0)) {
                com.tencent.mm.plugin.subapp.b.hnI.a(paramContext, localx, locala, localBundle, "");
              }
              for (;;)
              {
                w.e("MicroMsg.FConversationOnItemClickListener", "error : this is not the mobile contact, MD5 = " + locala.vBs + " fullMD5:" + locala.vBt);
                GMTrace.o(5820888645632L, 43369);
                return;
                com.tencent.mm.plugin.subapp.b.hnI.a(paramContext, locala, localBundle);
              }
            }
          }
          if ((paramString.getUsername() == null) || (paramString.getUsername().length() <= 0))
          {
            paramString.username = locala.rAP;
            paramString.eQl = 128;
            if (com.tencent.mm.modelfriend.af.If().a(paramString.GS(), paramString) == -1)
            {
              w.e("MicroMsg.FConversationOnItemClickListener", "update mobile contact username failed");
              GMTrace.o(5820888645632L, 43369);
              return;
            }
          }
          com.tencent.mm.plugin.subapp.b.hnI.a(paramContext, locala, localBundle);
          GMTrace.o(5820888645632L, 43369);
          return;
        }
        com.tencent.mm.plugin.subapp.b.hnI.a(paramContext, locala, localBundle);
      }
      GMTrace.o(5820888645632L, 43369);
      return;
    }
    a(paramContext, (f)localObject, paramBoolean);
    GMTrace.o(5820888645632L, 43369);
  }
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(5820754427904L, 43368);
    int i = paramInt;
    if (this.gtJ) {
      i = paramInt - 1;
    }
    paramAdapterView = (com.tencent.mm.bc.b)this.qsK.getItem(i);
    if (paramAdapterView == null)
    {
      w.e("MicroMsg.FConversationOnItemClickListener", "onItemClick, item is null, pos = " + i);
      GMTrace.o(5820754427904L, 43368);
      return;
    }
    g(this.context, paramAdapterView.field_talker, false);
    GMTrace.o(5820754427904L, 43368);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\subapp\ui\friend\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
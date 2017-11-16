package com.tencent.mm.plugin.subapp.ui.friend;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bc.f;
import com.tencent.mm.bc.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.a.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au.d;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.q;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.o;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;
import java.util.LinkedList;

public final class b
  extends o<com.tencent.mm.bc.b>
{
  private Context context;
  private View.OnClickListener qsL;
  private View.OnClickListener qsM;
  
  public b(Context paramContext)
  {
    super(paramContext, new com.tencent.mm.bc.b());
    GMTrace.i(5817533202432L, 43344);
    this.qsL = new View.OnClickListener()
    {
      public final void onClick(final View paramAnonymousView)
      {
        GMTrace.i(5820351774720L, 43365);
        if ((paramAnonymousView.getTag() instanceof com.tencent.mm.pluginsdk.ui.preference.b))
        {
          w.d("MicroMsg.FMessageConversationUI", "addOnClick onClick");
          paramAnonymousView = (com.tencent.mm.pluginsdk.ui.preference.b)paramAnonymousView.getTag();
          if ((paramAnonymousView == null) || (bg.nm(paramAnonymousView.username)))
          {
            w.e("MicroMsg.FMessageConversationUI", "cpan add contact failed. username is null.");
            GMTrace.o(5820351774720L, 43365);
            return;
          }
          final Object localObject = l.MK().lP(paramAnonymousView.username);
          localObject = new com.tencent.mm.pluginsdk.ui.applet.a(b.a(b.this), new a.a()
          {
            public final void a(boolean paramAnonymous2Boolean1, boolean paramAnonymous2Boolean2, String paramAnonymous2String1, String paramAnonymous2String2)
            {
              GMTrace.i(5816056807424L, 43333);
              if (paramAnonymous2Boolean1)
              {
                at.AR();
                paramAnonymous2String2 = com.tencent.mm.y.c.yK().TE(paramAnonymousView.username);
                paramAnonymous2String1 = paramAnonymous2String2;
                if ((int)paramAnonymous2String2.fTq == 0)
                {
                  paramAnonymous2String2 = com.tencent.mm.pluginsdk.ui.preference.b.b(localObject);
                  at.AR();
                  paramAnonymous2String1 = paramAnonymous2String2;
                  if (!com.tencent.mm.y.c.yK().R(paramAnonymous2String2))
                  {
                    w.e("MicroMsg.FMessageConversationUI", "canAddContact fail, insert fail");
                    GMTrace.o(5816056807424L, 43333);
                    return;
                  }
                }
                s.p(paramAnonymous2String1);
                l.ML().J(paramAnonymousView.username, 1);
                com.tencent.mm.ui.base.h.bm(b.a(b.this), b.a(b.this).getString(R.l.cRL));
                b.a(b.this, paramAnonymousView.username);
              }
              for (;;)
              {
                b.this.notifyDataSetChanged();
                GMTrace.o(5816056807424L, 43333);
                return;
                if (!paramAnonymous2Boolean2) {
                  break;
                }
                l.ML().J(paramAnonymousView.username, 2);
              }
              w.e("MicroMsg.FMessageConversationUI", "canAddContact fail, username = " + paramAnonymousView.username);
              GMTrace.o(5816056807424L, 43333);
            }
          });
          w.d("MicroMsg.FMessageConversationUI", "try to addcontact, username = " + paramAnonymousView.username + ", opcode = MM_VERIFYUSER_ADDCONTACT");
          LinkedList localLinkedList = new LinkedList();
          localLinkedList.add(Integer.valueOf(paramAnonymousView.oPH));
          ((com.tencent.mm.pluginsdk.ui.applet.a)localObject).b(paramAnonymousView.username, localLinkedList, true);
        }
        GMTrace.o(5820351774720L, 43365);
      }
    };
    this.qsM = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5819009597440L, 43355);
        if ((paramAnonymousView.getTag() instanceof com.tencent.mm.pluginsdk.ui.preference.b))
        {
          w.d("MicroMsg.FMessageConversationUI", "verifyOkOnClick onClick");
          Object localObject1 = (com.tencent.mm.pluginsdk.ui.preference.b)paramAnonymousView.getTag();
          final Object localObject2 = l.MK().lP(((com.tencent.mm.pluginsdk.ui.preference.b)localObject1).username);
          if ((localObject2 == null) || (((f)localObject2).field_msgContent == null))
          {
            w.e("MicroMsg.FMessageConversationUI", "lastRecvFmsg is null, verify fail, talker = " + ((com.tencent.mm.pluginsdk.ui.preference.b)localObject1).username);
            GMTrace.o(5819009597440L, 43355);
            return;
          }
          paramAnonymousView = au.d.Uk(((f)localObject2).field_msgContent);
          w.d("MicroMsg.FMessageConversationUI", "try to addcontact, username = " + ((com.tencent.mm.pluginsdk.ui.preference.b)localObject1).username + ", opcode = MM_VERIFYUSER_VERIFYOK");
          if (paramAnonymousView.vBF == 1)
          {
            com.tencent.mm.ui.base.h.a(b.a(b.this), paramAnonymousView.vBG, null, b.a(b.this).getString(R.l.dwl), b.a(b.this).getString(R.l.cSk), true, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(5818741161984L, 43353);
                a.a(b.a(b.this), localObject2, false);
                GMTrace.o(5818741161984L, 43353);
              }
            }, null);
            GMTrace.o(5819009597440L, 43355);
            return;
          }
          at.AR();
          bb localbb = com.tencent.mm.y.c.yL().CC(((com.tencent.mm.pluginsdk.ui.preference.b)localObject1).username);
          localObject2 = new Intent();
          ((Intent)localObject2).putExtra("Contact_User", ((com.tencent.mm.pluginsdk.ui.preference.b)localObject1).username);
          ((Intent)localObject2).putExtra("Contact_Nick", ((com.tencent.mm.pluginsdk.ui.preference.b)localObject1).eCQ);
          if (localbb != null) {
            ((Intent)localObject2).putExtra("Contact_RemarkName", localbb.field_conRemark);
          }
          if (!bg.nm(paramAnonymousView.chatroomName))
          {
            at.AR();
            localObject1 = com.tencent.mm.y.c.yT().gC(paramAnonymousView.chatroomName);
            if (localObject1 != null) {
              ((Intent)localObject2).putExtra("Contact_RoomNickname", ((q)localObject1).fs(paramAnonymousView.rAP));
            }
          }
          ((Intent)localObject2).putExtra("Contact_Scene", paramAnonymousView.scene);
          ((Intent)localObject2).putExtra("Verify_ticket", paramAnonymousView.nLA);
          ((Intent)localObject2).putExtra("sayhi_with_sns_perm_send_verify", false);
          ((Intent)localObject2).putExtra("sayhi_with_sns_perm_add_remark", true);
          ((Intent)localObject2).putExtra("sayhi_with_sns_perm_set_label", true);
          ((Intent)localObject2).putExtra("sayhi_with_jump_to_profile", true);
          d.b(b.a(b.this), "profile", ".ui.SayHiWithSnsPermissionUI", (Intent)localObject2);
        }
        GMTrace.o(5819009597440L, 43355);
      }
    };
    this.context = paramContext;
    GMTrace.o(5817533202432L, 43344);
  }
  
  public final void QF()
  {
    GMTrace.i(5817801637888L, 43346);
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      setCursor(l.ML().Mx());
      notifyDataSetChanged();
      GMTrace.o(5817801637888L, 43346);
      return;
    }
    com.tencent.mm.sdk.platformtools.af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5821559734272L, 43374);
        b.a(b.this, l.ML().Mx());
        b.this.notifyDataSetChanged();
        GMTrace.o(5821559734272L, 43374);
      }
    });
    GMTrace.o(5817801637888L, 43346);
  }
  
  protected final void QG()
  {
    GMTrace.i(5817935855616L, 43347);
    aJe();
    QF();
    GMTrace.o(5817935855616L, 43347);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(5817667420160L, 43345);
    if (paramView == null)
    {
      paramView = View.inflate(this.context, R.i.cxm, null);
      paramViewGroup = new a();
      paramViewGroup.qsS = ((MaskLayout)paramView.findViewById(R.h.bAw));
      paramViewGroup.nNR = ((TextView)paramView.findViewById(R.h.bAz));
      paramViewGroup.qsX = ((TextView)paramView.findViewById(R.h.bAx));
      paramViewGroup.qsT = ((Button)paramView.findViewById(R.h.bAt));
      paramViewGroup.qsT.setOnClickListener(this.qsL);
      paramViewGroup.qsU = ((Button)paramView.findViewById(R.h.bAC));
      paramViewGroup.qsU.setOnClickListener(this.qsM);
      paramViewGroup.qsV = ((TextView)paramView.findViewById(R.h.bAA));
      paramViewGroup.qsW = ((TextView)paramView.findViewById(R.h.bAv));
      paramView.setTag(paramViewGroup);
    }
    com.tencent.mm.bc.b localb;
    for (;;)
    {
      localb = (com.tencent.mm.bc.b)getItem(paramInt);
      a.b.a((ImageView)paramViewGroup.qsS.view, localb.field_talker);
      paramViewGroup.nNR.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.context, localb.field_displayName, paramViewGroup.nNR.getTextSize()));
      if (localb.field_fmsgSysRowId > 0L) {
        break label532;
      }
      w.w("MicroMsg.FMessageConversationUI", "getView, fconv fmsgSysRowId is invalid, try getLastFmsg");
      localObject1 = l.MK().lO(localb.field_talker);
      if (localObject1 != null) {
        break;
      }
      w.e("MicroMsg.FMessageConversationUI", "getView, lastFmsg is null, talker = " + localb.field_talker);
      paramViewGroup.qsT.setVisibility(8);
      paramViewGroup.qsU.setVisibility(8);
      paramViewGroup.qsV.setVisibility(8);
      paramViewGroup.qsW.setVisibility(8);
      paramViewGroup.qsX.setVisibility(8);
      GMTrace.o(5817667420160L, 43345);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
    }
    Object localObject1 = com.tencent.mm.pluginsdk.ui.preference.b.a(this.context, (f)localObject1);
    w.i("MicroMsg.FMessageConversationUI", "getView, lastFmsg talker = " + localb.field_talker);
    Object localObject2;
    if (localb.field_state == 1)
    {
      at.AR();
      localObject2 = com.tencent.mm.y.c.yK().TE(localb.field_talker);
      if ((localObject2 != null) && ((int)((com.tencent.mm.l.a)localObject2).fTq != 0) && (!com.tencent.mm.l.a.eE(((com.tencent.mm.g.b.af)localObject2).field_type))) {
        l.ML().J(localb.field_talker, 0);
      }
    }
    if (localObject1 == null)
    {
      w.e("MicroMsg.FMessageConversationUI", "getView, fProvider is null, talker = " + localb.field_talker);
      paramViewGroup.qsT.setVisibility(8);
      paramViewGroup.qsU.setVisibility(8);
      paramViewGroup.qsV.setVisibility(8);
      paramViewGroup.qsW.setVisibility(8);
      paramViewGroup.qsX.setVisibility(8);
      GMTrace.o(5817667420160L, 43345);
      return paramView;
      label532:
      localObject1 = this.context;
      long l = localb.field_fmsgSysRowId;
      if (localb.field_fmsgIsSend % 2 == 0) {}
      for (boolean bool = true;; bool = false)
      {
        localObject1 = com.tencent.mm.pluginsdk.ui.preference.b.a((Context)localObject1, l, bool, localb.field_talker, localb.field_fmsgContent, localb.field_fmsgType, localb.field_contentFromUsername, localb.field_contentNickname, localb.field_contentPhoneNumMD5, localb.field_contentFullPhoneNumMD5, localb.field_contentVerifyContent, localb.field_addScene);
        w.i("MicroMsg.FMessageConversationUI", "getView, lastFmsg sysrowid = " + localb.field_fmsgSysRowId + ", talker = " + localb.field_talker);
        break;
      }
    }
    ((com.tencent.mm.pluginsdk.ui.preference.b)localObject1).oPH = localb.field_addScene;
    paramViewGroup.qsX.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.context, ((com.tencent.mm.pluginsdk.ui.preference.b)localObject1).glz, paramViewGroup.qsX.getTextSize()));
    switch (localb.field_state)
    {
    default: 
      paramViewGroup.qsT.setVisibility(8);
      paramViewGroup.qsU.setVisibility(8);
      paramViewGroup.qsV.setVisibility(8);
      paramViewGroup.qsW.setVisibility(8);
      paramViewGroup = paramView.findViewById(R.h.bAy);
      if (localb.field_isNew != 0) {
        break;
      }
    }
    for (paramInt = R.g.aXU;; paramInt = R.g.aVN)
    {
      paramViewGroup.setBackgroundResource(paramInt);
      GMTrace.o(5817667420160L, 43345);
      return paramView;
      if (localb.field_fmsgSysRowId <= 0L)
      {
        w.w("MicroMsg.FMessageConversationUI", "getView, fmsgSysRowId invalid, try use lastRecvFmsg");
        localObject2 = l.MK().lP(((com.tencent.mm.pluginsdk.ui.preference.b)localObject1).username);
        if (localObject2 == null)
        {
          paramInt = 0;
          label842:
          if ((paramInt != 0) && (paramInt != 3)) {
            break label916;
          }
          paramViewGroup.qsT.setVisibility(0);
          paramViewGroup.qsT.setTag(localObject1);
          paramViewGroup.qsU.setVisibility(8);
        }
      }
      for (;;)
      {
        paramViewGroup.qsV.setVisibility(8);
        paramViewGroup.qsW.setVisibility(8);
        break;
        paramInt = ((f)localObject2).field_type;
        break label842;
        paramInt = localb.field_recvFmsgType;
        break label842;
        label916:
        paramViewGroup.qsU.setVisibility(0);
        paramViewGroup.qsU.setTag(localObject1);
        paramViewGroup.qsT.setVisibility(8);
      }
      paramViewGroup.qsV.setVisibility(0);
      paramViewGroup.qsT.setVisibility(8);
      paramViewGroup.qsU.setVisibility(8);
      paramViewGroup.qsW.setVisibility(8);
      break;
      paramViewGroup.qsW.setVisibility(0);
      paramViewGroup.qsT.setVisibility(8);
      paramViewGroup.qsU.setVisibility(8);
      paramViewGroup.qsV.setVisibility(8);
      break;
    }
  }
  
  static final class a
  {
    public TextView nNR;
    public MaskLayout qsS;
    public Button qsT;
    public Button qsU;
    public TextView qsV;
    public TextView qsW;
    public TextView qsX;
    
    a()
    {
      GMTrace.i(5819814903808L, 43361);
      GMTrace.o(5819814903808L, 43361);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\subapp\ui\friend\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
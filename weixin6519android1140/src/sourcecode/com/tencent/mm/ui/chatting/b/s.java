package com.tencent.mm.ui.chatting.b;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.rb;
import com.tencent.mm.g.a.rb.b;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.f;
import com.tencent.mm.pluginsdk.p.g;
import com.tencent.mm.pluginsdk.p.l;
import com.tencent.mm.pluginsdk.p.m;
import com.tencent.mm.pluginsdk.p.q;
import com.tencent.mm.pluginsdk.p.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MultiTalkRoomPopupNav;
import com.tencent.mm.ui.MultiTalkRoomPopupNav.a;
import com.tencent.mm.ui.MultiTalkRoomPopupNav.b;
import com.tencent.mm.ui.base.TalkRoomPopupNav;
import com.tencent.mm.ui.base.TalkRoomPopupNav.4;
import com.tencent.mm.ui.base.TalkRoomPopupNav.5;
import com.tencent.mm.ui.base.TalkRoomPopupNav.8;
import com.tencent.mm.ui.base.TalkRoomPopupNav.9;
import com.tencent.mm.ui.base.TalkRoomPopupNav.a;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.u;
import com.tencent.mm.y.r;
import java.util.LinkedList;
import java.util.List;

public final class s
  implements p.f, p.l, p.q
{
  public TalkRoomPopupNav wJL;
  public MultiTalkRoomPopupNav wJM;
  private TalkRoomPopupNav.a wJN;
  public h wtd;
  
  public s(h paramh)
  {
    GMTrace.i(19086297792512L, 142204);
    this.wJN = new TalkRoomPopupNav.a()
    {
      public final void caT()
      {
        GMTrace.i(19075291938816L, 142122);
        if ((com.tencent.mm.p.a.aR(s.this.wtd.cdg().vKB.vKW)) || (com.tencent.mm.p.a.aP(s.this.wtd.cdg().vKB.vKW)))
        {
          w.d("MicroMsg.ChattingUI.TrackRoomImp", "voip is running");
          GMTrace.o(19075291938816L, 142122);
          return;
        }
        w.i("MicroMsg.ChattingUI.TrackRoomImp", "Click banner : %d", new Object[] { Integer.valueOf(p.a.tmc.Bh(s.this.wtd.ccY().field_username).size()) });
        if (p.a.tmc.Bj(s.this.wtd.ccY().field_username))
        {
          s locals = s.this;
          if ((locals.wtd.ccY().field_username.toLowerCase().endsWith("@chatroom")) && (!locals.wtd.cdj()))
          {
            com.tencent.mm.ui.base.h.b(locals.wtd.cdg().vKB.vKW, locals.wtd.cdg().Bg(R.l.eeB), null, true);
            GMTrace.o(19075291938816L, 142122);
            return;
          }
          Object localObject = new rb();
          ((rb)localObject).eVS.eVU = true;
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
          if ((bg.nm(((rb)localObject).eVT.eVW)) || (locals.wtd.ccY().field_username.equals(((rb)localObject).eVT.eVW)))
          {
            localObject = locals.wtd.ccY().field_username;
            locals.ceJ();
            GMTrace.o(19075291938816L, 142122);
            return;
          }
          localObject = new rb();
          ((rb)localObject).eVS.eVV = true;
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
          localObject = locals.wtd.ccY().field_username;
          locals.ceJ();
          GMTrace.o(19075291938816L, 142122);
          return;
        }
        s.this.mh(true);
        GMTrace.o(19075291938816L, 142122);
      }
      
      public final void caU()
      {
        GMTrace.i(19075426156544L, 142123);
        rb localrb = new rb();
        localrb.eVS.eVV = true;
        com.tencent.mm.sdk.b.a.vgX.m(localrb);
        s.this.Wq(s.this.wtd.ccY().field_username);
        GMTrace.o(19075426156544L, 142123);
      }
    };
    this.wtd = paramh;
    GMTrace.o(19086297792512L, 142204);
  }
  
  private void a(TalkRoomPopupNav.a parama)
  {
    GMTrace.i(19086834663424L, 142208);
    if (this.wJL == null)
    {
      c.a(this.wtd.cdg(), R.h.cle);
      this.wJL = ((TalkRoomPopupNav)this.wtd.cdg().findViewById(R.h.cgt));
      if (this.wJL == null)
      {
        GMTrace.o(19086834663424L, 142208);
        return;
      }
    }
    if (this.wJL != null) {
      this.wJL.wiL = parama;
    }
    GMTrace.o(19086834663424L, 142208);
  }
  
  private void ceI()
  {
    GMTrace.i(19087103098880L, 142210);
    if (this.wJL != null)
    {
      this.wJL.setVisibility(8);
      this.wJL.Cj(-1);
      this.wJL.stop();
      this.wtd.CR(-1);
    }
    if (this.wJM != null)
    {
      if (!p.a.tmd.CS(this.wtd.cci())) {
        this.wJM.bYg();
      }
      this.wJM.setVisibility(8);
      this.wtd.CR(-1);
    }
    GMTrace.o(19087103098880L, 142210);
  }
  
  public final void E(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(19086432010240L, 142205);
    if (paramString1.equals(this.wtd.ccY().field_username)) {
      mg(false);
    }
    GMTrace.o(19086432010240L, 142205);
  }
  
  public final void Ob(String paramString)
  {
    GMTrace.i(19086700445696L, 142207);
    if (paramString.equals(this.wtd.ccY().field_username)) {
      mg(false);
    }
    GMTrace.o(19086700445696L, 142207);
  }
  
  public final void Oc(String paramString)
  {
    GMTrace.i(19086566227968L, 142206);
    if (paramString.equals(this.wtd.ccY().field_username)) {
      mg(false);
    }
    GMTrace.o(19086566227968L, 142206);
  }
  
  public final void Wp(String paramString)
  {
    GMTrace.i(19087639969792L, 142214);
    Intent localIntent = new Intent();
    localIntent.putExtra("map_view_type", 6);
    localIntent.putExtra("map_sender_name", this.wtd.cdk());
    localIntent.putExtra("map_talker_name", this.wtd.cci());
    localIntent.putExtra("fromWhereShare", paramString);
    d.b(this.wtd.cdg().vKB.vKW, "location", ".ui.RedirectUI", localIntent);
    GMTrace.o(19087639969792L, 142214);
  }
  
  public final void Wq(String paramString)
  {
    GMTrace.i(19087774187520L, 142215);
    Intent localIntent = new Intent();
    localIntent.putExtra("enter_room_username", paramString);
    localIntent.setFlags(268435456);
    d.b(this.wtd.cdg().vKB.vKW, "talkroom", ".ui.TalkRoomUI", localIntent);
    GMTrace.o(19087774187520L, 142215);
  }
  
  public final void be(final String paramString, boolean paramBoolean)
  {
    GMTrace.i(19087505752064L, 142213);
    if (((p.a.tmc != null) && (p.a.tmc.Bj(this.wtd.ccY().field_username))) || (paramBoolean))
    {
      LinkedList localLinkedList = p.a.tmc.Bh(this.wtd.ccY().field_username);
      if ((localLinkedList == null) || (!localLinkedList.contains(this.wtd.cdk())))
      {
        g.ork.i(10997, new Object[] { Integer.valueOf(13), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
        com.tencent.mm.ui.base.h.a(this.wtd.cdg().vKB.vKW, this.wtd.cdg().Bg(R.l.dpQ), null, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(19086163574784L, 142203);
            s.this.Wp(paramString);
            GMTrace.o(19086163574784L, 142203);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(19092337590272L, 142249);
            g.ork.i(10997, new Object[] { Integer.valueOf(14), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
            paramAnonymousDialogInterface.dismiss();
            GMTrace.o(19092337590272L, 142249);
          }
        });
        GMTrace.o(19087505752064L, 142213);
        return;
      }
    }
    Wp(paramString);
    GMTrace.o(19087505752064L, 142213);
  }
  
  final void ceJ()
  {
    GMTrace.i(19087371534336L, 142212);
    be("fromBanner", false);
    GMTrace.o(19087371534336L, 142212);
  }
  
  public final void mg(boolean paramBoolean)
  {
    GMTrace.i(19086968881152L, 142209);
    if ((com.tencent.mm.y.s.eb(this.wtd.ccY().field_username)) && (!this.wtd.cdj()))
    {
      if (this.wJL != null)
      {
        this.wJL.setVisibility(8);
        this.wtd.CR(-1);
      }
      if (this.wJM != null)
      {
        this.wJM.vNz = this.wtd.cdj();
        this.wJM.setVisibility(8);
      }
      GMTrace.o(19086968881152L, 142209);
      return;
    }
    ceI();
    Object localObject2;
    Object localObject1;
    Object localObject3;
    if ((p.a.tmc != null) && (p.a.tmc.Bj(this.wtd.ccY().field_username)))
    {
      a(this.wJN);
      if (this.wJL == null)
      {
        GMTrace.o(19086968881152L, 142209);
        return;
      }
      localObject2 = p.a.tmc.Bh(this.wtd.ccY().field_username);
      localObject1 = "";
      if ((localObject2 != null) && (((List)localObject2).contains(this.wtd.cdk())))
      {
        this.wJL.Ch(R.g.bbd);
        localObject2 = this.wtd.cdg().Bg(R.l.eeD);
        this.wJL.Ci(R.k.cPf);
        this.wJL.Cj(R.k.cPg);
        localObject3 = this.wJL;
        if (((TalkRoomPopupNav)localObject3).wiW != null)
        {
          localObject1 = localObject2;
          if (((TalkRoomPopupNav)localObject3).wiX != null) {}
        }
        else
        {
          ((TalkRoomPopupNav)localObject3).wiW = new AlphaAnimation(0.0F, 1.0F);
          ((TalkRoomPopupNav)localObject3).wiW.setDuration(1000L);
          ((TalkRoomPopupNav)localObject3).wiW.setStartOffset(0L);
          ((TalkRoomPopupNav)localObject3).wiX = new AlphaAnimation(1.0F, 0.0F);
          ((TalkRoomPopupNav)localObject3).wiX.setDuration(1000L);
          ((TalkRoomPopupNav)localObject3).wiX.setStartOffset(0L);
          ((TalkRoomPopupNav)localObject3).wiW.setAnimationListener(new TalkRoomPopupNav.8((TalkRoomPopupNav)localObject3));
          ((TalkRoomPopupNav)localObject3).wiX.setAnimationListener(new TalkRoomPopupNav.9((TalkRoomPopupNav)localObject3));
          ((TalkRoomPopupNav)localObject3).wiP.startAnimation(((TalkRoomPopupNav)localObject3).wiW);
          localObject1 = localObject2;
        }
        this.wJL.setVisibility(0);
        this.wJL.VF((String)localObject1);
        this.wtd.CR(1);
        GMTrace.o(19086968881152L, 142209);
        return;
      }
      this.wJL.Cj(-1);
      this.wJL.stop();
      this.wJL.Ch(R.g.bbe);
      if ((localObject2 != null) && (((List)localObject2).size() == 1)) {
        localObject1 = this.wtd.cdg().e(R.l.eeC, new Object[] { r.fs((String)((List)localObject2).get(0)) });
      }
      for (;;)
      {
        this.wJL.Ci(R.k.cPe);
        break;
        if (localObject2 != null) {
          localObject1 = this.wtd.cdg().e(R.l.eeE, new Object[] { Integer.valueOf(((List)localObject2).size()) });
        }
      }
    }
    if ((p.a.tlV != null) && (p.a.tlV.JD(this.wtd.ccY().field_username)))
    {
      a(this.wJN);
      localObject1 = new rb();
      ((rb)localObject1).eVS.eVU = true;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
      if (this.wtd.ccY().field_username.equals(((rb)localObject1).eVT.eVW)) {
        this.wJL.Ch(R.g.bbd);
      }
      for (;;)
      {
        localObject1 = this.wtd.cdg().e(R.l.eec, new Object[] { Integer.valueOf(p.a.tlV.JE(this.wtd.ccY().field_username).size()) });
        this.wJL.Ci(R.g.baU);
        this.wJL.Cj(-1);
        this.wJL.stop();
        this.wJL.setVisibility(0);
        this.wJL.VF((String)localObject1);
        this.wtd.CR(1);
        GMTrace.o(19086968881152L, 142209);
        return;
        this.wJL.Ch(R.g.bbe);
      }
    }
    if ((com.tencent.mm.y.s.eb(this.wtd.ccY().field_username)) && (p.a.tmd != null))
    {
      localObject1 = p.a.tmd.De(this.wtd.ccY().field_username);
      if ((localObject1 != null) && (((com.tencent.mm.as.b)localObject1).field_wxGroupId != null) && (((com.tencent.mm.as.b)localObject1).field_wxGroupId.equals(this.wtd.ccY().field_username)))
      {
        if (this.wJM == null)
        {
          c.a(this.wtd.cdg(), R.h.cld);
          this.wJM = ((MultiTalkRoomPopupNav)this.wtd.cdg().findViewById(R.h.bOU));
        }
        if (this.wJM != null)
        {
          w.i("MicroMsg.ChattingUI.TrackRoomImp", "show multiTalkBanner! ");
          this.wJM.vNx = this.wtd.ccY().field_username;
          this.wJM.vNy = this.wtd.cdk();
          this.wJM.vNz = this.wtd.cdj();
          localObject2 = this.wJM;
          ((MultiTalkRoomPopupNav)localObject2).vNE = false;
          if ((((MultiTalkRoomPopupNav)localObject2).vNx != null) && (((MultiTalkRoomPopupNav)localObject2).vNy != null)) {
            break label1079;
          }
          w.e("MicroMsg.MultiTalkRoomPopupNav", "groupUserName or currentSenderUserName is null! groupUserName:" + ((MultiTalkRoomPopupNav)localObject2).vNx + ",currentSenderUserName:" + ((MultiTalkRoomPopupNav)localObject2).vNy);
        }
      }
      label1079:
      int i;
      for (;;)
      {
        this.wJM.vNF = ((com.tencent.mm.as.b)localObject1);
        this.wtd.CR(1);
        GMTrace.o(19086968881152L, 142209);
        return;
        str = ((MultiTalkRoomPopupNav)localObject2).vNx;
        if ((p.a.tmd == null) || (!p.a.tmd.CS(str)))
        {
          ((MultiTalkRoomPopupNav)localObject2).bYg();
        }
        else
        {
          localObject3 = p.a.tmd.CU(str);
          if (((List)localObject3).size() == 0)
          {
            p.a.tmd.hB(str);
            ((MultiTalkRoomPopupNav)localObject2).bYg();
          }
          else
          {
            i = p.a.tmd.cZ(str, ((MultiTalkRoomPopupNav)localObject2).vNy);
            if (i != 1) {
              break label1386;
            }
            ((MultiTalkRoomPopupNav)localObject2).vNA = MultiTalkRoomPopupNav.b.vNI;
            if (!p.a.tmd.CV(str)) {
              break;
            }
            ((MultiTalkRoomPopupNav)localObject2).bYg();
          }
        }
      }
      String str = p.a.tmd.fs(p.a.tmd.cY(str, ((MultiTalkRoomPopupNav)localObject2).vNy));
      ((MultiTalkRoomPopupNav)localObject2).vNt.setBackgroundResource(R.g.aYd);
      ((MultiTalkRoomPopupNav)localObject2).vNv.setTextColor(((MultiTalkRoomPopupNav)localObject2).getResources().getColor(R.e.aOv));
      ((MultiTalkRoomPopupNav)localObject2).vNv.setText(str);
      ((MultiTalkRoomPopupNav)localObject2).vNu.setVisibility(8);
      ((MultiTalkRoomPopupNav)localObject2).vNw.setVisibility(0);
      ((MultiTalkRoomPopupNav)localObject2).vNv.setVisibility(0);
      ((MultiTalkRoomPopupNav)localObject2).vND.setVisibility(8);
      for (;;)
      {
        ((MultiTalkRoomPopupNav)localObject2).setVisibility(0);
        ((MultiTalkRoomPopupNav)localObject2).vNs.setVisibility(0);
        ((MultiTalkRoomPopupNav)localObject2).vNt.setVisibility(0);
        if ((((MultiTalkRoomPopupNav)localObject2).vNB != null) && ((paramBoolean) || (((MultiTalkRoomPopupNav)localObject2).vND == null) || (((MultiTalkRoomPopupNav)localObject2).vND.getVisibility() != 0))) {
          ((MultiTalkRoomPopupNav)localObject2).vNB.close();
        }
        ((MultiTalkRoomPopupNav)localObject2).cy(MultiTalkRoomPopupNav.k((List)localObject3, ""));
        break;
        label1386:
        if (i == 10)
        {
          ((MultiTalkRoomPopupNav)localObject2).vNA = MultiTalkRoomPopupNav.b.vNJ;
          if (p.a.tmd.CV(str))
          {
            ((MultiTalkRoomPopupNav)localObject2).bYg();
            break;
          }
          if (p.a.tmd.aRq())
          {
            ((MultiTalkRoomPopupNav)localObject2).bYg();
            break;
          }
          ((MultiTalkRoomPopupNav)localObject2).vNA = MultiTalkRoomPopupNav.b.vNK;
          ((MultiTalkRoomPopupNav)localObject2).Vj(ab.getContext().getString(R.l.dKf, new Object[] { Integer.valueOf(((List)localObject3).size()) }));
          continue;
        }
        ((MultiTalkRoomPopupNav)localObject2).vNA = MultiTalkRoomPopupNav.b.vNK;
        ((MultiTalkRoomPopupNav)localObject2).Vj(ab.getContext().getString(R.l.dKf, new Object[] { Integer.valueOf(((List)localObject3).size()) }));
      }
    }
    ceI();
    GMTrace.o(19086968881152L, 142209);
  }
  
  public final void mh(final boolean paramBoolean)
  {
    GMTrace.i(19087237316608L, 142211);
    if ((this.wtd.ccY().field_username.toLowerCase().endsWith("@chatroom")) && (!this.wtd.cdj()))
    {
      com.tencent.mm.ui.base.h.b(this.wtd.cdg().vKB.vKW, this.wtd.cdg().Bg(R.l.edT), null, true);
      GMTrace.o(19087237316608L, 142211);
      return;
    }
    Object localObject1 = new rb();
    ((rb)localObject1).eVS.eVU = true;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
    if (!paramBoolean)
    {
      if ((p.a.tmc != null) && (p.a.tmc.Bj(this.wtd.ccY().field_username)))
      {
        localObject1 = p.a.tmc.Bh(this.wtd.ccY().field_username);
        if ((localObject1 != null) && (((List)localObject1).contains(this.wtd.cdk()))) {
          localObject1 = this.wtd.cdg().Bg(R.l.edO);
        }
        for (int i = R.l.dpN;; i = R.l.dFT)
        {
          g.ork.i(10997, new Object[] { Integer.valueOf(19), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
          localObject2 = new i.a(this.wtd.cdg().vKB.vKW);
          ((i.a)localObject2).VA((String)localObject1);
          ((i.a)localObject2).BQ(R.l.cSk).a(new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(19078378946560L, 142145);
              paramAnonymousDialogInterface.dismiss();
              GMTrace.o(19078378946560L, 142145);
            }
          });
          ((i.a)localObject2).BR(i).b(new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(19076768333824L, 142133);
              s locals = s.this;
              if (paramBoolean) {}
              for (paramAnonymousDialogInterface = "fromBanner";; paramAnonymousDialogInterface = "fromPluginTalk")
              {
                locals.Wp(paramAnonymousDialogInterface);
                GMTrace.o(19076768333824L, 142133);
                return;
              }
            }
          });
          ((i.a)localObject2).aax().show();
          GMTrace.o(19087237316608L, 142211);
          return;
          localObject1 = this.wtd.cdg().Bg(R.l.edP);
        }
      }
      if ((!bg.nm(((rb)localObject1).eVT.eVW)) && (!this.wtd.ccY().field_username.equals(((rb)localObject1).eVT.eVW)))
      {
        com.tencent.mm.ui.base.h.a(this.wtd.cdg().vKB.vKW, this.wtd.cdg().Bg(R.l.edK), null, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(19083345002496L, 142182);
            paramAnonymousDialogInterface = new rb();
            paramAnonymousDialogInterface.eVS.eVV = true;
            com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousDialogInterface);
            s.this.Wq(s.this.wtd.ccY().field_username);
            GMTrace.o(19083345002496L, 142182);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(19094485073920L, 142265);
            paramAnonymousDialogInterface.dismiss();
            GMTrace.o(19094485073920L, 142265);
          }
        });
        GMTrace.o(19087237316608L, 142211);
        return;
      }
      Wq(this.wtd.ccY().field_username);
      GMTrace.o(19087237316608L, 142211);
      return;
    }
    if ((bg.nm(((rb)localObject1).eVT.eVW)) || (this.wtd.ccY().field_username.equals(((rb)localObject1).eVT.eVW)))
    {
      Wq(this.wtd.ccY().field_username);
      GMTrace.o(19087237316608L, 142211);
      return;
    }
    if ((this.wJL == null) || (this.wJL.getVisibility() != 0))
    {
      com.tencent.mm.ui.base.h.a(this.wtd.cdg().vKB.vKW, this.wtd.cdg().Bg(R.l.edK), null, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(19075023503360L, 142120);
          paramAnonymousDialogInterface = new rb();
          paramAnonymousDialogInterface.eVS.eVV = true;
          com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousDialogInterface);
          s.this.Wq(s.this.wtd.ccY().field_username);
          GMTrace.o(19075023503360L, 142120);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(19084821397504L, 142193);
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(19084821397504L, 142193);
        }
      });
      GMTrace.o(19087237316608L, 142211);
      return;
    }
    localObject1 = this.wJL;
    Object localObject2 = this.wtd.cdg().Bg(R.l.edK);
    ((TextView)((TalkRoomPopupNav)localObject1).findViewById(R.h.ciG)).setText((CharSequence)localObject2);
    localObject1 = this.wJL;
    if (((TalkRoomPopupNav)localObject1).wiQ == null)
    {
      ((TalkRoomPopupNav)localObject1).wiQ = new ScaleAnimation(1.0F, 1.0F, ((TalkRoomPopupNav)localObject1).wiS * 1.0F / ((TalkRoomPopupNav)localObject1).wiT, 1.0F);
      ((TalkRoomPopupNav)localObject1).wiQ.setDuration(300L);
      ((TalkRoomPopupNav)localObject1).wiQ.setAnimationListener(new TalkRoomPopupNav.4((TalkRoomPopupNav)localObject1));
    }
    if (((TalkRoomPopupNav)localObject1).wiR == null)
    {
      ((TalkRoomPopupNav)localObject1).wiR = AnimationUtils.loadAnimation(((TalkRoomPopupNav)localObject1).getContext(), R.a.aLt);
      ((TalkRoomPopupNav)localObject1).wiR.setFillAfter(true);
      ((TalkRoomPopupNav)localObject1).wiR.setAnimationListener(new TalkRoomPopupNav.5((TalkRoomPopupNav)localObject1));
    }
    localObject2 = ((TalkRoomPopupNav)localObject1).lkF.getLayoutParams();
    ((ViewGroup.LayoutParams)localObject2).height = ((TalkRoomPopupNav)localObject1).wiT;
    ((TalkRoomPopupNav)localObject1).lkF.setLayoutParams((ViewGroup.LayoutParams)localObject2);
    ((TalkRoomPopupNav)localObject1).lkF.startAnimation(((TalkRoomPopupNav)localObject1).wiQ);
    ((TalkRoomPopupNav)localObject1).vNs.startAnimation(((TalkRoomPopupNav)localObject1).wiR);
    ((TalkRoomPopupNav)localObject1).wiM.startAnimation(AnimationUtils.loadAnimation(((TalkRoomPopupNav)localObject1).getContext(), R.a.aLs));
    ((TalkRoomPopupNav)localObject1).wiM.setVisibility(0);
    GMTrace.o(19087237316608L, 142211);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\b\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
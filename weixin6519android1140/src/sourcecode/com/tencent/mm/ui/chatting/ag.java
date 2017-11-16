package com.tencent.mm.ui.chatting;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.media.ToneGenerator;
import android.os.Vibrator;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.j;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.h.a;
import com.tencent.mm.ad.h.b;
import com.tencent.mm.af.d.b;
import com.tencent.mm.g.a.mo;
import com.tencent.mm.g.a.sh;
import com.tencent.mm.g.a.sh.a;
import com.tencent.mm.g.a.si;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.subapp.c.i;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.g;
import com.tencent.mm.pluginsdk.p.r;
import com.tencent.mm.pluginsdk.ui.chat.AppPanel.a;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.pluginsdk.ui.tools.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.aq;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.chatting.b.j;
import com.tencent.mm.ui.chatting.b.j.1;
import com.tencent.mm.ui.contact.SelectContactUI;
import com.tencent.mm.ui.u;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.m;
import com.tencent.mm.y.q;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class ag
  implements com.tencent.mm.pluginsdk.ui.chat.b
{
  public static boolean wvb;
  public x iBi;
  public final aj jsM;
  public final aj jsN;
  final h.a jsQ;
  public ToneGenerator jss;
  Vibrator jsv;
  public Object lock;
  public ChatFooter mTr;
  final h.b mTw;
  private AppPanel.a mUd;
  private boolean wqK;
  public ListView wvc;
  public cv wvd;
  public En_5b8fbb1e.a wve;
  public com.tencent.mm.ad.h wvf;
  private String wvg;
  String wvh;
  public boolean wvi;
  private boolean wvj;
  public boolean wvk;
  public volatile boolean wvl;
  public volatile boolean wvm;
  public boolean wvn;
  
  static
  {
    GMTrace.i(2136209358848L, 15916);
    wvb = true;
    GMTrace.o(2136209358848L, 15916);
  }
  
  public ag(ListView paramListView, cv paramcv, En_5b8fbb1e.a parama, ChatFooter paramChatFooter, String paramString)
  {
    GMTrace.i(2130303778816L, 15872);
    this.jsQ = new h.a()
    {
      public final void onError()
      {
        GMTrace.i(2529333084160L, 18845);
        ag.this.wvf.reset();
        ag.this.jsM.stopTimer();
        ag.this.jsN.stopTimer();
        ad.RT("keep_app_silent");
        ag.this.mTr.azl();
        ag.this.wvd.wyS.cbO();
        w.v("MicroMsg.ChattingFooterEventImpl", "record stop on error");
        ag.this.wve.lf(true);
        ag.this.wve.le(true);
        Toast.makeText(ag.this.wve.vKB.vKW, ag.this.wve.vKB.vKW.getString(R.l.dgX), 0).show();
        GMTrace.o(2529333084160L, 18845);
      }
    };
    this.mTw = new h.b()
    {
      public final void DB()
      {
        GMTrace.i(2283848859648L, 17016);
        ag.this.mTr.bMf();
        GMTrace.o(2283848859648L, 17016);
      }
    };
    this.wvl = false;
    this.wvm = false;
    this.lock = new Object();
    this.jsM = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(2375251132416L, 17697);
        ag.this.mTr.zt(ag.this.wvf.getMaxAmplitude());
        GMTrace.o(2375251132416L, 17697);
        return true;
      }
    }, true);
    this.wvn = false;
    this.jsN = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(2263850418176L, 16867);
        long l = ag.this.wvf.qD();
        w.d("MicroMsg.ChattingFooterEventImpl", "ms " + l);
        if ((l >= 50000L) && (l <= 60000L))
        {
          if (!ag.this.wvn)
          {
            bg.eB(ag.this.wve.vKB.vKW);
            ag.this.wvn = true;
          }
          int i = (int)((60000L - l) / 1000L);
          ag.this.mTr.Ps(ag.this.wve.bXK().getQuantityString(R.j.cIg, i, new Object[] { Integer.valueOf(i) }));
        }
        if (l >= 60000L)
        {
          w.v("MicroMsg.ChattingFooterEventImpl", "record stop on countdown");
          ag.this.cch();
          ag.this.mTr.azl();
          aq.C(ag.this.wve.vKB.vKW, R.l.eev);
          GMTrace.o(2263850418176L, 16867);
          return false;
        }
        GMTrace.o(2263850418176L, 16867);
        return true;
      }
    }, true);
    this.mUd = new AppPanel.a()
    {
      com.tencent.mm.ui.tools.l nOu;
      
      public final void aNL()
      {
        GMTrace.i(2146812559360L, 15995);
        if (com.tencent.mm.p.a.aP(ag.this.wve.vKB.vKW))
        {
          GMTrace.o(2146812559360L, 15995);
          return;
        }
        sh localsh = new sh();
        com.tencent.mm.sdk.b.a.vgX.m(localsh);
        if ((!ag.this.cci().equals(localsh.eXb.eDs)) && ((localsh.eXb.eXd) || (localsh.eXb.eXe)))
        {
          if (localsh.eXb.eXc) {}
          for (int i = R.l.dbN;; i = R.l.dbO)
          {
            Toast.makeText(ag.this.wve.vKB.vKW, i, 0).show();
            w.i("MicroMsg.ChattingFooterEventImpl", "voip is running, can't do this");
            GMTrace.o(2146812559360L, 15995);
            return;
          }
        }
        if (1 == com.tencent.mm.k.g.ut().getInt("EnableVoiceVoipFromPlugin", 0))
        {
          if (this.nOu == null)
          {
            this.nOu = new com.tencent.mm.ui.tools.l(ag.this.wve.vKB.vKW);
            this.nOu.qik = new p.c()
            {
              public final void a(com.tencent.mm.ui.base.n paramAnonymous2n)
              {
                GMTrace.i(2242509799424L, 16708);
                paramAnonymous2n.em(2, R.l.cTc);
                paramAnonymous2n.em(1, R.l.cTd);
                GMTrace.o(2242509799424L, 16708);
              }
            };
            this.nOu.qil = new p.d()
            {
              public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
              {
                GMTrace.i(2172716580864L, 16188);
                switch (paramAnonymous2MenuItem.getItemId())
                {
                }
                for (;;)
                {
                  GMTrace.o(2172716580864L, 16188);
                  return;
                  ag.this.aXL();
                  GMTrace.o(2172716580864L, 16188);
                  return;
                  ag.this.aXM();
                }
              }
            };
          }
          this.nOu.bpI();
        }
        for (;;)
        {
          com.tencent.mm.plugin.report.service.g.ork.i(11033, new Object[] { Integer.valueOf(4), Integer.valueOf(1), Integer.valueOf(0) });
          GMTrace.o(2146812559360L, 15995);
          return;
          ag.this.ccl();
        }
      }
      
      public final void aNM()
      {
        GMTrace.i(2146946777088L, 15996);
        if (com.tencent.mm.p.a.aP(ag.this.wve.vKB.vKW))
        {
          GMTrace.o(2146946777088L, 15996);
          return;
        }
        sh localsh = new sh();
        com.tencent.mm.sdk.b.a.vgX.m(localsh);
        if ((!ag.this.cci().equals(localsh.eXb.eDs)) && ((localsh.eXb.eXd) || (localsh.eXb.eXe)))
        {
          if (localsh.eXb.eXc) {}
          for (int i = R.l.dbN;; i = R.l.dbO)
          {
            Toast.makeText(ag.this.wve.vKB.vKW, i, 0).show();
            w.i("MicroMsg.ChattingFooterEventImpl", "voip is running, can't do this");
            GMTrace.o(2146946777088L, 15996);
            return;
          }
        }
        ag.this.cck();
        GMTrace.o(2146946777088L, 15996);
      }
      
      public final void aNN()
      {
        GMTrace.i(2147080994816L, 15997);
        if ((!com.tencent.mm.p.a.aR(ag.this.wve.vKB.vKW)) && (!com.tencent.mm.p.a.aP(ag.this.wve.vKB.vKW)))
        {
          boolean bool = com.tencent.mm.pluginsdk.h.a.a(ag.this.wve.bWQ(), "android.permission.RECORD_AUDIO", 81, "", "");
          w.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW(), ag.this.wve.bWQ() });
          if (!bool)
          {
            GMTrace.o(2147080994816L, 15997);
            return;
          }
          ag.this.ccm();
        }
        GMTrace.o(2147080994816L, 15997);
      }
      
      public final void aNO()
      {
        GMTrace.i(2147215212544L, 15998);
        j localj = ag.this.wve.wCx;
        int i;
        String[] arrayOfString;
        if ((!localj.wtd.ccY().bSA()) && (!com.tencent.mm.y.s.gj(localj.wtd.cci())) && (!x.To(localj.wtd.cci())) && (!x.Tq(localj.wtd.cci())) && (!x.fw(localj.wtd.cci())) && (!localj.wtd.cci().equals(q.zE())))
        {
          i = 1;
          if (i != 0) {
            break label187;
          }
          arrayOfString = new String[1];
          arrayOfString[0] = localj.wtd.cdg().Bg(R.l.dGO);
        }
        for (;;)
        {
          com.tencent.mm.ui.base.h.a(localj.wtd.cdg().vKB.vKW, null, arrayOfString, null, new j.1(localj));
          GMTrace.o(2147215212544L, 15998);
          return;
          i = 0;
          break;
          label187:
          arrayOfString = new String[2];
          arrayOfString[0] = localj.wtd.cdg().Bg(R.l.dGO);
          arrayOfString[1] = localj.wtd.cdg().Bg(R.l.dGP);
        }
      }
      
      public final void aNP()
      {
        GMTrace.i(2147349430272L, 15999);
        com.tencent.mm.ui.chatting.b.b localb = ag.this.wve.wCw;
        Intent localIntent = new Intent(localb.wtd.cdg().vKB.vKW, SelectContactUI.class);
        localIntent.putExtra("list_attr", com.tencent.mm.ui.contact.s.q(new int[] { com.tencent.mm.ui.contact.s.wTn, 2048 }));
        localIntent.putExtra("list_type", 4);
        localIntent.putExtra("received_card_name", localb.wtd.cci());
        localIntent.putExtra("block_contact", localb.wtd.cci());
        localIntent.putExtra("Add_SendCard", true);
        localIntent.putExtra("titile", localb.wtd.cdg().Bg(R.l.cRp));
        localb.wtd.cdg().startActivityForResult(localIntent, 223);
        GMTrace.o(2147349430272L, 15999);
      }
      
      public final void aNQ()
      {
        GMTrace.i(2147752083456L, 16002);
        com.tencent.mm.bj.d.b(ag.this.wve.vKB.vKW, "subapp", ".ui.openapi.AddAppUI", new Intent());
        GMTrace.o(2147752083456L, 16002);
      }
      
      public final void aNR()
      {
        GMTrace.i(2147886301184L, 16003);
        Intent localIntent = new Intent();
        ArrayList localArrayList = new ArrayList();
        localArrayList.add("3");
        if (com.tencent.mm.af.f.dL(ag.this.iBi.field_username))
        {
          localArrayList.add("4");
          localArrayList.add("7");
          localArrayList.add("9");
          localArrayList.add("10");
          localArrayList.add("11");
          localArrayList.add("12");
          localArrayList.add("13");
          localArrayList.add("15");
          localArrayList.add("16");
          localArrayList.add("17");
          localArrayList.add("18");
        }
        localIntent.putExtra("key_to_user", ag.this.iBi.field_username);
        localIntent.putExtra("key_fav_item_id", TextUtils.join(",", localArrayList));
        com.tencent.mm.bj.d.b(ag.this.wve.vKB.vKW, "favorite", ".ui.FavSelectUI", localIntent);
        com.tencent.mm.plugin.report.service.g.ork.i(14103, new Object[] { Integer.valueOf(1) });
        GMTrace.o(2147886301184L, 16003);
      }
      
      public final void aNS()
      {
        GMTrace.i(2148020518912L, 16004);
        Intent localIntent = new Intent();
        localIntent.putExtra("service_app_talker_user", ag.this.cci());
        com.tencent.mm.bj.d.a(ag.this.wve, "subapp", ".ui.openapi.ServiceAppUI", localIntent, 222);
        GMTrace.o(2148020518912L, 16004);
      }
      
      public final void aNT()
      {
        GMTrace.i(2148154736640L, 16005);
        Intent localIntent = new Intent();
        localIntent.putExtra("download_entrance_scene", 17);
        localIntent.putExtra("preceding_scence", 13);
        com.tencent.mm.bj.d.b(ag.this.wve.vKB.vKW, "emoji", ".ui.v2.EmojiStoreV2UI", localIntent);
        com.tencent.mm.plugin.report.service.g.ork.i(12065, new Object[] { Integer.valueOf(4) });
        GMTrace.o(2148154736640L, 16005);
      }
      
      public final void aNU()
      {
        GMTrace.i(2148423172096L, 16007);
        com.tencent.mm.plugin.report.service.g.ork.i(12097, new Object[] { Integer.valueOf(11), Integer.valueOf(0), Long.valueOf(System.currentTimeMillis()) });
        com.tencent.mm.plugin.report.service.g.ork.i(11850, new Object[] { Integer.valueOf(4), Integer.valueOf(1) });
        if (ag.this.wvi)
        {
          com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(2), Integer.valueOf(2) });
          localObject1 = new Intent();
          i = m.fk(ag.this.cci());
          ((Intent)localObject1).putExtra("key_way", 1);
          ((Intent)localObject1).putExtra("key_chatroom_num", i);
          ((Intent)localObject1).putExtra("key_type", 1);
          ((Intent)localObject1).putExtra("key_from", 1);
          ((Intent)localObject1).putExtra("key_username", ag.this.cci());
          ((Intent)localObject1).putExtra("pay_channel", 14);
          com.tencent.mm.bj.d.b(ag.this.wve.vKB.vKW, "luckymoney", ".ui.LuckyMoneyPrepareUI", (Intent)localObject1);
          GMTrace.o(2148423172096L, 16007);
          return;
        }
        at.AR();
        Object localObject1 = (Integer)com.tencent.mm.y.c.xh().get(w.a.vqv, Integer.valueOf(0));
        at.AR();
        Object localObject2 = (Integer)com.tencent.mm.y.c.xh().get(w.a.vqw, Integer.valueOf(0));
        if ((((Integer)localObject1).intValue() == 1) || (((Integer)localObject2).intValue() == 1)) {
          if (q.zL() != 0) {
            break label455;
          }
        }
        label455:
        for (int i = 1; i == 0; i = 0)
        {
          com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(1) });
          localObject1 = new Intent();
          ((Intent)localObject1).putExtra("key_way", 0);
          ((Intent)localObject1).putExtra("key_type", 0);
          ((Intent)localObject1).putExtra("key_from", 1);
          ((Intent)localObject1).putExtra("key_username", ag.this.cci());
          ((Intent)localObject1).putExtra("pay_channel", 11);
          com.tencent.mm.bj.d.b(ag.this.wve.vKB.vKW, "luckymoney", ".ui.LuckyMoneyPrepareUI", (Intent)localObject1);
          GMTrace.o(2148423172096L, 16007);
          return;
        }
        localObject1 = ag.this.wve.getString(R.l.dgu);
        localObject2 = ag.this.wve.getString(R.l.dgv);
        ActionBarActivity localActionBarActivity = ag.this.wve.vKB.vKW;
        h.c local4 = new h.c()
        {
          public final void hQ(int paramAnonymous2Int)
          {
            GMTrace.i(2527722471424L, 18833);
            Intent localIntent = new Intent();
            switch (paramAnonymous2Int)
            {
            }
            for (;;)
            {
              GMTrace.o(2527722471424L, 18833);
              return;
              com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(3) });
              localIntent.putExtra("key_username", ag.this.cci());
              localIntent.putExtra("key_way", 0);
              localIntent.putExtra("pay_channel", 11);
              com.tencent.mm.bj.d.b(ag.this.wve.vKB.vKW, "luckymoney", ".ui.LuckyMoneyNewYearSendUI", localIntent);
              GMTrace.o(2527722471424L, 18833);
              return;
              com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(1) });
              localIntent.putExtra("key_way", 0);
              localIntent.putExtra("key_type", 0);
              localIntent.putExtra("key_from", 1);
              localIntent.putExtra("key_username", ag.this.cci());
              localIntent.putExtra("pay_channel", 11);
              com.tencent.mm.bj.d.b(ag.this.wve.vKB.vKW, "luckymoney", ".ui.LuckyMoneyPrepareUI", localIntent);
            }
          }
        };
        com.tencent.mm.ui.base.h.a(localActionBarActivity, null, new String[] { localObject1, localObject2 }, null, local4);
        GMTrace.o(2148423172096L, 16007);
      }
      
      public final void aNV()
      {
        GMTrace.i(2148557389824L, 16008);
        at.AR();
        com.tencent.mm.y.c.xh().set(81, Boolean.valueOf(false));
        if (!am.isNetworkConnected(ag.this.wve.vKB.vKW))
        {
          com.tencent.mm.as.a.a(ag.this.wve.vKB.vKW, R.l.eiM, null);
          GMTrace.o(2148557389824L, 16008);
          return;
        }
        ag.this.ccj();
        GMTrace.o(2148557389824L, 16008);
      }
      
      public final void aNW()
      {
        GMTrace.i(2148691607552L, 16009);
        Intent localIntent = new Intent();
        localIntent.putExtra("enterprise_scene", 4);
        localIntent.putExtra("enterprise_biz_name", ag.this.cci());
        localIntent.putExtra("biz_chat_chat_id", ag.this.wve.cej());
        com.tencent.mm.bj.d.b(ag.this.wve.vKB.vKW, "brandservice", ".ui.EnterpriseBizContactPlainListUI", localIntent);
        GMTrace.o(2148691607552L, 16009);
      }
      
      public final void aNX()
      {
        GMTrace.i(2148825825280L, 16010);
        if (ag.this.wvi)
        {
          Intent localIntent = new Intent();
          localIntent.putExtra("enter_scene", 1);
          localIntent.putExtra("chatroom_name", ag.this.cci());
          com.tencent.mm.bj.d.b(ag.this.wve.vKB.vKW, "aa", ".ui.LaunchAAUI", localIntent);
        }
        GMTrace.o(2148825825280L, 16010);
      }
      
      public final void b(com.tencent.mm.pluginsdk.model.app.f paramAnonymousf)
      {
        GMTrace.i(2147617865728L, 16001);
        En_5b8fbb1e.a locala = ag.this.wve;
        if (paramAnonymousf == null)
        {
          w.e("MicroMsg.ChattingUI", "onAppSelected, info is null, %s", new Object[] { bg.bQW() });
          GMTrace.o(2147617865728L, 16001);
          return;
        }
        if ((paramAnonymousf != null) && (com.tencent.mm.pluginsdk.model.app.f.tnG.equals(paramAnonymousf.field_appId)) && (locala.onh != null)) {
          locala.onh.ay(2, En_5b8fbb1e.a.wCB);
        }
        if (paramAnonymousf.bJt())
        {
          locala.m(paramAnonymousf);
          GMTrace.o(2147617865728L, 16001);
          return;
        }
        if (paramAnonymousf.field_status == 3)
        {
          w.e("MicroMsg.ChattingUI", "onAppSeleted fail, app is in blacklist, packageName = " + paramAnonymousf.field_packageName);
          GMTrace.o(2147617865728L, 16001);
          return;
        }
        if ((!locala.wDP.fn(paramAnonymousf.field_packageName, paramAnonymousf.field_openId)) && (paramAnonymousf.field_status == 5))
        {
          w.d("MicroMsg.ChattingUI", "SuggestionApp appSuggestionIntroUrl = %s", new Object[] { paramAnonymousf.fdT });
          if (!bg.nm(paramAnonymousf.fdT))
          {
            Intent localIntent = new Intent();
            localIntent.putExtra("rawUrl", paramAnonymousf.fdT);
            com.tencent.mm.bj.d.b(locala.vKB.vKW, "webview", ".ui.tools.WebViewUI", localIntent);
          }
        }
        GMTrace.o(2147617865728L, 16001);
      }
      
      public final void qm(int paramAnonymousInt)
      {
        GMTrace.i(2147483648000L, 16000);
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          GMTrace.o(2147483648000L, 16000);
          return;
          Object localObject = ag.this.wve.Vc(ab.bPU()).getString("gallery", "1");
          com.tencent.mm.plugin.report.service.f.tp(19);
          if (((String)localObject).equalsIgnoreCase("0")) {
            k.k(ag.this.wve);
          }
          for (;;)
          {
            com.tencent.mm.plugin.report.service.g.ork.i(13822, new Object[] { Integer.valueOf(2), Integer.valueOf(1) });
            com.tencent.mm.sdk.platformtools.af.i(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(2114063433728L, 15751);
                ag.this.mTr.bMB();
                GMTrace.o(2114063433728L, 15751);
              }
            }, 1000L);
            GMTrace.o(2147483648000L, 16000);
            return;
            localObject = ag.this.wve.cdk();
            String str = ag.this.wve.cci();
            if ((ag.this.wvk) && (ag.wvb)) {
              k.b(ag.this.wve, 3, (String)localObject, str);
            } else if (x.eU(str)) {
              k.a(ag.this.wve, 12, (String)localObject, str);
            } else {
              k.a(ag.this.wve, 3, (String)localObject, str);
            }
          }
          localObject = new File(com.tencent.mm.compatible.util.e.fRZ);
          if ((!((File)localObject).exists()) && (!((File)localObject).mkdir()))
          {
            Toast.makeText(ag.this.wve.vKB.vKW, ag.this.wve.getString(R.l.dhy), 1).show();
            GMTrace.o(2147483648000L, 16000);
            return;
          }
          boolean bool = com.tencent.mm.pluginsdk.h.a.a(ag.this.wve.bWQ(), "android.permission.CAMERA", 20, "", "");
          w.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkcamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW(), ag.this.wve.bWQ() });
          if (!bool)
          {
            GMTrace.o(2147483648000L, 16000);
            return;
          }
          ag.this.ccn();
        }
      }
      
      public final void qn(int paramAnonymousInt)
      {
        GMTrace.i(2148288954368L, 16006);
        if ((!com.tencent.mm.p.a.aQ(ag.this.wve.bWQ())) && (!com.tencent.mm.p.a.aR(ag.this.wve.bWQ())) && (!com.tencent.mm.p.a.aP(ag.this.wve.bWQ()))) {
          ag.this.CH(paramAnonymousInt);
        }
        GMTrace.o(2148288954368L, 16006);
      }
    };
    this.wvc = paramListView;
    this.wvd = paramcv;
    this.wve = parama;
    this.mTr = paramChatFooter;
    this.wvg = paramString;
    at.AR();
    this.iBi = com.tencent.mm.y.c.yK().TE(paramString);
    this.wvi = parama.cci().endsWith("@chatroom");
    this.wvj = com.tencent.mm.y.s.fy(parama.cci());
    boolean bool;
    if ((this.wvi) || (this.wvj))
    {
      bool = true;
      this.wqK = bool;
      this.jsv = ((Vibrator)parama.vKB.vKW.getSystemService("vibrator"));
      if (!com.tencent.mm.y.s.fY(this.wvg)) {
        break label305;
      }
      this.wvf = new i();
      w.i("MicroMsg.ChattingFooterEventImpl", "initRecorder new VoiceRemindRecorder().");
    }
    for (;;)
    {
      this.wvf.a(this.mTw);
      this.wvf.a(this.jsQ);
      paramChatFooter.a(this.mUd);
      GMTrace.o(2130303778816L, 15872);
      return;
      bool = false;
      break;
      label305:
      paramListView = this.wvg;
      int i;
      if (com.tencent.mm.y.s.gk(paramListView)) {
        i = 1;
      }
      for (;;)
      {
        if (i == 0) {
          break label488;
        }
        this.wvf = new com.tencent.mm.e.b.h(this.wve.vKB.vKW, true);
        w.i("MicroMsg.ChattingFooterEventImpl", "initRecorder new SceneVoiceRecorder, use Speex");
        break;
        paramListView = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramListView);
        if ((paramListView != null) && (paramListView.bSA()))
        {
          paramcv = com.tencent.mm.af.f.iK(paramListView.field_username);
          if (paramcv != null)
          {
            paramcv = paramcv.bq(false);
            if (paramcv != null)
            {
              if (paramcv.gvP != null) {
                paramcv.gvT = "1".equals(paramcv.gvP.optString("CanReceiveSpeexVoice"));
              }
              if (paramcv.gvT)
              {
                w.i("MicroMsg.BizInfoStorageLogic", "bizinfo name=" + paramListView.field_username + " canReceiveSpeexVoice");
                i = 1;
                continue;
              }
            }
          }
        }
        i = 0;
      }
      label488:
      this.wvf = new com.tencent.mm.e.b.h(this.wve.vKB.vKW, false);
      w.i("MicroMsg.ChattingFooterEventImpl", "initRecorder new SceneVoiceRecorder, not use Speex");
    }
  }
  
  public static void CG(int paramInt)
  {
    GMTrace.i(2132451262464L, 15888);
    mo localmo = new mo();
    localmo.eRI.state = paramInt;
    com.tencent.mm.sdk.b.a.vgX.m(localmo);
    GMTrace.o(2132451262464L, 15888);
  }
  
  private void ccg()
  {
    GMTrace.i(2131377520640L, 15880);
    this.wvc.smoothScrollBy(0, 0);
    GMTrace.o(2131377520640L, 15880);
  }
  
  private void releaseWakeLock()
  {
    GMTrace.i(2131645956096L, 15882);
    this.wvc.setKeepScreenOn(false);
    GMTrace.o(2131645956096L, 15882);
  }
  
  public final boolean BM(String paramString)
  {
    GMTrace.i(2130840649728L, 15876);
    lX(false);
    ccg();
    boolean bool = this.wve.cW(paramString, 0);
    GMTrace.o(2130840649728L, 15876);
    return bool;
  }
  
  public final void CH(final int paramInt)
  {
    GMTrace.i(2132719697920L, 15890);
    boolean bool = com.tencent.mm.pluginsdk.h.a.a(this.wve.bWQ(), "android.permission.CAMERA", 18, "", "");
    w.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW(), this.wve.bWQ() });
    if (!bool)
    {
      GMTrace.o(2132719697920L, 15890);
      return;
    }
    bool = com.tencent.mm.pluginsdk.h.a.a(this.wve.bWQ(), "android.permission.RECORD_AUDIO", 18, "", "");
    w.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW(), this.wve.bWQ() });
    if (!bool)
    {
      GMTrace.o(2132719697920L, 15890);
      return;
    }
    if ((com.tencent.mm.sdk.a.b.bPq()) || (r.hle))
    {
      com.tencent.mm.ui.tools.l locall = new com.tencent.mm.ui.tools.l(this.wve.vKB.vKW);
      locall.qik = new p.c()
      {
        public final void a(com.tencent.mm.ui.base.n paramAnonymousn)
        {
          GMTrace.i(2188151619584L, 16303);
          paramAnonymousn.e(1, ag.this.wve.getString(R.l.cSS));
          paramAnonymousn.e(5, "拍摄参数设置面板");
          GMTrace.o(2188151619584L, 16303);
        }
      };
      locall.qil = new p.d()
      {
        public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
        {
          GMTrace.i(2367734939648L, 17641);
          switch (paramAnonymousMenuItem.getItemId())
          {
          }
          for (;;)
          {
            GMTrace.o(2367734939648L, 17641);
            return;
            new Intent();
            com.tencent.mm.plugin.report.service.g.ork.i(13822, new Object[] { Integer.valueOf(1), Integer.valueOf(1) });
            k.a(ag.this.wve, new Intent(), ag.this.cci(), paramInt);
            GMTrace.o(2367734939648L, 17641);
            return;
            com.tencent.mm.bj.d.b(ag.this.wve.vKB.vKW, "mmsight", ".ui.SightSettingsUI", new Intent());
          }
        }
      };
      locall.bpI();
      GMTrace.o(2132719697920L, 15890);
      return;
    }
    if (!r.hlf)
    {
      com.tencent.mm.plugin.report.service.g.ork.i(13822, new Object[] { Integer.valueOf(1), Integer.valueOf(1) });
      k.a(this.wve, new Intent(), cci(), paramInt);
    }
    GMTrace.o(2132719697920L, 15890);
  }
  
  public final boolean aND()
  {
    GMTrace.i(2130437996544L, 15873);
    synchronized (this.lock)
    {
      this.wvl = true;
      if (!this.wvm)
      {
        w.i("MicroMsg.ChattingFooterEventImpl", "jacks in voice rcd stop but not begin.");
        GMTrace.o(2130437996544L, 15873);
        return false;
      }
    }
    this.wvm = false;
    releaseWakeLock();
    if (!cch())
    {
      this.mTr.bMd();
      w.i("MicroMsg.ChattingFooterEventImpl", "record stop on stop request setRcdTooShort");
    }
    for (;;)
    {
      this.wvd.wyS.cbO();
      this.wve.wCl.CW(4);
      this.wve.wCl.stopSignalling();
      CG(1);
      this.wve.mc(false);
      GMTrace.o(2130437996544L, 15873);
      return true;
      this.mTr.azl();
      w.i("MicroMsg.ChattingFooterEventImpl", "record stop on stop request resetRcdStatus");
    }
  }
  
  public final boolean aNF()
  {
    GMTrace.i(2130572214272L, 15874);
    w.v("MicroMsg.ChattingFooterEventImpl", "record cancel on cancel request");
    synchronized (this.lock)
    {
      this.wvl = true;
      if (!this.wvm)
      {
        w.i("MicroMsg.ChattingFooterEventImpl", "jacks in voice rcd stop but not begin.");
        GMTrace.o(2130572214272L, 15874);
        return false;
      }
    }
    this.wvm = false;
    releaseWakeLock();
    this.wve.lf(true);
    this.wve.le(true);
    if (this.wvf != null)
    {
      this.wvf.cancel();
      this.jsM.stopTimer();
      this.jsN.stopTimer();
    }
    this.mTr.azl();
    this.wvd.wyS.cbO();
    this.wve.wCl.CW(4);
    this.wve.wCl.stopSignalling();
    CG(1);
    this.wve.mc(false);
    GMTrace.o(2130572214272L, 15874);
    return true;
  }
  
  /* Error */
  public final boolean aNG()
  {
    // Byte code:
    //   0: ldc2_w 545
    //   3: sipush 15875
    //   6: invokestatic 87	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: getfield 135	com/tencent/mm/ui/chatting/ag:wve	Lcom/tencent/mm/ui/chatting/En_5b8fbb1e$a;
    //   13: getfield 190	com/tencent/mm/ui/u:vKB	Lcom/tencent/mm/ui/p;
    //   16: getfield 196	com/tencent/mm/ui/p:vKW	Landroid/support/v7/app/ActionBarActivity;
    //   19: invokestatic 552	com/tencent/mm/p/a:aR	(Landroid/content/Context;)Z
    //   22: ifne +19 -> 41
    //   25: aload_0
    //   26: getfield 135	com/tencent/mm/ui/chatting/ag:wve	Lcom/tencent/mm/ui/chatting/En_5b8fbb1e$a;
    //   29: getfield 190	com/tencent/mm/ui/u:vKB	Lcom/tencent/mm/ui/p;
    //   32: getfield 196	com/tencent/mm/ui/p:vKW	Landroid/support/v7/app/ActionBarActivity;
    //   35: invokestatic 555	com/tencent/mm/p/a:aP	(Landroid/content/Context;)Z
    //   38: ifeq +22 -> 60
    //   41: ldc -38
    //   43: ldc_w 557
    //   46: invokestatic 560	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   49: ldc2_w 545
    //   52: sipush 15875
    //   55: invokestatic 92	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   58: iconst_0
    //   59: ireturn
    //   60: invokestatic 145	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
    //   63: pop
    //   64: invokestatic 563	com/tencent/mm/y/c:isSDCardAvailable	()Z
    //   67: ifne +35 -> 102
    //   70: aload_0
    //   71: getfield 135	com/tencent/mm/ui/chatting/ag:wve	Lcom/tencent/mm/ui/chatting/En_5b8fbb1e$a;
    //   74: getfield 190	com/tencent/mm/ui/u:vKB	Lcom/tencent/mm/ui/p;
    //   77: getfield 196	com/tencent/mm/ui/p:vKW	Landroid/support/v7/app/ActionBarActivity;
    //   80: invokestatic 568	com/tencent/mm/ui/base/u:fo	(Landroid/content/Context;)V
    //   83: ldc -38
    //   85: ldc_w 570
    //   88: invokestatic 573	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   91: ldc2_w 545
    //   94: sipush 15875
    //   97: invokestatic 92	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   100: iconst_0
    //   101: ireturn
    //   102: invokestatic 578	com/tencent/mm/compatible/e/b:tt	()Z
    //   105: ifne +56 -> 161
    //   108: aload_0
    //   109: getfield 135	com/tencent/mm/ui/chatting/ag:wve	Lcom/tencent/mm/ui/chatting/En_5b8fbb1e$a;
    //   112: getfield 190	com/tencent/mm/ui/u:vKB	Lcom/tencent/mm/ui/p;
    //   115: getfield 196	com/tencent/mm/ui/p:vKW	Landroid/support/v7/app/ActionBarActivity;
    //   118: aload_0
    //   119: getfield 135	com/tencent/mm/ui/chatting/ag:wve	Lcom/tencent/mm/ui/chatting/En_5b8fbb1e$a;
    //   122: getstatic 583	com/tencent/mm/R$l:cUE	I
    //   125: invokevirtual 587	com/tencent/mm/ui/chatting/En_5b8fbb1e$a:getString	(I)Ljava/lang/String;
    //   128: aload_0
    //   129: getfield 135	com/tencent/mm/ui/chatting/ag:wve	Lcom/tencent/mm/ui/chatting/En_5b8fbb1e$a;
    //   132: getstatic 590	com/tencent/mm/R$l:cTD	I
    //   135: invokevirtual 587	com/tencent/mm/ui/chatting/En_5b8fbb1e$a:getString	(I)Ljava/lang/String;
    //   138: aload_0
    //   139: getfield 135	com/tencent/mm/ui/chatting/ag:wve	Lcom/tencent/mm/ui/chatting/En_5b8fbb1e$a;
    //   142: getstatic 593	com/tencent/mm/R$l:cTF	I
    //   145: invokevirtual 587	com/tencent/mm/ui/chatting/En_5b8fbb1e$a:getString	(I)Ljava/lang/String;
    //   148: iconst_1
    //   149: new 32	com/tencent/mm/ui/chatting/ag$6
    //   152: dup
    //   153: aload_0
    //   154: invokespecial 594	com/tencent/mm/ui/chatting/ag$6:<init>	(Lcom/tencent/mm/ui/chatting/ag;)V
    //   157: invokestatic 599	com/tencent/mm/ui/base/h:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroid/content/DialogInterface$OnClickListener;)Lcom/tencent/mm/ui/base/i;
    //   160: pop
    //   161: aload_0
    //   162: getfield 216	com/tencent/mm/ui/chatting/ag:wvf	Lcom/tencent/mm/ad/h;
    //   165: ifnull +116 -> 281
    //   168: aload_0
    //   169: getfield 601	com/tencent/mm/ui/chatting/ag:jss	Landroid/media/ToneGenerator;
    //   172: ifnonnull +65 -> 237
    //   175: aload_0
    //   176: getfield 135	com/tencent/mm/ui/chatting/ag:wve	Lcom/tencent/mm/ui/chatting/En_5b8fbb1e$a;
    //   179: getfield 190	com/tencent/mm/ui/u:vKB	Lcom/tencent/mm/ui/p;
    //   182: getfield 605	com/tencent/mm/ui/p:hdu	Landroid/media/AudioManager;
    //   185: iconst_3
    //   186: invokevirtual 611	android/media/AudioManager:getStreamMaxVolume	(I)I
    //   189: istore_1
    //   190: aload_0
    //   191: getfield 135	com/tencent/mm/ui/chatting/ag:wve	Lcom/tencent/mm/ui/chatting/En_5b8fbb1e$a;
    //   194: getfield 190	com/tencent/mm/ui/u:vKB	Lcom/tencent/mm/ui/p;
    //   197: getfield 605	com/tencent/mm/ui/p:hdu	Landroid/media/AudioManager;
    //   200: iconst_3
    //   201: invokevirtual 614	android/media/AudioManager:getStreamVolume	(I)I
    //   204: istore_2
    //   205: iload_1
    //   206: i2f
    //   207: iload_2
    //   208: i2f
    //   209: fdiv
    //   210: ldc_w 615
    //   213: fmul
    //   214: f2i
    //   215: istore_1
    //   216: aload_0
    //   217: new 617	android/media/ToneGenerator
    //   220: dup
    //   221: iconst_3
    //   222: iload_1
    //   223: invokespecial 619	android/media/ToneGenerator:<init>	(II)V
    //   226: putfield 601	com/tencent/mm/ui/chatting/ag:jss	Landroid/media/ToneGenerator;
    //   229: ldc -38
    //   231: ldc_w 621
    //   234: invokestatic 225	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   237: aload_0
    //   238: getfield 601	com/tencent/mm/ui/chatting/ag:jss	Landroid/media/ToneGenerator;
    //   241: ifnull +21 -> 262
    //   244: aload_0
    //   245: getfield 601	com/tencent/mm/ui/chatting/ag:jss	Landroid/media/ToneGenerator;
    //   248: bipush 24
    //   250: invokevirtual 625	android/media/ToneGenerator:startTone	(I)Z
    //   253: pop
    //   254: ldc -38
    //   256: ldc_w 627
    //   259: invokestatic 225	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   262: aload_0
    //   263: getfield 131	com/tencent/mm/ui/chatting/ag:wvc	Landroid/widget/ListView;
    //   266: new 36	com/tencent/mm/ui/chatting/ag$8
    //   269: dup
    //   270: aload_0
    //   271: invokespecial 628	com/tencent/mm/ui/chatting/ag$8:<init>	(Lcom/tencent/mm/ui/chatting/ag;)V
    //   274: ldc2_w 629
    //   277: invokevirtual 634	android/widget/ListView:postDelayed	(Ljava/lang/Runnable;J)Z
    //   280: pop
    //   281: aload_0
    //   282: getfield 113	com/tencent/mm/ui/chatting/ag:lock	Ljava/lang/Object;
    //   285: astore_3
    //   286: aload_3
    //   287: monitorenter
    //   288: aload_0
    //   289: iconst_0
    //   290: putfield 109	com/tencent/mm/ui/chatting/ag:wvl	Z
    //   293: aload_3
    //   294: monitorexit
    //   295: new 636	com/tencent/mm/sdk/platformtools/ae
    //   298: dup
    //   299: invokestatic 642	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   302: invokespecial 645	com/tencent/mm/sdk/platformtools/ae:<init>	(Landroid/os/Looper;)V
    //   305: new 34	com/tencent/mm/ui/chatting/ag$7
    //   308: dup
    //   309: aload_0
    //   310: invokespecial 646	com/tencent/mm/ui/chatting/ag$7:<init>	(Lcom/tencent/mm/ui/chatting/ag;)V
    //   313: ldc2_w 629
    //   316: invokevirtual 647	com/tencent/mm/sdk/platformtools/ae:postDelayed	(Ljava/lang/Runnable;J)Z
    //   319: pop
    //   320: ldc2_w 545
    //   323: sipush 15875
    //   326: invokestatic 92	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   329: iconst_1
    //   330: ireturn
    //   331: astore_3
    //   332: ldc -38
    //   334: ldc_w 649
    //   337: invokestatic 573	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   340: goto -103 -> 237
    //   343: astore 4
    //   345: aload_3
    //   346: monitorexit
    //   347: aload 4
    //   349: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	350	0	this	ag
    //   189	34	1	i	int
    //   204	4	2	j	int
    //   331	15	3	localException	Exception
    //   343	5	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   216	237	331	java/lang/Exception
    //   288	295	343	finally
    //   345	347	343	finally
  }
  
  public final void aNH()
  {
    GMTrace.i(2130974867456L, 15877);
    lX(false);
    ccg();
    GMTrace.o(2130974867456L, 15877);
  }
  
  public final void aNI()
  {
    GMTrace.i(2131109085184L, 15878);
    lX(false);
    ccg();
    GMTrace.o(2131109085184L, 15878);
  }
  
  public final void aNJ()
  {
    GMTrace.i(2131243302912L, 15879);
    lX(false);
    ccg();
    GMTrace.o(2131243302912L, 15879);
  }
  
  public final void aXL()
  {
    GMTrace.i(2133122351104L, 15893);
    boolean bool = com.tencent.mm.pluginsdk.h.a.a(this.wve.bWQ(), "android.permission.RECORD_AUDIO", 82, "", "");
    w.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW(), this.wve.bWQ() });
    if (!bool)
    {
      GMTrace.o(2133122351104L, 15893);
      return;
    }
    si localsi = new si();
    localsi.eXf.eHJ = 5;
    localsi.eXf.eDs = cci();
    localsi.eXf.context = this.wve.vKB.vKW;
    localsi.eXf.eXa = 4;
    if (this.mTr.bMz()) {
      this.mTr.bMB();
    }
    com.tencent.mm.sdk.b.a.vgX.m(localsi);
    GMTrace.o(2133122351104L, 15893);
  }
  
  public final void aXM()
  {
    GMTrace.i(2133256568832L, 15894);
    boolean bool = com.tencent.mm.pluginsdk.h.a.a(this.wve.bWQ(), "android.permission.CAMERA", 19, "", "");
    w.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW(), this.wve.bWQ() });
    if (!bool)
    {
      GMTrace.o(2133256568832L, 15894);
      return;
    }
    bool = com.tencent.mm.pluginsdk.h.a.a(this.wve.bWQ(), "android.permission.RECORD_AUDIO", 19, "", "");
    w.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW(), this.wve.bWQ() });
    if (!bool)
    {
      GMTrace.o(2133256568832L, 15894);
      return;
    }
    si localsi = new si();
    localsi.eXf.eHJ = 5;
    localsi.eXf.eDs = cci();
    localsi.eXf.context = this.wve.vKB.vKW;
    localsi.eXf.eXa = 2;
    if (this.mTr.bMz()) {
      this.mTr.bMB();
    }
    com.tencent.mm.sdk.b.a.vgX.m(localsi);
    GMTrace.o(2133256568832L, 15894);
  }
  
  public final boolean cch()
  {
    boolean bool = false;
    GMTrace.i(2131780173824L, 15883);
    this.wve.lf(true);
    this.wve.le(true);
    int i;
    label80:
    long l;
    if (this.wvf != null) {
      if (this.wvf.isRecording()) {
        if ((this.iBi.field_username.equals("medianote")) && ((q.zI() & 0x4000) == 0))
        {
          i = 1;
          if (i == 0) {
            break label258;
          }
          i = 1;
          bool = this.wvf.qt();
          this.jsM.stopTimer();
          this.jsN.stopTimer();
          if (i != 0)
          {
            au localau = new au();
            localau.db("medianote");
            localau.setType(34);
            localau.dC(1);
            localau.dc(this.wvh);
            localau.dB(2);
            localau.setContent(com.tencent.mm.modelvoice.n.b(q.zE(), this.wvf.qC(), false));
            localau.E(bc.gR("medianote"));
            if (this.wvf.qF() == 2) {
              localau.dh("SOURCE_SILK_FILE");
            }
            at.AR();
            l = com.tencent.mm.y.c.yM().P(localau);
            if (l > 0L) {
              break label263;
            }
            w.e("MicroMsg.ChattingFooterEventImpl", "insertLocalMsg fail");
          }
          label236:
          ad.RT("keep_app_silent");
        }
      }
    }
    for (;;)
    {
      GMTrace.o(2131780173824L, 15883);
      return bool;
      i = 0;
      break;
      label258:
      i = 0;
      break label80;
      label263:
      w.i("MicroMsg.ChattingFooterEventImpl", "insertLocalMsg success, msgId = " + l);
      break label236;
      w.i("MicroMsg.ChattingFooterEventImpl", "stopRecording recorder == null");
    }
  }
  
  public final String cci()
  {
    GMTrace.i(2131914391552L, 15884);
    if ((this.iBi != null) && (x.fw(this.iBi.field_username)))
    {
      str = this.wvg;
      GMTrace.o(2131914391552L, 15884);
      return str;
    }
    if (this.iBi == null)
    {
      GMTrace.o(2131914391552L, 15884);
      return null;
    }
    String str = this.iBi.field_username;
    GMTrace.o(2131914391552L, 15884);
    return str;
  }
  
  public final void ccj()
  {
    GMTrace.i(2132585480192L, 15889);
    boolean bool = com.tencent.mm.pluginsdk.h.a.a(this.wve.bWQ(), "android.permission.CAMERA", 22, "", "");
    w.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW(), this.wve.bWQ() });
    if (!bool)
    {
      GMTrace.o(2132585480192L, 15889);
      return;
    }
    bool = com.tencent.mm.pluginsdk.h.a.a(this.wve.bWQ(), "android.permission.RECORD_AUDIO", 22, "", "");
    w.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW(), this.wve.bWQ() });
    if (!bool)
    {
      GMTrace.o(2132585480192L, 15889);
      return;
    }
    w.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk");
    Intent localIntent = new Intent();
    if (p.a.tmc.Bj(cci()))
    {
      w.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, but now is in share location!");
      Toast.makeText(ab.getContext(), R.l.dDb, 0).show();
      GMTrace.o(2132585480192L, 15889);
      return;
    }
    List localList;
    if (cci() != null)
    {
      localList = p.a.tmd.CU(cci());
      at.AR();
      String str1 = (String)com.tencent.mm.y.c.xh().get(2, null);
      bool = p.a.tmd.CS(cci());
      Iterator localIterator = localList.iterator();
      String str2;
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        str2 = (String)localIterator.next();
      } while ((str1 == null) || (!str1.equals(str2)));
    }
    for (int i = 1;; i = 0)
    {
      if ((localList.size() >= 9) && (i == 0))
      {
        w.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, but > max 9 members!");
        Toast.makeText(ab.getContext(), ab.getContext().getString(R.l.dJX, new Object[] { Integer.valueOf(9) }), 0).show();
        GMTrace.o(2132585480192L, 15889);
        return;
      }
      if (i != 0)
      {
        if (p.a.tmd.aRq())
        {
          w.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, but already in it!");
          Toast.makeText(ab.getContext(), ab.getContext().getString(R.l.dJR), 0).show();
          GMTrace.o(2132585480192L, 15889);
          return;
        }
        w.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, already inlist, but in fact not multitalking now!");
      }
      if (p.a.tmd.aRF())
      {
        w.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, but already in VoIP or multitalk!");
        Toast.makeText(ab.getContext(), ab.getContext().getString(R.l.dJR), 0).show();
        GMTrace.o(2132585480192L, 15889);
        return;
      }
      if (bool)
      {
        w.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, but this group already in multitalk, alter take in or not tips!");
        com.tencent.mm.ui.base.h.a(this.wve.vKB.vKW, this.wve.getString(R.l.dKn), "", this.wve.getString(R.l.dJB), this.wve.getString(R.l.dJz), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(2307336962048L, 17191);
            if (!p.a.tmd.CS(ag.this.cci()))
            {
              Toast.makeText(ab.getContext(), ab.getContext().getString(R.l.dKj), 0).show();
              GMTrace.o(2307336962048L, 17191);
              return;
            }
            if (!p.a.tmd.CZ(ag.this.cci())) {
              Toast.makeText(ab.getContext(), ab.getContext().getString(R.l.dJK), 0).show();
            }
            GMTrace.o(2307336962048L, 17191);
          }
        }, null);
        GMTrace.o(2132585480192L, 15889);
        return;
      }
      localIntent.putExtra("chatroomName", cci());
      localIntent.putExtra("key_need_gallery", true);
      localIntent.putExtra("titile", this.wve.getString(R.l.dKe));
      com.tencent.mm.bj.d.b(this.wve.vKB.vKW, "multitalk", ".ui.MultiTalkSelectContactUI", localIntent);
      GMTrace.o(2132585480192L, 15889);
      return;
    }
  }
  
  public final void cck()
  {
    GMTrace.i(2132853915648L, 15891);
    boolean bool = com.tencent.mm.pluginsdk.h.a.a(this.wve.bWQ(), "android.permission.RECORD_AUDIO", 83, "", "");
    w.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW(), this.wve.bWQ() });
    if (!bool)
    {
      GMTrace.o(2132853915648L, 15891);
      return;
    }
    if (this.mTr.bMz()) {
      this.mTr.bMB();
    }
    si localsi = new si();
    localsi.eXf.eHJ = 5;
    localsi.eXf.eDs = cci();
    localsi.eXf.context = this.wve.vKB.vKW;
    localsi.eXf.eXa = 3;
    com.tencent.mm.sdk.b.a.vgX.m(localsi);
    com.tencent.mm.plugin.report.service.g.ork.i(11033, new Object[] { Integer.valueOf(4), Integer.valueOf(2), Integer.valueOf(0) });
    GMTrace.o(2132853915648L, 15891);
  }
  
  public final void ccl()
  {
    GMTrace.i(2132988133376L, 15892);
    boolean bool = com.tencent.mm.pluginsdk.h.a.a(this.wve.bWQ(), "android.permission.CAMERA", 21, "", "");
    w.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW(), this.wve.bWQ() });
    if (!bool)
    {
      GMTrace.o(2132988133376L, 15892);
      return;
    }
    bool = com.tencent.mm.pluginsdk.h.a.a(this.wve.bWQ(), "android.permission.RECORD_AUDIO", 21, "", "");
    w.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW(), this.wve.bWQ() });
    if (!bool)
    {
      GMTrace.o(2132988133376L, 15892);
      return;
    }
    if (this.mTr.bMz()) {
      this.mTr.bMB();
    }
    si localsi = new si();
    localsi.eXf.eHJ = 5;
    localsi.eXf.eDs = cci();
    localsi.eXf.context = this.wve.vKB.vKW;
    localsi.eXf.eXa = 2;
    com.tencent.mm.sdk.b.a.vgX.m(localsi);
    GMTrace.o(2132988133376L, 15892);
  }
  
  public final void ccm()
  {
    GMTrace.i(2133390786560L, 15895);
    this.wve.wCm.mh(false);
    this.mTr.bMB();
    GMTrace.o(2133390786560L, 15895);
  }
  
  public final void ccn()
  {
    GMTrace.i(2133525004288L, 15896);
    if (!k.a(this.wve, com.tencent.mm.compatible.util.e.fRZ, "microMsg." + System.currentTimeMillis() + ".jpg")) {
      Toast.makeText(this.wve.vKB.vKW, this.wve.getString(R.l.dWY), 1).show();
    }
    GMTrace.o(2133525004288L, 15896);
  }
  
  public final void fS(boolean paramBoolean)
  {
    GMTrace.i(2132317044736L, 15887);
    if (paramBoolean)
    {
      this.wve.wCl.keepSignalling();
      GMTrace.o(2132317044736L, 15887);
      return;
    }
    this.wve.wCl.stopSignalling();
    GMTrace.o(2132317044736L, 15887);
  }
  
  @Deprecated
  @SuppressLint({"NewApi"})
  void lX(final boolean paramBoolean)
  {
    GMTrace.i(2131511738368L, 15881);
    this.wvc.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(2114600304640L, 15755);
        int j = ag.this.wvc.getLastVisiblePosition();
        int i = ag.this.wvc.getCount() - 1;
        w.v("MicroMsg.ChattingFooterEventImpl", "last visible/adapter=" + j + "/" + i + " " + this.hqz);
        if ((j >= i - 1) || (this.hqz))
        {
          j = ag.this.wvd.getCount();
          if ((j > 1) && (((au)ag.this.wvd.getItem(j - 2)).isSystem()))
          {
            com.tencent.mm.ui.chatting.b.l.a(ag.this.wvc, i - 1, 0, paramBoolean);
            GMTrace.o(2114600304640L, 15755);
            return;
          }
          com.tencent.mm.ui.chatting.b.l.a(ag.this.wvc, i, paramBoolean);
        }
        GMTrace.o(2114600304640L, 15755);
      }
    }, 10L);
    GMTrace.o(2131511738368L, 15881);
  }
  
  public final void onPause()
  {
    GMTrace.i(2132182827008L, 15886);
    if (this.jss != null)
    {
      w.i("MicroMsg.ChattingFooterEventImpl", "release");
      this.jss.release();
      this.jss = null;
    }
    cch();
    this.jsM.stopTimer();
    this.jsN.stopTimer();
    GMTrace.o(2132182827008L, 15886);
  }
  
  public final void release()
  {
    GMTrace.i(2132048609280L, 15885);
    if (this.jss != null)
    {
      w.i("MicroMsg.ChattingFooterEventImpl", "release");
      this.jss.release();
      this.jss = null;
    }
    GMTrace.o(2132048609280L, 15885);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
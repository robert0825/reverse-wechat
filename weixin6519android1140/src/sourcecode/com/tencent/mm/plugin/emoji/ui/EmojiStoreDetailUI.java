package com.tencent.mm.plugin.emoji.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.g.a.cs;
import com.tencent.mm.jniinterface.AesEcb;
import com.tencent.mm.plugin.emoji.e.f;
import com.tencent.mm.plugin.emoji.e.k.1;
import com.tencent.mm.plugin.emoji.f.o;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.ui.v2.DonorsAvatarView;
import com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI;
import com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardDetailUI;
import com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardUI;
import com.tencent.mm.plugin.emoji.ui.widget.MMCopiableTextView;
import com.tencent.mm.plugin.gif.MMAnimateView;
import com.tencent.mm.pluginsdk.model.h.a;
import com.tencent.mm.pluginsdk.ui.applet.e.a;
import com.tencent.mm.pluginsdk.ui.emoji.BannerEmojiView;
import com.tencent.mm.protocal.c.aae;
import com.tencent.mm.protocal.c.asa;
import com.tencent.mm.protocal.c.ato;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.rd;
import com.tencent.mm.protocal.c.rg;
import com.tencent.mm.protocal.c.zw;
import com.tencent.mm.protocal.c.zy;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMAutoSizeTextView;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.view.SmileySubGrid;
import com.tencent.mm.y.at;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class EmojiStoreDetailUI
  extends MMActivity
  implements View.OnClickListener, com.tencent.mm.ad.e, j.a
{
  private View iTN;
  private int jRR;
  private ProgressBar kgk;
  private ProgressDialog kgz;
  private long kkB;
  private String kkC;
  private com.tencent.mm.plugin.emoji.h.b kkF;
  private String klt;
  private String klu;
  private String klv;
  private com.tencent.mm.sdk.b.c knA;
  private rd knO;
  private String knP;
  private int knw;
  private aae kpA;
  private boolean kpB;
  private TextView kpC;
  private View kpD;
  private EmojiDetailScrollView kpE;
  private BannerEmojiView kpF;
  private TextView kpG;
  private MMAutoSizeTextView kpH;
  private TextView kpI;
  private TextView kpJ;
  private TextView kpK;
  private EmojiDetailGridView kpL;
  private ImageView kpM;
  private View kpN;
  private TextView kpO;
  private TextView kpP;
  private int kpQ;
  private View kpR;
  private ProgressBar kpS;
  private View kpT;
  private ImageView kpU;
  private TextView kpV;
  private View kpW;
  private View kpX;
  private MMCopiableTextView kpY;
  private Button kpZ;
  private int kpr;
  private String kps;
  private boolean kpt;
  private boolean kpu;
  private int kpv;
  private com.tencent.mm.plugin.emoji.f.l kpw;
  private com.tencent.mm.plugin.emoji.f.g kpx;
  private o kpy;
  private a kpz;
  private DonorsAvatarView kqa;
  private TextView kqb;
  private int kqc;
  private int kqd;
  private int kqe;
  private String kqf;
  private boolean kqg;
  private int kqh;
  private int kqi;
  private String kqj;
  private String[] kqk;
  private boolean kql;
  private View kqm;
  private boolean kqn;
  private zw kqo;
  private boolean kqp;
  private boolean kqq;
  private View.OnClickListener kqr;
  private View.OnClickListener kqs;
  private View.OnClickListener kqt;
  private View.OnClickListener kqu;
  private com.tencent.mm.ao.a.c.i kqv;
  private com.tencent.mm.ao.a.c.i kqw;
  private com.tencent.mm.ao.a.c.j kqx;
  private h.a kqy;
  private Context mContext;
  private ae mHandler;
  private int mNumColumns;
  private int rr;
  
  public EmojiStoreDetailUI()
  {
    GMTrace.i(11405822525440L, 84980);
    this.kpu = false;
    this.kpv = -1;
    this.knO = new rd();
    this.knP = "";
    this.kpA = null;
    this.kkB = 0L;
    this.kkC = "";
    this.kqi = -1;
    this.kqk = new String[1];
    this.kql = false;
    this.kqn = true;
    this.kqp = false;
    this.kqq = true;
    this.knA = new com.tencent.mm.sdk.b.c() {};
    this.kqr = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11361396457472L, 84649);
        w.d("MicroMsg.emoji.EmojiStoreDetailUI", "ApplicationLanguage" + v.bPK());
        paramAnonymousView = EmojiStoreDetailUI.this.getString(R.l.dok) + v.bPK();
        Intent localIntent = new Intent();
        localIntent.putExtra("rawUrl", paramAnonymousView);
        localIntent.putExtra("showShare", false);
        localIntent.putExtra("neverGetA8Key", true);
        com.tencent.mm.bj.d.b(EmojiStoreDetailUI.this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
        GMTrace.o(11361396457472L, 84649);
      }
    };
    this.kqs = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11360054280192L, 84639);
        w.d("MicroMsg.emoji.EmojiStoreDetailUI", "ApplicationLanguage" + v.bPK());
        paramAnonymousView = EmojiStoreDetailUI.this.getString(R.l.dnS) + v.bPK();
        Intent localIntent = new Intent();
        localIntent.putExtra("title", EmojiStoreDetailUI.this.getString(R.l.doz));
        localIntent.putExtra("rawUrl", paramAnonymousView);
        localIntent.putExtra("showShare", false);
        localIntent.putExtra("neverGetA8Key", true);
        com.tencent.mm.bj.d.b(EmojiStoreDetailUI.this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
        GMTrace.o(11360054280192L, 84639);
      }
    };
    this.kqt = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11399514292224L, 84933);
        paramAnonymousView = new Intent();
        paramAnonymousView.setClass(EmojiStoreDetailUI.this, EmojiStoreV2RewardUI.class);
        paramAnonymousView.putExtra("extra_id", EmojiStoreDetailUI.a(EmojiStoreDetailUI.this));
        paramAnonymousView.putExtra("extra_name", EmojiStoreDetailUI.b(EmojiStoreDetailUI.this).uhe);
        if ((EmojiStoreDetailUI.b(EmojiStoreDetailUI.this) != null) && (EmojiStoreDetailUI.b(EmojiStoreDetailUI.this).uhz != null)) {
          paramAnonymousView.putExtra("name", EmojiStoreDetailUI.b(EmojiStoreDetailUI.this).uhz.lPi);
        }
        paramAnonymousView.putExtra("scene", EmojiStoreDetailUI.c(EmojiStoreDetailUI.this));
        paramAnonymousView.putExtra("pageType", 1);
        paramAnonymousView.putExtra("searchID", EmojiStoreDetailUI.d(EmojiStoreDetailUI.this));
        EmojiStoreDetailUI.this.startActivity(paramAnonymousView);
        com.tencent.mm.plugin.report.service.g.ork.i(12738, new Object[] { EmojiStoreDetailUI.a(EmojiStoreDetailUI.this), Integer.valueOf(1), Integer.valueOf(EmojiStoreDetailUI.c(EmojiStoreDetailUI.this)), Integer.valueOf(0) });
        GMTrace.o(11399514292224L, 84933);
      }
    };
    this.kqu = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11536550592512L, 85954);
        paramAnonymousView = new Intent();
        paramAnonymousView.setClass(EmojiStoreDetailUI.this, EmojiStoreV2RewardDetailUI.class);
        paramAnonymousView.putExtra("extra_id", EmojiStoreDetailUI.a(EmojiStoreDetailUI.this));
        paramAnonymousView.putExtra("extra_iconurl", EmojiStoreDetailUI.b(EmojiStoreDetailUI.this).lRV);
        paramAnonymousView.putExtra("extra_name", EmojiStoreDetailUI.b(EmojiStoreDetailUI.this).uhe);
        if (EmojiStoreDetailUI.b(EmojiStoreDetailUI.this).uhz != null) {
          paramAnonymousView.putExtra("name", EmojiStoreDetailUI.b(EmojiStoreDetailUI.this).uhz.lPi);
        }
        EmojiStoreDetailUI.this.startActivity(paramAnonymousView);
        GMTrace.o(11536550592512L, 85954);
      }
    };
    this.mHandler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(11463804583936L, 85412);
        switch (paramAnonymousMessage.what)
        {
        default: 
          w.w("MicroMsg.emoji.EmojiStoreDetailUI", "unknow message, cannt handle.");
          GMTrace.o(11463804583936L, 85412);
          return;
        case 1001: 
          EmojiStoreDetailUI.e(EmojiStoreDetailUI.this);
          GMTrace.o(11463804583936L, 85412);
          return;
        case 1002: 
          EmojiStoreDetailUI.f(EmojiStoreDetailUI.this);
          GMTrace.o(11463804583936L, 85412);
          return;
        case 1003: 
          EmojiStoreDetailUI.g(EmojiStoreDetailUI.this);
          GMTrace.o(11463804583936L, 85412);
          return;
        case 1004: 
          if (EmojiStoreDetailUI.h(EmojiStoreDetailUI.this).getVisibility() == 0)
          {
            EmojiStoreDetailUI.h(EmojiStoreDetailUI.this).setVisibility(8);
            EmojiStoreDetailUI.i(EmojiStoreDetailUI.this).setVisibility(0);
            EmojiStoreDetailUI.j(EmojiStoreDetailUI.this).setVisibility(0);
          }
          EmojiStoreDetailUI.l(EmojiStoreDetailUI.this).setProgress(EmojiStoreDetailUI.k(EmojiStoreDetailUI.this));
          GMTrace.o(11463804583936L, 85412);
          return;
        case 1005: 
          EmojiStoreDetailUI.m(EmojiStoreDetailUI.this).scrollTo(0, 0);
          GMTrace.o(11463804583936L, 85412);
          return;
        case 1006: 
          EmojiStoreDetailUI.n(EmojiStoreDetailUI.this);
          GMTrace.o(11463804583936L, 85412);
          return;
        }
        EmojiStoreDetailUI.this.asH();
        GMTrace.o(11463804583936L, 85412);
      }
    };
    this.kqv = new com.tencent.mm.ao.a.c.i()
    {
      public final void a(String paramAnonymousString, Bitmap paramAnonymousBitmap, Object... paramAnonymousVarArgs)
      {
        GMTrace.i(11433202941952L, 85184);
        w.d("MicroMsg.emoji.EmojiStoreDetailUI", "[cpan] on image load complete url:%s", new Object[] { paramAnonymousString });
        if (paramAnonymousBitmap != null) {
          EmojiStoreDetailUI.this.mL(1006);
        }
        GMTrace.o(11433202941952L, 85184);
      }
    };
    this.kqw = new com.tencent.mm.ao.a.c.i()
    {
      public final void a(String paramAnonymousString, final Bitmap paramAnonymousBitmap, Object... paramAnonymousVarArgs)
      {
        GMTrace.i(11368375779328L, 84701);
        final int k;
        long l;
        int j;
        if ((paramAnonymousBitmap != null) && (paramAnonymousVarArgs != null) && (paramAnonymousVarArgs.length > 0) && (EmojiStoreDetailUI.o(EmojiStoreDetailUI.this) != null))
        {
          k = ((Integer)paramAnonymousVarArgs[0]).intValue();
          at.AR();
          paramAnonymousString = EmojiLogic.F(com.tencent.mm.y.c.zb(), EmojiStoreDetailUI.a(EmojiStoreDetailUI.this), paramAnonymousString);
          paramAnonymousBitmap = EmojiStoreDetailUI.a(EmojiStoreDetailUI.this);
          paramAnonymousVarArgs = ((asa)EmojiStoreDetailUI.b(EmojiStoreDetailUI.this).uhu.get(k)).uHY;
          com.tencent.mm.br.a.getDensity(EmojiStoreDetailUI.p(EmojiStoreDetailUI.this));
          paramAnonymousBitmap = EmojiLogic.a(paramAnonymousBitmap, 8, paramAnonymousVarArgs, true);
          Object localObject = com.tencent.mm.plugin.emoji.e.e.aqw();
          if (com.tencent.mm.a.e.aZ(paramAnonymousString))
          {
            l = System.currentTimeMillis();
            j = com.tencent.mm.a.e.aY(paramAnonymousString);
            if (j > 1024)
            {
              i = 1024;
              paramAnonymousVarArgs = com.tencent.mm.a.e.c(paramAnonymousString, 0, j);
              localObject = AesEcb.aesCryptEcb(com.tencent.mm.a.e.c(paramAnonymousString, 0, i), ((com.tencent.mm.plugin.emoji.e.e)localObject).aqx().getBytes(), true, false);
              if ((bg.bq((byte[])localObject)) || (bg.bq(paramAnonymousVarArgs))) {
                break label399;
              }
              System.arraycopy(localObject, 0, paramAnonymousVarArgs, 0, i);
            }
          }
        }
        label281:
        label375:
        label383:
        label399:
        for (int i = com.tencent.mm.a.e.b(paramAnonymousString, paramAnonymousVarArgs, j);; i = -1)
        {
          if (i == 0)
          {
            l = System.currentTimeMillis() - l;
            com.tencent.mm.plugin.report.service.g.ork.a(252L, 1L, l, false);
            com.tencent.mm.plugin.report.service.g.ork.a(252L, 6L, 1L, false);
            w.i("MicroMsg.emoji.EmojiFileEncryptMgr", "encode emoji file length:%d use time:%d", new Object[] { Integer.valueOf(paramAnonymousVarArgs.length), Long.valueOf(l) });
            i = 1;
            if (paramAnonymousBitmap == null) {
              break label383;
            }
            if (i == 0) {
              break label375;
            }
          }
          for (paramAnonymousBitmap.field_reserved4 = EmojiInfo.vCJ;; paramAnonymousBitmap.field_reserved4 = 0)
          {
            EmojiStoreDetailUI.o(EmojiStoreDetailUI.this).post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(11366496731136L, 84687);
                EmojiDetailGridView localEmojiDetailGridView = EmojiStoreDetailUI.q(EmojiStoreDetailUI.this);
                EmojiInfo localEmojiInfo = paramAnonymousBitmap;
                int i = k;
                if ((localEmojiDetailGridView.xzY != i) || (!localEmojiDetailGridView.xzZ))
                {
                  w.d("MicroMsg.emoji.SmileyPanel.SmileySubGrid", "not show:%d, needData: %B, so do not refresh", new Object[] { Integer.valueOf(i), Boolean.valueOf(localEmojiDetailGridView.xzZ) });
                  GMTrace.o(11366496731136L, 84687);
                  return;
                }
                localEmojiDetailGridView.s(localEmojiInfo);
                GMTrace.o(11366496731136L, 84687);
              }
            });
            GMTrace.o(11368375779328L, 84701);
            return;
            i = j;
            break;
            w.w("MicroMsg.emoji.EmojiFileEncryptMgr", "encodeEmojiFile failed. write file failed.");
            com.tencent.mm.plugin.report.service.g.ork.a(252L, 3L, 1L, false);
            i = 0;
            break label281;
            w.w("MicroMsg.emoji.EmojiFileEncryptMgr", "encodeEmojiFile failed. file do no exsit.");
            i = 0;
            break label281;
          }
          w.i("MicroMsg.emoji.EmojiStoreDetailUI", "ignore no call back preview loader. ");
          GMTrace.o(11368375779328L, 84701);
          return;
        }
      }
    };
    this.kqx = new com.tencent.mm.ao.a.c.j()
    {
      public final void av(long paramAnonymousLong)
      {
        GMTrace.i(11370657480704L, 84718);
        com.tencent.mm.plugin.report.service.g.ork.A(10930, EmojiStoreDetailUI.a(EmojiStoreDetailUI.this) + "," + paramAnonymousLong);
        GMTrace.o(11370657480704L, 84718);
      }
    };
    this.kqy = new h.a()
    {
      public final void x(ArrayList<com.tencent.mm.pluginsdk.model.p> paramAnonymousArrayList)
      {
        GMTrace.i(11383676600320L, 84815);
        w.d("MicroMsg.emoji.EmojiStoreDetailUI", "[onQueryFinish]");
        EmojiStoreDetailUI.E(EmojiStoreDetailUI.this);
        if ((paramAnonymousArrayList != null) && (paramAnonymousArrayList.size() > 0))
        {
          paramAnonymousArrayList = (com.tencent.mm.pluginsdk.model.p)paramAnonymousArrayList.get(0);
          if (paramAnonymousArrayList.tni != 10232) {
            break label93;
          }
          EmojiStoreDetailUI.a(EmojiStoreDetailUI.this, 4);
          EmojiStoreDetailUI.a(EmojiStoreDetailUI.this, paramAnonymousArrayList.tnf);
        }
        for (;;)
        {
          EmojiStoreDetailUI.this.mL(1002);
          GMTrace.o(11383676600320L, 84815);
          return;
          label93:
          EmojiStoreDetailUI.a(EmojiStoreDetailUI.this, 10);
          EmojiStoreDetailUI.b(EmojiStoreDetailUI.this, paramAnonymousArrayList.tni);
        }
      }
    };
    GMTrace.o(11405822525440L, 84980);
  }
  
  private void asB()
  {
    GMTrace.i(11407701573632L, 84994);
    this.iTN.setVisibility(0);
    this.kpD.setVisibility(8);
    this.kpE.setVisibility(8);
    this.kpC.setText(R.l.dof);
    GMTrace.o(11407701573632L, 84994);
  }
  
  private void asC()
  {
    GMTrace.i(11407835791360L, 84995);
    w.i("MicroMsg.emoji.EmojiStoreDetailUI", "[handleLoadDataFailed]");
    if ((this.knO == null) || (this.knO.uhj == 0))
    {
      this.iTN.setVisibility(0);
      this.kpD.setVisibility(8);
    }
    GMTrace.o(11407835791360L, 84995);
  }
  
  private void asD()
  {
    GMTrace.i(11408372662272L, 84999);
    this.kpA = com.tencent.mm.plugin.emoji.model.h.arl().kjD.UQ(this.klt);
    GMTrace.o(11408372662272L, 84999);
  }
  
  private void asE()
  {
    GMTrace.i(11408506880000L, 85000);
    if ((com.tencent.mm.plugin.emoji.a.a.e.bU(this.knO.uhj, 64)) && (com.tencent.mm.plugin.emoji.e.n.aqQ()))
    {
      this.kpy = new o(this.klt, o.klQ);
      at.wS().a(this.kpy, 0);
    }
    GMTrace.o(11408506880000L, 85000);
  }
  
  private boolean asF()
  {
    GMTrace.i(11408641097728L, 85001);
    boolean bool = com.tencent.mm.plugin.emoji.h.a.asF();
    this.kpB = bool;
    if (bool) {}
    for (int i = 7;; i = 3)
    {
      this.kpv = i;
      GMTrace.o(11408641097728L, 85001);
      return bool;
    }
  }
  
  private void asG()
  {
    GMTrace.i(11408775315456L, 85002);
    if (!bg.nm(this.knO.uhe)) {
      sq(this.knO.uhe);
    }
    w.d("MicroMsg.emoji.EmojiStoreDetailUI", "mData.PanelUrl:%s", new Object[] { this.knO.uhr });
    this.kpD.setVisibility(0);
    this.iTN.setVisibility(8);
    dR(true);
    this.kpH.setText(this.knO.uhe);
    this.kpI.setText(this.knO.uho);
    this.kpK.setText(this.knO.uhf);
    label225:
    label510:
    LinearLayout.LayoutParams localLayoutParams1;
    if (com.tencent.mm.plugin.emoji.a.a.e.bU(this.knO.uhi, 1))
    {
      this.kpG.setVisibility(8);
      asI();
      asJ();
      asK();
      if ((com.tencent.mm.plugin.emoji.h.a.wB(this.klt)) || ((this.knO.uhu != null) && (this.knO.uhu.size() > 0) && (((asa)this.knO.uhu.get(0)).uHY != null))) {
        break label676;
      }
      this.kqm.setVisibility(8);
      this.kpL.xAa = false;
      this.kpL.klt = this.klt;
      if (this.kpz != null) {
        this.kpz.notifyDataSetInvalidated();
      }
      w.d("MicroMsg.emoji.EmojiStoreDetailUI", "mData.PackFlag:%s", new Object[] { this.knO.uhj });
      if ((this.knO.uhj & 0x10) == 16) {
        a(0, R.k.cNO, new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(11387703132160L, 84845);
            w.d("MicroMsg.emoji.EmojiStoreDetailUI", "on shard click.");
            EmojiStoreDetailUI.u(EmojiStoreDetailUI.this);
            GMTrace.o(11387703132160L, 84845);
            return true;
          }
        });
      }
      this.kpH.setMaxWidth(this.kpQ - this.kpR.getWidth() - com.tencent.mm.br.a.V(this.vKB.vKW, R.f.aQE) * 2 - this.kpG.getWidth() - com.tencent.mm.br.a.V(this.vKB.vKW, R.f.aQt) * 2);
      this.kpH.setVisibility(8);
      this.kpH.setVisibility(0);
      if ((this.knO.uhz == null) || (this.knO.uhz.uqo == 0) || (this.kqe == 6)) {
        break label695;
      }
      this.kpW.setVisibility(0);
      this.kpT.setVisibility(0);
      com.tencent.mm.ao.n.Jd().a(this.knO.uhz.uhA, this.kpU, f.bR(this.klt, this.knO.uhz.uhA));
      this.kpV.setText(this.knO.uhz.lPi);
      this.kpT.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11401393340416L, 84947);
          paramAnonymousView = new Intent();
          paramAnonymousView.setClass(EmojiStoreDetailUI.this.vKB.vKW, EmojiStoreV2DesignerUI.class);
          paramAnonymousView.putExtra("uin", EmojiStoreDetailUI.b(EmojiStoreDetailUI.this).uhz.uqo);
          paramAnonymousView.putExtra("name", EmojiStoreDetailUI.b(EmojiStoreDetailUI.this).uhz.lPi);
          paramAnonymousView.putExtra("headurl", EmojiStoreDetailUI.b(EmojiStoreDetailUI.this).uhz.uhA);
          paramAnonymousView.putExtra("rediret_url", EmojiStoreDetailUI.b(EmojiStoreDetailUI.this).uhx);
          paramAnonymousView.putExtra("searchID", EmojiStoreDetailUI.d(EmojiStoreDetailUI.this));
          paramAnonymousView.putExtra("extra_scence", 26);
          EmojiStoreDetailUI.this.vKB.vKW.startActivity(paramAnonymousView);
          GMTrace.o(11401393340416L, 84947);
        }
      });
      if ((this.knO.uhj & 0x20) != 32) {
        break label716;
      }
      localLayoutParams1 = (LinearLayout.LayoutParams)this.kpP.getLayoutParams();
      LinearLayout.LayoutParams localLayoutParams2 = (LinearLayout.LayoutParams)this.kpO.getLayoutParams();
      this.kpP.setVisibility(0);
      localLayoutParams1.weight = 1.0F;
      localLayoutParams1.gravity = 3;
      localLayoutParams1.leftMargin = com.tencent.mm.br.a.V(this.vKB.vKW, R.f.aQE);
      this.kpP.setLayoutParams(localLayoutParams1);
      this.kpP.setGravity(3);
      localLayoutParams2.weight = 1.0F;
      localLayoutParams2.gravity = 5;
      localLayoutParams2.rightMargin = com.tencent.mm.br.a.V(this.vKB.vKW, R.f.aQE);
      this.kpO.setLayoutParams(localLayoutParams2);
      this.kpO.setGravity(5);
    }
    for (;;)
    {
      asH();
      GMTrace.o(11408775315456L, 85002);
      return;
      this.kpG.setVisibility(0);
      this.kpG.setText(R.l.dpH);
      break;
      label676:
      this.kpL.xAa = true;
      this.kqm.setVisibility(0);
      break label225;
      label695:
      this.kpW.setVisibility(8);
      this.kpT.setVisibility(8);
      break label510;
      label716:
      localLayoutParams1 = (LinearLayout.LayoutParams)this.kpO.getLayoutParams();
      localLayoutParams1.gravity = 17;
      this.kpO.setLayoutParams(localLayoutParams1);
      this.kpO.setGravity(17);
      this.kpP.setVisibility(8);
    }
  }
  
  private void asI()
  {
    GMTrace.i(11409177968640L, 85005);
    if (com.tencent.mm.plugin.emoji.a.a.e.bU(this.knO.uhi, 8))
    {
      this.kqd = 0;
      w.i("MicroMsg.emoji.EmojiStoreDetailUI", "PackFlag:%d", new Object[] { Integer.valueOf(this.knO.uhj) });
      if ((!com.tencent.mm.plugin.emoji.a.a.e.bU(this.knO.uhj, 8)) || (!com.tencent.mm.plugin.emoji.a.a.e.mG(this.knO.uhi))) {
        break label170;
      }
      this.kpv = 8;
    }
    for (;;)
    {
      if (this.kpB) {
        this.kpv = 7;
      }
      GMTrace.o(11409177968640L, 85005);
      return;
      if (com.tencent.mm.plugin.emoji.a.a.e.bU(this.knO.uhi, 4))
      {
        this.kqd = 0;
        break;
      }
      if ((!this.kqg) && (TextUtils.isEmpty(this.knO.uhh)))
      {
        this.kqd = 0;
        break;
      }
      this.kqd = 1;
      break;
      label170:
      if ((com.tencent.mm.plugin.emoji.a.a.e.bU(this.knO.uhj, 1)) || (com.tencent.mm.plugin.emoji.a.a.e.bU(this.knO.uhi, 8))) {
        this.kpv = 3;
      } else if (com.tencent.mm.plugin.emoji.a.a.e.mG(this.knO.uhi)) {
        this.kpv = 0;
      } else if ((!this.kqg) && ((TextUtils.isEmpty(this.knO.uhp)) || (this.knO.uhp.equals("0")))) {
        this.kpv = 0;
      } else if (this.kqg)
      {
        if (TextUtils.isEmpty(this.kqj)) {
          this.kpv = this.kqh;
        } else {
          this.kpv = 4;
        }
      }
      else {
        this.kpv = 4;
      }
    }
  }
  
  private void asJ()
  {
    GMTrace.i(11409312186368L, 85006);
    for (;;)
    {
      if (com.tencent.mm.plugin.emoji.h.a.wB(this.klt)) {
        asF();
      }
      switch (this.kpv)
      {
      case 1: 
      case 2: 
      case 9: 
      default: 
        w.w("MicroMsg.emoji.EmojiStoreDetailUI", "unknow product status:%d", new Object[] { Integer.valueOf(this.kpv) });
      case 8: 
      case 0: 
      case 4: 
      case 3: 
      case 6: 
      case 7: 
        do
        {
          do
          {
            GMTrace.o(11409312186368L, 85006);
            return;
            this.kpS.setVisibility(8);
            this.kpJ.setTextColor(getResources().getColorStateList(R.e.aNw));
            this.kpJ.setBackgroundResource(R.g.aUI);
            this.kpJ.setText(R.l.doG);
            this.kpJ.setEnabled(false);
            GMTrace.o(11409312186368L, 85006);
            return;
            this.kpS.setVisibility(8);
            this.kpJ.setTextColor(getResources().getColorStateList(R.e.aPs));
            this.kpJ.setBackgroundResource(R.g.aUF);
            this.kpJ.setText(R.l.doD);
            this.kpJ.setEnabled(true);
            GMTrace.o(11409312186368L, 85006);
            return;
            this.kpS.setVisibility(8);
            this.kpJ.setTextColor(getResources().getColorStateList(R.e.aPs));
            this.kpJ.setBackgroundResource(R.g.aUF);
            this.kpJ.setEnabled(true);
            if (this.kqg)
            {
              if (bg.nm(this.kqj))
              {
                this.kpJ.setText("");
                GMTrace.o(11409312186368L, 85006);
                return;
              }
              this.kpJ.setText(this.kqj);
              GMTrace.o(11409312186368L, 85006);
              return;
            }
            this.kpJ.setText(this.knO.uhh);
            this.kpv = 4;
            GMTrace.o(11409312186368L, 85006);
            return;
            this.kpS.setVisibility(8);
            this.kpJ.setTextColor(getResources().getColorStateList(R.e.aPs));
            this.kpJ.setBackgroundResource(R.g.aUF);
            this.kpJ.setText(R.l.doD);
            this.kpJ.setEnabled(true);
            GMTrace.o(11409312186368L, 85006);
            return;
            this.kpS.setVisibility(8);
            this.kpJ.setEnabled(false);
            this.kpN.setVisibility(0);
            this.kpM.setVisibility(0);
            this.kpJ.setVisibility(4);
          } while (this.kpr == 3);
          GMTrace.o(11409312186368L, 85006);
          return;
          this.kpS.setVisibility(8);
          this.kpJ.setEnabled(true);
          this.kpJ.setBackgroundResource(R.g.aUF);
          this.kpJ.setText(R.l.dps);
          this.kpN.setVisibility(8);
          this.kgk.setProgress(0);
          this.kpM.setVisibility(4);
          this.kpJ.setVisibility(0);
        } while (this.kpr == 3);
        GMTrace.o(11409312186368L, 85006);
        return;
      case 5: 
        this.kpS.setVisibility(8);
        this.kpJ.setBackgroundResource(R.g.aUF);
        this.kpJ.setText(R.l.doD);
        this.kpJ.setEnabled(true);
      case 11: 
        this.kpS.setVisibility(0);
        this.kpJ.setVisibility(0);
        this.kpJ.setBackgroundResource(R.g.bch);
        this.kpJ.setText("");
        this.kpJ.setEnabled(false);
        this.kpN.setVisibility(8);
        this.kgk.setProgress(0);
        this.kpM.setVisibility(4);
        GMTrace.o(11409312186368L, 85006);
        return;
      case 10: 
      case 12: 
        this.kpS.setVisibility(8);
        this.kpJ.setVisibility(0);
        this.kpJ.setBackgroundResource(R.g.aUF);
        this.kpJ.setText(R.l.doP);
        this.kpJ.setEnabled(true);
        this.kpN.setVisibility(8);
        this.kgk.setProgress(0);
        this.kpM.setVisibility(4);
        GMTrace.o(11409312186368L, 85006);
        return;
      }
      asI();
    }
  }
  
  private void asK()
  {
    GMTrace.i(11409446404096L, 85007);
    if ((this.kqp) && ((this.kqo == null) || ((this.kqo.uqC & 0x1) != 1)) && ((this.knO == null) || (!com.tencent.mm.plugin.emoji.a.a.e.bU(this.knO.uhj, 1))) && (this.kqo != null) && (!TextUtils.isEmpty(this.kqo.uqB)))
    {
      this.kpJ.setText(this.kqo.uqB);
      this.kpJ.setTextColor(this.vKB.vKW.getResources().getColor(R.e.aNW));
      this.kpJ.setBackgroundDrawable(null);
      this.kpJ.setEnabled(false);
    }
    GMTrace.o(11409446404096L, 85007);
  }
  
  private void asL()
  {
    GMTrace.i(11409580621824L, 85008);
    com.tencent.mm.ui.base.h.a(this, R.l.doy, 0, R.l.dpg, R.l.doA, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(11389045309440L, 84855);
        if (com.tencent.mm.plugin.emoji.h.a.wB(EmojiStoreDetailUI.a(EmojiStoreDetailUI.this)))
        {
          w.d("MicroMsg.emoji.EmojiStoreDetailUI", "jacks stop tuzi downloading");
          com.tencent.mm.plugin.emoji.f.a.arq().ars();
          if (!TextUtils.isEmpty(EmojiStoreDetailUI.w(EmojiStoreDetailUI.this)))
          {
            com.tencent.mm.modelcdntran.g.Gk().jz(EmojiStoreDetailUI.w(EmojiStoreDetailUI.this));
            w.i("MicroMsg.emoji.EmojiStoreDetailUI", "[onClickClose] cancel RecvTask. CdnClientId:%s", new Object[] { EmojiStoreDetailUI.w(EmojiStoreDetailUI.this) });
          }
          if ((!com.tencent.mm.plugin.emoji.a.a.e.bU(EmojiStoreDetailUI.b(EmojiStoreDetailUI.this).uhj, 1)) && (!com.tencent.mm.plugin.emoji.a.a.e.mG(EmojiStoreDetailUI.b(EmojiStoreDetailUI.this).uhi))) {
            break label262;
          }
          EmojiStoreDetailUI.a(EmojiStoreDetailUI.this, 3);
        }
        for (;;)
        {
          com.tencent.mm.plugin.emoji.model.h.arn().f(EmojiStoreDetailUI.a(EmojiStoreDetailUI.this), EmojiStoreDetailUI.x(EmojiStoreDetailUI.this), 0, EmojiStoreDetailUI.w(EmojiStoreDetailUI.this));
          EmojiStoreDetailUI.i(EmojiStoreDetailUI.this).setVisibility(8);
          EmojiStoreDetailUI.l(EmojiStoreDetailUI.this).setProgress(0);
          EmojiStoreDetailUI.j(EmojiStoreDetailUI.this).setVisibility(4);
          EmojiStoreDetailUI.h(EmojiStoreDetailUI.this).setVisibility(0);
          EmojiStoreDetailUI.y(EmojiStoreDetailUI.this);
          EmojiStoreDetailUI.g(EmojiStoreDetailUI.this);
          paramAnonymousDialogInterface = new com.tencent.mm.plugin.emoji.f.q(EmojiStoreDetailUI.a(EmojiStoreDetailUI.this), 2);
          at.wS().a(paramAnonymousDialogInterface, 0);
          GMTrace.o(11389045309440L, 84855);
          return;
          at.wS().c(EmojiStoreDetailUI.v(EmojiStoreDetailUI.this));
          break;
          label262:
          EmojiStoreDetailUI.a(EmojiStoreDetailUI.this, -1);
        }
      }
    }, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(11373207617536L, 84737);
        GMTrace.o(11373207617536L, 84737);
      }
    });
    GMTrace.o(11409580621824L, 85008);
  }
  
  private void asM()
  {
    GMTrace.i(11409849057280L, 85010);
    if (com.tencent.mm.plugin.emoji.h.a.wB(this.klt))
    {
      com.tencent.mm.plugin.emoji.f.a.arq();
      com.tencent.mm.plugin.emoji.f.a.arr();
      GMTrace.o(11409849057280L, 85010);
      return;
    }
    this.kpx = new com.tencent.mm.plugin.emoji.f.g(this.klt, this.klv, this.klu);
    at.wS().a(this.kpx, 0);
    switch (this.knw)
    {
    }
    for (;;)
    {
      GMTrace.o(11409849057280L, 85010);
      return;
      com.tencent.mm.plugin.report.service.g.ork.i(11598, new Object[] { Integer.valueOf(1), this.klt });
      GMTrace.o(11409849057280L, 85010);
      return;
      com.tencent.mm.plugin.report.service.g.ork.i(11598, new Object[] { Integer.valueOf(3), this.klt });
      GMTrace.o(11409849057280L, 85010);
      return;
      com.tencent.mm.plugin.report.service.g.ork.i(11598, new Object[] { Integer.valueOf(2), this.klt });
    }
  }
  
  private void dR(boolean paramBoolean)
  {
    GMTrace.i(11408909533184L, 85003);
    Object localObject;
    String str;
    if (!bg.nm(this.knO.uhm)) {
      if (paramBoolean)
      {
        localObject = this.klt;
        str = this.knO.uhm;
        com.tencent.mm.br.a.getDensity(this.mContext);
        localObject = EmojiLogic.a((String)localObject, str, this.kqv);
      }
    }
    for (;;)
    {
      if ((localObject != null) && (this.kpF != null)) {
        this.kpF.cz(((EmojiInfo)localObject).bUU(), null);
      }
      if (com.tencent.mm.plugin.emoji.h.a.wB(this.klt)) {
        this.kpF.setImageResource(R.g.bbk);
      }
      GMTrace.o(11408909533184L, 85003);
      return;
      localObject = this.klt;
      str = this.knO.uhm;
      com.tencent.mm.br.a.getDensity(this.mContext);
      localObject = EmojiLogic.a((String)localObject, 4, str, true);
      continue;
      localObject = null;
    }
  }
  
  private void wl(String paramString)
  {
    GMTrace.i(11408238444544L, 84998);
    if (!TextUtils.isEmpty(paramString)) {}
    for (;;)
    {
      com.tencent.mm.ui.base.h.a(this, paramString, "", new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11467294244864L, 85438);
          GMTrace.o(11467294244864L, 85438);
        }
      });
      GMTrace.o(11408238444544L, 84998);
      return;
      paramString = getString(R.l.doj);
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(11406359396352L, 84984);
    if (!bg.nm(this.klu)) {
      sq(this.klu);
    }
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11399245856768L, 84931);
        EmojiStoreDetailUI.this.finish();
        GMTrace.o(11399245856768L, 84931);
        return true;
      }
    });
    this.jRR = com.tencent.mm.br.a.V(this.mContext, R.f.aRP);
    this.kqc = getResources().getDimensionPixelSize(R.f.aRO);
    this.kqc = com.tencent.mm.br.a.V(this.mContext, R.f.aRO);
    this.mNumColumns = 4;
    this.kpE = ((EmojiDetailScrollView)findViewById(R.h.bZQ));
    this.iTN = findViewById(R.h.empty);
    this.kpC = ((TextView)this.iTN.findViewById(R.h.bwy));
    this.kpD = findViewById(R.h.bwi);
    this.kpF = ((BannerEmojiView)findViewById(R.h.bvT));
    int i = this.kpF.getRight();
    int j = this.kpF.getLeft();
    int k = this.kpF.getPaddingRight();
    int m = this.kpF.getPaddingLeft();
    this.kpF.setMinimumHeight((int)((i - j - k - m) * 0.56F));
    this.kpG = ((TextView)findViewById(R.h.bwr));
    this.kpH = ((MMAutoSizeTextView)findViewById(R.h.bws));
    this.kpI = ((TextView)findViewById(R.h.bvJ));
    this.kpJ = ((TextView)findViewById(R.h.bwt));
    this.kpK = ((TextView)findViewById(R.h.bvM));
    this.kpQ = com.tencent.mm.br.a.ef(this.vKB.vKW);
    this.kpR = findViewById(R.h.bvE);
    this.kpL = ((EmojiDetailGridView)findViewById(R.h.bvQ));
    ProgressBar localProgressBar;
    if (com.tencent.mm.plugin.emoji.h.a.wB(this.klt))
    {
      this.kpz = new b();
      this.kpN = findViewById(R.h.bvZ);
      this.kgk = ((ProgressBar)findViewById(R.h.bvO));
      this.kpM = ((ImageView)findViewById(R.h.bvH));
      this.kpM.setOnClickListener(this);
      this.kpN.setVisibility(8);
      this.kpM.setVisibility(8);
      this.kgk.setProgress(0);
      this.kpL.setAdapter(this.kpz);
      this.kpL.setColumnWidth(this.kqc);
      this.kpL.setNumColumns(this.mNumColumns);
      this.kpL.setHorizontalSpacing(this.jRR);
      this.kpL.setVerticalSpacing(this.jRR);
      this.kpL.kpa = this.kpE;
      this.kpL.xzX = true;
      this.kpJ.setOnClickListener(this);
      this.kpO = ((TextView)findViewById(R.h.bwc));
      this.kpP = ((TextView)findViewById(R.h.bvI));
      this.kpO.setOnClickListener(this.kqr);
      this.kpP.setOnClickListener(this.kqs);
      this.kpS = ((ProgressBar)findViewById(R.h.bvP));
      localProgressBar = this.kpS;
      if (!this.kqg) {
        break label753;
      }
    }
    label753:
    for (i = 0;; i = 8)
    {
      localProgressBar.setVisibility(i);
      this.kqm = findViewById(R.h.bvW);
      this.kpW = findViewById(R.h.bvL);
      this.kpT = findViewById(R.h.btk);
      this.kpU = ((ImageView)findViewById(R.h.btp));
      this.kpV = ((TextView)findViewById(R.h.bty));
      this.kpX = findViewById(R.h.bwa);
      this.kpY = ((MMCopiableTextView)findViewById(R.h.bYF));
      this.kpZ = ((Button)findViewById(R.h.bYG));
      this.kqb = ((TextView)findViewById(R.h.bYK));
      this.kqa = ((DonorsAvatarView)findViewById(R.h.bYE));
      this.kpZ.setOnClickListener(this.kqt);
      this.kqb.setOnClickListener(this.kqu);
      GMTrace.o(11406359396352L, 84984);
      return;
      this.kpz = new a();
      break;
    }
  }
  
  protected final int Qf()
  {
    GMTrace.i(11406090960896L, 84982);
    GMTrace.o(11406090960896L, 84982);
    return 1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(11407567355904L, 84993);
    w.i("MicroMsg.emoji.EmojiStoreDetailUI", "[onSceneEnd] errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((this.kgz != null) && (this.kgz.isShowing())) {
      this.kgz.dismiss();
    }
    switch (paramk.getType())
    {
    }
    for (;;)
    {
      GMTrace.o(11407567355904L, 84993);
      return;
      w.i("MicroMsg.emoji.EmojiStoreDetailUI", "[onSceneEnd] MMFunc_GetEmotionDetail");
      paramString = (com.tencent.mm.plugin.emoji.f.l)paramk;
      if ((paramString != null) && (!bg.nm(paramString.klt)) && (paramString.klt.equalsIgnoreCase(this.klt)))
      {
        if (paramInt1 == 0)
        {
          if (paramInt2 == 0)
          {
            this.knO = paramString.arz();
            mL(1002);
            GMTrace.o(11407567355904L, 84993);
            return;
          }
          if (paramInt2 == 1)
          {
            asB();
            GMTrace.o(11407567355904L, 84993);
            return;
          }
          this.kpC.setText(R.l.doI);
          asC();
          GMTrace.o(11407567355904L, 84993);
          return;
        }
        if (paramInt2 == 5)
        {
          if ((paramString != null) && (paramString.arz() != null)) {
            this.knO.uhj = paramString.arz().uhj;
          }
          mL(1002);
          GMTrace.o(11407567355904L, 84993);
          return;
        }
        if (paramInt2 == 1)
        {
          asB();
          GMTrace.o(11407567355904L, 84993);
          return;
        }
        this.kpE.setVisibility(8);
        this.iTN.setVisibility(0);
        this.kpC.setText(R.l.doJ);
        asC();
        GMTrace.o(11407567355904L, 84993);
        return;
      }
      w.i("MicroMsg.emoji.EmojiStoreDetailUI", "no equal productid");
      GMTrace.o(11407567355904L, 84993);
      return;
      w.i("MicroMsg.emoji.EmojiStoreDetailUI", "[onSceneEnd] MMFunc_ExchangeEmotionPack");
      paramString = (com.tencent.mm.plugin.emoji.f.g)paramk;
      if ((paramString != null) && (!bg.nm(paramString.klt)) && (paramString.klt.equalsIgnoreCase(this.klt)))
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          this.kqf = paramString.gIp;
          this.kpv = 6;
          asJ();
          GMTrace.o(11407567355904L, 84993);
          return;
        }
        this.kpv = -1;
        asJ();
        paramString = this.klu;
        com.tencent.mm.ui.base.h.a(this, String.format(getString(R.l.doE), new Object[] { paramString }), "", new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(11372402311168L, 84731);
            EmojiStoreDetailUI.a(EmojiStoreDetailUI.this, new com.tencent.mm.plugin.emoji.f.g(EmojiStoreDetailUI.a(EmojiStoreDetailUI.this), EmojiStoreDetailUI.B(EmojiStoreDetailUI.this), EmojiStoreDetailUI.C(EmojiStoreDetailUI.this)));
            EmojiStoreDetailUI.D(EmojiStoreDetailUI.this);
            EmojiStoreDetailUI.a(EmojiStoreDetailUI.this, 6);
            EmojiStoreDetailUI.g(EmojiStoreDetailUI.this);
            GMTrace.o(11372402311168L, 84731);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(11393071841280L, 84885);
            GMTrace.o(11393071841280L, 84885);
          }
        });
        GMTrace.o(11407567355904L, 84993);
        return;
      }
      w.i("MicroMsg.emoji.EmojiStoreDetailUI", "no equal productid");
      GMTrace.o(11407567355904L, 84993);
      return;
      w.i("MicroMsg.emoji.EmojiStoreDetailUI", "[onSceneEnd] MMFunc_GetEmotionDesc");
      paramString = (com.tencent.mm.plugin.emoji.f.k)paramk;
      if ((paramString != null) && (!bg.nm(paramString.klj)) && (paramString.klj.equalsIgnoreCase(this.klt))) {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          this.kqo = ((zw)paramString.fUa.gtD.gtK);
          this.kqp = true;
          asK();
        }
      }
      for (;;)
      {
        this.kqp = true;
        asK();
        GMTrace.o(11407567355904L, 84993);
        return;
        this.kqo = null;
        break;
        w.i("MicroMsg.emoji.EmojiStoreDetailUI", "no equal productid");
      }
      w.i("MicroMsg.emoji.EmojiStoreDetailUI", "[onSceneEnd] MMFunc_MMGetEmotionReward");
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.kpA = ((o)paramk).arD();
        mL(1007);
      }
    }
  }
  
  public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    GMTrace.i(11408104226816L, 84997);
    mL(1001);
    GMTrace.o(11408104226816L, 84997);
  }
  
  public final void asH()
  {
    GMTrace.i(11409043750912L, 85004);
    if ((com.tencent.mm.plugin.emoji.a.a.e.bU(this.knO.uhj, 64)) && (com.tencent.mm.plugin.emoji.e.n.aqQ()))
    {
      if (this.kpA != null)
      {
        this.kpX.setVisibility(0);
        this.kpZ.setText(R.l.doU);
        this.kpY.setText(this.kpA.uqV.uhE);
        this.kpY.setLongClickable(false);
        if (this.kpA.uqE > 0)
        {
          this.kqb.setVisibility(0);
          String str1 = String.valueOf(this.kpA.uqE);
          String str2 = String.format(getString(R.l.doW), new Object[] { Integer.valueOf(this.kpA.uqE) });
          SpannableString localSpannableString = new SpannableString(str2);
          int i = str2.indexOf(str1);
          if (i >= 0) {
            localSpannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.e.aNx)), i, str1.length() + i, 33);
          }
          this.kqb.setText(localSpannableString);
        }
        while ((this.kpA.uqF != null) && (this.kpA.uqF.size() > 0))
        {
          this.kqa.setVisibility(0);
          this.kqa.b(this.klt, this.kpA.uqF);
          GMTrace.o(11409043750912L, 85004);
          return;
          this.kqb.setVisibility(8);
        }
        this.kqa.setVisibility(8);
        GMTrace.o(11409043750912L, 85004);
        return;
      }
      this.kpX.setVisibility(8);
      asE();
      GMTrace.o(11409043750912L, 85004);
      return;
    }
    this.kpX.setVisibility(8);
    GMTrace.o(11409043750912L, 85004);
  }
  
  public final void g(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    GMTrace.i(11409714839552L, 85009);
    w.d("MicroMsg.emoji.EmojiStoreDetailUI", "productId:%s,status:%d, progress:%d, cdnClientID:%s, ", new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString2 });
    if ((bg.nm(paramString1)) || (!paramString1.equals(this.klt)))
    {
      GMTrace.o(11409714839552L, 85009);
      return;
    }
    if (!TextUtils.isEmpty(paramString2)) {
      this.kqf = paramString2;
    }
    if (paramInt1 == -1)
    {
      if (this.kpv != -1)
      {
        this.kpv = -1;
        mL(1003);
        GMTrace.o(11409714839552L, 85009);
      }
    }
    else
    {
      if (paramInt1 == 7)
      {
        this.kpv = 7;
        mL(1003);
        GMTrace.o(11409714839552L, 85009);
        return;
      }
      if (paramInt1 == 6)
      {
        if ((!TextUtils.isEmpty(paramString1)) && (paramString1.equals(this.klt)))
        {
          this.kpv = 6;
          this.rr = paramInt2;
          mL(1004);
          GMTrace.o(11409714839552L, 85009);
        }
      }
      else {
        w.w("MicroMsg.emoji.EmojiStoreDetailUI", "[onExchange] do nothing.");
      }
    }
    GMTrace.o(11409714839552L, 85009);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11406225178624L, 84983);
    int i = R.i.bwi;
    GMTrace.o(11406225178624L, 84983);
    return i;
  }
  
  public final void mL(int paramInt)
  {
    GMTrace.i(11409983275008L, 85011);
    if (this.mHandler != null) {
      this.mHandler.sendEmptyMessage(paramInt);
    }
    GMTrace.o(11409983275008L, 85011);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(11407970009088L, 84996);
    w.d("MicroMsg.emoji.EmojiStoreDetailUI", "onActivityResult. requestCode:[%d] resultCode:[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    String str1;
    Object localObject;
    if (paramInt1 == 2001)
    {
      str1 = "";
      paramInt1 = 0;
      if (paramIntent != null)
      {
        paramInt1 = paramIntent.getIntExtra("key_err_code", 0);
        w.w("MicroMsg.emoji.EmojiStoreDetailUI", "errCode:" + paramInt1);
        str1 = paramIntent.getStringExtra("key_err_msg");
        w.w("MicroMsg.emoji.EmojiStoreDetailUI", "errMsg:" + str1);
      }
      this.kql = false;
      if (paramInt2 == -1)
      {
        if ((paramIntent != null) && (paramInt1 == 0))
        {
          localObject = paramIntent.getStringArrayListExtra("key_response_product_ids");
          paramIntent = paramIntent.getStringArrayListExtra("key_response_series_ids");
          if ((localObject != null) && (((ArrayList)localObject).contains(this.klt)))
          {
            paramInt1 = 0;
            while (paramInt1 < ((ArrayList)localObject).size())
            {
              if (this.klt.equals(((ArrayList)localObject).get(paramInt1))) {
                this.klv = ((String)paramIntent.get(paramInt1));
              }
              paramInt1 += 1;
            }
            this.knO.uhj = 1;
            asM();
            this.kpv = 6;
            com.tencent.mm.ui.base.h.bm(this, str1);
            if (com.tencent.mm.y.q.zQ())
            {
              com.tencent.mm.plugin.report.service.g.ork.a(166L, 4L, 1L, false);
              GMTrace.o(11407970009088L, 84996);
              return;
            }
            com.tencent.mm.plugin.report.service.g.ork.a(166L, 0L, 1L, false);
            GMTrace.o(11407970009088L, 84996);
            return;
          }
          this.kpv = -1;
          asJ();
          wl(str1);
          GMTrace.o(11407970009088L, 84996);
          return;
        }
        if ((paramIntent != null) && (paramInt1 == 103))
        {
          asM();
          this.kpv = 6;
          this.kpz.notifyDataSetChanged();
          if (com.tencent.mm.y.q.zQ())
          {
            com.tencent.mm.plugin.report.service.g.ork.a(166L, 7L, 1L, false);
            GMTrace.o(11407970009088L, 84996);
            return;
          }
          com.tencent.mm.plugin.report.service.g.ork.a(166L, 3L, 1L, false);
          GMTrace.o(11407970009088L, 84996);
          return;
        }
        if ((paramIntent != null) && (paramInt1 == 100000000))
        {
          this.kpv = -1;
          asJ();
          if (com.tencent.mm.y.q.zQ())
          {
            com.tencent.mm.plugin.report.service.g.ork.a(166L, 6L, 1L, false);
            GMTrace.o(11407970009088L, 84996);
            return;
          }
          com.tencent.mm.plugin.report.service.g.ork.a(166L, 2L, 1L, false);
          GMTrace.o(11407970009088L, 84996);
          return;
        }
        this.kpv = -1;
        asJ();
        wl(str1);
        if (com.tencent.mm.y.q.zQ())
        {
          com.tencent.mm.plugin.report.service.g.ork.a(166L, 5L, 1L, false);
          GMTrace.o(11407970009088L, 84996);
          return;
        }
        com.tencent.mm.plugin.report.service.g.ork.a(166L, 1L, 1L, false);
        GMTrace.o(11407970009088L, 84996);
        return;
      }
      this.kpv = -1;
      asJ();
      if (com.tencent.mm.y.q.zQ())
      {
        com.tencent.mm.plugin.report.service.g.ork.a(166L, 6L, 1L, false);
        GMTrace.o(11407970009088L, 84996);
        return;
      }
      com.tencent.mm.plugin.report.service.g.ork.a(166L, 2L, 1L, false);
      GMTrace.o(11407970009088L, 84996);
      return;
    }
    if (paramInt1 == 2002)
    {
      if (paramInt2 == -1)
      {
        paramIntent = paramIntent.getStringExtra("Select_Conv_User");
        if (!bg.nm(paramIntent))
        {
          w.d("MicroMsg.emoji.EmojiStoreDetailUI", ".." + paramIntent);
          str1 = this.klt;
          localObject = this.knO.uhe;
          String str2 = this.knO.uhf;
          String str3 = this.knO.lRV;
          String str4 = this.knO.uhx;
          paramInt1 = this.knO.uhj;
          String str5 = getResources().getString(R.l.cSF) + (String)localObject;
          e.a locala = new e.a(this);
          locala.bA(paramIntent).Pi(str5).zf(R.l.cUs);
          locala.Pj(str3).bLF();
          locala.Pl(getString(R.l.dit)).a(new k.1(paramIntent, str1, (String)localObject, str2, str3, str4, paramInt1, this)).oaD.show();
        }
        GMTrace.o(11407970009088L, 84996);
      }
    }
    else if ((paramInt1 == this.kkF.iAR) && (paramInt2 == -1))
    {
      w.d("MicroMsg.emoji.EmojiStoreDetailUI", "jacks use emoji to : %s", new Object[] { paramIntent.getStringExtra("Select_Conv_User") });
      com.tencent.mm.plugin.emoji.h.b.a(paramIntent, this.klt, this);
      com.tencent.mm.plugin.report.service.g.ork.i(12069, new Object[] { Integer.valueOf(3), this.klt });
    }
    GMTrace.o(11407970009088L, 84996);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(11407433138176L, 84992);
    int i = paramView.getId();
    if (i == R.h.bwt)
    {
      if (this.kpv == 7)
      {
        paramView = getIntent().getStringExtra("to_talker_name");
        if ((!bg.nm(paramView)) && (this.kpu)) {
          com.tencent.mm.plugin.emoji.h.b.a(paramView, this.klt, this);
        }
        for (;;)
        {
          w.d("MicroMsg.emoji.EmojiStoreDetailUI", "jacks kv stat update click use emoji");
          com.tencent.mm.plugin.report.service.g.ork.A(11076, "0, ");
          GMTrace.o(11407433138176L, 84992);
          return;
          this.kkF.m(this);
          com.tencent.mm.plugin.report.service.g.ork.i(12069, new Object[] { Integer.valueOf(2), this.klt });
        }
      }
      switch (this.kpv)
      {
      case 1: 
      case 2: 
      case 6: 
      case 7: 
      case 8: 
      case 9: 
      default: 
        w.e("MicroMsg.emoji.EmojiStoreDetailUI", "can not product status.%d", new Object[] { Integer.valueOf(this.kpv) });
      case 4: 
        do
        {
          GMTrace.o(11407433138176L, 84992);
          return;
        } while (this.kql);
        w.d("MicroMsg.emoji.EmojiStoreDetailUI", "mProductId:%s, mData.PackPrice:%s,PriceType:%s", new Object[] { this.klt, this.knO.uhh, this.knO.uhq });
        paramView = new Intent();
        paramView.putExtra("key_product_id", this.klt);
        if (this.kqg)
        {
          paramView.putExtra("key_currency_type", "");
          paramView.putExtra("key_price", this.kqj);
        }
        for (;;)
        {
          com.tencent.mm.bj.d.b(this, "wallet_index", ".ui.WalletIapUI", paramView, 2001);
          com.tencent.mm.plugin.report.service.g.ork.i(12066, new Object[] { Integer.valueOf(2), Integer.valueOf(this.kqe), "", this.klt, Long.valueOf(this.kkB), this.kkC });
          this.kql = true;
          GMTrace.o(11407433138176L, 84992);
          return;
          paramView.putExtra("key_currency_type", this.knO.uhq);
          paramView.putExtra("key_price", this.knO.uhp);
        }
      case 0: 
      case 3: 
        asM();
        this.kpv = 6;
        asJ();
        com.tencent.mm.plugin.report.service.g.ork.i(12066, new Object[] { Integer.valueOf(1), Integer.valueOf(this.kqe), "", this.klt, Long.valueOf(this.kkB), this.kkC });
        GMTrace.o(11407433138176L, 84992);
        return;
      case 5: 
        this.kpv = 3;
        asJ();
        GMTrace.o(11407433138176L, 84992);
        return;
      case 10: 
      case 12: 
        switch (this.kqi)
        {
        default: 
          paramView = getString(R.l.dpI);
        }
        for (;;)
        {
          com.tencent.mm.ui.base.h.b(this, paramView, null, true);
          GMTrace.o(11407433138176L, 84992);
          return;
          paramView = getString(R.l.dob);
          continue;
          paramView = getString(R.l.dog);
          continue;
          paramView = getString(R.l.dpE);
        }
      case 11: 
        w.i("MicroMsg.emoji.EmojiStoreDetailUI", "can not be clicked.");
        GMTrace.o(11407433138176L, 84992);
        return;
      }
      w.i("MicroMsg.emoji.EmojiStoreDetailUI", "can not be clicked.");
      GMTrace.o(11407433138176L, 84992);
      return;
    }
    if (i == R.h.bvO)
    {
      asL();
      GMTrace.o(11407433138176L, 84992);
      return;
    }
    if (i == R.h.bvH)
    {
      asL();
      GMTrace.o(11407433138176L, 84992);
      return;
    }
    w.w("MicroMsg.emoji.EmojiStoreDetailUI", "click view is unknow.");
    GMTrace.o(11407433138176L, 84992);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11405956743168L, 84981);
    super.onCreate(paramBundle);
    this.kqg = com.tencent.mm.y.q.zQ();
    this.kkF = new com.tencent.mm.plugin.emoji.h.b(2003);
    paramBundle = getIntent();
    this.klt = getIntent().getStringExtra("extra_id");
    this.knw = getIntent().getIntExtra("preceding_scence", -1);
    this.klu = getIntent().getStringExtra("extra_name");
    this.kpr = getIntent().getIntExtra("call_by", -1);
    Object localObject = getIntent().getStringExtra("sns_object_data");
    if (!TextUtils.isEmpty((CharSequence)localObject))
    {
      this.klt = EmojiLogic.vV((String)localObject);
      this.knw = 0;
      this.knw = 10;
      com.tencent.mm.plugin.report.service.g.ork.i(10993, new Object[] { Integer.valueOf(3), this.klt });
    }
    if (TextUtils.isEmpty(this.klt))
    {
      w.d("MicroMsg.emoji.EmojiStoreDetailUI", "[hadleIntent] product id is null.");
      finish();
    }
    if (this.knw == -1)
    {
      w.e("MicroMsg.emoji.EmojiStoreDetailUI", "[hadleIntent] emoticon preceding scence no set!");
      finish();
    }
    this.kqn = paramBundle.getBooleanExtra("check_clickflag", true);
    this.kqf = paramBundle.getStringExtra("cdn_client_id");
    this.kqe = paramBundle.getIntExtra("download_entrance_scene", 0);
    this.kkB = paramBundle.getLongExtra("searchID", 0L);
    this.kkC = bg.aq(paramBundle.getStringExtra("docID"), "");
    localObject = paramBundle.getStringExtra("extra_copyright");
    if (!TextUtils.isEmpty((CharSequence)localObject)) {
      this.knO.uho = ((String)localObject);
    }
    localObject = paramBundle.getStringExtra("extra_coverurl");
    if (!TextUtils.isEmpty((CharSequence)localObject)) {
      this.knO.uhm = ((String)localObject);
    }
    localObject = paramBundle.getStringExtra("extra_description");
    if (!TextUtils.isEmpty((CharSequence)localObject)) {
      this.knO.uhf = ((String)localObject);
    }
    localObject = paramBundle.getStringExtra("extra_price");
    if (!TextUtils.isEmpty((CharSequence)localObject)) {
      this.knO.uhh = ((String)localObject);
    }
    int i = paramBundle.getIntExtra("extra_type", -1);
    if (i != -1) {
      this.knO.uhi = i;
    }
    i = paramBundle.getIntExtra("extra_flag", -1);
    if (i != -1) {
      this.knO.uhj = i;
    }
    localObject = paramBundle.getStringExtra("extra_price_type");
    if (!TextUtils.isEmpty((CharSequence)localObject)) {
      this.knO.uhq = ((String)localObject);
    }
    localObject = paramBundle.getStringExtra("extra_price_num");
    if (!TextUtils.isEmpty((CharSequence)localObject)) {
      this.knO.uhp = ((String)localObject);
    }
    if (this.kqg)
    {
      this.kqj = paramBundle.getStringExtra("google_price");
      if (TextUtils.isEmpty(this.kqj))
      {
        this.kqh = 11;
        com.tencent.mm.pluginsdk.model.h.a(this, this.kqk, this.kqy);
      }
    }
    this.kpt = paramBundle.getBooleanExtra("reward_tip", false);
    this.kqk[0] = this.klt;
    this.knO.tRS = this.klt;
    this.knO.uhe = this.klu;
    this.knO.uhw = this.kps;
    this.knO.jia = -1;
    this.mContext = this;
    MP();
    if (!com.tencent.mm.plugin.emoji.h.a.wB(this.klt))
    {
      paramBundle = com.tencent.mm.plugin.emoji.model.h.arl().kjC.UP(this.klt);
      if ((paramBundle != null) && (paramBundle.field_content != null)) {
        localObject = new zy();
      }
    }
    for (;;)
    {
      try
      {
        ((zy)localObject).aD(paramBundle.field_content);
        this.knO = ((zy)localObject).uqD;
        this.knP = paramBundle.field_lan;
        if (this.knO == null)
        {
          this.kpw = new com.tencent.mm.plugin.emoji.f.l(this.klt, this.knw);
          at.wS().a(this.kpw, 0);
          if ((this.kpr == -1) || (this.kpr == 3))
          {
            this.kpD.setVisibility(8);
            this.iTN.setVisibility(8);
            getString(R.l.cUG);
            this.kgz = com.tencent.mm.ui.base.h.a(this, getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymousDialogInterface)
              {
                GMTrace.i(11404883001344L, 84973);
                at.wS().c(EmojiStoreDetailUI.r(EmojiStoreDetailUI.this));
                EmojiStoreDetailUI.s(EmojiStoreDetailUI.this).setText(R.l.doJ);
                EmojiStoreDetailUI.t(EmojiStoreDetailUI.this);
                GMTrace.o(11404883001344L, 84973);
              }
            });
          }
          asD();
          if (!this.kqn) {
            continue;
          }
          paramBundle = new com.tencent.mm.plugin.emoji.f.k(this.klt);
          at.wS().a(paramBundle, 0);
          asG();
          com.tencent.mm.plugin.emoji.model.h.arl().kjz.c(this);
          com.tencent.mm.sdk.b.a.vgX.b(this.knA);
          at.wS().a(423, this);
          at.wS().a(822, this);
          i = getIntent().getIntExtra("extra_status", -1);
          int j = getIntent().getIntExtra("extra_progress", 0);
          g(this.klt, i, j, this.kqf);
          this.kqq = true;
          com.tencent.mm.plugin.report.service.g.ork.i(12740, new Object[] { Integer.valueOf(1), "", this.klt, "", Integer.valueOf(this.kqe) });
          if ((this.kpt) && (this.kpE != null)) {
            this.mHandler.postDelayed(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(11403809259520L, 84965);
                EmojiStoreDetailUI.m(EmojiStoreDetailUI.this).fullScroll(130);
                GMTrace.o(11403809259520L, 84965);
              }
            }, 0L);
          }
          GMTrace.o(11405956743168L, 84981);
        }
      }
      catch (IOException paramBundle)
      {
        w.e("MicroMsg.emoji.EmojiStoreDetailUI", "exception:%s", new Object[] { bg.f(paramBundle) });
        continue;
        if ((!bg.nm(this.knP)) && (this.knP.equalsIgnoreCase(v.eq(this.mContext))))
        {
          this.kpw = new com.tencent.mm.plugin.emoji.f.l(this.klt, this.knw, this.knO.jia);
          continue;
        }
        this.kpw = new com.tencent.mm.plugin.emoji.f.l(this.klt, this.knw);
        continue;
        this.kqp = true;
        this.kqo = EmojiLogic.ara();
        continue;
      }
      paramBundle = this.vKB.vKW;
      localObject = new rd();
      ((rd)localObject).tRS = EmojiGroupInfo.vCl;
      ((rd)localObject).uhe = paramBundle.getString(R.l.dpp);
      ((rd)localObject).uhf = paramBundle.getString(R.l.dpn);
      ((rd)localObject).uhg = paramBundle.getString(R.l.dpl);
      ((rd)localObject).uhh = "";
      ((rd)localObject).uhi = 0;
      ((rd)localObject).uhj = 1;
      ((rd)localObject).uhm = "";
      ((rd)localObject).uhn = 0;
      ((rd)localObject).uho = paramBundle.getString(R.l.dpm);
      ((rd)localObject).uhr = "";
      ((rd)localObject).uhp = "";
      ((rd)localObject).uhq = "";
      ((rd)localObject).uhv = paramBundle.getString(R.l.dpo);
      this.knO = ((rd)localObject);
      this.kqp = true;
      this.kqo = EmojiLogic.ara();
      asF();
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11407030484992L, 84989);
    super.onDestroy();
    com.tencent.mm.plugin.emoji.model.h.arl().kjz.j(this);
    com.tencent.mm.sdk.b.a.vgX.c(this.knA);
    at.wS().b(423, this);
    at.wS().b(822, this);
    if (this.kpL != null) {
      this.kpL.release();
    }
    GMTrace.o(11407030484992L, 84989);
  }
  
  protected void onPause()
  {
    GMTrace.i(11406762049536L, 84987);
    super.onPause();
    at.wS().b(412, this);
    at.wS().b(521, this);
    GMTrace.o(11406762049536L, 84987);
  }
  
  protected void onRestoreInstanceState(Bundle paramBundle)
  {
    GMTrace.i(11407298920448L, 84991);
    this.kpv = paramBundle.getInt("status");
    this.rr = paramBundle.getInt("progress");
    GMTrace.o(11407298920448L, 84991);
  }
  
  protected void onResume()
  {
    GMTrace.i(11406627831808L, 84986);
    super.onResume();
    at.wS().a(412, this);
    at.wS().a(521, this);
    this.kql = false;
    if (!this.kqq)
    {
      asD();
      mL(1007);
    }
    asE();
    this.kqq = false;
    mL(1001);
    GMTrace.o(11406627831808L, 84986);
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    GMTrace.i(11407164702720L, 84990);
    paramBundle.putInt("status", this.kpv);
    paramBundle.putInt("progress", this.rr);
    GMTrace.o(11407164702720L, 84990);
  }
  
  public void onStart()
  {
    GMTrace.i(11406493614080L, 84985);
    super.onStart();
    GMTrace.o(11406493614080L, 84985);
  }
  
  protected void onStop()
  {
    GMTrace.i(11406896267264L, 84988);
    super.onStop();
    GMTrace.o(11406896267264L, 84988);
  }
  
  class a
    extends BaseAdapter
  {
    public a()
    {
      GMTrace.i(11373341835264L, 84738);
      GMTrace.o(11373341835264L, 84738);
    }
    
    private void mM(int paramInt)
    {
      GMTrace.i(11373744488448L, 84741);
      int i = 0;
      while (i < 4)
      {
        int j = new int[] { paramInt - 1, paramInt + 1, paramInt - 4, paramInt + 4 }[i];
        if ((EmojiStoreDetailUI.b(EmojiStoreDetailUI.this) != null) && (j >= 0) && (j < EmojiStoreDetailUI.b(EmojiStoreDetailUI.this).uht))
        {
          at.AR();
          if (!com.tencent.mm.a.e.aZ(EmojiLogic.F(com.tencent.mm.y.c.zb(), EmojiStoreDetailUI.a(EmojiStoreDetailUI.this), ((asa)EmojiStoreDetailUI.b(EmojiStoreDetailUI.this).uhu.get(j)).uHY))) {
            com.tencent.mm.ao.n.Jd().a(((asa)EmojiStoreDetailUI.b(EmojiStoreDetailUI.this).uhu.get(j)).uHY, null, f.b(EmojiStoreDetailUI.a(EmojiStoreDetailUI.this), ((asa)EmojiStoreDetailUI.b(EmojiStoreDetailUI.this).uhu.get(j)).uHY, new Object[] { Integer.valueOf(j) }), EmojiStoreDetailUI.z(EmojiStoreDetailUI.this), EmojiStoreDetailUI.A(EmojiStoreDetailUI.this), null, null, null, null);
          }
        }
        i += 1;
      }
      GMTrace.o(11373744488448L, 84741);
    }
    
    public int getCount()
    {
      GMTrace.i(11373476052992L, 84739);
      if (EmojiStoreDetailUI.b(EmojiStoreDetailUI.this) == null)
      {
        GMTrace.o(11373476052992L, 84739);
        return 0;
      }
      int i = EmojiStoreDetailUI.b(EmojiStoreDetailUI.this).uhk;
      GMTrace.o(11373476052992L, 84739);
      return i;
    }
    
    public Object getItem(int paramInt)
    {
      GMTrace.i(11373610270720L, 84740);
      if ((EmojiStoreDetailUI.b(EmojiStoreDetailUI.this) == null) || (EmojiStoreDetailUI.b(EmojiStoreDetailUI.this).uhu == null) || (EmojiStoreDetailUI.b(EmojiStoreDetailUI.this).uhu.size() <= 0) || (EmojiStoreDetailUI.b(EmojiStoreDetailUI.this).uhu.get(paramInt) == null) || (((asa)EmojiStoreDetailUI.b(EmojiStoreDetailUI.this).uhu.get(paramInt)).uHY == null))
      {
        GMTrace.o(11373610270720L, 84740);
        return null;
      }
      w.d("MicroMsg.emoji.EmojiStoreDetailUI", "jacks get preview : %d", new Object[] { Integer.valueOf(paramInt) });
      Object localObject = EmojiStoreDetailUI.a(EmojiStoreDetailUI.this);
      String str = ((asa)EmojiStoreDetailUI.b(EmojiStoreDetailUI.this).uhu.get(paramInt)).uHY;
      com.tencent.mm.br.a.getDensity(EmojiStoreDetailUI.p(EmojiStoreDetailUI.this));
      localObject = EmojiLogic.a((String)localObject, 8, str, false);
      if (localObject == null)
      {
        w.d("MicroMsg.emoji.EmojiStoreDetailUI", "detail preview emoji is null.");
        com.tencent.mm.ao.n.Jd().a(((asa)EmojiStoreDetailUI.b(EmojiStoreDetailUI.this).uhu.get(paramInt)).uHY, null, f.b(EmojiStoreDetailUI.a(EmojiStoreDetailUI.this), ((asa)EmojiStoreDetailUI.b(EmojiStoreDetailUI.this).uhu.get(paramInt)).uHY, new Object[] { Integer.valueOf(paramInt) }), EmojiStoreDetailUI.z(EmojiStoreDetailUI.this), EmojiStoreDetailUI.A(EmojiStoreDetailUI.this), null, null, null, null);
      }
      for (;;)
      {
        mM(paramInt);
        GMTrace.o(11373610270720L, 84740);
        return localObject;
        com.tencent.mm.plugin.report.service.g.ork.A(10930, EmojiStoreDetailUI.a(EmojiStoreDetailUI.this) + ",0");
        if (com.tencent.mm.plugin.emoji.e.e.aqw().isEnable()) {
          ((EmojiInfo)localObject).field_reserved4 = EmojiInfo.vCJ;
        }
      }
    }
    
    public long getItemId(int paramInt)
    {
      GMTrace.i(11373878706176L, 84742);
      long l = paramInt;
      GMTrace.o(11373878706176L, 84742);
      return l;
    }
    
    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(11374012923904L, 84743);
      if ((paramView == null) || (paramView.getTag() == null))
      {
        paramView = LayoutInflater.from(EmojiStoreDetailUI.p(EmojiStoreDetailUI.this)).inflate(R.i.cuG, null);
        paramViewGroup = new EmojiStoreDetailUI.c(EmojiStoreDetailUI.this, paramView);
        paramView.setTag(paramViewGroup);
        if (!EmojiStoreDetailUI.q(EmojiStoreDetailUI.this).xAa) {
          break label163;
        }
        paramViewGroup.kqC.setBackgroundResource(R.g.baz);
      }
      for (;;)
      {
        String str = "";
        if (EmojiStoreDetailUI.b(EmojiStoreDetailUI.this).uhl != null) {
          str = com.tencent.mm.platformtools.n.a((azq)EmojiStoreDetailUI.b(EmojiStoreDetailUI.this).uhl.get(paramInt));
        }
        com.tencent.mm.ao.n.Jd().a(str, paramViewGroup.kqC, f.bQ(EmojiStoreDetailUI.a(EmojiStoreDetailUI.this), str));
        GMTrace.o(11374012923904L, 84743);
        return paramView;
        paramViewGroup = (EmojiStoreDetailUI.c)paramView.getTag();
        break;
        label163:
        paramViewGroup.kqC.setBackgroundDrawable(null);
      }
    }
  }
  
  final class b
    extends EmojiStoreDetailUI.a
  {
    private ArrayList<EmojiInfo> kqB;
    
    public b()
    {
      super();
      GMTrace.i(11367436255232L, 84694);
      this.kqB = new ArrayList();
      this.kqB = ((ArrayList)com.tencent.mm.plugin.emoji.model.h.arl().kjy.vR(com.tencent.mm.plugin.emoji.h.a.ati()));
      GMTrace.o(11367436255232L, 84694);
    }
    
    private EmojiInfo mK(int paramInt)
    {
      GMTrace.i(11367704690688L, 84696);
      if (this.kqB == null)
      {
        GMTrace.o(11367704690688L, 84696);
        return null;
      }
      EmojiInfo localEmojiInfo = (EmojiInfo)this.kqB.get(paramInt);
      GMTrace.o(11367704690688L, 84696);
      return localEmojiInfo;
    }
    
    public final int getCount()
    {
      GMTrace.i(11367570472960L, 84695);
      if (this.kqB == null)
      {
        GMTrace.o(11367570472960L, 84695);
        return 0;
      }
      int i = this.kqB.size();
      GMTrace.o(11367570472960L, 84695);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(11367838908416L, 84697);
      long l = paramInt;
      GMTrace.o(11367838908416L, 84697);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(11367973126144L, 84698);
      if ((paramView == null) || (paramView.getTag() == null))
      {
        paramView = LayoutInflater.from(EmojiStoreDetailUI.p(EmojiStoreDetailUI.this)).inflate(R.i.cuG, null);
        paramViewGroup = new EmojiStoreDetailUI.c(EmojiStoreDetailUI.this, paramView);
        paramView.setTag(paramViewGroup);
        paramViewGroup.kqC.setBackgroundResource(R.g.baz);
        localObject = mK(paramInt);
        if (!bg.nm(((EmojiInfo)localObject).rc())) {
          break label137;
        }
      }
      label137:
      for (Object localObject = ((EmojiInfo)localObject).getName();; localObject = ((EmojiInfo)localObject).rc())
      {
        localObject = localObject.split("\\.")[0];
        com.tencent.mm.ao.n.Jd().a((String)localObject, paramViewGroup.kqC, f.aqy());
        GMTrace.o(11367973126144L, 84698);
        return paramView;
        paramViewGroup = (EmojiStoreDetailUI.c)paramView.getTag();
        break;
      }
    }
  }
  
  final class c
  {
    SquareImageView kqC;
    
    public c(View paramView)
    {
      GMTrace.i(11427700015104L, 85143);
      this.kqC = ((SquareImageView)paramView.findViewById(R.h.btE));
      this.kqC.setScaleType(ImageView.ScaleType.FIT_CENTER);
      GMTrace.o(11427700015104L, 85143);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\EmojiStoreDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.a.o;
import com.tencent.mm.g.a.cs;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.emoji.e.k.2;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.model.g.a;
import com.tencent.mm.plugin.emoji.model.g.b;
import com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI;
import com.tencent.mm.plugin.gif.MMAnimateView;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.e.a;
import com.tencent.mm.pluginsdk.ui.emoji.BannerEmojiView;
import com.tencent.mm.protocal.c.acl;
import com.tencent.mm.protocal.c.ato;
import com.tencent.mm.protocal.c.qp;
import com.tencent.mm.protocal.c.rh;
import com.tencent.mm.protocal.c.zo;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.MMPullDownView.c;
import com.tencent.mm.ui.base.MMPullDownView.e;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.v;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.ak.b.a;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EmojiStoreV2DesignerUI
  extends MMActivity
  implements AbsListView.OnScrollListener, AdapterView.OnItemClickListener, com.tencent.mm.ad.e, g.a, g.b, MMPullDownView.c, MMPullDownView.e
{
  private ListView Ev;
  private View Ks;
  private int gRb;
  private long kkB;
  private String kkC;
  private String kkG;
  private String klF;
  private com.tencent.mm.sdk.b.c knA;
  private com.tencent.mm.plugin.emoji.f.g knB;
  com.tencent.mm.plugin.emoji.a.f knI;
  private int kni;
  private boolean knj;
  private byte[] knl;
  protected final int knp;
  private final int knq;
  private final int knr;
  private final String kns;
  private final String knt;
  private final String knu;
  private com.tencent.mm.plugin.emoji.model.e knx;
  private com.tencent.mm.plugin.emoji.model.g kny;
  private acl ksA;
  private com.tencent.mm.plugin.emoji.f.i ksB;
  private r ksC;
  private ak.b.a ksD;
  private final int ksE;
  private final int ksF;
  private final int ksG;
  private com.tencent.mm.plugin.emoji.f.p ksH;
  private int ksb;
  private String ksc;
  private String ksd;
  private x kse;
  private View ksf;
  private BannerEmojiView ksg;
  private TextView ksh;
  private TextView ksi;
  private View ksj;
  private View ksk;
  private TextView ksl;
  private ImageView ksm;
  private TextView ksn;
  private TextView kso;
  View ksp;
  private List<qp> ksq;
  private View ksr;
  PreViewListGridView kss;
  private d kst;
  View ksu;
  View ksv;
  View ksw;
  TextView ksx;
  View ksy;
  private MMPullDownView ksz;
  private ae mHandler;
  
  public EmojiStoreV2DesignerUI()
  {
    GMTrace.i(11489842823168L, 85606);
    this.ksq = new ArrayList();
    this.kni = -1;
    this.knp = 131074;
    this.knq = 131075;
    this.knr = 131076;
    this.kns = "product_id";
    this.knt = "progress";
    this.knu = "status";
    this.knA = new com.tencent.mm.sdk.b.c() {};
    this.ksD = new ak.b.a()
    {
      public final void r(String paramAnonymousString, boolean paramAnonymousBoolean)
      {
        GMTrace.i(11473199824896L, 85482);
        w.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "getContactCallBack username:%s,succ:%b", new Object[] { paramAnonymousString, Boolean.valueOf(paramAnonymousBoolean) });
        if (paramAnonymousBoolean)
        {
          EmojiStoreV2DesignerUI localEmojiStoreV2DesignerUI = EmojiStoreV2DesignerUI.this;
          at.AR();
          EmojiStoreV2DesignerUI.a(localEmojiStoreV2DesignerUI, com.tencent.mm.y.c.yK().TE(paramAnonymousString));
          EmojiStoreV2DesignerUI.a(EmojiStoreV2DesignerUI.this);
        }
        GMTrace.o(11473199824896L, 85482);
      }
    };
    this.ksE = 10001;
    this.ksF = 10002;
    this.ksG = 10003;
    this.mHandler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(11505948950528L, 85726);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(11505948950528L, 85726);
          return;
          EmojiStoreV2DesignerUI.b(EmojiStoreV2DesignerUI.this);
          GMTrace.o(11505948950528L, 85726);
          return;
          EmojiStoreV2DesignerUI.this.asY();
          GMTrace.o(11505948950528L, 85726);
          return;
          EmojiStoreV2DesignerUI.c(EmojiStoreV2DesignerUI.this);
          GMTrace.o(11505948950528L, 85726);
          return;
          if ((EmojiStoreV2DesignerUI.d(EmojiStoreV2DesignerUI.this) == null) || (paramAnonymousMessage.getData() == null))
          {
            GMTrace.o(11505948950528L, 85726);
            return;
          }
          String str = paramAnonymousMessage.getData().getString("product_id");
          if (str == null)
          {
            GMTrace.o(11505948950528L, 85726);
            return;
          }
          int i = paramAnonymousMessage.getData().getInt("progress");
          EmojiStoreV2DesignerUI.d(EmojiStoreV2DesignerUI.this).aO(str, i);
          GMTrace.o(11505948950528L, 85726);
          return;
          if ((EmojiStoreV2DesignerUI.d(EmojiStoreV2DesignerUI.this) == null) || (paramAnonymousMessage.getData() == null))
          {
            GMTrace.o(11505948950528L, 85726);
            return;
          }
          str = paramAnonymousMessage.getData().getString("product_id");
          if (str == null)
          {
            GMTrace.o(11505948950528L, 85726);
            return;
          }
          i = paramAnonymousMessage.getData().getInt("status");
          EmojiStoreV2DesignerUI.d(EmojiStoreV2DesignerUI.this).aN(str, i);
        }
      }
    };
    GMTrace.o(11489842823168L, 85606);
  }
  
  private void PY()
  {
    GMTrace.i(11490782347264L, 85613);
    sq(this.kkG);
    this.knI = new com.tencent.mm.plugin.emoji.a.f(this.vKB.vKW);
    this.Ev.addHeaderView(this.Ks);
    this.Ev.setAdapter(this.knI);
    this.knI.khp = this;
    this.knI.kgK = com.tencent.mm.plugin.emoji.e.n.aqQ();
    this.knI.kgL = false;
    this.ksh.setText(this.kkG);
    this.ksA = com.tencent.mm.plugin.emoji.model.h.arl().kjB.US(String.valueOf(this.ksb));
    this.kny = new com.tencent.mm.plugin.emoji.model.g();
    this.kny.iPn = this;
    this.kny.kkx = this.knI;
    this.kny.kkA = 6;
    this.kny.kkD = this;
    this.kny.kkG = this.kkG;
    this.kny.kkB = this.kkB;
    this.kny.kkC = this.kkC;
    if (this.ksA != null)
    {
      c(com.tencent.mm.plugin.emoji.f.p.a(this.ksA));
      LinkedList localLinkedList1 = this.ksA.tTM;
      LinkedList localLinkedList2 = this.ksA.uqI;
      as(localLinkedList1);
    }
    updateData();
    ah(this.knl);
    GMTrace.o(11490782347264L, 85613);
  }
  
  private void ah(byte[] paramArrayOfByte)
  {
    GMTrace.i(11491319218176L, 85617);
    this.knj = true;
    this.ksH = new com.tencent.mm.plugin.emoji.f.p(this.ksb, paramArrayOfByte);
    at.wS().a(this.ksH, 0);
    GMTrace.o(11491319218176L, 85617);
  }
  
  private void as(final List<qp> paramList)
  {
    int i = 1;
    GMTrace.i(11491587653632L, 85619);
    String str = com.tencent.mm.k.g.ut().getValue("ShowDesignerEmoji");
    w.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "get dynamic Disgner_Emoji_Store_Show config value:%s", new Object[] { str });
    if ((!bg.nm(str)) && (bg.Sy(str) == 1)) {}
    while ((paramList != null) && (paramList.size() > 0) && (i != 0))
    {
      this.ksp.setVisibility(0);
      this.mHandler.post(new Runnable()
      {
        public final void run()
        {
          int k = 8;
          GMTrace.i(11522189295616L, 85847);
          EmojiStoreV2DesignerUI localEmojiStoreV2DesignerUI = EmojiStoreV2DesignerUI.this;
          int i;
          View localView;
          if (paramList.size() > 3)
          {
            i = 1;
            if (localEmojiStoreV2DesignerUI.kss != null) {
              localEmojiStoreV2DesignerUI.kss.setVisibility(0);
            }
            if (localEmojiStoreV2DesignerUI.ksv != null) {
              localEmojiStoreV2DesignerUI.ksv.setVisibility(0);
            }
            if (localEmojiStoreV2DesignerUI.ksu != null) {
              localEmojiStoreV2DesignerUI.ksu.setVisibility(0);
            }
            if (localEmojiStoreV2DesignerUI.ksw != null)
            {
              localView = localEmojiStoreV2DesignerUI.ksw;
              if (i == 0) {
                break label192;
              }
            }
          }
          label192:
          for (int j = 0;; j = 8)
          {
            localView.setVisibility(j);
            if (localEmojiStoreV2DesignerUI.ksx != null) {
              localEmojiStoreV2DesignerUI.ksx.setText(R.l.doQ);
            }
            if (localEmojiStoreV2DesignerUI.ksy != null)
            {
              localView = localEmojiStoreV2DesignerUI.ksy;
              j = k;
              if (i != 0) {
                j = 0;
              }
              localView.setVisibility(j);
            }
            if (localEmojiStoreV2DesignerUI.ksp != null) {
              localEmojiStoreV2DesignerUI.ksp.setPadding(0, 0, 0, 0);
            }
            GMTrace.o(11522189295616L, 85847);
            return;
            i = 0;
            break;
          }
        }
      });
      this.kst.at(paramList);
      GMTrace.o(11491587653632L, 85619);
      return;
      i = 0;
    }
    this.ksp.setVisibility(8);
    GMTrace.o(11491587653632L, 85619);
  }
  
  private void asZ()
  {
    GMTrace.i(11491185000448L, 85616);
    if ((this.kse != null) && ((int)this.kse.fTq != 0))
    {
      this.ksk.setVisibility(0);
      this.ksj.setVisibility(0);
      if (!bg.nm(this.kse.vj())) {
        this.ksl.setText(this.kse.vj());
      }
      for (;;)
      {
        a.b.n(this.ksm, this.kse.field_username);
        this.ksn.setEnabled(true);
        GMTrace.o(11491185000448L, 85616);
        return;
        this.ksl.setText(this.kse.field_username);
      }
    }
    this.ksk.setVisibility(8);
    this.ksj.setVisibility(8);
    GMTrace.o(11491185000448L, 85616);
  }
  
  private void b(int paramInt, com.tencent.mm.plugin.emoji.model.e parame)
  {
    int i = 1;
    GMTrace.i(11491856089088L, 85621);
    switch (paramInt)
    {
    default: 
      paramInt = 0;
    }
    for (;;)
    {
      if ((this.knx != null) && (paramInt != 0))
      {
        if (this.knI != null) {
          this.knI.b(this.knx);
        }
        if (this.mHandler != null) {
          this.mHandler.sendEmptyMessage(10002);
        }
      }
      GMTrace.o(11491856089088L, 85621);
      return;
      this.knx = parame;
      paramInt = i;
      continue;
      this.knx = parame;
      paramInt = i;
      continue;
      this.knx = parame;
      paramInt = i;
      continue;
      if (this.knx == null) {
        this.knx = new com.tencent.mm.plugin.emoji.model.e();
      }
      this.knx.mH(parame.kkn);
      this.knx.aq(parame.kko);
      paramInt = i;
    }
  }
  
  private void c(com.tencent.mm.plugin.emoji.model.e parame)
  {
    GMTrace.i(11491721871360L, 85620);
    b(this.kni, parame);
    this.kni = 0;
    GMTrace.o(11491721871360L, 85620);
  }
  
  private void updateData()
  {
    GMTrace.i(11490916564992L, 85614);
    if (this.ksA == null)
    {
      w.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "update data failed. data is null.");
      GMTrace.o(11490916564992L, 85614);
      return;
    }
    asY();
    if (!bg.nm(this.ksA.tTT))
    {
      w.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "biz name is :%s", new Object[] { this.ksA.tTT });
      at.AR();
      this.kse = com.tencent.mm.y.c.yK().TE(this.ksA.tTT);
      if (((this.kse == null) || ((int)this.kse.fTq == 0)) && (ak.a.gmX != null))
      {
        w.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "getContact %s", new Object[] { this.ksA.tTT });
        ak.a.gmX.a(this.ksA.tTT, "", this.ksD);
      }
      this.ksn.setText(R.l.dpu);
      if (bg.nm(this.ksA.lPj)) {
        break label297;
      }
      this.ksi.setText(this.ksA.lPj);
      this.ksi.setVisibility(0);
    }
    for (;;)
    {
      asZ();
      if ((this.knx != null) && (this.knx.kko != null) && (!this.knx.kko.isEmpty())) {
        break label309;
      }
      this.kso.setVisibility(8);
      GMTrace.o(11490916564992L, 85614);
      return;
      w.w("MicroMsg.emoji.EmojiStoreV2DesignerUI", "mData.BizName is null");
      this.ksj.setVisibility(8);
      this.ksk.setVisibility(8);
      break;
      label297:
      this.ksi.setVisibility(8);
    }
    label309:
    this.kso.setVisibility(0);
    GMTrace.o(11490916564992L, 85614);
  }
  
  public final void H(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(11492795613184L, 85628);
    I(paramString1, paramString2, paramString3);
    asb();
    GMTrace.o(11492795613184L, 85628);
  }
  
  protected final com.tencent.mm.plugin.emoji.f.g I(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(11493064048640L, 85630);
    this.knB = new com.tencent.mm.plugin.emoji.f.g(paramString1, paramString2, paramString3);
    paramString1 = this.knB;
    GMTrace.o(11493064048640L, 85630);
    return paramString1;
  }
  
  protected final void MP()
  {
    GMTrace.i(11490648129536L, 85612);
    if (!bg.nm(this.kkG)) {
      sq(this.kkG);
    }
    this.Ks = v.fb(this.vKB.vKW).inflate(R.i.cuK, null);
    this.ksf = this.Ks.findViewById(R.h.bto);
    this.ksg = ((BannerEmojiView)this.ksf.findViewById(R.h.bvG));
    this.ksh = ((TextView)this.Ks.findViewById(R.h.btq));
    this.ksi = ((TextView)this.Ks.findViewById(R.h.btm));
    this.ksj = this.Ks.findViewById(R.h.btl);
    this.ksk = this.Ks.findViewById(R.h.btk);
    this.ksl = ((TextView)this.Ks.findViewById(R.h.bty));
    this.ksm = ((ImageView)this.Ks.findViewById(R.h.btp));
    this.ksn = ((TextView)this.Ks.findViewById(R.h.btn));
    this.kso = ((TextView)this.Ks.findViewById(R.h.btz));
    this.ksp = this.Ks.findViewById(R.h.btr);
    this.ksr = this.Ks.findViewById(R.h.btu);
    this.ksr.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11518028546048L, 85816);
        EmojiStoreV2DesignerUI.e(EmojiStoreV2DesignerUI.this);
        GMTrace.o(11518028546048L, 85816);
      }
    });
    this.kss = ((PreViewListGridView)this.Ks.findViewById(R.h.btt));
    this.kst = new d(this.vKB.vKW);
    this.kst.kvk = new d.a()
    {
      public final void kt(int paramAnonymousInt)
      {
        GMTrace.i(11474139348992L, 85489);
        if ((EmojiStoreV2DesignerUI.f(EmojiStoreV2DesignerUI.this) != null) && (EmojiStoreV2DesignerUI.g(EmojiStoreV2DesignerUI.this) != null))
        {
          qp localqp = EmojiStoreV2DesignerUI.g(EmojiStoreV2DesignerUI.this).mV(paramAnonymousInt);
          if (localqp != null) {
            try
            {
              Intent localIntent = new Intent();
              localIntent.putExtra("extra_object", localqp.toByteArray());
              localIntent.setClass(EmojiStoreV2DesignerUI.this.vKB.vKW, EmojiStoreV2SingleProductDialogUI.class);
              EmojiStoreV2DesignerUI.this.startActivity(localIntent);
              EmojiStoreV2DesignerUI.this.overridePendingTransition(R.a.aLC, R.a.aLD);
              GMTrace.o(11474139348992L, 85489);
              return;
            }
            catch (Exception localException) {}
          }
        }
        GMTrace.o(11474139348992L, 85489);
      }
    };
    this.kss.setAdapter(this.kst);
    this.ksu = this.Ks.findViewById(R.h.btv);
    this.ksv = this.Ks.findViewById(R.h.btw);
    this.ksw = this.Ks.findViewById(R.h.btu);
    this.ksx = ((TextView)this.Ks.findViewById(R.h.btx));
    this.ksy = this.Ks.findViewById(R.h.bts);
    this.ksz = ((MMPullDownView)findViewById(R.h.bKw));
    this.ksz.wdO = this;
    this.ksz.wdZ = this;
    this.ksz.lF(false);
    this.ksz.lE(false);
    this.Ev = ((ListView)findViewById(16908298));
    this.Ev.setOnItemClickListener(this);
    this.Ev.setOnScrollListener(this);
    this.ksk.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11512794054656L, 85777);
        EmojiStoreV2DesignerUI.h(EmojiStoreV2DesignerUI.this);
        GMTrace.o(11512794054656L, 85777);
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11486084726784L, 85578);
        EmojiStoreV2DesignerUI.this.finish();
        GMTrace.o(11486084726784L, 85578);
        return false;
      }
    });
    a(0, R.k.cNO, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11468770639872L, 85449);
        w.d("MicroMsg.emoji.EmojiStoreV2DesignerUI", "on shard click.");
        EmojiStoreV2DesignerUI.i(EmojiStoreV2DesignerUI.this);
        GMTrace.o(11468770639872L, 85449);
        return true;
      }
    });
    GMTrace.o(11490648129536L, 85612);
  }
  
  protected final int Qf()
  {
    GMTrace.i(11493735137280L, 85635);
    GMTrace.o(11493735137280L, 85635);
    return 1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, final com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(11491453435904L, 85618);
    final Object localObject;
    switch (paramk.getType())
    {
    default: 
      w.e("MicroMsg.emoji.EmojiStoreV2DesignerUI", "unknow scene type");
      GMTrace.o(11491453435904L, 85618);
      return;
    case 423: 
      paramString = (com.tencent.mm.plugin.emoji.f.g)paramk;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        aO(paramString.klt, 0);
        GMTrace.o(11491453435904L, 85618);
        return;
      }
      paramk = paramString.klt;
      localObject = paramString.klv;
      final String str = paramString.klu;
      com.tencent.mm.ui.base.h.a(this, getString(R.l.doE, new Object[] { str }), "", new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11469307510784L, 85453);
          EmojiStoreV2DesignerUI.this.I(paramk, localObject, str);
          EmojiStoreV2DesignerUI.this.asb();
          w.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "Retry doScene ExchangeEmotionPackNetScene productId:%s", new Object[] { paramk });
          EmojiStoreV2DesignerUI.a(EmojiStoreV2DesignerUI.this, paramk);
          GMTrace.o(11469307510784L, 85453);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11472394518528L, 85476);
          GMTrace.o(11472394518528L, 85476);
        }
      });
      aN(paramString.klt, -1);
      GMTrace.o(11491453435904L, 85618);
      return;
    case 720: 
      this.knj = false;
      if ((paramInt1 == 0) || (paramInt1 == 4))
      {
        paramString = (com.tencent.mm.plugin.emoji.f.p)paramk;
        paramk = com.tencent.mm.plugin.emoji.f.p.a(paramString.arE());
        if (paramInt2 == 0)
        {
          this.ksA = paramString.arE();
          c(paramk);
        }
        for (;;)
        {
          if ((this.knl == null) && (this.ksA != null))
          {
            com.tencent.mm.plugin.emoji.model.h.arl().kjB.a(String.valueOf(this.ksb), paramString.arE());
            this.ksq = this.ksA.tTM;
            paramk = this.ksq;
            localObject = this.ksA.uqI;
            as(paramk);
          }
          this.knl = paramString.klL;
          GMTrace.o(11491453435904L, 85618);
          return;
          if (paramInt2 == 2)
          {
            this.ksA = paramString.arE();
            b(this.kni, paramk);
            this.kni = 2;
          }
          else if (paramInt2 == 3)
          {
            this.ksA = paramString.arE();
            b(this.kni, paramk);
            this.kni = 1;
            w.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "get person designer failed errCode:%d", new Object[] { Integer.valueOf(paramInt2) });
          }
        }
      }
      w.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "get person designer failed");
      GMTrace.o(11491453435904L, 85618);
      return;
    }
    if ((this.ksC != null) && (this.ksC.isShowing())) {
      this.ksC.dismiss();
    }
    if ((paramInt2 == 0) && (paramInt1 == 0))
    {
      paramString = ((com.tencent.mm.plugin.emoji.f.i)paramk).arx();
      if ((paramString != null) && (paramString.uqv != null))
      {
        this.ksb = paramString.uqv.uqo;
        this.kkG = paramString.uqv.lPi;
        this.ksc = paramString.uqv.uhA;
        if (this.mHandler != null) {
          this.mHandler.sendEmptyMessage(10003);
        }
      }
      GMTrace.o(11491453435904L, 85618);
      return;
    }
    Z(0, false);
    com.tencent.mm.ui.base.h.b(this.vKB.vKW, getString(R.l.dnZ), null, true);
    w.e("MicroMsg.emoji.EmojiStoreV2DesignerUI", "open designer failed .");
    GMTrace.o(11491453435904L, 85618);
  }
  
  public final void a(com.tencent.mm.plugin.emoji.a.a parama)
  {
    GMTrace.i(11492661395456L, 85627);
    String str2 = parama.apY();
    if (TextUtils.isEmpty(parama.aqa())) {}
    for (String str1 = "";; str1 = parama.aqa())
    {
      w.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "[onProductClick] productId:%s, productPrice:%s, productStatus:%d", new Object[] { str2, str1, Integer.valueOf(parama.apZ()) });
      parama.apZ();
      this.kny.a(parama);
      GMTrace.o(11492661395456L, 85627);
      return;
    }
  }
  
  final void aN(String paramString, int paramInt)
  {
    GMTrace.i(11493466701824L, 85633);
    Message localMessage = Message.obtain();
    localMessage.getData().putString("product_id", paramString);
    localMessage.getData().putInt("status", paramInt);
    localMessage.what = 131076;
    if (this.mHandler != null) {
      this.mHandler.sendMessage(localMessage);
    }
    GMTrace.o(11493466701824L, 85633);
  }
  
  final void aO(String paramString, int paramInt)
  {
    GMTrace.i(11493332484096L, 85632);
    Message localMessage = Message.obtain();
    localMessage.getData().putString("product_id", paramString);
    localMessage.getData().putInt("progress", paramInt);
    localMessage.what = 131075;
    if (this.mHandler != null) {
      this.mHandler.sendMessage(localMessage);
    }
    GMTrace.o(11493332484096L, 85632);
  }
  
  public final boolean aoX()
  {
    GMTrace.i(11492258742272L, 85624);
    GMTrace.o(11492258742272L, 85624);
    return true;
  }
  
  public final boolean aoZ()
  {
    GMTrace.i(11492392960000L, 85625);
    GMTrace.o(11492392960000L, 85625);
    return false;
  }
  
  public final void ard()
  {
    GMTrace.i(11492929830912L, 85629);
    GMTrace.o(11492929830912L, 85629);
  }
  
  protected final void asY()
  {
    GMTrace.i(11491050782720L, 85615);
    if (this.ksA == null)
    {
      w.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "update header faild. data is null.");
      GMTrace.o(11491050782720L, 85615);
      return;
    }
    if ((this.ksg != null) && (!bg.nm(this.ksA.usF)))
    {
      Object localObject = this.ksA.usF;
      com.tencent.mm.br.a.getDensity(this);
      localObject = EmojiLogic.a("Designer", 8, (String)localObject, true);
      if (localObject == null)
      {
        com.tencent.mm.ao.n.Jd().a(this.ksA.usF, null, com.tencent.mm.plugin.emoji.e.f.c("Designer", this.ksA.usF, new Object[] { "Designer", "BANNER" }), new com.tencent.mm.ao.a.c.i()
        {
          public final void a(String paramAnonymousString, Bitmap paramAnonymousBitmap, Object... paramAnonymousVarArgs)
          {
            GMTrace.i(11482326630400L, 85550);
            if (EmojiStoreV2DesignerUI.j(EmojiStoreV2DesignerUI.this) != null) {
              EmojiStoreV2DesignerUI.j(EmojiStoreV2DesignerUI.this).sendEmptyMessage(10001);
            }
            GMTrace.o(11482326630400L, 85550);
          }
        });
        GMTrace.o(11491050782720L, 85615);
        return;
      }
      this.ksg.cz(((EmojiInfo)localObject).bUU(), null);
    }
    GMTrace.o(11491050782720L, 85615);
  }
  
  protected final void asb()
  {
    GMTrace.i(11493198266368L, 85631);
    at.wS().a(this.knB, 0);
    GMTrace.o(11493198266368L, 85631);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11489977040896L, 85607);
    int i = R.i.cuL;
    GMTrace.o(11489977040896L, 85607);
    return i;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(11493600919552L, 85634);
    this.kny.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt1 == 2002) && (paramInt2 == -1))
    {
      String str1 = paramIntent.getStringExtra("Select_Conv_User");
      if ((bg.nm(str1)) || (this.ksA == null)) {
        break label248;
      }
      w.d("MicroMsg.emoji.EmojiStoreV2DesignerUI", ".." + str1);
      String str2 = this.kkG;
      String str3 = this.ksA.lPj;
      int i = this.ksb;
      String str4 = this.ksd;
      String str5 = this.kkG;
      String str6 = this.ksA.uhA;
      String str7 = getResources().getString(R.l.cSv) + str2;
      e.a locala = new e.a(this);
      locala.bA(str1).Pi(str7).zf(R.l.cUs);
      locala.Pj(str6).bLF();
      locala.Pl(getString(R.l.dit)).a(new k.2(str1, str5, str3, i, str4, str2, str6, this)).oaD.show();
    }
    for (;;)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      GMTrace.o(11493600919552L, 85634);
      return;
      label248:
      w.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "member or data is null.");
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11490111258624L, 85608);
    super.onCreate(paramBundle);
    this.klF = getIntent().getStringExtra("id");
    this.ksb = getIntent().getIntExtra("uin", 0);
    this.kkG = getIntent().getStringExtra("name");
    this.ksc = getIntent().getStringExtra("headurl");
    this.ksd = getIntent().getStringExtra("rediret_url");
    this.gRb = getIntent().getIntExtra("extra_scence", 0);
    this.kkB = getIntent().getLongExtra("searchID", 0L);
    this.kkC = bg.aq(getIntent().getStringExtra("docID"), "");
    paramBundle = getIntent().getStringExtra("sns_object_data");
    if (!TextUtils.isEmpty(paramBundle))
    {
      this.ksb = EmojiLogic.vW(paramBundle);
      this.kkG = EmojiLogic.vX(paramBundle);
      this.ksd = EmojiLogic.wc(paramBundle);
    }
    MP();
    int i;
    if (!bg.nm(this.klF))
    {
      paramBundle = com.tencent.mm.plugin.emoji.model.h.arl().kjE.UN(this.klF);
      if ((paramBundle != null) && (paramBundle.uqv != null) && (paramBundle.uqv.uqo != 0) && (!bg.nm(paramBundle.uqv.lPi)))
      {
        this.ksb = paramBundle.uqv.uqo;
        this.kkG = paramBundle.uqv.lPi;
        w.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "uin:%s name:%s", new Object[] { Integer.valueOf(this.ksb), this.kkG });
      }
    }
    else
    {
      i = 0;
      if (i != 0) {
        break label443;
      }
      PY();
    }
    for (;;)
    {
      at.wS().a(239, this);
      at.wS().a(720, this);
      com.tencent.mm.sdk.b.a.vgX.b(this.knA);
      com.tencent.mm.plugin.report.service.g.ork.i(12067, new Object[] { Integer.valueOf(1), "", "", "", "" });
      com.tencent.mm.plugin.report.service.g.ork.i(12740, new Object[] { Integer.valueOf(2), o.getString(this.ksb), "", "", Integer.valueOf(this.gRb) });
      GMTrace.o(11490111258624L, 85608);
      return;
      i = 1;
      break;
      label443:
      this.ksB = new com.tencent.mm.plugin.emoji.f.i(this.klF);
      at.wS().a(this.ksB, 0);
      getString(R.l.cUG);
      this.ksC = com.tencent.mm.ui.base.h.a(this, getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(11474676219904L, 85493);
          if (EmojiStoreV2DesignerUI.o(EmojiStoreV2DesignerUI.this) != null) {
            at.wS().c(EmojiStoreV2DesignerUI.o(EmojiStoreV2DesignerUI.this));
          }
          GMTrace.o(11474676219904L, 85493);
        }
      });
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11490513911808L, 85611);
    super.onDestroy();
    if (this.ksH != null) {
      at.wS().c(this.ksH);
    }
    at.wS().b(239, this);
    at.wS().b(720, this);
    com.tencent.mm.sdk.b.a.vgX.c(this.knA);
    GMTrace.o(11490513911808L, 85611);
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(11492527177728L, 85626);
    Object localObject;
    if (this.knI != null)
    {
      int i = this.Ev.getHeaderViewsCount();
      paramAdapterView = this.knI.mC(paramInt - i);
      if (paramAdapterView != null)
      {
        paramView = new Intent();
        paramView.setClass(this, EmojiStoreDetailUI.class);
        localObject = paramAdapterView.khA;
        if (localObject != null) {
          break label90;
        }
        paramAdapterView = null;
      }
    }
    for (;;)
    {
      if (paramAdapterView != null) {
        startActivity(paramAdapterView);
      }
      GMTrace.o(11492527177728L, 85626);
      return;
      label90:
      paramView.putExtra("extra_id", ((rh)localObject).tRS);
      paramView.putExtra("extra_name", ((rh)localObject).uhe);
      paramView.putExtra("extra_copyright", ((rh)localObject).uho);
      paramView.putExtra("extra_coverurl", ((rh)localObject).uhm);
      paramView.putExtra("extra_description", ((rh)localObject).uhf);
      paramView.putExtra("extra_price", ((rh)localObject).uhh);
      paramView.putExtra("extra_type", ((rh)localObject).uhi);
      paramView.putExtra("extra_flag", ((rh)localObject).uhj);
      paramView.putExtra("preceding_scence", 106);
      paramView.putExtra("download_entrance_scene", 6);
      paramView.putExtra("call_by", 1);
      paramView.putExtra("check_clickflag", false);
      paramView.putExtra("extra_status", paramAdapterView.mStatus);
      paramView.putExtra("extra_progress", paramAdapterView.rr);
      paramView.putExtra("searchID", this.kkB);
      localObject = getIntent().getStringExtra("to_talker_name");
      paramAdapterView = paramView;
      if (!bg.nm((String)localObject))
      {
        paramView.putExtra("to_talker_name", (String)localObject);
        paramAdapterView = paramView;
      }
    }
  }
  
  protected void onPause()
  {
    GMTrace.i(11490379694080L, 85610);
    super.onPause();
    at.wS().b(423, this);
    GMTrace.o(11490379694080L, 85610);
  }
  
  protected void onResume()
  {
    GMTrace.i(11490245476352L, 85609);
    super.onResume();
    at.wS().a(423, this);
    GMTrace.o(11490245476352L, 85609);
  }
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(11491990306816L, 85622);
    GMTrace.o(11491990306816L, 85622);
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    GMTrace.i(11492124524544L, 85623);
    if ((paramInt == 0) && (paramAbsListView.getLastVisiblePosition() == paramAbsListView.getCount() - 1))
    {
      if ((this.kni == 0) || (this.knj))
      {
        w.d("MicroMsg.emoji.EmojiStoreV2DesignerUI", "No More List.");
        GMTrace.o(11492124524544L, 85623);
        return;
      }
      ah(this.knl);
      w.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "[onScrollStateChanged] startLoadRemoteEmoji.");
    }
    GMTrace.o(11492124524544L, 85623);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\v2\EmojiStoreV2DesignerUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
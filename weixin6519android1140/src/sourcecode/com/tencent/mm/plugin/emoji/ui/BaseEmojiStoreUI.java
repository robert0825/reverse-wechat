package com.tencent.mm.plugin.emoji.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.LayoutParams;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.cs;
import com.tencent.mm.plugin.emoji.a.a.f;
import com.tencent.mm.plugin.emoji.a.a.f.a;
import com.tencent.mm.plugin.emoji.e.m;
import com.tencent.mm.plugin.emoji.f.q;
import com.tencent.mm.plugin.emoji.model.g.a;
import com.tencent.mm.plugin.emoji.model.g.b;
import com.tencent.mm.pluginsdk.model.h.a;
import com.tencent.mm.pluginsdk.ui.emoji.StoreBannerEmojiView;
import com.tencent.mm.protocal.c.aac;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.qw;
import com.tencent.mm.protocal.c.qy;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.MMPullDownView.c;
import com.tencent.mm.ui.base.MMPullDownView.d;
import com.tencent.mm.ui.base.MMPullDownView.e;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public abstract class BaseEmojiStoreUI
  extends EmojiBaseActivity
  implements AbsListView.OnScrollListener, AdapterView.OnItemClickListener, com.tencent.mm.ad.e, g.a, g.b, h.a, j.a, MMPullDownView.c, MMPullDownView.d, MMPullDownView.e
{
  private static Map<String, Long> knz;
  protected ListView Ev;
  protected View iTN;
  private ProgressDialog kgz;
  private com.tencent.mm.plugin.emoji.h.b kkF;
  com.tencent.mm.plugin.emoji.a.a.a kkx;
  private com.tencent.mm.sdk.b.c knA;
  protected com.tencent.mm.plugin.emoji.f.g knB;
  protected boolean knC;
  private LinkedList<qw> knD;
  private LinkedList<qy> knE;
  protected EmojiStoreVpHeader knc;
  protected View knd;
  protected StoreBannerEmojiView kne;
  protected MMPullDownView knf;
  protected TextView kng;
  protected boolean knh;
  int kni;
  private boolean knj;
  private View knk;
  byte[] knl;
  private final int knm;
  private final int knn;
  private final int kno;
  protected final int knp;
  private final int knq;
  private final int knr;
  private final String kns;
  private final String knt;
  private final String knu;
  private com.tencent.mm.plugin.emoji.f.n knv;
  private int knw;
  private com.tencent.mm.plugin.emoji.model.e knx;
  private com.tencent.mm.plugin.emoji.model.g kny;
  
  public BaseEmojiStoreUI()
  {
    GMTrace.i(11420049604608L, 85086);
    this.knh = false;
    this.kni = -1;
    this.knm = 65537;
    this.knn = 20001;
    this.kno = 2002;
    this.knp = 131074;
    this.knq = 131075;
    this.knr = 131076;
    this.kns = "product_id";
    this.knt = "progress";
    this.knu = "status";
    this.knC = false;
    this.knD = new LinkedList();
    this.knE = new LinkedList();
    GMTrace.o(11420049604608L, 85086);
  }
  
  private void a(int paramInt, com.tencent.mm.plugin.emoji.model.e parame, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool2 = false;
    GMTrace.i(11425284096000L, 85125);
    w.d("MicroMsg.emoji.BaseEmojiStoreUI", "");
    boolean bool1 = bool2;
    switch (paramInt)
    {
    default: 
      bool1 = bool2;
    case 0: 
      if (this.knx != null) {
        this.knx.arc();
      }
      a(bool1, this.knx, paramBoolean1, paramBoolean2);
      GMTrace.o(11425284096000L, 85125);
      return;
    case -1: 
      this.knx = parame;
    }
    for (;;)
    {
      bool1 = true;
      break;
      this.knx = parame;
      continue;
      if (this.knx == null) {
        this.knx = new com.tencent.mm.plugin.emoji.model.e();
      }
      if (parame != null)
      {
        this.knx.mH(parame.kkn);
        this.knx.aq(parame.kko);
      }
    }
  }
  
  private void aN(String paramString, int paramInt)
  {
    GMTrace.i(11423807700992L, 85114);
    Message localMessage = Message.obtain();
    localMessage.getData().putString("product_id", paramString);
    localMessage.getData().putInt("status", paramInt);
    localMessage.what = 131076;
    i(localMessage);
    GMTrace.o(11423807700992L, 85114);
  }
  
  private void aO(String paramString, int paramInt)
  {
    GMTrace.i(11423673483264L, 85113);
    Message localMessage = Message.obtain();
    localMessage.getData().putString("product_id", paramString);
    localMessage.getData().putInt("progress", paramInt);
    localMessage.what = 131075;
    i(localMessage);
    GMTrace.o(11423673483264L, 85113);
  }
  
  private void arW()
  {
    GMTrace.i(11423405047808L, 85111);
    com.tencent.mm.plugin.emoji.a.a.b.a(this.kkx.kho, this);
    GMTrace.o(11423405047808L, 85111);
  }
  
  private void b(aac paramaac)
  {
    GMTrace.i(11425552531456L, 85127);
    if (this.kni == -1)
    {
      Message localMessage = Message.obtain();
      localMessage.what = 65537;
      localMessage.obj = paramaac;
      if (this.koi != null) {
        this.koi.sendMessage(localMessage);
      }
    }
    GMTrace.o(11425552531456L, 85127);
  }
  
  public final void H(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(11426760491008L, 85136);
    I(paramString1, paramString2, paramString3);
    asb();
    GMTrace.o(11426760491008L, 85136);
  }
  
  protected final com.tencent.mm.plugin.emoji.f.g I(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(11423941918720L, 85115);
    this.knB = new com.tencent.mm.plugin.emoji.f.g(paramString1, paramString2, paramString3);
    paramString1 = this.knB;
    GMTrace.o(11423941918720L, 85115);
    return paramString1;
  }
  
  public void MP()
  {
    GMTrace.i(11422197088256L, 85102);
    a(new b());
    arN();
    this.iTN = findViewById(R.h.empty);
    this.kng = ((TextView)this.iTN.findViewById(R.h.bwy));
    this.knk = getLayoutInflater().inflate(R.i.cuH, null);
    this.knk.setVisibility(8);
    if (arU()) {
      this.knc = new EmojiStoreVpHeader(this.vKB.vKW);
    }
    if (arV())
    {
      this.knd = LayoutInflater.from(this).inflate(R.i.cvf, null);
      int i = EmojiStoreVpHeader.aO(this.vKB.vKW)[0];
      AbsListView.LayoutParams localLayoutParams = new AbsListView.LayoutParams(i, i * 3 / 8 + 1);
      this.knd.setLayoutParams(localLayoutParams);
      this.kne = ((StoreBannerEmojiView)this.knd.findViewById(R.h.bvG));
    }
    this.Ev = ((ListView)findViewById(16908298));
    this.Ev.setOnItemClickListener(this);
    if (arU()) {
      this.Ev.addHeaderView(this.knc);
    }
    for (;;)
    {
      if (asg()) {
        this.Ev.addFooterView(this.knk);
      }
      arR();
      this.Ev.setAdapter(this.kkx);
      this.Ev.setOnScrollListener(this);
      this.kkx.khn = this.Ev;
      arS();
      GMTrace.o(11422197088256L, 85102);
      return;
      if (arV()) {
        this.Ev.addHeaderView(this.knd);
      }
    }
  }
  
  public void a(int paramInt1, int paramInt2, String paramString, final k paramk)
  {
    GMTrace.i(11420854910976L, 85092);
    final Object localObject = paramString;
    if (TextUtils.isEmpty(paramString)) {
      localObject = "";
    }
    w.i("MicroMsg.emoji.BaseEmojiStoreUI", "jacks [onSceneEnd] errType:%d,errCode:%d,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), localObject });
    ase();
    switch (paramk.getType())
    {
    default: 
      w.e("MicroMsg.emoji.BaseEmojiStoreUI", "unknow scene type");
    }
    label286:
    label460:
    do
    {
      for (;;)
      {
        GMTrace.o(11420854910976L, 85092);
        return;
        localObject = (com.tencent.mm.plugin.emoji.f.n)paramk;
        if ((localObject == null) || (((com.tencent.mm.plugin.emoji.f.n)localObject).mType != arX())) {
          break label460;
        }
        this.knj = false;
        this.knk.setVisibility(8);
        paramString = null;
        try
        {
          paramk = com.tencent.mm.plugin.emoji.f.n.a(((com.tencent.mm.plugin.emoji.f.n)localObject).arB());
          paramString = paramk;
          if (paramString != null) {
            if ((paramInt1 == 0) || (paramInt1 == 4))
            {
              paramInt1 = 1;
              if (paramInt1 == 0) {
                break;
              }
              this.iTN.setVisibility(8);
              this.knh = false;
              this.knl = ((com.tencent.mm.plugin.emoji.f.n)localObject).klL;
              if (paramInt2 != 0) {
                break label286;
              }
              paramk = ((com.tencent.mm.plugin.emoji.f.n)localObject).arB();
              a(paramString, false, true);
              b(paramk);
              this.kni = 0;
              GMTrace.o(11420854910976L, 85092);
            }
          }
        }
        catch (Exception paramk)
        {
          for (;;)
          {
            w.k("MicroMsg.emoji.BaseEmojiStoreUI", "deal NetGetEmotionList error:%s", new Object[] { paramk.toString() });
            continue;
            paramInt1 = 0;
          }
          if (paramInt2 == 2)
          {
            paramk = ((com.tencent.mm.plugin.emoji.f.n)localObject).arB();
            a(this.kni, paramString, false, false);
            arW();
            b(paramk);
            this.kni = 2;
            GMTrace.o(11420854910976L, 85092);
            return;
          }
          if (paramInt2 == 3)
          {
            a(this.kni, paramString, false, false);
            this.kni = 1;
            GMTrace.o(11420854910976L, 85092);
            return;
          }
          this.iTN.setVisibility(0);
          this.knh = true;
          if (arX() == 7)
          {
            this.kng.setText(R.l.dpk);
          }
          else
          {
            this.kng.setText(R.l.doI);
            GMTrace.o(11420854910976L, 85092);
            return;
          }
        }
      }
      if (!this.knC)
      {
        this.iTN.setVisibility(0);
        this.knh = true;
        this.kng.setText(R.l.doJ);
      }
      GMTrace.o(11420854910976L, 85092);
      return;
      paramInt2 = arX();
      if (localObject == null) {}
      for (paramInt1 = -1;; paramInt1 = ((com.tencent.mm.plugin.emoji.f.n)localObject).mType)
      {
        w.i("MicroMsg.emoji.BaseEmojiStoreUI", "no some scene type. this ui type:%d callbak type:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
        GMTrace.o(11420854910976L, 85092);
        return;
      }
      paramString = (com.tencent.mm.plugin.emoji.f.g)paramk;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        a(paramString);
        GMTrace.o(11420854910976L, 85092);
        return;
      }
      paramk = paramString.klt;
      localObject = paramString.klv;
      final String str = paramString.klu;
      com.tencent.mm.ui.base.h.a(this, getString(R.l.doE, new Object[] { str }), "", new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11388776873984L, 84853);
          BaseEmojiStoreUI.this.I(paramk, localObject, str);
          BaseEmojiStoreUI.this.asb();
          w.i("MicroMsg.emoji.BaseEmojiStoreUI", "Retry doScene ExchangeEmotionPackNetScene productId:%s", new Object[] { paramk });
          BaseEmojiStoreUI.a(BaseEmojiStoreUI.this, paramk);
          GMTrace.o(11388776873984L, 84853);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11419915386880L, 85085);
          GMTrace.o(11419915386880L, 85085);
        }
      });
      aN(paramString.klt, -1);
      GMTrace.o(11420854910976L, 85092);
      return;
      paramString = (q)paramk;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        com.tencent.mm.plugin.emoji.model.h.arl().kjz.UG(paramString.klt);
        paramString = new Message();
        paramString.what = 2002;
        paramString.obj = this.vKB.vKW.getString(R.l.cUJ);
        i(paramString);
      }
      for (;;)
      {
        bV(20001, 800);
        GMTrace.o(11420854910976L, 85092);
        return;
        paramString = new Message();
        paramString.what = 2002;
        paramString.obj = this.vKB.vKW.getString(R.l.dnX);
        i(paramString);
      }
    } while ((paramInt1 != 0) || (paramInt2 != 0));
    this.knl = null;
    m(false, true);
    GMTrace.o(11420854910976L, 85092);
  }
  
  public final void a(com.tencent.mm.plugin.emoji.a.a parama)
  {
    GMTrace.i(11426357837824L, 85133);
    String str2 = parama.apY();
    String str1;
    if (TextUtils.isEmpty(parama.aqa()))
    {
      str1 = "";
      w.i("MicroMsg.emoji.BaseEmojiStoreUI", "[onProductClick] productId:%s, productPrice:%s, productStatus:%d", new Object[] { str2, str1, Integer.valueOf(parama.apZ()) });
      if (parama.apZ() == 9)
      {
        str1 = getString(R.l.cUK);
        if (!isFinishing()) {
          break label115;
        }
        w.i("MicroMsg.emoji.BaseEmojiStoreUI", "[showLoadingDialog] acitivity is finished.");
      }
    }
    for (;;)
    {
      this.kny.a(parama);
      GMTrace.o(11426357837824L, 85133);
      return;
      str1 = parama.aqa();
      break;
      label115:
      getString(R.l.cUG);
      this.kgz = com.tencent.mm.ui.base.h.a(this, str1, true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(11388240003072L, 84849);
          BaseEmojiStoreUI.asi();
          GMTrace.o(11388240003072L, 84849);
        }
      });
    }
  }
  
  protected void a(com.tencent.mm.plugin.emoji.f.g paramg)
  {
    GMTrace.i(15699179208704L, 116968);
    aO(paramg.klt, 0);
    GMTrace.o(15699179208704L, 116968);
  }
  
  protected void a(com.tencent.mm.plugin.emoji.model.e parame, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(11425149878272L, 85124);
    w.d("MicroMsg.emoji.BaseEmojiStoreUI", "jacks initData begin");
    if ((parame != null) && (parame.kko.size() > 0))
    {
      this.knC = true;
      this.iTN.setVisibility(8);
      this.knh = false;
    }
    a(this.kni, parame, paramBoolean1, paramBoolean2);
    arW();
    GMTrace.o(11425149878272L, 85124);
  }
  
  public void a(String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    GMTrace.i(11426089402368L, 85131);
    if ((!TextUtils.isEmpty(paramString)) && (paramString.equals("delete_group")))
    {
      asp();
      bV(131074, 50);
    }
    GMTrace.o(11426089402368L, 85131);
  }
  
  protected void a(boolean paramBoolean1, com.tencent.mm.plugin.emoji.model.e parame, boolean paramBoolean2, boolean paramBoolean3)
  {
    GMTrace.i(11425418313728L, 85126);
    if ((this.knx != null) && (paramBoolean1)) {
      if (arU())
      {
        if ((this.knx != null) && (this.knx.kkp != null) && (this.knx.kkp.ugS != null)) {
          break label93;
        }
        w.d("MicroMsg.emoji.BaseEmojiStoreUI", "update store ui header failed. ");
      }
    }
    for (;;)
    {
      if (this.kkx != null) {
        this.kkx.b(this.knx);
      }
      GMTrace.o(11425418313728L, 85126);
      return;
      label93:
      this.knD = ((LinkedList)this.knx.kkq);
      this.knE = ((LinkedList)this.knx.kkr);
      if (this.knD != null)
      {
        this.knc.c(this.knD, this.knE);
      }
      else if (this.knx.kkp != null)
      {
        this.knD = new LinkedList();
        this.knD.add(this.knx.kkp);
        this.knc.c(this.knD, this.knE);
      }
    }
  }
  
  public final boolean aoX()
  {
    GMTrace.i(11422465523712L, 85104);
    m(true, false);
    w.i("MicroMsg.emoji.BaseEmojiStoreUI", "[onBottomLoadData] startLoadRemoteEmoji.");
    GMTrace.o(11422465523712L, 85104);
    return true;
  }
  
  public final boolean aoY()
  {
    GMTrace.i(11425820966912L, 85129);
    GMTrace.o(11425820966912L, 85129);
    return false;
  }
  
  public final boolean aoZ()
  {
    GMTrace.i(11425955184640L, 85130);
    GMTrace.o(11425955184640L, 85130);
    return false;
  }
  
  protected void arN()
  {
    GMTrace.i(11421123346432L, 85094);
    this.kkx = arQ();
    this.kkx.khp = this;
    GMTrace.o(11421123346432L, 85094);
  }
  
  public abstract int arO();
  
  public abstract int arP();
  
  public abstract com.tencent.mm.plugin.emoji.a.a.a arQ();
  
  protected void arR()
  {
    GMTrace.i(11421794435072L, 85099);
    GMTrace.o(11421794435072L, 85099);
  }
  
  protected void arS()
  {
    GMTrace.i(11421928652800L, 85100);
    if (!arT())
    {
      GMTrace.o(11421928652800L, 85100);
      return;
    }
    this.knf = ((MMPullDownView)findViewById(R.h.bKw));
    if (this.knf == null)
    {
      GMTrace.o(11421928652800L, 85100);
      return;
    }
    this.knf.lG(false);
    this.knf.wea = this;
    this.knf.wdO = this;
    this.knf.wdZ = this;
    this.knf.lF(false);
    this.knf.lE(false);
    GMTrace.o(11421928652800L, 85100);
  }
  
  protected boolean arT()
  {
    GMTrace.i(11422062870528L, 85101);
    GMTrace.o(11422062870528L, 85101);
    return true;
  }
  
  protected boolean arU()
  {
    GMTrace.i(11422868176896L, 85107);
    GMTrace.o(11422868176896L, 85107);
    return true;
  }
  
  protected boolean arV()
  {
    GMTrace.i(11423002394624L, 85108);
    GMTrace.o(11423002394624L, 85108);
    return false;
  }
  
  public abstract int arX();
  
  public int arY()
  {
    GMTrace.i(11424210354176L, 85117);
    GMTrace.o(11424210354176L, 85117);
    return 0;
  }
  
  protected int arZ()
  {
    GMTrace.i(11424344571904L, 85118);
    if (this.knw == 1)
    {
      GMTrace.o(11424344571904L, 85118);
      return 1;
    }
    GMTrace.o(11424344571904L, 85118);
    return 2;
  }
  
  public final void ard()
  {
    GMTrace.i(11426894708736L, 85137);
    this.knl = null;
    this.kni = -1;
    m(false, false);
    GMTrace.o(11426894708736L, 85137);
  }
  
  protected final void asa()
  {
    GMTrace.i(11424478789632L, 85119);
    at.wS().c(this.knv);
    GMTrace.o(11424478789632L, 85119);
  }
  
  protected final void asb()
  {
    GMTrace.i(11424613007360L, 85120);
    at.wS().a(this.knB, 0);
    GMTrace.o(11424613007360L, 85120);
  }
  
  protected boolean asc()
  {
    boolean bool = false;
    GMTrace.i(11424747225088L, 85121);
    aac localaac = com.tencent.mm.plugin.emoji.model.h.arl().kjB.AF(arX());
    com.tencent.mm.plugin.emoji.model.e locale = com.tencent.mm.plugin.emoji.f.n.a(localaac);
    int j = arX();
    int i;
    if (localaac == null)
    {
      i = 0;
      w.d("MicroMsg.emoji.BaseEmojiStoreUI", "load cache type: %d, size: %d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
      if (locale != null) {
        break label96;
      }
    }
    for (;;)
    {
      GMTrace.o(11424747225088L, 85121);
      return bool;
      i = localaac.uqH;
      break;
      label96:
      if (locale.kko.size() <= 0) {}
      for (bool = false;; bool = true)
      {
        if (!bool) {
          break label159;
        }
        w.d("MicroMsg.emoji.BaseEmojiStoreUI", "jacks init EmoijStoreUI  by Cache: list:%d", new Object[] { Integer.valueOf(locale.kko.size()) });
        a(locale, true, false);
        break;
      }
      label159:
      w.d("MicroMsg.emoji.BaseEmojiStoreUI", "jacks init EmoijStoreUI  by NET");
    }
  }
  
  protected final void asd()
  {
    GMTrace.i(11424881442816L, 85122);
    if (isFinishing())
    {
      w.i("MicroMsg.emoji.BaseEmojiStoreUI", "[showLoadingDialog] acitivity is finished.");
      GMTrace.o(11424881442816L, 85122);
      return;
    }
    getString(R.l.cUG);
    this.kgz = com.tencent.mm.ui.base.h.a(this, getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(11536282157056L, 85952);
        BaseEmojiStoreUI.this.asa();
        BaseEmojiStoreUI.asi();
        GMTrace.o(11536282157056L, 85952);
      }
    });
    GMTrace.o(11424881442816L, 85122);
  }
  
  protected final void ase()
  {
    GMTrace.i(11425015660544L, 85123);
    if ((this.kgz != null) && (this.kgz.isShowing())) {
      this.kgz.dismiss();
    }
    GMTrace.o(11425015660544L, 85123);
  }
  
  protected boolean asf()
  {
    GMTrace.i(11426492055552L, 85134);
    GMTrace.o(11426492055552L, 85134);
    return false;
  }
  
  protected boolean asg()
  {
    GMTrace.i(11427163144192L, 85139);
    GMTrace.o(11427163144192L, 85139);
    return true;
  }
  
  public void ash()
  {
    GMTrace.i(11427297361920L, 85140);
    GMTrace.o(11427297361920L, 85140);
  }
  
  protected void c(aac paramaac)
  {
    int j = 0;
    GMTrace.i(11425686749184L, 85128);
    int i;
    if (paramaac != null)
    {
      if (paramaac != null) {
        break label86;
      }
      i = 0;
      if (paramaac != null) {
        break label94;
      }
    }
    for (;;)
    {
      w.d("MicroMsg.emoji.BaseEmojiStoreUI", "jacks save EmoijStoreUI Cache: list:%d, size: %d, type: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(arX()) });
      com.tencent.mm.plugin.emoji.model.h.arl().kjB.a(arX(), paramaac);
      GMTrace.o(11425686749184L, 85128);
      return;
      label86:
      i = paramaac.uqH;
      break;
      label94:
      if (paramaac.tQz != null) {
        j = paramaac.tQz.aYq();
      }
    }
  }
  
  public final void g(Message paramMessage)
  {
    GMTrace.i(11422599741440L, 85105);
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      GMTrace.o(11422599741440L, 85105);
      return;
      c((aac)paramMessage.obj);
      GMTrace.o(11422599741440L, 85105);
      return;
      ase();
      GMTrace.o(11422599741440L, 85105);
      return;
      paramMessage = (String)paramMessage.obj;
      if (isFinishing())
      {
        w.i("MicroMsg.emoji.BaseEmojiStoreUI", "[updateLoadingDialog] acitivity is finished.");
        GMTrace.o(11422599741440L, 85105);
        return;
      }
      if (this.kgz != null) {
        this.kgz.setMessage(paramMessage);
      }
    }
  }
  
  public void g(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    GMTrace.i(11426223620096L, 85132);
    w.d("MicroMsg.emoji.BaseEmojiStoreUI", "[onExchange] productId:[%s] status:[%d] progress:[%d] cdnClientId:[%s]", new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString2 });
    if ((this.kkx == null) || (this.kkx.kho == null))
    {
      GMTrace.o(11426223620096L, 85132);
      return;
    }
    if (paramInt1 == 6) {
      aO(paramString1, paramInt2);
    }
    for (;;)
    {
      paramString1 = this.kkx.kho.vH(paramString1);
      if (paramString1 != null) {
        paramString1.khD = paramString2;
      }
      GMTrace.o(11426223620096L, 85132);
      return;
      w.i("MicroMsg.emoji.BaseEmojiStoreUI", "product status:%d", new Object[] { Integer.valueOf(paramInt1) });
      aN(paramString1, paramInt1);
    }
  }
  
  protected int getLayoutId()
  {
    GMTrace.i(11420720693248L, 85091);
    int i = R.i.cuI;
    GMTrace.o(11420720693248L, 85091);
    return i;
  }
  
  public void h(Message paramMessage)
  {
    GMTrace.i(11422733959168L, 85106);
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      GMTrace.o(11422733959168L, 85106);
      return;
      if (this.kkx == null)
      {
        GMTrace.o(11422733959168L, 85106);
        return;
      }
      this.kkx.notifyDataSetChanged();
      ash();
      GMTrace.o(11422733959168L, 85106);
      return;
      if ((this.kkx == null) || (paramMessage.getData() == null))
      {
        GMTrace.o(11422733959168L, 85106);
        return;
      }
      String str = paramMessage.getData().getString("product_id");
      if (str == null)
      {
        GMTrace.o(11422733959168L, 85106);
        return;
      }
      int i = paramMessage.getData().getInt("progress");
      this.kkx.aO(str, i);
      GMTrace.o(11422733959168L, 85106);
      return;
      if ((this.kkx == null) || (paramMessage.getData() == null))
      {
        GMTrace.o(11422733959168L, 85106);
        return;
      }
      str = paramMessage.getData().getString("product_id");
      if (str == null)
      {
        GMTrace.o(11422733959168L, 85106);
        return;
      }
      i = paramMessage.getData().getInt("status");
      this.kkx.aN(str, i);
    }
  }
  
  protected final void m(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(11422331305984L, 85103);
    this.knj = true;
    if (paramBoolean1) {
      this.knk.setVisibility(0);
    }
    Object localObject = this.knl;
    int i = arX();
    int j = arZ();
    int k = arY();
    com.tencent.mm.plugin.emoji.f.n localn;
    if (localObject != null)
    {
      w.i("MicroMsg.emoji.BaseEmojiStoreUI", "[startLoadRemoteEmoji] request buffer %s", new Object[] { localObject.toString() });
      localn = new com.tencent.mm.plugin.emoji.f.n(i, (byte[])localObject, j);
      localObject = localn;
      if (i == 7)
      {
        localn.klN = k;
        localObject = localn;
      }
    }
    for (;;)
    {
      this.knv = ((com.tencent.mm.plugin.emoji.f.n)localObject);
      at.wS().a(this.knv, 0);
      w.i("MicroMsg.emoji.BaseEmojiStoreUI", "[startLoadRemoteEmoji] doScene GetEmotionListNetScene");
      if ((!paramBoolean1) && (!paramBoolean2)) {
        asd();
      }
      GMTrace.o(11422331305984L, 85103);
      return;
      w.i("MicroMsg.emoji.BaseEmojiStoreUI", "[startLoadRemoteEmoji] request buffer is null.");
      localn = new com.tencent.mm.plugin.emoji.f.n(i, j);
      localObject = localn;
      if (i == 7)
      {
        localn.klN = k;
        localObject = localn;
      }
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(11427028926464L, 85138);
    w.d("MicroMsg.emoji.BaseEmojiStoreUI", "onActivityResult . requestCode:" + paramInt1 + "  resultCode:" + paramInt2);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    this.kny.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(11427028926464L, 85138);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11420183822336L, 85087);
    super.onCreate(paramBundle);
    this.kny = new com.tencent.mm.plugin.emoji.model.g();
    MP();
    this.knw = getIntent().getIntExtra("preceding_scence", 2);
    if (com.tencent.mm.plugin.emoji.model.h.arl().kjz != null) {
      com.tencent.mm.plugin.emoji.model.h.arl().kjz.c(this);
    }
    this.knA = new a((byte)0);
    com.tencent.mm.sdk.b.a.vgX.b(this.knA);
    this.kny.iPn = this;
    this.kny.kkx = this.kkx;
    this.kny.kkA = arO();
    this.kny.kkD = this;
    boolean bool2 = asf();
    boolean bool1 = bool2;
    if (bool2) {
      bool1 = asc();
    }
    m(false, bool1);
    if (knz == null) {
      knz = new HashMap();
    }
    long l = System.currentTimeMillis();
    w.d("MicroMsg.emoji.BaseEmojiStoreUI", "refresh last net refresh time: %d", new Object[] { Long.valueOf(l) });
    knz.put(getClass().toString(), Long.valueOf(l));
    this.kkF = new com.tencent.mm.plugin.emoji.h.b(1005);
    GMTrace.o(11420183822336L, 85087);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11420586475520L, 85090);
    super.onDestroy();
    if (this.kkx != null)
    {
      this.kkx.clear();
      this.kkx = null;
    }
    if ((arU()) && (this.knc != null)) {
      this.knc.clear();
    }
    com.tencent.mm.plugin.emoji.model.h.arl().kjz.j(this);
    com.tencent.mm.sdk.b.a.vgX.c(this.knA);
    at.wS().c(this.knB);
    if (this.kny != null)
    {
      com.tencent.mm.plugin.emoji.model.g localg = this.kny;
      localg.kkx = null;
      localg.kkD = null;
      localg.iPn = null;
    }
    GMTrace.o(11420586475520L, 85090);
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(11420989128704L, 85093);
    int i;
    if (!arU())
    {
      i = paramInt;
      if (!arV()) {}
    }
    else
    {
      if (paramInt == 0)
      {
        GMTrace.o(11420989128704L, 85093);
        return;
      }
      i = paramInt - 1;
    }
    if ((i < 0) || (i >= this.kkx.getCount()))
    {
      GMTrace.o(11420989128704L, 85093);
      return;
    }
    paramAdapterView = this.kkx.mC(i);
    if (paramAdapterView == null)
    {
      w.i("MicroMsg.emoji.BaseEmojiStoreUI", "item is null.");
      GMTrace.o(11420989128704L, 85093);
      return;
    }
    if (paramAdapterView.khz == f.a.khI)
    {
      paramAdapterView = paramAdapterView.khB;
      if (paramAdapterView == null)
      {
        w.i("MicroMsg.emoji.BaseEmojiStoreUI", "banner set is null. do nothing");
        GMTrace.o(11420989128704L, 85093);
        return;
      }
      m.a(this.vKB.vKW, paramAdapterView, false);
      GMTrace.o(11420989128704L, 85093);
      return;
    }
    paramView = paramAdapterView.khA;
    if (paramView == null)
    {
      w.i("MicroMsg.emoji.BaseEmojiStoreUI", "summary is null. do nothing");
      GMTrace.o(11420989128704L, 85093);
      return;
    }
    String str = getIntent().getStringExtra("to_talker_name");
    m.a(this.vKB.vKW, paramView, arO(), paramAdapterView.mStatus, paramAdapterView.rr, str, arP());
    GMTrace.o(11420989128704L, 85093);
  }
  
  protected void onPause()
  {
    GMTrace.i(11420452257792L, 85089);
    super.onPause();
    at.wS().b(411, this);
    at.wS().b(423, this);
    at.wS().b(413, this);
    at.wS().b(717, this);
    asa();
    if ((arU()) && (this.knc != null)) {
      this.knc.asQ();
    }
    GMTrace.o(11420452257792L, 85089);
  }
  
  protected void onResume()
  {
    GMTrace.i(11420318040064L, 85088);
    super.onResume();
    at.wS().a(411, this);
    at.wS().a(423, this);
    at.wS().a(413, this);
    at.wS().a(717, this);
    if ((arU()) && (this.knc != null)) {
      this.knc.asP();
    }
    this.kny.kky = false;
    if ((this.kkx != null) && (this.kkx.kho != null))
    {
      this.kkx.kho.aqp();
      this.kkx.anc();
    }
    GMTrace.o(11420318040064L, 85088);
  }
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(11423136612352L, 85109);
    GMTrace.o(11423136612352L, 85109);
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    GMTrace.i(11423270830080L, 85110);
    if ((paramInt == 0) && (paramAbsListView.getLastVisiblePosition() == paramAbsListView.getCount() - 1))
    {
      if ((this.kni == 0) || (this.knj))
      {
        w.d("MicroMsg.emoji.BaseEmojiStoreUI", "No More List.");
        GMTrace.o(11423270830080L, 85110);
        return;
      }
      m(true, false);
      w.i("MicroMsg.emoji.BaseEmojiStoreUI", "[onScrollStateChanged] startLoadRemoteEmoji.");
    }
    GMTrace.o(11423270830080L, 85110);
  }
  
  protected void wq(String paramString)
  {
    GMTrace.i(11421660217344L, 85098);
    GMTrace.o(11421660217344L, 85098);
  }
  
  public final void x(ArrayList<com.tencent.mm.pluginsdk.model.p> paramArrayList)
  {
    GMTrace.i(11426626273280L, 85135);
    w.d("MicroMsg.emoji.BaseEmojiStoreUI", "google [onQueryFinish]");
    if (this.kkx == null)
    {
      GMTrace.o(11426626273280L, 85135);
      return;
    }
    com.tencent.mm.plugin.emoji.a.a.b.a(paramArrayList, this.kkx.kho);
    if (this.koj != null)
    {
      this.koj.removeMessages(131074);
      this.koj.sendEmptyMessage(131074);
    }
    GMTrace.o(11426626273280L, 85135);
  }
  
  private final class a
    extends com.tencent.mm.sdk.b.c<cs>
  {
    private a()
    {
      GMTrace.i(11365959860224L, 84683);
      this.vhf = cs.class.getName().hashCode();
      GMTrace.o(11365959860224L, 84683);
    }
  }
  
  private final class b
    implements MenuItem.OnMenuItemClickListener
  {
    public b()
    {
      GMTrace.i(11371328569344L, 84723);
      GMTrace.o(11371328569344L, 84723);
    }
    
    public final boolean onMenuItemClick(MenuItem paramMenuItem)
    {
      GMTrace.i(11371462787072L, 84724);
      BaseEmojiStoreUI.this.finish();
      GMTrace.o(11371462787072L, 84724);
      return true;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\BaseEmojiStoreUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
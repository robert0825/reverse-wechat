package com.tencent.mm.plugin.emoji.ui.v2;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.d;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.cs;
import com.tencent.mm.plugin.emoji.a.a.f;
import com.tencent.mm.plugin.emoji.a.a.f.a;
import com.tencent.mm.plugin.emoji.e.m;
import com.tencent.mm.plugin.emoji.model.g.a;
import com.tencent.mm.plugin.emoji.model.g.b;
import com.tencent.mm.plugin.emoji.ui.EmojiMineUI;
import com.tencent.mm.plugin.emoji.ui.EmojiStoreVpHeader;
import com.tencent.mm.protocal.c.aac;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.qw;
import com.tencent.mm.protocal.c.qy;
import com.tencent.mm.protocal.c.rh;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.MMPullDownView.c;
import com.tencent.mm.ui.base.MMPullDownView.d;
import com.tencent.mm.ui.base.MMPullDownView.e;
import com.tencent.mm.ui.i;
import com.tencent.mm.ui.u;
import com.tencent.mm.ui.v;
import com.tencent.mm.v.a.e;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class a
  extends u
  implements AbsListView.OnScrollListener, AdapterView.OnItemClickListener, com.tencent.mm.ad.e, com.tencent.mm.plugin.emoji.a.h.a, g.a, g.b, com.tencent.mm.pluginsdk.model.h.a, j.a, MMPullDownView.c, MMPullDownView.d, MMPullDownView.e
{
  ListView Ev;
  private ActionBar FM;
  private View iTN;
  private ProgressDialog kgz;
  com.tencent.mm.plugin.emoji.a.a.a kkx;
  private com.tencent.mm.sdk.b.c knA;
  private com.tencent.mm.plugin.emoji.f.g knB;
  private boolean knC;
  private LinkedList<qw> knD;
  private LinkedList<qy> knE;
  EmojiStoreVpHeader knc;
  private MMPullDownView knf;
  private TextView kng;
  private int kni;
  private boolean knj;
  private View knk;
  private byte[] knl;
  private final int knp;
  private final int knq;
  private final int knr;
  private final String kns;
  private final String knt;
  private final String knu;
  private com.tencent.mm.plugin.emoji.f.n knv;
  private int knw;
  private com.tencent.mm.plugin.emoji.model.e knx;
  private com.tencent.mm.plugin.emoji.model.g kny;
  private final int krR;
  private com.tencent.mm.ui.b krS;
  public EmojiStoreV2HotBarView krT;
  private boolean krU;
  private boolean krV;
  private boolean krW;
  private ae krX;
  public MenuItem.OnMenuItemClickListener krY;
  
  public a()
  {
    GMTrace.i(11497493233664L, 85663);
    this.kns = "product_id";
    this.knt = "progress";
    this.knu = "status";
    this.knp = 131074;
    this.knq = 131075;
    this.knr = 131076;
    this.krR = 131077;
    this.kni = -1;
    this.knD = new LinkedList();
    this.knE = new LinkedList();
    this.knC = false;
    this.krU = false;
    this.krV = false;
    this.krW = false;
    this.krX = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(11534537326592L, 85939);
        a locala = a.this;
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(11534537326592L, 85939);
          return;
          if (locala.kkx != null)
          {
            locala.kkx.notifyDataSetChanged();
            GMTrace.o(11534537326592L, 85939);
            return;
            if ((locala.kkx == null) || (paramAnonymousMessage.getData() == null))
            {
              GMTrace.o(11534537326592L, 85939);
              return;
            }
            String str = paramAnonymousMessage.getData().getString("product_id");
            if (str != null)
            {
              int i = paramAnonymousMessage.getData().getInt("progress");
              locala.kkx.aO(str, i);
              GMTrace.o(11534537326592L, 85939);
              return;
              if ((locala.kkx == null) || (paramAnonymousMessage.getData() == null))
              {
                GMTrace.o(11534537326592L, 85939);
                return;
              }
              str = paramAnonymousMessage.getData().getString("product_id");
              if (str != null)
              {
                i = paramAnonymousMessage.getData().getInt("status");
                locala.kkx.aN(str, i);
                GMTrace.o(11534537326592L, 85939);
                return;
                if (locala.knc != null) {
                  locala.knc.asP();
                }
              }
            }
          }
        }
      }
    };
    this.knA = new com.tencent.mm.sdk.b.c() {};
    this.krY = new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11535745286144L, 85948);
        a.this.bWQ().finish();
        GMTrace.o(11535745286144L, 85948);
        return false;
      }
    };
    GMTrace.o(11497493233664L, 85663);
  }
  
  private void a(int paramInt, com.tencent.mm.plugin.emoji.model.e parame)
  {
    int j = 1;
    int i = 0;
    GMTrace.i(11499909152768L, 85681);
    w.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "");
    switch (paramInt)
    {
    default: 
      paramInt = 0;
      if (this.knx != null) {
        this.knx.arc();
      }
      if ((this.knx != null) && (i != 0)) {
        if (paramInt != 0)
        {
          if (this.knx != null) {
            break label206;
          }
          w.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "update store ui header failed. ");
        }
      }
      break;
    }
    for (;;)
    {
      if (this.kkx != null) {
        this.kkx.b(this.knx);
      }
      GMTrace.o(11499909152768L, 85681);
      return;
      this.knx = parame;
      i = 1;
      paramInt = j;
      break;
      this.knx = parame;
      i = 1;
      paramInt = 0;
      break;
      this.knx = parame;
      paramInt = 0;
      break;
      if (this.knx == null) {
        this.knx = new com.tencent.mm.plugin.emoji.model.e();
      }
      this.knx.mH(parame.kkn);
      this.knx.aq(parame.kko);
      i = 1;
      paramInt = 0;
      break;
      label206:
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
  
  private void a(f paramf, int paramInt)
  {
    GMTrace.i(11501251330048L, 85691);
    if (paramf == null)
    {
      w.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "item is null.");
      GMTrace.o(11501251330048L, 85691);
      return;
    }
    if (paramf.khz == f.a.khI)
    {
      paramf = paramf.khB;
      if (paramf == null)
      {
        w.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "banner set is null. do nothing");
        GMTrace.o(11501251330048L, 85691);
        return;
      }
      m.a(this.vKB.vKW, paramf, false);
      GMTrace.o(11501251330048L, 85691);
      return;
    }
    rh localrh = paramf.khA;
    if (localrh == null)
    {
      w.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "summary is null. do nothing");
      GMTrace.o(11501251330048L, 85691);
      return;
    }
    if (asX()) {
      if ((paramInt >= 0) && (paramInt < this.kkx.aqj())) {
        paramInt = 3;
      }
    }
    for (;;)
    {
      String str = bWQ().getIntent().getStringExtra("to_talker_name");
      m.a(this.vKB.vKW, localrh, paramInt, paramf.mStatus, paramf.rr, str, 5);
      GMTrace.o(11501251330048L, 85691);
      return;
      if ((paramInt >= this.kkx.aqj()) && (paramInt < this.kkx.aqk() + this.kkx.aqj()))
      {
        paramInt = 19;
      }
      else
      {
        paramInt = 1;
        continue;
        paramInt = 2;
      }
    }
  }
  
  private void ag(byte[] paramArrayOfByte)
  {
    GMTrace.i(11499506499584L, 85678);
    int j = arX();
    if (this.knw == 1) {}
    for (int i = 1; paramArrayOfByte != null; i = 2)
    {
      w.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[refreshNetSceneGetEmotionList] request buffer %s", new Object[] { paramArrayOfByte.toString() });
      this.knv = new com.tencent.mm.plugin.emoji.f.n(j, paramArrayOfByte, i);
      GMTrace.o(11499506499584L, 85678);
      return;
    }
    w.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[refreshNetSceneGetEmotionList] request buffer is null.");
    this.knv = new com.tencent.mm.plugin.emoji.f.n(j, i);
    GMTrace.o(11499506499584L, 85678);
  }
  
  private void arW()
  {
    GMTrace.i(11500043370496L, 85682);
    com.tencent.mm.plugin.emoji.a.a.b.a(this.kkx.kho, this);
    GMTrace.o(11500043370496L, 85682);
  }
  
  private void asU()
  {
    int j = 0;
    GMTrace.i(11499238064128L, 85676);
    this.krV = true;
    this.kny = new com.tencent.mm.plugin.emoji.model.g();
    this.kny.iPn = bWQ();
    this.kny.kkz = this;
    this.kny.kkx = this.kkx;
    aac localaac;
    int k;
    int i;
    if (asX())
    {
      this.kny.kkA = 1;
      this.kny.kkD = this;
      this.knw = bWQ().getIntent().getIntExtra("preceding_scence", 5);
      localaac = com.tencent.mm.plugin.emoji.model.h.arl().kjB.AF(arX());
      com.tencent.mm.plugin.emoji.model.e locale = com.tencent.mm.plugin.emoji.f.n.a(localaac);
      k = arX();
      if (localaac != null) {
        break label363;
      }
      i = 0;
      label132:
      w.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "load cache type: %d, size: %d ", new Object[] { Integer.valueOf(k), Integer.valueOf(i) });
      i = j;
      if (locale != null)
      {
        i = j;
        if (locale.kko.size() > 0)
        {
          this.knC = true;
          this.iTN.setVisibility(8);
          this.knf.setVisibility(0);
          a(this.kni, locale);
          if (localaac == null) {
            break label399;
          }
          if (localaac.uqT != null) {
            break label372;
          }
          i = 0;
          label227:
          j = localaac.uqQ;
          int m = localaac.uqR;
          k = i;
          i = m;
        }
      }
    }
    for (;;)
    {
      w.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "load cache hotcount:%d type:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(arX()) });
      if ((this.kkx != null) && (asX()))
      {
        this.kkx.mz(j + k);
        this.kkx.mA(i);
      }
      arW();
      i = 1;
      if ((i != 0) && (this.krX != null))
      {
        this.krX.postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(11506485821440L, 85730);
            a.this.dV(false);
            GMTrace.o(11506485821440L, 85730);
          }
        }, 3000L);
        GMTrace.o(11499238064128L, 85676);
        return;
        this.kny.kkA = 2;
        break;
        label363:
        i = localaac.uqH;
        break label132;
        label372:
        i = localaac.uqT.size();
        break label227;
      }
      dV(true);
      GMTrace.o(11499238064128L, 85676);
      return;
      label399:
      i = 0;
      j = 0;
      k = 0;
    }
  }
  
  private void asV()
  {
    GMTrace.i(11499640717312L, 85679);
    at.wS().a(this.knv, 0);
    GMTrace.o(11499640717312L, 85679);
  }
  
  private static boolean asW()
  {
    GMTrace.i(11499774935040L, 85680);
    at.AR();
    ((Long)com.tencent.mm.y.c.xh().get(w.a.vqd, Long.valueOf(0L))).longValue();
    GMTrace.o(11499774935040L, 85680);
    return true;
  }
  
  protected static void asa()
  {
    GMTrace.i(11502459289600L, 85700);
    GMTrace.o(11502459289600L, 85700);
  }
  
  private void d(final aac paramaac)
  {
    GMTrace.i(11500714459136L, 85687);
    if (this.kni == -1) {
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          int j = 0;
          GMTrace.i(11478568534016L, 85522);
          int i;
          if (paramaac != null)
          {
            if (paramaac != null) {
              break label101;
            }
            i = 0;
            if (paramaac != null) {
              break label112;
            }
          }
          for (;;)
          {
            w.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "jacks save EmoijStoreUI Cache: list:%d, size: %d, type: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(a.this.arX()) });
            com.tencent.mm.plugin.emoji.model.h.arl().kjB.a(a.this.arX(), paramaac);
            GMTrace.o(11478568534016L, 85522);
            return;
            label101:
            i = paramaac.uqH;
            break;
            label112:
            if (paramaac.tQz != null) {
              j = paramaac.tQz.aYq();
            }
          }
        }
      });
    }
    GMTrace.o(11500714459136L, 85687);
  }
  
  private void dW(boolean paramBoolean)
  {
    GMTrace.i(11502056636416L, 85697);
    if (this.knj)
    {
      w.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "isLoading");
      GMTrace.o(11502056636416L, 85697);
      return;
    }
    this.knj = true;
    if (paramBoolean) {
      this.knk.setVisibility(0);
    }
    ag(this.knl);
    asV();
    w.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[startLoadRemoteEmoji] doScene GetEmotionListNetScene");
    if (!paramBoolean) {
      wt(getString(R.l.cUV));
    }
    GMTrace.o(11502056636416L, 85697);
  }
  
  private void wt(String paramString)
  {
    GMTrace.i(11502325071872L, 85699);
    if (isFinishing())
    {
      w.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[showLoadingDialog] acitivity is finished.");
      GMTrace.o(11502325071872L, 85699);
      return;
    }
    FragmentActivity localFragmentActivity = bWQ();
    getString(R.l.cUG);
    this.kgz = com.tencent.mm.ui.base.h.a(localFragmentActivity, paramString, true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(11485145202688L, 85571);
        a.asa();
        GMTrace.o(11485145202688L, 85571);
      }
    });
    GMTrace.o(11502325071872L, 85699);
  }
  
  public final void H(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(11501788200960L, 85695);
    this.knB = new com.tencent.mm.plugin.emoji.f.g(paramString1, paramString2, paramString3);
    at.wS().a(this.knB, 0);
    GMTrace.o(11501788200960L, 85695);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(11500177588224L, 85683);
    w.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onSceneEnd errType:%d,errCode:%d,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((this.kgz != null) && (this.kgz.isShowing())) {
      this.kgz.dismiss();
    }
    int n = paramk.getType();
    switch (n)
    {
    default: 
      w.w("MicroMsg.emoji.EmojiStoreV2BaseFragment", "unknow scene type.");
    }
    do
    {
      GMTrace.o(11500177588224L, 85683);
      return;
      paramString = (com.tencent.mm.plugin.emoji.f.n)paramk;
    } while ((paramString == null) || (paramString.mType != arX()));
    int j = 0;
    int m;
    int k;
    if ((paramString != null) && (paramString.arB() != null))
    {
      i = j;
      if (this.kkx.aql() <= 0)
      {
        i = j;
        if (asX())
        {
          if (paramString.arB().uqT != null) {
            break label556;
          }
          i = 0;
          this.kkx.mB(i);
        }
      }
      j = paramString.arB().uqQ;
      m = paramString.arB().uqR;
      k = i;
    }
    for (int i = m;; i = 0)
    {
      w.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onSceneEnd setSize:%d hotcount:%d recentHotCount:%d type:%d getSceneType:%d", new Object[] { Integer.valueOf(k), Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(n), Integer.valueOf(paramString.mType) });
      if ((this.kkx != null) && (this.kkx.aqk() <= 0) && (asX()))
      {
        this.kkx.mz(j + this.kkx.aql());
        this.kkx.mA(i);
      }
      this.knj = false;
      this.knk.setVisibility(8);
      label347:
      Object localObject;
      if ((paramInt1 == 0) || (paramInt1 == 4))
      {
        paramInt1 = 1;
        if (paramInt1 == 0) {
          break label669;
        }
        this.iTN.setVisibility(8);
        this.knf.setVisibility(0);
        localObject = (com.tencent.mm.plugin.emoji.f.n)paramk;
        paramk = com.tencent.mm.plugin.emoji.f.n.a(((com.tencent.mm.plugin.emoji.f.n)localObject).arB());
        this.knl = ((com.tencent.mm.plugin.emoji.f.n)localObject).klL;
        if (paramInt2 != 0) {
          break label576;
        }
        localObject = ((com.tencent.mm.plugin.emoji.f.n)localObject).arB();
        a(this.kni, paramk);
        d((aac)localObject);
        this.kni = 0;
      }
      for (;;)
      {
        label426:
        if (asX())
        {
          if ((paramString.arB() != null) && (paramString.arB().uqT != null) && (paramString.arB().uqT.size() > 0))
          {
            paramInt1 = 0;
            for (;;)
            {
              if (paramInt1 < paramString.arB().uqT.size())
              {
                com.tencent.mm.plugin.report.service.g.ork.i(13223, new Object[] { Integer.valueOf(0), Integer.valueOf(((qy)paramString.arB().uqT.get(paramInt1)).etB), ((qy)paramString.arB().uqT.get(paramInt1)).eBt, Integer.valueOf(0) });
                paramInt1 += 1;
                continue;
                label556:
                i = paramString.arB().uqT.size();
                break;
                paramInt1 = 0;
                break label347;
                label576:
                if (paramInt2 == 2)
                {
                  localObject = ((com.tencent.mm.plugin.emoji.f.n)localObject).arB();
                  a(this.kni, paramk);
                  arW();
                  d((aac)localObject);
                  this.kni = 2;
                  break label426;
                }
                if (paramInt2 == 3)
                {
                  a(this.kni, paramk);
                  this.kni = 1;
                  break label426;
                }
                this.iTN.setVisibility(0);
                this.knf.setVisibility(8);
                this.kng.setText(R.l.doI);
                break label426;
                label669:
                if (this.knC) {
                  break label426;
                }
                this.iTN.setVisibility(0);
                this.knf.setVisibility(8);
                this.kng.setText(R.l.doJ);
                break label426;
              }
            }
          }
          if ((paramString.arB().uqR > 0) && (paramString.arB().uqI != null) && (paramString.arB().uqI.size() > paramString.arB().uqQ + paramString.arB().uqR))
          {
            paramInt1 = 0;
            while (paramInt1 < paramString.arB().uqR)
            {
              com.tencent.mm.plugin.report.service.g.ork.i(13223, new Object[] { Integer.valueOf(0), ((rh)paramString.arB().uqI.get(paramString.arB().uqQ + paramInt1)).tRS, ((rh)paramString.arB().uqI.get(paramString.arB().uqQ + paramInt1)).uhe, Integer.valueOf(1) });
              paramInt1 += 1;
            }
          }
        }
      }
      GMTrace.o(11500177588224L, 85683);
      return;
      j = 0;
      k = 0;
    }
  }
  
  public final void a(com.tencent.mm.plugin.emoji.a.a parama)
  {
    GMTrace.i(11500848676864L, 85688);
    if (parama.apZ() == 9) {
      wt(getString(R.l.cUK));
    }
    if (asX()) {
      if ((parama.jP >= 0) && (parama.jP < this.kkx.aqj())) {
        this.kny.kkA = 3;
      }
    }
    for (;;)
    {
      this.kny.a(parama);
      GMTrace.o(11500848676864L, 85688);
      return;
      if ((parama.jP >= this.kkx.aqj()) && (parama.jP < this.kkx.aqk() + this.kkx.aqj()))
      {
        this.kny.kkA = 19;
      }
      else
      {
        this.kny.kkA = 1;
        continue;
        this.kny.kkA = 2;
      }
    }
  }
  
  public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    GMTrace.i(11503130378240L, 85705);
    if ((!TextUtils.isEmpty(paramString)) && (paramString.equals("delete_group")) && (this.krX != null)) {
      this.krX.sendEmptyMessageDelayed(131074, 50L);
    }
    GMTrace.o(11503130378240L, 85705);
  }
  
  public final boolean aoX()
  {
    GMTrace.i(11500311805952L, 85684);
    w.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[onBottomLoadData] startLoadRemoteEmoji.");
    dW(true);
    GMTrace.o(11500311805952L, 85684);
    return true;
  }
  
  public final boolean aoY()
  {
    GMTrace.i(11500446023680L, 85685);
    GMTrace.o(11500446023680L, 85685);
    return false;
  }
  
  public final boolean aoZ()
  {
    GMTrace.i(11500580241408L, 85686);
    GMTrace.o(11500580241408L, 85686);
    return false;
  }
  
  public abstract com.tencent.mm.plugin.emoji.a.a.a arQ();
  
  public abstract int arX();
  
  public final void ard()
  {
    GMTrace.i(11501922418688L, 85696);
    this.knl = null;
    this.kni = -1;
    dW(false);
    GMTrace.o(11501922418688L, 85696);
  }
  
  public abstract boolean asX();
  
  public final void dV(boolean paramBoolean)
  {
    GMTrace.i(11499372281856L, 85677);
    w.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "loadNetWork force:%b isNeedToRefresh:%b", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(asW()) });
    if (!paramBoolean) {
      asW();
    }
    ag(this.knl);
    asV();
    GMTrace.o(11499372281856L, 85677);
  }
  
  public final void i(Message paramMessage)
  {
    GMTrace.i(11502190854144L, 85698);
    if (this.krX != null) {
      this.krX.sendMessage(paramMessage);
    }
    GMTrace.o(11502190854144L, 85698);
  }
  
  public final void kt(int paramInt)
  {
    GMTrace.i(11501117112320L, 85690);
    if ((paramInt < 0) || (paramInt >= ((com.tencent.mm.plugin.emoji.a.h)this.kkx).aqn()))
    {
      GMTrace.o(11501117112320L, 85690);
      return;
    }
    a(this.kkx.mC(paramInt), paramInt);
    GMTrace.o(11501117112320L, 85690);
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    GMTrace.i(11498030104576L, 85667);
    w.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onActivityCreated");
    super.onActivityCreated(paramBundle);
    this.krW = true;
    this.kkx = arQ();
    this.kkx.khp = this;
    this.iTN = findViewById(R.h.empty);
    this.kng = ((TextView)this.iTN.findViewById(R.h.bwy));
    this.knk = bWQ().getLayoutInflater().inflate(R.i.cuH, null);
    this.knk.setVisibility(8);
    this.knc = new EmojiStoreVpHeader(this.vKB.vKW);
    this.Ev = ((ListView)findViewById(16908298));
    this.Ev.addHeaderView(this.knc);
    if (!asX())
    {
      this.krT = new EmojiStoreV2HotBarView(this.vKB.vKW);
      paramBundle = this.krT;
      if (paramBundle.ksM != null) {
        paramBundle.ksM.setVisibility(8);
      }
      paramBundle = this.krT;
      if (paramBundle.ksK != null)
      {
        int i = com.tencent.mm.br.a.V(paramBundle.getContext(), R.f.aQt);
        int j = com.tencent.mm.br.a.V(paramBundle.getContext(), R.f.aQw);
        int k = com.tencent.mm.br.a.V(paramBundle.getContext(), R.f.aQE);
        paramBundle.ksK.setPadding(k, i, k, j);
      }
      this.Ev.addHeaderView(this.krT);
    }
    this.Ev.addFooterView(this.knk);
    this.Ev.setAdapter(this.kkx);
    if (asX()) {
      this.Ev.setOnItemClickListener(this);
    }
    for (;;)
    {
      this.Ev.setOnScrollListener(this);
      this.Ev.setLongClickable(false);
      this.Ev.setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(11535476850688L, 85946);
          GMTrace.o(11535476850688L, 85946);
          return false;
        }
      });
      this.kkx.khn = this.Ev;
      this.knf = ((MMPullDownView)findViewById(R.h.bKw));
      if (this.knf != null)
      {
        this.knf.lG(false);
        this.knf.wea = this;
        this.knf.wdO = this;
        this.knf.wdZ = this;
        this.knf.lF(false);
        this.knf.lE(false);
        this.knf.wek = true;
      }
      if (this.krU) {
        asU();
      }
      GMTrace.o(11498030104576L, 85667);
      return;
      ((com.tencent.mm.plugin.emoji.a.h)this.kkx).kgY = this;
    }
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(11501653983232L, 85694);
    w.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onActivityResult . requestCode:" + paramInt1 + "  resultCode:" + paramInt2);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (this.kny != null)
    {
      this.kny.onActivityResult(paramInt1, paramInt2, paramIntent);
      GMTrace.o(11501653983232L, 85694);
      return;
    }
    w.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "mPayOrDownloadComponent have no init.");
    GMTrace.o(11501653983232L, 85694);
  }
  
  public void onAttach(Activity paramActivity)
  {
    GMTrace.i(11497627451392L, 85664);
    super.onAttach(paramActivity);
    w.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onAttach");
    GMTrace.o(11497627451392L, 85664);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(11503264595968L, 85706);
    super.onConfigurationChanged(paramConfiguration);
    if (this.knc != null) {
      this.knc.requestLayout();
    }
    setRequestedOrientation(1);
    GMTrace.o(11503264595968L, 85706);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11497761669120L, 85665);
    super.onCreate(paramBundle);
    setRequestedOrientation(1);
    this.FM = ((ActionBarActivity)bWQ()).cN().cO();
    paramBundle = v.fb(this.vKB.vKW).inflate(R.i.coP, null);
    this.krS = new com.tencent.mm.ui.b(paramBundle);
    this.FM.setLogo(new ColorDrawable(getResources().getColor(17170445)));
    this.FM.cJ();
    this.FM.setDisplayHomeAsUpEnabled(false);
    this.FM.cI();
    this.FM.cK();
    this.FM.setCustomView(paramBundle);
    this.FM.show();
    paramBundle = this.krS;
    int i = R.l.dou;
    paramBundle.hqH.setText(i);
    if (com.tencent.mm.br.a.ed(paramBundle.hqH.getContext()))
    {
      TextView localTextView = paramBundle.hqH;
      float f = com.tencent.mm.br.a.W(paramBundle.hqH.getContext(), a.e.aPt);
      localTextView.setTextSize(0, com.tencent.mm.br.a.eb(paramBundle.hqH.getContext()) * f);
    }
    this.krS.h(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11507827998720L, 85740);
        if (!a.this.vKB.vKM)
        {
          GMTrace.o(11507827998720L, 85740);
          return;
        }
        if (a.this.krY != null) {
          a.this.krY.onMenuItemClick(null);
        }
        GMTrace.o(11507827998720L, 85740);
      }
    });
    lg(true);
    a(0, R.k.cIU, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11475213090816L, 85497);
        paramAnonymousMenuItem = new Intent();
        paramAnonymousMenuItem.setClass(a.this.bWQ(), EmojiMineUI.class);
        a.this.startActivity(paramAnonymousMenuItem);
        GMTrace.o(11475213090816L, 85497);
        return false;
      }
    });
    com.tencent.mm.sdk.b.a.vgX.b(this.knA);
    com.tencent.mm.plugin.emoji.model.h.arl().kjz.c(this);
    GMTrace.o(11497761669120L, 85665);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    GMTrace.i(11497895886848L, 85666);
    w.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onCreateView");
    paramLayoutInflater = paramLayoutInflater.inflate(getLayoutId(), paramViewGroup, false);
    GMTrace.o(11497895886848L, 85666);
    return paramLayoutInflater;
  }
  
  public void onDestroy()
  {
    GMTrace.i(11498969628672L, 85674);
    super.onDestroy();
    w.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onDestroy");
    if (this.kkx != null)
    {
      this.kkx.clear();
      this.kkx = null;
    }
    if (this.knc != null)
    {
      this.knc.asQ();
      this.knc.clear();
    }
    com.tencent.mm.sdk.b.a.vgX.c(this.knA);
    com.tencent.mm.plugin.emoji.model.h.arl().kjz.j(this);
    GMTrace.o(11498969628672L, 85674);
  }
  
  public void onDestroyView()
  {
    GMTrace.i(11498835410944L, 85673);
    super.onDestroyView();
    w.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onResume");
    GMTrace.o(11498835410944L, 85673);
  }
  
  public void onDetach()
  {
    GMTrace.i(11499103846400L, 85675);
    super.onDetach();
    w.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onDetach");
    GMTrace.o(11499103846400L, 85675);
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(11500982894592L, 85689);
    paramInt -= this.Ev.getHeaderViewsCount();
    if ((paramInt < 0) || (paramInt >= this.kkx.getCount()))
    {
      GMTrace.o(11500982894592L, 85689);
      return;
    }
    paramAdapterView = this.kkx.mC(paramInt);
    a(paramAdapterView, paramInt);
    if ((asX()) && (this.kkx.aqk() > 0) && (paramInt >= this.kkx.aqj()) && (paramInt < this.kkx.aqj() + this.kkx.aqk()) && (paramAdapterView.khA != null)) {
      com.tencent.mm.plugin.report.service.g.ork.i(13223, new Object[] { Integer.valueOf(1), paramAdapterView.khA.tRS, paramAdapterView.khA.uhe, Integer.valueOf(1), Integer.valueOf(0) });
    }
    GMTrace.o(11500982894592L, 85689);
  }
  
  public void onPause()
  {
    GMTrace.i(11498566975488L, 85671);
    super.onPause();
    at.wS().b(411, this);
    at.wS().b(423, this);
    w.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onPause");
    if (this.knc != null) {
      this.knc.asQ();
    }
    if (this.krX != null) {
      this.krX.removeMessages(131077);
    }
    GMTrace.o(11498566975488L, 85671);
  }
  
  public void onResume()
  {
    GMTrace.i(11498298540032L, 85669);
    super.onResume();
    w.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onResume");
    at.wS().a(411, this);
    at.wS().a(423, this);
    if (this.krU)
    {
      if (this.krX != null) {
        this.krX.sendEmptyMessageDelayed(131077, 4000L);
      }
      if ((this.kkx != null) && (this.kkx.kho != null))
      {
        this.kkx.kho.aqp();
        this.kkx.anc();
      }
      at.AR();
      if (((Boolean)com.tencent.mm.y.c.xh().get(208900, Boolean.valueOf(false))).booleanValue())
      {
        ard();
        at.AR();
        com.tencent.mm.y.c.xh().set(208900, Boolean.valueOf(false));
      }
    }
    GMTrace.o(11498298540032L, 85669);
  }
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(11501385547776L, 85692);
    GMTrace.o(11501385547776L, 85692);
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    GMTrace.i(11501519765504L, 85693);
    if ((paramInt == 0) && (paramAbsListView.getLastVisiblePosition() == paramAbsListView.getCount() - 1))
    {
      if ((this.kni == 0) || (this.knj))
      {
        w.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "No More List.");
        GMTrace.o(11501519765504L, 85693);
        return;
      }
      dW(true);
      w.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[onScrollStateChanged] startLoadRemoteEmoji.");
    }
    GMTrace.o(11501519765504L, 85693);
  }
  
  public void onStart()
  {
    GMTrace.i(11498164322304L, 85668);
    super.onStart();
    w.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onStart");
    GMTrace.o(11498164322304L, 85668);
  }
  
  public void onStop()
  {
    GMTrace.i(11498701193216L, 85672);
    super.onStop();
    w.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onStop");
    GMTrace.o(11498701193216L, 85672);
  }
  
  public final void setUserVisibleHint(boolean paramBoolean)
  {
    GMTrace.i(11498432757760L, 85670);
    w.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "setUserVisibleHint :%b", new Object[] { Boolean.valueOf(paramBoolean) });
    super.setUserVisibleHint(paramBoolean);
    this.krU = paramBoolean;
    if ((!this.krV) && (this.krW)) {
      asU();
    }
    GMTrace.o(11498432757760L, 85670);
  }
  
  public final void x(ArrayList<com.tencent.mm.pluginsdk.model.p> paramArrayList)
  {
    GMTrace.i(11502996160512L, 85704);
    w.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "google [onQueryFinish]");
    if (this.kkx == null)
    {
      GMTrace.o(11502996160512L, 85704);
      return;
    }
    if (this.krX != null) {
      this.krX.sendEmptyMessageDelayed(131074, 50L);
    }
    com.tencent.mm.plugin.emoji.a.a.b.a(paramArrayList, this.kkx.kho);
    GMTrace.o(11502996160512L, 85704);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\v2\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
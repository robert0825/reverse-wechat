package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
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
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.sns.data.SnsCmdList;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.b.b;
import com.tencent.mm.plugin.sns.storage.f;
import com.tencent.mm.plugin.sns.storage.i;
import com.tencent.mm.plugin.sns.storage.j;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.c.ahh;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.beq;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import com.tencent.mm.ui.base.MMSlideDelView.e;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.o;
import com.tencent.mm.ui.o.a;
import com.tencent.mm.ui.v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SnsMsgUI
  extends MMActivity
  implements com.tencent.mm.ad.e, b.b
{
  private String gtf;
  private com.tencent.mm.sdk.platformtools.ae handler;
  private View iBW;
  private View jIq;
  private boolean jIr;
  private p.d jqg;
  private ListView mqO;
  private View mqQ;
  int pMi;
  private ao pPd;
  private SnsCmdList pSQ;
  private ar pYO;
  long pzi;
  private View.OnClickListener qcA;
  private j.a qcB;
  Runnable qcC;
  private a qcu;
  private boolean qcv;
  private boolean qcw;
  private boolean qcx;
  private r qcy;
  private int[] qcz;
  
  public SnsMsgUI()
  {
    GMTrace.i(8442563526656L, 62902);
    this.jIq = null;
    this.handler = com.tencent.mm.plugin.sns.model.ae.aDa();
    this.qcv = false;
    this.qcw = false;
    this.pSQ = new SnsCmdList();
    this.jIr = false;
    this.qcx = false;
    this.qcz = new int[2];
    this.qcA = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8339081658368L, 62131);
        if ((paramAnonymousView.getTag() instanceof ap))
        {
          SnsMsgUI.a(SnsMsgUI.this).a(paramAnonymousView, -1, null);
          GMTrace.o(8339081658368L, 62131);
          return;
        }
        if ((paramAnonymousView.getTag() instanceof i))
        {
          SnsMsgUI.a(SnsMsgUI.this, (i)paramAnonymousView.getTag());
          GMTrace.o(8339081658368L, 62131);
          return;
        }
        w.w("MicroMsg.SnsMsgUI", "v.getTag():" + paramAnonymousView.getTag());
        GMTrace.o(8339081658368L, 62131);
      }
    };
    this.jqg = new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(17137590599680L, 127685);
        switch (paramAnonymousMenuItem.getItemId())
        {
        }
        for (;;)
        {
          GMTrace.o(17137590599680L, 127685);
          return;
          SnsMsgUI.a(SnsMsgUI.this, SnsMsgUI.this.pMi);
          GMTrace.o(17137590599680L, 127685);
          return;
          SnsMsgUI.l(SnsMsgUI.this);
          GMTrace.o(17137590599680L, 127685);
          return;
          SnsMsgUI.a(SnsMsgUI.this, false);
        }
      }
    };
    this.qcB = new j.a()
    {
      public final void a(String paramAnonymousString, com.tencent.mm.sdk.e.l paramAnonymousl)
      {
        GMTrace.i(17132356108288L, 127646);
        com.tencent.mm.plugin.sns.model.ae.aDa().post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(17140811825152L, 127709);
            synchronized (SnsMsgUI.d(SnsMsgUI.this))
            {
              w.v("MicroMsg.SnsMsgUI", "comment notify");
              SnsMsgUI.m(SnsMsgUI.this);
              SnsMsgUI.d(SnsMsgUI.this).a(null, null);
              GMTrace.o(17140811825152L, 127709);
              return;
            }
          }
        });
        GMTrace.o(17132356108288L, 127646);
      }
    };
    this.qcC = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17140543389696L, 127707);
        if (SnsMsgUI.d(SnsMsgUI.this) == null)
        {
          GMTrace.o(17140543389696L, 127707);
          return;
        }
        synchronized (SnsMsgUI.d(SnsMsgUI.this))
        {
          SnsMsgUI.d(SnsMsgUI.this).a(null, null);
          SnsMsgUI.r(SnsMsgUI.this);
          GMTrace.o(17140543389696L, 127707);
          return;
        }
      }
    };
    GMTrace.o(8442563526656L, 62902);
  }
  
  public final void Hd(String paramString)
  {
    GMTrace.i(8443771486208L, 62911);
    this.qcu.notifyDataSetChanged();
    GMTrace.o(8443771486208L, 62911);
  }
  
  protected final void MP()
  {
    GMTrace.i(8443368833024L, 62908);
    oM(i.j.pkf);
    a(0, getString(i.j.cSl), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(8367535816704L, 62343);
        com.tencent.mm.ui.base.h.a(SnsMsgUI.this.vKB.vKW, SnsMsgUI.this.getString(i.j.pjZ), "", new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(8571949416448L, 63866);
            SnsMsgUI.b(SnsMsgUI.this).setVisibility(8);
            SnsMsgUI.c(SnsMsgUI.this).setVisibility(0);
            com.tencent.mm.plugin.sns.model.ae.bji().goN.eZ("SnsComment", "delete from SnsComment");
            SnsMsgUI.this.lf(false);
            GMTrace.o(8571949416448L, 63866);
          }
        }, null);
        GMTrace.o(8367535816704L, 62343);
        return true;
      }
    });
    this.pPd = new ao(this);
    this.mqQ = findViewById(i.f.pdp);
    this.mqO = ((ListView)findViewById(i.f.pdr));
    this.iBW = v.fb(this).inflate(i.g.pfU, null);
    this.jIq = v.fb(this).inflate(i.g.cBz, null);
    w.d("MicroMsg.SnsMsgUI", "autoLoad " + this.jIr);
    if (this.jIr)
    {
      this.mqO.addFooterView(this.jIq);
      this.qcu = new a(this, new i());
      this.qcu.a(new MMSlideDelView.c()
      {
        public final int cf(View paramAnonymousView)
        {
          GMTrace.i(8624160112640L, 64255);
          int i = SnsMsgUI.b(SnsMsgUI.this).getPositionForView(paramAnonymousView);
          GMTrace.o(8624160112640L, 64255);
          return i;
        }
      });
      this.qcu.a(new MMSlideDelView.f()
      {
        public final void t(View paramAnonymousView, int paramAnonymousInt)
        {
          GMTrace.i(8365790986240L, 62330);
          SnsMsgUI.b(SnsMsgUI.this).performItemClick(paramAnonymousView, paramAnonymousInt, 0L);
          GMTrace.o(8365790986240L, 62330);
        }
      });
      this.qcu.b(new MMSlideDelView.e()
      {
        public final void aV(Object paramAnonymousObject)
        {
          GMTrace.i(8585236971520L, 63965);
          if (paramAnonymousObject == null)
          {
            w.e("MicroMsg.SnsMsgUI", "onItemDel object null");
            GMTrace.o(8585236971520L, 63965);
            return;
          }
          try
          {
            int i = bg.Sy(paramAnonymousObject.toString());
            SnsMsgUI.a(SnsMsgUI.this, i);
            GMTrace.o(8585236971520L, 63965);
            return;
          }
          catch (Exception paramAnonymousObject)
          {
            w.e("MicroMsg.SnsMsgUI", "onItemDel object not int");
            w.printErrStackTrace("MicroMsg.SnsMsgUI", (Throwable)paramAnonymousObject, "", new Object[0]);
            GMTrace.o(8585236971520L, 63965);
          }
        }
      });
      this.qcu.vKu = new o.a()
      {
        public final void QC()
        {
          GMTrace.i(8750593212416L, 65197);
          w.v("MicroMsg.SnsMsgUI", "total count:" + SnsMsgUI.d(SnsMsgUI.this).gQB + " unread:" + com.tencent.mm.plugin.sns.model.ae.bji().ME() + "  showcount:" + SnsMsgUI.d(SnsMsgUI.this).jIt);
          if (SnsMsgUI.d(SnsMsgUI.this).getCount() == 0)
          {
            SnsMsgUI.b(SnsMsgUI.this).setVisibility(8);
            SnsMsgUI.c(SnsMsgUI.this).setVisibility(0);
            SnsMsgUI.this.lf(false);
          }
          for (;;)
          {
            if (((SnsMsgUI.d(SnsMsgUI.this).alU()) && (com.tencent.mm.plugin.sns.model.ae.bji().ME() == 0)) || (com.tencent.mm.plugin.sns.model.ae.bji().ME() == com.tencent.mm.plugin.sns.model.ae.bji().blK())) {
              SnsMsgUI.e(SnsMsgUI.this).setVisibility(8);
            }
            GMTrace.o(8750593212416L, 65197);
            return;
            SnsMsgUI.b(SnsMsgUI.this).setVisibility(0);
            SnsMsgUI.c(SnsMsgUI.this).setVisibility(8);
            SnsMsgUI.this.lf(true);
          }
        }
        
        public final void QD()
        {
          GMTrace.i(8750458994688L, 65196);
          GMTrace.o(8750458994688L, 65196);
        }
      };
      this.mqO.setAdapter(this.qcu);
      this.mqO.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(8428873318400L, 62800);
          if (paramAnonymousInt == SnsMsgUI.d(SnsMsgUI.this).getCount())
          {
            if (com.tencent.mm.plugin.sns.model.ae.bji().ME() > 0)
            {
              com.tencent.mm.plugin.sns.model.ae.bji().aki();
              if (SnsMsgUI.d(SnsMsgUI.this).alU()) {
                paramAnonymousInt = 0;
              }
            }
            for (;;)
            {
              SnsMsgUI.d(SnsMsgUI.this).a(null, null);
              if (!SnsMsgUI.f(SnsMsgUI.this))
              {
                if (SnsMsgUI.e(SnsMsgUI.this).getParent() != null)
                {
                  w.d("MicroMsg.SnsMsgUI", "remove footer");
                  SnsMsgUI.b(SnsMsgUI.this).removeFooterView(SnsMsgUI.e(SnsMsgUI.this));
                }
                if ((SnsMsgUI.g(SnsMsgUI.this).getParent() == null) && (paramAnonymousInt > 0))
                {
                  SnsMsgUI.b(SnsMsgUI.this).addFooterView(SnsMsgUI.g(SnsMsgUI.this));
                  w.i("MicroMsg.SnsMsgUI", "add mLoadingFooterView");
                }
              }
              SnsMsgUI.h(SnsMsgUI.this);
              SnsMsgUI.e(SnsMsgUI.this).setVisibility(8);
              GMTrace.o(8428873318400L, 62800);
              return;
              paramAnonymousInt = 1;
              continue;
              paramAnonymousInt = SnsMsgUI.d(SnsMsgUI.this).alV();
            }
          }
          paramAnonymousAdapterView = (i)SnsMsgUI.d(SnsMsgUI.this).getItem(paramAnonymousInt);
          SnsMsgUI.a(SnsMsgUI.this, paramAnonymousAdapterView);
          GMTrace.o(8428873318400L, 62800);
        }
      });
      new com.tencent.mm.ui.tools.l(this);
      this.mqO.setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(17141348696064L, 127713);
          switch (paramAnonymousMotionEvent.getAction())
          {
          }
          for (;;)
          {
            GMTrace.o(17141348696064L, 127713);
            return false;
            SnsMsgUI.this.aLo();
            SnsMsgUI.i(SnsMsgUI.this)[0] = ((int)paramAnonymousMotionEvent.getRawX());
            SnsMsgUI.i(SnsMsgUI.this)[1] = ((int)paramAnonymousMotionEvent.getRawY());
          }
        }
      });
      this.mqO.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
      {
        public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(17146583187456L, 127752);
          if (paramAnonymousInt < SnsMsgUI.b(SnsMsgUI.this).getHeaderViewsCount())
          {
            w.w("MicroMsg.SnsMsgUI", "on header view long click, ignore");
            GMTrace.o(17146583187456L, 127752);
            return true;
          }
          new com.tencent.mm.ui.widget.h(SnsMsgUI.this).a(paramAnonymousView, paramAnonymousInt, paramAnonymousLong, SnsMsgUI.this, SnsMsgUI.j(SnsMsgUI.this), SnsMsgUI.i(SnsMsgUI.this)[0], SnsMsgUI.i(SnsMsgUI.this)[1]);
          GMTrace.o(17146583187456L, 127752);
          return true;
        }
      });
      this.mqO.setOnScrollListener(new AbsListView.OnScrollListener()
      {
        public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(17140006518784L, 127703);
          GMTrace.o(17140006518784L, 127703);
        }
        
        public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
        {
          GMTrace.i(17139872301056L, 127702);
          if (!SnsMsgUI.f(SnsMsgUI.this))
          {
            GMTrace.o(17139872301056L, 127702);
            return;
          }
          if (paramAnonymousAbsListView.getLastVisiblePosition() == paramAnonymousAbsListView.getCount() - 1)
          {
            if (com.tencent.mm.plugin.sns.model.ae.bji().ME() > 0) {
              com.tencent.mm.plugin.sns.model.ae.bji().aki();
            }
            for (;;)
            {
              SnsMsgUI.d(SnsMsgUI.this).a(null, null);
              GMTrace.o(17139872301056L, 127702);
              return;
              SnsMsgUI.d(SnsMsgUI.this).alV();
            }
          }
          GMTrace.o(17139872301056L, 127702);
        }
      });
      if (this.qcu.getCount() != 0) {
        break label476;
      }
      this.mqO.setVisibility(8);
      this.mqQ.setVisibility(0);
      lf(false);
    }
    for (;;)
    {
      if (((this.qcu.alU()) && (com.tencent.mm.plugin.sns.model.ae.bji().ME() == 0)) || (com.tencent.mm.plugin.sns.model.ae.bji().ME() == com.tencent.mm.plugin.sns.model.ae.bji().blK())) {
        this.iBW.setVisibility(8);
      }
      if ((this.qcu.alU()) && (this.jIr)) {
        this.mqO.removeFooterView(this.jIq);
      }
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(17137456381952L, 127684);
          paramAnonymousMenuItem = new Intent();
          paramAnonymousMenuItem.putExtra("sns_cmd_list", SnsMsgUI.k(SnsMsgUI.this));
          SnsMsgUI.this.setResult(-1, paramAnonymousMenuItem);
          SnsMsgUI.this.finish();
          GMTrace.o(17137456381952L, 127684);
          return true;
        }
      });
      if ((this.qcu.alU()) && (this.jIr)) {
        this.mqO.removeFooterView(this.jIq);
      }
      GMTrace.o(8443368833024L, 62908);
      return;
      this.mqO.addFooterView(this.iBW);
      break;
      label476:
      this.mqO.setVisibility(0);
      this.mqQ.setVisibility(8);
      lf(true);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8444308357120L, 62915);
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramk instanceof com.tencent.mm.plugin.sns.model.p)))
    {
      w.d("MicroMsg.SnsMsgUI", "onSceneEnd errtype errcode");
      if (this.qcv)
      {
        GMTrace.o(8444308357120L, 62915);
        return;
      }
      this.qcv = true;
      this.handler.postDelayed(this.qcC, 500L);
    }
    if (paramk.getType() == 218)
    {
      if (((com.tencent.mm.plugin.sns.model.q)paramk).type != 12)
      {
        GMTrace.o(8444308357120L, 62915);
        return;
      }
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label166;
      }
      this.qcu.a(null, null);
      Toast.makeText(this, getString(i.j.pib), 0).show();
    }
    for (;;)
    {
      if (this.qcy != null)
      {
        this.qcy.dismiss();
        this.qcy = null;
      }
      GMTrace.o(8444308357120L, 62915);
      return;
      label166:
      Toast.makeText(this, getString(i.j.pia), 0).show();
    }
  }
  
  public final void av(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8443905703936L, 62912);
    GMTrace.o(8443905703936L, 62912);
  }
  
  public final void aw(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8444442574848L, 62916);
    GMTrace.o(8444442574848L, 62916);
  }
  
  public final void bhV()
  {
    GMTrace.i(8444039921664L, 62913);
    GMTrace.o(8444039921664L, 62913);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(8444174139392L, 62914);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      w.d("MicroMsg.SnsMsgUI", "dispatchKeyEvent");
      paramKeyEvent = new Intent();
      paramKeyEvent.putExtra("sns_cmd_list", this.pSQ);
      setResult(-1, paramKeyEvent);
      finish();
      GMTrace.o(8444174139392L, 62914);
      return true;
    }
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(8444174139392L, 62914);
    return bool;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8443234615296L, 62907);
    int i = i.g.pfW;
    GMTrace.o(8443234615296L, 62907);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8443637268480L, 62910);
    w.i("MicroMsg.SnsMsgUI", "onAcvityResult requestCode:" + paramInt1);
    if (paramInt2 != -1)
    {
      GMTrace.o(8443637268480L, 62910);
      return;
    }
    if ((paramIntent != null) && (paramIntent.getBooleanExtra("result_finish", false)))
    {
      finish();
      GMTrace.o(8443637268480L, 62910);
      return;
    }
    if (paramIntent != null)
    {
      paramInt1 = paramIntent.getIntExtra("sns_gallery_op_id", 0);
      this.pSQ.uf(paramInt1);
    }
    GMTrace.o(8443637268480L, 62910);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8442697744384L, 62903);
    super.onCreate(paramBundle);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(210, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(683, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(218, this);
    this.gtf = com.tencent.mm.y.q.zE();
    this.pYO = com.tencent.mm.plugin.sns.model.ae.biR();
    this.qcw = getIntent().getBooleanExtra("sns_msg_force_show_all", false);
    if (this.qcw) {
      this.jIr = true;
    }
    com.tencent.mm.plugin.sns.model.ae.bji().c(this.qcB);
    MP();
    GMTrace.o(8442697744384L, 62903);
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    GMTrace.i(8443503050752L, 62909);
    paramContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    i locali = (i)this.qcu.getItem(paramContextMenuInfo.position);
    if (locali == null)
    {
      GMTrace.o(8443503050752L, 62909);
      return;
    }
    this.pMi = locali.pMi;
    this.pzi = locali.field_snsID;
    for (;;)
    {
      try
      {
        paramView = (beq)new beq().aD(locali.field_curActionBuf);
        if (paramView != null)
        {
          x localx = this.pYO.TE(paramView.uKB);
          if (localx == null) {
            continue;
          }
          paramView = localx.vk();
          paramContextMenu.setHeaderTitle(bg.nl(paramView));
          if (locali.field_isSilence != 0) {
            continue;
          }
          paramContextMenu.add(paramContextMenuInfo.position, 1, 1, getString(i.j.phY));
        }
      }
      catch (Exception paramView)
      {
        w.printErrStackTrace("MicroMsg.SnsMsgUI", paramView, "", new Object[0]);
        continue;
      }
      paramContextMenu.add(paramContextMenuInfo.position, 0, 0, getString(i.j.cSt));
      GMTrace.o(8443503050752L, 62909);
      return;
      if (!bg.nm(paramView.uQj))
      {
        paramView = paramView.uQj;
      }
      else
      {
        paramView = paramView.uKB;
        continue;
        paramContextMenu.add(paramContextMenuInfo.position, 2, 1, getString(i.j.phX));
      }
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(8442831962112L, 62904);
    w.d("MicroMsg.SnsMsgUI", "msgui onDestroy");
    com.tencent.mm.plugin.sns.model.ae.bji().aki();
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(210, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(683, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(218, this);
    com.tencent.mm.plugin.sns.model.ae.bji().j(this.qcB);
    this.qcu.aJe();
    com.tencent.mm.plugin.sns.model.ae.bja().K(this);
    if (this.qcy != null)
    {
      this.qcy.dismiss();
      this.qcy = null;
    }
    super.onDestroy();
    GMTrace.o(8442831962112L, 62904);
  }
  
  public void onPause()
  {
    GMTrace.i(8443100397568L, 62906);
    com.tencent.mm.plugin.sns.model.ae.biY().b(this);
    super.onPause();
    GMTrace.o(8443100397568L, 62906);
  }
  
  public void onResume()
  {
    GMTrace.i(8442966179840L, 62905);
    com.tencent.mm.plugin.sns.model.ae.biY().a(this);
    super.onResume();
    GMTrace.o(8442966179840L, 62905);
  }
  
  final class a
    extends o<i>
  {
    int gQB;
    int jIt;
    protected MMSlideDelView.f jpQ;
    protected MMSlideDelView.c jpR;
    protected MMSlideDelView.d jpT;
    private Set<MMSlideDelView> mqU;
    protected MMSlideDelView.e qcH;
    
    public a(Context paramContext, i parami)
    {
      super(parami);
      GMTrace.i(8479204966400L, 63175);
      this.mqU = new HashSet();
      this.jpT = new MMSlideDelView.d()
      {
        public final void a(MMSlideDelView paramAnonymousMMSlideDelView, boolean paramAnonymousBoolean)
        {
          GMTrace.i(8768444170240L, 65330);
          if (paramAnonymousBoolean)
          {
            mqU.add(paramAnonymousMMSlideDelView);
            GMTrace.o(8768444170240L, 65330);
            return;
          }
          mqU.remove(paramAnonymousMMSlideDelView);
          GMTrace.o(8768444170240L, 65330);
        }
        
        public final boolean aJo()
        {
          GMTrace.i(8768578387968L, 65331);
          if (mqU.size() > 0)
          {
            GMTrace.o(8768578387968L, 65331);
            return true;
          }
          GMTrace.o(8768578387968L, 65331);
          return false;
        }
        
        public final void aJp()
        {
          GMTrace.i(8768712605696L, 65332);
          Iterator localIterator = mqU.iterator();
          while (localIterator.hasNext())
          {
            MMSlideDelView localMMSlideDelView = (MMSlideDelView)localIterator.next();
            if (localMMSlideDelView != null) {
              localMMSlideDelView.cal();
            }
          }
          mqU.clear();
          GMTrace.o(8768712605696L, 65332);
        }
        
        public final void aJq()
        {
          GMTrace.i(8768846823424L, 65333);
          Iterator localIterator = mqU.iterator();
          while (localIterator.hasNext())
          {
            MMSlideDelView localMMSlideDelView = (MMSlideDelView)localIterator.next();
            if (localMMSlideDelView != null) {
              localMMSlideDelView.cak();
            }
          }
          mqU.clear();
          GMTrace.o(8768846823424L, 65333);
        }
      };
      this.jIt = 10;
      this.gQB = this.jIt;
      GMTrace.o(8479204966400L, 63175);
    }
    
    public final void QF()
    {
      GMTrace.i(8480144490496L, 63182);
      if ((com.tencent.mm.plugin.sns.model.ae.bji().ME() > 0) && (!SnsMsgUI.n(SnsMsgUI.this))) {
        setCursor(com.tencent.mm.plugin.sns.model.ae.bji().blJ());
      }
      for (;;)
      {
        notifyDataSetChanged();
        GMTrace.o(8480144490496L, 63182);
        return;
        this.gQB = com.tencent.mm.plugin.sns.model.ae.bji().blK();
        j localj = com.tencent.mm.plugin.sns.model.ae.bji();
        int i = this.jIt;
        String str = j.blI() + " where isSend = 0 order by createTime desc LIMIT " + i;
        w.v("MicroMsg.SnsCommentStorage", "getCursor sql:" + str);
        setCursor(localj.goN.a(str, null, 0));
      }
    }
    
    protected final void QG()
    {
      GMTrace.i(8479473401856L, 63177);
      aJe();
      QF();
      GMTrace.o(8479473401856L, 63177);
    }
    
    public final void a(MMSlideDelView.c paramc)
    {
      GMTrace.i(8479876055040L, 63180);
      this.jpR = paramc;
      GMTrace.o(8479876055040L, 63180);
    }
    
    public final void a(MMSlideDelView.f paramf)
    {
      GMTrace.i(8479607619584L, 63178);
      this.jpQ = paramf;
      GMTrace.o(8479607619584L, 63178);
    }
    
    public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
    {
      try
      {
        GMTrace.i(8480010272768L, 63181);
        super.a(paramString, paraml);
        GMTrace.o(8480010272768L, 63181);
        return;
      }
      finally
      {
        paramString = finally;
        throw paramString;
      }
    }
    
    public final boolean alU()
    {
      GMTrace.i(8480278708224L, 63183);
      if (this.jIt >= this.gQB)
      {
        GMTrace.o(8480278708224L, 63183);
        return true;
      }
      GMTrace.o(8480278708224L, 63183);
      return false;
    }
    
    public final int alV()
    {
      GMTrace.i(8480412925952L, 63184);
      if (alU())
      {
        if (SnsMsgUI.g(SnsMsgUI.this).getParent() != null) {
          SnsMsgUI.b(SnsMsgUI.this).removeFooterView(SnsMsgUI.g(SnsMsgUI.this));
        }
        GMTrace.o(8480412925952L, 63184);
        return 0;
      }
      this.jIt += 10;
      if (this.jIt <= this.gQB)
      {
        GMTrace.o(8480412925952L, 63184);
        return 10;
      }
      this.jIt = this.gQB;
      int i = this.gQB;
      GMTrace.o(8480412925952L, 63184);
      return i % 10;
    }
    
    public final void b(MMSlideDelView.e parame)
    {
      GMTrace.i(8479741837312L, 63179);
      this.qcH = parame;
      GMTrace.o(8479741837312L, 63179);
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(8479339184128L, 63176);
      long l = ((i)getItem(paramInt)).field_snsID;
      GMTrace.o(8479339184128L, 63176);
      return l;
    }
    
    public final View getView(int paramInt, final View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(8480547143680L, 63185);
      i locali = (i)getItem(paramInt);
      Object localObject1;
      a locala;
      if ((paramView == null) || (!(paramView.getTag() instanceof a)))
      {
        localObject1 = (MMSlideDelView)v.fb(this.context).inflate(i.g.cpV, null);
        paramView = v.fb(this.context).inflate(i.g.pfV, null);
        locala = new a();
        locala.qcJ = ((ImageView)paramView.findViewById(i.f.pdn));
        locala.nNR = ((TextView)paramView.findViewById(i.f.pdu));
        locala.qcM = ((TextView)paramView.findViewById(i.f.pdo));
        locala.qcL = ((ImageView)paramView.findViewById(i.f.pds));
        locala.kHx = ((TextView)paramView.findViewById(i.f.pdv));
        locala.qcN = ((MMImageView)paramView.findViewById(i.f.pdq));
        locala.qcK = ((TextView)paramView.findViewById(i.f.pdw));
        locala.qcN.setOnClickListener(SnsMsgUI.o(SnsMsgUI.this));
        locala.jqa = ((MMSlideDelView)localObject1).findViewById(i.f.cfd);
        locala.jqb = ((TextView)((MMSlideDelView)localObject1).findViewById(i.f.cfe));
        locala.qcO = ((ImageView)paramView.findViewById(i.f.pdP));
        ((MMSlideDelView)localObject1).setView(paramView);
        ((MMSlideDelView)localObject1).jpQ = this.jpQ;
        ((MMSlideDelView)localObject1).jpR = this.jpR;
        ((MMSlideDelView)localObject1).jpT = this.jpT;
        ((MMSlideDelView)localObject1).lmH = false;
        ((View)localObject1).setTag(locala);
        locala.qcN.setTag(null);
        locala.poZ = locali.field_snsID;
        locala.jqa.setTag(Integer.valueOf(locali.pMi));
        locala.jqa.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(8480949796864L, 63188);
            w.v("MicroMsg.SnsMsgUI", "on delView clicked");
            SnsMsgUI.a.this.jpT.aJq();
            if (SnsMsgUI.a.this.qcH != null) {
              SnsMsgUI.a.this.qcH.aV(paramAnonymousView.getTag());
            }
            GMTrace.o(8480949796864L, 63188);
          }
        });
      }
      for (;;)
      {
        Object localObject2;
        label400:
        label447:
        Object localObject3;
        int j;
        int i;
        try
        {
          localObject2 = (beq)new beq().aD(locali.field_curActionBuf);
        }
        catch (Exception paramView)
        {
          long l;
          label695:
          label735:
          label806:
          label943:
          label967:
          label982:
          w.printErrStackTrace("MicroMsg.SnsMsgUI", paramView, "", new Object[0]);
          continue;
          if (bg.nm(((beq)localObject2).uQj)) {
            continue;
          }
          paramView = ((beq)localObject2).uQj;
          continue;
          paramView = ((beq)localObject2).uKB;
          continue;
          locala.nNR.setTextColor(SnsMsgUI.this.getResources().getColor(i.c.aPa));
          continue;
        }
        try
        {
          paramViewGroup = ((beq)new beq().aD(locali.field_refActionBuf)).uKB;
        }
        catch (Exception paramView)
        {
          paramView = "";
        }
        try
        {
          if ((!bg.nm(paramViewGroup)) && (!paramViewGroup.equals(com.tencent.mm.plugin.sns.model.ae.biJ()))) {
            continue;
          }
          paramViewGroup = "";
          if (bg.nm(((beq)localObject2).uKB)) {
            continue;
          }
          a.b.a(locala.qcJ, ((beq)localObject2).uKB);
          paramView = ((beq)localObject2).uKB;
          locala.qcJ.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(8705093402624L, 64858);
              paramAnonymousView = new Intent();
              paramAnonymousView.putExtra("Contact_User", paramView);
              com.tencent.mm.plugin.sns.c.a.hnH.d(paramAnonymousView, SnsMsgUI.this);
              GMTrace.o(8705093402624L, 64858);
            }
          });
          paramView = SnsMsgUI.p(SnsMsgUI.this).TE(((beq)localObject2).uKB);
          if (paramView == null) {
            continue;
          }
          paramView = paramView.vk();
          locala.nNR.setText(com.tencent.mm.pluginsdk.ui.d.h.b(SnsMsgUI.this, paramView, locala.nNR.getTextSize()));
          paramView = com.tencent.mm.plugin.sns.model.ae.bjd().dU(locali.field_snsID);
          if ((paramView == null) || (paramView.field_type != 21)) {
            continue;
          }
          locala.nNR.setTextColor(SnsMsgUI.this.getResources().getColor(i.c.kbl));
          paramView = ((beq)localObject2).uKB;
          localObject3 = locala.nNR;
          j = ((beq)localObject2).tQP;
          switch (locali.field_type)
          {
          }
        }
        catch (Exception paramView)
        {
          for (;;)
          {
            label2406:
            label2421:
            label2501:
            label2738:
            label2799:
            label2804:
            label2810:
            paramView = paramViewGroup;
            continue;
            i = 1;
            break;
            break label806;
            i = 1;
            break;
            i = 0;
            break;
            i = 0;
            break;
            i = 0;
            break;
            switch (j)
            {
            }
            continue;
            i = 0;
            break label695;
            break label735;
            continue;
            paramInt = 8;
          }
        }
      }
      if ((i == 0) || (SnsMsgUI.q(SnsMsgUI.this).equals(paramView)))
      {
        ((TextView)localObject3).setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
        localObject3 = locala.qcM;
        l = locali.field_snsID;
        if ((locali.field_commentflag & 0x1) <= 0) {
          break label2927;
        }
        i = 1;
        if (i != 0)
        {
          ((TextView)localObject3).setText(i.j.pka);
          ((TextView)localObject3).setBackgroundColor(SnsMsgUI.this.getResources().getColor(i.c.oWZ));
          ((TextView)localObject3).setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
          locala.kHx.setText(az.j(SnsMsgUI.this, ((beq)localObject2).nFd * 1000L));
          paramView = null;
          if ((((beq)localObject2).jib != 7) && (((beq)localObject2).jib != 8)) {
            break label2406;
          }
          paramViewGroup = com.tencent.mm.plugin.sns.model.ae.bjg().dN(locali.field_snsID);
          if (paramViewGroup == null) {
            break label2828;
          }
          paramView = paramViewGroup.blF();
          break label2828;
          locala.qcN.setVisibility(8);
          locala.qcK.setVisibility(8);
          locala.qcO.setVisibility(8);
          locala.qcN.setImageBitmap(null);
          com.tencent.mm.plugin.sns.model.ae.bja().cs(locala.qcN);
          if (paramView == null) {
            break label2738;
          }
          paramViewGroup = paramView.blD().uUc.ueW;
          if (paramView.field_type != 2) {
            break label2421;
          }
          locala.qcN.setTag(null);
          locala.qcK.setVisibility(0);
          paramView = com.tencent.mm.pluginsdk.ui.d.h.b(SnsMsgUI.this, paramView.blD().uTZ, locala.qcK.getTextSize());
          locala.qcK.setText(paramView);
          if ((locala.qcN.getVisibility() != 0) && (locala.qcO.getVisibility() != 0)) {
            break label2799;
          }
          paramInt = 1;
          paramView = ((View)localObject1).findViewById(i.f.pdt);
          if (paramInt == 0) {
            break label2804;
          }
          paramInt = 0;
          paramView.setVisibility(paramInt);
          paramView = ((View)localObject1).findViewById(i.f.pdQ);
          if (locali.field_isSilence != 1) {
            break label2810;
          }
        }
        for (paramInt = 0;; paramInt = 8)
        {
          paramView.setVisibility(paramInt);
          GMTrace.o(8480547143680L, 63185);
          return (View)localObject1;
          locala = (a)paramView.getTag();
          localObject1 = paramView;
          break;
          localObject3 = SnsMsgUI.p(SnsMsgUI.this).TE(paramViewGroup);
          paramView = paramViewGroup;
          if (localObject3 != null)
          {
            paramView = paramViewGroup;
            if (!bg.nm(((com.tencent.mm.l.a)localObject3).vk())) {
              paramView = ((com.tencent.mm.l.a)localObject3).vk();
            }
          }
          paramViewGroup = paramView;
          break label400;
          paramViewGroup = paramView;
          break label400;
          w.e("MicroMsg.SnsMsgUI", "action.getFromUsername() is null or Nil");
          break label447;
          paramView = com.tencent.mm.br.a.b(this.context, i.e.oYg);
          for (;;)
          {
            ((TextView)localObject3).setCompoundDrawablesWithIntrinsicBounds(null, null, paramView, null);
            break;
            paramView = com.tencent.mm.br.a.b(this.context, i.e.oYh);
            continue;
            paramView = com.tencent.mm.br.a.b(this.context, i.e.oYf);
            continue;
            paramView = com.tencent.mm.br.a.b(this.context, i.e.oYd);
            continue;
            paramView = com.tencent.mm.br.a.b(this.context, i.e.oYe);
          }
          ((TextView)localObject3).setTextColor(SnsMsgUI.this.getResources().getColor(i.c.black));
          ((TextView)localObject3).setBackgroundDrawable(null);
          ((TextView)localObject3).setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
          ((TextView)localObject3).setText("");
          ((TextView)localObject3).setCompoundDrawablePadding(0);
          Object localObject4;
          com.tencent.mm.plugin.sns.storage.e locale;
          switch (((beq)localObject2).jib)
          {
          case 1: 
          case 5: 
            paramViewGroup = com.tencent.mm.plugin.sns.model.ae.bjd().dU(locali.field_snsID);
            if ((paramViewGroup != null) && (paramViewGroup.field_type == 7))
            {
              ((TextView)localObject3).setText(SnsMsgUI.this.getString(i.j.pjU));
              break;
            }
            paramView = com.tencent.mm.br.a.b(this.context, i.i.phe);
            if ((paramViewGroup != null) && (paramViewGroup.field_type == 21)) {
              paramView.setColorFilter(SnsMsgUI.this.getResources().getColor(i.c.oXf), PorterDuff.Mode.SRC_ATOP);
            }
            for (;;)
            {
              paramView.setBounds(0, 0, paramView.getIntrinsicWidth(), paramView.getIntrinsicHeight());
              paramViewGroup = new SpannableString(" ");
              paramViewGroup.setSpan(new ImageSpan(paramView), 0, 1, 18);
              ((TextView)localObject3).setText(paramViewGroup);
              ((TextView)localObject3).setContentDescription(SnsMsgUI.this.vKB.vKW.getString(i.j.pjk));
              break;
              paramView.clearColorFilter();
            }
          case 2: 
          case 3: 
            localObject4 = ((beq)localObject2).nIp;
            paramView = "";
            locale = com.tencent.mm.plugin.sns.model.ae.bjg().dN(locali.field_snsID);
            if (((beq)localObject2).uQr == 1) {
              if (locale != null)
              {
                com.tencent.mm.kernel.h.xz();
                paramView = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TC(locale.field_userName);
                paramView = this.context.getString(i.j.pkd, new Object[] { paramView.vk() });
              }
            }
            for (;;)
            {
              paramView = paramView + (String)localObject4 + " ";
              ((TextView)localObject3).setText(com.tencent.mm.pluginsdk.ui.d.h.b(SnsMsgUI.this, paramView, ((TextView)localObject3).getTextSize()));
              break;
              if (!bg.nm(paramViewGroup)) {
                paramView = this.context.getString(i.j.pke, new Object[] { paramViewGroup });
              }
            }
          case 7: 
            ((TextView)localObject3).setCompoundDrawablesWithIntrinsicBounds(com.tencent.mm.br.a.b(this.context, i.i.phe), null, null, null);
            ((TextView)localObject3).setContentDescription(SnsMsgUI.this.vKB.vKW.getString(i.j.pjk));
            break;
          case 8: 
            paramView = "";
            localObject4 = ((beq)localObject2).nIp;
            locale = com.tencent.mm.plugin.sns.model.ae.bjg().dN(locali.field_snsID);
            if (((beq)localObject2).uQr == 1) {
              if (locale != null)
              {
                com.tencent.mm.kernel.h.xz();
                paramView = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TC(locale.field_userName);
                paramView = this.context.getString(i.j.pkd, new Object[] { paramView.vk() });
              }
            }
            for (;;)
            {
              paramView = paramView + (String)localObject4 + " ";
              ((TextView)localObject3).setText(com.tencent.mm.pluginsdk.ui.d.h.b(SnsMsgUI.this, paramView, ((TextView)localObject3).getTextSize()));
              break;
              if (!bg.nm(paramViewGroup)) {
                paramView = this.context.getString(i.j.pke, new Object[] { paramViewGroup });
              }
            }
          case 4: 
            ((TextView)localObject3).setText(SnsMsgUI.this.getString(i.j.pkX));
            break;
          case 14: 
            paramView = new ahh();
            w.i("MicroMsg.SnsMsgUI", "curAction.HBBuffer " + ((beq)localObject2).uQq);
            try
            {
              paramView.aD(com.tencent.mm.platformtools.n.a(((beq)localObject2).uQq));
              w.i("MicroMsg.SnsMsgUI", "hbbuffer  " + paramView.eYB);
              paramViewGroup = SnsMsgUI.p(SnsMsgUI.this).TE(((beq)localObject2).uKB);
              ((TextView)localObject3).setText(SnsMsgUI.this.getString(i.j.phT, new Object[] { paramViewGroup.vk(), bg.r(paramView.eYB / 100.0D) }));
            }
            catch (Exception paramViewGroup)
            {
              for (;;)
              {
                w.e("MicroMsg.SnsMsgUI", "parser hbbuffer " + paramViewGroup.getMessage());
              }
            }
          case 13: 
            paramView = new ahh();
            w.i("MicroMsg.SnsMsgUI", "curAction.HBBuffer " + ((beq)localObject2).uQq);
            try
            {
              paramView.aD(com.tencent.mm.platformtools.n.a(((beq)localObject2).uQq));
              w.i("MicroMsg.SnsMsgUI", "hbbuffer  " + paramView.eYB);
              SnsMsgUI.p(SnsMsgUI.this).TE(((beq)localObject2).uKB);
              paramViewGroup = null;
              if (paramView.eYB == 0L)
              {
                SnsMsgUI.b(SnsMsgUI.this, true);
                paramView = new SpannableString(SnsMsgUI.this.getString(i.j.phV));
                if (paramViewGroup != null)
                {
                  paramViewGroup.setBounds(0, 0, paramViewGroup.getIntrinsicWidth(), paramViewGroup.getIntrinsicHeight());
                  localObject4 = new com.tencent.mm.ui.widget.e(paramViewGroup);
                  ((com.tencent.mm.ui.widget.e)localObject4).xpz = ((int)((paramViewGroup.getIntrinsicHeight() - ((TextView)localObject3).getTextSize() + com.tencent.mm.br.a.fromDPToPix(SnsMsgUI.this, 2)) / 2.0F));
                  paramView.setSpan(localObject4, 0, 1, 33);
                }
                ((TextView)localObject3).setText(paramView);
              }
            }
            catch (Exception paramViewGroup)
            {
              for (;;)
              {
                w.e("MicroMsg.SnsMsgUI", "parser hbbuffer " + paramViewGroup.getMessage());
                continue;
                SnsMsgUI.b(SnsMsgUI.this, false);
                paramView = new SpannableString(" " + SnsMsgUI.this.getString(i.j.phU, new Object[] { bg.r(paramView.eYB / 100.0D) }));
                paramViewGroup = SnsMsgUI.this.getResources().getDrawable(i.e.oXx);
              }
            }
            paramView = com.tencent.mm.plugin.sns.model.ae.bjd().dU(locali.field_snsID);
            break label806;
            i = 0;
            if (paramViewGroup.size() > 0)
            {
              j = paramView.field_type;
              localObject2 = locala.qcN;
              i = -1;
            }
            switch (j)
            {
            case 4: 
              i = i.i.cJr;
              com.tencent.mm.plugin.sns.model.ae.bja().b((anu)paramViewGroup.get(0), locala.qcN, i, SnsMsgUI.this.hashCode(), an.vBf);
              if (paramView.field_type == 15)
              {
                locala.qcO.setVisibility(0);
                paramView = new i();
                com.tencent.mm.plugin.sns.model.ae.bji().b(locali.vmr, paramView);
                locala.qcN.setTag(paramView);
              }
            case 5: 
            case 3: 
            case 6: 
            case 1: 
            case 7: 
            case 2: 
            case 8: 
              for (i = 1;; i = 1)
              {
                paramView = locala.qcN;
                if (i == 0) {
                  break label2939;
                }
                paramInt = 0;
                paramView.setVisibility(paramInt);
                break;
                i = i.i.cJd;
                break label2501;
                i = i.i.cJo;
                break label2501;
                i = i.i.cJr;
                break label2501;
                i = i.i.cJc;
                break label2501;
                i = i.e.aTK;
                break label2501;
                i = i.e.aTK;
                break label2501;
                ((MMImageView)localObject2).setImageDrawable(null);
                break label2501;
                ((MMImageView)localObject2).setImageDrawable(null);
                break label2501;
                paramViewGroup = new ap();
                paramViewGroup.eHy = paramView.blY();
                paramViewGroup.index = 0;
                paramView = new ArrayList();
                paramView.add(locala.qcN);
                paramViewGroup.qaR = paramView;
                paramViewGroup.position = paramInt;
                locala.qcN.setTag(paramViewGroup);
              }
              if ((((beq)localObject2).jib == 7) || (((beq)localObject2).jib == 8) || (!com.tencent.mm.plugin.sns.model.p.dy(locali.field_snsID))) {
                break label943;
              }
              com.tencent.mm.kernel.h.xz();
              com.tencent.mm.kernel.h.xx().fYr.a(new com.tencent.mm.plugin.sns.model.p(locali.field_snsID), 0);
              break label943;
              paramInt = 0;
              break label967;
              paramInt = 8;
              break label982;
            }
          }
        }
      }
    }
    
    final class a
    {
      View jqa;
      TextView jqb;
      TextView kHx;
      TextView nNR;
      long poZ;
      ImageView qcJ;
      TextView qcK;
      ImageView qcL;
      TextView qcM;
      MMImageView qcN;
      ImageView qcO;
      
      a()
      {
        GMTrace.i(8545911177216L, 63672);
        GMTrace.o(8545911177216L, 63672);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SnsMsgUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.emoji.ui.v2;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.g.a.cq;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.f.i;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.ato;
import com.tencent.mm.protocal.c.qp;
import com.tencent.mm.protocal.c.qq;
import com.tencent.mm.protocal.c.zm;
import com.tencent.mm.protocal.c.zo;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.MMPullDownView.c;
import com.tencent.mm.ui.base.MMPullDownView.e;
import com.tencent.mm.ui.base.MMTagPanel;
import com.tencent.mm.ui.base.MMTagPanel.a;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.contact.LabelContainerView;
import com.tencent.mm.ui.contact.LabelContainerView.a;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.v;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EmojiStoreV2SingleProductUI
  extends MMActivity
  implements AbsListView.OnScrollListener, e
{
  private View Ks;
  private String fKP;
  private int gRb;
  private boolean jRF;
  private ProgressDialog kgz;
  private long kkB;
  private String klD;
  private String klF;
  private i ksB;
  private int ksb;
  private MMPullDownView ksz;
  private int ktX;
  private String ktY;
  private int ktZ;
  private String kua;
  private String kub;
  private String kuc;
  private String kud;
  private String kue;
  private int kuf;
  private PreViewListGridView kug;
  private d kuh;
  private View kui;
  private TextView kuj;
  private View kuk;
  private boolean kul;
  private zm kum;
  private byte[] kun;
  private int kuo;
  private String kup;
  private LabelContainerView kuq;
  private TextView kur;
  private MMTagPanel kus;
  private HashMap<String, Integer> kut;
  private ArrayList<String> kuu;
  private boolean kuv;
  private com.tencent.mm.sdk.b.c kuw;
  private MMPullDownView.e kux;
  private MMPullDownView.c kuy;
  private ae mHandler;
  
  public EmojiStoreV2SingleProductUI()
  {
    GMTrace.i(11523934126080L, 85860);
    this.ksb = 0;
    this.ktZ = -1;
    this.kuf = 0;
    this.kul = true;
    this.kuo = -1;
    this.jRF = false;
    this.kut = new HashMap();
    this.kuv = false;
    this.mHandler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(11478836969472L, 85524);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(11478836969472L, 85524);
          return;
          if (EmojiStoreV2SingleProductUI.a(EmojiStoreV2SingleProductUI.this) != null)
          {
            EmojiStoreV2SingleProductUI.a(EmojiStoreV2SingleProductUI.this).setVisibility(8);
            GMTrace.o(11478836969472L, 85524);
            return;
            if (EmojiStoreV2SingleProductUI.a(EmojiStoreV2SingleProductUI.this) != null) {
              EmojiStoreV2SingleProductUI.a(EmojiStoreV2SingleProductUI.this).setVisibility(0);
            }
            sendEmptyMessage(1003);
            GMTrace.o(11478836969472L, 85524);
            return;
            EmojiStoreV2SingleProductUI.b(EmojiStoreV2SingleProductUI.this);
          }
        }
      }
    };
    this.kuw = new com.tencent.mm.sdk.b.c() {};
    this.kux = new MMPullDownView.e()
    {
      public final boolean aoX()
      {
        GMTrace.i(11482595065856L, 85552);
        w.i("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "onBottom");
        EmojiStoreV2SingleProductUI.e(EmojiStoreV2SingleProductUI.this);
        GMTrace.o(11482595065856L, 85552);
        return true;
      }
    };
    this.kuy = new MMPullDownView.c()
    {
      public final boolean aoZ()
      {
        GMTrace.i(11506754256896L, 85732);
        GMTrace.o(11506754256896L, 85732);
        return false;
      }
    };
    GMTrace.o(11523934126080L, 85860);
  }
  
  private void K(LinkedList<qp> paramLinkedList)
  {
    GMTrace.i(11526081609728L, 85876);
    if ((this.kuh != null) && (paramLinkedList != null))
    {
      if (this.kuo == -1)
      {
        this.kuh.at(paramLinkedList);
        GMTrace.o(11526081609728L, 85876);
        return;
      }
      d locald = this.kuh;
      if (locald.kgE == null) {
        locald.kgE = new ArrayList();
      }
      locald.kgE.addAll(paramLinkedList);
      locald.notifyDataSetChanged();
    }
    GMTrace.o(11526081609728L, 85876);
  }
  
  private void PY()
  {
    GMTrace.i(11525142085632L, 85869);
    if (this.kuv)
    {
      w.i("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "need jeep to update page.");
      GMTrace.o(11525142085632L, 85869);
      return;
    }
    this.kun = null;
    switch (this.kuf)
    {
    }
    for (;;)
    {
      ai(this.kun);
      GMTrace.o(11525142085632L, 85869);
      return;
      this.kum = com.tencent.mm.plugin.emoji.model.h.arl().kjE.UO("0");
      if ((this.kum != null) && (this.kum.uqt != null) && (this.kuh != null))
      {
        a(this.kum);
        this.kuh.at(this.kum.uqt);
      }
      for (;;)
      {
        this.kul = true;
        g.ork.i(12875, new Object[] { Integer.valueOf(0), "" });
        break;
        wt(getString(R.l.cUV));
      }
      Z(1001, false);
      this.kul = false;
      g.ork.i(12875, new Object[] { Integer.valueOf(1), this.klF });
      continue;
      Z(1001, false);
      this.kup = this.ktY;
      wu(this.kup);
      this.kul = false;
      g.ork.i(12875, new Object[] { Integer.valueOf(1), "" });
      continue;
      this.kup = "";
      wu(this.klD);
      this.kul = false;
      g.ork.i(12875, new Object[] { Integer.valueOf(2), "" });
      continue;
      this.kup = "";
      Z(1001, false);
      Z(1002, true);
      g.ork.i(12875, new Object[] { Integer.valueOf(3), "" });
    }
  }
  
  private void a(zm paramzm)
  {
    boolean bool = false;
    GMTrace.i(11525678956544L, 85873);
    if ((paramzm != null) && (paramzm.uqu != null) && (paramzm.uqu.size() > 0))
    {
      if (this.kul) {
        bool = true;
      }
      Z(1001, bool);
      if (this.kus != null)
      {
        if (this.kuu == null) {
          this.kuu = new ArrayList();
        }
        for (;;)
        {
          if (this.kut == null) {
            this.kut = new HashMap();
          }
          this.kut.clear();
          this.kuu.add(getString(R.l.dph));
          paramzm = paramzm.uqu.iterator();
          while (paramzm.hasNext())
          {
            qq localqq = (qq)paramzm.next();
            if ((localqq != null) && (!bg.nm(localqq.ugG)))
            {
              this.kuu.add(localqq.ugG);
              this.kut.put(localqq.ugG, Integer.valueOf(localqq.ugF));
            }
          }
          this.kuu.clear();
        }
        paramzm = new ArrayList();
        paramzm.add(this.kup);
        this.kus.a(paramzm, this.kuu);
        GMTrace.o(11525678956544L, 85873);
      }
    }
    else
    {
      Z(1001, false);
    }
    GMTrace.o(11525678956544L, 85873);
  }
  
  private void ai(byte[] paramArrayOfByte)
  {
    GMTrace.i(11525544738816L, 85872);
    this.kun = null;
    switch (this.kuf)
    {
    }
    for (;;)
    {
      GMTrace.o(11525544738816L, 85872);
      return;
      paramArrayOfByte = new com.tencent.mm.plugin.emoji.f.h(1, this.ksb, this.ktX, this.klD, this.ktZ, paramArrayOfByte);
      at.wS().a(paramArrayOfByte, 0);
      GMTrace.o(11525544738816L, 85872);
      return;
      paramArrayOfByte = new com.tencent.mm.plugin.emoji.f.h(2, this.ksb, this.ktX, this.klD, this.ktZ, paramArrayOfByte);
      at.wS().a(paramArrayOfByte, 0);
      GMTrace.o(11525544738816L, 85872);
      return;
      paramArrayOfByte = new com.tencent.mm.plugin.emoji.f.h(3, this.ksb, this.ktX, this.klD, this.ktZ, paramArrayOfByte);
      at.wS().a(paramArrayOfByte, 0);
      GMTrace.o(11525544738816L, 85872);
      return;
      paramArrayOfByte = new com.tencent.mm.plugin.emoji.f.h(4, this.ksb, this.ktX, this.klD, this.ktZ, paramArrayOfByte);
      at.wS().a(paramArrayOfByte, 0);
      GMTrace.o(11525544738816L, 85872);
      return;
      paramArrayOfByte = new com.tencent.mm.plugin.emoji.f.h(5, this.ksb, this.ktX, this.klD, this.ktZ, paramArrayOfByte);
      at.wS().a(paramArrayOfByte, 0);
    }
  }
  
  private void ase()
  {
    GMTrace.i(11525410521088L, 85871);
    if ((this.kgz != null) && (this.kgz.isShowing())) {
      this.kgz.dismiss();
    }
    GMTrace.o(11525410521088L, 85871);
  }
  
  private void atd()
  {
    GMTrace.i(11526215827456L, 85877);
    Toast.makeText(this.vKB.vKW, getString(R.l.dpI), 0).show();
    GMTrace.o(11526215827456L, 85877);
  }
  
  private void dX(boolean paramBoolean)
  {
    GMTrace.i(11525947392000L, 85875);
    if (!this.jRF)
    {
      ai(this.kun);
      this.jRF = true;
      this.mHandler.sendEmptyMessageDelayed(1002, 200L);
    }
    GMTrace.o(11525947392000L, 85875);
  }
  
  private void wt(String paramString)
  {
    GMTrace.i(11525276303360L, 85870);
    if (isFinishing())
    {
      w.i("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "[showLoadingDialog] acitivity is finished.");
      GMTrace.o(11525276303360L, 85870);
      return;
    }
    getString(R.l.cUG);
    this.kgz = com.tencent.mm.ui.base.h.a(this, paramString, true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(11521920860160L, 85845);
        if (EmojiStoreV2SingleProductUI.p(EmojiStoreV2SingleProductUI.this) != null) {
          at.wS().c(EmojiStoreV2SingleProductUI.p(EmojiStoreV2SingleProductUI.this));
        }
        GMTrace.o(11521920860160L, 85845);
      }
    });
    GMTrace.o(11525276303360L, 85870);
  }
  
  private void wu(String paramString)
  {
    GMTrace.i(11525813174272L, 85874);
    if ((this.kui != null) && (this.kuj != null)) {
      switch (this.kuf)
      {
      }
    }
    for (;;)
    {
      if (bg.nm(paramString))
      {
        this.kuj.setText("");
        this.kuj.setVisibility(8);
        this.kui.setVisibility(8);
      }
      GMTrace.o(11525813174272L, 85874);
      return;
      if (!bg.nm(paramString))
      {
        this.kuj.setText(getString(R.l.dpi, new Object[] { paramString }));
        this.kuj.setVisibility(0);
        this.kui.setVisibility(0);
        continue;
        if (!bg.nm(paramString))
        {
          this.kuj.setText(getString(R.l.dpe, new Object[] { paramString }));
          this.kuj.setVisibility(0);
          this.kui.setVisibility(0);
        }
      }
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(11524873650176L, 85867);
    if ((this.kuf == 6) && (!bg.nm(this.kua))) {
      sq(this.kua);
    }
    for (;;)
    {
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(11530645012480L, 85910);
          boolean bool;
          if ((EmojiStoreV2SingleProductUI.f(EmojiStoreV2SingleProductUI.this) != null) && (EmojiStoreV2SingleProductUI.f(EmojiStoreV2SingleProductUI.this).getVisibility() == 0))
          {
            EmojiStoreV2SingleProductUI.f(EmojiStoreV2SingleProductUI.this).setVisibility(8);
            paramAnonymousMenuItem = EmojiStoreV2SingleProductUI.this;
            if (EmojiStoreV2SingleProductUI.g(EmojiStoreV2SingleProductUI.this))
            {
              bool = true;
              paramAnonymousMenuItem.Z(1001, bool);
              EmojiStoreV2SingleProductUI.this.oM(R.l.doR);
            }
          }
          for (;;)
          {
            GMTrace.o(11530645012480L, 85910);
            return false;
            bool = false;
            break;
            EmojiStoreV2SingleProductUI.this.finish();
          }
        }
      });
      this.kuh = new d(this.vKB.vKW);
      this.kuh.kvk = new d.a()
      {
        public final void kt(int paramAnonymousInt)
        {
          GMTrace.i(11530913447936L, 85912);
          if ((EmojiStoreV2SingleProductUI.h(EmojiStoreV2SingleProductUI.this) != null) && (EmojiStoreV2SingleProductUI.c(EmojiStoreV2SingleProductUI.this) != null))
          {
            qp localqp = EmojiStoreV2SingleProductUI.c(EmojiStoreV2SingleProductUI.this).mV(paramAnonymousInt);
            if (localqp != null) {
              try
              {
                Intent localIntent = new Intent();
                localIntent.putExtra("Select_Conv_User", EmojiStoreV2SingleProductUI.i(EmojiStoreV2SingleProductUI.this));
                localIntent.putExtra("extra_object", localqp.toByteArray());
                localIntent.putExtra("scene", EmojiStoreV2SingleProductUI.j(EmojiStoreV2SingleProductUI.this));
                localIntent.putExtra("searchID", EmojiStoreV2SingleProductUI.k(EmojiStoreV2SingleProductUI.this));
                localIntent.setClass(EmojiStoreV2SingleProductUI.this.vKB.vKW, EmojiStoreV2SingleProductDialogUI.class);
                EmojiStoreV2SingleProductUI.this.startActivityForResult(localIntent, 5001);
                EmojiStoreV2SingleProductUI.this.overridePendingTransition(R.a.aLC, R.a.aLD);
                g.ork.i(12787, new Object[] { Integer.valueOf(EmojiStoreV2SingleProductUI.j(EmojiStoreV2SingleProductUI.this)), Integer.valueOf(0), localqp.ugy, Long.valueOf(EmojiStoreV2SingleProductUI.k(EmojiStoreV2SingleProductUI.this)) });
                GMTrace.o(11530913447936L, 85912);
                return;
              }
              catch (Exception localException) {}
            }
          }
          GMTrace.o(11530913447936L, 85912);
        }
      };
      this.kug = ((PreViewListGridView)findViewById(R.h.list));
      this.Ks = v.fb(this.vKB.vKW).inflate(R.i.cuQ, null);
      this.kui = this.Ks.findViewById(R.h.bvX);
      this.kuj = ((TextView)this.Ks.findViewById(R.h.bwq));
      this.kug.addHeaderView(this.Ks);
      this.kuk = v.fb(this.vKB.vKW).inflate(R.i.cuH, null);
      this.kug.addFooterView(this.kuk);
      this.kuk.setVisibility(8);
      this.kug.setAdapter(this.kuh);
      this.kug.setOnScrollListener(this);
      this.ksz = ((MMPullDownView)findViewById(R.h.bKx));
      this.ksz.lG(false);
      this.ksz.wdO = this.kux;
      this.ksz.wdZ = this.kuy;
      this.ksz.lF(false);
      this.ksz.lE(false);
      this.ksz.wek = true;
      this.kuq = ((LabelContainerView)findViewById(R.h.cbw));
      this.kur = ((TextView)this.kuq.findViewById(16908310));
      this.kur.setText(R.l.dGh);
      this.kus = ((MMTagPanel)this.kuq.findViewById(R.h.brq));
      this.kus.mqy = R.g.baK;
      this.kus.mqz = R.e.aPp;
      this.kup = getString(R.l.dph);
      this.kuq.wSz = new LabelContainerView.a()
      {
        public final void ate()
        {
          GMTrace.i(11517491675136L, 85812);
          if (EmojiStoreV2SingleProductUI.f(EmojiStoreV2SingleProductUI.this) != null) {
            EmojiStoreV2SingleProductUI.f(EmojiStoreV2SingleProductUI.this).clearFocus();
          }
          EmojiStoreV2SingleProductUI.f(EmojiStoreV2SingleProductUI.this).requestFocus();
          EmojiStoreV2SingleProductUI.f(EmojiStoreV2SingleProductUI.this).setVisibility(8);
          EmojiStoreV2SingleProductUI localEmojiStoreV2SingleProductUI = EmojiStoreV2SingleProductUI.this;
          if (EmojiStoreV2SingleProductUI.g(EmojiStoreV2SingleProductUI.this)) {}
          for (boolean bool = true;; bool = false)
          {
            localEmojiStoreV2SingleProductUI.Z(1001, bool);
            EmojiStoreV2SingleProductUI.this.oM(R.l.doR);
            GMTrace.o(11517491675136L, 85812);
            return;
          }
        }
        
        public final void atf()
        {
          GMTrace.i(11517625892864L, 85813);
          EmojiStoreV2SingleProductUI.this.aLo();
          GMTrace.o(11517625892864L, 85813);
        }
      };
      this.kus.wfk = new MMTagPanel.a()
      {
        public final void atg()
        {
          GMTrace.i(11521383989248L, 85841);
          GMTrace.o(11521383989248L, 85841);
        }
        
        public final void j(boolean paramAnonymousBoolean, int paramAnonymousInt)
        {
          GMTrace.i(11521249771520L, 85840);
          GMTrace.o(11521249771520L, 85840);
        }
        
        public final void wv(String paramAnonymousString)
        {
          GMTrace.i(11520847118336L, 85837);
          if ((!bg.nm(EmojiStoreV2SingleProductUI.l(EmojiStoreV2SingleProductUI.this))) && (!bg.nm(paramAnonymousString)) && (paramAnonymousString.equals(EmojiStoreV2SingleProductUI.l(EmojiStoreV2SingleProductUI.this)))) {
            EmojiStoreV2SingleProductUI.m(EmojiStoreV2SingleProductUI.this).bb(EmojiStoreV2SingleProductUI.l(EmojiStoreV2SingleProductUI.this), true);
          }
          GMTrace.o(11520847118336L, 85837);
        }
        
        public final void ww(String paramAnonymousString)
        {
          GMTrace.i(11520981336064L, 85838);
          EmojiStoreV2SingleProductUI.a(EmojiStoreV2SingleProductUI.this, paramAnonymousString);
          GMTrace.o(11520981336064L, 85838);
        }
        
        public final void wx(String paramAnonymousString)
        {
          GMTrace.i(11521115553792L, 85839);
          GMTrace.o(11521115553792L, 85839);
        }
        
        public final void wy(String paramAnonymousString)
        {
          GMTrace.i(11521518206976L, 85842);
          GMTrace.o(11521518206976L, 85842);
        }
        
        public final void wz(String paramAnonymousString)
        {
          GMTrace.i(11521652424704L, 85843);
          GMTrace.o(11521652424704L, 85843);
        }
      };
      a(1001, R.g.aTp, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(11503667249152L, 85709);
          if (EmojiStoreV2SingleProductUI.f(EmojiStoreV2SingleProductUI.this) != null)
          {
            EmojiStoreV2SingleProductUI.f(EmojiStoreV2SingleProductUI.this).setVisibility(0);
            paramAnonymousMenuItem = new ArrayList();
            paramAnonymousMenuItem.add(EmojiStoreV2SingleProductUI.l(EmojiStoreV2SingleProductUI.this));
            EmojiStoreV2SingleProductUI.m(EmojiStoreV2SingleProductUI.this).a(paramAnonymousMenuItem, EmojiStoreV2SingleProductUI.n(EmojiStoreV2SingleProductUI.this));
            EmojiStoreV2SingleProductUI.this.oM(R.l.dpd);
            EmojiStoreV2SingleProductUI.this.Z(1001, false);
            g.ork.A(12788, "1");
          }
          GMTrace.o(11503667249152L, 85709);
          return false;
        }
      });
      a(1002, R.k.cNO, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(11533463584768L, 85931);
          w.d("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "on shard click.");
          EmojiStoreV2SingleProductUI.o(EmojiStoreV2SingleProductUI.this);
          GMTrace.o(11533463584768L, 85931);
          return true;
        }
      });
      Z(1001, false);
      Z(1002, false);
      GMTrace.o(11524873650176L, 85867);
      return;
      oM(R.l.doR);
    }
  }
  
  protected final int Qf()
  {
    GMTrace.i(11526752698368L, 85881);
    GMTrace.o(11526752698368L, 85881);
    return 1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(11526350045184L, 85878);
    int i = paramk.getType();
    if (i == 821)
    {
      ase();
      paramString = (com.tencent.mm.plugin.emoji.f.h)paramk;
      paramk = paramString.arw();
      this.jRF = false;
      if (this.kuk != null)
      {
        this.kuk.setVisibility(8);
        this.mHandler.removeMessages(1002);
        this.mHandler.sendEmptyMessageDelayed(1001, 200L);
      }
      i = paramString.gFW;
      if (((paramInt1 == 0) && (paramInt2 == 0)) || ((paramInt1 == 4) && ((paramInt2 == 2) || (paramInt2 == 3)) && ((this.kun == null) || (this.kun.length <= 0)) && (i != 3))) {
        a(paramk);
      }
      if ((paramInt1 == 0) || (paramInt1 == 4))
      {
        this.kun = paramString.klB;
        if (paramInt2 == 0)
        {
          K(paramk.uqt);
          this.kuo = 0;
          GMTrace.o(11526350045184L, 85878);
          return;
        }
        if (paramInt2 == 2)
        {
          K(paramk.uqt);
          this.kuo = 2;
          GMTrace.o(11526350045184L, 85878);
          return;
        }
        if (paramInt2 == 3)
        {
          this.kuo = -1;
          K(paramk.uqt);
          GMTrace.o(11526350045184L, 85878);
          return;
        }
        atd();
        GMTrace.o(11526350045184L, 85878);
        return;
      }
      atd();
      GMTrace.o(11526350045184L, 85878);
      return;
    }
    if (i == 239)
    {
      ase();
      if ((paramInt2 == 0) && (paramInt1 == 0))
      {
        paramString = ((i)paramk).arx();
        if ((paramString != null) && (paramString.uqv != null))
        {
          this.ksb = paramString.uqv.uqo;
          if (this.mHandler != null) {
            this.mHandler.sendEmptyMessage(1004);
          }
        }
        GMTrace.o(11526350045184L, 85878);
        return;
      }
      Z(1001, false);
      com.tencent.mm.ui.base.h.b(this.vKB.vKW, getString(R.l.dnZ), null, true);
      w.e("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "open single product ui failed.");
    }
    GMTrace.o(11526350045184L, 85878);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11524068343808L, 85861);
    int i = R.i.cva;
    GMTrace.o(11524068343808L, 85861);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(11524739432448L, 85866);
    switch (paramInt1)
    {
    }
    for (;;)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      GMTrace.o(11524739432448L, 85866);
      return;
      if (paramInt2 == -1)
      {
        com.tencent.mm.ui.snackbar.a.e(this, this.vKB.vKW.getString(R.l.dwg));
        continue;
        if (paramInt2 == -1)
        {
          String str1 = paramIntent.getStringExtra("Select_Conv_User");
          if (!bg.nm(str1))
          {
            w.d("MicroMsg.emoji.EmojiStoreV2SingleProductUI", ".." + str1);
            int i = this.ktZ;
            String str2 = this.kua;
            String str3 = this.kuc;
            String str4 = this.kub;
            String str5 = this.kud;
            int j = this.kuf;
            com.tencent.mm.plugin.emoji.model.h.arh();
            com.tencent.mm.plugin.emoji.e.k.a(this, str1, 27, i, str2, str3, str4, str5, j, "https://support.weixin.qq.com/cgi-bin/readtemplate?t=page/common_page__upgrade&text=text000&btn_text=btn_text_0&title=title_0");
          }
        }
      }
    }
  }
  
  public void onBackPressed()
  {
    GMTrace.i(11525007867904L, 85868);
    if ((this.kuq != null) && (this.kuq.getVisibility() == 0))
    {
      this.kuq.setVisibility(8);
      if (this.kul) {}
      for (boolean bool = true;; bool = false)
      {
        Z(1001, bool);
        oM(R.l.doR);
        GMTrace.o(11525007867904L, 85868);
        return;
      }
    }
    super.onBackPressed();
    GMTrace.o(11525007867904L, 85868);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11524202561536L, 85862);
    super.onCreate(paramBundle);
    this.ksb = getIntent().getIntExtra("uin", 0);
    this.fKP = getIntent().getStringExtra("Select_Conv_User");
    this.kkB = getIntent().getLongExtra("searchID", 0L);
    this.klF = getIntent().getStringExtra("id");
    paramBundle = getIntent().getStringExtra("tag_id");
    if (!bg.nm(paramBundle)) {}
    try
    {
      this.ktX = Integer.valueOf(paramBundle).intValue();
      this.ktY = getIntent().getStringExtra("tag_desc");
      this.klD = getIntent().getStringExtra("keyword");
      this.ktZ = getIntent().getIntExtra("set_id", 0);
      this.kua = getIntent().getStringExtra("set_title");
      this.kub = getIntent().getStringExtra("set_iconURL");
      this.kuc = getIntent().getStringExtra("set_desc");
      this.kud = getIntent().getStringExtra("headurl");
      this.kue = getIntent().getStringExtra("sns_object_data");
      this.kuf = getIntent().getIntExtra("pageType", 0);
      if (!bg.nm(this.kue))
      {
        this.ktZ = EmojiLogic.wd(this.kue);
        this.kua = EmojiLogic.we(this.kue);
        this.kub = EmojiLogic.wg(this.kue);
        this.kuc = EmojiLogic.wf(this.kue);
        this.kud = EmojiLogic.wh(this.kue);
        this.kuf = EmojiLogic.wi(this.kue);
      }
      switch (this.kuf)
      {
      default: 
        this.kuv = true;
        if (this.kuv)
        {
          paramBundle = new Intent();
          com.tencent.mm.plugin.emoji.model.h.arh();
          paramBundle.putExtra("rawUrl", "https://support.weixin.qq.com/cgi-bin/readtemplate?t=page/common_page__upgrade&text=text000&btn_text=btn_text_0&title=title_0");
          paramBundle.putExtra("showShare", false);
          com.tencent.mm.bj.d.b(this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramBundle);
          finish();
        }
        MP();
        if ((this.ksb == 0) && (this.kuf == 2))
        {
          paramBundle = com.tencent.mm.plugin.emoji.model.h.arl().kjE.UN(this.klF);
          if ((paramBundle != null) && (paramBundle.uqv != null) && (paramBundle.uqv.uqo != 0) && (!bg.nm(paramBundle.uqv.lPi)))
          {
            this.ksb = paramBundle.uqv.uqo;
            w.i("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "uin:%s ", new Object[] { Integer.valueOf(this.ksb) });
          }
        }
        else
        {
          i = 0;
          if (i != 0) {
            break label775;
          }
          PY();
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vqi, Boolean.valueOf(false));
          at.wS().a(821, this);
          at.wS().a(239, this);
          GMTrace.o(11524202561536L, 85862);
          return;
        }
        break;
      }
    }
    catch (Exception paramBundle)
    {
      for (;;)
      {
        int i;
        w.e("MicroMsg.emoji.EmojiStoreV2SingleProductUI", bg.f(paramBundle));
        continue;
        if (!bg.nm(this.klD))
        {
          this.kuf = 5;
          this.kul = false;
          this.gRb = 2;
        }
        else if (!bg.nm(this.klF))
        {
          this.kuf = 2;
          this.gRb = 1;
        }
        else if (this.ksb != 0)
        {
          this.kuf = 3;
          this.gRb = 1;
        }
        else if (this.ktX != 0)
        {
          this.gRb = 3;
          this.kuf = 4;
        }
        else if (this.ktZ > 0)
        {
          this.kuf = 6;
          this.gRb = 4;
        }
        else
        {
          this.kuf = 1;
          this.gRb = 0;
          continue;
          this.gRb = 0;
          continue;
          if (bg.nm(this.klF))
          {
            continue;
            if (this.ksb == 0)
            {
              continue;
              if (this.ktX == 0)
              {
                continue;
                if (bg.nm(this.klD))
                {
                  continue;
                  if (this.ktZ == 0)
                  {
                    continue;
                    i = 1;
                    continue;
                    label775:
                    this.ksB = new i(this.klF);
                    at.wS().a(this.ksB, 0);
                    wt(getString(R.l.cUV));
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11524605214720L, 85865);
    at.wS().b(239, this);
    at.wS().b(821, this);
    super.onDestroy();
    GMTrace.o(11524605214720L, 85865);
  }
  
  protected void onPause()
  {
    GMTrace.i(11524470996992L, 85864);
    super.onPause();
    com.tencent.mm.sdk.b.a.vgX.c(this.kuw);
    GMTrace.o(11524470996992L, 85864);
  }
  
  protected void onResume()
  {
    GMTrace.i(11524336779264L, 85863);
    super.onResume();
    com.tencent.mm.sdk.b.a.vgX.b(this.kuw);
    GMTrace.o(11524336779264L, 85863);
  }
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(11526484262912L, 85879);
    GMTrace.o(11526484262912L, 85879);
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    GMTrace.i(11526618480640L, 85880);
    if ((paramInt == 0) && (paramAbsListView.getLastVisiblePosition() == paramAbsListView.getCount() - 1) && (this.kuo == 2) && (!this.jRF))
    {
      w.d("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "No More List.");
      dX(true);
      w.i("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "[onScrollStateChanged] startLoadRemoteEmoji.");
    }
    if ((paramInt != 0) && (this.kug != null)) {
      this.kug.ath();
    }
    GMTrace.o(11526618480640L, 85880);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\v2\EmojiStoreV2SingleProductUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
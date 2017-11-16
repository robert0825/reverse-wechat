package com.tencent.mm.plugin.emoji.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.DataSetObservable;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.emoji.sync.BKGLoaderManager;
import com.tencent.mm.plugin.emoji.sync.a.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.HeaderGridView;
import com.tencent.mm.ui.base.HeaderGridView.a;
import com.tencent.mm.ui.base.HeaderGridView.b;
import com.tencent.mm.ui.base.HeaderGridView.c;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.a.b.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class EmojiCustomUI
  extends MMActivity
  implements AdapterView.OnItemClickListener, com.tencent.mm.ad.e
{
  private com.tencent.mm.ao.a.c.l gLr;
  private ProgressDialog kgz;
  private View.OnClickListener koA;
  private View.OnClickListener koB;
  private View.OnClickListener koC;
  private final j.a koD;
  private final com.tencent.mm.plugin.emoji.sync.c koE;
  private com.tencent.mm.ao.a.c.d koF;
  private EmojiInfo koG;
  private int kol;
  private b kom;
  private HeaderGridView kon;
  private View koo;
  private Button kop;
  private Button koq;
  private a.a kor;
  private View kos;
  private TextView kot;
  private Button kou;
  private boolean kov;
  private boolean kow;
  private boolean kox;
  private a koy;
  private ArrayList<String> koz;
  private ae mHandler;
  
  public EmojiCustomUI()
  {
    GMTrace.i(11374147141632L, 84744);
    this.kol = c.koS;
    this.kor = a.a.kmd;
    this.kov = false;
    this.kow = false;
    this.kox = false;
    this.koy = a.koO;
    this.koz = new ArrayList();
    this.koA = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11362738634752L, 84659);
        switch (EmojiCustomUI.10.koJ[EmojiCustomUI.a(EmojiCustomUI.this).ordinal()])
        {
        }
        for (;;)
        {
          GMTrace.o(11362738634752L, 84659);
          return;
          EmojiCustomUI.b(EmojiCustomUI.this);
          GMTrace.o(11362738634752L, 84659);
          return;
          com.tencent.mm.plugin.emoji.model.h.ari().kmc.arH();
        }
      }
    };
    this.koB = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11403003953152L, 84959);
        EmojiCustomUI.c(EmojiCustomUI.this);
        GMTrace.o(11403003953152L, 84959);
      }
    };
    this.koC = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11362470199296L, 84657);
        EmojiCustomUI.d(EmojiCustomUI.this);
        GMTrace.o(11362470199296L, 84657);
      }
    };
    this.koD = new j.a()
    {
      public final void a(String paramAnonymousString, com.tencent.mm.sdk.e.l paramAnonymousl)
      {
        GMTrace.i(11433874030592L, 85189);
        if ((!bg.nm(paramAnonymousString)) && ((paramAnonymousString.length() == 32) || (paramAnonymousString.equals("event_update_emoji"))) && (EmojiCustomUI.e(EmojiCustomUI.this) != null))
        {
          EmojiCustomUI.e(EmojiCustomUI.this).asy();
          EmojiCustomUI.e(EmojiCustomUI.this).notifyDataSetChanged();
        }
        GMTrace.o(11433874030592L, 85189);
      }
    };
    this.koE = new com.tencent.mm.plugin.emoji.sync.c.a()
    {
      public final void arK()
      {
        GMTrace.i(11389313744896L, 84857);
        EmojiCustomUI.a(EmojiCustomUI.this, com.tencent.mm.plugin.emoji.model.h.ari().arF());
        if (EmojiCustomUI.f(EmojiCustomUI.this) != null) {
          EmojiCustomUI.f(EmojiCustomUI.this).sendEmptyMessage(1001);
        }
        GMTrace.o(11389313744896L, 84857);
      }
      
      public final void arL()
      {
        GMTrace.i(11389447962624L, 84858);
        if (EmojiCustomUI.f(EmojiCustomUI.this) != null) {
          EmojiCustomUI.f(EmojiCustomUI.this).sendEmptyMessage(1002);
        }
        GMTrace.o(11389447962624L, 84858);
      }
    };
    this.koF = new com.tencent.mm.ao.a.c.d()
    {
      public final byte[] e(Object... paramAnonymousVarArgs)
      {
        GMTrace.i(11363007070208L, 84661);
        if ((paramAnonymousVarArgs != null) && (paramAnonymousVarArgs.length > 0))
        {
          paramAnonymousVarArgs = paramAnonymousVarArgs[0];
          if ((paramAnonymousVarArgs != null) && ((paramAnonymousVarArgs instanceof EmojiInfo)))
          {
            paramAnonymousVarArgs = com.tencent.mm.plugin.emoji.e.e.aqw().a((EmojiInfo)paramAnonymousVarArgs);
            GMTrace.o(11363007070208L, 84661);
            return paramAnonymousVarArgs;
          }
        }
        GMTrace.o(11363007070208L, 84661);
        return null;
      }
    };
    this.gLr = new com.tencent.mm.ao.a.c.l()
    {
      public final Bitmap C(byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(19267894378496L, 143557);
        paramAnonymousArrayOfByte = com.tencent.mm.plugin.gif.g.av(paramAnonymousArrayOfByte);
        GMTrace.o(19267894378496L, 143557);
        return paramAnonymousArrayOfByte;
      }
      
      public final Bitmap kv(String paramAnonymousString)
      {
        GMTrace.i(19268028596224L, 143558);
        paramAnonymousString = com.tencent.mm.plugin.gif.g.av(com.tencent.mm.a.e.c(paramAnonymousString, 0, com.tencent.mm.a.e.aY(paramAnonymousString)));
        GMTrace.o(19268028596224L, 143558);
        return paramAnonymousString;
      }
    };
    this.mHandler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(19264538935296L, 143532);
        switch (paramAnonymousMessage.what)
        {
        default: 
          w.e("MicroMsg.emoji.EmojiCustomUI", "unknow Msg");
        case 1001: 
        case 1002: 
          do
          {
            GMTrace.o(19264538935296L, 143532);
            return;
            EmojiCustomUI.g(EmojiCustomUI.this);
            GMTrace.o(19264538935296L, 143532);
            return;
            com.tencent.mm.plugin.emoji.model.h.ari();
          } while (!BKGLoaderManager.aqu());
          if (com.tencent.mm.plugin.emoji.model.h.ari().arF() == a.a.kme)
          {
            EmojiCustomUI.a(EmojiCustomUI.this, true);
            GMTrace.o(19264538935296L, 143532);
            return;
          }
          EmojiCustomUI.a(EmojiCustomUI.this, false);
          GMTrace.o(19264538935296L, 143532);
          return;
        case 1003: 
          EmojiCustomUI.h(EmojiCustomUI.this).setVisibility(8);
          EmojiCustomUI.e(EmojiCustomUI.this).notifyDataSetChanged();
          GMTrace.o(19264538935296L, 143532);
          return;
        }
        if (EmojiCustomUI.e(EmojiCustomUI.this) != null)
        {
          EmojiCustomUI.e(EmojiCustomUI.this).asy();
          EmojiCustomUI.e(EmojiCustomUI.this).notifyDataSetChanged();
        }
        EmojiCustomUI.asv();
        GMTrace.o(19264538935296L, 143532);
      }
    };
    GMTrace.o(11374147141632L, 84744);
  }
  
  private void a(a parama)
  {
    GMTrace.i(11374281359360L, 84745);
    w.i("MicroMsg.emoji.EmojiCustomUI", "dz[updateButtonType,button type:%s]", new Object[] { parama.toString() });
    this.koy = parama;
    switch (10.koJ[parama.ordinal()])
    {
    }
    for (;;)
    {
      GMTrace.o(11374281359360L, 84745);
      return;
      this.kou.setVisibility(4);
      GMTrace.o(11374281359360L, 84745);
      return;
      this.kou.setVisibility(0);
      this.kou.setText(R.l.dpy);
      GMTrace.o(11374281359360L, 84745);
      return;
      this.kou.setVisibility(0);
      this.kou.setText(R.l.dpz);
    }
  }
  
  private void ase()
  {
    GMTrace.i(11377099931648L, 84766);
    if ((this.kgz != null) && (this.kgz.isShowing())) {
      this.kgz.dismiss();
    }
    GMTrace.o(11377099931648L, 84766);
  }
  
  private void asq()
  {
    GMTrace.i(11376026189824L, 84758);
    if (this.koz != null) {
      this.koz.clear();
    }
    w.i("MicroMsg.emoji.EmojiCustomUI", "clear md5 list. updateMode NORMAL");
    GMTrace.o(11376026189824L, 84758);
  }
  
  private void asr()
  {
    GMTrace.i(11376160407552L, 84759);
    View localView = this.koo;
    if (this.kol == c.koT) {}
    for (int i = 0;; i = 8)
    {
      localView.setVisibility(i);
      GMTrace.o(11376160407552L, 84759);
      return;
    }
  }
  
  private void ass()
  {
    GMTrace.i(11376294625280L, 84760);
    int i;
    if (this.kol == c.koT)
    {
      if (this.koz != null) {
        break label100;
      }
      i = 0;
      if (i <= 0) {
        break label111;
      }
      this.kop.setText(getResources().getString(R.l.cSt));
      this.kop.setEnabled(true);
      this.koq.setEnabled(true);
    }
    for (;;)
    {
      sq(getResources().getString(R.l.dop, new Object[] { Integer.valueOf(i) }));
      GMTrace.o(11376294625280L, 84760);
      return;
      label100:
      i = this.koz.size();
      break;
      label111:
      this.kop.setText(getResources().getString(R.l.cSt));
      this.kop.setEnabled(false);
      this.koq.setEnabled(false);
    }
  }
  
  private void ast()
  {
    GMTrace.i(11376563060736L, 84762);
    if (this.mHandler != null) {
      this.mHandler.sendEmptyMessageDelayed(1003, 0L);
    }
    GMTrace.o(11376563060736L, 84762);
  }
  
  private void asu()
  {
    int i = 1;
    GMTrace.i(11376697278464L, 84763);
    com.tencent.mm.plugin.emoji.model.h.ari();
    if (!am.isConnected(ab.getContext()))
    {
      ast();
      GMTrace.o(11376697278464L, 84763);
      return;
    }
    if ((this.kom != null) && (this.kom.asx() > com.tencent.mm.plugin.emoji.e.n.aqT()))
    {
      this.kov = true;
      this.kos.setVisibility(0);
      int j = R.l.dpv;
      int k = R.e.aOL;
      this.kot.setTextColor(getResources().getColor(k));
      this.kot.setText(getString(j, new Object[] { Integer.valueOf(com.tencent.mm.plugin.emoji.e.n.aqT()) }));
      this.kou.setVisibility(8);
      this.kom.notifyDataSetChanged();
      Y(0, true);
      this.kow = true;
    }
    while (i != 0)
    {
      GMTrace.o(11376697278464L, 84763);
      return;
      i = 0;
    }
    this.kow = false;
    GMTrace.o(11376697278464L, 84763);
  }
  
  private void dP(boolean paramBoolean)
  {
    GMTrace.i(11374415577088L, 84746);
    int j = com.tencent.mm.plugin.emoji.model.h.arl().kjy.bUZ();
    int k = com.tencent.mm.plugin.emoji.model.h.ari().kmc.kmn;
    if ((j == k) && (!paramBoolean))
    {
      this.kot.setText(R.l.dpB);
      GMTrace.o(11374415577088L, 84746);
      return;
    }
    if (k == 0)
    {
      i = j;
      k += i;
      if (!paramBoolean) {
        break label133;
      }
    }
    label133:
    for (int i = R.l.dpD;; i = R.l.dpw)
    {
      this.kot.setText(String.format(getString(i), new Object[] { Integer.valueOf(k - j), Integer.valueOf(k) }));
      GMTrace.o(11374415577088L, 84746);
      return;
      i = 0;
      break;
    }
  }
  
  private void mJ(int paramInt)
  {
    GMTrace.i(11375891972096L, 84757);
    long l = System.currentTimeMillis();
    this.kol = paramInt;
    switch (10.koL[(paramInt - 1)])
    {
    }
    for (;;)
    {
      if (this.kom != null)
      {
        this.kom.asy();
        this.kom.notifyDataSetChanged();
      }
      w.d("MicroMsg.emoji.EmojiCustomUI", "updateMode use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      GMTrace.o(11375891972096L, 84757);
      return;
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(11393340276736L, 84887);
          EmojiCustomUI.this.finish();
          GMTrace.o(11393340276736L, 84887);
          return true;
        }
      });
      le(true);
      a(0, getString(R.l.doB), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(11372670746624L, 84733);
          EmojiCustomUI.a(EmojiCustomUI.this, EmojiCustomUI.c.koT);
          com.tencent.mm.plugin.report.service.g.ork.i(11596, new Object[] { Integer.valueOf(1) });
          GMTrace.o(11372670746624L, 84733);
          return true;
        }
      });
      this.koo.setVisibility(8);
      asu();
      asq();
      for (;;)
      {
        asr();
        break;
        a(new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(11405688307712L, 84979);
            EmojiCustomUI.a(EmojiCustomUI.this, EmojiCustomUI.c.koS);
            GMTrace.o(11405688307712L, 84979);
            return true;
          }
        });
        a(0, getString(R.l.cTh), new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(19267089072128L, 143551);
            EmojiCustomUI.a(EmojiCustomUI.this, EmojiCustomUI.c.koS);
            GMTrace.o(19267089072128L, 143551);
            return true;
          }
        });
        this.koo.setVisibility(0);
        ast();
        ass();
      }
      asr();
    }
  }
  
  private boolean ws(String paramString)
  {
    GMTrace.i(11376428843008L, 84761);
    com.tencent.mm.ui.base.h.a(this.vKB.vKW, paramString, "", "", getString(R.l.dCR), null, null);
    GMTrace.o(11376428843008L, 84761);
    return true;
  }
  
  private void wt(String paramString)
  {
    GMTrace.i(11376965713920L, 84765);
    getString(R.l.cUG);
    this.kgz = com.tencent.mm.ui.base.h.a(this, paramString, true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(19267625943040L, 143555);
        GMTrace.o(19267625943040L, 143555);
      }
    });
    GMTrace.o(11376965713920L, 84765);
  }
  
  protected final void MP()
  {
    GMTrace.i(11375355101184L, 84753);
    this.kos = getLayoutInflater().inflate(R.i.cuA, null);
    this.kot = ((TextView)this.kos.findViewById(R.h.cgm));
    this.kou = ((Button)this.kos.findViewById(R.h.cgl));
    this.kou.setOnClickListener(this.koA);
    this.kon = ((HeaderGridView)findViewById(R.h.ccQ));
    HeaderGridView localHeaderGridView = this.kon;
    View localView = this.kos;
    ListAdapter localListAdapter = localHeaderGridView.getAdapter();
    if ((localListAdapter != null) && (!(localListAdapter instanceof HeaderGridView.c))) {
      throw new IllegalStateException("Cannot add header view to grid -- setAdapter has already been called.");
    }
    HeaderGridView.a locala = new HeaderGridView.a();
    HeaderGridView.b localb = new HeaderGridView.b(localHeaderGridView, localHeaderGridView.getContext());
    localb.addView(localView);
    locala.view = localView;
    locala.vZn = localb;
    locala.data = null;
    locala.isSelectable = false;
    localHeaderGridView.vZm.add(locala);
    if (localListAdapter != null) {
      ((HeaderGridView.c)localListAdapter).mDataSetObservable.notifyChanged();
    }
    this.kon.a(this.kom);
    this.kon.setOnItemClickListener(this);
    this.kon.setFocusableInTouchMode(false);
    this.koo = findViewById(R.h.ccP);
    this.kop = ((Button)findViewById(R.h.ccR));
    this.kop.setOnClickListener(this.koB);
    this.koq = ((Button)findViewById(R.h.ccS));
    this.koq.setOnClickListener(this.koC);
    GMTrace.o(11375355101184L, 84753);
  }
  
  protected final int Qf()
  {
    GMTrace.i(11375220883456L, 84752);
    GMTrace.o(11375220883456L, 84752);
    return 1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(11376831496192L, 84764);
    w.i("MicroMsg.emoji.EmojiCustomUI", "errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramk instanceof com.tencent.mm.plugin.emoji.f.c))
    {
      switch (((com.tencent.mm.plugin.emoji.f.c)paramk).gFW)
      {
      }
      for (;;)
      {
        GMTrace.o(11376831496192L, 84764);
        return;
        ase();
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramInt1 = 0;
          while (paramInt1 < this.koz.size())
          {
            w.i("MicroMsg.emoji.EmojiCustomUI", "mSelectedList md5:%s", new Object[] { this.koz.get(paramInt1) });
            com.tencent.mm.plugin.report.service.g.ork.A(10613, (String)this.koz.get(paramInt1));
            paramInt1 += 1;
          }
          paramString = com.tencent.mm.plugin.emoji.model.h.ari();
          Object localObject1 = this.koz;
          paramString = paramString.kmc;
          if (localObject1 == null) {}
          Object localObject2;
          for (paramInt1 = 0;; paramInt1 = ((ArrayList)localObject1).size())
          {
            w.i("MicroMsg.BKGLoader.BKGLoaderManager", "cleanUploadTasks size%s", new Object[] { Integer.valueOf(paramInt1) });
            if ((paramString.kmA == null) || (localObject1 == null) || (paramString.kmA.size() <= 0) || (((ArrayList)localObject1).size() <= 0)) {
              break label443;
            }
            paramk = new ArrayList();
            localObject1 = ((ArrayList)localObject1).iterator();
            while (((Iterator)localObject1).hasNext())
            {
              localObject2 = (String)((Iterator)localObject1).next();
              if (!bg.nm((String)localObject2))
              {
                Iterator localIterator = paramString.kmA.iterator();
                while (localIterator.hasNext())
                {
                  com.tencent.mm.plugin.emoji.sync.d locald = (com.tencent.mm.plugin.emoji.sync.d)localIterator.next();
                  if ((!bg.nm(locald.getKey())) && (locald.getKey().equalsIgnoreCase((String)localObject2))) {
                    paramk.add(locald);
                  }
                }
              }
            }
          }
          if ((paramString.kmA != null) && (paramString.kmA.size() > 0) && (paramk.size() > 0))
          {
            localObject1 = paramk.iterator();
            while (((Iterator)localObject1).hasNext())
            {
              localObject2 = (com.tencent.mm.plugin.emoji.sync.d)((Iterator)localObject1).next();
              paramString.kmA.remove(localObject2);
              w.i("MicroMsg.BKGLoader.BKGLoaderManager", "clean upload task :%s", new Object[] { ((com.tencent.mm.plugin.emoji.sync.d)localObject2).getKey() });
            }
          }
          paramk.clear();
          label443:
          com.tencent.mm.plugin.emoji.model.h.arl().kjy.cv(this.koz);
          asq();
          ass();
          this.mHandler.sendEmptyMessageDelayed(1004, 100L);
          GMTrace.o(11376831496192L, 84764);
          return;
        }
        w.i("MicroMsg.emoji.EmojiCustomUI", "delete failed");
        ws(getString(R.l.dpF));
        GMTrace.o(11376831496192L, 84764);
        return;
        ase();
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          com.tencent.mm.plugin.emoji.model.h.arl().kjy.cw(this.koz);
          asq();
          ass();
          this.mHandler.sendEmptyMessageDelayed(1004, 100L);
          GMTrace.o(11376831496192L, 84764);
          return;
        }
        ws(getString(R.l.dpF));
      }
    }
    w.w("MicroMsg.emoji.EmojiCustomUI", "no emoji operate");
    GMTrace.o(11376831496192L, 84764);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11375086665728L, 84751);
    int i = R.i.cuy;
    GMTrace.o(11375086665728L, 84751);
    return i;
  }
  
  protected void onActivityResult(final int paramInt1, int paramInt2, final Intent paramIntent)
  {
    GMTrace.i(11375623536640L, 84755);
    w.d("MicroMsg.emoji.EmojiCustomUI", "onActivityResult: requestCode[%d],resultCode:[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt2 == -1)
    {
      Object localObject;
      switch (paramInt1)
      {
      default: 
        w.e("MicroMsg.emoji.EmojiCustomUI", "onActivityResult: not found this requestCode");
        GMTrace.o(11375623536640L, 84755);
        return;
      case 214: 
        if (this.kom != null)
        {
          this.kom.asy();
          this.kom.notifyDataSetChanged();
          GMTrace.o(11375623536640L, 84755);
          return;
        }
        break;
      case 205: 
        if (paramIntent == null)
        {
          GMTrace.o(11375623536640L, 84755);
          return;
        }
        localObject = new Intent();
        ((Intent)localObject).putExtra("CropImageMode", 3);
        at.AR();
        ((Intent)localObject).putExtra("CropImage_OutputPath", com.tencent.mm.y.c.zb());
        com.tencent.mm.plugin.emoji.b.hnH.a((Intent)localObject, 206, this, paramIntent);
        GMTrace.o(11375623536640L, 84755);
        return;
      case 206: 
        if (paramIntent == null)
        {
          w.e("MicroMsg.emoji.EmojiCustomUI", "onActivityResult MAT_IMAGE_IN_CROP_ACTIVITY return null.");
          GMTrace.o(11375623536640L, 84755);
          return;
        }
        localObject = paramIntent.getStringExtra("CropImage_OutputPath");
        paramInt1 = paramIntent.getIntExtra("emoji_type", 0);
        if ((localObject == null) || (((String)localObject).length() <= 0))
        {
          GMTrace.o(11375623536640L, 84755);
          return;
        }
        paramIntent = ((String)localObject).substring(((String)localObject).lastIndexOf('/') + 1);
        localObject = new StringBuilder();
        at.AR();
        localObject = com.tencent.mm.y.c.zb() + paramIntent;
        this.koG = com.tencent.mm.plugin.emoji.model.h.arl().kjy.UK(paramIntent);
        localObject = com.tencent.mm.ui.tools.a.b.Xa((String)localObject);
        ((com.tencent.mm.ui.tools.a.b)localObject).mSize = com.tencent.mm.k.b.tZ();
        ((com.tencent.mm.ui.tools.a.b)localObject).DZ(com.tencent.mm.k.b.ua()).a(new b.a()
        {
          public final void a(com.tencent.mm.ui.tools.a.b paramAnonymousb)
          {
            GMTrace.i(19269102338048L, 143566);
            if (EmojiCustomUI.i(EmojiCustomUI.this) == null)
            {
              if (paramInt1 != 0) {
                break label128;
              }
              EmojiCustomUI.a(EmojiCustomUI.this, com.tencent.mm.plugin.emoji.model.h.arl().kjy.c(paramIntent, "", EmojiGroupInfo.vCo, EmojiInfo.vCv, paramAnonymousb.xkh, ""));
            }
            for (;;)
            {
              com.tencent.mm.plugin.emoji.model.h.arh().a(EmojiCustomUI.this.vKB.vKW, EmojiCustomUI.i(EmojiCustomUI.this), 1, q.zE());
              if (EmojiCustomUI.e(EmojiCustomUI.this) != null)
              {
                EmojiCustomUI.e(EmojiCustomUI.this).asy();
                EmojiCustomUI.e(EmojiCustomUI.this).notifyDataSetChanged();
              }
              GMTrace.o(19269102338048L, 143566);
              return;
              label128:
              EmojiCustomUI.a(EmojiCustomUI.this, com.tencent.mm.plugin.emoji.model.h.arl().kjy.c(paramIntent, "", EmojiGroupInfo.vCo, EmojiInfo.vCw, paramAnonymousb.xkh, ""));
            }
          }
          
          public final void aso()
          {
            GMTrace.i(19269236555776L, 143567);
            com.tencent.mm.ui.base.h.a(EmojiCustomUI.this.vKB.vKW, EmojiCustomUI.this.vKB.vKW.getString(R.l.dnT), "", EmojiCustomUI.this.vKB.vKW.getString(R.l.dCR), false, null);
            GMTrace.o(19269236555776L, 143567);
          }
        });
        GMTrace.o(11375623536640L, 84755);
        return;
      }
    }
    GMTrace.o(11375623536640L, 84755);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(11375757754368L, 84756);
    if (this.kol == c.koT)
    {
      mJ(c.koS);
      GMTrace.o(11375757754368L, 84756);
      return;
    }
    super.onBackPressed();
    GMTrace.o(11375757754368L, 84756);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11374549794816L, 84747);
    long l = System.currentTimeMillis();
    super.onCreate(paramBundle);
    this.kom = new b();
    this.kom.asy();
    MP();
    com.tencent.mm.plugin.emoji.model.h.ari().dO(true);
    mJ(c.koS);
    at.AR();
    boolean bool = ((Boolean)com.tencent.mm.y.c.xh().get(w.a.vqg, Boolean.valueOf(true))).booleanValue();
    w.i("MicroMsg.emoji.EmojiCustomUI", "[cpan] touch batch emoji download from EmojiCustomUI needDownload:%b", new Object[] { Boolean.valueOf(bool) });
    if (bool)
    {
      paramBundle = new com.tencent.mm.plugin.emoji.f.e();
      at.wS().a(paramBundle, 0);
    }
    com.tencent.mm.plugin.emoji.model.h.arl().kjy.c(this.koD);
    com.tencent.mm.plugin.report.service.g.ork.a(406L, 9L, 1L, false);
    com.tencent.mm.plugin.report.service.g.ork.a(406L, 11L, System.currentTimeMillis() - l, false);
    GMTrace.o(11374549794816L, 84747);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11374952448000L, 84750);
    super.onDestroy();
    com.tencent.mm.plugin.emoji.model.h.arl().kjy.j(this.koD);
    com.tencent.mm.plugin.emoji.model.h.ari().dO(false);
    BKGLoaderManager localBKGLoaderManager = com.tencent.mm.plugin.emoji.model.h.ari().kmc;
    if (localBKGLoaderManager.kmt) {
      localBKGLoaderManager.kmt = false;
    }
    GMTrace.o(11374952448000L, 84750);
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(11375489318912L, 84754);
    EmojiInfo localEmojiInfo;
    if (this.kom != null)
    {
      paramInt -= this.kon.vZm.size() * 5;
      if ((this.kol == c.koS) && (paramInt == this.kom.asx()))
      {
        at.AR();
        if (!com.tencent.mm.y.c.isSDCardAvailable())
        {
          u.fo(this);
          GMTrace.o(11375489318912L, 84754);
          return;
        }
        if (this.kom.asx() < com.tencent.mm.plugin.emoji.e.n.aqT()) {
          break label232;
        }
        com.tencent.mm.ui.base.h.a(this, getString(R.l.dpJ), "", new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(19268431249408L, 143561);
            GMTrace.o(19268431249408L, 143561);
          }
        });
        com.tencent.mm.plugin.report.service.g.ork.i(11596, new Object[] { Integer.valueOf(0) });
      }
      if ((this.kol == c.koT) && (paramInt < this.kom.asx()))
      {
        localEmojiInfo = this.kom.mK(paramInt);
        paramAdapterView = null;
        if (paramView != null) {
          paramAdapterView = (d)paramView.getTag();
        }
        if (localEmojiInfo.field_catalog != EmojiGroupInfo.vCm) {
          break label240;
        }
        com.tencent.mm.ui.base.h.h(this.vKB.vKW, R.l.dfd, R.l.dfd).show();
      }
    }
    for (;;)
    {
      ass();
      if (paramAdapterView == null) {
        this.kom.notifyDataSetChanged();
      }
      GMTrace.o(11375489318912L, 84754);
      return;
      label232:
      com.tencent.mm.pluginsdk.ui.tools.k.Q(this);
      break;
      label240:
      if (!this.koz.contains(localEmojiInfo.GS()))
      {
        paramView = localEmojiInfo.GS();
        if (this.koz != null) {
          this.koz.add(paramView);
        }
        if (paramAdapterView != null) {
          paramAdapterView.koZ.setChecked(true);
        }
        w.i("MicroMsg.emoji.EmojiCustomUI", "selected md5:%s", new Object[] { localEmojiInfo.GS() });
      }
      else
      {
        paramView = localEmojiInfo.GS();
        if (this.koz != null) {
          this.koz.remove(paramView);
        }
        if (paramAdapterView != null)
        {
          paramAdapterView.koZ.setChecked(false);
          this.kom.notifyDataSetChanged();
        }
        w.i("MicroMsg.emoji.EmojiCustomUI", "unselected md5:%s", new Object[] { localEmojiInfo.GS() });
      }
    }
  }
  
  protected void onPause()
  {
    GMTrace.i(11374818230272L, 84749);
    super.onPause();
    Object localObject = com.tencent.mm.plugin.emoji.model.h.ari();
    com.tencent.mm.plugin.emoji.sync.c localc = this.koE;
    localObject = ((com.tencent.mm.plugin.emoji.sync.a)localObject).kmc;
    if (((BKGLoaderManager)localObject).kmC == null) {
      ((BKGLoaderManager)localObject).kmC = new HashSet();
    }
    if (((BKGLoaderManager)localObject).kmC.contains(localc)) {
      ((BKGLoaderManager)localObject).kmC.remove(localc);
    }
    at.wS().b(698, this);
    GMTrace.o(11374818230272L, 84749);
  }
  
  protected void onResume()
  {
    GMTrace.i(11374684012544L, 84748);
    super.onResume();
    Object localObject = com.tencent.mm.plugin.emoji.model.h.ari();
    com.tencent.mm.plugin.emoji.sync.c localc = this.koE;
    localObject = ((com.tencent.mm.plugin.emoji.sync.a)localObject).kmc;
    if (((BKGLoaderManager)localObject).kmC == null) {
      ((BKGLoaderManager)localObject).kmC = new HashSet();
    }
    if (!((BKGLoaderManager)localObject).kmC.contains(localc)) {
      ((BKGLoaderManager)localObject).kmC.add(localc);
    }
    asu();
    at.wS().a(698, this);
    GMTrace.o(11374684012544L, 84748);
  }
  
  private static enum a
  {
    static
    {
      GMTrace.i(11367033602048L, 84691);
      koM = new a("START", 0);
      koN = new a("PAUSE", 1);
      koO = new a("EMPTY", 2);
      koP = new a[] { koM, koN, koO };
      GMTrace.o(11367033602048L, 84691);
    }
    
    private a()
    {
      GMTrace.i(11366899384320L, 84690);
      GMTrace.o(11366899384320L, 84690);
    }
  }
  
  final class b
    extends BaseAdapter
  {
    private ArrayList<EmojiInfo> koQ;
    private Animation koR;
    
    public b()
    {
      GMTrace.i(11364483465216L, 84672);
      this.koR = AnimationUtils.loadAnimation(EmojiCustomUI.this, R.a.aLR);
      this$1 = new LinearInterpolator();
      this.koR.setInterpolator(EmojiCustomUI.this);
      GMTrace.o(11364483465216L, 84672);
    }
    
    private void a(ImageView paramImageView, EmojiInfo paramEmojiInfo)
    {
      GMTrace.i(11365557207040L, 84680);
      paramImageView.setImageBitmap(null);
      String str1 = paramEmojiInfo.bUU();
      String str2 = str1 + "_cover";
      com.tencent.mm.ao.a.a.c.a locala = new com.tencent.mm.ao.a.a.c.a();
      locala.gKH = 1;
      locala.gKO = true;
      locala.eIy = str2;
      locala.gKE = str1;
      locala.gLe = new Object[] { paramEmojiInfo };
      locala.gLd = true;
      paramEmojiInfo = locala.Jn();
      com.tencent.mm.ao.n.Jd().a(str1, paramImageView, paramEmojiInfo, null, EmojiCustomUI.m(EmojiCustomUI.this), EmojiCustomUI.n(EmojiCustomUI.this));
      GMTrace.o(11365557207040L, 84680);
    }
    
    private int asw()
    {
      GMTrace.i(11364751900672L, 84674);
      if ((asx() > 0) && ((asx() + 1) % 5 == 0))
      {
        GMTrace.o(11364751900672L, 84674);
        return 1;
      }
      GMTrace.o(11364751900672L, 84674);
      return 2;
    }
    
    public final int asx()
    {
      GMTrace.i(11364886118400L, 84675);
      if (this.koQ == null)
      {
        GMTrace.o(11364886118400L, 84675);
        return 0;
      }
      int i = this.koQ.size();
      GMTrace.o(11364886118400L, 84675);
      return i;
    }
    
    public final boolean asy()
    {
      GMTrace.i(11365422989312L, 84679);
      at.AR();
      int i;
      if (com.tencent.mm.y.c.isSDCardAvailable())
      {
        Object localObject1 = com.tencent.mm.plugin.emoji.model.h.arl().kjy;
        ArrayList localArrayList = new ArrayList();
        Object localObject2 = EmojiGroupInfo.vCn;
        localObject1 = ((com.tencent.mm.storage.emotion.d)localObject1).fTZ.a("select * from EmojiInfo where catalog=? order by reserved3 asc", new String[] { localObject2 }, 2);
        if (((Cursor)localObject1).moveToFirst()) {
          do
          {
            com.tencent.mm.plugin.emoji.d.apQ();
            localObject2 = new EmojiInfo(com.tencent.mm.plugin.emoji.d.apR());
            ((EmojiInfo)localObject2).b((Cursor)localObject1);
            localArrayList.add(localObject2);
          } while (((Cursor)localObject1).moveToNext());
        }
        ((Cursor)localObject1).close();
        this.koQ = ((ArrayList)localArrayList);
        if (EmojiCustomUI.k(EmojiCustomUI.this) != EmojiCustomUI.c.koT) {
          break label227;
        }
        if (EmojiCustomUI.l(EmojiCustomUI.this) != null) {
          break label213;
        }
        i = 0;
        label161:
        EmojiCustomUI.this.sq(EmojiCustomUI.this.getString(R.l.dop, new Object[] { Integer.valueOf(i) }));
      }
      for (;;)
      {
        GMTrace.o(11365422989312L, 84679);
        return true;
        this.koQ = new ArrayList();
        break;
        label213:
        i = EmojiCustomUI.l(EmojiCustomUI.this).size();
        break label161;
        label227:
        EmojiCustomUI.this.sq(EmojiCustomUI.this.getString(R.l.dnV, new Object[] { Integer.valueOf(this.koQ.size()) }));
      }
    }
    
    public final int getCount()
    {
      GMTrace.i(11364617682944L, 84673);
      int i = asx();
      int j = asw();
      GMTrace.o(11364617682944L, 84673);
      return i + j;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(11365154553856L, 84677);
      long l = paramInt;
      GMTrace.o(11365154553856L, 84677);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(11365288771584L, 84678);
      label60:
      int i;
      if ((paramView == null) || (paramView.getTag() == null))
      {
        paramView = LayoutInflater.from(EmojiCustomUI.this.vKB.vKW).inflate(R.i.cuz, null);
        paramView.setVisibility(0);
        paramViewGroup = new EmojiCustomUI.d(paramView);
        paramView.setTag(paramViewGroup);
        if ((EmojiCustomUI.k(EmojiCustomUI.this) != EmojiCustomUI.c.koV) && (EmojiCustomUI.k(EmojiCustomUI.this) != EmojiCustomUI.c.koT)) {
          break label195;
        }
        i = asw();
        label92:
        if (paramInt >= getCount() - i) {
          break label219;
        }
        if (paramInt % 5 != 0) {
          break label206;
        }
        paramViewGroup.koX.setBackgroundResource(R.g.aWi);
      }
      for (;;)
      {
        paramViewGroup.koY.clearAnimation();
        switch (EmojiCustomUI.10.koL[(EmojiCustomUI.k(EmojiCustomUI.this) - 1)])
        {
        default: 
          GMTrace.o(11365288771584L, 84678);
          return paramView;
          paramView.setVisibility(0);
          paramViewGroup = (EmojiCustomUI.d)paramView.getTag();
          break label60;
          label195:
          i = asw() - 1;
          break label92;
          label206:
          paramViewGroup.koX.setBackgroundResource(R.g.aWl);
          continue;
          label219:
          if (paramInt == getCount() - i) {
            paramViewGroup.koX.setBackgroundResource(R.g.aWk);
          } else {
            paramViewGroup.koX.setBackgroundColor(0);
          }
          break;
        }
      }
      if (paramInt == getCount() - asw() + 1)
      {
        com.tencent.mm.ao.n.Jd().a("", paramViewGroup.koY);
        paramViewGroup.koY.setImageBitmap(null);
      }
      EmojiInfo localEmojiInfo;
      for (;;)
      {
        paramViewGroup.koZ.setVisibility(8);
        break;
        if (paramInt == asx())
        {
          com.tencent.mm.ao.n.Jd().a("", paramViewGroup.koY);
          paramViewGroup.koY.setImageResource(R.k.cMa);
        }
        else
        {
          localEmojiInfo = (EmojiInfo)this.koQ.get(paramInt);
          a(paramViewGroup.koY, localEmojiInfo);
        }
      }
      if (paramInt == getCount() - asw() + 1)
      {
        com.tencent.mm.ao.n.Jd().a("", paramViewGroup.koY);
        paramViewGroup.koY.setImageBitmap(null);
      }
      for (;;)
      {
        paramViewGroup.koZ.setVisibility(8);
        break;
        if (paramInt == asx())
        {
          com.tencent.mm.ao.n.Jd().a("", paramViewGroup.koY);
          paramViewGroup.koY.setImageResource(R.g.aZb);
          paramViewGroup.koY.startAnimation(this.koR);
        }
        else
        {
          localEmojiInfo = (EmojiInfo)this.koQ.get(paramInt);
          a(paramViewGroup.koY, localEmojiInfo);
        }
      }
      if (paramInt == getCount() - asw() + 1)
      {
        com.tencent.mm.ao.n.Jd().a("", paramViewGroup.koY);
        paramViewGroup.koY.setImageBitmap(null);
      }
      for (;;)
      {
        paramViewGroup.koZ.setVisibility(8);
        break;
        if (paramInt == asx())
        {
          com.tencent.mm.ao.n.Jd().a("", paramViewGroup.koY);
          paramViewGroup.koY.setImageBitmap(null);
        }
        else
        {
          localEmojiInfo = (EmojiInfo)this.koQ.get(paramInt);
          a(paramViewGroup.koY, localEmojiInfo);
          if (localEmojiInfo.field_catalog != EmojiGroupInfo.vCm)
          {
            paramViewGroup.koZ.setVisibility(0);
            paramViewGroup.koZ.setChecked(EmojiCustomUI.l(EmojiCustomUI.this).contains(localEmojiInfo.GS()));
            break;
            if (paramInt == getCount() - asw() + 1)
            {
              com.tencent.mm.ao.n.Jd().a("", paramViewGroup.koY);
              paramViewGroup.koY.setImageBitmap(null);
            }
            else if (paramInt == asx())
            {
              com.tencent.mm.ao.n.Jd().a("", paramViewGroup.koY);
              paramViewGroup.koY.setImageBitmap(null);
            }
            else
            {
              localEmojiInfo = (EmojiInfo)this.koQ.get(paramInt);
              a(paramViewGroup.koY, localEmojiInfo);
            }
          }
        }
      }
    }
    
    public final EmojiInfo mK(int paramInt)
    {
      GMTrace.i(11365020336128L, 84676);
      if (paramInt >= asx())
      {
        GMTrace.o(11365020336128L, 84676);
        return null;
      }
      if (this.koQ == null)
      {
        GMTrace.o(11365020336128L, 84676);
        return null;
      }
      EmojiInfo localEmojiInfo = (EmojiInfo)this.koQ.get(paramInt);
      GMTrace.o(11365020336128L, 84676);
      return localEmojiInfo;
    }
  }
  
  private static enum c
  {
    static
    {
      GMTrace.i(11399782727680L, 84935);
      koS = 1;
      koT = 2;
      koU = 3;
      koV = 4;
      koW = new int[] { koS, koT, koU, koV };
      GMTrace.o(11399782727680L, 84935);
    }
    
    public static int[] asz()
    {
      GMTrace.i(11399648509952L, 84934);
      int[] arrayOfInt = (int[])koW.clone();
      GMTrace.o(11399648509952L, 84934);
      return arrayOfInt;
    }
  }
  
  static final class d
  {
    View koX;
    ImageView koY;
    CheckBox koZ;
    
    public d(View paramView)
    {
      GMTrace.i(11415888855040L, 85055);
      this.koX = paramView.findViewById(R.h.bIB);
      this.koY = ((ImageView)paramView.findViewById(R.h.image));
      this.koZ = ((CheckBox)paramView.findViewById(R.h.checked));
      GMTrace.o(11415888855040L, 85055);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\EmojiCustomUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
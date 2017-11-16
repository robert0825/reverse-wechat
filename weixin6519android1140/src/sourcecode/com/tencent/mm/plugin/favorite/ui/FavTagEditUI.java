package com.tencent.mm.plugin.favorite.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.k;
import com.tencent.mm.plugin.favorite.b.t;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.ui.a.c;
import com.tencent.mm.plugin.favorite.ui.a.d;
import com.tencent.mm.plugin.favorite.ui.base.FavTagPanel;
import com.tencent.mm.protocal.c.ua;
import com.tencent.mm.protocal.c.ub;
import com.tencent.mm.protocal.c.uc;
import com.tencent.mm.protocal.c.ud;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMTagPanel;
import com.tencent.mm.ui.base.MMTagPanel.a;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FavTagEditUI
  extends MMActivity
{
  private j lfg;
  private List<String> lfh;
  private FavTagPanel lfi;
  private FavTagPanel lfj;
  private ListView lfk;
  private ListView lfl;
  private TextView lfm;
  private c lfn;
  private d lfo;
  private boolean lfp;
  
  public FavTagEditUI()
  {
    GMTrace.i(6322191859712L, 47104);
    GMTrace.o(6322191859712L, 47104);
  }
  
  private void ayH()
  {
    GMTrace.i(6322594512896L, 47107);
    if (this.lfp)
    {
      w.w("MicroMsg.FavTagEditUI", "match max length, disable finish button");
      if (bXq()) {
        Y(0, false);
      }
      GMTrace.o(6322594512896L, 47107);
      return;
    }
    if (this.lfg == null)
    {
      if ((this.lfj.ulN.size() <= 0) && (this.lfj.cam().length() <= 0))
      {
        if (bXq())
        {
          Y(0, false);
          GMTrace.o(6322594512896L, 47107);
        }
      }
      else if (!bXq())
      {
        Y(0, true);
        GMTrace.o(6322594512896L, 47107);
      }
    }
    else if ((this.lfg.field_tagProto.ulP.size() != this.lfj.ulN.size()) || (this.lfj.cam().length() > 0))
    {
      if (!bXq())
      {
        Y(0, true);
        GMTrace.o(6322594512896L, 47107);
      }
    }
    else
    {
      ArrayList localArrayList = this.lfj.car();
      int i = 0;
      while (i < localArrayList.size())
      {
        if (!((String)localArrayList.get(i)).equals(this.lfg.field_tagProto.ulP.get(i)))
        {
          if (!bXq()) {
            Y(0, true);
          }
          GMTrace.o(6322594512896L, 47107);
          return;
        }
        i += 1;
      }
      if (bXq()) {
        Y(0, false);
      }
    }
    GMTrace.o(6322594512896L, 47107);
  }
  
  private void ayI()
  {
    GMTrace.i(6322997166080L, 47110);
    com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(R.l.duq), "", getString(R.l.cRM), getString(R.l.cSk), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(6440303460352L, 47984);
        FavTagEditUI.this.finish();
        GMTrace.o(6440303460352L, 47984);
      }
    }, null);
    GMTrace.o(6322997166080L, 47110);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6322326077440L, 47105);
    int i = R.i.cwH;
    GMTrace.o(6322326077440L, 47105);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6322460295168L, 47106);
    super.onCreate(paramBundle);
    final long l = getIntent().getLongExtra("key_fav_item_id", -1L);
    if (-1L != l) {
      this.lfg = com.tencent.mm.plugin.favorite.h.axB().cf(l);
    }
    this.lfh = getIntent().getStringArrayListExtra("key_fav_result_list");
    this.lfj = ((FavTagPanel)findViewById(R.h.bzs));
    this.lfk = ((ListView)findViewById(R.h.cgq));
    this.lfl = ((ListView)findViewById(R.h.caN));
    this.lfm = ((TextView)findViewById(R.h.bMy));
    this.lfj.lJ(true);
    this.lfj.Cc(R.g.baJ);
    this.lfj.wfo = true;
    this.lfj.wfk = new MMTagPanel.a()
    {
      public final void atg()
      {
        GMTrace.i(6373865684992L, 47489);
        GMTrace.o(6373865684992L, 47489);
      }
      
      public final void j(boolean paramAnonymousBoolean, int paramAnonymousInt)
      {
        GMTrace.i(6373999902720L, 47490);
        FavTagEditUI.a(FavTagEditUI.this, paramAnonymousBoolean);
        TextView localTextView = FavTagEditUI.k(FavTagEditUI.this);
        if ((FavTagEditUI.b(FavTagEditUI.this)) && (paramAnonymousInt > 0)) {}
        for (int i = 0;; i = 8)
        {
          localTextView.setVisibility(i);
          FavTagEditUI.k(FavTagEditUI.this).setText(FavTagEditUI.this.getString(R.l.duX, new Object[] { Integer.valueOf(paramAnonymousInt) }));
          FavTagEditUI.c(FavTagEditUI.this);
          GMTrace.o(6373999902720L, 47490);
          return;
        }
      }
      
      public final void wv(String paramAnonymousString)
      {
        GMTrace.i(6373194596352L, 47484);
        FavTagEditUI.d(FavTagEditUI.this).removeTag(paramAnonymousString);
        FavTagEditUI.f(FavTagEditUI.this).yd(paramAnonymousString);
        if (FavTagEditUI.g(FavTagEditUI.this) != null) {
          FavTagEditUI.g(FavTagEditUI.this).bb(paramAnonymousString, false);
        }
        FavTagEditUI.c(FavTagEditUI.this);
        GMTrace.o(6373194596352L, 47484);
      }
      
      public final void ww(String paramAnonymousString)
      {
        GMTrace.i(6373328814080L, 47485);
        GMTrace.o(6373328814080L, 47485);
      }
      
      public final void wx(String paramAnonymousString)
      {
        GMTrace.i(6373463031808L, 47486);
        FavTagEditUI.d(FavTagEditUI.this).removeTag(paramAnonymousString);
        FavTagEditUI.f(FavTagEditUI.this).yd(paramAnonymousString);
        if (FavTagEditUI.g(FavTagEditUI.this) != null) {
          FavTagEditUI.g(FavTagEditUI.this).bb(paramAnonymousString, false);
        }
        FavTagEditUI.c(FavTagEditUI.this);
        GMTrace.o(6373463031808L, 47486);
      }
      
      public final void wy(String paramAnonymousString)
      {
        GMTrace.i(6373597249536L, 47487);
        if (!bg.nm(paramAnonymousString))
        {
          d locald = FavTagEditUI.h(FavTagEditUI.this);
          locald.lgo.clear();
          locald.lgn.clear();
          locald.lgm = bg.aq(paramAnonymousString, "");
          Object localObject = com.tencent.mm.plugin.favorite.h.axu();
          boolean bool = bg.nm(paramAnonymousString);
          ArrayList localArrayList = new ArrayList(16);
          localObject = ((t)localObject).lbp.ulN.iterator();
          while (((Iterator)localObject).hasNext())
          {
            Iterator localIterator = ((ub)((Iterator)localObject).next()).ulM.iterator();
            while (localIterator.hasNext())
            {
              ua localua = (ua)localIterator.next();
              if ((bool) || (localua.rOy.contains(paramAnonymousString))) {
                localArrayList.add(localua.rOy);
              }
            }
          }
          locald.lgn.addAll(localArrayList);
          locald.notifyDataSetChanged();
          FavTagEditUI.i(FavTagEditUI.this).setVisibility(0);
          FavTagEditUI.j(FavTagEditUI.this).setVisibility(8);
        }
        for (;;)
        {
          FavTagEditUI.c(FavTagEditUI.this);
          GMTrace.o(6373597249536L, 47487);
          return;
          FavTagEditUI.i(FavTagEditUI.this).setVisibility(8);
          FavTagEditUI.j(FavTagEditUI.this).setVisibility(0);
        }
      }
      
      public final void wz(String paramAnonymousString)
      {
        GMTrace.i(6373731467264L, 47488);
        if (bg.nm(paramAnonymousString))
        {
          w.d("MicroMsg.FavTagEditUI", "on create tag, fail, tag is empty");
          GMTrace.o(6373731467264L, 47488);
          return;
        }
        FavTagEditUI.d(FavTagEditUI.this).ba(paramAnonymousString, true);
        FavTagEditUI.c(FavTagEditUI.this);
        GMTrace.o(6373731467264L, 47488);
      }
    };
    this.lfj.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6443524685824L, 48008);
        FavTagEditUI.d(FavTagEditUI.this).cap();
        FavTagEditUI.this.aLs();
        GMTrace.o(6443524685824L, 48008);
      }
    }, 100L);
    Object localObject;
    if (this.lfg != null)
    {
      this.lfj.a(this.lfg.field_tagProto.ulP, this.lfg.field_tagProto.ulP);
      this.lfn = new c(this.vKB.vKW)
      {
        protected final void ya(String paramAnonymousString)
        {
          GMTrace.i(6376013168640L, 47505);
          FavTagEditUI.d(FavTagEditUI.this).ba(paramAnonymousString, true);
          if (FavTagEditUI.g(FavTagEditUI.this) != null) {
            FavTagEditUI.g(FavTagEditUI.this).bb(paramAnonymousString, true);
          }
          FavTagEditUI.c(FavTagEditUI.this);
          GMTrace.o(6376013168640L, 47505);
        }
        
        protected final void yb(String paramAnonymousString)
        {
          GMTrace.i(6376147386368L, 47506);
          FavTagEditUI.d(FavTagEditUI.this).removeTag(paramAnonymousString);
          if (FavTagEditUI.g(FavTagEditUI.this) != null) {
            FavTagEditUI.g(FavTagEditUI.this).bb(paramAnonymousString, false);
          }
          FavTagEditUI.c(FavTagEditUI.this);
          GMTrace.o(6376147386368L, 47506);
        }
      };
      localObject = this.lfn;
      if (this.lfg != null) {
        break label618;
      }
    }
    label618:
    for (paramBundle = null;; paramBundle = this.lfg.field_tagProto.ulP)
    {
      ((c)localObject).aB(paramBundle);
      if ((this.lfg != null) && (!this.lfg.field_tagProto.ulO.isEmpty()))
      {
        paramBundle = View.inflate(this.vKB.vKW, R.i.cwK, null);
        localObject = (TextView)paramBundle.findViewById(R.h.bzj);
        ((TextView)localObject).setText(getString(R.l.dur));
        ((TextView)localObject).setVisibility(0);
        int i = getResources().getDimensionPixelSize(R.f.aQf);
        this.lfi = ((FavTagPanel)paramBundle.findViewById(R.h.bzt));
        this.lfi.setVisibility(0);
        this.lfi.a(this.lfg.field_tagProto.ulP, this.lfg.field_tagProto.ulO);
        this.lfi.setBackgroundResource(R.g.aXD);
        this.lfi.setPadding(0, 0, 0, i);
        this.lfi.wfk = new MMTagPanel.a()
        {
          public final void atg()
          {
            GMTrace.i(6467281223680L, 48185);
            GMTrace.o(6467281223680L, 48185);
          }
          
          public final void j(boolean paramAnonymousBoolean, int paramAnonymousInt)
          {
            GMTrace.i(6467683876864L, 48188);
            GMTrace.o(6467683876864L, 48188);
          }
          
          public final void wv(String paramAnonymousString)
          {
            GMTrace.i(6466878570496L, 48182);
            FavTagEditUI.d(FavTagEditUI.this).removeTag(paramAnonymousString);
            FavTagEditUI.f(FavTagEditUI.this).yd(paramAnonymousString);
            FavTagEditUI.c(FavTagEditUI.this);
            GMTrace.o(6466878570496L, 48182);
          }
          
          public final void ww(String paramAnonymousString)
          {
            GMTrace.i(6467012788224L, 48183);
            FavTagEditUI.d(FavTagEditUI.this).ba(paramAnonymousString, true);
            FavTagEditUI.f(FavTagEditUI.this).yc(paramAnonymousString);
            FavTagEditUI.c(FavTagEditUI.this);
            GMTrace.o(6467012788224L, 48183);
          }
          
          public final void wx(String paramAnonymousString)
          {
            GMTrace.i(6467147005952L, 48184);
            GMTrace.o(6467147005952L, 48184);
          }
          
          public final void wy(String paramAnonymousString)
          {
            GMTrace.i(6467415441408L, 48186);
            GMTrace.o(6467415441408L, 48186);
          }
          
          public final void wz(String paramAnonymousString)
          {
            GMTrace.i(6467549659136L, 48187);
            GMTrace.o(6467549659136L, 48187);
          }
        };
        this.lfk.addHeaderView(paramBundle);
      }
      if (com.tencent.mm.plugin.favorite.h.axu().axR() > 0) {
        this.lfk.addHeaderView(View.inflate(this.vKB.vKW, R.i.cwJ, null));
      }
      this.lfk.setAdapter(this.lfn);
      this.lfk.setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(6325010432000L, 47125);
          FavTagEditUI.d(FavTagEditUI.this).caq();
          GMTrace.o(6325010432000L, 47125);
          return false;
        }
      });
      this.lfo = new d(this.vKB.vKW)
      {
        protected final void xf(String paramAnonymousString)
        {
          GMTrace.i(6317360021504L, 47068);
          FavTagEditUI.d(FavTagEditUI.this).ba(paramAnonymousString, true);
          FavTagEditUI.f(FavTagEditUI.this).yc(paramAnonymousString);
          FavTagEditUI.d(FavTagEditUI.this).can();
          FavTagEditUI.d(FavTagEditUI.this).caq();
          FavTagEditUI.c(FavTagEditUI.this);
          GMTrace.o(6317360021504L, 47068);
        }
      };
      this.lfl.setAdapter(this.lfo);
      this.lfl.setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(6371315548160L, 47470);
          FavTagEditUI.d(FavTagEditUI.this).caq();
          GMTrace.o(6371315548160L, 47470);
          return false;
        }
      });
      oM(R.l.dtk);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(6313199271936L, 47037);
          FavTagEditUI.a(FavTagEditUI.this);
          GMTrace.o(6313199271936L, 47037);
          return true;
        }
      });
      a(0, getString(R.l.cTh), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(6338566422528L, 47226);
          if (FavTagEditUI.b(FavTagEditUI.this))
          {
            FavTagEditUI.c(FavTagEditUI.this);
            GMTrace.o(6338566422528L, 47226);
            return true;
          }
          paramAnonymousMenuItem = FavTagEditUI.d(FavTagEditUI.this).car();
          Object localObject1 = FavTagEditUI.d(FavTagEditUI.this).cam().trim();
          if (!bg.nm((String)localObject1))
          {
            paramAnonymousMenuItem.remove(localObject1);
            paramAnonymousMenuItem.add(localObject1);
          }
          FavTagEditUI.a(FavTagEditUI.this, com.tencent.mm.plugin.favorite.h.axB().cf(l));
          if (FavTagEditUI.e(FavTagEditUI.this) != null)
          {
            x.a(FavTagEditUI.e(FavTagEditUI.this), paramAnonymousMenuItem, FavTagEditUI.this.getIntent().getIntExtra("key_fav_scene", 1));
            localObject1 = new Intent();
            ((Intent)localObject1).putExtra("key_fav_result_list", paramAnonymousMenuItem);
            FavTagEditUI.this.setResult(-1, (Intent)localObject1);
          }
          for (;;)
          {
            FavTagEditUI.this.finish();
            FavTagEditUI.this.aLo();
            GMTrace.o(6338566422528L, 47226);
            return true;
            localObject1 = new String[paramAnonymousMenuItem.size()];
            Object localObject2 = paramAnonymousMenuItem.iterator();
            int i = 0;
            while (((Iterator)localObject2).hasNext())
            {
              localObject1[i] = ((String)((Iterator)localObject2).next());
              i += 1;
            }
            localObject2 = new Intent();
            ((Intent)localObject2).putExtra("key_fav_result_array", (String[])localObject1);
            ((Intent)localObject2).putExtra("key_fav_result_list", paramAnonymousMenuItem);
            FavTagEditUI.this.setResult(-1, (Intent)localObject2);
          }
        }
      }, p.b.vLG);
      ayH();
      com.tencent.mm.plugin.favorite.h.axu().a(this.lfn);
      GMTrace.o(6322460295168L, 47106);
      return;
      if (this.lfh == null) {
        break;
      }
      this.lfj.a(this.lfh, this.lfh);
      break;
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6322728730624L, 47108);
    super.onDestroy();
    t localt = com.tencent.mm.plugin.favorite.h.axu();
    c localc = this.lfn;
    if (localc == null)
    {
      GMTrace.o(6322728730624L, 47108);
      return;
    }
    localt.gEO.remove(localc.toString());
    GMTrace.o(6322728730624L, 47108);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(6322862948352L, 47109);
    if (paramInt == 4)
    {
      ayI();
      GMTrace.o(6322862948352L, 47109);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(6322862948352L, 47109);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\FavTagEditUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
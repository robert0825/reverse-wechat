package com.tencent.mm.ui.friend;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.j;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelfriend.j;
import com.tencent.mm.modelfriend.j.a;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.af.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import java.util.List;

public class FindMContactInviteUI
  extends MMWizardActivity
{
  private e gWn;
  private ListView htD;
  private ProgressDialog htG;
  private int ibA;
  private TextView jqc;
  private View mOO;
  private boolean oaK;
  private String osl;
  private int vWs;
  private j xbo;
  private TextView xbp;
  private TextView xbq;
  private TextView xbr;
  private TextView xbs;
  private Button xbt;
  private List<String[]> xbu;
  private j.a xbv;
  private String xbx;
  
  public FindMContactInviteUI()
  {
    GMTrace.i(2825551609856L, 21052);
    this.htG = null;
    this.jqc = null;
    this.xbp = null;
    this.xbq = null;
    this.xbr = null;
    this.xbs = null;
    this.xbt = null;
    this.xbx = null;
    this.gWn = null;
    this.vWs = 2;
    this.oaK = true;
    this.xbv = new j.a()
    {
      public final void notifyDataSetChanged()
      {
        GMTrace.i(2830920318976L, 21092);
        if ((FindMContactInviteUI.d(FindMContactInviteUI.this) != 2) && (FindMContactInviteUI.d(FindMContactInviteUI.this) == 1))
        {
          FindMContactInviteUI.e(FindMContactInviteUI.this).setText(FindMContactInviteUI.this.getString(R.l.dvS));
          if (!FindMContactInviteUI.b(FindMContactInviteUI.this).Hj()) {
            break label251;
          }
          if ((FindMContactInviteUI.d(FindMContactInviteUI.this) != 1) && (FindMContactInviteUI.e(FindMContactInviteUI.this).getVisibility() == 0) && (FindMContactInviteUI.f(FindMContactInviteUI.this) != null))
          {
            FindMContactInviteUI.e(FindMContactInviteUI.this).setVisibility(8);
            FindMContactInviteUI.f(FindMContactInviteUI.this).setVisibility(0);
          }
        }
        for (;;)
        {
          if ((FindMContactInviteUI.b(FindMContactInviteUI.this).Hi() <= 0) || (FindMContactInviteUI.d(FindMContactInviteUI.this) == 1)) {
            break label313;
          }
          FindMContactInviteUI.g(FindMContactInviteUI.this).setText(FindMContactInviteUI.this.getResources().getQuantityString(R.j.cIi, FindMContactInviteUI.b(FindMContactInviteUI.this).Hi(), new Object[] { Integer.valueOf(FindMContactInviteUI.b(FindMContactInviteUI.this).Hi()) }));
          GMTrace.o(2830920318976L, 21092);
          return;
          FindMContactInviteUI.e(FindMContactInviteUI.this).setText(FindMContactInviteUI.this.getString(R.l.dvR, new Object[] { Integer.valueOf(FindMContactInviteUI.b(FindMContactInviteUI.this).getCount()) }));
          break;
          label251:
          if ((FindMContactInviteUI.d(FindMContactInviteUI.this) != 1) && (FindMContactInviteUI.e(FindMContactInviteUI.this).getVisibility() == 8) && (FindMContactInviteUI.f(FindMContactInviteUI.this) != null))
          {
            FindMContactInviteUI.e(FindMContactInviteUI.this).setVisibility(0);
            FindMContactInviteUI.f(FindMContactInviteUI.this).setVisibility(8);
          }
        }
        label313:
        FindMContactInviteUI.g(FindMContactInviteUI.this).setText(FindMContactInviteUI.this.getResources().getQuantityString(R.j.cIj, FindMContactInviteUI.b(FindMContactInviteUI.this).getCount(), new Object[] { Integer.valueOf(FindMContactInviteUI.b(FindMContactInviteUI.this).getCount()) }));
        GMTrace.o(2830920318976L, 21092);
      }
    };
    GMTrace.o(2825551609856L, 21052);
  }
  
  private void bci()
  {
    GMTrace.i(2825954263040L, 21055);
    com.tencent.mm.plugin.c.b.nz(this.osl);
    aLo();
    Bh(1);
    GMTrace.o(2825954263040L, 21055);
  }
  
  private void chs()
  {
    GMTrace.i(2826222698496L, 21057);
    ActionBarActivity localActionBarActivity = this.vKB.vKW;
    getString(R.l.cUG);
    this.htG = h.a(localActionBarActivity, getString(R.l.dIP), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(2805553168384L, 20903);
        GMTrace.o(2805553168384L, 20903);
      }
    });
    at.xB().a(new af.a()
    {
      public final boolean Dj()
      {
        GMTrace.i(2830249230336L, 21087);
        try
        {
          FindMContactInviteUI.a(FindMContactInviteUI.this, com.tencent.mm.pluginsdk.a.dC(FindMContactInviteUI.this));
          FindMContactInviteUI.b(FindMContactInviteUI.this).gCU = FindMContactInviteUI.c(FindMContactInviteUI.this);
          FindMContactInviteUI.b(FindMContactInviteUI.this).e(com.tencent.mm.modelfriend.af.Il());
          GMTrace.o(2830249230336L, 21087);
          return true;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.FindMContactInviteUI", localException, "", new Object[0]);
          }
        }
      }
      
      public final boolean Dk()
      {
        GMTrace.i(2830115012608L, 21086);
        if (FindMContactInviteUI.a(FindMContactInviteUI.this) != null)
        {
          FindMContactInviteUI.a(FindMContactInviteUI.this).dismiss();
          FindMContactInviteUI.a(FindMContactInviteUI.this, null);
        }
        FindMContactInviteUI.b(FindMContactInviteUI.this).notifyDataSetChanged();
        GMTrace.o(2830115012608L, 21086);
        return false;
      }
      
      public final String toString()
      {
        GMTrace.i(2830383448064L, 21088);
        String str = super.toString() + "|listMFriendData";
        GMTrace.o(2830383448064L, 21088);
        return str;
      }
    });
    GMTrace.o(2826222698496L, 21057);
  }
  
  protected final void MP()
  {
    GMTrace.i(2826759569408L, 21061);
    this.jqc = ((TextView)findViewById(R.h.bND));
    this.jqc.setText(R.l.dIN);
    this.htD = ((ListView)findViewById(R.h.bNF));
    if ((this.vWs != 2) && (this.vWs == 1))
    {
      this.mOO = LayoutInflater.from(this).inflate(R.i.cxd, null);
      this.xbp = ((TextView)this.mOO.findViewById(R.h.bzY));
      this.xbq = ((TextView)this.mOO.findViewById(R.h.bAb));
      this.xbr = ((TextView)this.mOO.findViewById(R.h.bzW));
      this.xbt = ((Button)this.mOO.findViewById(R.h.bzV));
      this.xbq.setText(getString(R.l.dvT));
      this.xbr.setText(getString(R.l.dvT));
      this.xbt.setText(getString(R.l.dvS));
    }
    for (;;)
    {
      this.xbo = new j(this, this.xbv, 2);
      this.xbt.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2809445482496L, 20932);
          com.tencent.mm.plugin.c.b.nA(at.wN() + "," + FindMContactInviteUI.this.getClass().getName() + ",R300_400_AddAllButton," + at.eK("R300_300_AddAllButton") + ",3");
          if (FindMContactInviteUI.d(FindMContactInviteUI.this) == 2)
          {
            FindMContactInviteUI.b(FindMContactInviteUI.this).bv(true);
            FindMContactInviteUI.b(FindMContactInviteUI.this).notifyDataSetChanged();
            FindMContactInviteUI.e(FindMContactInviteUI.this).setVisibility(8);
            if (FindMContactInviteUI.f(FindMContactInviteUI.this) != null)
            {
              FindMContactInviteUI.f(FindMContactInviteUI.this).setVisibility(0);
              GMTrace.o(2809445482496L, 20932);
            }
          }
          else
          {
            if (FindMContactInviteUI.d(FindMContactInviteUI.this) == 1)
            {
              FindMContactInviteUI.b(FindMContactInviteUI.this).bv(true);
              FindMContactInviteUI.b(FindMContactInviteUI.this).notifyDataSetChanged();
              FindMContactInviteUI.h(FindMContactInviteUI.this);
              GMTrace.o(2809445482496L, 20932);
              return;
            }
            FindMContactInviteUI.b(FindMContactInviteUI.this).bv(true);
            FindMContactInviteUI.b(FindMContactInviteUI.this).notifyDataSetChanged();
            FindMContactInviteUI.e(FindMContactInviteUI.this).setVisibility(8);
            if (FindMContactInviteUI.f(FindMContactInviteUI.this) != null) {
              FindMContactInviteUI.f(FindMContactInviteUI.this).setVisibility(0);
            }
          }
          GMTrace.o(2809445482496L, 20932);
        }
      });
      if (this.xbs != null)
      {
        this.xbs.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(2804076773376L, 20892);
            FindMContactInviteUI.e(FindMContactInviteUI.this).setVisibility(0);
            FindMContactInviteUI.f(FindMContactInviteUI.this).setVisibility(8);
            FindMContactInviteUI.b(FindMContactInviteUI.this).bv(false);
            FindMContactInviteUI.b(FindMContactInviteUI.this).notifyDataSetChanged();
            GMTrace.o(2804076773376L, 20892);
          }
        });
        this.xbs.setVisibility(8);
      }
      this.htD.addHeaderView(this.mOO);
      this.htD.setAdapter(this.xbo);
      this.htD.setOnScrollListener(new com.tencent.mm.ui.applet.a());
      this.htD.setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(2796426362880L, 20835);
          if (FindMContactInviteUI.b(FindMContactInviteUI.this) != null)
          {
            paramAnonymousView = FindMContactInviteUI.b(FindMContactInviteUI.this);
            if (paramAnonymousView.gCY != null) {
              paramAnonymousView.gCY.onTouchEvent(paramAnonymousMotionEvent);
            }
          }
          GMTrace.o(2796426362880L, 20835);
          return false;
        }
      });
      a(0, getString(R.l.cTh), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(2805016297472L, 20899);
          FindMContactInviteUI.h(FindMContactInviteUI.this);
          GMTrace.o(2805016297472L, 20899);
          return true;
        }
      });
      new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2808505958400L, 20925);
          BackwardSupportUtil.c.a(FindMContactInviteUI.i(FindMContactInviteUI.this));
          GMTrace.o(2808505958400L, 20925);
        }
      };
      GMTrace.o(2826759569408L, 21061);
      return;
      this.mOO = LayoutInflater.from(this).inflate(R.i.cxc, null);
      this.xbp = ((TextView)this.mOO.findViewById(R.h.bzY));
      this.xbq = ((TextView)this.mOO.findViewById(R.h.bAb));
      this.xbr = ((TextView)this.mOO.findViewById(R.h.bzW));
      this.xbt = ((Button)this.mOO.findViewById(R.h.bzV));
      this.xbq.setText(getString(R.l.dvW));
      this.xbr.setText(getString(R.l.dvT));
      this.xbt.setText(getString(R.l.dvR, new Object[] { Integer.valueOf(0) }));
      this.xbs = ((TextView)this.mOO.findViewById(R.h.bNz));
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2826625351680L, 21060);
    int i = R.i.cxb;
    GMTrace.o(2826625351680L, 21060);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2825685827584L, 21053);
    super.onCreate(paramBundle);
    oM(R.l.dvV);
    com.tencent.mm.plugin.c.a.hnI.pu();
    this.xbx = getIntent().getStringExtra("regsetinfo_ticket");
    this.ibA = getIntent().getIntExtra("login_type", 0);
    this.vWs = getIntent().getIntExtra("regsetinfo_NextStyle", 2);
    this.osl = com.tencent.mm.plugin.c.b.Qu();
    MP();
    GMTrace.o(2825685827584L, 21053);
  }
  
  public void onDestroy()
  {
    GMTrace.i(2826491133952L, 21059);
    if (this.gWn != null)
    {
      at.wS().b(432, this.gWn);
      this.gWn = null;
    }
    if (this.xbo != null)
    {
      j localj = this.xbo;
      if (localj.gCY != null)
      {
        localj.gCY.detach();
        localj.gCY = null;
      }
    }
    com.tencent.mm.modelfriend.af.Im();
    super.onDestroy();
    GMTrace.o(2826491133952L, 21059);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2825820045312L, 21054);
    if (paramInt == 4)
    {
      bci();
      GMTrace.o(2825820045312L, 21054);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(2825820045312L, 21054);
    return bool;
  }
  
  public void onPause()
  {
    GMTrace.i(2826356916224L, 21058);
    super.onPause();
    if (this.ibA == 1)
    {
      com.tencent.mm.plugin.c.b.b(false, at.wN() + "," + getClass().getName() + ",R300_400_QQ," + at.eK("R300_400_QQ") + ",2");
      GMTrace.o(2826356916224L, 21058);
      return;
    }
    com.tencent.mm.plugin.c.b.b(false, at.wN() + "," + getClass().getName() + ",R300_400_phone," + at.eK("R300_400_phone") + ",2");
    GMTrace.o(2826356916224L, 21058);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(2826893787136L, 21062);
    w.i("MicroMsg.FindMContactInviteUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(2826893787136L, 21062);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        chs();
        GMTrace.o(2826893787136L, 21062);
        return;
      }
      this.oaK = false;
      h.a(this, getString(R.l.dNp), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2806895345664L, 20913);
          FindMContactInviteUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          FindMContactInviteUI.n(FindMContactInviteUI.this);
          FindMContactInviteUI.this.finish();
          GMTrace.o(2806895345664L, 20913);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2802197725184L, 20878);
          FindMContactInviteUI.n(FindMContactInviteUI.this);
          FindMContactInviteUI.this.finish();
          GMTrace.o(2802197725184L, 20878);
        }
      });
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(2826088480768L, 21056);
    super.onResume();
    this.xbo.notifyDataSetChanged();
    if (this.ibA == 1) {
      com.tencent.mm.plugin.c.b.b(true, at.wN() + "," + getClass().getName() + ",R300_400_QQ," + at.eK("R300_400_QQ") + ",1");
    }
    while (this.oaK)
    {
      boolean bool = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.READ_CONTACTS", 48, null, null);
      w.i("MicroMsg.FindMContactInviteUI", "summerper checkPermission checkContacts[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW() });
      if (!bool)
      {
        GMTrace.o(2826088480768L, 21056);
        return;
        com.tencent.mm.plugin.c.b.b(true, at.wN() + "," + getClass().getName() + ",R300_400_phone," + at.eK("R300_400_phone") + ",1");
      }
      else
      {
        chs();
      }
    }
    GMTrace.o(2826088480768L, 21056);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\friend\FindMContactInviteUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
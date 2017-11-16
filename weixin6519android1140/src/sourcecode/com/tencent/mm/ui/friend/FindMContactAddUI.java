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
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
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
import com.tencent.mm.plugin.c.b;
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

public class FindMContactAddUI
  extends MMWizardActivity
{
  private e gWn;
  private ListView htD;
  private ProgressDialog htG;
  private int ibA;
  private String jQv;
  private TextView jqc;
  private View mOO;
  private boolean oaK;
  private String osl;
  private String vWr;
  private int vWs;
  private j xbo;
  private TextView xbp;
  private TextView xbq;
  private TextView xbr;
  private TextView xbs;
  private Button xbt;
  private List<String[]> xbu;
  private j.a xbv;
  
  public FindMContactAddUI()
  {
    GMTrace.i(2792399831040L, 20805);
    this.htG = null;
    this.jqc = null;
    this.xbp = null;
    this.xbq = null;
    this.xbr = null;
    this.xbs = null;
    this.xbt = null;
    this.jQv = null;
    this.gWn = null;
    this.vWr = "";
    this.vWs = 2;
    this.oaK = true;
    this.xbv = new j.a()
    {
      public final void notifyDataSetChanged()
      {
        GMTrace.i(2807163781120L, 20915);
        if ((FindMContactAddUI.e(FindMContactAddUI.this) != 2) && (FindMContactAddUI.e(FindMContactAddUI.this) == 1))
        {
          FindMContactAddUI.f(FindMContactAddUI.this).setText(FindMContactAddUI.this.getString(R.l.dvJ));
          if (!FindMContactAddUI.c(FindMContactAddUI.this).Hj()) {
            break label251;
          }
          if ((FindMContactAddUI.e(FindMContactAddUI.this) != 1) && (FindMContactAddUI.f(FindMContactAddUI.this).getVisibility() == 0) && (FindMContactAddUI.g(FindMContactAddUI.this) != null))
          {
            FindMContactAddUI.f(FindMContactAddUI.this).setVisibility(8);
            FindMContactAddUI.g(FindMContactAddUI.this).setVisibility(0);
          }
        }
        for (;;)
        {
          if ((FindMContactAddUI.c(FindMContactAddUI.this).Hi() <= 0) || (FindMContactAddUI.e(FindMContactAddUI.this) == 1)) {
            break label313;
          }
          FindMContactAddUI.h(FindMContactAddUI.this).setText(FindMContactAddUI.this.getResources().getQuantityString(R.j.cIh, FindMContactAddUI.c(FindMContactAddUI.this).Hi(), new Object[] { Integer.valueOf(FindMContactAddUI.c(FindMContactAddUI.this).Hi()) }));
          GMTrace.o(2807163781120L, 20915);
          return;
          FindMContactAddUI.f(FindMContactAddUI.this).setText(FindMContactAddUI.this.getString(R.l.dvI, new Object[] { Integer.valueOf(FindMContactAddUI.c(FindMContactAddUI.this).getCount()) }));
          break;
          label251:
          if ((FindMContactAddUI.e(FindMContactAddUI.this) != 1) && (FindMContactAddUI.f(FindMContactAddUI.this).getVisibility() == 8) && (FindMContactAddUI.g(FindMContactAddUI.this) != null))
          {
            FindMContactAddUI.f(FindMContactAddUI.this).setVisibility(0);
            FindMContactAddUI.g(FindMContactAddUI.this).setVisibility(8);
          }
        }
        label313:
        FindMContactAddUI.h(FindMContactAddUI.this).setText(FindMContactAddUI.this.getResources().getQuantityString(R.j.cIk, FindMContactAddUI.c(FindMContactAddUI.this).getCount(), new Object[] { Integer.valueOf(FindMContactAddUI.c(FindMContactAddUI.this).getCount()) }));
        GMTrace.o(2807163781120L, 20915);
      }
    };
    GMTrace.o(2792399831040L, 20805);
  }
  
  private void bci()
  {
    GMTrace.i(2792936701952L, 20809);
    b.nz(this.osl);
    aLo();
    Bh(1);
    GMTrace.o(2792936701952L, 20809);
  }
  
  private void chs()
  {
    GMTrace.i(2792668266496L, 20807);
    ActionBarActivity localActionBarActivity = this.vKB.vKW;
    getString(R.l.cUG);
    this.htG = h.a(localActionBarActivity, getString(R.l.dIP), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(2822733037568L, 21031);
        GMTrace.o(2822733037568L, 21031);
      }
    });
    at.xB().a(new af.a()
    {
      public final boolean Dj()
      {
        GMTrace.i(2787031121920L, 20765);
        try
        {
          FindMContactAddUI.a(FindMContactAddUI.this, com.tencent.mm.pluginsdk.a.dC(FindMContactAddUI.this));
          FindMContactAddUI.c(FindMContactAddUI.this).gCU = FindMContactAddUI.d(FindMContactAddUI.this);
          FindMContactAddUI.c(FindMContactAddUI.this).e(com.tencent.mm.modelfriend.af.Il());
          GMTrace.o(2787031121920L, 20765);
          return true;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.FindMContactAddUI", localException, "", new Object[0]);
          }
        }
      }
      
      public final boolean Dk()
      {
        GMTrace.i(2786896904192L, 20764);
        if (FindMContactAddUI.a(FindMContactAddUI.this) != null)
        {
          FindMContactAddUI.a(FindMContactAddUI.this).dismiss();
          FindMContactAddUI.b(FindMContactAddUI.this);
        }
        FindMContactAddUI.c(FindMContactAddUI.this).notifyDataSetChanged();
        GMTrace.o(2786896904192L, 20764);
        return false;
      }
      
      public final String toString()
      {
        GMTrace.i(2787165339648L, 20766);
        String str = super.toString() + "|listMFriendData";
        GMTrace.o(2787165339648L, 20766);
        return str;
      }
    });
    GMTrace.o(2792668266496L, 20807);
  }
  
  protected final void MP()
  {
    GMTrace.i(2793607790592L, 20814);
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
      this.xbq.setText(getString(R.l.dwe));
      this.xbr.setText(getString(R.l.dwf));
      this.xbt.setText(getString(R.l.dvJ));
    }
    for (;;)
    {
      this.xbo = new j(this, this.xbv, 1);
      this.xbt.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2825417392128L, 21051);
          b.nA(at.wN() + "," + FindMContactAddUI.this.getClass().getName() + ",R300_300_AddAllButton," + at.eK("R300_300_AddAllButton") + ",3");
          if (FindMContactAddUI.e(FindMContactAddUI.this) == 2)
          {
            FindMContactAddUI.c(FindMContactAddUI.this).bv(true);
            FindMContactAddUI.c(FindMContactAddUI.this).notifyDataSetChanged();
            FindMContactAddUI.f(FindMContactAddUI.this).setVisibility(8);
            if (FindMContactAddUI.g(FindMContactAddUI.this) != null)
            {
              FindMContactAddUI.g(FindMContactAddUI.this).setVisibility(0);
              GMTrace.o(2825417392128L, 21051);
            }
          }
          else
          {
            if (FindMContactAddUI.e(FindMContactAddUI.this) == 1)
            {
              FindMContactAddUI.c(FindMContactAddUI.this).bv(true);
              FindMContactAddUI.c(FindMContactAddUI.this).notifyDataSetChanged();
              FindMContactAddUI.i(FindMContactAddUI.this);
              GMTrace.o(2825417392128L, 21051);
              return;
            }
            FindMContactAddUI.c(FindMContactAddUI.this).bv(true);
            FindMContactAddUI.c(FindMContactAddUI.this).notifyDataSetChanged();
            FindMContactAddUI.f(FindMContactAddUI.this).setVisibility(8);
            if (FindMContactAddUI.g(FindMContactAddUI.this) != null) {
              FindMContactAddUI.g(FindMContactAddUI.this).setVisibility(0);
            }
          }
          GMTrace.o(2825417392128L, 21051);
        }
      });
      if (this.xbs != null)
      {
        this.xbs.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(2798842281984L, 20853);
            FindMContactAddUI.f(FindMContactAddUI.this).setVisibility(0);
            FindMContactAddUI.g(FindMContactAddUI.this).setVisibility(8);
            FindMContactAddUI.c(FindMContactAddUI.this).bv(false);
            FindMContactAddUI.c(FindMContactAddUI.this).notifyDataSetChanged();
            GMTrace.o(2798842281984L, 20853);
          }
        });
        this.xbs.setVisibility(8);
      }
      this.htD.addHeaderView(this.mOO);
      this.htD.setAdapter(this.xbo);
      a(0, getString(R.l.cTI), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(2797902757888L, 20846);
          FindMContactAddUI.i(FindMContactAddUI.this);
          GMTrace.o(2797902757888L, 20846);
          return true;
        }
      });
      new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2823269908480L, 21035);
          BackwardSupportUtil.c.a(FindMContactAddUI.j(FindMContactAddUI.this));
          GMTrace.o(2823269908480L, 21035);
        }
      };
      GMTrace.o(2793607790592L, 20814);
      return;
      this.mOO = LayoutInflater.from(this).inflate(R.i.cxc, null);
      this.xbp = ((TextView)this.mOO.findViewById(R.h.bzY));
      this.xbq = ((TextView)this.mOO.findViewById(R.h.bAb));
      this.xbr = ((TextView)this.mOO.findViewById(R.h.bzW));
      this.xbt = ((Button)this.mOO.findViewById(R.h.bzV));
      this.xbq.setText(getString(R.l.dwe));
      this.xbr.setText(getString(R.l.dwf));
      this.xbt.setText(getString(R.l.dvI, new Object[] { Integer.valueOf(0) }));
      this.xbs = ((TextView)this.mOO.findViewById(R.h.bNz));
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2793473572864L, 20813);
    int i = R.i.cxb;
    GMTrace.o(2793473572864L, 20813);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2792534048768L, 20806);
    super.onCreate(paramBundle);
    oM(R.l.dvN);
    com.tencent.mm.plugin.c.a.hnI.pu();
    this.jQv = getIntent().getStringExtra("regsetinfo_ticket");
    this.vWr = getIntent().getStringExtra("regsetinfo_NextStep");
    this.vWs = getIntent().getIntExtra("regsetinfo_NextStyle", 2);
    this.ibA = getIntent().getIntExtra("login_type", 0);
    this.osl = b.Qu();
    MP();
    GMTrace.o(2792534048768L, 20806);
  }
  
  public void onDestroy()
  {
    GMTrace.i(2793339355136L, 20812);
    if (this.gWn != null)
    {
      at.wS().b(30, this.gWn);
      this.gWn = null;
    }
    super.onDestroy();
    GMTrace.o(2793339355136L, 20812);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2792802484224L, 20808);
    if (paramInt == 4)
    {
      bci();
      GMTrace.o(2792802484224L, 20808);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(2792802484224L, 20808);
    return bool;
  }
  
  public void onPause()
  {
    GMTrace.i(2793205137408L, 20811);
    super.onPause();
    if (this.ibA == 1)
    {
      b.b(false, at.wN() + "," + getClass().getName() + ",R300_300_QQ," + at.eK("R300_300_QQ") + ",2");
      GMTrace.o(2793205137408L, 20811);
      return;
    }
    b.b(false, at.wN() + "," + getClass().getName() + ",R300_300_phone," + at.eK("R300_300_phone") + ",2");
    GMTrace.o(2793205137408L, 20811);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(2793742008320L, 20815);
    w.i("MicroMsg.FindMContactAddUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(2793742008320L, 20815);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        chs();
        GMTrace.o(2793742008320L, 20815);
        return;
      }
      this.oaK = false;
      h.a(this, getString(R.l.dNp), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2798573846528L, 20851);
          FindMContactAddUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          FindMContactAddUI.q(FindMContactAddUI.this);
          FindMContactAddUI.this.finish();
          GMTrace.o(2798573846528L, 20851);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2810787659776L, 20942);
          FindMContactAddUI.q(FindMContactAddUI.this);
          FindMContactAddUI.this.finish();
          GMTrace.o(2810787659776L, 20942);
        }
      });
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(2793070919680L, 20810);
    super.onResume();
    this.xbo.notifyDataSetChanged();
    if (this.ibA == 1)
    {
      b.b(true, at.wN() + "," + getClass().getName() + ",R300_300_QQ," + at.eK("R300_300_QQ") + ",1");
      b.ny("R300_300_QQ");
    }
    while (this.oaK)
    {
      boolean bool = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.READ_CONTACTS", 48, null, null);
      w.i("MicroMsg.FindMContactAddUI", "summerper checkPermission checkContacts[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW() });
      if (!bool)
      {
        GMTrace.o(2793070919680L, 20810);
        return;
        b.b(true, at.wN() + "," + getClass().getName() + ",R300_300_phone," + at.eK("R300_300_phone") + ",1");
        b.ny("R300_300_phone");
      }
      else
      {
        chs();
      }
    }
    GMTrace.o(2793070919680L, 20810);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\friend\FindMContactAddUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
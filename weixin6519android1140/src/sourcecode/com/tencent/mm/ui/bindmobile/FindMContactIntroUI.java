package com.tencent.mm.ui.bindmobile;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelfriend.m.a;
import com.tencent.mm.modelfriend.y;
import com.tencent.mm.plugin.c.b;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.protocal.c.aly;
import com.tencent.mm.sdk.platformtools.af.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.friend.FindMContactAddUI;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FindMContactIntroUI
  extends MMWizardActivity
{
  private String eMW;
  private List<String[]> gCU;
  private e gWn;
  private ProgressDialog htG;
  private String jQv;
  private String osl;
  private TextView oww;
  private String vWr;
  private int vWs;
  private Button wnF;
  private TextView wnG;
  private boolean wnu;
  private y wnv;
  
  public FindMContactIntroUI()
  {
    GMTrace.i(3111032717312L, 23179);
    this.jQv = null;
    this.vWr = "";
    this.vWs = 2;
    this.wnu = false;
    this.gCU = null;
    this.gWn = null;
    this.htG = null;
    GMTrace.o(3111032717312L, 23179);
  }
  
  private void bci()
  {
    GMTrace.i(3112106459136L, 23187);
    b.nz(this.osl);
    aLo();
    Bh(1);
    GMTrace.o(3112106459136L, 23187);
  }
  
  private void cbn()
  {
    GMTrace.i(3111838023680L, 23185);
    boolean bool = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.READ_CONTACTS", 48, null, null);
    w.i("MicroMsg.FindMContactIntroUI", "summerper checkPermission checkContacts[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW() });
    if (!bool)
    {
      GMTrace.o(3111838023680L, 23185);
      return;
    }
    Object localObject = at.wS();
    e local9 = new e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(3098550468608L, 23086);
        if (FindMContactIntroUI.g(FindMContactIntroUI.this) != null)
        {
          FindMContactIntroUI.g(FindMContactIntroUI.this).dismiss();
          FindMContactIntroUI.h(FindMContactIntroUI.this);
        }
        if (FindMContactIntroUI.i(FindMContactIntroUI.this) != null)
        {
          at.wS().b(431, FindMContactIntroUI.i(FindMContactIntroUI.this));
          FindMContactIntroUI.j(FindMContactIntroUI.this);
        }
        if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
        {
          paramAnonymousString = ((y)paramAnonymousk).HR();
          com.tencent.mm.modelfriend.af.f(paramAnonymousString);
          if ((paramAnonymousString == null) || (paramAnonymousString.size() <= 0)) {
            break label392;
          }
          paramAnonymousk = paramAnonymousString.iterator();
          paramAnonymousInt1 = 0;
          while (paramAnonymousk.hasNext())
          {
            aly localaly = (aly)paramAnonymousk.next();
            if (localaly != null)
            {
              if (localaly.jhA != 1) {
                break label389;
              }
              paramAnonymousInt1 += 1;
            }
          }
          if (paramAnonymousInt1 > 0) {
            paramAnonymousInt2 = 1;
          }
        }
        for (;;)
        {
          if (paramAnonymousString == null) {}
          for (int i = 0;; i = paramAnonymousString.size())
          {
            w.d("MicroMsg.FindMContactIntroUI", "tigerreg data size=%d, addcount=%s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramAnonymousInt1) });
            if ((FindMContactIntroUI.d(FindMContactIntroUI.this) == null) || (!FindMContactIntroUI.d(FindMContactIntroUI.this).contains("1")) || (paramAnonymousInt2 == 0)) {
              break label323;
            }
            b.nz("R300_300_phone");
            paramAnonymousString = new Intent(FindMContactIntroUI.this, FindMContactAddUI.class);
            paramAnonymousString.putExtra("regsetinfo_ticket", FindMContactIntroUI.c(FindMContactIntroUI.this));
            paramAnonymousString.putExtra("regsetinfo_NextStep", FindMContactIntroUI.d(FindMContactIntroUI.this));
            paramAnonymousString.putExtra("regsetinfo_NextStyle", FindMContactIntroUI.e(FindMContactIntroUI.this));
            paramAnonymousString.putExtra("login_type", 0);
            MMWizardActivity.A(FindMContactIntroUI.this, paramAnonymousString);
            GMTrace.o(3098550468608L, 23086);
            return;
            paramAnonymousInt2 = 0;
            break;
          }
          label323:
          FindMContactIntroUI.b(FindMContactIntroUI.this);
          GMTrace.o(3098550468608L, 23086);
          return;
          Toast.makeText(FindMContactIntroUI.this, FindMContactIntroUI.this.getString(R.l.cSM, new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) }), 0).show();
          GMTrace.o(3098550468608L, 23086);
          return;
          label389:
          break;
          label392:
          paramAnonymousInt1 = 0;
          paramAnonymousInt2 = 0;
        }
      }
    };
    this.gWn = local9;
    ((n)localObject).a(431, local9);
    localObject = this.vKB.vKW;
    getString(R.l.cUG);
    this.htG = h.a((Context)localObject, getString(R.l.elE), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(3106603532288L, 23146);
        if (FindMContactIntroUI.i(FindMContactIntroUI.this) != null)
        {
          at.wS().b(431, FindMContactIntroUI.i(FindMContactIntroUI.this));
          FindMContactIntroUI.j(FindMContactIntroUI.this);
        }
        GMTrace.o(3106603532288L, 23146);
      }
    });
    at.xB().a(new af.a()
    {
      public final boolean Dj()
      {
        GMTrace.i(3104858701824L, 23133);
        for (;;)
        {
          try
          {
            FindMContactIntroUI.a(FindMContactIntroUI.this, com.tencent.mm.pluginsdk.a.dC(FindMContactIntroUI.this));
            StringBuilder localStringBuilder = new StringBuilder("tigerreg mobileList size ");
            if (FindMContactIntroUI.k(FindMContactIntroUI.this) != null) {
              continue;
            }
            i = 0;
            w.d("MicroMsg.FindMContactIntroUI", i);
          }
          catch (Exception localException)
          {
            int i;
            w.printErrStackTrace("MicroMsg.FindMContactIntroUI", localException, "", new Object[0]);
            continue;
          }
          GMTrace.o(3104858701824L, 23133);
          return true;
          i = FindMContactIntroUI.k(FindMContactIntroUI.this).size();
        }
      }
      
      public final boolean Dk()
      {
        GMTrace.i(3104724484096L, 23132);
        if ((FindMContactIntroUI.k(FindMContactIntroUI.this) != null) && (FindMContactIntroUI.k(FindMContactIntroUI.this).size() != 0))
        {
          FindMContactIntroUI.a(FindMContactIntroUI.this, new y(FindMContactIntroUI.c(FindMContactIntroUI.this), FindMContactIntroUI.k(FindMContactIntroUI.this)));
          at.wS().a(FindMContactIntroUI.l(FindMContactIntroUI.this), 0);
        }
        for (;;)
        {
          GMTrace.o(3104724484096L, 23132);
          return false;
          if (FindMContactIntroUI.g(FindMContactIntroUI.this) != null)
          {
            FindMContactIntroUI.g(FindMContactIntroUI.this).dismiss();
            FindMContactIntroUI.h(FindMContactIntroUI.this);
          }
          FindMContactIntroUI.b(FindMContactIntroUI.this);
        }
      }
      
      public final String toString()
      {
        GMTrace.i(3104992919552L, 23134);
        String str = super.toString() + "|doUpload";
        GMTrace.o(3104992919552L, 23134);
        return str;
      }
    });
    GMTrace.o(3111838023680L, 23185);
  }
  
  protected final void MP()
  {
    GMTrace.i(3111703805952L, 23184);
    this.wnF = ((Button)findViewById(R.h.ccF));
    this.wnG = ((TextView)findViewById(R.h.bAa));
    this.oww = ((TextView)findViewById(R.h.bzZ));
    if ((this.vWr != null) && (this.vWr.contains("2"))) {
      this.oww.setText(getString(R.l.dvL));
    }
    for (;;)
    {
      at.AR();
      this.eMW = ((String)c.xh().get(6, null));
      if ((this.eMW == null) || (this.eMW.equals("")))
      {
        at.AR();
        this.eMW = ((String)c.xh().get(4097, null));
      }
      this.wnF.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(3121099046912L, 23254);
          FindMContactIntroUI.a(FindMContactIntroUI.this);
          GMTrace.o(3121099046912L, 23254);
        }
      });
      this.wnG.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(3121367482368L, 23256);
          h.a(FindMContactIntroUI.this, FindMContactIntroUI.this.getString(R.l.dvY), null, FindMContactIntroUI.this.getString(R.l.dvZ), FindMContactIntroUI.this.getString(R.l.dvX), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(3110227410944L, 23173);
              FindMContactIntroUI.b(FindMContactIntroUI.this);
              GMTrace.o(3110227410944L, 23173);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(3106335096832L, 23144);
              GMTrace.o(3106335096832L, 23144);
            }
          });
          GMTrace.o(3121367482368L, 23256);
        }
      });
      GMTrace.o(3111703805952L, 23184);
      return;
      this.oww.setText(getString(R.l.dvM));
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(3112240676864L, 23188);
    int i = R.i.cxe;
    GMTrace.o(3112240676864L, 23188);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(3111166935040L, 23180);
    super.onCreate(paramBundle);
    oM(R.l.bzW);
    com.tencent.mm.plugin.c.a.hnI.pu();
    this.jQv = getIntent().getStringExtra("regsetinfo_ticket");
    this.vWr = getIntent().getStringExtra("regsetinfo_NextStep");
    this.vWs = getIntent().getIntExtra("regsetinfo_NextStyle", 2);
    if (com.tencent.mm.modelfriend.m.Ho() != m.a.gDm) {}
    for (boolean bool = true;; bool = false)
    {
      this.wnu = bool;
      this.osl = b.Qu();
      w.d("MicroMsg.FindMContactIntroUI", "tigerreg mNextStep %s  mNextStyle %s ", new Object[] { this.vWr, Integer.valueOf(this.vWs) });
      GMTrace.o(3111166935040L, 23180);
      return;
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(3111301152768L, 23181);
    if (this.gWn != null)
    {
      at.wS().b(431, this.gWn);
      this.gWn = null;
    }
    super.onDestroy();
    GMTrace.o(3111301152768L, 23181);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(3111972241408L, 23186);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      bci();
      GMTrace.o(3111972241408L, 23186);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(3111972241408L, 23186);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(3111569588224L, 23183);
    super.onPause();
    b.nz("RE900_100");
    if (this.wnu)
    {
      b.b(false, at.wN() + "," + getClass().getName() + ",R300_100_QQ," + at.eK("R300_100_QQ") + ",4");
      GMTrace.o(3111569588224L, 23183);
      return;
    }
    b.b(false, at.wN() + "," + getClass().getName() + ",R300_100_phone," + at.eK("R300_100_phone") + ",4");
    GMTrace.o(3111569588224L, 23183);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(3112374894592L, 23189);
    w.i("MicroMsg.FindMContactIntroUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(3112374894592L, 23189);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        cbn();
        GMTrace.o(3112374894592L, 23189);
        return;
      }
      h.a(this, getString(R.l.dNp), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(3124051836928L, 23276);
          paramAnonymousDialogInterface.dismiss();
          FindMContactIntroUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(3124051836928L, 23276);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(3105529790464L, 23138);
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(3105529790464L, 23138);
        }
      });
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(3111435370496L, 23182);
    super.onResume();
    MP();
    if (this.wnu)
    {
      b.b(true, at.wN() + "," + getClass().getName() + ",R300_100_QQ," + at.eK("R300_100_QQ") + ",1");
      b.ny("R300_100_QQ");
      GMTrace.o(3111435370496L, 23182);
      return;
    }
    b.b(true, at.wN() + "," + getClass().getName() + ",R300_100_phone," + at.eK("R300_100_phone") + ",1");
    b.ny("R300_100_phone");
    GMTrace.o(3111435370496L, 23182);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\bindmobile\FindMContactIntroUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
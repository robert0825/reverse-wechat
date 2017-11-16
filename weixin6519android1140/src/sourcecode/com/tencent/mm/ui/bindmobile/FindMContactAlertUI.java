package com.tencent.mm.ui.bindmobile;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelfriend.m.a;
import com.tencent.mm.modelfriend.y;
import com.tencent.mm.plugin.c.b;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.protocal.c.aly;
import com.tencent.mm.sdk.platformtools.af.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.friend.FindMContactAddUI;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FindMContactAlertUI
  extends MMWizardActivity
{
  private String eMW;
  private List<String[]> gCU;
  private e gWn;
  private ProgressDialog htG;
  private String ipl;
  private String ipm;
  private String jQv;
  private String osl;
  private int pKB;
  private String vWr;
  private int vWs;
  private int wnA;
  private int wnB;
  private int wnC;
  private String wns;
  private String wnt;
  private boolean wnu;
  private y wnv;
  private int wnw;
  private final int wnx;
  private int wny;
  private int wnz;
  
  public FindMContactAlertUI()
  {
    GMTrace.i(3133849731072L, 23349);
    this.jQv = null;
    this.vWr = "";
    this.vWs = 2;
    this.wns = null;
    this.wnt = null;
    this.wnu = false;
    this.gCU = null;
    this.gWn = null;
    this.htG = null;
    this.wnw = 0;
    this.wnx = 200;
    this.wny = 0;
    this.wnz = 0;
    this.wnA = 0;
    this.pKB = 0;
    this.wnB = 0;
    this.wnC = 0;
    GMTrace.o(3133849731072L, 23349);
  }
  
  private void bci()
  {
    GMTrace.i(3135326126080L, 23360);
    b.nz(this.osl);
    aLo();
    Bh(1);
    GMTrace.o(3135326126080L, 23360);
  }
  
  private void cbl()
  {
    GMTrace.i(3134655037440L, 23355);
    if (this.wnu)
    {
      b.nA(at.wN() + "," + getClass().getName() + ",R300_200_phone," + at.eK("R300_200_phone") + ",1");
      h.a(this, false, getString(R.l.dvO), getString(R.l.cUG), getString(R.l.cTM), getString(R.l.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(3101905911808L, 23111);
          at.AR();
          c.xh().set(12322, Boolean.valueOf(true));
          b.nz("R200_100");
          paramAnonymousDialogInterface = new Intent();
          paramAnonymousDialogInterface.putExtra("mobile_input_purpose", 4);
          paramAnonymousDialogInterface.putExtra("regsetinfo_ticket", FindMContactAlertUI.a(FindMContactAlertUI.this));
          paramAnonymousDialogInterface.putExtra("regsetinfo_NextStep", FindMContactAlertUI.b(FindMContactAlertUI.this));
          paramAnonymousDialogInterface.putExtra("regsetinfo_NextStyle", FindMContactAlertUI.c(FindMContactAlertUI.this));
          com.tencent.mm.plugin.c.a.hnH.a(FindMContactAlertUI.this, paramAnonymousDialogInterface);
          b.nz("R300_300_phone");
          b.b(false, at.wN() + "," + FindMContactAlertUI.this.getClass().getName() + ",R300_200_phone," + at.eK("R300_200_phone") + ",2");
          GMTrace.o(3101905911808L, 23111);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(3098282033152L, 23084);
          at.AR();
          c.xh().set(12322, Boolean.valueOf(false));
          b.nA(at.wN() + "," + FindMContactAlertUI.this.getClass().getName() + ",R300_200_phone," + at.eK("R300_200_phone") + ",2");
          FindMContactAlertUI.d(FindMContactAlertUI.this);
          GMTrace.o(3098282033152L, 23084);
        }
      });
      GMTrace.o(3134655037440L, 23355);
      return;
    }
    if (com.tencent.mm.modelfriend.m.Hn())
    {
      final Object localObject = this.ipm;
      String str = this.ipl;
      int i = R.l.dwc;
      int j = R.l.dwb;
      DialogInterface.OnClickListener local5 = new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(3102442782720L, 23115);
          at.AR();
          c.xh().set(12322, Boolean.valueOf(true));
          FindMContactAlertUI.e(FindMContactAlertUI.this);
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(3102442782720L, 23115);
        }
      };
      DialogInterface.OnClickListener local6 = new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(3138681569280L, 23385);
          paramAnonymousDialogInterface = new Intent(FindMContactAlertUI.this, FindMContactLearmMoreUI.class);
          paramAnonymousDialogInterface.putExtra("regsetinfo_ticket", FindMContactAlertUI.a(FindMContactAlertUI.this));
          paramAnonymousDialogInterface.putExtra("regsetinfo_NextStep", FindMContactAlertUI.b(FindMContactAlertUI.this));
          paramAnonymousDialogInterface.putExtra("regsetinfo_NextStyle", FindMContactAlertUI.c(FindMContactAlertUI.this));
          MMWizardActivity.A(FindMContactAlertUI.this, paramAnonymousDialogInterface);
          GMTrace.o(3138681569280L, 23385);
        }
      };
      final i locali = new i(this);
      locali.setTitle(str);
      locali.setMessage((CharSequence)localObject);
      locali.a(i, local5);
      locali.b(j, local6);
      locali.rot.setVisibility(0);
      locali.setCancelable(false);
      locali.show();
      locali.getWindow().clearFlags(2);
      a(locali);
      locali.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
      {
        public final void onGlobalLayout()
        {
          GMTrace.i(3148479463424L, 23458);
          locali.getWindow().getDecorView().getViewTreeObserver().removeGlobalOnLayoutListener(this);
          int i = locali.getWindow().getDecorView().getMeasuredWidth();
          int j = locali.getWindow().getDecorView().getMeasuredHeight();
          View localView = FindMContactAlertUI.a(FindMContactAlertUI.this, (ViewGroup)locali.getWindow().getDecorView());
          if (localView != null) {
            i = localView.getMeasuredWidth() * 2;
          }
          for (;;)
          {
            w.d("MicroMsg.FindMContactAlertUI", "dialog width: %s height: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
            FindMContactAlertUI.a(FindMContactAlertUI.this, i, j);
            GMTrace.o(3148479463424L, 23458);
            return;
          }
        }
      });
      localObject = findViewById(R.h.background);
      ((View)localObject).getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
      {
        public final void onGlobalLayout()
        {
          GMTrace.i(3149284769792L, 23464);
          localObject.getViewTreeObserver().removeGlobalOnLayoutListener(this);
          int i = localObject.getMeasuredHeight();
          int j = localObject.getMeasuredWidth();
          w.d("MicroMsg.FindMContactAlertUI", "bg width: %s height: %s", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
          FindMContactAlertUI.b(FindMContactAlertUI.this, j, i);
          GMTrace.o(3149284769792L, 23464);
        }
      });
      GMTrace.o(3134655037440L, 23355);
      return;
    }
    cbn();
    GMTrace.o(3134655037440L, 23355);
  }
  
  private void cbm()
  {
    GMTrace.i(3134923472896L, 23357);
    int j = getWindowManager().getDefaultDisplay().getHeight();
    int i = this.wnA - (getResources().getDimensionPixelSize(R.f.aQH) + com.tencent.mm.br.a.fromDPToPix(this, 48));
    int k = j / 2;
    int m = this.wnz / 2;
    int n = this.pKB;
    j = com.tencent.mm.br.a.fromDPToPix(this, 20) + (k + m - (j - n));
    if ((i != this.wnB) || (j != this.wnC))
    {
      this.wnB = i;
      this.wnC = j;
      View localView = findViewById(R.h.bzX);
      localView.setVisibility(0);
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)localView.getLayoutParams();
      localLayoutParams.setMargins(i - localView.getMeasuredWidth() / 2, j, 0, 0);
      w.d("MicroMsg.FindMContactAlertUI", "attachArrow x: %s y: %s view.width: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(localView.getMeasuredWidth()) });
      localView.setLayoutParams(localLayoutParams);
      localView.startAnimation(AnimationUtils.loadAnimation(this, R.a.aLk));
    }
    GMTrace.o(3134923472896L, 23357);
  }
  
  private void cbn()
  {
    GMTrace.i(3135057690624L, 23358);
    boolean bool = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.READ_CONTACTS", 48, null, null);
    w.i("MicroMsg.FindMContactAlertUI", "summerper checkPermission checkContacts[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW() });
    if (!bool)
    {
      GMTrace.o(3135057690624L, 23358);
      return;
    }
    Object localObject = findViewById(R.h.bzX);
    if (localObject != null) {
      ((View)localObject).setVisibility(8);
    }
    localObject = at.wS();
    e local9 = new e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(3120830611456L, 23252);
        if (FindMContactAlertUI.f(FindMContactAlertUI.this) != null)
        {
          FindMContactAlertUI.f(FindMContactAlertUI.this).dismiss();
          FindMContactAlertUI.g(FindMContactAlertUI.this);
        }
        if (FindMContactAlertUI.h(FindMContactAlertUI.this) != null)
        {
          at.wS().b(431, FindMContactAlertUI.h(FindMContactAlertUI.this));
          FindMContactAlertUI.i(FindMContactAlertUI.this);
        }
        if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
        {
          paramAnonymousString = ((y)paramAnonymousk).HR();
          com.tencent.mm.modelfriend.af.f(paramAnonymousString);
          if ((paramAnonymousString == null) || (paramAnonymousString.size() <= 0)) {
            break label399;
          }
          paramAnonymousk = paramAnonymousString.iterator();
          paramAnonymousInt1 = 0;
          while (paramAnonymousk.hasNext())
          {
            aly localaly = (aly)paramAnonymousk.next();
            if (localaly != null)
            {
              if (localaly.jhA != 1) {
                break label396;
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
            w.d("MicroMsg.FindMContactAlertUI", "tigerreg data size=%d, addcount=%s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramAnonymousInt1) });
            if ((FindMContactAlertUI.b(FindMContactAlertUI.this) == null) || (!FindMContactAlertUI.b(FindMContactAlertUI.this).contains("1")) || (paramAnonymousInt2 == 0)) {
              break label323;
            }
            b.nz("R300_300_phone");
            paramAnonymousString = new Intent(FindMContactAlertUI.this, FindMContactAddUI.class);
            paramAnonymousString.putExtra("regsetinfo_ticket", FindMContactAlertUI.a(FindMContactAlertUI.this));
            paramAnonymousString.putExtra("regsetinfo_NextStep", FindMContactAlertUI.b(FindMContactAlertUI.this));
            paramAnonymousString.putExtra("regsetinfo_NextStyle", FindMContactAlertUI.c(FindMContactAlertUI.this));
            paramAnonymousString.putExtra("login_type", 0);
            MMWizardActivity.A(FindMContactAlertUI.this, paramAnonymousString);
            GMTrace.o(3120830611456L, 23252);
            return;
            paramAnonymousInt2 = 0;
            break;
          }
          label323:
          FindMContactAlertUI.d(FindMContactAlertUI.this);
          GMTrace.o(3120830611456L, 23252);
          return;
          Toast.makeText(FindMContactAlertUI.this, FindMContactAlertUI.this.getString(R.l.cSM, new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) }), 0).show();
          FindMContactAlertUI.d(FindMContactAlertUI.this);
          GMTrace.o(3120830611456L, 23252);
          return;
          label396:
          break;
          label399:
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
        GMTrace.i(3104456048640L, 23130);
        if (FindMContactAlertUI.h(FindMContactAlertUI.this) != null)
        {
          at.wS().b(431, FindMContactAlertUI.h(FindMContactAlertUI.this));
          FindMContactAlertUI.i(FindMContactAlertUI.this);
          FindMContactAlertUI.j(FindMContactAlertUI.this);
        }
        GMTrace.o(3104456048640L, 23130);
      }
    });
    at.xB().a(new af.a()
    {
      public final boolean Dj()
      {
        GMTrace.i(3097879379968L, 23081);
        for (;;)
        {
          try
          {
            FindMContactAlertUI.a(FindMContactAlertUI.this, com.tencent.mm.pluginsdk.a.dC(FindMContactAlertUI.this));
            StringBuilder localStringBuilder = new StringBuilder("tigerreg mobileList size ");
            if (FindMContactAlertUI.k(FindMContactAlertUI.this) != null) {
              continue;
            }
            i = 0;
            w.d("MicroMsg.FindMContactAlertUI", i);
          }
          catch (Exception localException)
          {
            int i;
            w.printErrStackTrace("MicroMsg.FindMContactAlertUI", localException, "", new Object[0]);
            continue;
          }
          GMTrace.o(3097879379968L, 23081);
          return true;
          i = FindMContactAlertUI.k(FindMContactAlertUI.this).size();
        }
      }
      
      public final boolean Dk()
      {
        GMTrace.i(3097745162240L, 23080);
        if ((FindMContactAlertUI.k(FindMContactAlertUI.this) != null) && (FindMContactAlertUI.k(FindMContactAlertUI.this).size() != 0))
        {
          FindMContactAlertUI.a(FindMContactAlertUI.this, new y(FindMContactAlertUI.a(FindMContactAlertUI.this), FindMContactAlertUI.k(FindMContactAlertUI.this)));
          at.wS().a(FindMContactAlertUI.l(FindMContactAlertUI.this), 0);
        }
        for (;;)
        {
          GMTrace.o(3097745162240L, 23080);
          return false;
          if (FindMContactAlertUI.f(FindMContactAlertUI.this) != null)
          {
            FindMContactAlertUI.f(FindMContactAlertUI.this).dismiss();
            FindMContactAlertUI.g(FindMContactAlertUI.this);
          }
          FindMContactAlertUI.d(FindMContactAlertUI.this);
        }
      }
      
      public final String toString()
      {
        GMTrace.i(3098013597696L, 23082);
        String str = super.toString() + "|doUpload";
        GMTrace.o(3098013597696L, 23082);
        return str;
      }
    });
    com.tencent.mm.platformtools.m.h(true, false);
    com.tencent.mm.modelfriend.a.GO();
    g.ork.i(11438, new Object[] { Integer.valueOf(1) });
    w.i("MicroMsg.FindMContactAlertUI", "[cpan] kv report logid:%d scene:%d", new Object[] { Integer.valueOf(11438), Integer.valueOf(1) });
    GMTrace.o(3135057690624L, 23358);
  }
  
  private View j(ViewGroup paramViewGroup)
  {
    GMTrace.i(3134789255168L, 23356);
    if (this.wnw >= 200)
    {
      GMTrace.o(3134789255168L, 23356);
      return null;
    }
    this.wnw += 1;
    int j = paramViewGroup.getChildCount();
    int i = 0;
    while (i < j)
    {
      View localView = paramViewGroup.getChildAt(i);
      if ((localView instanceof Button))
      {
        GMTrace.o(3134789255168L, 23356);
        return localView;
      }
      if ((localView instanceof ViewGroup))
      {
        localView = j((ViewGroup)localView);
        if (localView != null)
        {
          GMTrace.o(3134789255168L, 23356);
          return localView;
        }
      }
      i += 1;
    }
    GMTrace.o(3134789255168L, 23356);
    return null;
  }
  
  protected final void MP()
  {
    GMTrace.i(3134520819712L, 23354);
    this.ipl = getString(R.l.dvP);
    this.ipm = getString(R.l.dvO);
    if (!bg.nm(this.wns)) {
      this.ipl = this.wns;
    }
    if (!bg.nm(this.wnt)) {
      this.ipm = this.wnt;
    }
    at.AR();
    this.eMW = ((String)c.xh().get(6, null));
    if ((this.eMW == null) || (this.eMW.equals("")))
    {
      at.AR();
      this.eMW = ((String)c.xh().get(4097, null));
    }
    GMTrace.o(3134520819712L, 23354);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(3135460343808L, 23361);
    int i = R.i.cxg;
    GMTrace.o(3135460343808L, 23361);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(3133983948800L, 23350);
    super.onCreate(paramBundle);
    oM(R.l.bzW);
    com.tencent.mm.plugin.c.a.hnI.pu();
    this.jQv = getIntent().getStringExtra("regsetinfo_ticket");
    this.vWr = getIntent().getStringExtra("regsetinfo_NextStep");
    this.vWs = getIntent().getIntExtra("regsetinfo_NextStyle", 2);
    this.wns = getIntent().getStringExtra("alert_title");
    this.wnt = getIntent().getStringExtra("alert_message");
    if (com.tencent.mm.modelfriend.m.Ho() != m.a.gDm) {}
    for (boolean bool = true;; bool = false)
    {
      this.wnu = bool;
      this.osl = b.Qu();
      w.d("MicroMsg.FindMContactAlertUI", "tigerreg mNextStep %s  mNextStyle %s ", new Object[] { this.vWr, Integer.valueOf(this.vWs) });
      if (!isFinishing()) {
        break;
      }
      GMTrace.o(3133983948800L, 23350);
      return;
    }
    MP();
    cbl();
    GMTrace.o(3133983948800L, 23350);
  }
  
  public void onDestroy()
  {
    GMTrace.i(3134118166528L, 23351);
    w.d("MicroMsg.FindMContactAlertUI", "ondestroy");
    if (this.gWn != null)
    {
      at.wS().b(431, this.gWn);
      this.gWn = null;
    }
    super.onDestroy();
    GMTrace.o(3134118166528L, 23351);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(3135191908352L, 23359);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      bci();
      GMTrace.o(3135191908352L, 23359);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(3135191908352L, 23359);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(3134386601984L, 23353);
    super.onPause();
    if (this.wnu)
    {
      b.b(false, at.wN() + "," + getClass().getName() + ",R300_100_QQ," + at.eK("R300_100_QQ") + ",2");
      GMTrace.o(3134386601984L, 23353);
      return;
    }
    b.b(false, at.wN() + "," + getClass().getName() + ",RE300_100," + at.eK("RE300_100") + ",2");
    GMTrace.o(3134386601984L, 23353);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(3135594561536L, 23362);
    w.i("MicroMsg.FindMContactAlertUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(3135594561536L, 23362);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        cbn();
        GMTrace.o(3135594561536L, 23362);
        return;
      }
      h.a(this, getString(R.l.dNp), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(3124857143296L, 23282);
          paramAnonymousDialogInterface.dismiss();
          FindMContactAlertUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(3124857143296L, 23282);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(3105261355008L, 23136);
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(3105261355008L, 23136);
        }
      });
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(3134252384256L, 23352);
    super.onResume();
    if (this.wnu)
    {
      b.ny("R300_100_QQ");
      b.b(true, at.wN() + "," + getClass().getName() + ",R300_100_QQ," + at.eK("R300_100_QQ") + ",1");
      GMTrace.o(3134252384256L, 23352);
      return;
    }
    b.ny("R300_100_phone");
    b.b(true, at.wN() + "," + getClass().getName() + ",RE300_100," + at.eK("RE300_100") + ",1");
    GMTrace.o(3134252384256L, 23352);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\bindmobile\FindMContactAlertUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
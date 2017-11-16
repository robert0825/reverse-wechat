package com.tencent.mm.ui.account.bind;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
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
import com.tencent.mm.g.a.hl;
import com.tencent.mm.g.a.hl.b;
import com.tencent.mm.g.a.hm;
import com.tencent.mm.g.a.hm.a;
import com.tencent.mm.g.a.rt;
import com.tencent.mm.modelsimple.BindWordingContent;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.friend.FindMContactAddUI;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;
import java.util.Timer;
import java.util.TimerTask;

public class BindMobileVerifyUI
  extends MMWizardActivity
  implements e
{
  private String eMW;
  private r hsU;
  private Timer mTimer;
  private BindWordingContent vUP;
  private int vUQ;
  private boolean vUR;
  private boolean vUS;
  private boolean vVf;
  private EditText vVi;
  private TextView vVj;
  private TextView vVk;
  private Button vVl;
  private boolean vVm;
  private boolean vVn;
  private boolean vVo;
  private Integer vVp;
  
  public BindMobileVerifyUI()
  {
    GMTrace.i(2563155951616L, 19097);
    this.hsU = null;
    this.vVm = false;
    this.vVn = false;
    this.vVo = false;
    this.vVf = false;
    this.vVp = Integer.valueOf(15);
    GMTrace.o(2563155951616L, 19097);
  }
  
  private void bZb()
  {
    GMTrace.i(2563961257984L, 19103);
    if (this.mTimer != null)
    {
      this.mTimer.cancel();
      this.mTimer = null;
    }
    GMTrace.o(2563961257984L, 19103);
  }
  
  protected final void MP()
  {
    GMTrace.i(2563827040256L, 19102);
    at.AR();
    this.eMW = ((String)c.xh().get(4097, null));
    this.vVi = ((EditText)findViewById(R.h.bhc));
    this.vVj = ((TextView)findViewById(R.h.bhb));
    this.vVk = ((TextView)findViewById(R.h.bgW));
    this.vVm = getIntent().getBooleanExtra("is_bind_for_safe_device", false);
    this.vVn = getIntent().getBooleanExtra("is_bind_for_contact_sync", false);
    this.vVo = getIntent().getBooleanExtra("BIND_FOR_QQ_REG", false);
    Object localObject = (Button)findViewById(R.h.bgZ);
    if ((this.eMW == null) || (this.eMW.equals("")))
    {
      at.AR();
      this.eMW = ((String)c.xh().get(6, null));
    }
    if ((this.eMW != null) && (this.eMW.length() > 0))
    {
      this.vVj.setVisibility(0);
      this.vVj.setText(this.eMW);
    }
    InputFilter local1 = new InputFilter()
    {
      public final CharSequence filter(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, Spanned paramAnonymousSpanned, int paramAnonymousInt3, int paramAnonymousInt4)
      {
        GMTrace.i(2554431799296L, 19032);
        paramAnonymousCharSequence = bg.M(paramAnonymousCharSequence);
        GMTrace.o(2554431799296L, 19032);
        return paramAnonymousCharSequence;
      }
    };
    this.vVi.setFilters(new InputFilter[] { local1 });
    this.vVl = ((Button)findViewById(R.h.bhe));
    ((Button)localObject).setVisibility(8);
    this.vVk.setText(getResources().getQuantityString(R.j.cIu, this.vVp.intValue(), new Object[] { this.vVp }));
    if (this.mTimer == null)
    {
      this.mTimer = new Timer();
      localObject = new TimerTask()
      {
        public final void run()
        {
          GMTrace.i(2561679556608L, 19086);
          if (BindMobileVerifyUI.c(BindMobileVerifyUI.this) != null) {
            BindMobileVerifyUI.d(BindMobileVerifyUI.this);
          }
          GMTrace.o(2561679556608L, 19086);
        }
      };
      if (this.mTimer != null) {
        this.mTimer.schedule((TimerTask)localObject, 1000L, 1000L);
      }
    }
    a(0, getString(R.l.cTI), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(final MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(2553626492928L, 19026);
        paramAnonymousMenuItem = BindMobileVerifyUI.a(BindMobileVerifyUI.this).getText().toString().trim();
        if (paramAnonymousMenuItem.equals(""))
        {
          h.h(BindMobileVerifyUI.this, R.l.dad, R.l.cUG);
          GMTrace.o(2553626492928L, 19026);
          return true;
        }
        BindMobileVerifyUI.this.aLo();
        Object localObject1 = new hl();
        ((hl)localObject1).eKJ.context = BindMobileVerifyUI.this;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
        localObject1 = ((hl)localObject1).eKK.eKL;
        Object localObject2 = new hm();
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
        localObject2 = ((hm)localObject2).eKM.eKN;
        paramAnonymousMenuItem = new com.tencent.mm.modelfriend.t(BindMobileVerifyUI.b(BindMobileVerifyUI.this), 2, paramAnonymousMenuItem, "", (String)localObject1, (String)localObject2);
        at.wS().a(paramAnonymousMenuItem, 0);
        localObject1 = BindMobileVerifyUI.this;
        localObject2 = BindMobileVerifyUI.this;
        BindMobileVerifyUI.this.getString(R.l.cUG);
        BindMobileVerifyUI.a((BindMobileVerifyUI)localObject1, h.a((Context)localObject2, BindMobileVerifyUI.this.getString(R.l.cZU), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
          {
            GMTrace.i(2561142685696L, 19082);
            at.wS().c(paramAnonymousMenuItem);
            GMTrace.o(2561142685696L, 19082);
          }
        }));
        GMTrace.o(2553626492928L, 19026);
        return true;
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(2558055677952L, 19059);
        BindMobileVerifyUI.this.finish();
        GMTrace.o(2558055677952L, 19059);
        return true;
      }
    });
    localObject = this.vVl;
    if (com.tencent.mm.ap.b.ky(this.eMW)) {}
    for (int i = 0;; i = 8)
    {
      ((Button)localObject).setVisibility(i);
      this.vVl.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2563021733888L, 19096);
          BindMobileVerifyUI.this.aLo();
          paramAnonymousView = new Intent();
          Bundle localBundle = new Bundle();
          localBundle.putString("bindmcontact_mobile", BindMobileVerifyUI.b(BindMobileVerifyUI.this));
          localBundle.putInt("voice_verify_type", 4);
          paramAnonymousView.putExtras(localBundle);
          com.tencent.mm.plugin.c.a.hnH.e(BindMobileVerifyUI.this, paramAnonymousView);
          GMTrace.o(2563021733888L, 19096);
        }
      });
      GMTrace.o(2563827040256L, 19102);
      return;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    boolean bool2 = true;
    GMTrace.i(2564229693440L, 19105);
    w.i("MicroMsg.BindMobileVerifyUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (((com.tencent.mm.modelfriend.t)paramk).CD() != 2)
    {
      GMTrace.o(2564229693440L, 19105);
      return;
    }
    if (this.hsU != null)
    {
      this.hsU.dismiss();
      this.hsU = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (((com.tencent.mm.modelfriend.t)paramk).CD() == 2)
      {
        if (this.vVm)
        {
          if (!q.zM())
          {
            paramString = new rt();
            paramString.eWA.eWB = true;
            paramString.eWA.eWC = true;
            com.tencent.mm.sdk.b.a.vgX.m(paramString);
          }
          Bh(1);
          paramString = new Intent();
          paramString.addFlags(67108864);
          com.tencent.mm.plugin.c.a.hnH.d(this, paramString);
          GMTrace.o(2564229693440L, 19105);
          return;
        }
        if (this.vVo)
        {
          Bh(1);
          startActivity(new Intent(this, FindMContactAddUI.class));
          GMTrace.o(2564229693440L, 19105);
          return;
        }
        if (this.vVf)
        {
          boolean bool1;
          if (!this.vUR)
          {
            bool1 = true;
            if (this.vUS) {
              break label292;
            }
          }
          for (;;)
          {
            BindMobileStatusUI.c(this, bool1, bool2);
            exit(-1);
            GMTrace.o(2564229693440L, 19105);
            return;
            bool1 = false;
            break;
            label292:
            bool2 = false;
          }
        }
        if (!this.vVn)
        {
          getApplicationContext();
          com.tencent.mm.modelfriend.a.GO();
        }
        paramString = new Intent(this, BindMobileStatusUI.class);
        paramString.putExtra("kstyle_bind_wording", this.vUP);
        paramString.putExtra("kstyle_bind_recommend_show", this.vUQ);
        paramString.putExtra("Kfind_friend_by_mobile_flag", this.vUR);
        paramString.putExtra("Krecom_friends_by_mobile_flag", this.vUS);
        A(this, paramString);
      }
      GMTrace.o(2564229693440L, 19105);
      return;
    }
    int i;
    if (com.tencent.mm.plugin.c.a.hnI.a(this, paramInt1, paramInt2, paramString)) {
      i = 1;
    }
    while (i != 0)
    {
      GMTrace.o(2564229693440L, 19105);
      return;
      switch (paramInt2)
      {
      default: 
        i = 0;
        break;
      case -34: 
        Toast.makeText(this, R.l.cZq, 0).show();
        i = 1;
        break;
      case -43: 
        Toast.makeText(this, R.l.cZn, 0).show();
        i = 1;
        break;
      case -214: 
        paramString = com.tencent.mm.h.a.dH(paramString);
        if (paramString != null) {
          paramString.a(this, null, null);
        }
        i = 1;
        break;
      case -41: 
        Toast.makeText(this, R.l.cZp, 0).show();
        i = 1;
        break;
      case -35: 
        Toast.makeText(this, R.l.cZo, 0).show();
        i = 1;
        break;
      case -36: 
        Toast.makeText(this, R.l.cZs, 0).show();
        i = 1;
        break;
      case -32: 
        h.a(this, R.l.cZY, R.l.bhd, null);
        i = 1;
        break;
      case -33: 
        h.a(this, R.l.cZX, R.l.bhd, null);
        i = 1;
      }
    }
    Toast.makeText(this, getString(R.l.cZW, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
    GMTrace.o(2564229693440L, 19105);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2563692822528L, 19101);
    int i = R.i.cqf;
    GMTrace.o(2563692822528L, 19101);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2563290169344L, 19098);
    super.onCreate(paramBundle);
    at.wS().a(132, this);
    oM(R.l.cZK);
    this.vUP = ((BindWordingContent)getIntent().getParcelableExtra("kstyle_bind_wording"));
    this.vUQ = getIntent().getIntExtra("kstyle_bind_recommend_show", 0);
    this.vUR = getIntent().getBooleanExtra("Kfind_friend_by_mobile_flag", false);
    this.vUS = getIntent().getBooleanExtra("Krecom_friends_by_mobile_flag", false);
    this.vVf = getIntent().getBooleanExtra("is_bind_for_chatroom_upgrade", false);
    MP();
    GMTrace.o(2563290169344L, 19098);
  }
  
  public void onDestroy()
  {
    GMTrace.i(2563424387072L, 19099);
    at.wS().b(132, this);
    super.onDestroy();
    GMTrace.o(2563424387072L, 19099);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2564095475712L, 19104);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      GMTrace.o(2564095475712L, 19104);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(2564095475712L, 19104);
    return bool;
  }
  
  protected void onStop()
  {
    GMTrace.i(2563558604800L, 19100);
    bZb();
    super.onStop();
    GMTrace.o(2563558604800L, 19100);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\account\bind\BindMobileVerifyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
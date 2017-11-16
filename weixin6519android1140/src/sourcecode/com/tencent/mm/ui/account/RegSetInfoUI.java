package com.tencent.mm.ui.account;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.modelsimple.c;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.adw;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.t.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.af.a;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.account.mobile.MobileInputUI;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.applet.SecurityImage.b;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.bindmobile.FindMContactAlertUI;
import com.tencent.mm.ui.bindmobile.FindMContactIntroUI;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.as;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bj;
import java.io.File;
import java.util.LinkedList;
import java.util.Map;

public class RegSetInfoUI
  extends MMActivity
  implements com.tencent.mm.ad.e
{
  private ProgressDialog htG;
  private String jQv;
  private Button kES;
  private ProgressBar ktM;
  private String llG;
  private int nvM;
  private SecurityImage vMf;
  private String vQG;
  private com.tencent.mm.pluginsdk.i.a vQt;
  private boolean vRY;
  private EditText vSI;
  private int vTA;
  private LinkedList<String> vTB;
  private ImageView vTC;
  private String vTD;
  private ImageView vTE;
  private View vTF;
  private TextView vTG;
  private String vTH;
  private boolean vTI;
  private com.tencent.mm.ui.base.q vTJ;
  private View vTK;
  private boolean vTL;
  private aj vTM;
  private EditText vTq;
  private String vTr;
  private String vTs;
  private int vTt;
  private String vTu;
  private TextView vTv;
  private View vTw;
  private boolean vTx;
  private ImageView vTy;
  private int vTz;
  
  public RegSetInfoUI()
  {
    GMTrace.i(2569329967104L, 19143);
    this.htG = null;
    this.nvM = 0;
    this.vMf = null;
    this.vTx = false;
    this.vRY = false;
    this.vTz = 3;
    this.vTB = new LinkedList();
    this.vTD = "";
    this.vTH = null;
    this.vTI = false;
    this.vTL = false;
    this.vTM = new aj(Looper.myLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(2686636261376L, 20017);
        String str = RegSetInfoUI.a(RegSetInfoUI.this).getText().toString().trim();
        Object localObject2 = RegSetInfoUI.b(RegSetInfoUI.this).getText().toString().trim();
        Object localObject1 = str;
        if (bg.nm(str))
        {
          localObject1 = str;
          if (!bg.nm((String)localObject2)) {
            if (((String)localObject2).length() <= 5) {
              break label211;
            }
          }
        }
        label211:
        for (localObject1 = ((String)localObject2).substring(0, 5);; localObject1 = localObject2)
        {
          if ((!bg.nm((String)localObject1)) && (bg.nm((String)localObject2))) {
            localObject2 = localObject1;
          }
          for (;;)
          {
            if ((!bg.nm((String)localObject1)) && (RegSetInfoUI.c(RegSetInfoUI.this)) && (RegSetInfoUI.d(RegSetInfoUI.this)))
            {
              int i = RegSetInfoUI.e(RegSetInfoUI.this);
              str = RegSetInfoUI.f(RegSetInfoUI.this);
              at.wS().a(429, RegSetInfoUI.this);
              localObject1 = new com.tencent.mm.modelfriend.x(str, RegSetInfoUI.g(RegSetInfoUI.this), i, (String)localObject2, (String)localObject1, "", "");
              at.wS().a((k)localObject1, 0);
              RegSetInfoUI.h(RegSetInfoUI.this).setVisibility(0);
            }
            GMTrace.o(2686636261376L, 20017);
            return false;
          }
        }
      }
    }, true);
    GMTrace.o(2569329967104L, 19143);
  }
  
  private void M(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool2 = false;
    GMTrace.i(2570001055744L, 19148);
    if (bg.nm(this.vTq.getText().toString().trim())) {
      paramBoolean1 = false;
    }
    ImageView localImageView = this.vTC;
    if (paramBoolean2)
    {
      i = R.g.bax;
      localImageView.setImageResource(i);
      localImageView = this.vTC;
      if (!paramBoolean1) {
        break label113;
      }
    }
    label113:
    for (int i = 0;; i = 8)
    {
      localImageView.setVisibility(i);
      boolean bool1 = bool2;
      if (paramBoolean1)
      {
        bool1 = bool2;
        if (paramBoolean2) {
          bool1 = true;
        }
      }
      this.vTI = bool1;
      GMTrace.o(2570001055744L, 19148);
      return;
      i = R.g.bau;
      break;
    }
  }
  
  private boolean bYM()
  {
    GMTrace.i(2570135273472L, 19149);
    if ((this.vTC.getVisibility() == 8) || (this.vTI))
    {
      GMTrace.o(2570135273472L, 19149);
      return true;
    }
    GMTrace.o(2570135273472L, 19149);
    return false;
  }
  
  private void bYN()
  {
    GMTrace.i(2570269491200L, 19150);
    String str = this.vSI.getText().toString().trim();
    Button localButton = this.kES;
    if (!bg.nm(str)) {}
    for (boolean bool = true;; bool = false)
    {
      localButton.setEnabled(bool);
      GMTrace.o(2570269491200L, 19150);
      return;
    }
  }
  
  private boolean bYO()
  {
    GMTrace.i(2570403708928L, 19151);
    if ((this.vTz & 0x1) > 0)
    {
      GMTrace.o(2570403708928L, 19151);
      return true;
    }
    GMTrace.o(2570403708928L, 19151);
    return false;
  }
  
  private boolean bYP()
  {
    GMTrace.i(2570537926656L, 19152);
    if ((this.vTz & 0x2) > 0)
    {
      GMTrace.o(2570537926656L, 19152);
      return true;
    }
    GMTrace.o(2570537926656L, 19152);
    return false;
  }
  
  private boolean bYQ()
  {
    GMTrace.i(2570940579840L, 19155);
    if (this.nvM == 1)
    {
      GMTrace.o(2570940579840L, 19155);
      return true;
    }
    GMTrace.o(2570940579840L, 19155);
    return false;
  }
  
  private boolean bYR()
  {
    GMTrace.i(2571074797568L, 19156);
    if (this.nvM == 2)
    {
      GMTrace.o(2571074797568L, 19156);
      return true;
    }
    GMTrace.o(2571074797568L, 19156);
    return false;
  }
  
  private boolean bYS()
  {
    GMTrace.i(2571209015296L, 19157);
    if (this.nvM == 3)
    {
      GMTrace.o(2571209015296L, 19157);
      return true;
    }
    GMTrace.o(2571209015296L, 19157);
    return false;
  }
  
  private int bYT()
  {
    GMTrace.i(2571343233024L, 19158);
    if (bYQ())
    {
      GMTrace.o(2571343233024L, 19158);
      return 4;
    }
    if (bYR())
    {
      GMTrace.o(2571343233024L, 19158);
      return 2;
    }
    if (bYS())
    {
      GMTrace.o(2571343233024L, 19158);
      return 6;
    }
    GMTrace.o(2571343233024L, 19158);
    return 2;
  }
  
  private String bYU()
  {
    GMTrace.i(2571477450752L, 19159);
    if (bYQ())
    {
      str = this.vTr;
      GMTrace.o(2571477450752L, 19159);
      return str;
    }
    if (bYS())
    {
      str = this.vTs;
      GMTrace.o(2571477450752L, 19159);
      return str;
    }
    String str = this.vTu;
    GMTrace.o(2571477450752L, 19159);
    return str;
  }
  
  private void bci()
  {
    GMTrace.i(2572014321664L, 19163);
    aLo();
    if (bYQ())
    {
      h.a(this, getString(R.l.dRW), "", new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2664087683072L, 19849);
          com.tencent.mm.plugin.c.b.nz("R200_100");
          if (bj.BC().BD() == 0)
          {
            paramAnonymousDialogInterface = new Intent(RegSetInfoUI.this, MobileInputUI.class);
            paramAnonymousDialogInterface.putExtra("mobile_input_purpose", 2);
          }
          for (;;)
          {
            paramAnonymousDialogInterface.addFlags(67108864);
            RegSetInfoUI.this.startActivity(paramAnonymousDialogInterface);
            RegSetInfoUI.this.finish();
            GMTrace.o(2664087683072L, 19849);
            return;
            paramAnonymousDialogInterface = new Intent(RegSetInfoUI.this, RegByMobileRegAIOUI.class);
          }
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2714419331072L, 20224);
          GMTrace.o(2714419331072L, 20224);
        }
      });
      GMTrace.o(2572014321664L, 19163);
      return;
    }
    if (!bYR())
    {
      if (this.nvM == 0) {}
      for (int i = 1; i != 0; i = 0)
      {
        h.a(this, getString(R.l.dRV), "", new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(2759650705408L, 20561);
            com.tencent.mm.plugin.c.b.nz("R400_100_signup");
            paramAnonymousDialogInterface = new Intent(RegSetInfoUI.this, LoginUI.class);
            paramAnonymousDialogInterface.addFlags(67108864);
            RegSetInfoUI.this.startActivity(paramAnonymousDialogInterface);
            RegSetInfoUI.this.finish();
            GMTrace.o(2759650705408L, 20561);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(2693481365504L, 20068);
            GMTrace.o(2693481365504L, 20068);
          }
        });
        GMTrace.o(2572014321664L, 19163);
        return;
      }
      if (bYS())
      {
        h.a(this, getString(R.l.dRV), "", new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(2745289408512L, 20454);
            com.tencent.mm.plugin.c.b.nz("R500_100");
            paramAnonymousDialogInterface = new Intent(RegSetInfoUI.this, RegByEmailUI.class);
            paramAnonymousDialogInterface.addFlags(67108864);
            RegSetInfoUI.this.startActivity(paramAnonymousDialogInterface);
            RegSetInfoUI.this.finish();
            GMTrace.o(2745289408512L, 20454);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(2682878164992L, 19989);
            GMTrace.o(2682878164992L, 19989);
          }
        });
        GMTrace.o(2572014321664L, 19163);
        return;
      }
      com.tencent.mm.plugin.c.b.nz("R200_100");
      Intent localIntent = new Intent(this, MobileInputUI.class);
      localIntent.putExtra("mobile_input_purpose", 2);
      localIntent.addFlags(67108864);
      startActivity(localIntent);
      finish();
    }
    GMTrace.o(2572014321664L, 19163);
  }
  
  private boolean q(int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(2571745886208L, 19161);
    Object localObject = new com.tencent.mm.pluginsdk.i.o(paramInt1, paramInt2, paramString);
    if (this.vQt.a(this, (com.tencent.mm.pluginsdk.i.o)localObject))
    {
      GMTrace.o(2571745886208L, 19161);
      return true;
    }
    if (com.tencent.mm.plugin.c.a.hnI.a(this.vKB.vKW, paramInt1, paramInt2, paramString))
    {
      GMTrace.o(2571745886208L, 19161);
      return true;
    }
    switch (paramInt2)
    {
    default: 
      GMTrace.o(2571745886208L, 19161);
      return false;
    case -10: 
    case -7: 
      h.h(this, R.l.dQG, R.l.dQH);
      GMTrace.o(2571745886208L, 19161);
      return true;
    case -75: 
      h.h(this, R.l.cRG, R.l.dQH);
      GMTrace.o(2571745886208L, 19161);
      return true;
    case -100: 
      at.hold();
      localObject = this.vKB.vKW;
      if (TextUtils.isEmpty(at.wy())) {}
      for (paramString = com.tencent.mm.br.a.X(this.vKB.vKW, R.l.dHY);; paramString = at.wy())
      {
        h.a((Context)localObject, paramString, this.vKB.vKW.getString(R.l.cUG), new DialogInterface.OnClickListener()new DialogInterface.OnCancelListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(2651739652096L, 19757);
            GMTrace.o(2651739652096L, 19757);
          }
        }, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(2643955023872L, 19699);
            GMTrace.o(2643955023872L, 19699);
          }
        });
        GMTrace.o(2571745886208L, 19161);
        return true;
      }
    }
    paramString = com.tencent.mm.h.a.dH(paramString);
    if (paramString != null) {
      paramString.a(this, null, null);
    }
    for (;;)
    {
      GMTrace.o(2571745886208L, 19161);
      return true;
      h.b(this, getString(R.l.dSb), "", true);
    }
  }
  
  protected final void MP()
  {
    int j = 0;
    GMTrace.i(2569866838016L, 19147);
    this.vTK = findViewById(R.h.bTC);
    this.vTF = findViewById(R.h.cct);
    this.vTy = ((ImageView)findViewById(R.h.ccs));
    this.vSI = ((EditText)findViewById(R.h.bXX));
    this.vTG = ((TextView)findViewById(R.h.ccv));
    this.vTq = ((EditText)findViewById(R.h.bYa));
    this.vTv = ((TextView)findViewById(R.h.bdN));
    this.vTw = findViewById(R.h.bYm);
    this.vTC = ((ImageView)findViewById(R.h.coe));
    this.ktM = ((ProgressBar)findViewById(R.h.bUu));
    this.vTE = ((ImageView)findViewById(R.h.ccu));
    this.kES = ((Button)findViewById(R.h.bQR));
    this.vTC.setVisibility(8);
    this.ktM.setVisibility(8);
    this.vTE.setVisibility(8);
    this.vRY = false;
    this.vTI = false;
    Object localObject = this.vTF;
    int i;
    if (bYO())
    {
      i = 0;
      ((View)localObject).setVisibility(i);
      localObject = this.vTw;
      if (!bYP()) {
        break label497;
      }
      i = 0;
      label240:
      ((View)localObject).setVisibility(i);
      localObject = this.vTv;
      if (!bYP()) {
        break label503;
      }
      i = j;
      label259:
      ((TextView)localObject).setVisibility(i);
      if ((!bYO()) || (!bYP())) {
        break label509;
      }
      this.vTG.setText(getString(R.l.dSa));
    }
    for (;;)
    {
      at.xB().a(new af.a()
      {
        String lTY;
        Bitmap mBitmap;
        
        public final boolean Dj()
        {
          GMTrace.i(2719519604736L, 20262);
          try
          {
            this.lTY = c.bi(RegSetInfoUI.this);
            this.mBitmap = c.bj(RegSetInfoUI.this);
            if ((this.mBitmap == null) || (this.mBitmap.isRecycled())) {}
          }
          catch (Exception localException1)
          {
            try
            {
              com.tencent.mm.sdk.platformtools.d.a(this.mBitmap, 100, Bitmap.CompressFormat.PNG, com.tencent.mm.compatible.util.e.fSg + "temp.avatar", false);
              GMTrace.o(2719519604736L, 20262);
              return true;
              localException1 = localException1;
              w.e("MiroMsg.RegSetInfoUI", "getName or getBitmap err : " + localException1.getMessage());
            }
            catch (Exception localException2)
            {
              for (;;)
              {
                w.e("MiroMsg.RegSetInfoUI", "save avatar fail." + localException2.getMessage());
                w.printErrStackTrace("MiroMsg.RegSetInfoUI", localException2, "", new Object[0]);
              }
            }
          }
        }
        
        public final boolean Dk()
        {
          GMTrace.i(2719385387008L, 20261);
          if ((!bg.nm(this.lTY)) && (bg.nm(RegSetInfoUI.b(RegSetInfoUI.this).getText().trim()))) {
            RegSetInfoUI.b(RegSetInfoUI.this).setText(this.lTY);
          }
          if (!f.ty())
          {
            w.e("MiroMsg.RegSetInfoUI", "SDcard is not available");
            GMTrace.o(2719385387008L, 20261);
            return false;
          }
          if ((this.mBitmap != null) && (!this.mBitmap.isRecycled()) && (!RegSetInfoUI.j(RegSetInfoUI.this)))
          {
            RegSetInfoUI.i(RegSetInfoUI.this).setImageBitmap(this.mBitmap);
            RegSetInfoUI.k(RegSetInfoUI.this);
            RegSetInfoUI.l(RegSetInfoUI.this).setVisibility(0);
          }
          GMTrace.o(2719385387008L, 20261);
          return true;
        }
        
        public final String toString()
        {
          GMTrace.i(2719653822464L, 20263);
          String str = super.toString() + "|initView";
          GMTrace.o(2719653822464L, 20263);
          return str;
        }
      });
      this.vSI.addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(2640599580672L, 19674);
          paramAnonymousEditable = RegSetInfoUI.b(RegSetInfoUI.this).getText().toString().trim();
          if ((paramAnonymousEditable != null) && (paramAnonymousEditable.length() > 16))
          {
            RegSetInfoUI.b(RegSetInfoUI.this).setText(paramAnonymousEditable.substring(0, 16));
            GMTrace.o(2640599580672L, 19674);
            return;
          }
          if (!RegSetInfoUI.m(RegSetInfoUI.this).bQn()) {
            RegSetInfoUI.m(RegSetInfoUI.this).stopTimer();
          }
          RegSetInfoUI.n(RegSetInfoUI.this);
          if (!RegSetInfoUI.o(RegSetInfoUI.this)) {
            RegSetInfoUI.a(RegSetInfoUI.this).setText(paramAnonymousEditable);
          }
          GMTrace.o(2640599580672L, 19674);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(2640733798400L, 19675);
          GMTrace.o(2640733798400L, 19675);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(2640868016128L, 19676);
          GMTrace.o(2640868016128L, 19676);
        }
      });
      this.kES.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2765422067712L, 20604);
          RegSetInfoUI.p(RegSetInfoUI.this);
          GMTrace.o(2765422067712L, 20604);
        }
      });
      this.vTq.setOnFocusChangeListener(new View.OnFocusChangeListener()
      {
        public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
        {
          GMTrace.i(2759382269952L, 20559);
          if (paramAnonymousBoolean)
          {
            RegSetInfoUI.q(RegSetInfoUI.this);
            RegSetInfoUI.m(RegSetInfoUI.this).z(200L, 200L);
          }
          GMTrace.o(2759382269952L, 20559);
        }
      });
      this.vTq.addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(2658987409408L, 19811);
          if (!RegSetInfoUI.m(RegSetInfoUI.this).bQn()) {
            RegSetInfoUI.m(RegSetInfoUI.this).stopTimer();
          }
          paramAnonymousEditable = RegSetInfoUI.a(RegSetInfoUI.this).getText().toString().trim();
          if (bg.nm(paramAnonymousEditable))
          {
            RegSetInfoUI.r(RegSetInfoUI.this).setText(RegSetInfoUI.this.getString(R.l.dSc));
            RegSetInfoUI.s(RegSetInfoUI.this);
            if (RegSetInfoUI.t(RegSetInfoUI.this) != null)
            {
              RegSetInfoUI.t(RegSetInfoUI.this).dismiss();
              RegSetInfoUI.u(RegSetInfoUI.this);
            }
            RegSetInfoUI.a(RegSetInfoUI.this).postDelayed(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(2717237903360L, 20245);
                RegSetInfoUI.a(RegSetInfoUI.this).clearFocus();
                RegSetInfoUI.a(RegSetInfoUI.this).requestFocus();
                GMTrace.o(2717237903360L, 20245);
              }
            }, 50L);
          }
          if ((!bg.nm(paramAnonymousEditable)) && ((RegSetInfoUI.c(RegSetInfoUI.this)) || (!paramAnonymousEditable.equals(RegSetInfoUI.v(RegSetInfoUI.this)))))
          {
            RegSetInfoUI.s(RegSetInfoUI.this);
            RegSetInfoUI.m(RegSetInfoUI.this).z(500L, 500L);
          }
          RegSetInfoUI.a(RegSetInfoUI.this, paramAnonymousEditable);
          GMTrace.o(2658987409408L, 19811);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(2659121627136L, 19812);
          GMTrace.o(2659121627136L, 19812);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(2659255844864L, 19813);
          GMTrace.o(2659255844864L, 19813);
        }
      });
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(2697373679616L, 20097);
          RegSetInfoUI.w(RegSetInfoUI.this);
          GMTrace.o(2697373679616L, 20097);
          return true;
        }
      });
      this.vSI.setOnEditorActionListener(new TextView.OnEditorActionListener()
      {
        public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
        {
          GMTrace.i(2681804423168L, 19981);
          if ((paramAnonymousInt == 6) || (paramAnonymousInt == 5))
          {
            RegSetInfoUI.p(RegSetInfoUI.this);
            GMTrace.o(2681804423168L, 19981);
            return true;
          }
          GMTrace.o(2681804423168L, 19981);
          return false;
        }
      });
      this.vSI.setOnKeyListener(new View.OnKeyListener()
      {
        public final boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
        {
          GMTrace.i(2697105244160L, 20095);
          if ((66 == paramAnonymousInt) && (paramAnonymousKeyEvent.getAction() == 0))
          {
            RegSetInfoUI.p(RegSetInfoUI.this);
            GMTrace.o(2697105244160L, 20095);
            return true;
          }
          GMTrace.o(2697105244160L, 20095);
          return false;
        }
      });
      this.vTq.setOnEditorActionListener(new TextView.OnEditorActionListener()
      {
        public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
        {
          GMTrace.i(2697642115072L, 20099);
          if ((paramAnonymousInt == 6) || (paramAnonymousInt == 5))
          {
            RegSetInfoUI.p(RegSetInfoUI.this);
            GMTrace.o(2697642115072L, 20099);
            return true;
          }
          GMTrace.o(2697642115072L, 20099);
          return false;
        }
      });
      this.vTq.setOnKeyListener(new View.OnKeyListener()
      {
        public final boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
        {
          GMTrace.i(2753879343104L, 20518);
          if ((66 == paramAnonymousInt) && (paramAnonymousKeyEvent.getAction() == 0))
          {
            RegSetInfoUI.p(RegSetInfoUI.this);
            GMTrace.o(2753879343104L, 20518);
            return true;
          }
          GMTrace.o(2753879343104L, 20518);
          return false;
        }
      });
      this.vTy.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2737102127104L, 20393);
          RegSetInfoUI.x(RegSetInfoUI.this);
          GMTrace.o(2737102127104L, 20393);
        }
      });
      localObject = new File(com.tencent.mm.compatible.util.e.fSg);
      if (!((File)localObject).exists()) {
        ((File)localObject).mkdir();
      }
      bYN();
      GMTrace.o(2569866838016L, 19147);
      return;
      i = 8;
      break;
      label497:
      i = 8;
      break label240;
      label503:
      i = 8;
      break label259;
      label509:
      if ((bYO()) && (!bYP())) {
        this.vTG.setText(getString(R.l.dRY));
      } else if ((!bYO()) && (bYP())) {
        this.vTG.setText(getString(R.l.dRZ));
      } else {
        this.vTG.setText(getString(R.l.dRX));
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, final String paramString, final k paramk)
  {
    GMTrace.i(2571611668480L, 19160);
    w.i("MiroMsg.RegSetInfoUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    final String str2;
    final String str1;
    final int i;
    String str3;
    final Object localObject1;
    final Object localObject2;
    boolean bool2;
    final boolean bool1;
    Object localObject3;
    if (paramk.getType() == 126)
    {
      at.wS().b(126, this);
      if (this.htG != null)
      {
        this.htG.dismiss();
        this.htG = null;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.vTH = null;
        str2 = bYU();
        str1 = ((com.tencent.mm.modelsimple.x)paramk).LE();
        i = ((com.tencent.mm.modelsimple.x)paramk).LF();
        str3 = ((com.tencent.mm.modelsimple.x)paramk).LG();
        localObject1 = null;
        localObject2 = null;
        bool2 = false;
        bool1 = false;
        Map localMap = bh.q(str3, "wording");
        if (localMap == null) {
          break label1669;
        }
        localObject3 = (String)localMap.get(".wording.switch");
        if (!bg.nm((String)localObject3)) {
          break label560;
        }
        bool1 = true;
        bool2 = bool1;
        if (!bool1) {
          break label1669;
        }
        localObject3 = (String)localMap.get(".wording.title");
        if (!bg.nm((String)localObject3)) {
          localObject1 = localObject3;
        }
        localObject3 = (String)localMap.get(".wording.desc");
        if (bg.nm((String)localObject3)) {
          break label1666;
        }
        localObject2 = localObject3;
      }
    }
    for (;;)
    {
      w.d("MiroMsg.RegSetInfoUI", "mShowStyleContactUploadWordings , %s", new Object[] { str3 });
      at.unhold();
      at.bg(true);
      if (this.vRY)
      {
        localObject3 = com.tencent.mm.compatible.util.e.fSg + "temp.avatar";
        str3 = com.tencent.mm.compatible.util.e.fSg + "temp.avatar.hd";
        new File((String)localObject3).renameTo(new File(str3));
        com.tencent.mm.loader.stub.b.deleteFile((String)localObject3);
        com.tencent.mm.sdk.platformtools.d.b(str3, 96, 96, Bitmap.CompressFormat.JPEG, 90, (String)localObject3);
        new com.tencent.mm.pluginsdk.model.o(this, com.tencent.mm.compatible.util.e.fSg + "temp.avatar").a(new Runnable()new Runnable
        {
          public final void run()
          {
            GMTrace.i(2736833691648L, 20391);
            RegSetInfoUI.b(RegSetInfoUI.this, ((com.tencent.mm.modelsimple.x)paramk).LD());
            as.gnb.M("login_user_name", str2);
            com.tencent.mm.loader.stub.b.deleteFile(com.tencent.mm.compatible.util.e.fSg + "temp.avatar");
            if ((str1 != null) && (str1.contains("0")))
            {
              com.tencent.mm.plugin.c.b.nz("R300_100_phone");
              if (!bool1) {
                localIntent1 = new Intent(RegSetInfoUI.this, FindMContactIntroUI.class);
              }
              for (;;)
              {
                localIntent1.addFlags(67108864);
                localIntent1.putExtra("regsetinfo_ticket", RegSetInfoUI.g(RegSetInfoUI.this));
                localIntent1.putExtra("regsetinfo_NextStep", str1);
                localIntent1.putExtra("regsetinfo_NextStyle", i);
                Intent localIntent2 = com.tencent.mm.plugin.c.a.hnH.ao(RegSetInfoUI.this);
                localIntent2.addFlags(67108864);
                MMWizardActivity.b(RegSetInfoUI.this, localIntent1, localIntent2);
                RegSetInfoUI.this.finish();
                GMTrace.o(2736833691648L, 20391);
                return;
                localIntent1 = new Intent(RegSetInfoUI.this, FindMContactAlertUI.class);
                localIntent1.putExtra("alert_title", localObject1);
                localIntent1.putExtra("alert_message", localObject2);
              }
            }
            Intent localIntent1 = com.tencent.mm.plugin.c.a.hnH.ao(RegSetInfoUI.this);
            localIntent1.addFlags(67108864);
            RegSetInfoUI.this.startActivity(localIntent1);
            com.tencent.mm.plugin.c.b.nA(at.wN() + "," + RegSetInfoUI.this.getClass().getName() + ",R200_900_phone," + at.eK("R200_900_phone") + ",4");
            RegSetInfoUI.this.finish();
            GMTrace.o(2736833691648L, 20391);
          }
        }, new Runnable()
        {
          public final void run()
          {
            GMTrace.i(2712406065152L, 20209);
            RegSetInfoUI.b(RegSetInfoUI.this, ((com.tencent.mm.modelsimple.x)paramk).LD());
            as.gnb.M("login_user_name", str2);
            if ((str1 != null) && (str1.contains("0")))
            {
              com.tencent.mm.plugin.c.b.nz("R300_100_phone");
              if (!bool1) {
                localIntent1 = new Intent(RegSetInfoUI.this, FindMContactIntroUI.class);
              }
              for (;;)
              {
                localIntent1.addFlags(67108864);
                localIntent1.putExtra("regsetinfo_ticket", RegSetInfoUI.g(RegSetInfoUI.this));
                localIntent1.putExtra("regsetinfo_NextStep", str1);
                localIntent1.putExtra("regsetinfo_NextStyle", i);
                Intent localIntent2 = com.tencent.mm.plugin.c.a.hnH.ao(RegSetInfoUI.this);
                localIntent2.addFlags(67108864);
                MMWizardActivity.b(RegSetInfoUI.this, localIntent1, localIntent2);
                RegSetInfoUI.this.finish();
                GMTrace.o(2712406065152L, 20209);
                return;
                localIntent1 = new Intent(RegSetInfoUI.this, FindMContactAlertUI.class);
                localIntent1.putExtra("alert_title", localObject1);
                localIntent1.putExtra("alert_message", localObject2);
              }
            }
            Intent localIntent1 = com.tencent.mm.plugin.c.a.hnH.ao(RegSetInfoUI.this);
            localIntent1.addFlags(67108864);
            RegSetInfoUI.this.startActivity(localIntent1);
            com.tencent.mm.plugin.c.b.nA(at.wN() + "," + RegSetInfoUI.this.getClass().getName() + ",R200_900_phone," + at.eK("R200_900_phone") + ",4");
            RegSetInfoUI.this.finish();
            GMTrace.o(2712406065152L, 20209);
          }
        });
      }
      for (;;)
      {
        if ((paramInt2 == -6) || (paramInt2 == 65225) || (paramInt2 == 65226))
        {
          if (this.vMf == null)
          {
            this.vMf = SecurityImage.a.a(this.vKB.vKW, R.l.dRU, 0, ((com.tencent.mm.modelsimple.x)paramk).HP(), ((com.tencent.mm.modelsimple.x)paramk).HQ(), "", new DialogInterface.OnClickListener()
            {
              public final void onClick(final DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(2670127480832L, 19894);
                paramAnonymousDialogInterface = RegSetInfoUI.a(RegSetInfoUI.this).getText().toString().trim();
                Object localObject = RegSetInfoUI.b(RegSetInfoUI.this).getText().toString().trim();
                if ((localObject == null) || (((String)localObject).length() <= 0))
                {
                  h.h(RegSetInfoUI.this, R.l.efU, R.l.dRD);
                  GMTrace.o(2670127480832L, 19894);
                  return;
                }
                paramAnonymousInt = RegSetInfoUI.e(RegSetInfoUI.this);
                at.wS().a(126, RegSetInfoUI.this);
                paramAnonymousDialogInterface = new com.tencent.mm.modelsimple.x("", RegSetInfoUI.y(RegSetInfoUI.this), (String)localObject, RegSetInfoUI.z(RegSetInfoUI.this), RegSetInfoUI.A(RegSetInfoUI.this), RegSetInfoUI.B(RegSetInfoUI.this), "", "", RegSetInfoUI.g(RegSetInfoUI.this), paramAnonymousInt, paramAnonymousDialogInterface, ((com.tencent.mm.modelsimple.x)paramk).HQ(), RegSetInfoUI.C(RegSetInfoUI.this).bZo(), RegSetInfoUI.D(RegSetInfoUI.this), RegSetInfoUI.j(RegSetInfoUI.this));
                paramAnonymousDialogInterface.lq(RegSetInfoUI.E(RegSetInfoUI.this));
                paramAnonymousDialogInterface.gY(RegSetInfoUI.F(RegSetInfoUI.this));
                at.wS().a(paramAnonymousDialogInterface, 0);
                localObject = RegSetInfoUI.this;
                RegSetInfoUI localRegSetInfoUI = RegSetInfoUI.this;
                RegSetInfoUI.this.getString(R.l.cUG);
                RegSetInfoUI.a((RegSetInfoUI)localObject, h.a(localRegSetInfoUI, RegSetInfoUI.this.getString(R.l.dRT), true, new DialogInterface.OnCancelListener()
                {
                  public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
                  {
                    GMTrace.i(2749181722624L, 20483);
                    at.wS().c(paramAnonymousDialogInterface);
                    at.wS().b(126, RegSetInfoUI.this);
                    GMTrace.o(2749181722624L, 20483);
                  }
                }));
                GMTrace.o(2670127480832L, 19894);
              }
            }, null, new DialogInterface.OnDismissListener()new SecurityImage.b
            {
              public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
              {
                GMTrace.i(2749450158080L, 20485);
                RegSetInfoUI.G(RegSetInfoUI.this);
                GMTrace.o(2749450158080L, 20485);
              }
            }, new SecurityImage.b()
            {
              public final void bYp()
              {
                GMTrace.i(2656437272576L, 19792);
                RegSetInfoUI.this.aLo();
                Object localObject = RegSetInfoUI.a(RegSetInfoUI.this).getText().toString().trim();
                String str = RegSetInfoUI.b(RegSetInfoUI.this).getText().toString().trim();
                int i = RegSetInfoUI.e(RegSetInfoUI.this);
                at.wS().a(126, RegSetInfoUI.this);
                localObject = new com.tencent.mm.modelsimple.x("", RegSetInfoUI.y(RegSetInfoUI.this), str, RegSetInfoUI.z(RegSetInfoUI.this), RegSetInfoUI.A(RegSetInfoUI.this), RegSetInfoUI.B(RegSetInfoUI.this), "", "", RegSetInfoUI.g(RegSetInfoUI.this), i, (String)localObject, ((com.tencent.mm.modelsimple.x)paramk).HQ(), "", RegSetInfoUI.D(RegSetInfoUI.this), RegSetInfoUI.j(RegSetInfoUI.this));
                ((com.tencent.mm.modelsimple.x)localObject).lq(RegSetInfoUI.E(RegSetInfoUI.this));
                ((com.tencent.mm.modelsimple.x)localObject).gY(RegSetInfoUI.F(RegSetInfoUI.this));
                at.wS().a((k)localObject, 0);
                GMTrace.o(2656437272576L, 19792);
              }
            });
            GMTrace.o(2571611668480L, 19160);
            return;
            label560:
            int j = bg.Sy((String)localObject3);
            if (j == 0)
            {
              bool1 = false;
              break;
            }
            if (j != 1) {
              break;
            }
            bool1 = true;
            break;
            this.jQv = ((com.tencent.mm.modelsimple.x)paramk).LD();
            as.gnb.M("login_user_name", str2);
            if ((str1 != null) && (str1.contains("0")))
            {
              com.tencent.mm.plugin.c.b.nz("R300_100_phone");
              if (!bool1) {}
              for (localObject1 = new Intent(this, FindMContactIntroUI.class);; localObject1 = localObject3)
              {
                ((Intent)localObject1).addFlags(67108864);
                ((Intent)localObject1).putExtra("regsetinfo_ticket", this.jQv);
                ((Intent)localObject1).putExtra("regsetinfo_NextStep", str1);
                ((Intent)localObject1).putExtra("regsetinfo_NextStyle", i);
                localObject2 = com.tencent.mm.plugin.c.a.hnH.ao(this);
                ((Intent)localObject2).addFlags(67108864);
                ((Intent)localObject2).putExtra("LauncherUI.enter_from_reg", true);
                MMWizardActivity.b(this, (Intent)localObject1, (Intent)localObject2);
                finish();
                break;
                localObject3 = new Intent(this, FindMContactAlertUI.class);
                ((Intent)localObject3).putExtra("alert_title", (String)localObject1);
                ((Intent)localObject3).putExtra("alert_message", (String)localObject2);
              }
            }
            localObject1 = com.tencent.mm.plugin.c.a.hnH.ao(this);
            ((Intent)localObject1).addFlags(67108864);
            ((Intent)localObject1).putExtra("LauncherUI.enter_from_reg", true);
            startActivity((Intent)localObject1);
            com.tencent.mm.plugin.c.b.nA(at.wN() + "," + getClass().getName() + ",R200_900_phone," + at.eK("R200_900_phone") + ",4");
            finish();
            continue;
          }
          this.vMf.a(0, ((com.tencent.mm.modelsimple.x)paramk).HP(), ((com.tencent.mm.modelsimple.x)paramk).HQ(), "");
          GMTrace.o(2571611668480L, 19160);
          return;
        }
      }
      localObject1 = com.tencent.mm.h.a.dH(paramString);
      if (localObject1 != null)
      {
        ((com.tencent.mm.h.a)localObject1).a(this, null, null);
        GMTrace.o(2571611668480L, 19160);
        return;
      }
      if (q(paramInt1, paramInt2, paramString))
      {
        GMTrace.o(2571611668480L, 19160);
        return;
      }
      if (paramk.getType() == 429)
      {
        at.wS().b(429, this);
        if (this.htG != null)
        {
          this.htG.dismiss();
          this.htG = null;
        }
        this.ktM.setVisibility(8);
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          this.vTH = null;
          paramInt1 = ((t.b)((com.tencent.mm.modelfriend.x)paramk).guL.AZ()).tKP.utJ;
          w.d("MiroMsg.RegSetInfoUI", "UsernameRet %d", new Object[] { Integer.valueOf(paramInt1) });
          if ((paramInt1 == -14) || (paramInt1 == -10) || (paramInt1 == -7))
          {
            paramk = ((t.b)((com.tencent.mm.modelfriend.x)paramk).guL.AZ()).tKP.jhd;
            paramString = com.tencent.mm.h.a.dH(paramString);
            if (paramString != null) {
              this.vTv.setText(paramString.desc);
            }
            this.vTB.clear();
            if ((paramk != null) && (paramk.size() > 0))
            {
              if (paramk.size() > 3) {}
              for (paramInt1 = 3;; paramInt1 = paramk.size())
              {
                paramString = new String[paramInt1];
                paramInt2 = 0;
                while (paramInt2 < paramInt1)
                {
                  paramString[paramInt2] = ((azq)paramk.get(paramInt2)).uNR;
                  this.vTB.add(paramString[paramInt2]);
                  paramInt2 += 1;
                }
              }
              if (this.vTL)
              {
                if (this.vTJ != null)
                {
                  this.vTJ.dismiss();
                  this.vTJ = null;
                }
                this.vTJ = g.a(this, this.vTK, paramString, new AdapterView.OnItemClickListener()
                {
                  public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
                  {
                    GMTrace.i(2640062709760L, 19670);
                    if (RegSetInfoUI.t(RegSetInfoUI.this) != null)
                    {
                      RegSetInfoUI.t(RegSetInfoUI.this).dismiss();
                      RegSetInfoUI.u(RegSetInfoUI.this);
                    }
                    RegSetInfoUI.a(RegSetInfoUI.this).setText(paramString[paramAnonymousInt]);
                    RegSetInfoUI.a(RegSetInfoUI.this).postDelayed(new Runnable()
                    {
                      public final void run()
                      {
                        GMTrace.i(2666503602176L, 19867);
                        RegSetInfoUI.a(RegSetInfoUI.this).clearFocus();
                        RegSetInfoUI.a(RegSetInfoUI.this).requestFocus();
                        GMTrace.o(2666503602176L, 19867);
                      }
                    }, 50L);
                    RegSetInfoUI.r(RegSetInfoUI.this).setText(RegSetInfoUI.this.getString(R.l.dSc));
                    GMTrace.o(2640062709760L, 19670);
                  }
                });
              }
            }
            M(true, true);
            GMTrace.o(2571611668480L, 19160);
            return;
          }
          if (bg.nm(this.vTq.getText().toString().trim()))
          {
            M(false, false);
            GMTrace.o(2571611668480L, 19160);
            return;
          }
          M(true, false);
          this.vTv.setText(getString(R.l.dSc));
          if (this.vTJ != null)
          {
            this.vTJ.dismiss();
            this.vTJ = null;
          }
          this.vTq.postDelayed(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(2780454453248L, 20716);
              RegSetInfoUI.a(RegSetInfoUI.this).clearFocus();
              RegSetInfoUI.a(RegSetInfoUI.this).requestFocus();
              GMTrace.o(2780454453248L, 20716);
            }
          }, 50L);
          GMTrace.o(2571611668480L, 19160);
          return;
        }
        if ((paramInt2 == -6) || (paramInt2 == 65225) || (paramInt2 == 65226))
        {
          if (this.vMf == null)
          {
            this.vMf = SecurityImage.a.a(this.vKB.vKW, R.l.dRU, 0, ((com.tencent.mm.modelfriend.x)paramk).HP(), ((com.tencent.mm.modelfriend.x)paramk).HQ(), "", new DialogInterface.OnClickListener()
            {
              public final void onClick(final DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(2663282376704L, 19843);
                paramAnonymousDialogInterface = RegSetInfoUI.b(RegSetInfoUI.this).getText().toString().trim();
                Object localObject1 = RegSetInfoUI.a(RegSetInfoUI.this).getText().toString().trim();
                if ((paramAnonymousDialogInterface == null) || (paramAnonymousDialogInterface.length() <= 0))
                {
                  h.h(RegSetInfoUI.this, R.l.efU, R.l.dRD);
                  GMTrace.o(2663282376704L, 19843);
                  return;
                }
                RegSetInfoUI.this.aLo();
                paramAnonymousInt = RegSetInfoUI.e(RegSetInfoUI.this);
                Object localObject2 = RegSetInfoUI.f(RegSetInfoUI.this);
                at.wS().a(429, RegSetInfoUI.this);
                paramAnonymousDialogInterface = new com.tencent.mm.modelfriend.x((String)localObject2, RegSetInfoUI.g(RegSetInfoUI.this), paramAnonymousInt, paramAnonymousDialogInterface, (String)localObject1, ((com.tencent.mm.modelfriend.x)paramk).HQ(), RegSetInfoUI.C(RegSetInfoUI.this).bZo());
                at.wS().a(paramAnonymousDialogInterface, 0);
                localObject1 = RegSetInfoUI.this;
                localObject2 = RegSetInfoUI.this;
                RegSetInfoUI.this.getString(R.l.cUG);
                RegSetInfoUI.a((RegSetInfoUI)localObject1, h.a((Context)localObject2, RegSetInfoUI.this.getString(R.l.dRT), true, new DialogInterface.OnCancelListener()
                {
                  public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
                  {
                    GMTrace.i(2758308528128L, 20551);
                    at.wS().c(paramAnonymousDialogInterface);
                    at.wS().b(429, RegSetInfoUI.this);
                    GMTrace.o(2758308528128L, 20551);
                  }
                }));
                GMTrace.o(2663282376704L, 19843);
              }
            }, null, new DialogInterface.OnDismissListener()new SecurityImage.b
            {
              public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
              {
                GMTrace.i(2655363530752L, 19784);
                RegSetInfoUI.G(RegSetInfoUI.this);
                GMTrace.o(2655363530752L, 19784);
              }
            }, new SecurityImage.b()
            {
              public final void bYp()
              {
                GMTrace.i(2709990146048L, 20191);
                RegSetInfoUI.this.aLo();
                int i = RegSetInfoUI.e(RegSetInfoUI.this);
                Object localObject = RegSetInfoUI.f(RegSetInfoUI.this);
                at.wS().a(429, RegSetInfoUI.this);
                localObject = new com.tencent.mm.modelfriend.x((String)localObject, RegSetInfoUI.g(RegSetInfoUI.this), i, "", "", ((com.tencent.mm.modelfriend.x)paramk).HQ(), "");
                at.wS().a((k)localObject, 0);
                GMTrace.o(2709990146048L, 20191);
              }
            });
            GMTrace.o(2571611668480L, 19160);
            return;
          }
          this.vMf.a(0, ((com.tencent.mm.modelfriend.x)paramk).HP(), ((com.tencent.mm.modelfriend.x)paramk).HQ(), "");
          GMTrace.o(2571611668480L, 19160);
          return;
        }
        M(true, true);
      }
      if (q(paramInt1, paramInt2, paramString))
      {
        GMTrace.o(2571611668480L, 19160);
        return;
      }
      if (paramInt1 == 8)
      {
        this.vTH = getString(R.l.dwH, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        Toast.makeText(this, this.vTH, 0).show();
        GMTrace.o(2571611668480L, 19160);
        return;
      }
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        Toast.makeText(this, getString(R.l.dwY, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      }
      GMTrace.o(2571611668480L, 19160);
      return;
      label1666:
      continue;
      label1669:
      localObject1 = null;
      bool1 = bool2;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2570806362112L, 19154);
    int i = R.i.cEP;
    GMTrace.o(2570806362112L, 19154);
    return i;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(2570672144384L, 19153);
    w.i("MiroMsg.RegSetInfoUI", "onAcvityResult requestCode:%d, resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    paramIntent = com.tencent.mm.plugin.c.a.hnI.a(this, paramInt1, paramInt2, paramIntent);
    if (paramIntent != null)
    {
      this.vTy.setImageBitmap(paramIntent);
      this.vRY = true;
      this.vTE.setVisibility(0);
    }
    GMTrace.o(2570672144384L, 19153);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2569464184832L, 19144);
    super.onCreate(paramBundle);
    paramBundle = getString(R.l.dSd);
    if (com.tencent.mm.protocal.d.tJF) {
      paramBundle = getString(R.l.app_name) + getString(R.l.cRD);
    }
    sq(paramBundle);
    com.tencent.mm.plugin.c.a.hnI.pu();
    this.vTr = getIntent().getStringExtra("regsetinfo_user");
    this.vTs = getIntent().getStringExtra("regsetinfo_bind_email");
    this.jQv = getIntent().getStringExtra("regsetinfo_ticket");
    this.llG = getIntent().getStringExtra("regsetinfo_pwd");
    this.vTu = getIntent().getStringExtra("regsetinfo_binduin");
    this.vTA = getIntent().getIntExtra("mobile_check_type", 0);
    if (!bg.nm(this.vTu)) {
      this.vTt = com.tencent.mm.a.o.bj(this.vTu);
    }
    this.nvM = getIntent().getExtras().getInt("regsetinfo_ismobile", 0);
    this.vTx = getIntent().getExtras().getBoolean("regsetinfo_isForce", false);
    this.vTz = getIntent().getIntExtra("regsetinfo_NextControl", 3);
    this.vQG = getIntent().getStringExtra("regsession_id");
    MP();
    if (this.nvM == 1)
    {
      com.tencent.mm.plugin.c.b.b(true, at.wN() + "," + getClass().getName() + ",R200_900_phone," + at.eK("R200_900_phone") + ",1");
      com.tencent.mm.plugin.c.b.ny("R200_900_phone");
    }
    for (;;)
    {
      this.vTL = false;
      this.vQt = new com.tencent.mm.pluginsdk.i.a();
      GMTrace.o(2569464184832L, 19144);
      return;
      if (this.nvM == 2)
      {
        com.tencent.mm.plugin.c.b.b(true, at.wN() + "," + getClass().getName() + ",R4_QQ," + at.eK("R4_QQ") + ",1");
        com.tencent.mm.plugin.c.b.ny("R4_QQ");
      }
      else if (this.nvM == 3)
      {
        com.tencent.mm.plugin.c.b.b(true, at.wN() + "," + getClass().getName() + ",R200_900_email," + at.eK("R200_900_email") + ",1");
        com.tencent.mm.plugin.c.b.ny("R200_900_email");
      }
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(2569732620288L, 19146);
    super.onDestroy();
    if (this.nvM == 1) {
      com.tencent.mm.plugin.c.b.b(false, at.wN() + "," + getClass().getName() + ",R200_900_phone," + at.eK("R200_900_phone") + ",2");
    }
    for (;;)
    {
      if (this.vQt != null) {
        this.vQt.close();
      }
      GMTrace.o(2569732620288L, 19146);
      return;
      if (this.nvM == 2) {
        com.tencent.mm.plugin.c.b.b(false, at.wN() + "," + getClass().getName() + ",R4_QQ," + at.eK("R4_QQ") + ",2");
      } else if (this.nvM == 3) {
        com.tencent.mm.plugin.c.b.b(false, at.wN() + "," + getClass().getName() + ",R200_900_email," + at.eK("R200_900_email") + ",2");
      }
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2571880103936L, 19162);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      bci();
      GMTrace.o(2571880103936L, 19162);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(2571880103936L, 19162);
    return bool;
  }
  
  public void onResume()
  {
    GMTrace.i(2569598402560L, 19145);
    super.onResume();
    this.vSI.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(2566645612544L, 19123);
        RegSetInfoUI.i(RegSetInfoUI.this).requestFocus();
        RegSetInfoUI.b(RegSetInfoUI.this).clearFocus();
        GMTrace.o(2566645612544L, 19123);
      }
    }, 500L);
    GMTrace.o(2569598402560L, 19145);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\RegSetInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
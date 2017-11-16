package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelfriend.s;
import com.tencent.mm.modelfriend.t;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;

public class RegByMobileVoiceVerifyUI
  extends MMActivity
  implements e
{
  private String eMW;
  private TextView huP;
  private String oJk;
  private String osl;
  private String vQa;
  private s vST;
  private t vSU;
  private int vSV;
  
  public RegByMobileVoiceVerifyUI()
  {
    GMTrace.i(2635499307008L, 19636);
    this.vSV = 0;
    GMTrace.o(2635499307008L, 19636);
  }
  
  protected final void MP()
  {
    GMTrace.i(2636170395648L, 19641);
    oM(R.l.dai);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(2774012002304L, 20668);
        RegByMobileVoiceVerifyUI.this.aLo();
        RegByMobileVoiceVerifyUI.this.finish();
        GMTrace.o(2774012002304L, 20668);
        return true;
      }
    });
    this.huP = ((TextView)findViewById(R.h.bJF));
    Button localButton = (Button)findViewById(R.h.bhf);
    this.vQa = RegByMobileVoiceVerifySelectUI.Vt(this.eMW);
    this.huP.setText(this.vQa);
    this.oJk = com.tencent.mm.ap.b.kz(this.eMW);
    findViewById(R.h.bKo).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(2698178985984L, 20103);
        RegByMobileVoiceVerifyUI.this.startActivityForResult(new Intent(RegByMobileVoiceVerifyUI.this, RegByMobileVoiceVerifySelectUI.class).putExtra("voice_verify_code", RegByMobileVoiceVerifyUI.a(RegByMobileVoiceVerifyUI.this)), 10000);
        GMTrace.o(2698178985984L, 20103);
      }
    });
    localButton.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(2745557843968L, 20456);
        if ((RegByMobileVoiceVerifyUI.b(RegByMobileVoiceVerifyUI.this) == 0) || (RegByMobileVoiceVerifyUI.b(RegByMobileVoiceVerifyUI.this) == 2) || (RegByMobileVoiceVerifyUI.b(RegByMobileVoiceVerifyUI.this) == 3))
        {
          RegByMobileVoiceVerifyUI.a(RegByMobileVoiceVerifyUI.this, new s(RegByMobileVoiceVerifyUI.c(RegByMobileVoiceVerifyUI.this), RegByMobileVoiceVerifyUI.d(RegByMobileVoiceVerifyUI.this), "", 1, RegByMobileVoiceVerifyUI.a(RegByMobileVoiceVerifyUI.this)));
          at.wS().a(RegByMobileVoiceVerifyUI.e(RegByMobileVoiceVerifyUI.this), 0);
          h.a(RegByMobileVoiceVerifyUI.this, R.l.dag, R.l.cUG, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(2678851633152L, 19959);
              RegByMobileVoiceVerifyUI.this.finish();
              GMTrace.o(2678851633152L, 19959);
            }
          });
          GMTrace.o(2745557843968L, 20456);
          return;
        }
        if ((RegByMobileVoiceVerifyUI.b(RegByMobileVoiceVerifyUI.this) == 4) || (RegByMobileVoiceVerifyUI.b(RegByMobileVoiceVerifyUI.this) == 1))
        {
          RegByMobileVoiceVerifyUI.a(RegByMobileVoiceVerifyUI.this, new t(RegByMobileVoiceVerifyUI.c(RegByMobileVoiceVerifyUI.this), 1, "", 1, RegByMobileVoiceVerifyUI.a(RegByMobileVoiceVerifyUI.this)));
          at.wS().a(RegByMobileVoiceVerifyUI.f(RegByMobileVoiceVerifyUI.this), 0);
          h.a(RegByMobileVoiceVerifyUI.this, R.l.dag, R.l.cUG, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(2745826279424L, 20458);
              RegByMobileVoiceVerifyUI.this.finish();
              GMTrace.o(2745826279424L, 20458);
            }
          });
        }
        GMTrace.o(2745557843968L, 20456);
      }
    });
    GMTrace.o(2636170395648L, 19641);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(2636573048832L, 19644);
    w.i("MicroMsg.RegByMobileVoiceVerifyUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    GMTrace.o(2636573048832L, 19644);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2636438831104L, 19643);
    int i = R.i.cqh;
    GMTrace.o(2636438831104L, 19643);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(2636304613376L, 19642);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 10000)
    {
      if (paramIntent == null)
      {
        GMTrace.o(2636304613376L, 19642);
        return;
      }
      this.vQa = paramIntent.getStringExtra("voice_verify_language");
      this.oJk = paramIntent.getStringExtra("voice_verify_code");
      this.huP.setText(this.vQa);
    }
    GMTrace.o(2636304613376L, 19642);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2635633524736L, 19637);
    super.onCreate(paramBundle);
    this.eMW = getIntent().getExtras().getString("bindmcontact_mobile");
    this.vSV = getIntent().getExtras().getInt("voice_verify_type");
    if ((this.vSV == 0) || (this.vSV == 2) || (this.vSV == 3)) {
      at.wS().a(145, this);
    }
    for (;;)
    {
      this.osl = com.tencent.mm.plugin.c.b.Qu();
      MP();
      GMTrace.o(2635633524736L, 19637);
      return;
      if ((this.vSV == 4) || (this.vSV == 1)) {
        at.wS().a(132, this);
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(2635901960192L, 19639);
    super.onDestroy();
    at.wS().b(132, this);
    at.wS().b(145, this);
    if ((this.vSV == 0) || (this.vSV == 2) || (this.vSV == 3)) {
      com.tencent.mm.plugin.c.b.b(false, at.wN() + "," + getClass().getName() + ",R200_500," + at.eK("R200_500") + ",2");
    }
    GMTrace.o(2635901960192L, 19639);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2636036177920L, 19640);
    if (paramInt == 4)
    {
      com.tencent.mm.plugin.c.b.nz(this.osl);
      aLo();
      finish();
      GMTrace.o(2636036177920L, 19640);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(2636036177920L, 19640);
    return bool;
  }
  
  protected void onResume()
  {
    GMTrace.i(2635767742464L, 19638);
    super.onResume();
    if ((this.vSV == 0) || (this.vSV == 2) || (this.vSV == 3))
    {
      com.tencent.mm.plugin.c.b.b(true, at.wN() + "," + getClass().getName() + ",R200_500," + at.eK("R200_500") + ",1");
      com.tencent.mm.plugin.c.b.ny("R200_500");
    }
    GMTrace.o(2635767742464L, 19638);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\RegByMobileVoiceVerifyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
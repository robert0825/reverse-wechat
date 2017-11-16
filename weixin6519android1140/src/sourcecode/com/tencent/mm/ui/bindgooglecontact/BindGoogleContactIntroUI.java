package com.tencent.mm.ui.bindgooglecontact;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.an.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public class BindGoogleContactIntroUI
  extends MMActivity
  implements e
{
  private int ipN;
  private ProgressDialog kgz;
  private ImageView wlF;
  private TextView wlG;
  private Button wlH;
  private Button wlI;
  private boolean wlJ;
  private boolean wlK;
  private String wlL;
  private a wlM;
  private View.OnClickListener wlN;
  private View.OnClickListener wlO;
  
  public BindGoogleContactIntroUI()
  {
    GMTrace.i(1674500374528L, 12476);
    this.wlJ = false;
    this.wlK = false;
    this.wlN = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1676379422720L, 12490);
        paramAnonymousView = new Intent(BindGoogleContactIntroUI.this, BindGoogleContactUI.class);
        paramAnonymousView.putExtra("enter_scene", BindGoogleContactIntroUI.a(BindGoogleContactIntroUI.this));
        BindGoogleContactIntroUI.this.startActivity(paramAnonymousView);
        GMTrace.o(1676379422720L, 12490);
      }
    };
    this.wlO = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1676782075904L, 12493);
        h.a(BindGoogleContactIntroUI.this.vKB.vKW, true, BindGoogleContactIntroUI.this.getString(R.l.eeS), "", BindGoogleContactIntroUI.this.getString(R.l.eeR), BindGoogleContactIntroUI.this.getString(R.l.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(1677318946816L, 12497);
            BindGoogleContactIntroUI.b(BindGoogleContactIntroUI.this);
            GMTrace.o(1677318946816L, 12497);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(1662689214464L, 12388);
            GMTrace.o(1662689214464L, 12388);
          }
        });
        GMTrace.o(1676782075904L, 12493);
      }
    };
    GMTrace.o(1674500374528L, 12476);
  }
  
  private void cbd()
  {
    GMTrace.i(1675439898624L, 12483);
    this.wlI.setVisibility(8);
    this.wlH.setVisibility(0);
    this.wlF.setVisibility(0);
    this.wlG.setVisibility(0);
    this.wlG.setText(R.l.cYY);
    this.wlH.setText(R.l.cYW);
    this.wlH.setOnClickListener(this.wlN);
    GMTrace.o(1675439898624L, 12483);
  }
  
  protected final void MP()
  {
    GMTrace.i(1675305680896L, 12482);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(1681882349568L, 12531);
        BindGoogleContactIntroUI.this.finish();
        GMTrace.o(1681882349568L, 12531);
        return true;
      }
    });
    this.wlF = ((ImageView)findViewById(R.h.ccA));
    this.wlG = ((TextView)findViewById(R.h.ccB));
    this.wlH = ((Button)findViewById(R.h.ccz));
    this.wlI = ((Button)findViewById(R.h.ccO));
    GMTrace.o(1675305680896L, 12482);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(1675708334080L, 12485);
    paramk = paramString;
    if (TextUtils.isEmpty(paramString)) {
      paramk = "";
    }
    w.i("MicroMsg.GoogleContact.BindGoogleContactIntroUI", "[onSceneEnd] errType:%d,errCode:%d,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramk });
    if ((this.kgz != null) && (this.kgz.isShowing())) {
      this.kgz.dismiss();
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      at.AR();
      c.xh().set(208903, "");
      at.AR();
      c.xh().set(208901, "");
      at.AR();
      c.xh().set(208902, "");
      at.AR();
      c.xh().set(208905, Boolean.valueOf(true));
      at.AR();
      c.xh().kL(true);
      cbd();
      h.bm(this, getString(R.l.eeT));
      GMTrace.o(1675708334080L, 12485);
      return;
    }
    w.i("MicroMsg.GoogleContact.BindGoogleContactIntroUI", "unbind failed");
    Toast.makeText(this, R.l.dBh, 0).show();
    GMTrace.o(1675708334080L, 12485);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(1674634592256L, 12477);
    int i = R.i.cqa;
    GMTrace.o(1674634592256L, 12477);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(1675574116352L, 12484);
    w.i("MicroMsg.GoogleContact.BindGoogleContactIntroUI", "requestCode:%d, resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt2 == -1)
    {
      if (paramInt1 == 2005)
      {
        this.wlJ = paramIntent.getBooleanExtra("gpservices", false);
        GMTrace.o(1675574116352L, 12484);
      }
    }
    else if (paramInt1 == 2005) {
      this.wlJ = paramIntent.getBooleanExtra("gpservices", false);
    }
    GMTrace.o(1675574116352L, 12484);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1674768809984L, 12478);
    super.onCreate(paramBundle);
    oM(R.l.cYZ);
    this.ipN = getIntent().getIntExtra("enter_scene", 0);
    this.wlJ = com.tencent.mm.modelfriend.n.bd(this);
    if (this.wlJ) {
      startActivityForResult(new Intent("com.tencent.mm.gms.CHECK_GP_SERVICES"), 2005);
    }
    GMTrace.o(1674768809984L, 12478);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(1675171463168L, 12481);
    super.onDestroy();
    GMTrace.o(1675171463168L, 12481);
  }
  
  protected void onResume()
  {
    GMTrace.i(1674903027712L, 12479);
    super.onResume();
    at.AR();
    this.wlL = ((String)c.xh().get(208903, null));
    if (TextUtils.isEmpty(this.wlL))
    {
      this.wlK = false;
      MP();
      if (!this.wlK) {
        break label148;
      }
      this.wlI.setVisibility(0);
      this.wlH.setVisibility(8);
      this.wlG.setVisibility(0);
      this.wlG.setText(getString(R.l.cYX, new Object[] { this.wlL }));
      this.wlI.setOnClickListener(this.wlO);
    }
    for (;;)
    {
      at.wS().a(487, this);
      GMTrace.o(1674903027712L, 12479);
      return;
      this.wlK = true;
      break;
      label148:
      cbd();
    }
  }
  
  protected void onStop()
  {
    GMTrace.i(1675037245440L, 12480);
    super.onStop();
    at.wS().b(487, this);
    GMTrace.o(1675037245440L, 12480);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\ui\bindgooglecontact\BindGoogleContactIntroUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
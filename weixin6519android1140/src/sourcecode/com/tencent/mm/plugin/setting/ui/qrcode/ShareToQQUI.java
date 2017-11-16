package com.tencent.mm.plugin.setting.ui.qrcode;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelsimple.ac;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.account.FacebookAuthUI;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.MMEditText.c;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;

public class ShareToQQUI
  extends MMActivity
  implements e
{
  private ProgressDialog htG;
  private EditText nUE;
  private TextView oGq;
  private int oGr;
  private boolean oGs;
  
  public ShareToQQUI()
  {
    GMTrace.i(4733456613376L, 35267);
    this.htG = null;
    this.oGs = false;
    GMTrace.o(4733456613376L, 35267);
  }
  
  protected final void MP()
  {
    GMTrace.i(4733993484288L, 35271);
    oM(R.l.dXB);
    this.nUE = ((EditText)findViewById(R.h.content));
    this.oGq = ((TextView)findViewById(R.h.coE));
    this.nUE.addTextChangedListener(new MMEditText.c(this.nUE, this.oGq, 280));
    this.oGr = getIntent().getIntExtra("show_to", 2);
    if (this.oGr == 4) {
      this.nUE.setText(R.l.dXk);
    }
    for (;;)
    {
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(4729161646080L, 35235);
          ShareToQQUI.this.aLo();
          ShareToQQUI.this.finish();
          GMTrace.o(4729161646080L, 35235);
          return true;
        }
      });
      a(0, getString(R.l.cUw), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(final MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(4733322395648L, 35266);
          ShareToQQUI.a(ShareToQQUI.this);
          boolean bool1;
          boolean bool2;
          if ((ShareToQQUI.b(ShareToQQUI.this) == 2) || (ShareToQQUI.b(ShareToQQUI.this) == 1))
          {
            paramAnonymousMenuItem = ShareToQQUI.c(ShareToQQUI.this).getText().toString();
            if (ShareToQQUI.b(ShareToQQUI.this) == 1)
            {
              bool1 = true;
              if (ShareToQQUI.b(ShareToQQUI.this) != 2) {
                break label173;
              }
              bool2 = true;
            }
          }
          label78:
          for (paramAnonymousMenuItem = new ac(paramAnonymousMenuItem, bool1, bool2);; paramAnonymousMenuItem = new ac(ShareToQQUI.c(ShareToQQUI.this).getText().toString()))
          {
            at.wS().a(paramAnonymousMenuItem, 0);
            Object localObject = ShareToQQUI.this;
            ActionBarActivity localActionBarActivity = ShareToQQUI.this.vKB.vKW;
            ShareToQQUI.this.getString(R.l.cUG);
            ShareToQQUI.a((ShareToQQUI)localObject, com.tencent.mm.ui.base.h.a(localActionBarActivity, ShareToQQUI.this.getString(R.l.dIe), true, new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
              {
                GMTrace.i(4728624775168L, 35231);
                at.wS().c(paramAnonymousMenuItem);
                GMTrace.o(4728624775168L, 35231);
              }
            }));
            GMTrace.o(4733322395648L, 35266);
            return true;
            bool1 = false;
            break;
            label173:
            bool2 = false;
            break label78;
            if (ShareToQQUI.b(ShareToQQUI.this) != 4) {
              break label310;
            }
            at.AR();
            long l = bg.c((Long)com.tencent.mm.y.c.xh().get(65831, null));
            at.AR();
            paramAnonymousMenuItem = bg.nl((String)com.tencent.mm.y.c.xh().get(65830, null));
            if ((bg.aH(l) > 86400000L) && (paramAnonymousMenuItem.length() > 0))
            {
              localObject = new com.tencent.mm.ui.g.a.c("290293790992170");
              ((com.tencent.mm.ui.g.a.c)localObject).WG(paramAnonymousMenuItem);
              new com.tencent.mm.ui.account.h((com.tencent.mm.ui.g.a.c)localObject, new com.tencent.mm.z.a()
              {
                public final void m(Bundle paramAnonymous2Bundle)
                {
                  GMTrace.i(4732919742464L, 35263);
                  super.m(paramAnonymous2Bundle);
                  GMTrace.o(4732919742464L, 35263);
                }
                
                public final void onError(int paramAnonymous2Int, String paramAnonymous2String)
                {
                  GMTrace.i(4733053960192L, 35264);
                  super.onError(paramAnonymous2Int, paramAnonymous2String);
                  GMTrace.o(4733053960192L, 35264);
                }
              }).bYB();
            }
          }
          label310:
          com.tencent.mm.ui.base.h.h(ShareToQQUI.this.vKB.vKW, R.l.ecz, R.l.cUG);
          GMTrace.o(4733322395648L, 35266);
          return true;
        }
      });
      GMTrace.o(4733993484288L, 35271);
      return;
      this.nUE.setText(R.l.dXm);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(4734127702016L, 35272);
    w.i("MicroMsg.ShareToQQUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (paramk.getType() != 26)
    {
      GMTrace.o(4734127702016L, 35272);
      return;
    }
    if (this.htG != null)
    {
      this.htG.dismiss();
      this.htG = null;
    }
    if ((paramInt1 == 4) && (paramInt2 == -68))
    {
      paramk = paramString;
      if (bg.nm(paramString)) {
        paramk = "error";
      }
      com.tencent.mm.ui.base.h.a(this, paramk, getString(R.l.cUG), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(4728356339712L, 35229);
          paramAnonymousDialogInterface = new Intent(ShareToQQUI.this.vKB.vKW, FacebookAuthUI.class);
          paramAnonymousDialogInterface.putExtra("is_force_unbind", true);
          ShareToQQUI.this.vKB.vKW.startActivity(paramAnonymousDialogInterface);
          ShareToQQUI.this.aLo();
          ShareToQQUI.this.finish();
          GMTrace.o(4728356339712L, 35229);
        }
      }, null);
      GMTrace.o(4734127702016L, 35272);
      return;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      aLo();
      paramString = getString(R.l.ecB);
      new DialogInterface.OnDismissListener()
      {
        public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(4732651307008L, 35261);
          ShareToQQUI.this.finish();
          GMTrace.o(4732651307008L, 35261);
        }
      };
      com.tencent.mm.ui.base.h.bm(this, paramString);
      GMTrace.o(4734127702016L, 35272);
      return;
    }
    this.oGs = false;
    if (com.tencent.mm.plugin.setting.a.hnI.a(this.vKB.vKW, paramInt1, paramInt2, paramString))
    {
      GMTrace.o(4734127702016L, 35272);
      return;
    }
    Toast.makeText(this, getString(R.l.ecA, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
    GMTrace.o(4734127702016L, 35272);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(4733590831104L, 35268);
    int i = R.i.cuw;
    GMTrace.o(4733590831104L, 35268);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4733725048832L, 35269);
    super.onCreate(paramBundle);
    at.wS().a(26, this);
    MP();
    if (q.Af())
    {
      paramBundle = new com.tencent.mm.ui.g.a.c("290293790992170");
      at.AR();
      paramBundle.WG(bg.nl((String)com.tencent.mm.y.c.xh().get(65830, null)));
      new com.tencent.mm.ui.account.h(paramBundle, new com.tencent.mm.z.a()
      {
        public final void m(Bundle paramAnonymousBundle)
        {
          GMTrace.i(4731443347456L, 35252);
          super.m(paramAnonymousBundle);
          GMTrace.o(4731443347456L, 35252);
        }
        
        public final void onError(int paramAnonymousInt, String paramAnonymousString)
        {
          GMTrace.i(4731577565184L, 35253);
          super.onError(paramAnonymousInt, paramAnonymousString);
          if (paramAnonymousInt == 3) {
            ShareToQQUI.d(ShareToQQUI.this);
          }
          GMTrace.o(4731577565184L, 35253);
        }
      }).bYB();
    }
    GMTrace.o(4733725048832L, 35269);
  }
  
  public void onDestroy()
  {
    GMTrace.i(4733859266560L, 35270);
    at.wS().b(26, this);
    super.onDestroy();
    GMTrace.o(4733859266560L, 35270);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\qrcode\ShareToQQUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
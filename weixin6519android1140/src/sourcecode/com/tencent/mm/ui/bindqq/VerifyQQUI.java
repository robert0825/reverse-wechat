package com.tencent.mm.ui.bindqq;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.v;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.g.a.hl;
import com.tencent.mm.g.a.hl.b;
import com.tencent.mm.g.a.hm;
import com.tencent.mm.g.a.hm.a;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.protocal.c.go;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.applet.SecurityImage.b;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;

public class VerifyQQUI
  extends MMWizardActivity
  implements e
{
  private String eKL;
  private String eKN;
  private byte[] gso;
  private r hsU;
  private String riF;
  private SecurityImage vMf;
  private long wop;
  private String woq;
  private String wor;
  
  public VerifyQQUI()
  {
    GMTrace.i(1895154319360L, 14120);
    this.hsU = null;
    this.wop = 0L;
    this.riF = "";
    this.gso = null;
    this.woq = "";
    this.vMf = null;
    GMTrace.o(1895154319360L, 14120);
  }
  
  protected final void MP()
  {
    GMTrace.i(1895959625728L, 14126);
    final Object localObject = new hl();
    ((hl)localObject).eKJ.context = this;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    this.eKL = ((hl)localObject).eKK.eKL;
    localObject = new hm();
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    this.eKN = ((hm)localObject).eKM.eKN;
    oM(R.l.daz);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(1893543706624L, 14108);
        VerifyQQUI.this.aLo();
        VerifyQQUI.a(VerifyQQUI.this);
        GMTrace.o(1893543706624L, 14108);
        return true;
      }
    });
    localObject = (EditText)findViewById(R.h.bhi);
    final EditText localEditText = (EditText)findViewById(R.h.bhh);
    a(0, getString(R.l.cTh), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(final MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(1893812142080L, 14110);
        paramAnonymousMenuItem = localObject.getText().toString().trim();
        VerifyQQUI.a(VerifyQQUI.this, localEditText.getText().toString().trim());
        try
        {
          VerifyQQUI.a(VerifyQQUI.this, Long.parseLong(paramAnonymousMenuItem));
          if (VerifyQQUI.b(VerifyQQUI.this) < 10000L)
          {
            h.h(VerifyQQUI.this.vKB.vKW, R.l.dav, R.l.dat);
            GMTrace.o(1893812142080L, 14110);
            return true;
          }
        }
        catch (Exception paramAnonymousMenuItem)
        {
          h.h(VerifyQQUI.this.vKB.vKW, R.l.dav, R.l.dat);
          GMTrace.o(1893812142080L, 14110);
          return true;
        }
        if (VerifyQQUI.c(VerifyQQUI.this).equals(""))
        {
          h.h(VerifyQQUI.this.vKB.vKW, R.l.dau, R.l.dat);
          GMTrace.o(1893812142080L, 14110);
          return true;
        }
        VerifyQQUI.this.aLo();
        paramAnonymousMenuItem = new com.tencent.mm.ae.a(VerifyQQUI.b(VerifyQQUI.this), VerifyQQUI.c(VerifyQQUI.this), "", "", "", VerifyQQUI.d(VerifyQQUI.this), VerifyQQUI.e(VerifyQQUI.this), false);
        at.wS().a(paramAnonymousMenuItem, 0);
        VerifyQQUI localVerifyQQUI = VerifyQQUI.this;
        ActionBarActivity localActionBarActivity = VerifyQQUI.this.vKB.vKW;
        VerifyQQUI.this.getString(R.l.dax);
        VerifyQQUI.a(localVerifyQQUI, h.a(localActionBarActivity, VerifyQQUI.this.getString(R.l.dao), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
          {
            GMTrace.i(1895020101632L, 14119);
            at.wS().c(paramAnonymousMenuItem);
            GMTrace.o(1895020101632L, 14119);
          }
        }));
        GMTrace.o(1893812142080L, 14110);
        return true;
      }
    });
    GMTrace.o(1895959625728L, 14126);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(1896093843456L, 14127);
    w.i("MicroMsg.VerifyQQUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.hsU != null)
    {
      this.hsU.dismiss();
      this.hsU = null;
    }
    com.tencent.mm.ae.a locala = (com.tencent.mm.ae.a)paramk;
    byte[] arrayOfByte = at.AO().Y(locala.gvv);
    w.i("MicroMsg.NetSceneBindQQ", "getRespImgBuf getWtloginMgr getVerifyImg:%d  uin:%d", new Object[] { Integer.valueOf(bg.i(arrayOfByte, new byte[0]).length), Long.valueOf(locala.gvv) });
    if (bg.bq(arrayOfByte)) {
      arrayOfByte = com.tencent.mm.platformtools.n.a(((go)locala.fUa.gtD.gtK).tQa);
    }
    for (;;)
    {
      this.gso = arrayOfByte;
      this.woq = ((go)((com.tencent.mm.ae.a)paramk).fUa.gtD.gtK).tVe;
      if (this.gso != null) {
        w.d("MicroMsg.VerifyQQUI", "imgSid:" + this.woq + " img len" + this.gso.length + " " + g.tC());
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        com.tencent.mm.plugin.c.a.hnI.pr();
        h.a(this.vKB.vKW, R.l.daw, R.l.dax, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(1890993569792L, 14089);
            VerifyQQUI.f(VerifyQQUI.this);
            GMTrace.o(1890993569792L, 14089);
          }
        });
        GMTrace.o(1896093843456L, 14127);
        return;
      }
      int i;
      if (paramInt1 == 4) {
        switch (paramInt2)
        {
        default: 
          paramString = com.tencent.mm.h.a.dH(paramString);
          if (paramString != null)
          {
            paramString.a(this, null, null);
            i = 1;
          }
          break;
        }
      }
      while (i != 0)
      {
        GMTrace.o(1896093843456L, 14127);
        return;
        paramString = com.tencent.mm.h.a.dH(paramString);
        if (paramString != null)
        {
          paramString.a(this, null, null);
          i = 1;
        }
        else
        {
          h.h(this.vKB.vKW, R.l.day, R.l.dat);
          i = 1;
          continue;
          h.h(this.vKB.vKW, R.l.dap, R.l.dat);
          i = 1;
          continue;
          h.h(this.vKB.vKW, R.l.das, R.l.cUG);
          i = 1;
          continue;
          h.h(this.vKB.vKW, R.l.daq, R.l.cUG);
          i = 1;
          continue;
          w.d("MicroMsg.VerifyQQUI", "imgSid:" + this.woq + " img len" + this.gso.length + " " + g.tC());
          if (!at.AU())
          {
            i = 1;
          }
          else
          {
            if (this.vMf == null) {
              this.vMf = SecurityImage.a.a(this.vKB.vKW, R.l.dRU, 0, this.gso, this.woq, this.wor, new DialogInterface.OnClickListener()
              {
                public final void onClick(final DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  GMTrace.i(1898912415744L, 14148);
                  paramAnonymousDialogInterface = new com.tencent.mm.ae.a(VerifyQQUI.b(VerifyQQUI.this), VerifyQQUI.c(VerifyQQUI.this), VerifyQQUI.g(VerifyQQUI.this).vRa, VerifyQQUI.g(VerifyQQUI.this).bZo(), VerifyQQUI.g(VerifyQQUI.this).vRb, VerifyQQUI.d(VerifyQQUI.this), VerifyQQUI.e(VerifyQQUI.this), true);
                  at.wS().a(paramAnonymousDialogInterface, 0);
                  VerifyQQUI localVerifyQQUI = VerifyQQUI.this;
                  ActionBarActivity localActionBarActivity = VerifyQQUI.this.vKB.vKW;
                  VerifyQQUI.this.getString(R.l.dax);
                  VerifyQQUI.a(localVerifyQQUI, h.a(localActionBarActivity, VerifyQQUI.this.getString(R.l.dao), true, new DialogInterface.OnCancelListener()
                  {
                    public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
                    {
                      GMTrace.i(1890188263424L, 14083);
                      at.wS().c(paramAnonymousDialogInterface);
                      GMTrace.o(1890188263424L, 14083);
                    }
                  }));
                  GMTrace.o(1898912415744L, 14148);
                }
              }, null, new DialogInterface.OnDismissListener()new a
              {
                public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
                {
                  GMTrace.i(1891262005248L, 14091);
                  VerifyQQUI.h(VerifyQQUI.this);
                  GMTrace.o(1891262005248L, 14091);
                }
              }, new a());
            }
            for (;;)
            {
              i = 1;
              break;
              w.d("MicroMsg.VerifyQQUI", "imgSid:" + this.woq + " img len" + this.gso.length + " " + g.tC());
              this.vMf.a(0, this.gso, this.woq, this.wor);
            }
            h.h(this.vKB.vKW, R.l.dar, R.l.cUG);
            i = 1;
            continue;
            i = 0;
          }
        }
      }
      Toast.makeText(this, getString(R.l.dws, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      GMTrace.o(1896093843456L, 14127);
      return;
    }
  }
  
  public final boolean bEg()
  {
    GMTrace.i(1895825408000L, 14125);
    aLo();
    finish();
    GMTrace.o(1895825408000L, 14125);
    return true;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(1895691190272L, 14124);
    int i = R.i.cqj;
    GMTrace.o(1895691190272L, 14124);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1895288537088L, 14121);
    super.onCreate(paramBundle);
    at.wS().a(144, this);
    GMTrace.o(1895288537088L, 14121);
  }
  
  public void onDestroy()
  {
    GMTrace.i(1895422754816L, 14122);
    super.onDestroy();
    at.wS().b(144, this);
    GMTrace.o(1895422754816L, 14122);
  }
  
  protected void onResume()
  {
    GMTrace.i(1895556972544L, 14123);
    super.onResume();
    MP();
    GMTrace.o(1895556972544L, 14123);
  }
  
  final class a
    extends SecurityImage.b
  {
    a()
    {
      GMTrace.i(1897972891648L, 14141);
      GMTrace.o(1897972891648L, 14141);
    }
    
    public final void bYp()
    {
      GMTrace.i(1898107109376L, 14142);
      com.tencent.mm.ae.a locala = new com.tencent.mm.ae.a(VerifyQQUI.b(VerifyQQUI.this), VerifyQQUI.c(VerifyQQUI.this), VerifyQQUI.i(VerifyQQUI.this), "", VerifyQQUI.j(VerifyQQUI.this), 2, true);
      at.wS().a(locala, 0);
      GMTrace.o(1898107109376L, 14142);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\bindqq\VerifyQQUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
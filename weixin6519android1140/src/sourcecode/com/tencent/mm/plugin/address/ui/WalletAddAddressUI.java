package com.tencent.mm.plugin.address.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract.Contacts;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.modelgeo.Addr;
import com.tencent.mm.plugin.address.d.b;
import com.tencent.mm.plugin.address.model.RcptItem;
import com.tencent.mm.plugin.address.model.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.y.at;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class WalletAddAddressUI
  extends MMActivity
  implements e, AddrEditView.b
{
  private String eQO;
  private int huL;
  private Dialog hul;
  private AddrEditView hwl;
  private AddrEditView hwm;
  private AddrEditView hwn;
  private AddrEditView hwo;
  private AddrEditView hwp;
  private b hwq;
  private b hwr;
  
  public WalletAddAddressUI()
  {
    GMTrace.i(12812961185792L, 95464);
    this.huL = 0;
    this.hwq = null;
    this.hwr = new b();
    this.hul = null;
    this.eQO = "";
    GMTrace.o(12812961185792L, 95464);
  }
  
  private boolean QS()
  {
    boolean bool2 = false;
    GMTrace.i(12813900709888L, 95471);
    boolean bool1 = true;
    if (!this.hwl.QW()) {
      bool1 = false;
    }
    if (!this.hwn.QW()) {
      bool1 = false;
    }
    if (!this.hwm.QW()) {
      bool1 = false;
    }
    if (!this.hwo.QW()) {
      bool1 = false;
    }
    if (!this.hwp.QW()) {
      bool1 = bool2;
    }
    for (;;)
    {
      lf(bool1);
      GMTrace.o(12813900709888L, 95471);
      return bool1;
    }
  }
  
  private void QU()
  {
    int k = 1;
    GMTrace.i(12814303363072L, 95474);
    int j = R.l.cQM;
    if (this.huL == 0) {
      j = R.l.cQL;
    }
    if (this.hwl.QX()) {}
    for (int i = 1;; i = 0)
    {
      if (this.hwn.QX()) {
        i = 1;
      }
      if (this.hwm.QX()) {
        i = 1;
      }
      if (this.hwo.QX()) {
        i = 1;
      }
      if (this.hwp.QX()) {
        i = k;
      }
      for (;;)
      {
        if (i != 0)
        {
          h.a(this, j, R.l.cUG, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(12797257711616L, 95347);
              WalletAddAddressUI.this.setResult(0);
              WalletAddAddressUI.this.finish();
              GMTrace.o(12797257711616L, 95347);
            }
          }, null);
          GMTrace.o(12814303363072L, 95474);
          return;
        }
        setResult(0);
        finish();
        GMTrace.o(12814303363072L, 95474);
        return;
      }
    }
  }
  
  private void Ra()
  {
    GMTrace.i(12814437580800L, 95475);
    startActivityForResult(new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI), 2);
    GMTrace.o(12814437580800L, 95475);
  }
  
  private void Rb()
  {
    GMTrace.i(12814571798528L, 95476);
    StringBuilder localStringBuilder = new StringBuilder();
    if (!TextUtils.isEmpty(this.hwm.getText())) {
      localStringBuilder.append(this.hwm.getText());
    }
    if (!TextUtils.isEmpty(this.hwn.getText())) {
      localStringBuilder.append(this.hwn.getText());
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("wallet_address", localStringBuilder.toString());
    localIntent.putExtra("map_view_type", 8);
    d.b(this, "location", ".ui.RedirectUI", localIntent, 3);
    GMTrace.o(12814571798528L, 95476);
  }
  
  private static void a(b paramb1, b paramb2)
  {
    GMTrace.i(12814706016256L, 95477);
    if ((paramb1 != null) && (paramb2 != null))
    {
      paramb2.id = paramb1.id;
      paramb2.huD = paramb1.huD;
      paramb2.huE = paramb1.huE;
      paramb2.huF = paramb1.huF;
      paramb2.huH = paramb1.huH;
      paramb2.huI = paramb1.huI;
      paramb2.huJ = paramb1.huJ;
      paramb2.huG = paramb1.huG;
      paramb2.huK = paramb1.huK;
    }
    GMTrace.o(12814706016256L, 95477);
  }
  
  public final void MP()
  {
    GMTrace.i(12813229621248L, 95466);
    com.tencent.mm.plugin.address.a.a.QO().QP();
    Object localObject = (MMScrollView)findViewById(R.h.cnx);
    ((MMScrollView)localObject).a((ViewGroup)localObject, (View.OnFocusChangeListener)localObject);
    this.hwl = ((AddrEditView)findViewById(R.h.bcZ));
    this.hwm = ((AddrEditView)findViewById(R.h.bcV));
    this.hwn = ((AddrEditView)findViewById(R.h.bcW));
    this.hwo = ((AddrEditView)findViewById(R.h.bdg));
    this.hwp = ((AddrEditView)findViewById(R.h.bdb));
    this.hwl.hvg = this;
    this.hwm.hvg = this;
    this.hwn.hvg = this;
    this.hwo.hvg = this;
    this.hwp.hvg = this;
    this.hwl.hvf = new AddrEditView.a()
    {
      public final void onClick()
      {
        GMTrace.i(12810947919872L, 95449);
        boolean bool = com.tencent.mm.pluginsdk.h.a.a(WalletAddAddressUI.this, "android.permission.READ_CONTACTS", 48, null, null);
        w.i("MicroMsg.WalletAddAddressUI", "summerper checkPermission checkContacts[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW() });
        if (!bool)
        {
          GMTrace.o(12810947919872L, 95449);
          return;
        }
        WalletAddAddressUI.a(WalletAddAddressUI.this);
        GMTrace.o(12810947919872L, 95449);
      }
    };
    this.hwm.hvf = new AddrEditView.a()
    {
      public final void onClick()
      {
        GMTrace.i(12817390370816L, 95497);
        boolean bool = com.tencent.mm.pluginsdk.h.a.a(WalletAddAddressUI.this, "android.permission.ACCESS_COARSE_LOCATION", 64, null, null);
        w.i("MicroMsg.WalletAddAddressUI", "summerper checkPermission checkLocation[%b]", new Object[] { Boolean.valueOf(bool) });
        if (!bool)
        {
          GMTrace.o(12817390370816L, 95497);
          return;
        }
        WalletAddAddressUI.b(WalletAddAddressUI.this);
        GMTrace.o(12817390370816L, 95497);
      }
    };
    this.hwm.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12812558532608L, 95461);
        WalletAddAddressUI.c(WalletAddAddressUI.this);
        GMTrace.o(12812558532608L, 95461);
      }
    });
    if (this.huL != 0)
    {
      this.hwq = com.tencent.mm.plugin.address.a.a.QO().hM(this.huL);
      this.hwl.nG(this.hwq.huI);
      localObject = new StringBuilder();
      if (!TextUtils.isEmpty(this.hwq.huD)) {
        ((StringBuilder)localObject).append(this.hwq.huD);
      }
      if (!TextUtils.isEmpty(this.hwq.huE))
      {
        ((StringBuilder)localObject).append(" ");
        ((StringBuilder)localObject).append(this.hwq.huE);
      }
      if (!TextUtils.isEmpty(this.hwq.huF))
      {
        ((StringBuilder)localObject).append(" ");
        ((StringBuilder)localObject).append(this.hwq.huF);
      }
      this.hwm.nG(((StringBuilder)localObject).toString());
      this.hwn.nG(this.hwq.huH);
      this.hwo.nG(this.hwq.huG);
      this.hwp.nG(this.hwq.huJ);
    }
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12796989276160L, 95345);
        WalletAddAddressUI.d(WalletAddAddressUI.this);
        GMTrace.o(12796989276160L, 95345);
        return true;
      }
    });
    a(0, getString(R.l.cUp), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12811753226240L, 95455);
        if (!WalletAddAddressUI.e(WalletAddAddressUI.this))
        {
          GMTrace.o(12811753226240L, 95455);
          return true;
        }
        Object localObject;
        String str1;
        String str2;
        String str3;
        if (WalletAddAddressUI.f(WalletAddAddressUI.this) != 0)
        {
          WalletAddAddressUI.a(WalletAddAddressUI.this, com.tencent.mm.plugin.address.a.a.QO().hM(WalletAddAddressUI.f(WalletAddAddressUI.this)));
          w.d("MicroMsg.WalletAddAddressUI", "get addr " + WalletAddAddressUI.g(WalletAddAddressUI.this).toString());
          WalletAddAddressUI.b(WalletAddAddressUI.g(WalletAddAddressUI.this), WalletAddAddressUI.h(WalletAddAddressUI.this));
          paramAnonymousMenuItem = WalletAddAddressUI.i(WalletAddAddressUI.this).getText();
          localObject = WalletAddAddressUI.j(WalletAddAddressUI.this).getText();
          str1 = WalletAddAddressUI.k(WalletAddAddressUI.this).getText();
          str2 = WalletAddAddressUI.l(WalletAddAddressUI.this).getText();
          str3 = WalletAddAddressUI.m(WalletAddAddressUI.this).getText();
          localObject = ((String)localObject).split(" ");
          if (localObject.length > 0) {
            WalletAddAddressUI.h(WalletAddAddressUI.this).huD = localObject[0];
          }
          if (localObject.length >= 2) {
            WalletAddAddressUI.h(WalletAddAddressUI.this).huE = localObject[1];
          }
          if (localObject.length < 3) {
            break label344;
          }
        }
        label344:
        for (WalletAddAddressUI.h(WalletAddAddressUI.this).huF = localObject[2];; WalletAddAddressUI.h(WalletAddAddressUI.this).huF = "")
        {
          WalletAddAddressUI.h(WalletAddAddressUI.this).huH = str1;
          WalletAddAddressUI.h(WalletAddAddressUI.this).huI = paramAnonymousMenuItem;
          WalletAddAddressUI.h(WalletAddAddressUI.this).huJ = str3;
          WalletAddAddressUI.h(WalletAddAddressUI.this).huG = str2;
          if (!bg.nm(WalletAddAddressUI.n(WalletAddAddressUI.this))) {
            WalletAddAddressUI.h(WalletAddAddressUI.this).huK = WalletAddAddressUI.n(WalletAddAddressUI.this);
          }
          WalletAddAddressUI.o(WalletAddAddressUI.this);
          GMTrace.o(12811753226240L, 95455);
          return true;
          WalletAddAddressUI.a(WalletAddAddressUI.this, new b());
          break;
        }
      }
    }, p.b.vLG);
    QS();
    GMTrace.o(12813229621248L, 95466);
  }
  
  public final void QT()
  {
    GMTrace.i(12814034927616L, 95472);
    QS();
    GMTrace.o(12814034927616L, 95472);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(12813766492160L, 95470);
    if (this.hul != null) {
      this.hul.dismiss();
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = com.tencent.mm.plugin.address.a.a.QO().hut;
      if (paramString.huB.size() > 0)
      {
        a(this.hwr, this.hwq);
        paramString = (b)paramString.huB.getFirst();
        if (paramString != null) {
          setResult(-1, com.tencent.mm.plugin.address.e.a.b(paramString));
        }
      }
      for (;;)
      {
        finish();
        GMTrace.o(12813766492160L, 95470);
        return;
        setResult(0);
        continue;
        setResult(0);
      }
    }
    switch (paramInt2)
    {
    case -3101: 
    default: 
      h.a(this, R.l.cQG, 0, false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(12811484790784L, 95453);
          GMTrace.o(12811484790784L, 95453);
        }
      });
      GMTrace.o(12813766492160L, 95470);
      return;
    case -3100: 
      h.a(this, R.l.cQI, 0, false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(12794707574784L, 95328);
          WalletAddAddressUI.this.finish();
          GMTrace.o(12794707574784L, 95328);
        }
      });
      GMTrace.o(12813766492160L, 95470);
      return;
    }
    h.a(this, paramString, "", new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(12799673630720L, 95365);
        paramAnonymousDialogInterface.dismiss();
        GMTrace.o(12799673630720L, 95365);
      }
    });
    GMTrace.o(12813766492160L, 95470);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12813632274432L, 95469);
    int i = R.i.cHL;
    GMTrace.o(12813632274432L, 95469);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Object localObject = null;
    GMTrace.i(12813498056704L, 95468);
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(12813498056704L, 95468);
      return;
      if (paramInt2 == -1)
      {
        localObject = paramIntent.getStringExtra("karea_result");
        if (!bg.nm((String)localObject))
        {
          w.d("MicroMsg.WalletAddAddressUI", "AREA_RESULT:" + (String)localObject);
          this.hwm.nG((String)localObject);
        }
        localObject = paramIntent.getStringExtra("kpost_code");
        if (!bg.nm((String)localObject))
        {
          w.d("MicroMsg.WalletAddAddressUI", "post:" + (String)localObject);
          this.hwo.nG((String)localObject);
        }
        this.eQO = paramIntent.getStringExtra("kwcode");
        GMTrace.o(12813498056704L, 95468);
        return;
        if (paramInt2 == -1)
        {
          paramIntent = paramIntent.getData();
          if (paramIntent == null)
          {
            w.d("MicroMsg.WalletAddAddressUI", "uri == null");
            GMTrace.o(12813498056704L, 95468);
            return;
          }
          String[] arrayOfString = com.tencent.mm.pluginsdk.a.b(getBaseContext(), paramIntent);
          if ((arrayOfString != null) && (arrayOfString.length == 2)) {
            paramIntent = arrayOfString[0];
          }
          for (localObject = arrayOfString[1];; localObject = arrayOfString)
          {
            this.hwl.nG(paramIntent);
            this.hwp.nG((String)localObject);
            if (!PhoneNumberUtils.isGlobalPhoneNumber((String)localObject)) {
              break;
            }
            QS();
            GMTrace.o(12813498056704L, 95468);
            return;
            h.b(this, getString(R.l.cRw), "", true);
            arrayOfString = null;
            paramIntent = (Intent)localObject;
          }
          h.b(this, getString(R.l.cRw), "", true);
          GMTrace.o(12813498056704L, 95468);
          return;
          if (paramInt2 == -1)
          {
            paramIntent = (Addr)paramIntent.getParcelableExtra("key_pick_addr");
            if (paramIntent != null)
            {
              w.d("MicroMsg.WalletAddAddressUI", "addr: " + paramIntent.toString());
              if (paramIntent != null)
              {
                if (!com.tencent.mm.plugin.address.a.a.QO().t(paramIntent.gEz, paramIntent.gEB, paramIntent.gEC)) {
                  break label647;
                }
                localObject = new StringBuilder();
                ((StringBuilder)localObject).append(paramIntent.gEz);
                ((StringBuilder)localObject).append(" ");
                ((StringBuilder)localObject).append(paramIntent.gEB);
                if (!TextUtils.isEmpty(paramIntent.gEC))
                {
                  ((StringBuilder)localObject).append(" ");
                  ((StringBuilder)localObject).append(paramIntent.gEC);
                }
                this.hwm.nG(((StringBuilder)localObject).toString());
              }
            }
            for (;;)
            {
              localObject = new StringBuilder();
              if (!TextUtils.isEmpty(paramIntent.gED)) {
                ((StringBuilder)localObject).append(paramIntent.gED);
              }
              if (!TextUtils.isEmpty(paramIntent.gEE)) {
                ((StringBuilder)localObject).append(paramIntent.gEE);
              }
              if (!TextUtils.isEmpty(paramIntent.gEF)) {
                ((StringBuilder)localObject).append(paramIntent.gEF);
              }
              if (!TextUtils.isEmpty(paramIntent.gEH))
              {
                ((StringBuilder)localObject).append(" ");
                ((StringBuilder)localObject).append(paramIntent.gEH);
              }
              this.hwn.nG(((StringBuilder)localObject).toString());
              paramIntent = com.tencent.mm.plugin.address.a.a.QO().s(paramIntent.gEz, paramIntent.gEB, paramIntent.gEC);
              if (paramIntent != null)
              {
                this.hwo.nG(paramIntent.hur);
                this.eQO = paramIntent.code;
              }
              GMTrace.o(12813498056704L, 95468);
              return;
              label647:
              this.hwm.nG("");
            }
          }
          w.i("MicroMsg.WalletAddAddressUI", "MallRecharge pay result : cancel");
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12813095403520L, 95465);
    super.onCreate(paramBundle);
    at.wS().a(415, this);
    at.wS().a(418, this);
    w.d("MicroMsg.WalletAddAddressUI", "index Oncreate");
    w.Al(0);
    this.huL = getIntent().getIntExtra("address_id", 0);
    if (this.huL == 0) {
      oM(R.l.cQJ);
    }
    for (;;)
    {
      MP();
      GMTrace.o(12813095403520L, 95465);
      return;
      oM(R.l.cRa);
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(12813363838976L, 95467);
    super.onDestroy();
    at.wS().b(415, this);
    at.wS().b(418, this);
    l locall = com.tencent.mm.plugin.address.a.a.QO();
    w.i("MicroMsg.WalletAddrMgr", "clean data");
    Iterator localIterator = locall.huv.values().iterator();
    while (localIterator.hasNext()) {
      ((List)localIterator.next()).clear();
    }
    localIterator = locall.huw.values().iterator();
    while (localIterator.hasNext()) {
      ((List)localIterator.next()).clear();
    }
    locall.huu.clear();
    locall.huv.clear();
    locall.huw.clear();
    GMTrace.o(12813363838976L, 95467);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(12814169145344L, 95473);
    if (paramInt == 4)
    {
      QU();
      GMTrace.o(12814169145344L, 95473);
      return true;
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(12814169145344L, 95473);
    return bool;
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(12814840233984L, 95478);
    w.i("MicroMsg.WalletAddAddressUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(12814840233984L, 95478);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        Ra();
        GMTrace.o(12814840233984L, 95478);
        return;
      }
      h.a(this, getString(R.l.dNp), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(12795647098880L, 95335);
          paramAnonymousDialogInterface.dismiss();
          WalletAddAddressUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(12795647098880L, 95335);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(12797526147072L, 95349);
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(12797526147072L, 95349);
        }
      });
      GMTrace.o(12814840233984L, 95478);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        Rb();
        GMTrace.o(12814840233984L, 95478);
        return;
      }
      h.a(this, getString(R.l.dNq), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(12797794582528L, 95351);
          paramAnonymousDialogInterface.dismiss();
          WalletAddAddressUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(12797794582528L, 95351);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(12812290097152L, 95459);
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(12812290097152L, 95459);
        }
      });
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\address\ui\WalletAddAddressUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
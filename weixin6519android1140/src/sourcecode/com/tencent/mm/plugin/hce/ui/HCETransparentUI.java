package com.tencent.mm.plugin.hce.ui;

import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.nfc.NfcAdapter;
import android.nfc.cardemulation.CardEmulation;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.hce.a.b;
import com.tencent.mm.plugin.nfc.HCEService;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.i.a;
import java.util.List;

@a(7)
public class HCETransparentUI
  extends MMActivity
{
  private boolean mgP;
  private boolean mgQ;
  private i mgR;
  
  public HCETransparentUI()
  {
    GMTrace.i(20649934323712L, 153854);
    this.mgP = false;
    this.mgQ = false;
    this.mgR = null;
    GMTrace.o(20649934323712L, 153854);
  }
  
  private void ad(int paramInt, String paramString)
  {
    GMTrace.i(20650739630080L, 153860);
    Intent localIntent = new Intent();
    localIntent.putExtra("errCode", paramInt);
    localIntent.putExtra("errMsg", paramString);
    setResult(1, localIntent);
    GMTrace.o(20650739630080L, 153860);
  }
  
  private void ae(int paramInt, String paramString)
  {
    GMTrace.i(20651008065536L, 153862);
    Intent localIntent = new Intent();
    localIntent.putExtra("errCode", paramInt);
    localIntent.putExtra("errMsg", paramString);
    setResult(-1, localIntent);
    finish();
    GMTrace.o(20651008065536L, 153862);
  }
  
  private void dismissDialog()
  {
    GMTrace.i(20650605412352L, 153859);
    if ((this.mgR != null) && (this.mgR.isShowing()))
    {
      this.mgR.dismiss();
      this.mgR = null;
    }
    GMTrace.o(20650605412352L, 153859);
  }
  
  private void j(final int paramInt, final String paramString1, String paramString2)
  {
    GMTrace.i(20650471194624L, 153858);
    dismissDialog();
    this.mgR = h.a(this, paramString2, "", getString(R.l.cTM), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(20648726364160L, 153845);
        HCETransparentUI.a(HCETransparentUI.this, paramInt, paramString1);
        GMTrace.o(20648726364160L, 153845);
      }
    });
    GMTrace.o(20650471194624L, 153858);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(20650068541440L, 153855);
    int i = R.i.czJ;
    GMTrace.o(20650068541440L, 153855);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(20650873847808L, 153861);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    w.i("MicroMsg.HCETransparentUI", "alvinluo onActivityResult requestCode: %d, resultCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == 1)
    {
      w.i("MicroMsg.HCETransparentUI", "alvinluo back from REQUEST_JUMP_NFC_SETTING");
      GMTrace.o(20650873847808L, 153861);
      return;
    }
    if (paramInt1 == 2) {
      w.i("MicroMsg.HCETransparentUI", "alvinluo back from REQUEST_SET_DEFAULT_NFC_APPLICATION");
    }
    GMTrace.o(20650873847808L, 153861);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(20650202759168L, 153856);
    super.onCreate(paramBundle);
    GMTrace.o(20650202759168L, 153856);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(20651276500992L, 153864);
    super.onDestroy();
    GMTrace.o(20651276500992L, 153864);
  }
  
  protected void onPause()
  {
    GMTrace.i(20651142283264L, 153863);
    super.onPause();
    dismissDialog();
    GMTrace.o(20651142283264L, 153863);
  }
  
  protected void onResume()
  {
    GMTrace.i(20650336976896L, 153857);
    super.onResume();
    w.i("MicroMsg.HCETransparentUI", "alvinluo onResume");
    if (!b.aHk())
    {
      ad(13000, "not support NFC");
      GMTrace.o(20650336976896L, 153857);
      return;
    }
    if (!b.aHj())
    {
      ad(13002, "not support HCE");
      GMTrace.o(20650336976896L, 153857);
      return;
    }
    Object localObject1 = NfcAdapter.getDefaultAdapter(ab.getContext());
    int i;
    if (localObject1 == null)
    {
      w.i("MicroMsg.HceUtils", "alvinluo no nfc chip !");
      i = 0;
    }
    while (i == 0) {
      if (this.mgP)
      {
        w.i("MicroMsg.HCETransparentUI", "alvinluo has shown open NFC dialog");
        j(13001, "system NFC switch not opened", getString(R.l.dCK));
        GMTrace.o(20650336976896L, 153857);
        return;
        if (!((NfcAdapter)localObject1).isEnabled()) {
          i = 0;
        } else {
          i = 1;
        }
      }
      else
      {
        localObject1 = new i.a(this);
        ((i.a)localObject1).BO(R.l.dCM).BQ(R.l.dFX).a(new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(20648994799616L, 153847);
            HCETransparentUI.a(HCETransparentUI.this);
            GMTrace.o(20648994799616L, 153847);
          }
        });
        localObject2 = new Intent("android.settings.NFC_SETTINGS");
        localObject2 = getPackageManager().queryIntentActivities((Intent)localObject2, 65536);
        if ((localObject2 != null) && (((List)localObject2).size() > 0))
        {
          w.i("MicroMsg.HCETransparentUI", "alvinluo NFC activity not null, activities size: " + ((List)localObject2).size());
          i = 0;
          while (i < ((List)localObject2).size())
          {
            w.i("MicroMsg.HCETransparentUI", "alvinluo NFC activity: %s", new Object[] { ((ResolveInfo)((List)localObject2).get(i)).activityInfo.name });
            i += 1;
          }
          i = 1;
          if (i == 0) {
            break label381;
          }
          ((i.a)localObject1).BR(R.l.cSk).b(new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(20649263235072L, 153849);
              w.i("MicroMsg.HCETransparentUI", "alvinluo user click cancel button of NFC tips dialog.");
              HCETransparentUI.a(HCETransparentUI.this, "system NFC switch not opened");
              GMTrace.o(20649263235072L, 153849);
            }
          });
        }
        for (;;)
        {
          ((i.a)localObject1).d(new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymousDialogInterface)
            {
              GMTrace.i(20649800105984L, 153853);
              w.i("MicroMsg.HCETransparentUI", "alvinluo cancel by pressing back");
              HCETransparentUI.a(HCETransparentUI.this, "system NFC switch not opened");
              GMTrace.o(20649800105984L, 153853);
            }
          });
          this.mgR = ((i.a)localObject1).aax();
          this.mgR.setCanceledOnTouchOutside(false);
          this.mgR.show();
          this.mgP = true;
          GMTrace.o(20650336976896L, 153857);
          return;
          w.e("MicroMsg.HCETransparentUI", "alvinluo Cannot jump to NFC setting");
          i = 0;
          break;
          label381:
          ((i.a)localObject1).BQ(R.l.cTM);
        }
      }
    }
    localObject1 = CardEmulation.getInstance(NfcAdapter.getDefaultAdapter(this));
    final Object localObject2 = new ComponentName(this, HCEService.class.getCanonicalName());
    w.i("MicroMsg.HCETransparentUI", "alvinluo component name: " + localObject2);
    if (!((CardEmulation)localObject1).isDefaultServiceForCategory((ComponentName)localObject2, "payment"))
    {
      w.i("MicroMsg.HCETransparentUI", "alvinluo not NFC Default Application, isAutoSet: %b", new Object[] { Boolean.valueOf(true) });
      w.i("MicroMsg.HCETransparentUI", "alvinluo request set default NFC application, hasRequestSetDefault: %b", new Object[] { Boolean.valueOf(this.mgQ) });
      if (this.mgQ)
      {
        w.i("MicroMsg.HCETransparentUI", "alvinluo has request set default NFC application");
        j(13004, "not set default NFC application", getString(R.l.dCL));
        GMTrace.o(20650336976896L, 153857);
        return;
      }
      af.i(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(20649531670528L, 153851);
          HCETransparentUI.b(HCETransparentUI.this);
          Intent localIntent = new Intent("android.nfc.cardemulation.action.ACTION_CHANGE_DEFAULT");
          localIntent.putExtra("category", "payment");
          localIntent.putExtra("component", localObject2);
          HCETransparentUI.this.startActivityForResult(localIntent, 2);
          GMTrace.o(20649531670528L, 153851);
        }
      }, 200L);
      GMTrace.o(20650336976896L, 153857);
      return;
    }
    w.i("MicroMsg.HCETransparentUI", "alvinluo now is NFC Default Application");
    ae(0, "NFC switch has opened and now is NFC default application");
    GMTrace.o(20650336976896L, 153857);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\hce\ui\HCETransparentUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
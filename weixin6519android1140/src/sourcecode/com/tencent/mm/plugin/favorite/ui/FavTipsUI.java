package com.tencent.mm.plugin.favorite.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.i.a;

public class FavTipsUI
  extends MMBaseActivity
{
  public FavTipsUI()
  {
    GMTrace.i(6415473180672L, 47799);
    GMTrace.o(6415473180672L, 47799);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6415607398400L, 47800);
    super.onCreate(paramBundle);
    paramBundle = new i.a(this);
    paramBundle.Vz(getString(R.l.dtS));
    paramBundle.VA(getString(R.l.dtQ) + "\n\n" + getString(R.l.dtR));
    paramBundle.BQ(R.l.dtP).a(new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(6374268338176L, 47492);
        FavTipsUI.this.finish();
        GMTrace.o(6374268338176L, 47492);
      }
    });
    paramBundle.d(new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(6372926160896L, 47482);
        FavTipsUI.this.finish();
        GMTrace.o(6372926160896L, 47482);
      }
    });
    paramBundle.aax().show();
    GMTrace.o(6415607398400L, 47800);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\FavTipsUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
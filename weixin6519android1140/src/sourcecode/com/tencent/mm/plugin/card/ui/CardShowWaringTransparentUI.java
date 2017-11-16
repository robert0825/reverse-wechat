package com.tencent.mm.plugin.card.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;

@a(7)
public class CardShowWaringTransparentUI
  extends MMActivity
{
  public CardShowWaringTransparentUI()
  {
    GMTrace.i(4929011843072L, 36724);
    GMTrace.o(4929011843072L, 36724);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(4929146060800L, 36725);
    int i = R.i.crE;
    GMTrace.o(4929146060800L, 36725);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4929280278528L, 36726);
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("KEY_BRAND_NAME");
    h.a(this, getString(R.l.def, new Object[] { paramBundle }), getString(R.l.deg), getString(R.l.cPO), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(5009542479872L, 37324);
        paramAnonymousDialogInterface.dismiss();
        CardShowWaringTransparentUI.this.finish();
        GMTrace.o(5009542479872L, 37324);
      }
    });
    GMTrace.o(4929280278528L, 36726);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(4929414496256L, 36727);
    if (paramInt == 4) {
      finish();
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(4929414496256L, 36727);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\card\ui\CardShowWaringTransparentUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
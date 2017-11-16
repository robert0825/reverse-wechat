package com.tencent.mm.plugin.product.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.ui.g;

public abstract class MallBaseUI
  extends MMActivity
{
  protected String kxc;
  
  public MallBaseUI()
  {
    GMTrace.i(6027718164480L, 44910);
    GMTrace.o(6027718164480L, 44910);
  }
  
  protected final void EG(String paramString)
  {
    GMTrace.i(6027986599936L, 44912);
    this.kxc = paramString;
    showDialog(55535);
    GMTrace.o(6027986599936L, 44912);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6027852382208L, 44911);
    super.onCreate(paramBundle);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6004095844352L, 44734);
        MallBaseUI.this.finish();
        GMTrace.o(6004095844352L, 44734);
        return true;
      }
    });
    GMTrace.o(6027852382208L, 44911);
  }
  
  protected Dialog onCreateDialog(int paramInt)
  {
    GMTrace.i(6028120817664L, 44913);
    switch (paramInt)
    {
    default: 
      localObject = super.onCreateDialog(paramInt);
      GMTrace.o(6028120817664L, 44913);
      return (Dialog)localObject;
    case -10001: 
      if (bg.nm(this.kxc)) {
        this.kxc = getString(a.i.sVL);
      }
      localObject = h.a(this, this.kxc, null, false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6021141495808L, 44861);
          MallBaseUI.this.finish();
          GMTrace.o(6021141495808L, 44861);
        }
      });
      GMTrace.o(6028120817664L, 44913);
      return (Dialog)localObject;
    }
    Object localObject = g.a(this.vKB.vKW, false, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(6001411489792L, 44714);
        GMTrace.o(6001411489792L, 44714);
      }
    });
    GMTrace.o(6028120817664L, 44913);
    return (Dialog)localObject;
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(6028389253120L, 44915);
    if ((paramInt == 4) && (paramKeyEvent.getAction() == 1)) {
      this.vKB.bXB();
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(6028389253120L, 44915);
    return bool;
  }
  
  public final void sv(int paramInt)
  {
    GMTrace.i(6028255035392L, 44914);
    this.vKB.hqF.setVisibility(paramInt);
    if (paramInt == 0)
    {
      bXu();
      GMTrace.o(6028255035392L, 44914);
      return;
    }
    this.vKB.bXF();
    GMTrace.o(6028255035392L, 44914);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\ui\MallBaseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
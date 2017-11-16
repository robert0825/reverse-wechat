package com.tencent.mm.plugin.wallet.pwd;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI;
import com.tencent.mm.plugin.wallet_core.c.j;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.d.f;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class b
  extends com.tencent.mm.wallet_core.b
{
  public b()
  {
    GMTrace.i(7745168211968L, 57706);
    GMTrace.o(7745168211968L, 57706);
  }
  
  public final com.tencent.mm.wallet_core.b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7745302429696L, 57707);
    w.d("MicroMsg.ProcessManager", "start Process : ModifyPwdProcess");
    c(paramActivity, WalletCheckPwdUI.class, paramBundle);
    GMTrace.o(7745302429696L, 57707);
    return this;
  }
  
  public final d a(MMActivity paramMMActivity, f paramf)
  {
    GMTrace.i(7745839300608L, 57711);
    if ((paramMMActivity instanceof WalletCheckPwdUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(7742752292864L, 57688);
          GMTrace.o(7742752292864L, 57688);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(7742886510592L, 57689);
          String str = (String)paramAnonymousVarArgs[0];
          paramAnonymousVarArgs = (String)paramAnonymousVarArgs[1];
          this.xDO.a(new j(str, 3, paramAnonymousVarArgs), true, 1);
          GMTrace.o(7742886510592L, 57689);
          return true;
        }
        
        public final CharSequence se(int paramAnonymousInt)
        {
          GMTrace.i(7743020728320L, 57690);
          switch (paramAnonymousInt)
          {
          default: 
            localObject = super.se(paramAnonymousInt);
            GMTrace.o(7743020728320L, 57690);
            return (CharSequence)localObject;
          case 0: 
            localObject = this.xDN.getString(a.i.taX);
            GMTrace.o(7743020728320L, 57690);
            return (CharSequence)localObject;
          }
          Object localObject = this.xDN.getString(a.i.tdW);
          GMTrace.o(7743020728320L, 57690);
          return (CharSequence)localObject;
        }
      };
      GMTrace.o(7745839300608L, 57711);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletPwdConfirmUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(7768522096640L, 57880);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            if ((paramAnonymousk instanceof com.tencent.mm.plugin.wallet.pwd.a.b))
            {
              b.this.a(this.xDN, 0, b.a(b.this));
              h.bm(this.xDN, this.xDN.getString(a.i.tdS));
            }
            GMTrace.o(7768522096640L, 57880);
            return true;
          }
          if ((paramAnonymousk instanceof com.tencent.mm.plugin.wallet.pwd.a.b))
          {
            h.a(this.xDN, paramAnonymousString, "", false, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(7737115148288L, 57646);
                b.this.c(b.2.this.xDN, 0);
                GMTrace.o(7737115148288L, 57646);
              }
            });
            GMTrace.o(7768522096640L, 57880);
            return true;
          }
          GMTrace.o(7768522096640L, 57880);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(7768656314368L, 57881);
          paramAnonymousVarArgs = (o)paramAnonymousVarArgs[0];
          String str = b.b(b.this).getString("key_pwd1");
          this.xDO.a(new com.tencent.mm.plugin.wallet.pwd.a.b(str, paramAnonymousVarArgs.riF), true, 1);
          GMTrace.o(7768656314368L, 57881);
          return true;
        }
      };
      GMTrace.o(7745839300608L, 57711);
      return paramMMActivity;
    }
    paramMMActivity = super.a(paramMMActivity, paramf);
    GMTrace.o(7745839300608L, 57711);
    return paramMMActivity;
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(7745436647424L, 57708);
    if ((paramActivity instanceof WalletCheckPwdUI))
    {
      c(paramActivity, WalletSetPasswordUI.class, paramBundle);
      GMTrace.o(7745436647424L, 57708);
      return;
    }
    if ((paramActivity instanceof WalletSetPasswordUI))
    {
      c(paramActivity, WalletPwdConfirmUI.class, paramBundle);
      GMTrace.o(7745436647424L, 57708);
      return;
    }
    if ((paramActivity instanceof WalletPwdConfirmUI)) {
      b(paramActivity, paramBundle);
    }
    GMTrace.o(7745436647424L, 57708);
  }
  
  public final boolean a(final WalletBaseUI paramWalletBaseUI, int paramInt, String paramString)
  {
    GMTrace.i(7746107736064L, 57713);
    switch (paramInt)
    {
    default: 
      GMTrace.o(7746107736064L, 57713);
      return false;
    }
    h.a(paramWalletBaseUI, paramString, null, paramWalletBaseUI.getString(a.i.tgu), false, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(7769998491648L, 57891);
        b.this.b(paramWalletBaseUI, b.c(b.this));
        if (paramWalletBaseUI.aNg()) {
          paramWalletBaseUI.finish();
        }
        WalletBaseUI.cmn();
        GMTrace.o(7769998491648L, 57891);
      }
    });
    GMTrace.o(7746107736064L, 57713);
    return true;
  }
  
  public final String aAd()
  {
    GMTrace.i(7746376171520L, 57715);
    GMTrace.o(7746376171520L, 57715);
    return "ModifyPwdProcess";
  }
  
  public final int b(MMActivity paramMMActivity, int paramInt)
  {
    GMTrace.i(7746241953792L, 57714);
    paramInt = a.i.tgu;
    GMTrace.o(7746241953792L, 57714);
    return paramInt;
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7745705082880L, 57710);
    a(paramActivity, WalletPasswordSettingUI.class, -1, false);
    GMTrace.o(7745705082880L, 57710);
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    GMTrace.i(7745570865152L, 57709);
    if ((paramActivity instanceof WalletPwdConfirmUI)) {
      a(paramActivity, WalletSetPasswordUI.class, paramInt);
    }
    GMTrace.o(7745570865152L, 57709);
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(7745973518336L, 57712);
    GMTrace.o(7745973518336L, 57712);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pwd\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
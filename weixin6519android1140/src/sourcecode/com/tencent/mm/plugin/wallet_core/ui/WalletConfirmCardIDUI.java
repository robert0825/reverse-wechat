package com.tencent.mm.plugin.wallet_core.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wallet_core.c.l;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.c.o;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tenpay.android.wechat.MyKeyboardWindow;
import com.tenpay.bankcard.TenpaySegmentEditText;

public class WalletConfirmCardIDUI
  extends WalletBaseUI
{
  private Button rmA;
  private TenpaySegmentEditText rmB;
  private boolean rmC;
  
  public WalletConfirmCardIDUI()
  {
    GMTrace.i(6929661296640L, 51630);
    this.rmC = true;
    GMTrace.o(6929661296640L, 51630);
  }
  
  protected final void MP()
  {
    GMTrace.i(6930198167552L, 51634);
    final Object localObject = this.ui.getString("key_bankcard_id");
    String str = this.ui.getString("key_bankcard_des");
    Bitmap localBitmap = (Bitmap)this.ui.getParcelable("key_bankcard_cropimg");
    if (TextUtils.isEmpty((CharSequence)localObject))
    {
      w.e("MicroMsg.WalletConfirmCardIDUI", "cardID is empty");
      finish();
      GMTrace.o(6930198167552L, 51634);
      return;
    }
    if (localBitmap == null)
    {
      w.e("MicroMsg.WalletConfirmCardIDUI", "cardID bitmap is null");
      finish();
      GMTrace.o(6930198167552L, 51634);
      return;
    }
    oM(a.i.tbf);
    this.rmA = ((Button)findViewById(a.f.bQR));
    this.rmB = ((TenpaySegmentEditText)findViewById(a.f.svh));
    this.rmB.setText((String)localObject, str);
    this.mKeyboard = ((MyKeyboardWindow)findViewById(a.f.sHx));
    this.mLL = findViewById(a.f.sHw);
    ((ImageView)findViewById(a.f.ssP)).setImageBitmap(localBitmap);
    this.rmB.setKeyboard(this.mKeyboard);
    this.mKeyboard.setXMode(0);
    ((InputMethodManager)this.vKB.vKW.getSystemService("input_method")).hideSoftInputFromWindow(this.rmB.getWindowToken(), 0);
    this.mLL.setVisibility(8);
    this.rmB.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6984019476480L, 52035);
        if ((!WalletConfirmCardIDUI.a(WalletConfirmCardIDUI.this).isShown()) && (!WalletConfirmCardIDUI.b(WalletConfirmCardIDUI.this)))
        {
          WalletConfirmCardIDUI.c(WalletConfirmCardIDUI.this).setVisibility(0);
          WalletConfirmCardIDUI.d(WalletConfirmCardIDUI.this).setVisibility(0);
        }
        WalletConfirmCardIDUI.e(WalletConfirmCardIDUI.this);
        GMTrace.o(6984019476480L, 52035);
      }
    });
    localObject = this.rmB.get3DesEncrptData();
    this.rmA.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6945901641728L, 51751);
        paramAnonymousView = WalletConfirmCardIDUI.f(WalletConfirmCardIDUI.this).get3DesEncrptData();
        if ((paramAnonymousView != null) && (paramAnonymousView.equals(localObject))) {
          g.ork.i(11353, new Object[] { Integer.valueOf(0), Integer.valueOf(1) });
        }
        for (;;)
        {
          WalletConfirmCardIDUI.g(WalletConfirmCardIDUI.this);
          GMTrace.o(6945901641728L, 51751);
          return;
          g.ork.i(11353, new Object[] { Integer.valueOf(0), Integer.valueOf(2) });
        }
      }
    });
    this.mKeyboard = ((MyKeyboardWindow)findViewById(a.f.sHx));
    this.mLL = findViewById(a.f.sHw);
    localObject = findViewById(a.f.hAy);
    if ((this.mKeyboard == null) || (this.mLL == null)) {}
    for (;;)
    {
      this.rmB.setFocusable(false);
      this.rmB.setFocusableInTouchMode(true);
      GMTrace.o(6930198167552L, 51634);
      return;
      ((View)localObject).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(16596156284928L, 123651);
          WalletConfirmCardIDUI.h(WalletConfirmCardIDUI.this);
          GMTrace.o(16596156284928L, 123651);
        }
      });
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6930332385280L, 51635);
    paramString = new Bundle();
    boolean bool = this.ui.getBoolean("key_is_reset_with_new_card", false);
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if ((paramk instanceof l))
      {
        paramk = (l)paramk;
        paramString.putBoolean("key_need_area", paramk.bxX());
        paramString.putBoolean("key_need_profession", paramk.bxY());
        paramString.putParcelableArray("key_profession_list", paramk.rcz);
        if (paramk.rcv != null)
        {
          if ((paramk.rcv.rfS) && (paramk.rcv.isError()))
          {
            h.h(this, a.i.sZK, a.i.cUG);
            GMTrace.o(6930332385280L, 51635);
            return true;
          }
          paramString.putBoolean("key_is_reset_with_new_card", bool);
          paramString.putString("bank_name", paramk.rcv.mhU);
          paramString.putParcelable("elemt_query", paramk.rcv);
          paramString.putString("key_card_id", this.rmB.getEncryptDataWithHash(false));
          a.i(this, paramString);
          GMTrace.o(6930332385280L, 51635);
          return true;
        }
        paramString.putBoolean("key_is_reset_with_new_card", bool);
        paramString.putString("bank_name", "");
        paramString.putParcelable("elemt_query", new ElementQuery());
        paramString.putString("key_card_id", this.rmB.getEncryptDataWithHash(false));
        a.i(this, paramString);
      }
    }
    while ((paramInt2 != 1) || (!(paramk instanceof l)))
    {
      GMTrace.o(6930332385280L, 51635);
      return false;
    }
    paramString.putString("bank_name", "");
    paramString.putBoolean("key_is_reset_with_new_card", bool);
    paramString.putParcelable("elemt_query", new ElementQuery());
    paramString.putString("key_card_id", this.rmB.getEncryptDataWithHash(false));
    a.i(this, paramString);
    GMTrace.o(6930332385280L, 51635);
    return true;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6929795514368L, 51631);
    int i = a.g.sPj;
    GMTrace.o(6929795514368L, 51631);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6929929732096L, 51632);
    super.onCreate(paramBundle);
    MP();
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(16594277236736L, 123637);
        o.clP();
        WalletConfirmCardIDUI.this.finish();
        GMTrace.o(16594277236736L, 123637);
        return false;
      }
    });
    GMTrace.o(6929929732096L, 51632);
  }
  
  public void onDestroy()
  {
    GMTrace.i(6930063949824L, 51633);
    super.onDestroy();
    GMTrace.o(6930063949824L, 51633);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\ui\WalletConfirmCardIDUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
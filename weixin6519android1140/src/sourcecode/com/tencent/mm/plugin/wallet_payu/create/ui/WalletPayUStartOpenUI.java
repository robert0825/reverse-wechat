package com.tencent.mm.plugin.wallet_payu.create.ui;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet_payu.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.MMAutoHeightViewPager;
import com.tencent.mm.ui.base.MMFormMobileInputView;
import com.tencent.mm.ui.base.MMPageControlView;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.wallet_core.c.t;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;

@a(3)
public class WalletPayUStartOpenUI
  extends WalletBaseUI
{
  private String nLL;
  private WalletPayUOpenIntroView rtS;
  private MMFormMobileInputView rtT;
  private EditText rtU;
  private EditText rtV;
  private Button rtW;
  private TextView rtX;
  private TextView rtY;
  private String rtZ;
  
  public WalletPayUStartOpenUI()
  {
    GMTrace.i(7948642287616L, 59222);
    GMTrace.o(7948642287616L, 59222);
  }
  
  private void bAl()
  {
    GMTrace.i(7949179158528L, 59226);
    if (this.rtT.getVisibility() == 0)
    {
      int i;
      if ((!bg.nm(bxf())) && (!bg.nm(this.rtV.getText().toString())))
      {
        i = 1;
        if (i == 0) {
          break label117;
        }
        this.rtZ = bxf();
        localObject = this.rtT;
        if (((MMFormMobileInputView)localObject).wbS == null) {
          break label111;
        }
      }
      label111:
      for (Object localObject = an.Sa(((MMFormMobileInputView)localObject).wbS.getText().toString());; localObject = "")
      {
        this.nLL = ((String)localObject);
        this.rtW.setEnabled(true);
        GMTrace.o(7949179158528L, 59226);
        return;
        i = 0;
        break;
      }
      label117:
      this.rtW.setEnabled(false);
    }
    GMTrace.o(7949179158528L, 59226);
  }
  
  private String bxf()
  {
    GMTrace.i(7949044940800L, 59225);
    if (this.rtT.getCountryCode().startsWith("+"))
    {
      str = this.rtT.getCountryCode().substring(1);
      GMTrace.o(7949044940800L, 59225);
      return str;
    }
    String str = this.rtT.getCountryCode();
    GMTrace.o(7949044940800L, 59225);
    return str;
  }
  
  protected final boolean bxq()
  {
    GMTrace.i(7949313376256L, 59227);
    GMTrace.o(7949313376256L, 59227);
    return true;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7949581811712L, 59229);
    GMTrace.o(7949581811712L, 59229);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7949447593984L, 59228);
    int i = a.g.sNO;
    GMTrace.o(7949447593984L, 59228);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7948776505344L, 59223);
    super.onCreate(paramBundle);
    this.nLL = this.ui.getString("key_mobile");
    this.rtZ = this.ui.getString("dial_code");
    if (bg.nm(this.rtZ)) {
      this.rtZ = "27";
    }
    this.rtS = ((WalletPayUOpenIntroView)findViewById(a.f.swl));
    paramBundle = this.rtS;
    paramBundle.rtQ = new com.tencent.mm.plugin.wallet_payu.create.a.d[] { new com.tencent.mm.plugin.wallet_payu.create.a.d(a.e.soL, a.i.teX, a.i.teS), new com.tencent.mm.plugin.wallet_payu.create.a.d(a.e.soM, a.i.teY, a.i.teT), new com.tencent.mm.plugin.wallet_payu.create.a.d(a.e.soN, a.i.teZ, a.i.teU) };
    paramBundle.Xo = new ArrayList();
    if (paramBundle.rtQ != null)
    {
      i = 0;
      while (i < paramBundle.rtQ.length)
      {
        localObject = LayoutInflater.from(paramBundle.mContext).inflate(a.g.sNQ, null);
        paramBundle.Xo.add(localObject);
        i += 1;
      }
    }
    paramBundle.rtP = new WalletPayUOpenIntroView.a(paramBundle);
    paramBundle.rtN.a(paramBundle.rtP);
    Object localObject = paramBundle.rtO;
    if (paramBundle.rtQ == null) {}
    for (int i = 0;; i = paramBundle.rtQ.length)
    {
      ((MMPageControlView)localObject).en(i, 0);
      this.rtT = ((MMFormMobileInputView)findViewById(a.f.sHk));
      this.rtW = ((Button)findViewById(a.f.sHi));
      this.rtU = this.rtT.wbR;
      this.rtV = this.rtT.wbS;
      if (!bg.nm(this.nLL)) {
        this.rtV.setText(this.nLL);
      }
      if (!bg.nm(this.rtZ)) {
        this.rtU.setText(this.rtZ);
      }
      paramBundle = new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(7948508069888L, 59221);
          WalletPayUStartOpenUI.a(WalletPayUStartOpenUI.this);
          GMTrace.o(7948508069888L, 59221);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(7948373852160L, 59220);
          GMTrace.o(7948373852160L, 59220);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(7948239634432L, 59219);
          GMTrace.o(7948239634432L, 59219);
        }
      };
      this.rtV.addTextChangedListener(paramBundle);
      this.rtU.addTextChangedListener(paramBundle);
      this.rtW.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7947971198976L, 59217);
          if (WalletPayUStartOpenUI.b(WalletPayUStartOpenUI.this).getVisibility() == 0)
          {
            WalletPayUStartOpenUI.this.ui.putString("key_mobile", WalletPayUStartOpenUI.c(WalletPayUStartOpenUI.this));
            WalletPayUStartOpenUI.this.ui.putString("dial_code", WalletPayUStartOpenUI.d(WalletPayUStartOpenUI.this));
          }
          WalletPayUStartOpenUI.this.cmq().j(new Object[0]);
          GMTrace.o(7947971198976L, 59217);
        }
      });
      this.rtX = ((TextView)findViewById(a.f.sHj));
      c.a(this, this.rtX);
      this.rtY = ((TextView)findViewById(a.f.sHl));
      this.rtY.setText(t.clW());
      GMTrace.o(7948776505344L, 59223);
      return;
    }
  }
  
  public void onResume()
  {
    GMTrace.i(7948910723072L, 59224);
    super.onResume();
    bAl();
    GMTrace.o(7948910723072L, 59224);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\create\ui\WalletPayUStartOpenUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
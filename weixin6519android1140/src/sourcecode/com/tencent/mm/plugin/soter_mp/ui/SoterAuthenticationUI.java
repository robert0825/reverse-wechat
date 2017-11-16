package com.tencent.mm.plugin.soter_mp.ui;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.soter.c.g;
import com.tencent.mm.plugin.soter.c.h;
import com.tencent.mm.plugin.soter_mp.a.c;
import com.tencent.mm.plugin.soter_mp.b.d;
import com.tencent.mm.plugin.soter_mp.b.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.r;
import java.lang.ref.WeakReference;

@com.tencent.mm.ui.base.a(7)
public class SoterAuthenticationUI
  extends MMActivity
{
  public static a qqk;
  private String appId;
  private int fromScene;
  private r ihl;
  private c qqj;
  
  static
  {
    GMTrace.i(7075958620160L, 52720);
    qqk = null;
    GMTrace.o(7075958620160L, 52720);
  }
  
  public SoterAuthenticationUI()
  {
    GMTrace.i(7073945354240L, 52705);
    this.qqj = null;
    this.ihl = null;
    this.fromScene = -1;
    this.appId = null;
    GMTrace.o(7073945354240L, 52705);
  }
  
  private void a(e parame)
  {
    GMTrace.i(7074482225152L, 52709);
    setResult(1, b(parame));
    c(parame);
    finish();
    GMTrace.o(7074482225152L, 52709);
  }
  
  private static Intent b(e parame)
  {
    GMTrace.i(7074616442880L, 52710);
    Bundle localBundle = new Bundle();
    localBundle.putInt("err_code", parame.errCode);
    localBundle.putString("err_msg", parame.eAR);
    localBundle.putByte("use_mode", parame.qqh);
    localBundle.putString("result_json", parame.eTd);
    localBundle.putString("result_json_signature", parame.qqi);
    w.d("MicroMsg.SoterAuthenticationUI", "hy: dump mp soter result: %s", new Object[] { localBundle.toString() });
    parame = new Intent();
    parame.putExtras(localBundle);
    GMTrace.o(7074616442880L, 52710);
    return parame;
  }
  
  private void c(e parame)
  {
    GMTrace.i(7074750660608L, 52711);
    if (parame == null)
    {
      GMTrace.o(7074750660608L, 52711);
      return;
    }
    int i;
    if (this.fromScene == 0)
    {
      int j = parame.errCode;
      i = -1;
      switch (j)
      {
      }
    }
    for (;;)
    {
      g localg = g.qpi;
      g.l("requireSoterBiometricAuthentication", this.appId, i, parame.errCode);
      GMTrace.o(7074750660608L, 52711);
      return;
      i = 0;
      continue;
      i = 2;
      continue;
      i = 3;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7075153313792L, 52714);
    GMTrace.o(7075153313792L, 52714);
    return -1;
  }
  
  @TargetApi(23)
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7074079571968L, 52706);
    super.onCreate(paramBundle);
    if (qqk != null) {
      qqk.clear();
    }
    qqk = new a(this);
    paramBundle = new d();
    e locale = new e();
    String str = getIntent().getStringExtra("auth_mode");
    if (bg.nm(str))
    {
      w.e("MicroMsg.SoterAuthenticationUI", "hy: error authen mode : null");
      locale.errCode = 90003;
      locale.eAR = "authen mode is null";
    }
    for (;;)
    {
      if (locale.errCode != 0)
      {
        a(locale);
        GMTrace.o(7074079571968L, 52706);
        return;
      }
      try
      {
        paramBundle.qqg = Byte.parseByte(bg.aq(str.substring(2), "00"), 16);
        paramBundle.llD = getIntent().getStringExtra("challenge");
        paramBundle.content = getIntent().getStringExtra("auth_content");
        if (!h.bqF())
        {
          w.e("MicroMsg.SoterAuthenticationUI", "hy: not support soter");
          locale.errCode = 90001;
          locale.eAR = "not support soter";
        }
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        w.e("MicroMsg.SoterAuthenticationUI", "hy: error authen mode format: %s", new Object[] { str });
        locale.errCode = 90003;
        locale.eAR = ("authen mode is illegal: number format error. found: " + str);
        continue;
        if (paramBundle.qqg <= 0)
        {
          w.e("MicroMsg.SoterAuthenticationUI", "hy: param error: request mode illegal");
          locale.errCode = 90003;
          locale.eAR = "resp model error";
          continue;
        }
        if (bg.nm(paramBundle.llD))
        {
          w.e("MicroMsg.SoterAuthenticationUI", "hy: param error: challenge null");
          locale.errCode = 90004;
          locale.eAR = "challenge is null";
          continue;
        }
        if (paramBundle.llD.length() >= 512)
        {
          w.e("MicroMsg.SoterAuthenticationUI", "hy: param error: challenge too long");
          locale.errCode = 90004;
          locale.eAR = "challenge is too long. 512 chars at most";
          continue;
        }
        if (bg.nm(paramBundle.content))
        {
          paramBundle.content = getString(R.l.edr);
          continue;
        }
        if (paramBundle.content.length() <= 42) {
          continue;
        }
        w.e("MicroMsg.SoterAuthenticationUI", "hy: param error: content too long. use default");
        paramBundle.content = getString(R.l.edr);
        continue;
        int i = com.tencent.mm.plugin.soter_mp.a.a.qpO;
        this.qqj = com.tencent.mm.plugin.soter_mp.a.a.a(this, paramBundle, locale);
        if (this.qqj == null)
        {
          w.e("MicroMsg.SoterAuthenticationUI", "hy: no corresponding authen mode");
          locale.errCode = 90003;
          locale.eAR = "no corresponding mode";
          a(locale);
          GMTrace.o(7074079571968L, 52706);
          return;
        }
        this.fromScene = getIntent().getIntExtra("key_soter_fp_mp_scene", 0);
        this.appId = getIntent().getStringExtra("key_app_id");
        this.qqj.cP();
        GMTrace.o(7074079571968L, 52706);
        return;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        for (;;) {}
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7075019096064L, 52713);
    super.onDestroy();
    qqk.clear();
    GMTrace.o(7075019096064L, 52713);
  }
  
  protected void onPause()
  {
    GMTrace.i(7074348007424L, 52708);
    super.onPause();
    if (this.qqj != null) {
      this.qqj.onPause();
    }
    GMTrace.o(7074348007424L, 52708);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(7074884878336L, 52712);
    super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
    if (this.qqj != null) {
      this.qqj.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
    }
    GMTrace.o(7074884878336L, 52712);
  }
  
  protected void onResume()
  {
    GMTrace.i(7074213789696L, 52707);
    super.onResume();
    if (this.qqj != null) {
      this.qqj.onResume();
    }
    GMTrace.o(7074213789696L, 52707);
  }
  
  public static final class a
    extends ae
  {
    private WeakReference<SoterAuthenticationUI> kVB;
    
    public a(SoterAuthenticationUI paramSoterAuthenticationUI)
    {
      GMTrace.i(7073408483328L, 52701);
      this.kVB = null;
      this.kVB = new WeakReference(paramSoterAuthenticationUI);
      GMTrace.o(7073408483328L, 52701);
    }
    
    public final void clear()
    {
      GMTrace.i(16034455093248L, 119466);
      if (this.kVB != null) {
        this.kVB.clear();
      }
      GMTrace.o(16034455093248L, 119466);
    }
    
    @TargetApi(23)
    public final void handleMessage(Message paramMessage)
    {
      GMTrace.i(7073542701056L, 52702);
      super.handleMessage(paramMessage);
      switch (paramMessage.what)
      {
      default: 
        w.e("MicroMsg.SoterAuthenticationUI", "hy: unidentified msg: %d", new Object[] { Integer.valueOf(paramMessage.what) });
        GMTrace.o(7073542701056L, 52702);
        return;
      case 0: 
        w.i("MicroMsg.SoterAuthenticationUI", "hy: inform ok");
        paramMessage = (e)paramMessage.obj;
        if ((this.kVB != null) && (this.kVB.get() != null))
        {
          SoterAuthenticationUI.a((SoterAuthenticationUI)this.kVB.get(), paramMessage);
          GMTrace.o(7073542701056L, 52702);
          return;
        }
        w.w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
        GMTrace.o(7073542701056L, 52702);
        return;
      case 1: 
        w.i("MicroMsg.SoterAuthenticationUI", "hy: inform cancel");
        paramMessage = (e)paramMessage.obj;
        if ((this.kVB != null) && (this.kVB.get() != null))
        {
          SoterAuthenticationUI.b((SoterAuthenticationUI)this.kVB.get(), paramMessage);
          GMTrace.o(7073542701056L, 52702);
          return;
        }
        w.w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
        GMTrace.o(7073542701056L, 52702);
        return;
      case 2: 
        w.i("MicroMsg.SoterAuthenticationUI", "hy: inform fail");
        paramMessage = (e)paramMessage.obj;
        if ((this.kVB != null) && (this.kVB.get() != null))
        {
          SoterAuthenticationUI.c((SoterAuthenticationUI)this.kVB.get(), paramMessage);
          GMTrace.o(7073542701056L, 52702);
          return;
        }
        w.w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
        GMTrace.o(7073542701056L, 52702);
        return;
      case 3: 
        w.i("MicroMsg.SoterAuthenticationUI", "hy: request permission");
        if ((this.kVB != null) && (this.kVB.get() != null))
        {
          String[] arrayOfString = paramMessage.getData().getStringArray("permissions");
          int i = paramMessage.getData().getInt("request_code");
          if ((arrayOfString == null) || (arrayOfString.length <= 1))
          {
            w.e("MicroMsg.SoterAuthenticationUI", "hy: permission null");
            GMTrace.o(7073542701056L, 52702);
            return;
          }
          ((SoterAuthenticationUI)this.kVB.get()).requestPermissions(arrayOfString, i);
          GMTrace.o(7073542701056L, 52702);
          return;
        }
        w.w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
        GMTrace.o(7073542701056L, 52702);
        return;
      case 4: 
        w.i("MicroMsg.SoterAuthenticationUI", "hy: show progress");
        if ((this.kVB != null) && (this.kVB.get() != null))
        {
          SoterAuthenticationUI.a((SoterAuthenticationUI)this.kVB.get());
          GMTrace.o(7073542701056L, 52702);
          return;
        }
        w.w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
        GMTrace.o(7073542701056L, 52702);
        return;
      case 5: 
        w.i("MicroMsg.SoterAuthenticationUI", "hy: dismiss progress");
        if ((this.kVB != null) && (this.kVB.get() != null))
        {
          SoterAuthenticationUI.b((SoterAuthenticationUI)this.kVB.get());
          GMTrace.o(7073542701056L, 52702);
          return;
        }
        w.w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
        GMTrace.o(7073542701056L, 52702);
        return;
      }
      w.i("MicroMsg.SoterAuthenticationUI", "hy: show dialog");
      if ((this.kVB != null) && (this.kVB.get() != null))
      {
        paramMessage = (i)paramMessage.obj;
        ((SoterAuthenticationUI)this.kVB.get()).a(paramMessage);
        GMTrace.o(7073542701056L, 52702);
        return;
      }
      w.w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
      GMTrace.o(7073542701056L, 52702);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\soter_mp\ui\SoterAuthenticationUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
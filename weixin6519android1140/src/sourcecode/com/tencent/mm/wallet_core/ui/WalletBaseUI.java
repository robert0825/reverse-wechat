package com.tencent.mm.wallet_core.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.c.n;
import com.tencent.mm.wallet_core.g.a.l;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.y.q;
import com.tenpay.android.wechat.MyKeyboardWindow;
import com.tenpay.android.wechat.TenpaySecureEditText;

public abstract class WalletBaseUI
  extends MMActivity
  implements com.tencent.mm.wallet_core.d.c
{
  public static final int hqZ;
  private static com.tencent.mm.wallet_core.c.h xEN;
  public MyKeyboardWindow mKeyboard;
  public View mLL;
  public a mLW;
  public Bundle ui;
  private MenuItem.OnMenuItemClickListener wEl;
  private com.tencent.mm.wallet_core.b xEK;
  public com.tencent.mm.wallet_core.d.f xEL;
  private com.tencent.mm.wallet_core.d.d xEM;
  private MenuItem.OnMenuItemClickListener xEO;
  public boolean xEP;
  
  static
  {
    GMTrace.i(1477200314368L, 11006);
    hqZ = com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 270);
    xEN = null;
    GMTrace.o(1477200314368L, 11006);
  }
  
  public WalletBaseUI()
  {
    GMTrace.i(1471294734336L, 10962);
    this.xEK = null;
    this.xEL = null;
    this.xEM = null;
    this.ui = new Bundle();
    this.xEP = false;
    GMTrace.o(1471294734336L, 10962);
  }
  
  public static void cmn()
  {
    GMTrace.i(1474784395264L, 10988);
    f.cmn();
    GMTrace.o(1474784395264L, 10988);
  }
  
  public final void EN(int paramInt)
  {
    GMTrace.i(1475187048448L, 10991);
    this.mKeyboard.setXMode(paramInt);
    GMTrace.o(1475187048448L, 10991);
  }
  
  public void Qg()
  {
    GMTrace.i(1474918612992L, 10989);
    if ((this.mLL != null) && (this.mLL.isShown()))
    {
      this.mLL.setVisibility(8);
      if (this.mLW != null) {
        this.mLW.gU(false);
      }
    }
    GMTrace.o(1474918612992L, 10989);
  }
  
  public boolean Qj()
  {
    GMTrace.i(1473844871168L, 10981);
    GMTrace.o(1473844871168L, 10981);
    return true;
  }
  
  public final void a(int paramInt, String paramString, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    GMTrace.i(1472100040704L, 10968);
    this.xEO = paramOnMenuItemClickListener;
    super.a(paramInt, paramString, paramOnMenuItemClickListener);
    GMTrace.o(1472100040704L, 10968);
  }
  
  public final void a(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    GMTrace.i(1471965822976L, 10967);
    this.wEl = paramOnMenuItemClickListener;
    super.a(paramOnMenuItemClickListener);
    GMTrace.o(1471965822976L, 10967);
  }
  
  public void a(final View paramView, final int paramInt, final boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(1474515959808L, 10986);
    this.mKeyboard = ((MyKeyboardWindow)findViewById(a.f.sHx));
    this.mLL = findViewById(a.f.sHw);
    View localView = findViewById(a.f.hAy);
    final EditText localEditText = (EditText)paramView.findViewById(a.f.sJj);
    if ((this.mKeyboard == null) || (localEditText == null) || (this.mLL == null))
    {
      GMTrace.o(1474515959808L, 10986);
      return;
    }
    e.setNoSystemInputOnEditText(localEditText);
    localEditText.setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public final void onFocusChange(final View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        GMTrace.i(1504043859968L, 11206);
        if ((paramAnonymousView.isFocused()) && (!paramBoolean1))
        {
          ((InputMethodManager)WalletBaseUI.this.vKB.vKW.getSystemService("input_method")).hideSoftInputFromWindow(paramAnonymousView.getWindowToken(), 0);
          new ae().postDelayed(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(1478542491648L, 11016);
              if ((!WalletBaseUI.this.mLL.isShown()) && (paramAnonymousView.isShown()) && ((WalletBaseUI.5.this.hrb) || (WalletBaseUI.this.xEP)))
              {
                WalletBaseUI.this.xEP = true;
                WalletBaseUI.this.cmo();
              }
              Object localObject;
              if (((WalletBaseUI.5.this.hrd instanceof WalletFormView)) && (Build.VERSION.SDK_INT >= 14))
              {
                localObject = (WalletFormView)WalletBaseUI.5.this.hrd;
                if (((q.zR()) || (((WalletFormView)localObject).xFy == 100)) && ((!q.zR()) || (((WalletFormView)localObject).xFy == 0))) {
                  break label306;
                }
                localObject = new com.tencent.mm.ui.a.c();
                WalletBaseUI.this.mKeyboard.setSecureAccessibility((View.AccessibilityDelegate)localObject);
                WalletBaseUI.5.this.hrc.setAccessibilityDelegate((View.AccessibilityDelegate)localObject);
              }
              for (;;)
              {
                if (((WalletBaseUI.5.this.hrd instanceof EditHintPasswdView)) && (Build.VERSION.SDK_INT >= 14))
                {
                  localObject = new com.tencent.mm.ui.a.c();
                  WalletBaseUI.this.mKeyboard.setSecureAccessibility((View.AccessibilityDelegate)localObject);
                  WalletBaseUI.5.this.hrc.setAccessibilityDelegate((View.AccessibilityDelegate)localObject);
                }
                WalletBaseUI.this.EN(WalletBaseUI.5.this.hre);
                WalletBaseUI.this.mKeyboard.setInputEditText((EditText)paramAnonymousView);
                ((InputMethodManager)WalletBaseUI.this.vKB.vKW.getSystemService("input_method")).hideSoftInputFromWindow(paramAnonymousView.getWindowToken(), 0);
                GMTrace.o(1478542491648L, 11016);
                return;
                label306:
                WalletBaseUI.this.mKeyboard.resetSecureAccessibility();
                WalletBaseUI.5.this.hrc.setAccessibilityDelegate(null);
              }
            }
          }, 300L);
          GMTrace.o(1504043859968L, 11206);
          return;
        }
        new ae().postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(1469549903872L, 10949);
            WalletBaseUI.this.Qg();
            ((InputMethodManager)WalletBaseUI.this.vKB.vKW.getSystemService("input_method")).showSoftInput(WalletBaseUI.5.this.hrc, 0);
            GMTrace.o(1469549903872L, 10949);
          }
        }, 200L);
        GMTrace.o(1504043859968L, 11206);
      }
    });
    localEditText.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1462436364288L, 10896);
        if ((!WalletBaseUI.this.mLL.isShown()) && (!paramBoolean1))
        {
          WalletBaseUI.this.cmo();
          WalletBaseUI.this.EN(paramInt);
          GMTrace.o(1462436364288L, 10896);
          return;
        }
        if (paramBoolean1)
        {
          WalletBaseUI.this.Qg();
          ((InputMethodManager)WalletBaseUI.this.vKB.vKW.getSystemService("input_method")).showSoftInput(localEditText, 0);
        }
        GMTrace.o(1462436364288L, 10896);
      }
    });
    localView.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1471160516608L, 10961);
        WalletBaseUI.this.Qg();
        GMTrace.o(1471160516608L, 10961);
      }
    });
    GMTrace.o(1474515959808L, 10986);
  }
  
  public final void a(final View paramView1, View paramView2, final int paramInt)
  {
    GMTrace.i(19126160457728L, 142501);
    if (paramView1 != null)
    {
      int[] arrayOfInt = new int[2];
      paramView2.getLocationInWindow(arrayOfInt);
      paramInt = arrayOfInt[1] + paramView2.getHeight();
      int i = com.tencent.mm.br.a.eg(this);
      int j = i - paramInt - com.tencent.mm.br.a.fromDPToPix(this, 30);
      w.d("MicroMsg.WalletBaseUI", "scrollToFormEditPosAfterShowTenPay, editText locationY: %s, height: %s, diff: %s, hardcodeKeyboardHeight: %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(hqZ) });
      if ((j > 0) && (j < hqZ))
      {
        paramInt = hqZ - j;
        w.d("MicroMsg.WalletBaseUI", "scrollToFormEditPosAfterShowTenPay, scrollDistance: %s", new Object[] { Integer.valueOf(paramInt) });
        paramView1.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(19126563110912L, 142504);
            paramView1.scrollBy(0, paramInt);
            GMTrace.o(19126563110912L, 142504);
          }
        });
      }
    }
    GMTrace.o(19126160457728L, 142501);
  }
  
  public void aMc()
  {
    GMTrace.i(1471563169792L, 10964);
    w.d("MicroMsg.WalletBaseUI", "cancelforceScene");
    this.xEL.aMc();
    finish();
    GMTrace.o(1471563169792L, 10964);
  }
  
  public boolean aNg()
  {
    GMTrace.i(1473442217984L, 10978);
    if (getLayoutId() <= 0)
    {
      GMTrace.o(1473442217984L, 10978);
      return true;
    }
    if (this.xEL.aMd())
    {
      GMTrace.o(1473442217984L, 10978);
      return true;
    }
    GMTrace.o(1473442217984L, 10978);
    return false;
  }
  
  public boolean aNj()
  {
    GMTrace.i(1473308000256L, 10977);
    GMTrace.o(1473308000256L, 10977);
    return false;
  }
  
  public boolean aNk()
  {
    GMTrace.i(1473173782528L, 10976);
    GMTrace.o(1473173782528L, 10976);
    return true;
  }
  
  public void b(int paramInt1, int paramInt2, String paramString, k paramk, boolean paramBoolean)
  {
    GMTrace.i(1472636911616L, 10972);
    w.d("MicroMsg.WalletBaseUI", "errType = " + paramInt1 + ", errCode = " + paramInt2 + ", errMsg = " + paramString);
    TenpaySecureEditText.setSalt(n.clL());
    if ((paramk instanceof com.tencent.mm.wallet_core.c.h))
    {
      com.tencent.mm.wallet_core.c.h localh = (com.tencent.mm.wallet_core.c.h)paramk;
      xEN = localh;
      if (this.ui != null)
      {
        if (localh.rft > 0) {
          this.ui.putInt("key_is_gen_cert", localh.rft);
        }
        if (localh.rfv > 0) {
          this.ui.putInt("key_is_hint_crt", localh.rfv);
        }
        if (localh.rfx > 0) {
          this.ui.putInt("key_is_ignore_cert", localh.rfx);
        }
        if (!bg.nm(localh.rfu)) {
          this.ui.putString("key_crt_token", localh.rfu);
        }
        if (!bg.nm(localh.rfw)) {
          this.ui.putString("key_crt_wording", localh.rfw);
        }
      }
    }
    i(paramInt1, paramInt2, paramString, paramk);
    f.a(this, paramInt1, paramInt2, paramString, paramk, paramBoolean);
    GMTrace.o(1472636911616L, 10972);
  }
  
  public final void b(k paramk, boolean paramBoolean)
  {
    GMTrace.i(1476126572544L, 10998);
    cmr();
    this.xEL.a(paramk, paramBoolean, 1);
    GMTrace.o(1476126572544L, 10998);
  }
  
  public final boolean bEg()
  {
    GMTrace.i(1474113306624L, 10983);
    if (this.wEl != null)
    {
      this.wEl.onMenuItemClick(null);
      GMTrace.o(1474113306624L, 10983);
      return true;
    }
    if (this.xEO != null)
    {
      this.xEO.onMenuItemClick(null);
      GMTrace.o(1474113306624L, 10983);
      return true;
    }
    boolean bool = super.bEg();
    GMTrace.o(1474113306624L, 10983);
    return bool;
  }
  
  public void bwP()
  {
    GMTrace.i(1475723919360L, 10995);
    cmp().a(this, 0, this.ui);
    GMTrace.o(1475723919360L, 10995);
  }
  
  public final String bxg()
  {
    GMTrace.i(1471428952064L, 10963);
    if (this.ui == null)
    {
      GMTrace.o(1471428952064L, 10963);
      return "";
    }
    Object localObject = (PayInfo)this.ui.getParcelable("key_pay_info");
    if (localObject != null)
    {
      localObject = ((PayInfo)localObject).eHG;
      GMTrace.o(1471428952064L, 10963);
      return (String)localObject;
    }
    GMTrace.o(1471428952064L, 10963);
    return "";
  }
  
  public boolean bxq()
  {
    GMTrace.i(1473576435712L, 10979);
    GMTrace.o(1473576435712L, 10979);
    return false;
  }
  
  public final int cml()
  {
    GMTrace.i(1471831605248L, 10966);
    int i = this.vKB.hqF.getVisibility();
    GMTrace.o(1471831605248L, 10966);
    return i;
  }
  
  public final void cmm()
  {
    GMTrace.i(1473710653440L, 10980);
    PayInfo localPayInfo2 = (PayInfo)this.ui.getParcelable("key_pay_info");
    PayInfo localPayInfo1 = localPayInfo2;
    if (localPayInfo2 == null) {
      localPayInfo1 = (PayInfo)getIntent().getParcelableExtra("key_pay_info");
    }
    if ((localPayInfo1 != null) && (!bg.nm(localPayInfo1.lOv)))
    {
      this.xEL.a(new com.tencent.mm.wallet_core.c.d(localPayInfo1.lOv, localPayInfo1.eHG), true, 1);
      localPayInfo1.lOv = null;
    }
    GMTrace.o(1473710653440L, 10980);
  }
  
  public final void cmo()
  {
    GMTrace.i(1475052830720L, 10990);
    if ((this.mLL != null) && (!this.mLL.isShown()))
    {
      this.mLL.setVisibility(0);
      if (this.mLW != null) {
        this.mLW.gU(true);
      }
    }
    GMTrace.o(1475052830720L, 10990);
  }
  
  public final com.tencent.mm.wallet_core.b cmp()
  {
    GMTrace.i(1475321266176L, 10992);
    if (this.xEK == null) {
      this.xEK = com.tencent.mm.wallet_core.a.ad(this);
    }
    com.tencent.mm.wallet_core.b localb = this.xEK;
    GMTrace.o(1475321266176L, 10992);
    return localb;
  }
  
  public final com.tencent.mm.wallet_core.d.d cmq()
  {
    GMTrace.i(1475455483904L, 10993);
    if (this.xEM == null)
    {
      localObject = cmp();
      if (localObject != null) {
        this.xEM = ((com.tencent.mm.wallet_core.b)localObject).a(this, this.xEL);
      }
      if (this.xEM == null) {
        this.xEM = new com.tencent.mm.wallet_core.d.d(this, this.xEL)
        {
          public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
          {
            GMTrace.i(1468207726592L, 10939);
            GMTrace.o(1468207726592L, 10939);
            return false;
          }
          
          public final boolean j(Object... paramAnonymousVarArgs)
          {
            GMTrace.i(1468341944320L, 10940);
            GMTrace.o(1468341944320L, 10940);
            return false;
          }
        };
      }
    }
    Object localObject = this.xEM;
    GMTrace.o(1475455483904L, 10993);
    return (com.tencent.mm.wallet_core.d.d)localObject;
  }
  
  public void cmr()
  {
    GMTrace.i(1476529225728L, 11001);
    com.tencent.mm.wallet_core.b localb = cmp();
    if (localb != null) {
      this.xEL.ui = localb.ler;
    }
    GMTrace.o(1476529225728L, 11001);
  }
  
  public abstract boolean d(int paramInt1, int paramInt2, String paramString, k paramk);
  
  public final void e(View paramView, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(1474381742080L, 10985);
    a(paramView, paramInt, paramBoolean, true);
    GMTrace.o(1474381742080L, 10985);
  }
  
  public final void hN(int paramInt)
  {
    GMTrace.i(1475858137088L, 10996);
    this.xEL.hN(paramInt);
    GMTrace.o(1475858137088L, 10996);
  }
  
  public final void hO(int paramInt)
  {
    GMTrace.i(1475992354816L, 10997);
    this.xEL.hO(paramInt);
    GMTrace.o(1475992354816L, 10997);
  }
  
  public boolean i(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(1472905347072L, 10974);
    GMTrace.o(1472905347072L, 10974);
    return true;
  }
  
  public final void l(k paramk)
  {
    GMTrace.i(1476260790272L, 10999);
    cmr();
    this.xEL.a(paramk, true, 1);
    GMTrace.o(1476260790272L, 10999);
  }
  
  public final boolean mR(boolean paramBoolean)
  {
    GMTrace.i(1474650177536L, 10987);
    if ((xEN != null) && ((xEN.aVn()) || (paramBoolean)))
    {
      this.xEL.a(xEN, true);
      GMTrace.o(1474650177536L, 10987);
      return true;
    }
    GMTrace.o(1474650177536L, 10987);
    return false;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(19126026240000L, 142500);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    cmq().onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(19126026240000L, 142500);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1471697387520L, 10965);
    super.onCreate(paramBundle);
    if (!com.tencent.mm.kernel.h.xw().wL())
    {
      w.e("MicroMsg.WalletBaseUI", "hy: account not ready. finish now");
      com.tencent.mm.ui.base.h.a(this, getString(a.i.sYT), "", false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(1503506989056L, 11202);
          com.tencent.mm.wallet_core.a.c(WalletBaseUI.this, null, 55536);
          GMTrace.o(1503506989056L, 11202);
        }
      });
    }
    this.xEL = new com.tencent.mm.wallet_core.d.f(this, this);
    this.xEL.hN(385);
    this.xEL.hN(1518);
    w.d("MicroMsg.WalletBaseUI", "current process:" + getIntent().getIntExtra("process_id", 0));
    paramBundle = com.tencent.mm.wallet_core.a.ad(this);
    if (paramBundle != null) {
      this.xEL.fXf = paramBundle.aAd();
    }
    w.d("MicroMsg.WalletBaseUI", "proc " + paramBundle);
    this.ui = com.tencent.mm.wallet_core.a.ac(this);
    if (this.ui == null) {
      this.ui = new Bundle();
    }
    this.xEL.ui = this.ui;
    if ((aNk()) && (!com.tencent.mm.wallet_core.a.ab(this))) {
      w.e("MicroMsg.WalletBaseUI", "Activity extends WalletBaseUI but not in process!!!");
    }
    if ((getLayoutId() > 0) && (!bg.nm(""))) {
      Ve("");
    }
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(1506057125888L, 11221);
        if (WalletBaseUI.this.bxq())
        {
          WalletBaseUI.this.aLo();
          WalletBaseUI.this.showDialog(1000);
        }
        for (;;)
        {
          GMTrace.o(1506057125888L, 11221);
          return true;
          WalletBaseUI.this.finish();
        }
      }
    });
    this.xEM = cmq();
    if ((this.xEM != null) && (this.xEM.p(new Object[0])))
    {
      sv(4);
      GMTrace.o(1471697387520L, 10965);
      return;
    }
    if (getLayoutId() <= 0)
    {
      sv(4);
      GMTrace.o(1471697387520L, 10965);
      return;
    }
    if (aNg())
    {
      sv(4);
      GMTrace.o(1471697387520L, 10965);
      return;
    }
    sv(0);
    GMTrace.o(1471697387520L, 10965);
  }
  
  public Dialog onCreateDialog(int paramInt)
  {
    GMTrace.i(1474247524352L, 10984);
    w.i("MicroMsg.WalletBaseUI", "onCreateDialog id = " + paramInt);
    switch (paramInt)
    {
    default: 
      localObject = super.onCreateDialog(paramInt);
      GMTrace.o(1474247524352L, 10984);
      return (Dialog)localObject;
    }
    Object localObject = com.tencent.mm.wallet_core.a.ad(this);
    if (localObject != null) {}
    for (int i = ((com.tencent.mm.wallet_core.b)localObject).b(this, 1);; i = -1)
    {
      if (i != -1)
      {
        localObject = com.tencent.mm.ui.base.h.a(this, true, getString(i), "", getString(a.i.cUW), getString(a.i.cTJ), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(1506325561344L, 11223);
            WalletBaseUI.this.cmm();
            paramAnonymousDialogInterface = com.tencent.mm.wallet_core.a.ad(WalletBaseUI.this);
            if (paramAnonymousDialogInterface != null)
            {
              if (!paramAnonymousDialogInterface.g(WalletBaseUI.this, WalletBaseUI.this.ui))
              {
                paramAnonymousDialogInterface.b(WalletBaseUI.this, WalletBaseUI.this.ui);
                GMTrace.o(1506325561344L, 11223);
              }
            }
            else {
              WalletBaseUI.this.finish();
            }
            GMTrace.o(1506325561344L, 11223);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(1507533520896L, 11232);
            if (WalletBaseUI.a(WalletBaseUI.this) == null) {}
            for (paramAnonymousDialogInterface = null;; paramAnonymousDialogInterface = WalletBaseUI.b(WalletBaseUI.this).findFocus())
            {
              if ((paramAnonymousDialogInterface != null) && ((paramAnonymousDialogInterface instanceof EditText))) {
                WalletBaseUI.this.aLs();
              }
              GMTrace.o(1507533520896L, 11232);
              return;
            }
          }
        });
        GMTrace.o(1474247524352L, 10984);
        return (Dialog)localObject;
      }
      if (localObject != null) {
        ((com.tencent.mm.wallet_core.b)localObject).b(this, this.ui);
      }
      for (;;)
      {
        localObject = super.onCreateDialog(paramInt);
        GMTrace.o(1474247524352L, 10984);
        return (Dialog)localObject;
        finish();
      }
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(1472502693888L, 10971);
    super.onDestroy();
    this.xEL.hO(385);
    this.xEL.hO(1518);
    GMTrace.o(1472502693888L, 10971);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(1473979088896L, 10982);
    if (paramInt == 4)
    {
      if ((this.mLL != null) && (this.mLL.isShown()))
      {
        Qg();
        GMTrace.o(1473979088896L, 10982);
        return true;
      }
      if (bxq())
      {
        aLo();
        showDialog(1000);
        GMTrace.o(1473979088896L, 10982);
        return true;
      }
      if ((this.wEl != null) && (Qj()))
      {
        this.wEl.onMenuItemClick(null);
        GMTrace.o(1473979088896L, 10982);
        return true;
      }
      if (this.xEO != null)
      {
        this.xEO.onMenuItemClick(null);
        GMTrace.o(1473979088896L, 10982);
        return true;
      }
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(1473979088896L, 10982);
    return bool;
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(1476797661184L, 11003);
    super.onNewIntent(paramIntent);
    int i;
    if ((paramIntent.getBooleanExtra("key_process_is_end", false)) && (!paramIntent.getBooleanExtra("key_process_is_stay", true)))
    {
      setIntent(paramIntent);
      paramIntent = getIntent().getExtras();
      if ((paramIntent == null) || (!paramIntent.containsKey("key_process_result_code"))) {
        break label108;
      }
      i = paramIntent.getInt("key_process_result_code", 0);
      if (i != -1) {
        break label113;
      }
      w.i("MicroMsg.WalletBaseUI", "process end ok!");
      setResult(-1, getIntent());
    }
    for (;;)
    {
      finish();
      GMTrace.o(1476797661184L, 11003);
      return;
      label108:
      i = 0;
      break;
      label113:
      w.i("MicroMsg.WalletBaseUI", "process end with user cancel or err! resultCode : " + i);
      setResult(0, getIntent());
    }
  }
  
  public void onPause()
  {
    GMTrace.i(1472368476160L, 10970);
    super.onPause();
    GMTrace.o(1472368476160L, 10970);
  }
  
  public void onResume()
  {
    GMTrace.i(1472234258432L, 10969);
    super.onResume();
    if (n.clK()) {
      if (q.zR()) {
        break label52;
      }
    }
    label52:
    for (Object localObject = new l();; localObject = new com.tencent.mm.wallet_core.e.a.b())
    {
      this.xEL.a((k)localObject, false);
      GMTrace.o(1472234258432L, 10969);
      return;
    }
  }
  
  public final void r(k paramk)
  {
    GMTrace.i(1476395008000L, 11000);
    cmr();
    this.xEL.a(paramk, true);
    GMTrace.o(1476395008000L, 11000);
  }
  
  public final CharSequence se(int paramInt)
  {
    GMTrace.i(1475589701632L, 10994);
    if (this.xEM == null)
    {
      GMTrace.o(1475589701632L, 10994);
      return null;
    }
    CharSequence localCharSequence = this.xEM.se(paramInt);
    GMTrace.o(1475589701632L, 10994);
    return localCharSequence;
  }
  
  public void so(int paramInt)
  {
    GMTrace.i(1472771129344L, 10973);
    GMTrace.o(1472771129344L, 10973);
  }
  
  public void sv(int paramInt)
  {
    GMTrace.i(1476663443456L, 11002);
    super.sv(paramInt);
    GMTrace.o(1476663443456L, 11002);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\ui\WalletBaseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
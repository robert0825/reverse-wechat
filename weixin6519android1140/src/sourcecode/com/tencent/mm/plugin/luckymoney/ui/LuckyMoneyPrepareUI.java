package com.tencent.mm.plugin.luckymoney.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.oz;
import com.tencent.mm.plugin.luckymoney.b.ac;
import com.tencent.mm.plugin.luckymoney.b.ag;
import com.tencent.mm.plugin.luckymoney.b.i;
import com.tencent.mm.plugin.luckymoney.b.n;
import com.tencent.mm.plugin.luckymoney.b.v;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wallet_core.ui.f.a;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.r;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.wallet_core.ui.MMScrollView;
import com.tencent.mm.y.q;
import com.tenpay.android.wechat.MyKeyboardWindow;
import com.tenpay.android.wechat.TenpaySecureEditText;
import java.util.Map;

@com.tencent.mm.ui.base.a(19)
public class LuckyMoneyPrepareUI
  extends LuckyMoneyBaseUI
  implements f
{
  private Dialog hul;
  private aj ikv;
  private TextView jZR;
  private TextView jZU;
  private boolean jgp;
  private int jtE;
  private Button ktP;
  private int mChannel;
  private Button mFZ;
  private com.tencent.mm.plugin.luckymoney.b.c mIa;
  protected MyKeyboardWindow mKeyboard;
  private LuckyMoneyNumInputView mLI;
  private LuckyMoneyMoneyInputView mLJ;
  private LuckyMoneyTextInputView mLK;
  protected View mLL;
  private View mLM;
  private View mLN;
  private ViewGroup mLO;
  private TextView mLP;
  private a mLQ;
  private int mLR;
  private String mLS;
  private int mLT;
  private boolean mLU;
  private String mLV;
  private MMScrollView mPW;
  private int mPX;
  private String mPY;
  private String mPZ;
  private RealnameGuideHelper mQa;
  private com.tencent.mm.sdk.b.c<oz> mQb;
  private int mType;
  
  public LuckyMoneyPrepareUI()
  {
    GMTrace.i(9822187552768L, 73181);
    this.mLI = null;
    this.mLJ = null;
    this.mLK = null;
    this.jZR = null;
    this.mFZ = null;
    this.ktP = null;
    this.hul = null;
    this.mLQ = new a();
    this.ikv = null;
    this.mPX = 1;
    this.mPY = com.tencent.mm.wallet_core.ui.e.Xv("CNY");
    this.mPZ = null;
    this.jgp = false;
    this.mQb = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(9822187552768L, 73181);
  }
  
  private int aMr()
  {
    GMTrace.i(9824335036416L, 73197);
    if (this.mLU)
    {
      if (getIntent().getIntExtra("key_chatroom_num", 0) > 0)
      {
        GMTrace.o(9824335036416L, 73197);
        return 2;
      }
      GMTrace.o(9824335036416L, 73197);
      return 1;
    }
    GMTrace.o(9824335036416L, 73197);
    return 3;
  }
  
  private void b(double paramDouble, String paramString)
  {
    GMTrace.i(9824200818688L, 73196);
    if (bg.nm(paramString))
    {
      this.jZR.setText(com.tencent.mm.wallet_core.ui.e.s(paramDouble));
      GMTrace.o(9824200818688L, 73196);
      return;
    }
    this.jZR.setText(paramString + com.tencent.mm.wallet_core.ui.e.r(paramDouble));
    GMTrace.o(9824200818688L, 73196);
  }
  
  private void cP(String paramString1, String paramString2)
  {
    GMTrace.i(9823395512320L, 73190);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LuckyMoneyPrepareUI", "initH5LuckyMoneyView  currencyWording=" + paramString1);
    TextView localTextView = (TextView)findViewById(a.f.sxz);
    if (!bg.nm(paramString1)) {
      localTextView.setText(paramString1);
    }
    while (!bg.nm(paramString2))
    {
      b(0.0D, paramString2);
      GMTrace.o(9823395512320L, 73190);
      return;
      localTextView.setText(getString(a.i.sxz));
    }
    b(0.0D, com.tencent.mm.wallet_core.ui.e.Xv("CNY"));
    GMTrace.o(9823395512320L, 73190);
  }
  
  protected final void MP()
  {
    GMTrace.i(9822724423680L, 73185);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9791854346240L, 72955);
        LuckyMoneyPrepareUI.this.finish();
        GMTrace.o(9791854346240L, 72955);
        return true;
      }
    });
    this.mLM = findViewById(a.f.sAa);
    this.mLN = findViewById(a.f.sAd);
    this.ktP = ((Button)findViewById(a.f.sAc));
    this.mLK = ((LuckyMoneyTextInputView)findViewById(a.f.sAE));
    this.mLK.BI(getString(a.i.sUe));
    this.mFZ = ((Button)findViewById(a.f.szT));
    this.mKeyboard = ((MyKeyboardWindow)findViewById(a.f.sHx));
    this.mLL = findViewById(a.f.sHw);
    this.jZU = ((TextView)findViewById(a.f.szS));
    this.mLI = ((LuckyMoneyNumInputView)findViewById(a.f.szP));
    this.mLJ = ((LuckyMoneyMoneyInputView)findViewById(a.f.sxy));
    this.jZR = ((TextView)findViewById(a.f.sAe));
    this.mLO = ((ViewGroup)findViewById(a.f.szZ));
    this.mPW = ((MMScrollView)findViewById(a.f.sAy));
    this.mLP = ((TextView)findViewById(a.f.szX));
    final Object localObject1;
    final Object localObject2;
    Object localObject3;
    label540:
    label614:
    int i;
    if (this.mType == 1)
    {
      oM(a.i.sUy);
      this.mLJ.setTitle(getString(a.i.sVp));
      this.mLJ.fO(true);
      this.mLJ.mOA = this;
      localObject1 = this.mLJ;
      localObject2 = getString(a.i.sUI);
      ((LuckyMoneyMoneyInputView)localObject1).mOx.setHint((CharSequence)localObject2);
      this.mLI.mOA = this;
      localObject1 = this.mLI;
      localObject2 = getString(a.i.sUN);
      ((LuckyMoneyNumInputView)localObject1).mPI.setHint((CharSequence)localObject2);
      this.mLK.mOA = this;
      localObject1 = (EditText)this.mLJ.findViewById(a.f.syw);
      localObject2 = (EditText)this.mLI.findViewById(a.f.syw);
      com.tencent.mm.wallet_core.ui.e.setNoSystemInputOnEditText((EditText)localObject1);
      ((InputMethodManager)this.vKB.vKW.getSystemService("input_method")).showSoftInput((View)localObject1, 0);
      ((EditText)localObject1).addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(9813194964992L, 73114);
          if (paramAnonymousEditable.toString().startsWith(".")) {
            paramAnonymousEditable.insert(0, "0");
          }
          String str = paramAnonymousEditable.toString();
          int i = str.indexOf(".");
          int j = str.length();
          if ((i >= 0) && (j - i > 3))
          {
            paramAnonymousEditable.delete(i + 3, j);
            GMTrace.o(9813194964992L, 73114);
            return;
          }
          if (i > 6)
          {
            paramAnonymousEditable.delete(6, i);
            GMTrace.o(9813194964992L, 73114);
            return;
          }
          if ((i == -1) && (j > 6)) {
            paramAnonymousEditable.delete(6, j);
          }
          GMTrace.o(9813194964992L, 73114);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(9812926529536L, 73112);
          GMTrace.o(9812926529536L, 73112);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(9813060747264L, 73113);
          GMTrace.o(9813060747264L, 73113);
        }
      });
      ((EditText)localObject1).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(9858963210240L, 73455);
          localObject1.setOnClickListener(null);
          localObject2.setOnClickListener(null);
          LuckyMoneyPrepareUI.this.z(LuckyMoneyPrepareUI.b(LuckyMoneyPrepareUI.this), 2);
          LuckyMoneyPrepareUI.this.z(LuckyMoneyPrepareUI.a(LuckyMoneyPrepareUI.this), 0);
          LuckyMoneyPrepareUI.this.mKeyboard.setXMode(2);
          LuckyMoneyPrepareUI.this.mKeyboard.setInputEditText((EditText)paramAnonymousView);
          LuckyMoneyPrepareUI.this.mLL.setVisibility(0);
          GMTrace.o(9858963210240L, 73455);
        }
      });
      ((EditText)localObject1).requestFocus();
      localObject3 = (TextView)this.mLJ.findViewById(a.f.sxz);
      if (localObject3 != null) {
        ((TextView)localObject3).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(9875203555328L, 73576);
            localObject1.setOnClickListener(null);
            localObject2.setOnClickListener(null);
            LuckyMoneyPrepareUI.this.z(LuckyMoneyPrepareUI.b(LuckyMoneyPrepareUI.this), 2);
            LuckyMoneyPrepareUI.this.z(LuckyMoneyPrepareUI.a(LuckyMoneyPrepareUI.this), 0);
            LuckyMoneyPrepareUI.this.mKeyboard.setXMode(2);
            LuckyMoneyPrepareUI.this.mKeyboard.setInputEditText(localObject1);
            LuckyMoneyPrepareUI.this.mLL.setVisibility(0);
            GMTrace.o(9875203555328L, 73576);
          }
        });
      }
      com.tencent.mm.wallet_core.ui.e.setNoSystemInputOnEditText((EditText)localObject2);
      ((InputMethodManager)this.vKB.vKW.getSystemService("input_method")).showSoftInput((View)localObject2, 0);
      ((EditText)localObject2).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(9807557820416L, 73072);
          localObject1.setOnClickListener(null);
          localObject2.setOnClickListener(null);
          LuckyMoneyPrepareUI.this.z(LuckyMoneyPrepareUI.b(LuckyMoneyPrepareUI.this), 2);
          LuckyMoneyPrepareUI.this.z(LuckyMoneyPrepareUI.a(LuckyMoneyPrepareUI.this), 0);
          LuckyMoneyPrepareUI.this.mKeyboard.setXMode(0);
          LuckyMoneyPrepareUI.this.mKeyboard.setInputEditText((EditText)paramAnonymousView);
          LuckyMoneyPrepareUI.this.mLL.setVisibility(0);
          GMTrace.o(9807557820416L, 73072);
        }
      });
      ((MMEditText)this.mLK.findViewById(a.f.sAz)).setOnFocusChangeListener(new View.OnFocusChangeListener()
      {
        public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
        {
          GMTrace.i(9831717011456L, 73252);
          localObject1.setOnClickListener(null);
          localObject2.setOnClickListener(null);
          LuckyMoneyPrepareUI.this.z(LuckyMoneyPrepareUI.b(LuckyMoneyPrepareUI.this), 2);
          LuckyMoneyPrepareUI.this.z(LuckyMoneyPrepareUI.a(LuckyMoneyPrepareUI.this), 0);
          GMTrace.o(9831717011456L, 73252);
        }
      });
      if (this.mIa != null)
      {
        if (this.mType != 1) {
          break label912;
        }
        this.mLJ.mOB = this.mIa.mHR;
        this.mLJ.mOC = this.mIa.mHW;
        if (this.mIa.jWC != 1) {
          cP(this.mIa.mHZ, this.mIa.mHY);
        }
      }
      if ((!this.mLU) || (getIntent().getIntExtra("key_chatroom_num", 0) > 1)) {
        break label929;
      }
      this.mLI.BH("1");
      this.mLI.qf(this.mIa.mHQ);
      this.mLI.mPM = 1;
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.LuckyMoneyPrepareUI", "init num=" + this.mLI.aMQ());
      this.mLJ.aMK();
      if ((!this.mLU) && (this.jtE != 2)) {
        break label1296;
      }
      oM(a.i.sVn);
      i = getIntent().getIntExtra("key_chatroom_num", 0);
      if ((!this.mLU) || (i != 0)) {
        break label942;
      }
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LuckyMoneyPrepareUI", "single hb");
      this.mLI.setVisibility(8);
    }
    for (;;)
    {
      this.mFZ.setOnClickListener(new r()
      {
        public final void aoJ()
        {
          GMTrace.i(9785411895296L, 72907);
          com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(LuckyMoneyPrepareUI.f(LuckyMoneyPrepareUI.this)), Integer.valueOf(4) });
          if (LuckyMoneyPrepareUI.b(LuckyMoneyPrepareUI.this).aMI() != 0)
          {
            u.makeText(LuckyMoneyPrepareUI.this.vKB.vKW, a.i.sZH, 0).show();
            GMTrace.o(9785411895296L, 72907);
            return;
          }
          int i = LuckyMoneyPrepareUI.a(LuckyMoneyPrepareUI.this).aMQ();
          double d = LuckyMoneyPrepareUI.b(LuckyMoneyPrepareUI.this).aMJ();
          long l2 = 0L;
          long l1;
          if (LuckyMoneyPrepareUI.c(LuckyMoneyPrepareUI.this) == 1)
          {
            l1 = com.tencent.mm.wallet_core.ui.e.t(d);
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xy().xh().set(356354, Integer.valueOf(i));
            str = LuckyMoneyPrepareUI.g(LuckyMoneyPrepareUI.this).getInput();
            localObject = str;
            if (bg.nm(str)) {
              if (!bg.nm(LuckyMoneyPrepareUI.h(LuckyMoneyPrepareUI.this))) {
                break label324;
              }
            }
          }
          label324:
          for (Object localObject = LuckyMoneyPrepareUI.this.getString(a.i.sUe);; localObject = LuckyMoneyPrepareUI.h(LuckyMoneyPrepareUI.this))
          {
            if (LuckyMoneyPrepareUI.i(LuckyMoneyPrepareUI.this) != 2) {
              break label336;
            }
            localObject = new com.tencent.mm.plugin.luckymoney.f2f.a.c(i, (int)l1, LuckyMoneyPrepareUI.c(LuckyMoneyPrepareUI.this), (int)l2);
            LuckyMoneyPrepareUI.this.b((k)localObject, false);
            if (LuckyMoneyPrepareUI.m(LuckyMoneyPrepareUI.this) == null) {
              break label635;
            }
            LuckyMoneyPrepareUI.m(LuckyMoneyPrepareUI.this).show();
            GMTrace.o(9785411895296L, 72907);
            return;
            l1 = com.tencent.mm.wallet_core.ui.e.t(i * d);
            l2 = com.tencent.mm.wallet_core.ui.e.t(d);
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xy().xh().set(356353, Integer.valueOf(i));
            break;
          }
          label336:
          String str = LuckyMoneyPrepareUI.this.getIntent().getStringExtra("key_username");
          if (LuckyMoneyPrepareUI.j(LuckyMoneyPrepareUI.this) == 1)
          {
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LuckyMoneyPrepareUI", "currency is RMB");
            if ((LuckyMoneyPrepareUI.k(LuckyMoneyPrepareUI.this)) && (!bg.nm(str))) {}
            for (localObject = new ac(i, l1, l2, LuckyMoneyPrepareUI.c(LuckyMoneyPrepareUI.this), (String)localObject, n.aMg(), str, n.fr(str), q.zE(), q.zG(), LuckyMoneyPrepareUI.l(LuckyMoneyPrepareUI.this));; localObject = new ac(i, l1, l2, LuckyMoneyPrepareUI.c(LuckyMoneyPrepareUI.this), (String)localObject, n.aMg(), null, null, q.zE(), q.zG(), LuckyMoneyPrepareUI.l(LuckyMoneyPrepareUI.this)))
            {
              LuckyMoneyPrepareUI.this.b((k)localObject, false);
              break;
            }
          }
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LuckyMoneyPrepareUI", "currency=" + LuckyMoneyPrepareUI.j(LuckyMoneyPrepareUI.this));
          LuckyMoneyPrepareUI.this.hN(1645);
          if ((LuckyMoneyPrepareUI.k(LuckyMoneyPrepareUI.this)) && (!bg.nm(str))) {}
          for (localObject = new com.tencent.mm.plugin.luckymoney.b.w(i, l1, l2, LuckyMoneyPrepareUI.c(LuckyMoneyPrepareUI.this), (String)localObject, str, n.aMg(), q.zE(), LuckyMoneyPrepareUI.j(LuckyMoneyPrepareUI.this));; localObject = new com.tencent.mm.plugin.luckymoney.b.w(i, l1, l2, LuckyMoneyPrepareUI.c(LuckyMoneyPrepareUI.this), (String)localObject, null, n.aMg(), q.zE(), LuckyMoneyPrepareUI.j(LuckyMoneyPrepareUI.this)))
          {
            LuckyMoneyPrepareUI.this.b((k)localObject, false);
            break;
          }
          label635:
          LuckyMoneyPrepareUI.a(LuckyMoneyPrepareUI.this, com.tencent.mm.wallet_core.ui.g.a(LuckyMoneyPrepareUI.this.vKB.vKW, true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              GMTrace.i(9794672918528L, 72976);
              if ((LuckyMoneyPrepareUI.m(LuckyMoneyPrepareUI.this) != null) && (LuckyMoneyPrepareUI.m(LuckyMoneyPrepareUI.this).isShowing())) {
                LuckyMoneyPrepareUI.m(LuckyMoneyPrepareUI.this).dismiss();
              }
              if ((LuckyMoneyPrepareUI.n(LuckyMoneyPrepareUI.this).getVisibility() == 8) || (LuckyMoneyPrepareUI.o(LuckyMoneyPrepareUI.this).getVisibility() == 4))
              {
                com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LuckyMoneyPrepareUI", "usr cancel, & visibility not visiable, so finish");
                LuckyMoneyPrepareUI.this.finish();
              }
              LuckyMoneyPrepareUI.this.mMW.aMc();
              GMTrace.o(9794672918528L, 72976);
            }
          }));
          GMTrace.o(9785411895296L, 72907);
        }
      });
      this.mLQ.a(this.mLI);
      this.mLQ.a(this.mLJ);
      this.mLQ.a(this.mLK);
      localObject1 = (TextView)findViewById(a.f.szV);
      this.mLQ.g((TextView)localObject1);
      this.ikv = new aj(new aj.a()
      {
        public final boolean pM()
        {
          GMTrace.i(9809302650880L, 73085);
          int i;
          double d2;
          if ((LuckyMoneyPrepareUI.b(LuckyMoneyPrepareUI.this).aMI() != 3) && (LuckyMoneyPrepareUI.a(LuckyMoneyPrepareUI.this).aMI() != 3))
          {
            i = LuckyMoneyPrepareUI.a(LuckyMoneyPrepareUI.this).aMQ();
            d2 = LuckyMoneyPrepareUI.b(LuckyMoneyPrepareUI.this).aMJ();
            d1 = d2;
            if (LuckyMoneyPrepareUI.c(LuckyMoneyPrepareUI.this) != 0) {}
          }
          for (double d1 = d2 * i;; d1 = 0.0D)
          {
            if ((d1 == 0.0D) || (d1 > LuckyMoneyPrepareUI.d(LuckyMoneyPrepareUI.this).mHR) || (LuckyMoneyPrepareUI.p(LuckyMoneyPrepareUI.this).aMH()))
            {
              LuckyMoneyPrepareUI.q(LuckyMoneyPrepareUI.this).setClickable(false);
              LuckyMoneyPrepareUI.q(LuckyMoneyPrepareUI.this).setEnabled(false);
            }
            for (;;)
            {
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LuckyMoneyPrepareUI", "onTimeExpired & check: amount=" + d1 + ", hasErr=" + LuckyMoneyPrepareUI.p(LuckyMoneyPrepareUI.this).aMH());
              LuckyMoneyPrepareUI.r(LuckyMoneyPrepareUI.this).bQn();
              GMTrace.o(9809302650880L, 73085);
              return false;
              LuckyMoneyPrepareUI.q(LuckyMoneyPrepareUI.this).setClickable(true);
              LuckyMoneyPrepareUI.q(LuckyMoneyPrepareUI.this).setEnabled(true);
            }
          }
        }
      }, false);
      if (this.mPW != null) {
        this.mPW.setOnTouchListener(new View.OnTouchListener()
        {
          public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
          {
            GMTrace.i(9838964768768L, 73306);
            if (paramAnonymousMotionEvent.getAction() == 0)
            {
              LuckyMoneyPrepareUI.this.Qg();
              LuckyMoneyPrepareUI.this.aLo();
            }
            GMTrace.o(9838964768768L, 73306);
            return false;
          }
        });
      }
      this.mLJ.mType = this.mType;
      a(0, a.e.soo, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(9839501639680L, 73310);
          if (LuckyMoneyPrepareUI.j(LuckyMoneyPrepareUI.this) == 1) {
            com.tencent.mm.wallet_core.ui.e.m(LuckyMoneyPrepareUI.this.vKB.vKW, "https://kf.qq.com/touch/scene_product.html?scene_id=kf7", false);
          }
          for (;;)
          {
            GMTrace.o(9839501639680L, 73310);
            return true;
            com.tencent.mm.wallet_core.ui.e.m(LuckyMoneyPrepareUI.this.vKB.vKW, "https://hkwallet.moneydata.hk/hybrid/www/weixin/hongbao_hk_v2/zh_hk/faq.shtml", false);
          }
        }
      });
      GMTrace.o(9822724423680L, 73185);
      return;
      oM(a.i.sUL);
      this.mLJ.setTitle(getString(a.i.sVq));
      this.mLJ.fO(false);
      break;
      label912:
      this.mLJ.mOB = this.mIa.mHU;
      break label540;
      label929:
      this.mLI.BH("");
      break label614;
      label942:
      localObject3 = getString(a.i.sUo);
      Object localObject5 = getString(a.i.sUz);
      final Object localObject4 = getString(a.i.sUk);
      String str = getString(a.i.sUA);
      if ((this.mLU) && (i > 0))
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LuckyMoneyPrepareUI", "group hb,%d people", new Object[] { Integer.valueOf(i) });
        localObject2 = getString(a.i.sUC);
        localObject1 = getString(a.i.sUB);
        localObject3 = (TextView)findViewById(a.f.szY);
        ((TextView)localObject3).setText(getString(a.i.sUM, new Object[] { Integer.valueOf(getIntent().getIntExtra("key_chatroom_num", 8)) }));
        ((TextView)localObject3).setVisibility(0);
      }
      for (;;)
      {
        localObject3 = new com.tencent.mm.plugin.wallet_core.ui.f(this);
        localObject4 = new SpannableString((String)localObject2 + (String)localObject5);
        ((SpannableString)localObject4).setSpan(localObject3, ((String)localObject2).length(), ((String)localObject2).length() + ((String)localObject5).length(), 33);
        localObject2 = new SpannableString((String)localObject1 + str);
        localObject5 = new com.tencent.mm.plugin.wallet_core.ui.f(this);
        ((SpannableString)localObject2).setSpan(localObject5, ((String)localObject1).length(), ((String)localObject1).length() + str.length(), 33);
        ((com.tencent.mm.plugin.wallet_core.ui.f)localObject3).rmz = new f.a()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(9881914441728L, 73626);
            int i = LuckyMoneyPrepareUI.a(LuckyMoneyPrepareUI.this).aMQ();
            double d = LuckyMoneyPrepareUI.b(LuckyMoneyPrepareUI.this).aMJ();
            LuckyMoneyPrepareUI.a(LuckyMoneyPrepareUI.this, 0);
            LuckyMoneyPrepareUI.b(LuckyMoneyPrepareUI.this).mType = LuckyMoneyPrepareUI.c(LuckyMoneyPrepareUI.this);
            LuckyMoneyPrepareUI.b(LuckyMoneyPrepareUI.this).fO(false);
            LuckyMoneyPrepareUI.b(LuckyMoneyPrepareUI.this).setTitle(LuckyMoneyPrepareUI.this.getString(a.i.sVq));
            if ((d > 0.0D) && (i > 0)) {
              LuckyMoneyPrepareUI.b(LuckyMoneyPrepareUI.this).BG(com.tencent.mm.wallet_core.ui.e.r(d / i));
            }
            LuckyMoneyPrepareUI.b(LuckyMoneyPrepareUI.this).mOB = LuckyMoneyPrepareUI.d(LuckyMoneyPrepareUI.this).mHU;
            LuckyMoneyPrepareUI.e(LuckyMoneyPrepareUI.this).setText(localObject2);
            com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(LuckyMoneyPrepareUI.f(LuckyMoneyPrepareUI.this)), Integer.valueOf(3) });
            GMTrace.o(9881914441728L, 73626);
          }
        };
        ((com.tencent.mm.plugin.wallet_core.ui.f)localObject5).rmz = new f.a()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(9881109135360L, 73620);
            int i = LuckyMoneyPrepareUI.a(LuckyMoneyPrepareUI.this).aMQ();
            double d = LuckyMoneyPrepareUI.b(LuckyMoneyPrepareUI.this).aMJ();
            LuckyMoneyPrepareUI.a(LuckyMoneyPrepareUI.this, 1);
            LuckyMoneyPrepareUI.b(LuckyMoneyPrepareUI.this).mType = LuckyMoneyPrepareUI.c(LuckyMoneyPrepareUI.this);
            LuckyMoneyPrepareUI.b(LuckyMoneyPrepareUI.this).mOB = LuckyMoneyPrepareUI.d(LuckyMoneyPrepareUI.this).mHR;
            LuckyMoneyPrepareUI.b(LuckyMoneyPrepareUI.this).setTitle(LuckyMoneyPrepareUI.this.getString(a.i.sVp));
            LuckyMoneyPrepareUI.b(LuckyMoneyPrepareUI.this).fO(true);
            if ((d > 0.0D) && (i > 0)) {
              LuckyMoneyPrepareUI.b(LuckyMoneyPrepareUI.this).BG(com.tencent.mm.wallet_core.ui.e.r(d * i));
            }
            LuckyMoneyPrepareUI.e(LuckyMoneyPrepareUI.this).setText(localObject4);
            com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(LuckyMoneyPrepareUI.f(LuckyMoneyPrepareUI.this)), Integer.valueOf(2) });
            GMTrace.o(9881109135360L, 73620);
          }
        };
        this.jZU.setMovementMethod(LinkMovementMethod.getInstance());
        this.jZU.setText((CharSequence)localObject4);
        this.jZU.setVisibility(0);
        break;
        localObject1 = localObject4;
        localObject2 = localObject3;
        if (this.jtE == 2)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LuckyMoneyPrepareUI", "f2f hb");
          this.mLK.setVisibility(8);
          localObject1 = localObject4;
          localObject2 = localObject3;
        }
      }
      label1296:
      if (this.mType == 1)
      {
        this.jZU.setText(this.mIa.mHS);
        this.jZU.setVisibility(0);
      }
      else if (this.mType == 0)
      {
        this.jZU.setText(this.mIa.mHT);
        this.jZU.setVisibility(0);
      }
    }
  }
  
  protected final void Qg()
  {
    GMTrace.i(9823932383232L, 73194);
    if ((this.mLL != null) && (this.mLL.isShown())) {
      this.mLL.setVisibility(8);
    }
    GMTrace.o(9823932383232L, 73194);
  }
  
  public final void aMq()
  {
    GMTrace.i(9824066600960L, 73195);
    com.tencent.mm.plugin.luckymoney.a.a.aLP();
    this.mIa = com.tencent.mm.plugin.luckymoney.a.a.aLQ().aMb();
    int i;
    double d2;
    double d1;
    if ((this.mLJ.aMI() != 3) && (this.mLI.aMI() != 3))
    {
      i = this.mLI.aMQ();
      d2 = this.mLJ.aMJ();
      if (this.mType == 0)
      {
        d2 *= i;
        d1 = this.mLJ.aMJ();
      }
    }
    for (;;)
    {
      if (this.mLQ.aMG())
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LuckyMoneyPrepareUI", "has error");
        this.mFZ.setClickable(false);
        this.mFZ.setEnabled(false);
        b(d2, this.mPY);
        GMTrace.o(9824066600960L, 73195);
        return;
        if (i > 0) {
          d1 = this.mLJ.aMJ() / i;
        }
      }
      else
      {
        boolean bool2;
        if ((d2 == 0.0D) || (d1 == 0.0D)) {
          bool2 = true;
        }
        for (;;)
        {
          boolean bool1;
          if (bool2)
          {
            this.mFZ.setClickable(false);
            this.mFZ.setEnabled(false);
            break;
            if ((d2 > this.mIa.mHR) && (this.mIa.mHR > 0.0D))
            {
              this.mLQ.qn(getString(a.i.sVo, new Object[] { Math.round(this.mIa.mHR), bg.aq(this.mIa.mHZ, "") }));
              bool2 = true;
              continue;
            }
            if (d1 <= 0.0D) {
              break label755;
            }
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LuckyMoneyPrepareUI", "perAmount " + d1);
            if (this.mType == 0)
            {
              if ((d1 <= this.mIa.mHU) || (this.mIa.mHU <= 0.0D)) {
                break label749;
              }
              this.mLQ.qn(getString(a.i.sUU, new Object[] { Math.round(this.mIa.mHU), bg.aq(this.mIa.mHZ, "") }));
              bool1 = true;
            }
          }
          for (;;)
          {
            label409:
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LuckyMoneyPrepareUI", "furtherCheckHasErr:" + bool1 + " for max value");
            bool2 = bool1;
            if (!bool1)
            {
              if (this.mType != 0) {
                break label658;
              }
              bool2 = bool1;
              if (d1 < this.mIa.mHW)
              {
                this.mLQ.qn(getString(a.i.sUV, new Object[] { com.tencent.mm.wallet_core.ui.e.r(this.mIa.mHW), bg.aq(this.mIa.mHZ, "") }));
                bool2 = true;
              }
            }
            for (;;)
            {
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LuckyMoneyPrepareUI", "furtherCheckHasErr:" + bool2 + " for min value");
              break;
              if ((d1 <= this.mIa.mHV) || (this.mIa.mHV <= 0.0D)) {
                break label749;
              }
              this.mLQ.qn(getString(a.i.sUU, new Object[] { Math.round(this.mIa.mHV), bg.aq(this.mIa.mHZ, "") }));
              this.mLI.onError();
              this.mLJ.onError();
              bool1 = true;
              break label409;
              label658:
              bool2 = bool1;
              if (d1 < 0.01D)
              {
                this.mLQ.qn(getString(a.i.sUV, new Object[] { "0.01", bg.aq(this.mIa.mHZ, "") }));
                this.mLI.onError();
                this.mLJ.onError();
                bool2 = true;
              }
            }
            this.mFZ.setClickable(true);
            this.mFZ.setEnabled(true);
            break;
            label749:
            bool1 = false;
          }
          label755:
          bool2 = false;
        }
      }
      d1 = 0.0D;
      continue;
      d1 = 0.0D;
      d2 = 0.0D;
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, final String paramString, k paramk)
  {
    GMTrace.i(9823261294592L, 73189);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LuckyMoneyPrepareUI", "errType:" + paramInt1 + " errCode:" + paramInt2 + " errMsg:" + paramString + " scenetype:" + paramk.getType());
    if ((paramk instanceof ac))
    {
      if ((this.hul != null) && (this.hul.isShowing())) {
        this.hul.dismiss();
      }
      if (this.jgp)
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LuckyMoneyPrepareUI", "has show alert return");
        GMTrace.o(9823261294592L, 73189);
        return true;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (ac)paramk;
        this.mLT = paramString.jWn;
        this.mLS = paramString.mFr;
        this.mLV = paramString.mJL;
        paramk = new PayInfo();
        paramk.eHG = paramString.mJK;
        paramk.ePL = 37;
        paramk.ePH = this.mChannel;
        com.tencent.mm.pluginsdk.wallet.g.a(this, paramk, 1);
        GMTrace.o(9823261294592L, 73189);
        return true;
      }
      if (paramInt2 == 401)
      {
        this.mFZ.setEnabled(false);
        this.mFZ.setClickable(false);
        this.ikv.z(5000L, 5000L);
        com.tencent.mm.ui.base.h.bm(this, paramString);
        GMTrace.o(9823261294592L, 73189);
        return true;
      }
      paramk = paramString;
      if (TextUtils.isEmpty(paramString)) {
        paramk = getString(a.i.tgK);
      }
      com.tencent.mm.ui.base.h.a(this, paramk, null, false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(9802054893568L, 73031);
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(9802054893568L, 73031);
        }
      });
      GMTrace.o(9823261294592L, 73189);
      return true;
    }
    if ((paramk instanceof com.tencent.mm.plugin.luckymoney.b.af))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (this.mLU)
        {
          com.tencent.mm.ui.snackbar.a.e(this, getString(a.i.dCJ));
          com.tencent.mm.sdk.platformtools.af.i(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(9796417748992L, 72989);
              LuckyMoneyPrepareUI.this.finish();
              GMTrace.o(9796417748992L, 72989);
            }
          }, 1800L);
        }
        for (;;)
        {
          GMTrace.o(9823261294592L, 73189);
          return true;
          aMB();
          this.mLN.setVisibility(0);
          this.mLN.postDelayed(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(9822053335040L, 73180);
              Intent localIntent = new Intent();
              localIntent.setClass(LuckyMoneyPrepareUI.this.vKB.vKW, LuckyMoneyIndexUI.class);
              localIntent.addFlags(67108864);
              LuckyMoneyPrepareUI.this.vKB.vKW.startActivity(localIntent);
              LuckyMoneyPrepareUI.this.finish();
              GMTrace.o(9822053335040L, 73180);
            }
          }, 1000L);
        }
      }
      if (paramInt2 == 402)
      {
        com.tencent.mm.ui.base.h.a(this.vKB.vKW, paramString, "", getString(a.i.sVf), getString(a.i.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(9815342448640L, 73130);
            paramAnonymousDialogInterface = new Intent();
            paramAnonymousDialogInterface.setClass(LuckyMoneyPrepareUI.this.vKB.vKW, LuckyMoneyMyRecordUI.class);
            paramAnonymousDialogInterface.putExtra("key_type", 1);
            LuckyMoneyPrepareUI.this.startActivity(paramAnonymousDialogInterface);
            GMTrace.o(9815342448640L, 73130);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(9872250765312L, 73554);
            GMTrace.o(9872250765312L, 73554);
          }
        });
        GMTrace.o(9823261294592L, 73189);
        return true;
      }
    }
    else
    {
      if ((paramk instanceof v))
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LuckyMoneyPrepareUI", "NetSceneLuckyMoneyGetConfig resp,errType=" + paramInt1 + ";errCode=" + paramInt2 + ";errMsg=" + paramString);
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramString = (v)paramk;
          com.tencent.mm.plugin.luckymoney.a.a.aLP();
          this.mIa = com.tencent.mm.plugin.luckymoney.a.a.aLQ().aMb();
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LuckyMoneyPrepareUI", "update config:" + this.mIa);
          if (this.mType != 1) {
            break label947;
          }
          this.mLJ.mOB = this.mIa.mHR;
          this.mLJ.mOC = this.mIa.mHW;
          this.mLI.qf(this.mIa.mHQ);
          this.mPY = paramString.mHY;
          this.mPX = paramString.jWC;
          this.mPZ = paramString.mIf;
          if ((!bg.nm(this.mPZ)) && (this.mLK != null)) {
            com.tencent.mm.sdk.platformtools.af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(9841112252416L, 73322);
                LuckyMoneyPrepareUI.g(LuckyMoneyPrepareUI.this).BI(LuckyMoneyPrepareUI.h(LuckyMoneyPrepareUI.this));
                GMTrace.o(9841112252416L, 73322);
              }
            });
          }
          if ((paramString.mJx) && (this.mLU))
          {
            paramk = (TextView)findViewById(a.f.szW);
            paramk.setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(9837891026944L, 73298);
                com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(LuckyMoneyPrepareUI.f(LuckyMoneyPrepareUI.this)), Integer.valueOf(9) });
                paramAnonymousView = new Intent();
                paramAnonymousView.setClass(LuckyMoneyPrepareUI.this.vKB.vKW, LuckyMoneyCanShareListUI.class);
                LuckyMoneyPrepareUI.this.startActivity(paramAnonymousView);
                GMTrace.o(9837891026944L, 73298);
              }
            });
            com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(aMr()), Integer.valueOf(8) });
            paramk.setVisibility(0);
          }
          if (bg.nm(paramString.jWE)) {
            break label964;
          }
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LuckyMoneyPrepareUI", "Put notice :" + paramString.jWE);
          this.mLP.setText(paramString.jWE);
          if (!bg.nm(paramString.mJz)) {
            this.mLP.setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(9883122401280L, 73635);
                com.tencent.mm.wallet_core.ui.e.m(LuckyMoneyPrepareUI.this.vKB.vKW, paramString.mJz, false);
                GMTrace.o(9883122401280L, 73635);
              }
            });
          }
          this.mLP.setVisibility(0);
          label857:
          paramk = new g.c();
          if ((paramString.mJB == null) || (bg.nm(paramString.mJB.content))) {
            break label976;
          }
        }
        label947:
        label964:
        label976:
        for (paramk.textColor = getResources().getColor(a.c.smS);; paramk.textColor = getResources().getColor(a.c.aOa))
        {
          g.a(this, this.mLO, paramString.mJB, paramk);
          cP(paramString.mHZ, paramString.mHY);
          b(0.0D, this.mPY);
          GMTrace.o(9823261294592L, 73189);
          return true;
          this.mLJ.mOB = this.mIa.mHU;
          break;
          this.mLP.setVisibility(8);
          break label857;
        }
      }
      if ((paramk instanceof com.tencent.mm.plugin.luckymoney.b.w))
      {
        hO(1645);
        if ((this.hul != null) && (this.hul.isShowing())) {
          this.hul.hide();
        }
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramString = ((com.tencent.mm.plugin.luckymoney.b.w)paramk).jWR;
          if (!bg.nm(paramString))
          {
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LuckyMoneyPrepareUI", "payUrl is not null");
            paramk = new Intent();
            paramk.putExtra("rawUrl", paramString);
            paramk.putExtra("showShare", false);
            com.tencent.mm.bj.d.b(this, "webview", ".ui.tools.WebViewUI", paramk, 3);
          }
          for (;;)
          {
            GMTrace.o(9823261294592L, 73189);
            return true;
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.LuckyMoneyPrepareUI", "payUrl is null");
          }
        }
      }
      else if ((paramk instanceof com.tencent.mm.plugin.luckymoney.f2f.a.c))
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          if (this.hul != null) {
            this.hul.dismiss();
          }
          paramString = new PayInfo();
          paramString.eHG = ((com.tencent.mm.plugin.luckymoney.f2f.a.c)paramk).eHG;
          paramString.ePL = 37;
          com.tencent.mm.pluginsdk.wallet.g.a(this, paramString, 4);
        }
        for (;;)
        {
          GMTrace.o(9823261294592L, 73189);
          return true;
          if (!bg.nm(paramString)) {
            com.tencent.mm.ui.base.h.b(this, paramString, getString(a.i.sUc), true);
          }
          this.hul.dismiss();
        }
      }
    }
    GMTrace.o(9823261294592L, 73189);
    return false;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(9823127076864L, 73188);
    if ((paramKeyEvent.getKeyCode() == 4) && (this.mLM.getVisibility() == 0))
    {
      this.mLM.setVisibility(8);
      aMA();
      GMTrace.o(9823127076864L, 73188);
      return true;
    }
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(9823127076864L, 73188);
    return bool;
  }
  
  public void finish()
  {
    GMTrace.i(9824469254144L, 73198);
    if (this.mQa != null)
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("key_realname_guide_helper", this.mQa);
      com.tencent.mm.bj.d.b(this, "wallet_core", ".id_verify.RealnameDialogActivity", localIntent);
    }
    super.finish();
    GMTrace.o(9824469254144L, 73198);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9822992859136L, 73187);
    int i = a.g.sNb;
    GMTrace.o(9822992859136L, 73187);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(9823529730048L, 73191);
    switch (paramInt1)
    {
    }
    for (;;)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      GMTrace.o(9823529730048L, 73191);
      return;
      if ((paramIntent != null) && (paramIntent.hasExtra("key_realname_guide_helper"))) {
        this.mQa = ((RealnameGuideHelper)paramIntent.getParcelableExtra("key_realname_guide_helper"));
      }
      if (paramInt2 == -1)
      {
        com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(aMr()), Integer.valueOf(5) });
        Object localObject1 = getIntent().getStringExtra("key_username");
        if ((this.mLU) && (!bg.nm((String)localObject1)))
        {
          com.tencent.mm.ui.base.h.bm(this, getString(a.i.dCJ));
          Object localObject2 = bh.q(this.mLV, "msg");
          if (localObject2 == null)
          {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.LuckyMoneyPrepareUI", "luckymoneyPrepareUI onActivityResult values is null");
            finish();
            GMTrace.o(9823529730048L, 73191);
            return;
          }
          localObject2 = (String)((Map)localObject2).get(".msg.appmsg.wcpayinfo.paymsgid");
          if (com.tencent.mm.plugin.luckymoney.a.a.aLP().aLS().BA((String)localObject2))
          {
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LuckyMoneyPrepareUI", "insert a local msg for luckymoney");
            if (!n.z(this.mLV, (String)localObject1, 1))
            {
              com.tencent.mm.sdk.platformtools.w.e("MicroMsg.LuckyMoneyPrepareUI", "LuckyMoneyUtil.sendLocalMsg fail!");
              com.tencent.mm.plugin.luckymoney.a.a.aLP().aLS().BB((String)localObject2);
            }
          }
          for (;;)
          {
            finish();
            break;
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.LuckyMoneyPrepareUI", "it is a duplicate msg");
          }
        }
        aMB();
        localObject1 = findViewById(a.f.sAb);
        this.mLM.setVisibility(0);
        n.a((View)localObject1, null);
        this.ktP.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(9849702187008L, 73386);
            com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(LuckyMoneyPrepareUI.f(LuckyMoneyPrepareUI.this)), Integer.valueOf(6) });
            n.a(LuckyMoneyPrepareUI.this, LuckyMoneyPrepareUI.c(LuckyMoneyPrepareUI.this), LuckyMoneyPrepareUI.s(LuckyMoneyPrepareUI.this), true);
            LuckyMoneyPrepareUI.t(LuckyMoneyPrepareUI.this).postDelayed(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(9839770075136L, 73312);
                LuckyMoneyPrepareUI.t(LuckyMoneyPrepareUI.this).setVisibility(8);
                LuckyMoneyPrepareUI.this.aMA();
                GMTrace.o(9839770075136L, 73312);
              }
            }, 100L);
            GMTrace.o(9849702187008L, 73386);
          }
        });
        ((ImageView)findViewById(a.f.szU)).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(9828227350528L, 73226);
            LuckyMoneyPrepareUI.t(LuckyMoneyPrepareUI.this).setVisibility(8);
            LuckyMoneyPrepareUI.this.aMA();
            GMTrace.o(9828227350528L, 73226);
          }
        });
        continue;
        if ((paramInt2 == -1) && (paramIntent != null))
        {
          localObject1 = paramIntent.getStringExtra("Select_Conv_User");
          com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(aMr()), Integer.valueOf(7), localObject1 });
          if (!bg.nm((String)localObject1)) {
            l(new com.tencent.mm.plugin.luckymoney.b.af(((String)localObject1).replaceAll(",", "|"), this.mLS, "v1.0"));
          } else {
            finish();
          }
        }
        else if (paramInt2 == 0)
        {
          localObject1 = new Intent();
          ((Intent)localObject1).setClass(this.vKB.vKW, LuckyMoneyMyRecordUI.class);
          ((Intent)localObject1).putExtra("key_type", 1);
          startActivity((Intent)localObject1);
          continue;
          if ((paramIntent != null) && (paramIntent.hasExtra("result_data")))
          {
            localObject1 = paramIntent.getBundleExtra("result_data");
            if (localObject1 != null)
            {
              int i = bg.getInt(((Bundle)localObject1).getString("payState", "2"), 0);
              com.tencent.mm.sdk.platformtools.w.e("MicroMsg.LuckyMoneyPrepareUI", "onActivityResult REQUEST_CODE_H5_PAY payState is " + i + ";STATE_H5_PAY_SUCC=0");
              if (i == 0) {
                finish();
              }
            }
            else
            {
              com.tencent.mm.sdk.platformtools.w.e("MicroMsg.LuckyMoneyPrepareUI", "onActivityResult REQUEST_CODE_H5_PAY bundle is null");
              continue;
              finish();
            }
          }
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9822321770496L, 73182);
    super.onCreate(paramBundle);
    this.mType = getIntent().getIntExtra("key_type", 1);
    this.mLR = getIntent().getIntExtra("key_way", 3);
    this.jtE = getIntent().getIntExtra("key_from", 0);
    if (this.jtE == 1) {}
    for (boolean bool = true;; bool = false)
    {
      this.mLU = bool;
      this.mChannel = getIntent().getIntExtra("pay_channel", -1);
      b(new v("v1.0", (byte)0), true);
      com.tencent.mm.plugin.luckymoney.a.a.aLP();
      this.mIa = com.tencent.mm.plugin.luckymoney.a.a.aLQ().aMb();
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LuckyMoneyPrepareUI", "mInWay:" + this.mLR + "mChannel:" + this.mChannel);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LuckyMoneyPrepareUI", "type=" + this.mType + ", fromAppPanel=" + this.mLU + ", config " + this.mIa);
      MP();
      com.tencent.mm.sdk.b.a.vgX.a(this.mQb);
      com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(aMr()), Integer.valueOf(1) });
      GMTrace.o(9822321770496L, 73182);
      return;
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(9822858641408L, 73186);
    super.onDestroy();
    this.mLQ.clear();
    this.ikv.bQn();
    if ((this.hul != null) && (this.hul.isShowing())) {
      this.hul.dismiss();
    }
    com.tencent.mm.sdk.b.a.vgX.c(this.mQb);
    GMTrace.o(9822858641408L, 73186);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(9823798165504L, 73193);
    if ((paramInt == 4) && (this.mLL != null) && (this.mLL.isShown()))
    {
      this.mLL.setVisibility(8);
      GMTrace.o(9823798165504L, 73193);
      return true;
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(9823798165504L, 73193);
    return bool;
  }
  
  protected void onResume()
  {
    GMTrace.i(9822455988224L, 73183);
    super.onResume();
    hN(1970);
    GMTrace.o(9822455988224L, 73183);
  }
  
  protected void onStop()
  {
    GMTrace.i(9822590205952L, 73184);
    super.onStop();
    hO(1970);
    GMTrace.o(9822590205952L, 73184);
  }
  
  protected final void z(final View paramView, final int paramInt)
  {
    GMTrace.i(9823663947776L, 73192);
    this.mKeyboard = ((MyKeyboardWindow)findViewById(a.f.sHx));
    this.mLL = findViewById(a.f.sHw);
    View localView = findViewById(a.f.hAy);
    final EditText localEditText = (EditText)paramView.findViewById(a.f.syw);
    if ((this.mKeyboard == null) || (localEditText == null) || (this.mLL == null))
    {
      GMTrace.o(9823663947776L, 73192);
      return;
    }
    com.tencent.mm.wallet_core.ui.e.setNoSystemInputOnEditText(localEditText);
    localEditText.setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public final void onFocusChange(final View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        GMTrace.i(9883390836736L, 73637);
        if ((paramAnonymousView.isFocused()) && (!this.hra))
        {
          ((InputMethodManager)LuckyMoneyPrepareUI.this.vKB.vKW.getSystemService("input_method")).hideSoftInputFromWindow(paramAnonymousView.getWindowToken(), 0);
          new ae().postDelayed(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(9817758367744L, 73148);
              if ((!LuckyMoneyPrepareUI.this.mLL.isShown()) && (paramAnonymousView.isShown())) {
                LuckyMoneyPrepareUI.this.mLL.setVisibility(0);
              }
              LuckyMoneyPrepareUI.b(LuckyMoneyPrepareUI.this, LuckyMoneyPrepareUI.17.this.hre);
              LuckyMoneyPrepareUI.this.mKeyboard.setInputEditText((EditText)paramAnonymousView);
              ((InputMethodManager)LuckyMoneyPrepareUI.this.vKB.vKW.getSystemService("input_method")).hideSoftInputFromWindow(paramAnonymousView.getWindowToken(), 0);
              GMTrace.o(9817758367744L, 73148);
            }
          }, 300L);
          GMTrace.o(9883390836736L, 73637);
          return;
        }
        new ae().postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(9835206672384L, 73278);
            LuckyMoneyPrepareUI.this.Qg();
            ((InputMethodManager)LuckyMoneyPrepareUI.this.vKB.vKW.getSystemService("input_method")).showSoftInput(LuckyMoneyPrepareUI.17.this.hrc, 0);
            GMTrace.o(9835206672384L, 73278);
          }
        }, 200L);
        GMTrace.o(9883390836736L, 73637);
      }
    });
    localEditText.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9809839521792L, 73089);
        if ((!LuckyMoneyPrepareUI.this.mLL.isShown()) && (!this.hra))
        {
          LuckyMoneyPrepareUI.this.mLL.setVisibility(0);
          LuckyMoneyPrepareUI.this.mKeyboard.setInputEditText((EditText)paramAnonymousView);
          LuckyMoneyPrepareUI.b(LuckyMoneyPrepareUI.this, paramInt);
          GMTrace.o(9809839521792L, 73089);
          return;
        }
        if (this.hra)
        {
          LuckyMoneyPrepareUI.this.mLL.setVisibility(8);
          ((InputMethodManager)LuckyMoneyPrepareUI.this.vKB.vKW.getSystemService("input_method")).showSoftInput(localEditText, 0);
        }
        GMTrace.o(9809839521792L, 73089);
      }
    });
    TextView localTextView = (TextView)paramView.findViewById(a.f.sxz);
    if (localTextView != null) {
      localTextView.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(9874935119872L, 73574);
          if ((LuckyMoneyPrepareUI.this.mLL.isShown()) && (!this.hra))
          {
            if (LuckyMoneyPrepareUI.this.mKeyboard != null)
            {
              LuckyMoneyPrepareUI.this.mKeyboard.setInputEditText(localEditText);
              GMTrace.o(9874935119872L, 73574);
            }
          }
          else
          {
            if ((!LuckyMoneyPrepareUI.this.mLL.isShown()) && (!this.hra))
            {
              ((InputMethodManager)LuckyMoneyPrepareUI.this.vKB.vKW.getSystemService("input_method")).hideSoftInputFromWindow(paramAnonymousView.getWindowToken(), 0);
              new ae().postDelayed(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(9797088837632L, 72994);
                  LuckyMoneyPrepareUI.this.mLL.setVisibility(0);
                  LuckyMoneyPrepareUI.19.this.hrd.requestFocus();
                  if (LuckyMoneyPrepareUI.this.mKeyboard != null) {
                    LuckyMoneyPrepareUI.this.mKeyboard.setInputEditText(LuckyMoneyPrepareUI.19.this.hrc);
                  }
                  LuckyMoneyPrepareUI.b(LuckyMoneyPrepareUI.this, LuckyMoneyPrepareUI.19.this.hre);
                  GMTrace.o(9797088837632L, 72994);
                }
              }, 200L);
              GMTrace.o(9874935119872L, 73574);
              return;
            }
            if (this.hra)
            {
              LuckyMoneyPrepareUI.this.mLL.setVisibility(8);
              ((InputMethodManager)LuckyMoneyPrepareUI.this.vKB.vKW.getSystemService("input_method")).showSoftInput(localEditText, 0);
            }
          }
          GMTrace.o(9874935119872L, 73574);
        }
      });
    }
    localView.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9801518022656L, 73027);
        LuckyMoneyPrepareUI.this.Qg();
        GMTrace.o(9801518022656L, 73027);
      }
    });
    GMTrace.o(9823663947776L, 73192);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\ui\LuckyMoneyPrepareUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.luckymoney.sns;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.SpannableString;
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
import android.view.animation.BounceInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.luckymoney.b.ac;
import com.tencent.mm.plugin.luckymoney.b.af;
import com.tencent.mm.plugin.luckymoney.b.c;
import com.tencent.mm.plugin.luckymoney.b.d;
import com.tencent.mm.plugin.luckymoney.b.i;
import com.tencent.mm.plugin.luckymoney.b.n;
import com.tencent.mm.plugin.luckymoney.b.v;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyCanShareListUI;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyIndexUI;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView;
import com.tencent.mm.plugin.luckymoney.ui.g.c;
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
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.q;
import com.tenpay.android.wechat.MyKeyboardWindow;
import java.util.Map;

@com.tencent.mm.ui.base.a(19)
public class SnsLuckyMoneyPrepareUI
  extends LuckyMoneyBaseUI
  implements com.tencent.mm.plugin.luckymoney.ui.f
{
  protected Dialog hul;
  private aj ikv;
  protected TextView jZR;
  private TextView jZU;
  private ScrollView kFq;
  protected Button ktP;
  private int mChannel;
  protected Button mFZ;
  private c mIa;
  protected MyKeyboardWindow mKeyboard;
  protected LuckyMoneyNumInputView mLI;
  protected LuckyMoneyMoneyInputView mLJ;
  protected LuckyMoneyTextInputView mLK;
  protected View mLL;
  private View mLM;
  private View mLN;
  private ViewGroup mLO;
  private TextView mLP;
  private com.tencent.mm.plugin.luckymoney.ui.a mLQ;
  private int mLR;
  private String mLS;
  private int mLT;
  private boolean mLU;
  private String mLV;
  private com.tencent.mm.wallet_core.ui.a mLW;
  private int mType;
  
  public SnsLuckyMoneyPrepareUI()
  {
    GMTrace.i(9896946827264L, 73738);
    this.mLI = null;
    this.mLJ = null;
    this.mLK = null;
    this.jZR = null;
    this.mFZ = null;
    this.ktP = null;
    this.hul = null;
    this.mLQ = new com.tencent.mm.plugin.luckymoney.ui.a();
    this.ikv = null;
    GMTrace.o(9896946827264L, 73738);
  }
  
  private int aMr()
  {
    GMTrace.i(9898557440000L, 73750);
    if (this.mLU)
    {
      if (getIntent().getIntExtra("key_chatroom_num", 0) > 0)
      {
        GMTrace.o(9898557440000L, 73750);
        return 2;
      }
      GMTrace.o(9898557440000L, 73750);
      return 1;
    }
    GMTrace.o(9898557440000L, 73750);
    return 3;
  }
  
  protected final void MP()
  {
    GMTrace.i(9897215262720L, 73740);
    q(getResources().getDrawable(a.e.snX));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9885538320384L, 73653);
        SnsLuckyMoneyPrepareUI.this.finish();
        GMTrace.o(9885538320384L, 73653);
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
    this.kFq = ((ScrollView)findViewById(a.f.sAy));
    this.mLP = ((TextView)findViewById(a.f.szX));
    final Object localObject1;
    if (this.mType == 1)
    {
      this.mLJ.setTitle(getString(a.i.sVp));
      this.mLJ.fO(true);
      this.mLJ.mOA = this;
      this.mLI.mOA = this;
      this.mLK.mOA = this;
      localObject1 = (EditText)this.mLJ.findViewById(a.f.syw);
      final Object localObject2 = (EditText)this.mLI.findViewById(a.f.syw);
      com.tencent.mm.wallet_core.ui.e.setNoSystemInputOnEditText((EditText)localObject1);
      ((InputMethodManager)this.vKB.vKW.getSystemService("input_method")).showSoftInput((View)localObject1, 0);
      ((EditText)localObject1).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(9894933561344L, 73723);
          localObject1.setOnClickListener(null);
          localObject2.setOnClickListener(null);
          SnsLuckyMoneyPrepareUI.this.z(SnsLuckyMoneyPrepareUI.this.mLJ, 2);
          SnsLuckyMoneyPrepareUI.this.z(SnsLuckyMoneyPrepareUI.this.mLI, 0);
          SnsLuckyMoneyPrepareUI.this.mKeyboard.setXMode(2);
          SnsLuckyMoneyPrepareUI.this.mKeyboard.setInputEditText((EditText)paramAnonymousView);
          SnsLuckyMoneyPrepareUI.k(SnsLuckyMoneyPrepareUI.this);
          GMTrace.o(9894933561344L, 73723);
        }
      });
      final Object localObject3 = (TextView)this.mLJ.findViewById(a.f.sxz);
      if (localObject3 != null) {
        ((TextView)localObject3).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(9888491110400L, 73675);
            localObject1.setOnClickListener(null);
            localObject2.setOnClickListener(null);
            SnsLuckyMoneyPrepareUI.this.z(SnsLuckyMoneyPrepareUI.this.mLJ, 2);
            SnsLuckyMoneyPrepareUI.this.z(SnsLuckyMoneyPrepareUI.this.mLI, 0);
            SnsLuckyMoneyPrepareUI.this.mKeyboard.setXMode(2);
            SnsLuckyMoneyPrepareUI.k(SnsLuckyMoneyPrepareUI.this);
            GMTrace.o(9888491110400L, 73675);
          }
        });
      }
      com.tencent.mm.wallet_core.ui.e.setNoSystemInputOnEditText((EditText)localObject2);
      ((InputMethodManager)this.vKB.vKW.getSystemService("input_method")).showSoftInput((View)localObject2, 0);
      ((EditText)localObject2).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(9892786077696L, 73707);
          localObject1.setOnClickListener(null);
          localObject2.setOnClickListener(null);
          SnsLuckyMoneyPrepareUI.this.z(SnsLuckyMoneyPrepareUI.this.mLJ, 2);
          SnsLuckyMoneyPrepareUI.this.z(SnsLuckyMoneyPrepareUI.this.mLI, 0);
          SnsLuckyMoneyPrepareUI.this.mKeyboard.setXMode(0);
          SnsLuckyMoneyPrepareUI.this.mKeyboard.setInputEditText((EditText)paramAnonymousView);
          SnsLuckyMoneyPrepareUI.k(SnsLuckyMoneyPrepareUI.this);
          GMTrace.o(9892786077696L, 73707);
        }
      });
      if (this.mIa != null)
      {
        if (this.mType != 1) {
          break label1049;
        }
        this.mLJ.mOB = this.mIa.mHR;
        label459:
        this.mLJ.mOC = this.mIa.mHW;
      }
      if ((!this.mLU) || (getIntent().getIntExtra("key_chatroom_num", 0) > 1)) {
        break label1066;
      }
      this.mLI.BH("1");
      label504:
      this.mLI.qf(this.mIa.mHQ);
      this.mLI.mPM = 1;
      w.d("MicroMsg.LuckyMoneyPrepareUI", "init num=" + this.mLI.aMQ());
      this.mLJ.aMK();
      if (!this.mLU) {
        break label1091;
      }
      if (getIntent().getIntExtra("key_chatroom_num", 0) <= 0) {
        break label1079;
      }
      final Object localObject4 = getString(a.i.sUC);
      Object localObject5 = getString(a.i.sUz);
      localObject1 = getString(a.i.sUB);
      localObject2 = getString(a.i.sUA);
      localObject3 = new SpannableString((String)localObject4 + (String)localObject5);
      com.tencent.mm.plugin.wallet_core.ui.f localf = new com.tencent.mm.plugin.wallet_core.ui.f(this);
      ((SpannableString)localObject3).setSpan(localf, ((String)localObject4).length(), ((String)localObject4).length() + ((String)localObject5).length(), 33);
      localObject4 = new SpannableString((String)localObject1 + (String)localObject2);
      localObject5 = new com.tencent.mm.plugin.wallet_core.ui.f(this);
      ((SpannableString)localObject4).setSpan(localObject5, ((String)localObject1).length(), ((String)localObject1).length() + ((String)localObject2).length(), 33);
      localf.rmz = new f.a()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(9890370158592L, 73689);
          int i = SnsLuckyMoneyPrepareUI.this.mLI.aMQ();
          double d = SnsLuckyMoneyPrepareUI.this.mLJ.aMJ();
          SnsLuckyMoneyPrepareUI.a(SnsLuckyMoneyPrepareUI.this, 0);
          SnsLuckyMoneyPrepareUI.this.mLJ.mType = SnsLuckyMoneyPrepareUI.a(SnsLuckyMoneyPrepareUI.this);
          SnsLuckyMoneyPrepareUI.this.mLJ.fO(false);
          SnsLuckyMoneyPrepareUI.this.mLJ.setTitle(SnsLuckyMoneyPrepareUI.this.getString(a.i.sVq));
          if ((d > 0.0D) && (i > 0)) {
            SnsLuckyMoneyPrepareUI.this.mLJ.BG(com.tencent.mm.wallet_core.ui.e.r(d / i));
          }
          SnsLuckyMoneyPrepareUI.this.mLJ.mOB = SnsLuckyMoneyPrepareUI.b(SnsLuckyMoneyPrepareUI.this).mHU;
          SnsLuckyMoneyPrepareUI.c(SnsLuckyMoneyPrepareUI.this).setText(localObject4);
          com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(SnsLuckyMoneyPrepareUI.d(SnsLuckyMoneyPrepareUI.this)), Integer.valueOf(3) });
          GMTrace.o(9890370158592L, 73689);
        }
      };
      ((com.tencent.mm.plugin.wallet_core.ui.f)localObject5).rmz = new f.a()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(9892517642240L, 73705);
          int i = SnsLuckyMoneyPrepareUI.this.mLI.aMQ();
          double d = SnsLuckyMoneyPrepareUI.this.mLJ.aMJ();
          SnsLuckyMoneyPrepareUI.a(SnsLuckyMoneyPrepareUI.this, 1);
          SnsLuckyMoneyPrepareUI.this.mLJ.mType = SnsLuckyMoneyPrepareUI.a(SnsLuckyMoneyPrepareUI.this);
          SnsLuckyMoneyPrepareUI.this.mLJ.setTitle(SnsLuckyMoneyPrepareUI.this.getString(a.i.sVp));
          SnsLuckyMoneyPrepareUI.this.mLJ.fO(true);
          if ((d > 0.0D) && (i > 0)) {
            SnsLuckyMoneyPrepareUI.this.mLJ.BG(com.tencent.mm.wallet_core.ui.e.r(d * i));
          }
          SnsLuckyMoneyPrepareUI.this.mLJ.mOB = SnsLuckyMoneyPrepareUI.b(SnsLuckyMoneyPrepareUI.this).mHR;
          SnsLuckyMoneyPrepareUI.c(SnsLuckyMoneyPrepareUI.this).setText(localObject3);
          com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(SnsLuckyMoneyPrepareUI.d(SnsLuckyMoneyPrepareUI.this)), Integer.valueOf(2) });
          GMTrace.o(9892517642240L, 73705);
        }
      };
      this.jZU.setMovementMethod(LinkMovementMethod.getInstance());
      this.jZU.setText((CharSequence)localObject3);
      this.jZU.setVisibility(0);
    }
    for (;;)
    {
      this.mFZ.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(9889027981312L, 73679);
          com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(SnsLuckyMoneyPrepareUI.d(SnsLuckyMoneyPrepareUI.this)), Integer.valueOf(4) });
          if (SnsLuckyMoneyPrepareUI.this.mLJ.aMI() != 0)
          {
            u.makeText(SnsLuckyMoneyPrepareUI.this.vKB.vKW, a.i.sZH, 0).show();
            GMTrace.o(9889027981312L, 73679);
            return;
          }
          int i = SnsLuckyMoneyPrepareUI.this.mLI.aMQ();
          double d = SnsLuckyMoneyPrepareUI.this.mLJ.aMJ();
          long l2 = 0L;
          long l1;
          String str;
          if (SnsLuckyMoneyPrepareUI.a(SnsLuckyMoneyPrepareUI.this) == 1)
          {
            l1 = com.tencent.mm.wallet_core.ui.e.t(d);
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xy().xh().set(356354, Integer.valueOf(i));
            str = SnsLuckyMoneyPrepareUI.this.mLK.getInput();
            paramAnonymousView = str;
            if (bg.nm(str)) {
              paramAnonymousView = SnsLuckyMoneyPrepareUI.this.getString(a.i.sUe);
            }
            str = SnsLuckyMoneyPrepareUI.this.getIntent().getStringExtra("key_username");
            if ((!SnsLuckyMoneyPrepareUI.e(SnsLuckyMoneyPrepareUI.this)) || (bg.nm(str))) {
              break label355;
            }
          }
          label355:
          for (paramAnonymousView = new ac(i, l1, l2, SnsLuckyMoneyPrepareUI.a(SnsLuckyMoneyPrepareUI.this), paramAnonymousView, n.aMg(), str, n.fr(str), q.zE(), q.zG(), SnsLuckyMoneyPrepareUI.f(SnsLuckyMoneyPrepareUI.this));; paramAnonymousView = new ac(i, l1, l2, SnsLuckyMoneyPrepareUI.a(SnsLuckyMoneyPrepareUI.this), paramAnonymousView, n.aMg(), null, null, q.zE(), q.zG(), SnsLuckyMoneyPrepareUI.f(SnsLuckyMoneyPrepareUI.this)))
          {
            SnsLuckyMoneyPrepareUI.this.b(paramAnonymousView, false);
            if (SnsLuckyMoneyPrepareUI.this.hul == null) {
              break label398;
            }
            SnsLuckyMoneyPrepareUI.this.hul.show();
            GMTrace.o(9889027981312L, 73679);
            return;
            l1 = com.tencent.mm.wallet_core.ui.e.t(i * d);
            l2 = com.tencent.mm.wallet_core.ui.e.t(d);
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xy().xh().set(356353, Integer.valueOf(i));
            break;
          }
          label398:
          SnsLuckyMoneyPrepareUI.this.hul = com.tencent.mm.wallet_core.ui.g.a(SnsLuckyMoneyPrepareUI.this.vKB.vKW, true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              GMTrace.i(9890101723136L, 73687);
              if ((SnsLuckyMoneyPrepareUI.this.hul != null) && (SnsLuckyMoneyPrepareUI.this.hul.isShowing())) {
                SnsLuckyMoneyPrepareUI.this.hul.hide();
              }
              if ((SnsLuckyMoneyPrepareUI.g(SnsLuckyMoneyPrepareUI.this).getVisibility() == 8) || (SnsLuckyMoneyPrepareUI.h(SnsLuckyMoneyPrepareUI.this).getVisibility() == 4))
              {
                w.i("MicroMsg.LuckyMoneyPrepareUI", "usr cancel, & visibility not visiable, so finish");
                SnsLuckyMoneyPrepareUI.this.finish();
              }
              SnsLuckyMoneyPrepareUI.this.mMW.aMc();
              GMTrace.o(9890101723136L, 73687);
            }
          });
          GMTrace.o(9889027981312L, 73679);
        }
      });
      this.jZR.setText(com.tencent.mm.wallet_core.ui.e.s(0.0D));
      this.mLQ.a(this.mLI);
      this.mLQ.a(this.mLJ);
      this.mLQ.a(this.mLK);
      localObject1 = (TextView)findViewById(a.f.szV);
      this.mLQ.g((TextView)localObject1);
      if ((this.mLU) && (this.mType == 1))
      {
        localObject1 = (TextView)findViewById(a.f.szY);
        ((TextView)localObject1).setText(getString(a.i.sUM, new Object[] { Integer.valueOf(getIntent().getIntExtra("key_chatroom_num", 8)) }));
        ((TextView)localObject1).setVisibility(0);
      }
      this.ikv = new aj(new aj.a()
      {
        public final boolean pM()
        {
          GMTrace.i(9888222674944L, 73673);
          int i;
          double d2;
          if ((SnsLuckyMoneyPrepareUI.this.mLJ.aMI() != 3) && (SnsLuckyMoneyPrepareUI.this.mLI.aMI() != 3))
          {
            i = SnsLuckyMoneyPrepareUI.this.mLI.aMQ();
            d2 = SnsLuckyMoneyPrepareUI.this.mLJ.aMJ();
            d1 = d2;
            if (SnsLuckyMoneyPrepareUI.a(SnsLuckyMoneyPrepareUI.this) != 0) {}
          }
          for (double d1 = d2 * i;; d1 = 0.0D)
          {
            if ((d1 == 0.0D) || (d1 > SnsLuckyMoneyPrepareUI.b(SnsLuckyMoneyPrepareUI.this).mHR) || (SnsLuckyMoneyPrepareUI.i(SnsLuckyMoneyPrepareUI.this).aMH()))
            {
              SnsLuckyMoneyPrepareUI.this.mFZ.setClickable(false);
              SnsLuckyMoneyPrepareUI.this.mFZ.setEnabled(false);
            }
            for (;;)
            {
              w.i("MicroMsg.LuckyMoneyPrepareUI", "onTimeExpired & check: amount=" + d1 + ", hasErr=" + SnsLuckyMoneyPrepareUI.i(SnsLuckyMoneyPrepareUI.this).aMH());
              SnsLuckyMoneyPrepareUI.j(SnsLuckyMoneyPrepareUI.this).bQn();
              GMTrace.o(9888222674944L, 73673);
              return false;
              SnsLuckyMoneyPrepareUI.this.mFZ.setClickable(true);
              SnsLuckyMoneyPrepareUI.this.mFZ.setEnabled(true);
            }
          }
        }
      }, false);
      if (this.kFq != null) {
        this.kFq.setOnTouchListener(new View.OnTouchListener()
        {
          public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
          {
            GMTrace.i(9889296416768L, 73681);
            if (paramAnonymousMotionEvent.getAction() == 0)
            {
              SnsLuckyMoneyPrepareUI.this.Qg();
              SnsLuckyMoneyPrepareUI.this.aLo();
            }
            GMTrace.o(9889296416768L, 73681);
            return false;
          }
        });
      }
      this.mLJ.mType = this.mType;
      if ((!this.mLU) || (getIntent().getIntExtra("key_chatroom_num", 0) != 0)) {
        break label1156;
      }
      this.mLJ.requestFocus();
      GMTrace.o(9897215262720L, 73740);
      return;
      this.mLJ.setTitle(getString(a.i.sVq));
      this.mLJ.fO(false);
      break;
      label1049:
      this.mLJ.mOB = this.mIa.mHU;
      break label459;
      label1066:
      this.mLI.BH("");
      break label504;
      label1079:
      this.mLI.setVisibility(8);
      continue;
      label1091:
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
    label1156:
    this.mLI.requestFocus();
    GMTrace.o(9897215262720L, 73740);
  }
  
  protected final void Qg()
  {
    GMTrace.i(9898289004544L, 73748);
    if ((this.mLL != null) && (this.mLL.isShown()))
    {
      this.mLL.setVisibility(8);
      this.mLW.gU(false);
    }
    GMTrace.o(9898289004544L, 73748);
  }
  
  public final void aMq()
  {
    GMTrace.i(9898423222272L, 73749);
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
        this.mFZ.setClickable(false);
        this.mFZ.setEnabled(false);
        this.jZR.setText(com.tencent.mm.wallet_core.ui.e.s(d2));
        GMTrace.o(9898423222272L, 73749);
        return;
        if (i > 0) {
          d1 = this.mLJ.aMJ() / i;
        }
      }
      else
      {
        if ((d2 == 0.0D) || (d1 == 0.0D)) {
          i = 1;
        }
        for (;;)
        {
          label165:
          if (i != 0)
          {
            this.mFZ.setClickable(false);
            this.mFZ.setEnabled(false);
            break;
            if ((d2 > this.mIa.mHR) && (this.mIa.mHR > 0.0D))
            {
              this.mLQ.qn(getString(a.i.sVo, new Object[] { Math.round(this.mIa.mHR), bg.aq(this.mIa.mHZ, "") }));
              i = 1;
              continue;
            }
            if (d1 <= 0.0D) {
              break label656;
            }
            if (this.mType == 0)
            {
              if ((d1 <= this.mIa.mHU) || (this.mIa.mHU <= 0.0D)) {
                break label650;
              }
              this.mLQ.qn(getString(a.i.sUU, new Object[] { Math.round(this.mIa.mHU), bg.aq(this.mIa.mHZ, "") }));
              i = 1;
            }
          }
          for (;;)
          {
            if (i == 0)
            {
              if (this.mType == 0)
              {
                if (d1 >= this.mIa.mHW) {
                  break label647;
                }
                this.mLQ.qn(getString(a.i.sUV, new Object[] { com.tencent.mm.wallet_core.ui.e.r(this.mIa.mHW), bg.aq(this.mIa.mHZ, "") }));
                i = 1;
                break label165;
                if ((d1 <= this.mIa.mHV) || (this.mIa.mHV <= 0.0D)) {
                  break label650;
                }
                this.mLQ.qn(getString(a.i.sUU, new Object[] { Math.round(this.mIa.mHV), bg.aq(this.mIa.mHZ, "") }));
                this.mLI.onError();
                this.mLJ.onError();
                i = 1;
                continue;
              }
              if (d1 < 0.01D)
              {
                this.mLQ.qn(getString(a.i.sUV, new Object[] { "0.01", bg.aq(this.mIa.mHZ, "") }));
                this.mLI.onError();
                this.mLJ.onError();
                i = 1;
                break label165;
                this.mFZ.setClickable(true);
                this.mFZ.setEnabled(true);
                break;
              }
            }
            label647:
            break label165;
            label650:
            i = 0;
          }
          label656:
          i = 0;
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
    GMTrace.i(9897752133632L, 73744);
    if ((paramk instanceof ac))
    {
      if ((this.hul != null) && (this.hul.isShowing())) {
        this.hul.hide();
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
        GMTrace.o(9897752133632L, 73744);
        return true;
      }
      if (paramInt2 == 401)
      {
        this.mFZ.setEnabled(false);
        this.mFZ.setClickable(false);
        this.ikv.z(5000L, 5000L);
        com.tencent.mm.ui.base.h.bm(this, paramString);
        GMTrace.o(9897752133632L, 73744);
        return true;
      }
      com.tencent.mm.ui.base.h.bm(this, paramString);
      GMTrace.o(9897752133632L, 73744);
      return true;
    }
    if ((paramk instanceof af))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (this.mLU)
        {
          com.tencent.mm.ui.base.h.bm(this, getString(a.i.dCJ));
          finish();
        }
        for (;;)
        {
          GMTrace.o(9897752133632L, 73744);
          return true;
          aMB();
          this.mLN.postDelayed(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(9891980771328L, 73701);
              Intent localIntent = new Intent();
              localIntent.setClass(SnsLuckyMoneyPrepareUI.this.vKB.vKW, LuckyMoneyIndexUI.class);
              localIntent.addFlags(67108864);
              SnsLuckyMoneyPrepareUI.this.vKB.vKW.startActivity(localIntent);
              SnsLuckyMoneyPrepareUI.this.finish();
              GMTrace.o(9891980771328L, 73701);
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
            GMTrace.i(9888759545856L, 73677);
            paramAnonymousDialogInterface = new Intent();
            paramAnonymousDialogInterface.setClass(SnsLuckyMoneyPrepareUI.this.vKB.vKW, LuckyMoneyMyRecordUI.class);
            paramAnonymousDialogInterface.putExtra("key_type", 1);
            SnsLuckyMoneyPrepareUI.this.startActivity(paramAnonymousDialogInterface);
            GMTrace.o(9888759545856L, 73677);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(9889833287680L, 73685);
            GMTrace.o(9889833287680L, 73685);
          }
        });
        GMTrace.o(9897752133632L, 73744);
        return true;
      }
    }
    else if ((paramk instanceof v))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (v)paramk;
        com.tencent.mm.plugin.luckymoney.a.a.aLP();
        this.mIa = com.tencent.mm.plugin.luckymoney.a.a.aLQ().aMb();
        w.d("MicroMsg.LuckyMoneyPrepareUI", "update config:" + this.mIa);
        if (this.mType != 1) {
          break label680;
        }
        this.mLJ.mOB = this.mIa.mHR;
        this.mLJ.mOC = this.mIa.mHW;
        this.mLI.qf(this.mIa.mHQ);
        if ((paramString.mJx) && (this.mLU))
        {
          paramk = (TextView)findViewById(a.f.szW);
          paramk.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(9885806755840L, 73655);
              com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(SnsLuckyMoneyPrepareUI.d(SnsLuckyMoneyPrepareUI.this)), Integer.valueOf(9) });
              paramAnonymousView = new Intent();
              paramAnonymousView.setClass(SnsLuckyMoneyPrepareUI.this.vKB.vKW, LuckyMoneyCanShareListUI.class);
              SnsLuckyMoneyPrepareUI.this.startActivity(paramAnonymousView);
              GMTrace.o(9885806755840L, 73655);
            }
          });
          com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(aMr()), Integer.valueOf(8) });
          paramk.setVisibility(0);
        }
        if (bg.nm(paramString.jWE)) {
          break label697;
        }
        w.i("MicroMsg.LuckyMoneyPrepareUI", "Put notice :" + paramString.jWE);
        this.mLP.setText(paramString.jWE);
        if (!bg.nm(paramString.mJz)) {
          this.mLP.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(9891175464960L, 73695);
              com.tencent.mm.wallet_core.ui.e.m(SnsLuckyMoneyPrepareUI.this.vKB.vKW, paramString.mJz, false);
              GMTrace.o(9891175464960L, 73695);
            }
          });
        }
        this.mLP.setVisibility(0);
      }
      for (;;)
      {
        paramk = new g.c();
        paramk.textColor = getResources().getColor(a.c.smS);
        com.tencent.mm.plugin.luckymoney.ui.g.a(this, this.mLO, paramString.mJB, paramk);
        GMTrace.o(9897752133632L, 73744);
        return true;
        label680:
        this.mLJ.mOB = this.mIa.mHU;
        break;
        label697:
        this.mLP.setVisibility(8);
      }
    }
    GMTrace.o(9897752133632L, 73744);
    return false;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(9897617915904L, 73743);
    if ((paramKeyEvent.getKeyCode() == 4) && (this.mLM.getVisibility() == 0))
    {
      this.mLM.setVisibility(8);
      aMA();
      GMTrace.o(9897617915904L, 73743);
      return true;
    }
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(9897617915904L, 73743);
    return bool;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9897483698176L, 73742);
    int i = a.g.sNb;
    GMTrace.o(9897483698176L, 73742);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(9897886351360L, 73745);
    switch (paramInt1)
    {
    }
    for (;;)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      GMTrace.o(9897886351360L, 73745);
      return;
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
            w.e("MicroMsg.LuckyMoneyPrepareUI", "luckymoneyPrepareUI onActivityResult values is null");
            finish();
            GMTrace.o(9897886351360L, 73745);
            return;
          }
          localObject2 = (String)((Map)localObject2).get(".msg.appmsg.wcpayinfo.paymsgid");
          if (com.tencent.mm.plugin.luckymoney.a.a.aLP().aLS().BA((String)localObject2))
          {
            w.i("MicroMsg.LuckyMoneyPrepareUI", "insert a local msg for luckymoney");
            if (!n.z(this.mLV, (String)localObject1, 1))
            {
              w.e("MicroMsg.LuckyMoneyPrepareUI", "LuckyMoneyUtil.sendLocalMsg fail!");
              com.tencent.mm.plugin.luckymoney.a.a.aLP().aLS().BB((String)localObject2);
            }
          }
          for (;;)
          {
            finish();
            break;
            w.e("MicroMsg.LuckyMoneyPrepareUI", "it is a duplicate msg");
          }
        }
        aMB();
        new ae().postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(9886075191296L, 73657);
            SnsLuckyMoneyPrepareUI.l(SnsLuckyMoneyPrepareUI.this).setVisibility(0);
            ScaleAnimation localScaleAnimation = new ScaleAnimation(0.0F, 1.0F, 0.0F, 1.0F, 1, 0.5F, 1, 0.5F);
            localScaleAnimation.setDuration(800L);
            localScaleAnimation.setStartOffset(200L);
            localScaleAnimation.setInterpolator(new BounceInterpolator());
            SnsLuckyMoneyPrepareUI.this.findViewById(a.f.sAb).startAnimation(localScaleAnimation);
            GMTrace.o(9886075191296L, 73657);
          }
        }, 200L);
        this.ktP.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(9904060366848L, 73791);
            com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(SnsLuckyMoneyPrepareUI.d(SnsLuckyMoneyPrepareUI.this)), Integer.valueOf(6) });
            n.a(SnsLuckyMoneyPrepareUI.this, SnsLuckyMoneyPrepareUI.a(SnsLuckyMoneyPrepareUI.this), SnsLuckyMoneyPrepareUI.m(SnsLuckyMoneyPrepareUI.this), false);
            SnsLuckyMoneyPrepareUI.l(SnsLuckyMoneyPrepareUI.this).postDelayed(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(9904328802304L, 73793);
                SnsLuckyMoneyPrepareUI.l(SnsLuckyMoneyPrepareUI.this).setVisibility(8);
                SnsLuckyMoneyPrepareUI.n(SnsLuckyMoneyPrepareUI.this);
                GMTrace.o(9904328802304L, 73793);
              }
            }, 100L);
            GMTrace.o(9904060366848L, 73791);
          }
        });
        ((ImageView)findViewById(a.f.szU)).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(9890638594048L, 73691);
            SnsLuckyMoneyPrepareUI.l(SnsLuckyMoneyPrepareUI.this).setVisibility(8);
            SnsLuckyMoneyPrepareUI.o(SnsLuckyMoneyPrepareUI.this);
            GMTrace.o(9890638594048L, 73691);
          }
        });
        continue;
        if ((paramInt2 == -1) && (paramIntent != null))
        {
          localObject1 = paramIntent.getStringExtra("Select_Conv_User");
          com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(aMr()), Integer.valueOf(7), localObject1 });
          if (!bg.nm((String)localObject1)) {
            l(new af(((String)localObject1).replaceAll(",", "|"), this.mLS, "v1.0"));
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
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9897081044992L, 73739);
    super.onCreate(paramBundle);
    this.mType = getIntent().getIntExtra("key_type", 1);
    this.mLR = getIntent().getIntExtra("key_way", 3);
    if (getIntent().getIntExtra("key_from", 0) == 1) {}
    for (boolean bool = true;; bool = false)
    {
      this.mLU = bool;
      this.mChannel = getIntent().getIntExtra("pay_channel", -1);
      b(new v("v1.0", (byte)0), false);
      com.tencent.mm.plugin.luckymoney.a.a.aLP();
      this.mIa = com.tencent.mm.plugin.luckymoney.a.a.aLQ().aMb();
      w.d("MicroMsg.LuckyMoneyPrepareUI", "type=" + this.mType + ", fromAppPanel=" + this.mLU + ", config " + this.mIa);
      MP();
      com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(aMr()), Integer.valueOf(1) });
      GMTrace.o(9897081044992L, 73739);
      return;
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(9897349480448L, 73741);
    super.onDestroy();
    this.mLQ.clear();
    this.ikv.bQn();
    if ((this.hul != null) && (this.hul.isShowing())) {
      this.hul.dismiss();
    }
    GMTrace.o(9897349480448L, 73741);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(9898154786816L, 73747);
    if ((paramInt == 4) && (this.mLL != null) && (this.mLL.isShown()))
    {
      Qg();
      GMTrace.o(9898154786816L, 73747);
      return true;
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(9898154786816L, 73747);
    return bool;
  }
  
  protected final void z(View paramView, final int paramInt)
  {
    GMTrace.i(9898020569088L, 73746);
    this.mKeyboard = ((MyKeyboardWindow)findViewById(a.f.sHx));
    this.mLL = findViewById(a.f.sHw);
    View localView = findViewById(a.f.hAy);
    final EditText localEditText = (EditText)paramView.findViewById(a.f.syw);
    if ((this.mKeyboard == null) || (localEditText == null) || (this.mLL == null))
    {
      GMTrace.o(9898020569088L, 73746);
      return;
    }
    com.tencent.mm.wallet_core.ui.e.setNoSystemInputOnEditText(localEditText);
    localEditText.setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public final void onFocusChange(final View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        GMTrace.i(9893054513152L, 73709);
        if ((paramAnonymousView.isFocused()) && (!this.hra))
        {
          ((InputMethodManager)SnsLuckyMoneyPrepareUI.this.vKB.vKW.getSystemService("input_method")).hideSoftInputFromWindow(paramAnonymousView.getWindowToken(), 0);
          new ae().postDelayed(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(9901107576832L, 73769);
              if ((!SnsLuckyMoneyPrepareUI.this.mLL.isShown()) && (paramAnonymousView.isShown())) {
                SnsLuckyMoneyPrepareUI.k(SnsLuckyMoneyPrepareUI.this);
              }
              SnsLuckyMoneyPrepareUI.b(SnsLuckyMoneyPrepareUI.this, SnsLuckyMoneyPrepareUI.10.this.hre);
              SnsLuckyMoneyPrepareUI.this.mKeyboard.setInputEditText((EditText)paramAnonymousView);
              ((InputMethodManager)SnsLuckyMoneyPrepareUI.this.vKB.vKW.getSystemService("input_method")).hideSoftInputFromWindow(paramAnonymousView.getWindowToken(), 0);
              GMTrace.o(9901107576832L, 73769);
            }
          }, 300L);
          GMTrace.o(9893054513152L, 73709);
          return;
        }
        new ae().postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(9885269884928L, 73651);
            SnsLuckyMoneyPrepareUI.this.Qg();
            ((InputMethodManager)SnsLuckyMoneyPrepareUI.this.vKB.vKW.getSystemService("input_method")).showSoftInput(SnsLuckyMoneyPrepareUI.10.this.hrc, 0);
            GMTrace.o(9885269884928L, 73651);
          }
        }, 200L);
        GMTrace.o(9893054513152L, 73709);
      }
    });
    localEditText.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9890907029504L, 73693);
        if ((!SnsLuckyMoneyPrepareUI.this.mLL.isShown()) && (!this.hra))
        {
          SnsLuckyMoneyPrepareUI.k(SnsLuckyMoneyPrepareUI.this);
          SnsLuckyMoneyPrepareUI.b(SnsLuckyMoneyPrepareUI.this, paramInt);
          GMTrace.o(9890907029504L, 73693);
          return;
        }
        if (this.hra)
        {
          SnsLuckyMoneyPrepareUI.this.Qg();
          ((InputMethodManager)SnsLuckyMoneyPrepareUI.this.vKB.vKW.getSystemService("input_method")).showSoftInput(localEditText, 0);
        }
        GMTrace.o(9890907029504L, 73693);
      }
    });
    paramView = (TextView)paramView.findViewById(a.f.sxz);
    if (paramView != null) {
      paramView.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(9887954239488L, 73671);
          if ((!SnsLuckyMoneyPrepareUI.this.mLL.isShown()) && (!this.hra))
          {
            SnsLuckyMoneyPrepareUI.k(SnsLuckyMoneyPrepareUI.this);
            SnsLuckyMoneyPrepareUI.b(SnsLuckyMoneyPrepareUI.this, paramInt);
            GMTrace.o(9887954239488L, 73671);
            return;
          }
          if (this.hra)
          {
            SnsLuckyMoneyPrepareUI.this.Qg();
            ((InputMethodManager)SnsLuckyMoneyPrepareUI.this.vKB.vKW.getSystemService("input_method")).showSoftInput(localEditText, 0);
          }
          GMTrace.o(9887954239488L, 73671);
        }
      });
    }
    localView.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9892249206784L, 73703);
        SnsLuckyMoneyPrepareUI.this.Qg();
        GMTrace.o(9892249206784L, 73703);
      }
    });
    GMTrace.o(9898020569088L, 73746);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\sns\SnsLuckyMoneyPrepareUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
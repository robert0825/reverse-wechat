package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.modelstat.d;
import com.tencent.mm.plugin.luckymoney.b.ae;
import com.tencent.mm.plugin.luckymoney.b.i;
import com.tencent.mm.plugin.luckymoney.b.u;
import com.tencent.mm.plugin.wallet_core.id_verify.util.a.a;
import com.tencent.mm.plugin.wallet_core.model.x;
import com.tencent.mm.plugin.wxpay.a.d;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import com.tencent.mm.y.q;
import java.io.IOException;

@com.tencent.mm.ui.base.a(3)
public class En_fba4b94f
  extends LuckyMoneyBaseUI
{
  private r hsU;
  private TextView jZU;
  private long jro;
  private String lNG;
  private ImageView mGV;
  private ae mJZ;
  private ImageView mMg;
  private TextView mMh;
  private TextView mMi;
  private Button mMj;
  private View mMk;
  private ImageView mMl;
  private TextView mMm;
  private View mMn;
  private String mMo;
  private String mMp;
  private x mMq;
  private int maxSize;
  private int textSize;
  
  public En_fba4b94f()
  {
    GMTrace.i(9799102103552L, 73009);
    this.hsU = null;
    this.maxSize = 0;
    this.textSize = 0;
    this.mMq = null;
    this.jro = 0L;
    GMTrace.o(9799102103552L, 73009);
  }
  
  private int aMv()
  {
    GMTrace.i(9800175845376L, 73017);
    if (q.zE().equals(this.lNG))
    {
      GMTrace.o(9800175845376L, 73017);
      return 1;
    }
    GMTrace.o(9800175845376L, 73017);
    return 0;
  }
  
  private static int pY(int paramInt)
  {
    GMTrace.i(9800310063104L, 73018);
    if (paramInt == 1)
    {
      GMTrace.o(9800310063104L, 73018);
      return 1;
    }
    if (paramInt == 0)
    {
      GMTrace.o(9800310063104L, 73018);
      return 2;
    }
    GMTrace.o(9800310063104L, 73018);
    return 0;
  }
  
  protected final void MP()
  {
    GMTrace.i(9799773192192L, 73014);
    this.mMn = findViewById(a.f.sAg);
    this.mMg = ((ImageView)findViewById(a.f.sAi));
    this.mMh = ((TextView)findViewById(a.f.sAj));
    this.jZU = ((TextView)findViewById(a.f.sAk));
    this.mMi = ((TextView)findViewById(a.f.sAl));
    this.mMj = ((Button)findViewById(a.f.sAp));
    this.mMm = ((TextView)findViewById(a.f.sAm));
    this.mMk = findViewById(a.f.sAn);
    this.mMl = ((ImageView)findViewById(a.f.sxB));
    this.mGV = ((ImageView)findViewById(a.f.sAo));
    this.mGV.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9838696333312L, 73304);
        En_fba4b94f.this.finish();
        GMTrace.o(9838696333312L, 73304);
      }
    });
    this.maxSize = ((int)(com.tencent.mm.br.a.W(this.vKB.vKW, a.d.snr) * 1.375F));
    this.textSize = com.tencent.mm.br.a.V(this.vKB.vKW, a.d.snr);
    if (this.textSize > this.maxSize) {}
    for (int i = this.maxSize;; i = this.textSize)
    {
      this.textSize = i;
      this.mMi.setTextSize(0, this.textSize);
      this.vKB.hqF.setVisibility(8);
      this.hsU = h.a(this.vKB.vKW, getString(a.i.bKJ), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(9820040069120L, 73165);
          if ((En_fba4b94f.a(En_fba4b94f.this) != null) && (En_fba4b94f.a(En_fba4b94f.this).isShowing())) {
            En_fba4b94f.a(En_fba4b94f.this).dismiss();
          }
          En_fba4b94f.this.mMW.aMc();
          if ((En_fba4b94f.b(En_fba4b94f.this).getVisibility() == 8) || (En_fba4b94f.c(En_fba4b94f.this).getVisibility() == 4))
          {
            w.i("MicroMsg.LuckyMoneyReceiveUI", "user cancel & finish");
            En_fba4b94f.this.finish();
          }
          GMTrace.o(9820040069120L, 73165);
        }
      });
      if (this.mMj == null) {
        break label371;
      }
      String str = v.d(com.tencent.mm.sdk.platformtools.ab.getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.ab.bPU(), 0));
      if ((str == null) || (str.length() <= 0) || ((!str.equals("zh_CN")) && (!str.equals("zh_TW")) && (!str.equals("zh_HK")))) {
        break;
      }
      GMTrace.o(9799773192192L, 73014);
      return;
    }
    this.mMj.setBackgroundResource(a.e.sot);
    this.mMj.setText(a.i.sUT);
    label371:
    GMTrace.o(9799773192192L, 73014);
  }
  
  public final void aMw()
  {
    GMTrace.i(9800444280832L, 73019);
    b(new com.tencent.mm.plugin.luckymoney.b.ab(this.mJZ.msgType, this.mJZ.eqV, this.mJZ.mFr, this.mJZ.eYm, com.tencent.mm.plugin.luckymoney.b.n.aMg(), q.zG(), getIntent().getStringExtra("key_username"), "v1.0", this.mJZ.mJV), false);
    com.tencent.mm.plugin.luckymoney.b.n.b(this.mMj);
    GMTrace.o(9800444280832L, 73019);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, final k paramk)
  {
    GMTrace.i(9800041627648L, 73016);
    final boolean bool;
    if ((paramk instanceof ae))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.mJZ = ((ae)paramk);
        com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(5), Integer.valueOf(pY(this.mJZ.mIb)), Integer.valueOf(aMv()), Integer.valueOf(0), Integer.valueOf(1) });
        paramString = new x();
        paramString.field_mNativeUrl = this.mMp;
        paramString.field_hbType = this.mJZ.mIb;
        paramString.field_receiveAmount = this.mJZ.mJS;
        paramString.field_receiveTime = System.currentTimeMillis();
        paramString.field_hbStatus = this.mJZ.eYn;
        paramString.field_receiveStatus = this.mJZ.eYo;
        com.tencent.mm.plugin.wallet_core.model.n.byu().a(paramString);
        if (this.mJZ.eYo == 2)
        {
          b(new u(this.mMo, 11, 0, this.mMp, "v1.0"), false);
          GMTrace.o(9800041627648L, 73016);
          return true;
        }
        if ((this.hsU != null) && (this.hsU.isShowing())) {
          this.hsU.hide();
        }
        com.tencent.mm.plugin.luckymoney.b.n.a(this.mMg, this.mJZ.mIh, this.mJZ.mIB);
        com.tencent.mm.plugin.luckymoney.b.n.a(this.vKB.vKW, this.mMh, this.mJZ.mJR);
        bool = false;
        if ((this.mJZ.eYo != 1) && (this.mJZ.eYn != 4) && (this.mJZ.eYn != 5) && (this.mJZ.eYn != 1))
        {
          if (!bg.nm(this.mJZ.mIc))
          {
            this.jZU.setText(this.mJZ.mIc);
            this.jZU.setVisibility(0);
          }
          if (!bg.nm(this.mJZ.mIf))
          {
            com.tencent.mm.plugin.luckymoney.b.n.a(this.vKB.vKW, this.mMi, this.mJZ.mIf);
            this.mMi.setVisibility(0);
          }
          this.mMj.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(9883659272192L, 73639);
              com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(5), Integer.valueOf(En_fba4b94f.pZ(En_fba4b94f.d(En_fba4b94f.this).mIb)), Integer.valueOf(En_fba4b94f.e(En_fba4b94f.this)), Integer.valueOf(0), Integer.valueOf(2) });
              if ("0".equals(En_fba4b94f.d(En_fba4b94f.this).mJp))
              {
                com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(En_fba4b94f.this, En_fba4b94f.this.mMW, En_fba4b94f.d(En_fba4b94f.this).mJq, En_fba4b94f.d(En_fba4b94f.this).mJr, En_fba4b94f.d(En_fba4b94f.this).mJs, En_fba4b94f.d(En_fba4b94f.this).mJt, new a.a()
                {
                  public final boolean a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, boolean paramAnonymous2Boolean)
                  {
                    GMTrace.i(9871042805760L, 73545);
                    w.i("MicroMsg.LuckyMoneyReceiveUI", "showDisclaimerDialog resultCode=" + paramAnonymous2Int1 + ";errCode=" + paramAnonymous2Int2 + ";errMsg=" + paramAnonymous2String + ";hadAgree = " + paramAnonymous2Boolean);
                    if (paramAnonymous2Int1 == 1) {
                      w.i("MicroMsg.LuckyMoneyReceiveUI", "showDisclaimerDialog cancel");
                    }
                    for (;;)
                    {
                      GMTrace.o(9871042805760L, 73545);
                      return true;
                      if ((paramAnonymous2Boolean) || (paramAnonymous2Int1 == 2)) {
                        En_fba4b94f.this.aMw();
                      }
                    }
                  }
                }, false, 1003);
                GMTrace.o(9883659272192L, 73639);
                return;
              }
              En_fba4b94f.this.aMw();
              GMTrace.o(9883659272192L, 73639);
            }
          });
          if ((!q.zE().equals(this.lNG)) && ((this.mJZ.mIb != 1) || (!bool))) {
            break label786;
          }
          if (this.mJZ.mIb == 1) {
            this.mMm.setText(a.i.sUg);
          }
          this.mMk.setVisibility(0);
          this.mMk.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(9789572644864L, 72938);
              if (bool) {
                com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(6), Integer.valueOf(En_fba4b94f.pZ(En_fba4b94f.d(En_fba4b94f.this).mIb)), Integer.valueOf(En_fba4b94f.e(En_fba4b94f.this)), Integer.valueOf(0), Integer.valueOf(1) });
              }
              paramAnonymousView = new Intent();
              paramAnonymousView.setClass(En_fba4b94f.this.vKB.vKW, LuckyMoneyDetailUI.class);
              paramAnonymousView.putExtra("key_native_url", En_fba4b94f.d(En_fba4b94f.this).eYm);
              paramAnonymousView.putExtra("key_sendid", En_fba4b94f.d(En_fba4b94f.this).mFr);
              En_fba4b94f.this.startActivity(paramAnonymousView);
              En_fba4b94f.this.finish();
              GMTrace.o(9789572644864L, 72938);
            }
          });
          this.mMl.setVisibility(8);
        }
        for (;;)
        {
          com.tencent.mm.plugin.luckymoney.b.n.a(this.mMn, null);
          this.vKB.hqF.setVisibility(0);
          if ((this.mJZ.eYn != 5) || (paramString.field_receiveAmount <= 0L)) {
            break;
          }
          this.mMl.setVisibility(8);
          this.mMk.setVisibility(0);
          this.jZU.setVisibility(0);
          this.jZU.setText(a.i.sVe);
          this.mMi.setVisibility(8);
          findViewById(a.f.sAh).setVisibility(0);
          ((WalletTextView)findViewById(a.f.sxT)).setText(com.tencent.mm.wallet_core.ui.e.r(paramString.field_receiveAmount / 100.0D));
          this.mMk.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(9844065042432L, 73344);
              paramAnonymousView = new Intent();
              paramAnonymousView.setClass(En_fba4b94f.this.vKB.vKW, LuckyMoneyDetailUI.class);
              paramAnonymousView.putExtra("key_native_url", En_fba4b94f.d(En_fba4b94f.this).eYm);
              paramAnonymousView.putExtra("key_sendid", En_fba4b94f.d(En_fba4b94f.this).mFr);
              En_fba4b94f.this.startActivity(paramAnonymousView);
              En_fba4b94f.this.finish();
              GMTrace.o(9844065042432L, 73344);
            }
          });
          break;
          this.mMj.setBackgroundResource(a.e.sos);
          this.mMj.setText(a.i.sUQ);
          this.mMj.setOnClickListener(null);
          this.mMj.setVisibility(8);
          if (!bg.nm(this.mJZ.mFz))
          {
            this.jZU.setText(this.mJZ.mFz);
            this.jZU.setVisibility(0);
          }
          for (;;)
          {
            this.mMi.setText(this.mJZ.mIc);
            paramk = (RelativeLayout.LayoutParams)this.mMk.getLayoutParams();
            paramk.bottomMargin = BackwardSupportUtil.b.a(this.vKB.vKW, 30.0F);
            this.mMk.setLayoutParams(paramk);
            bool = true;
            break;
            this.jZU.setVisibility(8);
          }
          label786:
          this.mMk.setVisibility(8);
          this.mMl.setVisibility(0);
        }
      }
      if ((this.hsU != null) && (this.hsU.isShowing())) {
        this.hsU.hide();
      }
      GMTrace.o(9800041627648L, 73016);
      return false;
    }
    if ((paramk instanceof com.tencent.mm.plugin.luckymoney.b.ab))
    {
      com.tencent.mm.plugin.luckymoney.b.n.c(this.mMj);
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramk = (com.tencent.mm.plugin.luckymoney.b.ab)paramk;
        paramString = paramk.mJj;
        Object localObject;
        if (paramString.eYo == 2)
        {
          localObject = new Intent();
          ((Intent)localObject).setClass(this.vKB.vKW, LuckyMoneyDetailUI.class);
        }
        for (;;)
        {
          try
          {
            ((Intent)localObject).putExtra("key_detail_info", paramk.mJj.toByteArray());
            ((Intent)localObject).putExtra("key_jump_from", 2);
            ((Intent)localObject).putExtra("key_native_url", paramk.eYm);
            ((Intent)localObject).putExtra("key_sendid", paramk.mFr);
            if (com.tencent.mm.k.g.ut().getInt("PlayCoinSound", 0) > 0) {
              ((Intent)localObject).putExtra("play_sound", true);
            }
            if (paramk.mJk != null) {
              ((Intent)localObject).putExtra("key_realname_guide_helper", paramk.mJk);
            }
            startActivity((Intent)localObject);
            paramk = new x();
            paramk.field_mNativeUrl = this.mMp;
            paramk.field_hbType = paramString.mIb;
            paramk.field_receiveAmount = paramString.eYB;
            paramk.field_receiveTime = System.currentTimeMillis();
            paramk.field_hbStatus = paramString.eYn;
            paramk.field_receiveStatus = paramString.eYo;
            if (paramk.field_receiveAmount > 0L) {
              com.tencent.mm.plugin.wallet_core.model.n.byu().a(paramk);
            }
            finish();
            GMTrace.o(9800041627648L, 73016);
            return true;
          }
          catch (IOException localIOException)
          {
            w.w("MicroMsg.LuckyMoneyReceiveUI", "luckyMoneyDetail.toByteArray() fail! " + localIOException.getLocalizedMessage());
            continue;
          }
          this.mMj.setBackgroundResource(a.e.sos);
          this.mMj.setText(a.i.sUQ);
          this.mMj.setOnClickListener(null);
          this.mMj.setVisibility(8);
          if (!bg.nm(paramString.mFz))
          {
            this.jZU.setText(paramString.mFz);
            this.jZU.setVisibility(0);
          }
          for (;;)
          {
            this.mMi.setText(paramString.mIc);
            localObject = (RelativeLayout.LayoutParams)this.mMk.getLayoutParams();
            ((RelativeLayout.LayoutParams)localObject).bottomMargin = BackwardSupportUtil.b.a(this.vKB.vKW, 30.0F);
            this.mMk.setLayoutParams((ViewGroup.LayoutParams)localObject);
            if ((!q.zE().equals(this.lNG)) && (paramString.mIb != 1)) {
              break label1330;
            }
            this.mMk.setVisibility(0);
            this.mMk.setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(9828898439168L, 73231);
                paramAnonymousView = new Intent();
                if (paramk.mJk != null) {
                  paramAnonymousView.putExtra("key_realname_guide_helper", paramk.mJk);
                }
                paramAnonymousView.setClass(En_fba4b94f.this.vKB.vKW, LuckyMoneyDetailUI.class);
                paramAnonymousView.putExtra("key_native_url", paramk.eYm);
                paramAnonymousView.putExtra("key_sendid", paramk.mFr);
                En_fba4b94f.this.startActivity(paramAnonymousView);
                En_fba4b94f.this.finish();
                GMTrace.o(9828898439168L, 73231);
              }
            });
            this.mMl.setVisibility(8);
            break;
            this.jZU.setVisibility(8);
          }
          label1330:
          this.mMk.setVisibility(8);
          this.mMl.setVisibility(0);
        }
      }
      if (paramInt2 == 416)
      {
        if ((this.hsU != null) && (this.hsU.isShowing())) {
          this.hsU.hide();
        }
        paramString = new Bundle();
        paramString.putString("realname_verify_process_jump_activity", ".ui.En_fba4b94f");
        paramString.putString("realname_verify_process_jump_plugin", "luckymoney");
        this.mMj.setBackgroundResource(a.e.snT);
        bool = com.tencent.mm.plugin.luckymoney.b.n.a(this, paramInt2, paramk, paramString, false, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(9882853965824L, 73633);
            GMTrace.o(9882853965824L, 73633);
          }
        }, null, 1003);
        GMTrace.o(9800041627648L, 73016);
        return bool;
      }
    }
    else if ((paramk instanceof u))
    {
      if ((this.hsU != null) && (this.hsU.isShowing())) {
        this.hsU.hide();
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramk = (u)paramk;
        paramString = new Intent();
        paramString.setClass(this.vKB.vKW, LuckyMoneyDetailUI.class);
        try
        {
          paramString.putExtra("key_detail_info", paramk.mJj.toByteArray());
          paramString.putExtra("key_jump_from", 2);
          paramString.putExtra("key_native_url", this.mMp);
          paramString.putExtra("key_sendid", this.mMo);
          startActivity(paramString);
          finish();
          GMTrace.o(9800041627648L, 73016);
          return true;
        }
        catch (IOException paramk)
        {
          for (;;)
          {
            w.w("MicroMsg.LuckyMoneyReceiveUI", "luckyMoneyDetail.toByteArray() fail! " + paramk.getLocalizedMessage());
          }
        }
      }
      h.bm(this, paramString);
      finish();
      GMTrace.o(9800041627648L, 73016);
      return true;
    }
    GMTrace.o(9800041627648L, 73016);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9799907409920L, 73015);
    int i = a.g.sNc;
    GMTrace.o(9799907409920L, 73015);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9799236321280L, 73010);
    super.onCreate(paramBundle);
    this.mMp = getIntent().getStringExtra("key_native_url");
    w.i("MicroMsg.LuckyMoneyReceiveUI", "nativeUrl= " + bg.nl(this.mMp));
    MP();
    paramBundle = Uri.parse(bg.nl(this.mMp));
    try
    {
      this.mMo = paramBundle.getQueryParameter("sendid");
      this.mMq = com.tencent.mm.plugin.wallet_core.model.n.byu().Kr(this.mMp);
      if ((this.mMq != null) && (this.mMq.field_receiveAmount > 0L) && (bg.aH(this.mMq.field_receiveTime) < 86400000L))
      {
        w.i("MicroMsg.LuckyMoneyReceiveUI", "use cache this item %s %s", new Object[] { Long.valueOf(this.mMq.field_receiveTime), bg.nl(this.mMp) });
        paramBundle = new Intent();
        paramBundle.setClass(this.vKB.vKW, LuckyMoneyDetailUI.class);
        paramBundle.putExtra("key_native_url", this.mMq.field_mNativeUrl);
        paramBundle.putExtra("key_sendid", this.mMo);
        startActivity(paramBundle);
        finish();
        GMTrace.o(9799236321280L, 73010);
        return;
      }
      if (!bg.nm(this.mMo))
      {
        int i = bg.getInt(paramBundle.getQueryParameter("channelid"), 1);
        this.lNG = paramBundle.getQueryParameter("sendusername");
        b(new ae(i, this.mMo, this.mMp, getIntent().getIntExtra("key_way", 0), "v1.0"), false);
        if (this.hsU != null) {
          this.hsU.show();
        }
        GMTrace.o(9799236321280L, 73010);
        return;
      }
      finish();
      w.w("MicroMsg.LuckyMoneyReceiveUI", "sendid null & finish");
      GMTrace.o(9799236321280L, 73010);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(9799370539008L, 73011);
    super.onDestroy();
    if ((this.hsU != null) && (this.hsU.isShowing())) {
      this.hsU.dismiss();
    }
    GMTrace.o(9799370539008L, 73011);
  }
  
  protected void onPause()
  {
    GMTrace.i(9799638974464L, 73013);
    super.onPause();
    d.e("LEn_01a721a4", this.jro, bg.Pu());
    GMTrace.o(9799638974464L, 73013);
  }
  
  protected void onResume()
  {
    GMTrace.i(9799504756736L, 73012);
    super.onResume();
    this.jro = bg.Pu();
    GMTrace.o(9799504756736L, 73012);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\ui\En_fba4b94f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
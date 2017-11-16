package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.i;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.luckymoney.b.e;
import com.tencent.mm.plugin.luckymoney.f2f.a.b;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wxpay.a.a;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.axp;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.b.a;
import com.tencent.mm.y.s;
import java.io.IOException;

@a(3)
public class LuckyMoneyF2FReceiveUI
  extends LuckyMoneyBaseUI
{
  private DisplayMetrics hjd;
  private String kBQ;
  private ImageView mFN;
  private TextView mFO;
  private String mFr;
  private String mFt;
  private int mFu;
  private String mFz;
  private View mGT;
  private TextView mGU;
  private ImageView mGV;
  private ValueAnimator mGW;
  private ValueAnimator mGX;
  private Intent mGY;
  private boolean mGZ;
  
  public LuckyMoneyF2FReceiveUI()
  {
    GMTrace.i(9767695155200L, 72775);
    this.mGZ = false;
    GMTrace.o(9767695155200L, 72775);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(9768366243840L, 72780);
    w.i("LuckyMoneyF2FReceiveUI", "errType: %d,errCode: %d,errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (!(paramk instanceof b))
    {
      GMTrace.o(9768366243840L, 72780);
      return true;
    }
    Object localObject1 = (b)paramk;
    paramInt1 = ((b)localObject1).eYn;
    paramInt2 = ((b)localObject1).mFs;
    this.mFu = ((b)localObject1).mFu;
    int i = ((b)localObject1).mFw;
    Object localObject2 = ((b)localObject1).mFx;
    String str = ((b)localObject1).mFy;
    w.i("LuckyMoneyF2FReceiveUI", "hbStatus: %d, recvStatus:%d, errorType:%d", new Object[] { Integer.valueOf(((b)localObject1).eYn), Integer.valueOf(((b)localObject1).mFs), Integer.valueOf(((b)localObject1).eDB) });
    if (paramInt2 == 2)
    {
      if (paramInt1 == 5) {
        com.tencent.mm.ui.base.h.a(this, getString(a.i.sUl), "", new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(9767024066560L, 72770);
            LuckyMoneyF2FReceiveUI.this.finish();
            GMTrace.o(9767024066560L, 72770);
          }
        });
      }
      for (;;)
      {
        GMTrace.o(9768366243840L, 72780);
        return true;
        this.mFr = ((b)localObject1).mFr;
        this.mFt = ((b)localObject1).mFt;
        this.mFz = ((b)localObject1).mFz;
        this.mGY = new Intent();
        if ((!bg.nm(this.mFt)) && (!s.fC(this.mFt)))
        {
          paramString = new com.tencent.mm.ac.h();
          paramString.username = this.mFt;
          com.tencent.mm.ac.n.Di().a(paramString);
        }
        com.tencent.mm.plugin.luckymoney.b.n.a(this.mFN, null, this.mFt);
        paramString = new e();
        paramString.eYB = this.mFu;
        paramString.mFr = this.mFr;
        paramString.eYn = paramInt1;
        paramString.eYo = paramInt2;
        paramString.mFy = str;
        paramString.mFw = i;
        paramString.mIB = this.mFt;
        paramString.mFx = ((String)localObject2);
        paramString.mIg = com.tencent.mm.plugin.luckymoney.b.n.fr(this.mFt);
        paramString.mFz = this.mFz;
        paramString.mIb = 2;
        w.i("LuckyMoneyF2FReceiveUI", "is most lucky %d", new Object[] { Integer.valueOf(((b)localObject1).mFA) });
        if (((b)localObject1).mFA > 0) {
          paramString.mIe = getString(a.i.sUG);
        }
        paramString.mIh = com.tencent.mm.plugin.luckymoney.b.n.BC(this.mFt);
        try
        {
          this.mGY.putExtra("key_detail_info", paramString.toByteArray());
          paramString = ((b)localObject1).mFv;
          if (paramString != null)
          {
            localObject1 = new RealnameGuideHelper();
            ((RealnameGuideHelper)localObject1).a(String.valueOf(paramString.tMT), paramString.mJN, paramString.mJO, paramString.mJP, paramString.mJQ, paramk.getType());
            this.mGY.putExtra("key_realname_guide_helper", (Parcelable)localObject1);
          }
        }
        catch (IOException paramString)
        {
          for (;;)
          {
            w.e("LuckyMoneyF2FReceiveUI", "lucky detail toBytes error: " + paramString.getMessage());
          }
        }
        if (!bg.E(new String[] { this.mFr, this.mFt }))
        {
          com.tencent.mm.plugin.luckymoney.b.n.a(this, this.mFO, com.tencent.mm.plugin.luckymoney.b.n.fr(this.mFt));
          com.tencent.mm.plugin.luckymoney.b.n.a(this, this.mGU, this.mFz);
          this.mGW.start();
          this.vKB.hqF.setVisibility(0);
        }
      }
    }
    if (((b)localObject1).mFv != null)
    {
      w.i("LuckyMoneyF2FReceiveUI", "need real name verify");
      localObject2 = ((b)localObject1).mFv;
      localObject1 = new RealnameGuideHelper();
      ((RealnameGuideHelper)localObject1).a(String.valueOf(((axp)localObject2).tMT), ((axp)localObject2).mJN, ((axp)localObject2).mJO, ((axp)localObject2).mJP, ((axp)localObject2).mJQ, paramk.getType());
      paramk = new Bundle();
      paramk.putString("realname_verify_process_jump_activity", ".f2f.ui.LuckyMoneyF2FReceiveUI");
      paramk.putString("realname_verify_process_jump_plugin", "luckymoney");
      localObject2 = new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(9782861758464L, 72888);
          LuckyMoneyF2FReceiveUI.this.finish();
          GMTrace.o(9782861758464L, 72888);
        }
      };
      new b.a()
      {
        public final Intent k(int paramAnonymousInt, Bundle paramAnonymousBundle)
        {
          GMTrace.i(9752931205120L, 72665);
          LuckyMoneyF2FReceiveUI.this.finish();
          GMTrace.o(9752931205120L, 72665);
          return null;
        }
      };
      if (((RealnameGuideHelper)localObject1).b(this, paramk, (DialogInterface.OnClickListener)localObject2, false))
      {
        this.mGZ = true;
        GMTrace.o(9768366243840L, 72780);
        return true;
      }
    }
    paramk = paramString;
    if (bg.nm(paramString)) {
      paramk = getString(a.i.sUp);
    }
    com.tencent.mm.ui.base.h.a(this, paramk, "", new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(9764876582912L, 72754);
        LuckyMoneyF2FReceiveUI.this.finish();
        GMTrace.o(9764876582912L, 72754);
      }
    });
    GMTrace.o(9768366243840L, 72780);
    return true;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9767963590656L, 72777);
    int i = a.g.sMQ;
    GMTrace.o(9767963590656L, 72777);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9767829372928L, 72776);
    super.onCreate(paramBundle);
    this.mGT = findViewById(a.f.sAg);
    this.mFN = ((ImageView)findViewById(a.f.sAi));
    this.mFO = ((TextView)findViewById(a.f.sAj));
    this.mGU = ((TextView)findViewById(a.f.sAk));
    this.mGV = ((ImageView)findViewById(a.f.sAo));
    this.mGV.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9763400187904L, 72743);
        LuckyMoneyF2FReceiveUI.a(LuckyMoneyF2FReceiveUI.this).cancel();
        LuckyMoneyF2FReceiveUI.this.finish();
        GMTrace.o(9763400187904L, 72743);
      }
    });
    this.vKB.hqF.setVisibility(8);
    this.kBQ = getIntent().getStringExtra("key_share_url");
    com.tencent.mm.plugin.wallet_core.model.h.g(this, 6);
    b(new b(this.kBQ), true);
    this.hjd = getResources().getDisplayMetrics();
    this.mGW = ValueAnimator.ofFloat(new float[] { 1.0F, 0.0F }).setDuration(300L);
    this.mGX = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F }).setDuration(300L);
    this.mGX.setStartDelay(1000L);
    this.mGW.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
    {
      public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
      {
        GMTrace.i(9766755631104L, 72768);
        float f = ((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue();
        LuckyMoneyF2FReceiveUI.c(LuckyMoneyF2FReceiveUI.this).setTranslationY(-f * LuckyMoneyF2FReceiveUI.b(LuckyMoneyF2FReceiveUI.this).heightPixels);
        GMTrace.o(9766755631104L, 72768);
      }
    });
    this.mGW.addListener(new Animator.AnimatorListener()
    {
      public final void onAnimationCancel(Animator paramAnonymousAnimator)
      {
        GMTrace.i(9765816107008L, 72761);
        GMTrace.o(9765816107008L, 72761);
      }
      
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        GMTrace.i(9765681889280L, 72760);
        w.i("LuckyMoneyF2FReceiveUI", "packet top in animator end");
        LuckyMoneyF2FReceiveUI.a(LuckyMoneyF2FReceiveUI.this).start();
        GMTrace.o(9765681889280L, 72760);
      }
      
      public final void onAnimationRepeat(Animator paramAnonymousAnimator)
      {
        GMTrace.i(9765950324736L, 72762);
        GMTrace.o(9765950324736L, 72762);
      }
      
      public final void onAnimationStart(Animator paramAnonymousAnimator)
      {
        GMTrace.i(9765547671552L, 72759);
        GMTrace.o(9765547671552L, 72759);
      }
    });
    this.mGX.addListener(new Animator.AnimatorListener()
    {
      public final void onAnimationCancel(Animator paramAnonymousAnimator)
      {
        GMTrace.i(9777493049344L, 72848);
        GMTrace.o(9777493049344L, 72848);
      }
      
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        GMTrace.i(9777358831616L, 72847);
        w.i("LuckyMoneyF2FReceiveUI", "packet exit animator end");
        if (LuckyMoneyF2FReceiveUI.d(LuckyMoneyF2FReceiveUI.this) != null) {
          LuckyMoneyF2FReceiveUI.a(LuckyMoneyF2FReceiveUI.this, LuckyMoneyDetailUI.class, LuckyMoneyF2FReceiveUI.d(LuckyMoneyF2FReceiveUI.this));
        }
        LuckyMoneyF2FReceiveUI.this.setResult(-1, null);
        LuckyMoneyF2FReceiveUI.this.finish();
        if (LuckyMoneyF2FReceiveUI.d(LuckyMoneyF2FReceiveUI.this) != null) {
          LuckyMoneyF2FReceiveUI.this.overridePendingTransition(a.a.aLC, a.a.aLD);
        }
        GMTrace.o(9777358831616L, 72847);
      }
      
      public final void onAnimationRepeat(Animator paramAnonymousAnimator)
      {
        GMTrace.i(9777627267072L, 72849);
        GMTrace.o(9777627267072L, 72849);
      }
      
      public final void onAnimationStart(Animator paramAnonymousAnimator)
      {
        GMTrace.i(9777224613888L, 72846);
        GMTrace.o(9777224613888L, 72846);
      }
    });
    GMTrace.o(9767829372928L, 72776);
  }
  
  protected void onResume()
  {
    GMTrace.i(9768097808384L, 72778);
    super.onResume();
    hN(1997);
    if (this.mGZ) {
      finish();
    }
    GMTrace.o(9768097808384L, 72778);
  }
  
  protected void onStop()
  {
    GMTrace.i(9768232026112L, 72779);
    super.onStop();
    hO(1997);
    GMTrace.o(9768232026112L, 72779);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\f2f\ui\LuckyMoneyF2FReceiveUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
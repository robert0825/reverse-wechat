package com.tencent.mm.ui.account;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.c;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.network.e;
import com.tencent.mm.plugin.c.a;
import com.tencent.mm.plugin.c.b;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.ui.account.mobile.MobileInputUI;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bf;
import com.tencent.mm.y.bf.a;
import com.tencent.mm.y.bj;

public class WelcomeSelectView
  extends WelcomeView
{
  private Context context;
  private int mHeight;
  private View mHl;
  private Button vUA;
  private Button vUB;
  private TextView vUC;
  
  public WelcomeSelectView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(2551881662464L, 19013);
    this.mHeight = 800;
    cm(paramContext);
    GMTrace.o(2551881662464L, 19013);
  }
  
  @TargetApi(11)
  public WelcomeSelectView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(2551747444736L, 19012);
    this.mHeight = 800;
    cm(paramContext);
    GMTrace.o(2551747444736L, 19012);
  }
  
  private void cm(final Context paramContext)
  {
    GMTrace.i(2552418533376L, 19017);
    this.context = paramContext;
    View localView = LayoutInflater.from(paramContext).inflate(R.i.cIb, this);
    this.mHl = localView.findViewById(R.h.cbE);
    this.vUA = ((Button)localView.findViewById(R.h.cbD));
    this.vUB = ((Button)localView.findViewById(R.h.cbM));
    this.vUC = ((TextView)localView.findViewById(R.h.cop));
    this.mHl.setVisibility(8);
    this.vUC.setVisibility(8);
    this.vUC.setText(v.g(paramContext, R.c.aMp, R.l.cTr));
    this.mHeight = paramContext.getResources().getDisplayMetrics().heightPixels;
    this.vUC.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(2783944114176L, 20742);
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("not_auth_setting", true);
        paramAnonymousView.putExtra("from_login_history", true);
        a.hnH.r(paramAnonymousView, WelcomeSelectView.this.getContext());
        GMTrace.o(2783944114176L, 20742);
      }
    });
    this.vUA.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(2743276142592L, 20439);
        paramAnonymousView = new Intent(paramContext, MobileInputUI.class);
        paramAnonymousView.putExtra("mobile_input_purpose", 1);
        paramContext.startActivity(paramAnonymousView);
        GMTrace.o(2743276142592L, 20439);
      }
    });
    this.vUB.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        int i = 1;
        GMTrace.i(2742470836224L, 20433);
        if (d.tJF)
        {
          paramAnonymousView = paramContext.getString(R.l.dmb, new Object[] { "0x" + Integer.toHexString(d.tJC), v.bPK() });
          Intent localIntent = new Intent();
          localIntent.putExtra("rawUrl", paramAnonymousView);
          localIntent.putExtra("showShare", false);
          localIntent.putExtra("show_bottom", false);
          localIntent.putExtra("needRedirect", false);
          localIntent.putExtra("neverGetA8Key", true);
          localIntent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.tJP);
          localIntent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.tJM);
          a.hnH.j(localIntent, paramContext);
          GMTrace.o(2742470836224L, 20433);
          return;
        }
        if (bj.BC().BD() > 0)
        {
          if (i != 0) {
            break label285;
          }
          paramAnonymousView = new Intent(paramContext, MobileInputUI.class);
          paramAnonymousView.putExtra("mobile_input_purpose", 2);
          paramContext.startActivity(paramAnonymousView);
        }
        for (paramAnonymousView = "R200_100";; paramAnonymousView = "RE200_100")
        {
          bj.BC();
          b.hI(20);
          b.nz(paramAnonymousView);
          b.b(false, at.wN() + "," + getClass().getName() + ",R100_100_new," + at.eK("R100_100_new") + ",2");
          b.ny("R100_100_new");
          GMTrace.o(2742470836224L, 20433);
          return;
          i = 0;
          break;
          label285:
          paramAnonymousView = new Intent(paramContext, RegByMobileRegAIOUI.class);
          paramAnonymousView.putExtra("login_type", 0);
          paramContext.startActivity(paramAnonymousView);
        }
      }
    });
    paramContext = v.e(this.context.getSharedPreferences(ab.bPU(), 0));
    this.vUC.setText(v.g(this.context, R.c.aMp, R.l.cTr));
    if ((paramContext != null) && (paramContext.equals("language_default"))) {
      this.vUC.setText(this.context.getString(R.l.dHe));
    }
    this.vUA.setText(R.l.dDh);
    this.vUB.setText(R.l.dDg);
    GMTrace.o(2552418533376L, 19017);
  }
  
  public final void bZa()
  {
    GMTrace.i(2552552751104L, 19018);
    dd(this.mHl);
    dd(this.vUC);
    this.mHl.setVisibility(0);
    this.vUC.setVisibility(0);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(2736028385280L, 20385);
        at.wS().a(new bf(new bf.a()
        {
          public final void a(e paramAnonymous2e)
          {
            GMTrace.i(2774548873216L, 20672);
            GMTrace.o(2774548873216L, 20672);
          }
        }, "launch normal"), 0);
        GMTrace.o(2736028385280L, 20385);
      }
    });
    GMTrace.o(2552552751104L, 19018);
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    GMTrace.i(2552150097920L, 19015);
    super.dispatchDraw(paramCanvas);
    GMTrace.o(2552150097920L, 19015);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\WelcomeSelectView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
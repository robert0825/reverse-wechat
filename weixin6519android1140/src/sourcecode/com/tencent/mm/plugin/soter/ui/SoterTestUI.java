package com.tencent.mm.plugin.soter.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.d.a.a.a.d;
import com.tencent.d.a.c.e;
import com.tencent.d.a.c.g;
import com.tencent.d.a.c.h;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.af.a.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import java.security.Signature;
import java.security.SignatureException;

public class SoterTestUI
  extends MMActivity
{
  private Button qpo;
  private Button qpp;
  private Button qpq;
  private Button qpr;
  private Button qps;
  private Button qpt;
  private Button qpu;
  private Button qpv;
  private Button qpw;
  private TextView qpx;
  
  public SoterTestUI()
  {
    GMTrace.i(7106694479872L, 52949);
    this.qpo = null;
    this.qpp = null;
    this.qpq = null;
    this.qpr = null;
    this.qps = null;
    this.qpt = null;
    this.qpu = null;
    this.qpv = null;
    this.qpw = null;
    this.qpx = null;
    GMTrace.o(7106694479872L, 52949);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7106962915328L, 52951);
    int i = com.tencent.mm.plugin.af.a.b.qpL;
    GMTrace.o(7106962915328L, 52951);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7106828697600L, 52950);
    super.onCreate(paramBundle);
    this.qpo = ((Button)findViewById(a.a.qpK));
    this.qpp = ((Button)findViewById(a.a.qpF));
    this.qpq = ((Button)findViewById(a.a.qpJ));
    this.qpr = ((Button)findViewById(a.a.qpH));
    this.qps = ((Button)findViewById(a.a.qpE));
    this.qpt = ((Button)findViewById(a.a.qpI));
    this.qpu = ((Button)findViewById(a.a.qpG));
    this.qpv = ((Button)findViewById(a.a.qpD));
    this.qpw = ((Button)findViewById(a.a.qpC));
    this.qpx = ((TextView)findViewById(a.a.qpB));
    this.qpo.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7104949649408L, 52936);
        TextView localTextView = SoterTestUI.a(SoterTestUI.this);
        if (com.tencent.d.b.a.cpG()) {}
        for (paramAnonymousView = "passed";; paramAnonymousView = "not support")
        {
          localTextView.setText(paramAnonymousView);
          GMTrace.o(7104949649408L, 52936);
          return;
        }
      }
    });
    this.qpp.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7106560262144L, 52948);
        paramAnonymousView = com.tencent.d.a.a.cpx();
        TextView localTextView = SoterTestUI.a(SoterTestUI.this);
        if (paramAnonymousView.isSuccess()) {}
        for (paramAnonymousView = "passed";; paramAnonymousView = "not support")
        {
          localTextView.setText(paramAnonymousView);
          GMTrace.o(7106560262144L, 52948);
          return;
        }
      }
    });
    this.qpq.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7108036657152L, 52959);
        paramAnonymousView = com.tencent.d.a.a.cpy();
        TextView localTextView = SoterTestUI.a(SoterTestUI.this);
        if (paramAnonymousView.isSuccess()) {}
        for (paramAnonymousView = "passed";; paramAnonymousView = "not passed")
        {
          localTextView.setText(paramAnonymousView);
          GMTrace.o(7108036657152L, 52959);
          return;
        }
      }
    });
    this.qpr.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7106023391232L, 52944);
        paramAnonymousView = com.tencent.d.a.a.cpA();
        if (paramAnonymousView == null)
        {
          SoterTestUI.a(SoterTestUI.this).setText("not passed: no certificate");
          GMTrace.o(7106023391232L, 52944);
          return;
        }
        SoterTestUI.a(SoterTestUI.this).setText("model available: " + paramAnonymousView.toString());
        GMTrace.o(7106023391232L, 52944);
      }
    });
    this.qps.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7105486520320L, 52940);
        paramAnonymousView = com.tencent.d.a.a.Yr("sample_auth_key_name");
        TextView localTextView = SoterTestUI.a(SoterTestUI.this);
        if (paramAnonymousView.isSuccess()) {}
        for (paramAnonymousView = "pass";; paramAnonymousView = "not passed")
        {
          localTextView.setText(paramAnonymousView);
          GMTrace.o(7105486520320L, 52940);
          return;
        }
      }
    });
    this.qpt.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7106291826688L, 52946);
        paramAnonymousView = com.tencent.d.a.a.bk("sample_auth_key_name", false);
        TextView localTextView = SoterTestUI.a(SoterTestUI.this);
        if (paramAnonymousView.isSuccess()) {}
        for (paramAnonymousView = "pass";; paramAnonymousView = "not passed")
        {
          localTextView.setText(paramAnonymousView);
          GMTrace.o(7106291826688L, 52946);
          return;
        }
      }
    });
    this.qpu.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7105218084864L, 52938);
        paramAnonymousView = com.tencent.d.a.a.Yu("sample_auth_key_name");
        if (paramAnonymousView == null)
        {
          SoterTestUI.a(SoterTestUI.this).setText("not passed: no certificate");
          GMTrace.o(7105218084864L, 52938);
          return;
        }
        SoterTestUI.a(SoterTestUI.this).setText("model available: " + paramAnonymousView.toString());
        GMTrace.o(7105218084864L, 52938);
      }
    });
    this.qpv.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(final View paramAnonymousView)
      {
        GMTrace.i(7105754955776L, 52942);
        paramAnonymousView = com.tencent.d.a.a.Yv("sample_auth_key_name");
        if (paramAnonymousView != null) {}
        try
        {
          paramAnonymousView.update("challenge".getBytes());
          paramAnonymousView.sign();
          w.e("MicroMsg.SoterTestUI", "hy: should NOT happen if no exception");
          SoterTestUI.a(SoterTestUI.this).setText("not passed: signature success without fingerprint authentication");
          GMTrace.o(7105754955776L, 52942);
          return;
        }
        catch (SignatureException localSignatureException)
        {
          w.e("MicroMsg.SoterTestUI", "hy: occurred exception when sign: " + localSignatureException.toString());
          com.tencent.d.a.a.a locala = com.tencent.d.a.a.a.hG(SoterTestUI.this);
          if ((!locala.isHardwareDetected()) || (!locala.hasEnrolledFingerprints())) {
            break label154;
          }
          locala.a(new a.d(paramAnonymousView), null, new com.tencent.d.a.a.a.b()
          {
            public final void aAa()
            {
              GMTrace.i(18500303192064L, 137838);
              super.aAa();
              GMTrace.o(18500303192064L, 137838);
            }
            
            public final void bqG()
            {
              GMTrace.i(18500168974336L, 137837);
              w.i("MicroMsg.SoterTestUI", "hy: onAuthenticationSucceeded");
              try
              {
                paramAnonymousView.update("challenge".getBytes());
                Object localObject = com.tencent.d.a.a.bH(paramAnonymousView.sign());
                TextView localTextView = SoterTestUI.a(SoterTestUI.this);
                if (localObject == null) {}
                for (localObject = "not pass: exception occurs";; localObject = ((h)localObject).toString())
                {
                  localTextView.setText((CharSequence)localObject);
                  GMTrace.o(18500168974336L, 137837);
                  return;
                }
                return;
              }
              catch (SignatureException localSignatureException)
              {
                w.e("MicroMsg.SoterTestUI", "hy: occurred exception when sign: " + localSignatureException.toString());
                GMTrace.o(18500168974336L, 137837);
              }
            }
            
            public final void onAuthenticationError(int paramAnonymous2Int, CharSequence paramAnonymous2CharSequence)
            {
              GMTrace.i(7107365568512L, 52954);
              w.i("MicroMsg.SoterTestUI", "hy: onAuthenticationError");
              GMTrace.o(7107365568512L, 52954);
            }
            
            public final void onAuthenticationFailed()
            {
              GMTrace.i(7107768221696L, 52957);
              w.i("MicroMsg.SoterTestUI", "hy: onAuthenticationFailed");
              GMTrace.o(7107768221696L, 52957);
            }
            
            public final void onAuthenticationHelp(int paramAnonymous2Int, CharSequence paramAnonymous2CharSequence)
            {
              GMTrace.i(7107499786240L, 52955);
              w.i("MicroMsg.SoterTestUI", "hy: onAuthenticationHelp");
              GMTrace.o(7107499786240L, 52955);
            }
          });
          GMTrace.o(7105754955776L, 52942);
          return;
          label154:
          w.e("MicroMsg.SoterTestUI", "hy: no hardware detected or no fingerprint registered");
          GMTrace.o(7105754955776L, 52942);
        }
        w.e("MicroMsg.SoterTestUI", "hy: signature is null. do sign failed");
        GMTrace.o(7105754955776L, 52942);
        return;
      }
    });
    GMTrace.o(7106828697600L, 52950);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\soter\ui\SoterTestUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
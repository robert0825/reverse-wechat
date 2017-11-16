package com.tencent.mm.plugin.traceroute.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import java.io.File;

public class NetworkDiagnoseReportUI
  extends MMActivity
{
  private static String qzX;
  private boolean qAL;
  private Button qAM;
  private Button qAN;
  private ImageView qAO;
  private TextView qAP;
  private TextView qAQ;
  private TextView qAR;
  
  public NetworkDiagnoseReportUI()
  {
    GMTrace.i(9991167672320L, 74440);
    this.qAL = false;
    GMTrace.o(9991167672320L, 74440);
  }
  
  protected final void MP()
  {
    GMTrace.i(9991436107776L, 74442);
    sq("");
    this.qAO = ((ImageView)findViewById(R.h.bYr));
    this.qAP = ((TextView)findViewById(R.h.bYu));
    this.qAQ = ((TextView)findViewById(R.h.bYt));
    this.qAL = getIntent().getBooleanExtra("diagnose_result", false);
    if (this.qAL)
    {
      this.qAO.setImageResource(R.g.aYr);
      this.qAP.setText(getString(R.l.efx));
      this.qAQ.setVisibility(0);
      a(0, getString(R.l.dmO), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(9991033454592L, 74439);
          NetworkDiagnoseReportUI.this.finish();
          GMTrace.o(9991033454592L, 74439);
          return false;
        }
      });
      GMTrace.o(9991436107776L, 74442);
      return;
    }
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9998818082816L, 74497);
        NetworkDiagnoseReportUI.this.finish();
        GMTrace.o(9998818082816L, 74497);
        return true;
      }
    });
    qzX = getIntent().getStringExtra("diagnose_log_file_path");
    this.qAO.setImageResource(R.g.aYq);
    this.qAP.setText(getString(R.l.efw));
    if ((qzX == null) || (e.aY(qzX) <= 0))
    {
      GMTrace.o(9991436107776L, 74442);
      return;
    }
    this.qAR = ((TextView)findViewById(R.h.bYs));
    this.qAR.setText(getString(R.l.dSg, new Object[] { qzX.replace("mnt/", "") }));
    findViewById(R.h.bYs).setVisibility(0);
    findViewById(R.h.ccd).setVisibility(0);
    this.qAM = ((Button)findViewById(R.h.cce));
    this.qAM.setVisibility(0);
    this.qAM.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9999354953728L, 74501);
        paramAnonymousView = new Intent("android.intent.action.SEND");
        paramAnonymousView.addFlags(268435456);
        paramAnonymousView.putExtra("android.intent.extra.EMAIL", new String[] { "WeChat_Log@qq.com" });
        paramAnonymousView.putExtra("android.intent.extra.SUBJECT", NetworkDiagnoseReportUI.a(NetworkDiagnoseReportUI.this));
        paramAnonymousView.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(NetworkDiagnoseReportUI.bsV())));
        paramAnonymousView.setType("text/plain");
        NetworkDiagnoseReportUI.this.startActivity(paramAnonymousView);
        GMTrace.o(9999354953728L, 74501);
      }
    });
    this.qAN = ((Button)findViewById(R.h.ckT));
    this.qAN.setVisibility(0);
    this.qAN.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9999623389184L, 74503);
        if (!bg.nm(NetworkDiagnoseReportUI.bsV()))
        {
          paramAnonymousView = new File(NetworkDiagnoseReportUI.bsV());
          if (paramAnonymousView.exists())
          {
            Intent localIntent = new Intent("android.intent.action.VIEW");
            localIntent.setDataAndType(Uri.fromFile(paramAnonymousView), "text/plain");
            localIntent.addFlags(268435456);
            NetworkDiagnoseReportUI.this.startActivity(localIntent);
          }
        }
        GMTrace.o(9999623389184L, 74503);
      }
    });
    GMTrace.o(9991436107776L, 74442);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9991570325504L, 74443);
    int i = R.i.cDa;
    GMTrace.o(9991570325504L, 74443);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9991301890048L, 74441);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(9991301890048L, 74441);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\traceroute\ui\NetworkDiagnoseReportUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
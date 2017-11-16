package com.tencent.mm.plugin.voiceprint.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;

public class VoicePrintFinishUI
  extends MMActivity
{
  private TextView izE;
  private TextView qDi;
  private Button qDj;
  private ImageView qDk;
  private int qDl;
  
  public VoicePrintFinishUI()
  {
    GMTrace.i(12531372392448L, 93366);
    GMTrace.o(12531372392448L, 93366);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12531775045632L, 93369);
    int i = R.i.cHw;
    GMTrace.o(12531775045632L, 93369);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12531506610176L, 93367);
    w.i("MicroMsg.VoicePrintFinishUI", "VoicePrintFinishUI");
    super.onCreate(paramBundle);
    this.vKB.bXF();
    this.qDl = getIntent().getIntExtra("kscene_type", 73);
    w.d("MicroMsg.VoicePrintFinishUI", "onCreate, sceneType:%d", new Object[] { Integer.valueOf(this.qDl) });
    this.izE = ((TextView)findViewById(R.h.clD));
    this.qDi = ((TextView)findViewById(R.h.clF));
    this.qDj = ((Button)findViewById(R.h.bYP));
    this.qDk = ((ImageView)findViewById(R.h.clC));
    switch (this.qDl)
    {
    }
    for (;;)
    {
      this.qDj.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(12531238174720L, 93365);
          if (VoicePrintFinishUI.a(VoicePrintFinishUI.this) == 72)
          {
            paramAnonymousView = new Intent();
            paramAnonymousView.setClass(VoicePrintFinishUI.this, VoiceUnLockUI.class);
            paramAnonymousView.putExtra("kscene_type", 73);
            VoicePrintFinishUI.this.startActivity(paramAnonymousView);
          }
          VoicePrintFinishUI.this.finish();
          GMTrace.o(12531238174720L, 93365);
        }
      });
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(12508018507776L, 93192);
          VoicePrintFinishUI.this.finish();
          GMTrace.o(12508018507776L, 93192);
          return true;
        }
      });
      GMTrace.o(12531506610176L, 93367);
      return;
      this.izE.setText(R.l.egY);
      this.qDi.setText(R.l.egZ);
      this.qDk.setVisibility(0);
      this.qDj.setText(R.l.ebk);
      continue;
      this.izE.setVisibility(8);
      this.qDi.setText(R.l.ehl);
      this.qDk.setVisibility(0);
      this.qDj.setText(R.l.ebl);
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(12531640827904L, 93368);
    super.onDestroy();
    GMTrace.o(12531640827904L, 93368);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\voiceprint\ui\VoicePrintFinishUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
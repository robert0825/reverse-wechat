package com.tencent.mm.plugin.voiceprint.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;

public class VoiceReCreatePromptUI
  extends MMActivity
  implements View.OnClickListener
{
  private View qDH;
  
  public VoiceReCreatePromptUI()
  {
    GMTrace.i(12533654093824L, 93383);
    this.qDH = null;
    GMTrace.o(12533654093824L, 93383);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12534056747008L, 93386);
    int i = R.i.cHz;
    GMTrace.o(12534056747008L, 93386);
    return i;
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(12534190964736L, 93387);
    startActivity(new Intent(this, VoiceCreateUI.class));
    finish();
    GMTrace.o(12534190964736L, 93387);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12533788311552L, 93384);
    super.onCreate(paramBundle);
    this.vKB.bXF();
    this.qDH = findViewById(R.h.bXP);
    this.qDH.setOnClickListener(this);
    GMTrace.o(12533788311552L, 93384);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12533922529280L, 93385);
    super.onDestroy();
    GMTrace.o(12533922529280L, 93385);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\voiceprint\ui\VoiceReCreatePromptUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
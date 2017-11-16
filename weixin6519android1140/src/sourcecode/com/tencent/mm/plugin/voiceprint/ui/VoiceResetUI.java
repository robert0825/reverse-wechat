package com.tencent.mm.plugin.voiceprint.ui;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public class VoiceResetUI
  extends VoiceUnLockUI
{
  public VoiceResetUI()
  {
    GMTrace.i(12536338448384L, 93403);
    GMTrace.o(12536338448384L, 93403);
  }
  
  protected final void btr()
  {
    GMTrace.i(12536472666112L, 93404);
    w.d("MicroMsg.VoiceResetUI", "unlock success");
    startActivity(new Intent(this, VoiceCreateUI.class));
    finish();
    GMTrace.o(12536472666112L, 93404);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\voiceprint\ui\VoiceResetUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.game.ui;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;

public abstract class GameBaseActivity
  extends MMActivity
{
  private int lUq;
  private long lUr;
  private long lUs;
  private long mStartTime;
  
  public GameBaseActivity()
  {
    GMTrace.i(19278631796736L, 143637);
    this.lUq = 1;
    this.lUr = 0L;
    this.mStartTime = 0L;
    this.lUs = 0L;
    GMTrace.o(19278631796736L, 143637);
  }
  
  public abstract int aGs();
  
  public abstract int aGt();
  
  public abstract int aGu();
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(19278766014464L, 143638);
    super.onCreate(paramBundle);
    GMTrace.o(19278766014464L, 143638);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(19279168667648L, 143641);
    if (this.mStartTime != 0L)
    {
      long l = System.currentTimeMillis() - this.mStartTime;
      w.i("MicroMsg.GameBaseActivity", "visit page(%s), stayTime:%sms, foregroundTime:%sms", new Object[] { getClass().getSimpleName(), Long.valueOf(l), Long.valueOf(this.lUr) });
      ai.a(this.lUq, aGs(), aGt(), aGu(), "", null, "", l / 1000L, this.lUr / 1000L, null);
    }
    super.onDestroy();
    GMTrace.o(19279168667648L, 143641);
  }
  
  protected void onPause()
  {
    GMTrace.i(19279034449920L, 143640);
    super.onPause();
    this.lUr += System.currentTimeMillis() - this.lUs;
    GMTrace.o(19279034449920L, 143640);
  }
  
  protected void onResume()
  {
    GMTrace.i(19278900232192L, 143639);
    if (this.mStartTime == 0L) {
      this.mStartTime = System.currentTimeMillis();
    }
    this.lUs = System.currentTimeMillis();
    super.onResume();
    GMTrace.o(19278900232192L, 143639);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\GameBaseActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.sight.draft.ui;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;

public class SightDraftTestActivity
  extends Activity
{
  public SightDraftTestActivity()
  {
    GMTrace.i(9369336938496L, 69807);
    GMTrace.o(9369336938496L, 69807);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9369471156224L, 69808);
    super.onCreate(paramBundle);
    paramBundle = new SightDraftContainerView(this);
    setContentView(paramBundle);
    paramBundle.bgW();
    GMTrace.o(9369471156224L, 69808);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\sight\draft\ui\SightDraftTestActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
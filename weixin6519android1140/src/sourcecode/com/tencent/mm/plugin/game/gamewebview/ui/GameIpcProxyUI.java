package com.tencent.mm.plugin.game.gamewebview.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameProcessActivityTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameProcessActivityTask.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;

@a(7)
public class GameIpcProxyUI
  extends MMActivity
{
  public GameIpcProxyUI()
  {
    GMTrace.i(16993843412992L, 126614);
    GMTrace.o(16993843412992L, 126614);
  }
  
  protected final void aEa()
  {
    GMTrace.i(16994380283904L, 126618);
    int i = getIntent().getIntExtra("orientation", -1);
    if (i != -1) {
      setRequestedOrientation(i);
    }
    GMTrace.o(16994380283904L, 126618);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(16994246066176L, 126617);
    GMTrace.o(16994246066176L, 126617);
    return -1;
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    GMTrace.i(16993977630720L, 126615);
    super.onCreate(paramBundle);
    w.i("MicroMsg.GameIpcProxyUI", "onCreate");
    paramBundle = (GameProcessActivityTask)getIntent().getParcelableExtra("task_object");
    final String str = getIntent().getStringExtra("task_id");
    if (paramBundle != null)
    {
      paramBundle.a(this, new GameProcessActivityTask.a()
      {
        public final void WW()
        {
          GMTrace.i(16978139938816L, 126497);
          w.i("MicroMsg.GameIpcProxyUI", "onResult");
          Intent localIntent = new Intent();
          localIntent.putExtra("task_object", paramBundle);
          localIntent.putExtra("task_id", str);
          GameIpcProxyUI.this.setResult(-1, localIntent);
          GameIpcProxyUI.this.finish();
          GMTrace.o(16978139938816L, 126497);
        }
      });
      GMTrace.o(16993977630720L, 126615);
      return;
    }
    setResult(1);
    finish();
    GMTrace.o(16993977630720L, 126615);
  }
  
  public void onDestroy()
  {
    GMTrace.i(16994111848448L, 126616);
    super.onDestroy();
    w.i("MicroMsg.GameIpcProxyUI", "onDestroy");
    GMTrace.o(16994111848448L, 126616);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\ui\GameIpcProxyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
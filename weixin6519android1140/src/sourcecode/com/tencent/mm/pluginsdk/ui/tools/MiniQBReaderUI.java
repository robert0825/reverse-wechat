package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.ValueCallback;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.model.r;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.xweb.x5.sdk.d;

@a(3)
public class MiniQBReaderUI
  extends MMActivity
{
  private int ret;
  private String tHb;
  
  public MiniQBReaderUI()
  {
    GMTrace.i(1109443739648L, 8266);
    this.ret = -1;
    this.tHb = Integer.toString(hashCode());
    GMTrace.o(1109443739648L, 8266);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(1109577957376L, 8267);
    GMTrace.o(1109577957376L, 8267);
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    boolean bool = true;
    GMTrace.i(1109712175104L, 8268);
    super.onCreate(paramBundle);
    w.i("MicroMsg.MiniQBReaderUI", "onCreate");
    Object localObject1 = getIntent();
    paramBundle = ((Intent)localObject1).getStringExtra("file_path");
    localObject1 = ((Intent)localObject1).getStringExtra("file_ext");
    Object localObject2 = new ValueCallback() {};
    this.ret = r.a(this, paramBundle, (String)localObject1, this.tHb, (ValueCallback)localObject2);
    w.i("MicroMsg.MiniQBReaderUI", "tryOpenByQbSdk , ret:%b", new Object[] { Integer.valueOf(this.ret) });
    new StringBuilder("tryOpenByQbSdk , ret:").append(this.ret);
    localObject2 = new Intent();
    ((Intent)localObject2).setAction("MINIQB_OPEN_RET");
    ((Intent)localObject2).putExtra("file_path", paramBundle);
    ((Intent)localObject2).putExtra("file_ext", (String)localObject1);
    if (this.ret == 0) {}
    for (;;)
    {
      ((Intent)localObject2).putExtra("MINIQB_OPEN_RET_VAL", bool);
      sendBroadcast((Intent)localObject2, "com.tencent.mm.permission.MM_MESSAGE");
      if (this.ret != 0) {
        finish();
      }
      GMTrace.o(1109712175104L, 8268);
      return;
      bool = false;
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(1109980610560L, 8270);
    w.i("MicroMsg.MiniQBReaderUI", "onDestroy");
    if (this.ret == 0) {}
    try
    {
      d.closeFileReader(this);
      super.onDestroy();
      GMTrace.o(1109980610560L, 8270);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.MiniQBReaderUI", localException, "", new Object[0]);
      }
    }
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(1109846392832L, 8269);
    super.onNewIntent(paramIntent);
    w.i("MicroMsg.MiniQBReaderUI", "onNewIntent");
    GMTrace.o(1109846392832L, 8269);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\tools\MiniQBReaderUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
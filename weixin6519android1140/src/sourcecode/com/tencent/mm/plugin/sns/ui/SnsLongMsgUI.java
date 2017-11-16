package com.tencent.mm.plugin.sns.ui;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;

public class SnsLongMsgUI
  extends MMActivity
{
  private Button pGX;
  
  public SnsLongMsgUI()
  {
    GMTrace.i(8675699720192L, 64639);
    GMTrace.o(8675699720192L, 64639);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8676236591104L, 64643);
    int i = i.g.peQ;
    GMTrace.o(8676236591104L, 64643);
    return i;
  }
  
  @TargetApi(17)
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8675968155648L, 64641);
    super.onCreate(paramBundle);
    AU(8);
    this.pGX = ((Button)findViewById(i.f.pbd));
    this.pGX.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8431423455232L, 62819);
        paramAnonymousView = new Intent();
        paramAnonymousView.setClass(SnsLongMsgUI.this, En_c4f742e5.class);
        paramAnonymousView.putExtra("KSnsPostManu", true);
        paramAnonymousView.putExtra("KTouchCameraTime", bg.Pu());
        paramAnonymousView.putExtra("sns_comment_type", 1);
        paramAnonymousView.putExtra("Ksnsupload_type", 9);
        SnsLongMsgUI.this.startActivity(paramAnonymousView);
        SnsLongMsgUI.this.finish();
        GMTrace.o(8431423455232L, 62819);
      }
    });
    GMTrace.o(8675968155648L, 64641);
  }
  
  public void onDestroy()
  {
    GMTrace.i(8675833937920L, 64640);
    super.onDestroy();
    GMTrace.o(8675833937920L, 64640);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(8676102373376L, 64642);
    if ((paramInt == 4) && (paramKeyEvent.getAction() == 0))
    {
      paramKeyEvent = new Intent();
      paramKeyEvent.setClass(this, En_c4f742e5.class);
      paramKeyEvent.putExtra("KSnsPostManu", true);
      paramKeyEvent.putExtra("KTouchCameraTime", bg.Pu());
      paramKeyEvent.putExtra("sns_comment_type", 1);
      paramKeyEvent.putExtra("Ksnsupload_type", 9);
      startActivity(paramKeyEvent);
      finish();
      GMTrace.o(8676102373376L, 64642);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(8676102373376L, 64642);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SnsLongMsgUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
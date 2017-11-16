package com.tencent.mm.plugin.subapp.ui.friend;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bc.c;
import com.tencent.mm.bc.l;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.aj;
import com.tencent.mm.y.at;

public class FMessageTransferUI
  extends MMActivity
{
  private int etA;
  
  public FMessageTransferUI()
  {
    GMTrace.i(5816191025152L, 43334);
    GMTrace.o(5816191025152L, 43334);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5816459460608L, 43336);
    GMTrace.o(5816459460608L, 43336);
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5816325242880L, 43335);
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("friend_message_transfer_username");
    l.ML().lK(paramBundle);
    l.ML().MB();
    String str1 = getIntent().getAction();
    String str2 = "friend_message_accept_" + paramBundle;
    this.etA = (0x7F000000 | 0x7FFFFFFF & paramBundle.hashCode());
    at.getNotification().cancel(this.etA);
    if (str2.equals(str1)) {
      a.g(this.vKB.vKW, paramBundle, true);
    }
    finish();
    GMTrace.o(5816325242880L, 43335);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\subapp\ui\friend\FMessageTransferUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
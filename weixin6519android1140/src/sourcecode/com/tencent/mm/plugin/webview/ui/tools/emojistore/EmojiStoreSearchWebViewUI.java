package com.tencent.mm.plugin.webview.ui.tools.emojistore;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public class EmojiStoreSearchWebViewUI
  extends BaseEmojiStoreSearchWebViewUI
{
  public EmojiStoreSearchWebViewUI()
  {
    GMTrace.i(12343199137792L, 91964);
    GMTrace.o(12343199137792L, 91964);
  }
  
  protected final void r(int paramInt, Bundle paramBundle)
  {
    GMTrace.i(12343333355520L, 91965);
    w.i("MicroMsg.emoji.EmojiStoreSearchWebViewUI", "handleEmojiStoreAction action:%d", new Object[] { Integer.valueOf(paramInt) });
    super.r(paramInt, paramBundle);
    GMTrace.o(12343333355520L, 91965);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\emojistore\EmojiStoreSearchWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
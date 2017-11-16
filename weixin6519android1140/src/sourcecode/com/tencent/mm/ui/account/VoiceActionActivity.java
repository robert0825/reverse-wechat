package com.tencent.mm.ui.account;

import com.google.android.search.verification.client.SearchActionVerificationClientActivity;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelvoiceaction.VoiceActionService;
import com.tencent.mm.sdk.platformtools.w;

public class VoiceActionActivity
  extends SearchActionVerificationClientActivity
{
  public VoiceActionActivity()
  {
    GMTrace.i(2781125541888L, 20721);
    GMTrace.o(2781125541888L, 20721);
  }
  
  public final Class<? extends SearchActionVerificationClientService> nf()
  {
    GMTrace.i(2781259759616L, 20722);
    w.d("MicroMsg.VoiceActionActivity", "getServiceClass");
    GMTrace.o(2781259759616L, 20722);
    return VoiceActionService.class;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\ui\account\VoiceActionActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
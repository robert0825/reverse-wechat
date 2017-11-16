package com.tencent.mm.plugin.emoji.ui.v2;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.emoji.a.h;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.u;

public class c
  extends a
{
  public c()
  {
    GMTrace.i(11531316101120L, 85915);
    GMTrace.o(11531316101120L, 85915);
  }
  
  public final com.tencent.mm.plugin.emoji.a.a.a arQ()
  {
    GMTrace.i(11533060931584L, 85928);
    h localh = new h(this.vKB.vKW);
    GMTrace.o(11533060931584L, 85928);
    return localh;
  }
  
  public final int arX()
  {
    GMTrace.i(11532926713856L, 85927);
    GMTrace.o(11532926713856L, 85927);
    return 9;
  }
  
  public final boolean asX()
  {
    GMTrace.i(11533195149312L, 85929);
    GMTrace.o(11533195149312L, 85929);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11531450318848L, 85916);
    int i = R.i.cuR;
    GMTrace.o(11531450318848L, 85916);
    return i;
  }
  
  public final void onAttach(Activity paramActivity)
  {
    GMTrace.i(11531584536576L, 85917);
    super.onAttach(paramActivity);
    w.d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onAttach");
    GMTrace.o(11531584536576L, 85917);
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11531718754304L, 85918);
    super.onCreate(paramBundle);
    w.d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onCreate");
    GMTrace.o(11531718754304L, 85918);
  }
  
  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    GMTrace.i(11531852972032L, 85919);
    w.d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onCreateView");
    paramLayoutInflater = super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    GMTrace.o(11531852972032L, 85919);
    return paramLayoutInflater;
  }
  
  public final void onDestroy()
  {
    GMTrace.i(11532658278400L, 85925);
    super.onDestroy();
    w.d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onDestroy");
    GMTrace.o(11532658278400L, 85925);
  }
  
  public final void onDestroyView()
  {
    GMTrace.i(11532524060672L, 85924);
    super.onDestroyView();
    w.d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onResume");
    GMTrace.o(11532524060672L, 85924);
  }
  
  public final void onDetach()
  {
    GMTrace.i(11532792496128L, 85926);
    super.onDetach();
    w.d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onDestroy");
    GMTrace.o(11532792496128L, 85926);
  }
  
  public final void onPause()
  {
    GMTrace.i(11532255625216L, 85922);
    super.onPause();
    w.d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onPause");
    GMTrace.o(11532255625216L, 85922);
  }
  
  public final void onResume()
  {
    GMTrace.i(11532121407488L, 85921);
    super.onResume();
    w.d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onResume");
    if (this.krT != null) {
      this.krT.ata();
    }
    GMTrace.o(11532121407488L, 85921);
  }
  
  public final void onStart()
  {
    GMTrace.i(11531987189760L, 85920);
    super.onStart();
    w.d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onStart");
    GMTrace.o(11531987189760L, 85920);
  }
  
  public final void onStop()
  {
    GMTrace.i(11532389842944L, 85923);
    super.onStop();
    w.d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onStop");
    GMTrace.o(11532389842944L, 85923);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\v2\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
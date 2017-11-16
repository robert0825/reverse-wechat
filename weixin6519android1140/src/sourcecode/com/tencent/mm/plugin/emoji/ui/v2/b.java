package com.tencent.mm.plugin.emoji.ui.v2;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.emoji.a.g;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.u;

public class b
  extends a
{
  public b()
  {
    GMTrace.i(11487158468608L, 85586);
    GMTrace.o(11487158468608L, 85586);
  }
  
  public final com.tencent.mm.plugin.emoji.a.a.a arQ()
  {
    GMTrace.i(11489037516800L, 85600);
    g localg = new g(this.vKB.vKW);
    GMTrace.o(11489037516800L, 85600);
    return localg;
  }
  
  public final int arX()
  {
    GMTrace.i(11488903299072L, 85599);
    GMTrace.o(11488903299072L, 85599);
    return 5;
  }
  
  public final boolean asX()
  {
    GMTrace.i(11489171734528L, 85601);
    GMTrace.o(11489171734528L, 85601);
    return true;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11487292686336L, 85587);
    int i = R.i.cuP;
    GMTrace.o(11487292686336L, 85587);
    return i;
  }
  
  public final void onActivityCreated(Bundle paramBundle)
  {
    GMTrace.i(11487829557248L, 85591);
    w.d("MicroMsg.emoji.EmojiStoreV2MainFragment", "onActivityCreated");
    super.onActivityCreated(paramBundle);
    GMTrace.o(11487829557248L, 85591);
  }
  
  public final void onAttach(Activity paramActivity)
  {
    GMTrace.i(11487426904064L, 85588);
    super.onAttach(paramActivity);
    w.d("MicroMsg.emoji.EmojiStoreV2MainFragment", "onAttach");
    GMTrace.o(11487426904064L, 85588);
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11487561121792L, 85589);
    super.onCreate(paramBundle);
    w.d("MicroMsg.emoji.EmojiStoreV2MainFragment", "onCreate");
    GMTrace.o(11487561121792L, 85589);
  }
  
  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    GMTrace.i(11487695339520L, 85590);
    w.d("MicroMsg.emoji.EmojiStoreV2MainFragment", "onCreateView");
    paramLayoutInflater = super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    GMTrace.o(11487695339520L, 85590);
    return paramLayoutInflater;
  }
  
  public final void onDestroy()
  {
    GMTrace.i(11488634863616L, 85597);
    super.onDestroy();
    w.d("MicroMsg.emoji.EmojiStoreV2MainFragment", "onDestroy");
    GMTrace.o(11488634863616L, 85597);
  }
  
  public final void onDestroyView()
  {
    GMTrace.i(11488500645888L, 85596);
    super.onDestroyView();
    w.d("MicroMsg.emoji.EmojiStoreV2MainFragment", "onResume");
    GMTrace.o(11488500645888L, 85596);
  }
  
  public final void onDetach()
  {
    GMTrace.i(11488769081344L, 85598);
    super.onDetach();
    w.d("MicroMsg.emoji.EmojiStoreV2MainFragment", "onDestroy");
    GMTrace.o(11488769081344L, 85598);
  }
  
  public final void onPause()
  {
    GMTrace.i(11488232210432L, 85594);
    super.onPause();
    w.d("MicroMsg.emoji.EmojiStoreV2MainFragment", "onPause");
    GMTrace.o(11488232210432L, 85594);
  }
  
  public final void onResume()
  {
    GMTrace.i(11488097992704L, 85593);
    super.onResume();
    w.d("MicroMsg.emoji.EmojiStoreV2MainFragment", "onResume");
    GMTrace.o(11488097992704L, 85593);
  }
  
  public final void onStart()
  {
    GMTrace.i(11487963774976L, 85592);
    super.onStart();
    w.d("MicroMsg.emoji.EmojiStoreV2MainFragment", "onStart");
    GMTrace.o(11487963774976L, 85592);
  }
  
  public final void onStop()
  {
    GMTrace.i(11488366428160L, 85595);
    super.onStop();
    w.d("MicroMsg.emoji.EmojiStoreV2MainFragment", "onStop");
    GMTrace.o(11488366428160L, 85595);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\v2\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */